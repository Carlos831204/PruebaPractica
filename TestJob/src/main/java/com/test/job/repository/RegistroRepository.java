package com.test.job.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.job.entity.Registro;


@Repository
public interface RegistroRepository extends JpaRepository<Registro, Integer> {
	
}
