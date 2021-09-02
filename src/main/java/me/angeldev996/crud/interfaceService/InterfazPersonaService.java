package me.angeldev996.crud.interfaceService;


import java.util.List;
import java.util.Optional;

import me.angeldev996.crud.model.Persona;
public interface InterfazPersonaService {

	
	public List<Persona> listar(); 
	public Optional <Persona>ListarId(int id);
	public int save(Persona p);
	public void delete(int id);
}
