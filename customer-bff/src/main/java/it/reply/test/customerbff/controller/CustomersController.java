package it.reply.test.customerbff.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import it.reply.customerbff.entity.Contact;
import it.reply.customerbff.entity.Customer;
import it.reply.customerbff.entity.DetailedContact;
import it.reply.customerbff.entity.DetailedCustomer;

@RestController
public class CustomersController {
	private String utenzaTecnica = "admin:password"; 
	
	@GetMapping("/leggiPerCognome")
	@ResponseBody
	@CrossOrigin
	public List<Customer> getLeggiPerCognome(@RequestParam String surname){
		HttpHeaders headers = new HttpHeaders();
		headers.set("auth", utenzaTecnica);
		HttpEntity<Void> richiesta = new HttpEntity<>(headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List> response = restTemplate.exchange("http://localhost:8080/leggiPerCognome/?surname="+ surname,
				                                               HttpMethod.GET,
				                                               richiesta,
				                                               List.class);		
		List<Customer> lista =  response.getBody();
		return lista;
	}
	
	
	@ResponseBody
	@GetMapping("/leggiPerCodFiscale")
	@CrossOrigin
	public List<Customer> leggiPerCodFiscale(@RequestParam String fiscalCode)
	{
		HttpHeaders headers = new HttpHeaders();
		headers.set("auth", utenzaTecnica);
		HttpEntity<Void> richiesta = new HttpEntity<>(headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List> response = restTemplate.exchange("http://localhost:8080/leggiPerCodFiscale/?fiscalCode="+ fiscalCode,
				                      HttpMethod.GET,
				                      richiesta,
				                      List.class);
		return response.getBody();
	}

	
	@ResponseBody
	@PostMapping("/aggiornaContatto")
	@CrossOrigin
	@ResponseStatus(code = HttpStatus.OK)
	public String aggiornaContatto(@RequestBody DetailedContact contact)
	{
		HttpHeaders headers = new HttpHeaders();
		headers.set("auth", utenzaTecnica);
		HttpEntity<DetailedContact> richiesta = new HttpEntity<>(contact, headers);
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForObject("http://localhost:8080/aggiornaContatto", richiesta, Void.class);	
		return "OK";
	}
	
	
	@ResponseBody
	@PostMapping("/inserimentoMultiplo")
	@CrossOrigin
	@ResponseStatus(code = HttpStatus.OK)
	public String inserimentoMultiplo(@RequestBody List<DetailedCustomer> customer)
	{
		List<Customer> utenti = new ArrayList();
		
		for(DetailedCustomer dc : customer) {
			Customer c = new Customer();
			c.setName(dc.getName());
			c.setSurname(dc.getSurname());
			c.setAddress(dc.getAddress());
			c.setFiscalCode(dc.getFiscalCode());
			c.setBirth_date(dc.getBirth_date());
			
			List<Contact> contatti = new ArrayList();
			for(DetailedContact dcon : dc.getContacts()) {
				Contact con = new Contact();
				con.setType(dcon.getType());
				con.setVal(dcon.getVal());
				con.setCertified(dcon.isCertified());
				
				contatti.add(con);
				
		}
		c.setContacts(contatti);
		utenti.add(c);
		
		}
		HttpHeaders headers = new HttpHeaders();
		headers.set("auth", utenzaTecnica);
		HttpEntity<List> richiesta = new HttpEntity<>(utenti, headers);
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForObject("http://localhost:8080/inserimentoMultiplo/", richiesta, Void.class);		
		return "OK";
	}
}
