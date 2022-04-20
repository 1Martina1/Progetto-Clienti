import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Customer } from '../Customer';

@Component({
  selector: 'app-scheda-customer',
  templateUrl: './scheda-customer.component.html',
  styleUrls: ['./scheda-customer.component.css']
})
export class SchedaCustomerComponent implements OnInit {
 @Input() ListaCustomer?: any
 @Output() em: EventEmitter<any> = new EventEmitter()
  
 constructor() { }

  ngOnInit(): void {
  }

  stampaCustomer(c:any){
    this.em.emit(c)

  }
}
