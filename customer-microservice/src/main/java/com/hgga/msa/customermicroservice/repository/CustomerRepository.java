package com.hgga.msa.customermicroservice.repository;

import com.hgga.msa.customermicroservice.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
