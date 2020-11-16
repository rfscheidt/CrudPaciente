package br.com.animati.service;

import java.util.List;

import br.com.animati.dao.PacienteDAO;
import br.com.animati.dao.PacienteDAOImpl;
import br.com.animati.entity.Paciente;

public class PacienteServiceImpl implements PacienteService {
	
	//REFACTORY!!!!!!!
	
	private PacienteDAO dao;
	
	public PacienteServiceImpl() {
		dao = new PacienteDAOImpl();
	}

	public void add(Paciente p) {
		dao.add(p);
	}

	public void edit(Paciente p) {
		
		
	}

	public List<Paciente> list() {
		return null;
		//return listaDePacientes;
	}

	public void delete(long idPaciente) {
		/*
		boolean encontrou = true;
		int indice = 0;
		do {
			if (listaDePacientes.get(indice).getIdPaciente() == idPaciente) {
				listaDePacientes.remove(indice);
				encontrou = false;
			}
			indice++;
			
		} while (encontrou);
		*/
	}

	public Paciente findById(long idPaciente) {
		/*
		Paciente paciente = null;
		boolean encontrou = true;
		int indice = 0;
		do {
			if (listaDePacientes.get(indice).getIdPaciente() == idPaciente) {
				paciente = listaDePacientes.get(indice);
				encontrou = false;
			}
			indice++;
			
		} while (encontrou);
		
		return paciente;
		*/
		return null;
	}

	public void limparLista() {
		//listaDePacientes.clear();
	}
	
}
