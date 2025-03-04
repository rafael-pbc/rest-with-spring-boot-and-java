package br.com.cunha.rafael.repository;

import br.com.cunha.rafael.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
