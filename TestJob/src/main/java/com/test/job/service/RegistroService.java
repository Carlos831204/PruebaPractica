package com.test.job.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.job.entity.Registro;
import com.test.job.repository.RegistroRepository;

@Service
@Transactional
public class RegistroService {

	@Autowired
	RegistroRepository registroRepository;
	
	public List<Registro> list(){
		
		return registroRepository.findAll();
	}
	
	public Optional<Registro> getOne(int id){
		
		return registroRepository.findById(id);
	}
	
	public void save(Registro registro) {
		
		registroRepository.save(registro);
	}	
}
