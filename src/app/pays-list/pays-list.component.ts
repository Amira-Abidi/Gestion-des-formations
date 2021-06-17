import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Pays } from '../model/pays';
import { PaysServiceService } from '../service/pays-service.service';

@Component({
  selector: 'app-pays-list',
  templateUrl: './pays-list.component.html',
  styleUrls: ['./pays-list.component.css']
})
export class PaysListComponent implements OnInit {


  payss !: Pays[];
  constructor(private paysService: PaysServiceService,
    private router: Router) { }

  ngOnInit(): void {
    this.getPayss();

  }
  private getPayss(){
    this.paysService.getPaysList().subscribe(data => {
   this.payss = data;

    });
    

  }
 /* deletePays(id: number){
    this.paysService.deletePays(id).subscribe( data => {
      console.log(data);
      this.getPayss();

    });
  }*/
 
  deletePays(id: number) {
    this.paysService.deletePays(id)
      .subscribe(
        data => {
          console.log(data);
          this.getPayss();
        },
        error => console.log(error));
  }
}
