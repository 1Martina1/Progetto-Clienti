import { Contact } from "./Contact"

export class Customer {
    id?: number
    name?: string
    surname?: string
    address?: string
    fiscalCode?: string
    birth_date?: string
    contacts?: Contact[]
    
    constructor(){
       this.contacts = []
    }
}