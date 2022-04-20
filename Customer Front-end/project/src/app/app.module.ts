import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { FormRicercaComponent } from './form-ricerca/form-ricerca.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { SchedaCustomerComponent } from './scheda-customer/scheda-customer.component';
import { DettagliContattiComponent } from './dettagli-contatti/dettagli-contatti.component';
import { InserimentoCustomerComponent } from './inserimento-customer/inserimento-customer.component';


@NgModule({
  declarations: [
    AppComponent,
    FormRicercaComponent,
    HomeComponent,
    SchedaCustomerComponent,
    DettagliContattiComponent,
    InserimentoCustomerComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [HomeComponent]
})
export class AppModule { }
