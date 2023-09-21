package com.example.sistemapetshop.repository;

import com.example.sistemapetshop.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
