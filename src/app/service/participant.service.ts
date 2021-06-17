import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Participant } from '../model/participant';

@Injectable({
  providedIn: 'root'
})
export class ParticipantService {

  private baseURL = "http://localhost:8090/api/v1/participants";

  constructor(private httpClient: HttpClient) { }

  getParticipantList(): Observable<Participant[]>{
    return this.httpClient.get<Participant[]>(`${this.baseURL}`);
  }

  createParticipant(participant: Participant): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, participant);
  }

 
}
