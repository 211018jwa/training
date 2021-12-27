import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AssignmentService {

  constructor(private http: HttpClient) {}

  getAssignments() {
    return this.http.get(`${environment.url}/assignments`, {
      withCredentials: true,
      observe: 'response'
    });
  }
}
