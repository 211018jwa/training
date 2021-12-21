package com.revature.gradifysb.integrationtests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.gradifysb.dto.LoginDTO;
import com.revature.gradifysb.model.User;
import com.revature.gradifysb.model.UserRole;

@SpringBootTest // loads up the application context
@AutoConfigureMockMvc
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
public class AuthenticationControllerTest {

	@Autowired
	private MockMvc mvc; // MockMvc allows for you to send "fake" http requests to the server
	
	@Autowired
	private EntityManagerFactory emf;
	
	@Autowired
	private ObjectMapper mapper; // Behind the scenes, our application already makes use of the ObjectMapper Spring Bean
	// in order to translate JSON objects and vice versa
	
	@BeforeEach
	public void setUp() {
		
		EntityManager em = emf.createEntityManager();
		Session session = em.unwrap(Session.class);
		Transaction tx = session.beginTransaction();
		
		UserRole trainer = new UserRole("trainer"); // userRole id 1
		session.persist(trainer);
		
		UserRole associate = new UserRole("associate"); // userRole id 2
		session.persist(associate);
		
		User bach = new User("Bach", "Tran", "bach_tran", "password123", trainer); // User id 1
		session.persist(bach);
		
		User jane = new User("Jane", "Doe", "jane_doe", "pass", associate); // User id 2
		session.persist(jane);
		
		tx.commit();
		
		session.close();
	}
	
	@Test
	public void testLogin_trainer() throws Exception {
		/*
		 * Arrange
		 */
		LoginDTO dto = new LoginDTO("bach_tran", "password123");
		String jsonToSend = mapper.writeValueAsString(dto);
		
		/*
		 * Act and Assert
		 */
		// We want to send a fake http request to /login
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.post("/login").content(jsonToSend)
			.contentType(MediaType.APPLICATION_JSON);
		
		UserRole expectedUserRole = new UserRole("trainer");
		expectedUserRole.setId(1);
		User expectedObject = new User("Bach", "Tran", "bach_tran", "password123", expectedUserRole);
		expectedObject.setId(1);
		
		String expectedJson = mapper.writeValueAsString(expectedObject);
		
		this.mvc.perform(builder)
			.andExpect(MockMvcResultMatchers.status().is(200))
			.andExpect(MockMvcResultMatchers.content().json(expectedJson));
	}
	
	@Test
	public void testLogin_associate() throws Exception {
		/*
		 * Arrange
		 */
		LoginDTO dto = new LoginDTO("jane_doe", "pass");
		String jsonToSend = mapper.writeValueAsString(dto);
		
		/*
		 * Act and Assert
		 */
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.post("/login").content(jsonToSend)
				.contentType(MediaType.APPLICATION_JSON);
		
		UserRole expectedUserRole = new UserRole("associate");
		expectedUserRole.setId(2);
		
		User expectedUser = new User("Jane", "Doe", "jane_doe", "pass", expectedUserRole);
		expectedUser.setId(2);
		
		String expectedJsonUser = mapper.writeValueAsString(expectedUser);
		
		this.mvc.perform(builder)
			.andExpect(MockMvcResultMatchers.status().is(200))
			.andExpect(MockMvcResultMatchers.content().json(expectedJsonUser));
	}
	
	@Test
	public void testLogin_correctUsername_invalidPassword() throws Exception {
		/*
		 * Arrange
		 */
		LoginDTO dto = new LoginDTO("jane_doe", "obviouslyincorrectpassword");
		String jsonToSend = mapper.writeValueAsString(dto);
		
		/*
		 * Act and Assert
		 */
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.post("/login").content(jsonToSend)
				.contentType(MediaType.APPLICATION_JSON);
		
		
		this.mvc.perform(builder)
			.andExpect(MockMvcResultMatchers.status().is(400))
			.andExpect(MockMvcResultMatchers.content().string("Username and/or password is incorrect"));
	}
	
	@Test
	public void testLoginStatus_loggedIn() throws Exception {
		/*
		 * Arrange
		 */
		UserRole fakeUserRole = new UserRole("trainer");
		fakeUserRole.setId(1);
		
		User fakeUser = new User("Bach", "Tran", "bach_tran", "password", fakeUserRole);
		fakeUser.setId(1);
		
		MockHttpSession session = new MockHttpSession();
		session.setAttribute("currentuser", fakeUser);
		
		/*
		 * ACT
		 */
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/loginstatus").session(session);
		
		String expectedJsonUser = mapper.writeValueAsString(fakeUser);
		
		this.mvc.perform(builder)
			.andExpect(MockMvcResultMatchers.status().is(200))
			.andExpect(MockMvcResultMatchers.content().json(expectedJsonUser));
		
	}
	
}
