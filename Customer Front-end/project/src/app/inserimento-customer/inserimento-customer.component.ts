import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Contact } from '../Contact';
import { Customer } from '../Customer';

@Component({
  selector: 'app-inserimento-customer',
  templateUrl: './inserimento-customer.component.html',
  styleUrls: ['./inserimento-customer.component.css']
})
export class InserimentoCustomerComponent implements OnInit {
  customerDaAggiungere: Customer[]
  
 
  constructor( 
    private http: HttpClient,
  ) {
    this.customerDaAggiungere = [new Customer()]
   }

  ngOnInit(): void {
  }

  nuovoCustomer(){
    this.customerDaAggiungere.push(new Customer())
  }

  nuovoContact(c:Customer){
    var contattoDaAggiungere: Contact
    contattoDaAggiungere = new Contact
    contattoDaAggiungere.customer_id = c.id
    c.contacts?.push(contattoDaAggiungere)
  }

  inviaLista(){
    console.log(this.customerDaAggiungere)
    this.http.post("http://localhost:8081/inserimentoMultiplo", this.customerDaAggiungere).subscribe((r) => console.log(r))
  }

}
