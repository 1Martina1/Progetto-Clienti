package it.reply.test.customerapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.reply.test.customerapi.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>	{
	
	
	public List<Customer> findBySurname(String surname);
	public List<Customer> findByFiscalCode(String fiscalCode);

}
