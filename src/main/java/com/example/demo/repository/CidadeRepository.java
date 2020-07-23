package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Bean.Cidade;

public interface CidadeRepository  extends JpaRepository <Cidade,Long>{

	public Cidade findByNome (String nome);
	
	public Cidade findByLatitudeAndLongitude (String lati, String longe);
	
	//public  Cidade FindByNome (boolean nome);
	
}

