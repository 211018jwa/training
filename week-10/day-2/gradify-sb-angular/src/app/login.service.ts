import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { }

  login(un: string, pw: string) {
    return this.http.post('http://localhost:8080/login', {
      "username": un,
      "password": pw
    }, {
      withCredentials: true,
      observe: 'response' // gives us an HttpResponse object inside of the observable instead of the response body directly
    })
  }

  checkLoginStatus() {
    return this.http.get('http://localhost:8080/loginstatus', {
      observe: 'response',
      withCredentials: true
    })
  }

  logout() {
    return this.http.post('http://localhost:8080/logout', {}, {
      observe: 'response',
      withCredentials: true,
      responseType: 'text'
    })
  }

}
