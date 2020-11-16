package br.com.animati;

import java.util.List;

public interface PacienteService {
	
	public void add(Paciente p);
	
	public void edit(Paciente p);
	
	public List<Paciente> list();
	
	public void delete(long idPaciente);
	
	public Paciente findById(long idPaciente);
	
	public void limparLista();
	
}
