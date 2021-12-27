import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { environment } from '../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { }

  login(un: string, pw: string) {
    return this.http.post(`${environment.url}/login`, {
      "username": un,
      "password": pw
    }, {
      withCredentials: true,
      observe: 'response' // gives us an HttpResponse object inside of the observable instead of the response body directly
    })
  }

  checkLoginStatus() {
    return this.http.get(`${environment.url}/loginstatus`, {
      observe: 'response',
      withCredentials: true
    })
  }

  logout() {
    return this.http.post(`${environment.url}/logout`, {}, {
      observe: 'response',
      withCredentials: true,
      responseType: 'text'
    })
  }

}
