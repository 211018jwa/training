import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class QuoteService {

  constructor(private http: HttpClient) { }

  getDailyQuote() {
    return this.http.get('http://ec2-18-219-69-82.us-east-2.compute.amazonaws.com:8081/http://api.forismatic.com/api/1.0/', {
      params: {
        'method': 'getQuote',
        'lang': 'en',
        'format': 'json'
      }
    })
  }

}
