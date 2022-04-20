package it.reply.test.customerapi.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import it.reply.test.customerapi.entity.Customer;
import it.reply.test.customerapi.entity.DetailedContact;
import it.reply.test.customerapi.repository.ContactRepository;
import it.reply.test.customerapi.repository.CustomerRepository;

@RestController
public class CustomersController {
	
	String utenza = "admin:password";
	
	@Autowired
	CustomerRepository repo;
	
	@Autowired
	ContactRepository contactRepo;
	
	private boolean isUtenteTecnico(String up) {
		if(utenza.equals(up))
			return true;
		return false;
	}
	
	
	@GetMapping("/leggiPerCognome")
	@CrossOrigin
	@ResponseBody 
	public List<Customer> leggiPerCognome(@RequestParam String surname,
			                              @RequestHeader("auth") String utenza,
			                              HttpServletResponse response)
	{
		if(isUtenteTecnico(utenza)) {
			response.setStatus( HttpServletResponse.SC_OK);
		    List<Customer> lista = repo.findBySurname(surname);
		    return lista;
		}
		else {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			return null;
		}
	}
	
	@GetMapping("/leggiPerCodFiscale")
	@CrossOrigin
	@ResponseBody
	public List<Customer> leggiPerCodFiscale(@RequestParam String fiscalCode,
			                                 @RequestHeader("auth") String utenza,
			                                 HttpServletResponse response)
	{
		if(isUtenteTecnico(utenza)) {
			response.setStatus( HttpServletResponse.SC_OK);
			return repo.findByFiscalCode(fiscalCode);
			}
			else {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				return null;
			}
	}
	
	
	@PostMapping("/aggiornaContatto")
	@CrossOrigin
	@ResponseBody
	public void aggiornaContatto(@RequestBody DetailedContact contact,
											@RequestHeader("auth") String utenza,
											HttpServletResponse response)
	{
		if(isUtenteTecnico(utenza)) {
			response.setStatus( HttpServletResponse.SC_OK);
			contactRepo.save(contact);
		}
		else {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		}
	}
	
	
	@PostMapping("/inserimentoMultiplo")
	@CrossOrigin
	@ResponseBody
	public void inserimentoMultiplo(@RequestBody List<Customer> utenti,
			                          @RequestHeader("auth") String utenza,
			                          HttpServletResponse response)
	{
		if(isUtenteTecnico(utenza)) {
			response.setStatus( HttpServletResponse.SC_OK);
			repo.saveAll(utenti);
		}
		else {
			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		}
	}
	
	
}
