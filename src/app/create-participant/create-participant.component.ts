import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Participant } from '../model/participant';
import { ParticipantService } from '../service/participant.service';

@Component({
  selector: 'app-create-participant',
  templateUrl: './create-participant.component.html',
  styleUrls: ['./create-participant.component.css']
})
export class CreateParticipantComponent implements OnInit {

  participant: Participant = new Participant();

  constructor(private participantService: ParticipantService,
    private router: Router) { }

  ngOnInit(): void {
  }
  saveParticipant(){
    this.participantService.createParticipant(this.participant).subscribe( data =>{
      console.log(data);
      this.goToParticipantList();
    },
    error => console.log(error));
  }

  goToParticipantList(){
    this.router.navigate(['/participants']);
  }
  
  onSubmit(){
 console.log(this.participant);
   this.saveParticipant();
  }
}
