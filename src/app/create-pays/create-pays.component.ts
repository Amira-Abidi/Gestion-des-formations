import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Pays } from '../model/pays';
import { PaysServiceService } from '../service/pays-service.service';

@Component({
  selector: 'app-create-pays',
  templateUrl: './create-pays.component.html',
  styleUrls: ['./create-pays.component.css']
})
export class CreatePaysComponent implements OnInit {

  pays: Pays = new Pays();

  constructor(private paysService: PaysServiceService,
    private router: Router) { }

  ngOnInit(): void {
  }

  savePays(){
    this.paysService.createPays(this.pays).subscribe( data =>{
      console.log(data);
      this.goToPaysList();
    },
    error => console.log(error));
  }

  goToPaysList(){
    this.router.navigate(['/pays']);
  }
  onSubmit(){
    console.log(this.pays);
   this.savePays();
  }
}
