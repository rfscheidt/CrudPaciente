package br.com.animati.service;

import java.util.List;

import br.com.animati.entity.Paciente;

public interface PacienteService {
	
	public void add(Paciente p);
	
	public void edit(Paciente p);
	
	public List<Paciente> list();
	
	public void delete(long idPaciente);
	
	public Paciente findById(long idPaciente);
	
	public void limparLista();
	
}
