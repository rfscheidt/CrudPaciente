package br.com.animati.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.animati.entity.Paciente;

public class PacienteDAOImpl implements PacienteDAO {
	
	private List<Paciente> listaDePacientes; // banco de dados
	
	public PacienteDAOImpl() {
		listaDePacientes = new ArrayList<Paciente>();
	}

	public void add(Paciente p) {
		listaDePacientes.add(p);
	}

	public void edit(Paciente p) {
		boolean encontrou = true;
		int indice = 0;
		do {
			if (listaDePacientes.get(indice).getIdPaciente() == p.getIdPaciente()) { //find by id
				listaDePacientes.set(indice, p);									 //update
				encontrou = false;
			}
			indice++;
			
		} while (encontrou);
	}

	public List<Paciente> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(long idPaciente) {
		// TODO Auto-generated method stub

	}

	public Paciente findById(long idPaciente) {
		// TODO Auto-generated method stub
		return null;
	}

	public void limparLista() {
		// TODO Auto-generated method stub

	}

}
