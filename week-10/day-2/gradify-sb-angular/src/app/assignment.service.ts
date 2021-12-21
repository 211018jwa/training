import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AssignmentService {

  constructor(private http: HttpClient) {}

  getAssignments() {
    return this.http.get('http://localhost:8080/assignments', {
      withCredentials: true,
      observe: 'response'
    });
  }
}
