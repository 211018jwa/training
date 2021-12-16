let loginBtn = document.querySelector('#login-btn');

loginBtn.addEventListener('click', async () => {

    let usernameValue = document.querySelector('#username').value;
    let passwordValue = document.querySelector('#password').value;
    let obj = {
        username: usernameValue,
        password: passwordValue
    }

    console.log(JSON.stringify(obj));

    let res = await fetch('https://localhost:8080/login', {
        credentials: 'include',
        method: 'POST',
        body: JSON.stringify(obj),
        headers: {
            'Content-Type': 'application/json'
        }
    });

    if (res.status == 200) {
        window.location.href = '/associate-page.html';
    } else if (res.status == 400) {
        let pError = document.createElement('p');
        pError.innerHTML = 'Invalid login'
        pError.style.color = 'red';
        document.querySelector('#error-output').appendChild(pError);
    }

})