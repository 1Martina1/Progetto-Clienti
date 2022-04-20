import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  listaC : any
  customer : any
  listaContatti: any
  mostraInserimento: boolean
  mostraRicerca: boolean
  mostraRisultati: boolean
  mostraContatti: boolean


  constructor() { 
    this.mostraRicerca = true;
    this.mostraInserimento = false;
    this.mostraRisultati= false;
    this.mostraContatti = false
   }

  ngOnInit(): void {
  }

  gestisciRicerca(r:any){
    this.mostraRisultati = true
    this.listaC = r
    
    
  }

  gestisciDettagliContatti(c:any){
    this.mostraContatti = true
    this.customer = c
    this.listaContatti = c.contacts
  }

  attivaRicerca(){
    this.mostraRicerca= true
    this.mostraInserimento= false
    this.mostraRisultati = false
    this.mostraContatti = false
  }

  attivaInserimento(){
    this.mostraRicerca= false
    this.mostraInserimento= true
    this.mostraRisultati = false
    this.mostraContatti = false
  }
}