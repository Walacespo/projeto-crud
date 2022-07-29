package com.walace.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.walace.crud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
}
