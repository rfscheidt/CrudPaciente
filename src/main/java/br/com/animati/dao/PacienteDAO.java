package br.com.animati.dao;

import java.util.List;

import br.com.animati.entity.Paciente;

public interface PacienteDAO {
	
	public void add(Paciente p);
	
	public void edit(Paciente p);
	
	public List<Paciente> list();
	
	public void delete(long idPaciente);
	
	public Paciente findById(long idPaciente);
	
	public void limparLista();

}
