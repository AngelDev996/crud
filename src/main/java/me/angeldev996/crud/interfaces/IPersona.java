package me.angeldev996.crud.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.angeldev996.crud.model.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {

}
