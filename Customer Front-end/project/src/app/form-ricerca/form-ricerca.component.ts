import { HttpClient } from '@angular/common/http';
import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-form-ricerca',
  templateUrl: './form-ricerca.component.html',
  styleUrls: ['./form-ricerca.component.css']
})
export class FormRicercaComponent implements OnInit {

  @Output() em: EventEmitter<any> = new EventEmitter()

  frm = new FormGroup({
    cognome: new FormControl(""),
    codFiscale: new FormControl("")
  })
  constructor(
    private http: HttpClient,
  ) { }

  ngOnInit(): void { }
  eseguiRicerca() {
    if (this.frm.get("cognome")?.value != "" && this.frm.get("codFiscale")?.value == "") {
      if(this.frm.get("cognome")?.value.match("^[a-zA-Z]+$")){
        this.http.get("http://localhost:8081/leggiPerCognome?surname=" + this.frm.get("cognome")?.value)
        .subscribe(
          (r: any) => {
            this.em.emit(r)
          })
      }
      else{
        alert("Il cognome può contenere solo lettere");
      }
      
    }
    else if(this.frm.get("codFiscale")?.value != ""){
      if(this.frm.get("codFiscale")?.value.length==16){
      this.http.get("http://localhost:8081/leggiPerCodFiscale?fiscalCode=" + this.frm.get("codFiscale")?.value)
      .subscribe(
        (r: any) => {
          this.em.emit(r)
        })
      }
      else{
        alert("Il codice fiscale deve essere lungo 16 caratteri");
      }
    }
    else{
      alert("Errore! Devi inserire almeno un valore di ricerca");
    }
  }
}