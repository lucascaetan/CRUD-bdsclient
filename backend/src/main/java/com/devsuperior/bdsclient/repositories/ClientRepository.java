package com.devsuperior.bdsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.bdsclient.entities.Client;

public interface  ClientRepository extends JpaRepository<Client, Long> {

}
