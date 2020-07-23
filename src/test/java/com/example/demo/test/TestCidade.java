package com.example.demo.test;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.Bean.Cidade;
import com.example.demo.repository.CidadeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCidade {
	@Autowired
	private CidadeRepository repo;

	@Test
	public void insereCidade() {
		Cidade a = new Cidade();
		a.setLatitude("20565621");
		a.setLongitude("6545185");
		a.setNome("MINAS");
		a = repo.save(a);
		System.out.println(a.getId());

	}

	@Test
	public void BuscaCidade() {
		Cidade a = repo.findByNome("minas".toUpperCase());
		System.out.println(a);
	}
}