import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { MenuComponent } from './menu/menu.component';

import { FormsModule} from '@angular/forms';

import { CreateParticipantComponent } from './create-participant/create-participant.component';
import { ParticipantListComponent } from './participant-list/participant-list.component';
import { PaysListComponent } from './pays-list/pays-list.component';
import { CreatePaysComponent } from './create-pays/create-pays.component';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    MenuComponent,
   
   
    CreateParticipantComponent,
    ParticipantListComponent,
    PaysListComponent,
    CreatePaysComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
