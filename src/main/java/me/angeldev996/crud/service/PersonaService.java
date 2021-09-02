//Autor: Angel Valladares
//Date: 01-09-2021

package me.angeldev996.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.angeldev996.crud.interfaceService.InterfazPersonaService;
import me.angeldev996.crud.interfaces.IPersona;
import me.angeldev996.crud.model.Persona;


@Service
public class PersonaService implements InterfazPersonaService {

	
	@Autowired
	private IPersona data;
	
	
	
	@Override
	public List<Persona> listar() { //Metodo que lista los objetos
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> ListarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Persona p) { //Metodo que guarda el objeto

		int res=0;
		Persona persona = data.save(p);
		
		if(!persona.equals(null) ) {
			res=1;
		}
		
		return res;
	}

	@Override
	public void delete(int id) {//Metodo que elimina el objeto

		data.deleteById(id);
		
		
	}

}
