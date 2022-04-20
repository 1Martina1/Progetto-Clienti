package it.reply.test.customerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.reply.test.customerapi.entity.DetailedContact;

public interface ContactRepository extends JpaRepository<DetailedContact, Integer>{

}
