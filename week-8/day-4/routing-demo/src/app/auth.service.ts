import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './User';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  // Injecting the HttpClient service (Singleton) into the AuthService
  constructor(private httpClient: HttpClient) { }

  login(un: string, pass: string): Observable<User> {
    return this.httpClient.post<User>('http://localhost:8080/login', {
      username: un,
      password: pass
    }, {
      withCredentials: true
    });
  }

  async getLoggedInUser(): Promise<User | undefined> { // returns the user role if they are logged in, blank if not
    let userPromise = this.httpClient.get<User>('http://localhost:8080/checkloginstatus', {
      withCredentials: true
    }).toPromise();

    return userPromise;
    // let userRole = (await user)?.userRole
    // return userRole;
  }
}
