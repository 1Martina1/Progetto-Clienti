import { HttpClient } from '@angular/common/http';
import { Component, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-dettagli-contatti',
  templateUrl: './dettagli-contatti.component.html',
  styleUrls: ['./dettagli-contatti.component.css']
})
export class DettagliContattiComponent implements OnInit {
  @Input() customer: any
  @Input() listaContact?: any
  @Input() mostraContatti?: boolean

  constructor(
    private http: HttpClient,
  ) { this.mostraContatti= false }

  ngOnInit(): void {
  }

  aggiornaContatto(c:any){
    
    this.http.post("http://localhost:8081/aggiornaContatto",c)
    .subscribe((r:any)=>{console.log(r)})
  }

 
}
