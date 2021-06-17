import { Component, OnInit } from '@angular/core';
import { RouterEvent } from '@angular/router';
import { Participant } from '../model/participant';
import { ParticipantService } from '../service/participant.service'

@Component({
  selector: 'app-participant-list',
  templateUrl: './participant-list.component.html',
  styleUrls: ['./participant-list.component.css']
})
export class ParticipantListComponent implements OnInit {

  participants !: Participant[];
  constructor(private participantService: ParticipantService,
    private router: RouterEvent) { }

  ngOnInit(): void {
    this.getParticipants();
  }
  private getParticipants(){
    this.participantService.getParticipantList().subscribe(data => {
      this.participants = data;
    });
  }

}
