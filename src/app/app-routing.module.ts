import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';

import { CreateParticipantComponent } from './create-participant/create-participant.component';
import { ParticipantListComponent } from './participant-list/participant-list.component';
import { PaysListComponent } from './pays-list/pays-list.component';
import { CreatePaysComponent } from './create-pays/create-pays.component';

const routes: Routes = [

  { path: 'home', component: HomeComponent},
 
  {path: 'listParticipant',component:ParticipantListComponent},
  {path: 'addParticipant',component:CreateParticipantComponent},
  {path: 'pays',component:PaysListComponent},
  {path: 'addPays',component:CreatePaysComponent}




];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [HomeComponent,ParticipantListComponent]