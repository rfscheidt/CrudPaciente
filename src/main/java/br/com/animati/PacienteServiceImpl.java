package br.com.animati;

import java.util.ArrayList;
import java.util.List;

public class PacienteServiceImpl implements PacienteService {
	
	private List<Paciente> listaDePacientes;
	
	public PacienteServiceImpl() {
		listaDePacientes = new ArrayList<Paciente>();
	}

	public void add(Paciente p) {
		listaDePacientes.add(p);
	}

	public void edit(Paciente p) {
		boolean encontrou = true;
		int indice = 0;
		do {
			if (listaDePacientes.get(indice).getIdPaciente() == p.getIdPaciente()) {
				listaDePacientes.set(indice, p);
				encontrou = false;
			}
			indice++;
			
		} while (encontrou);
		
	}

	public List<Paciente> list() {
		return listaDePacientes;
	}

	public void delete(long idPaciente) {
		boolean encontrou = true;
		int indice = 0;
		do {
			if (listaDePacientes.get(indice).getIdPaciente() == idPaciente) {
				listaDePacientes.remove(indice);
				encontrou = false;
			}
			indice++;
			
		} while (encontrou);
	}

	public Paciente findById(long idPaciente) {
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
	}

	public void limparLista() {
		listaDePacientes.clear();
	}
	
}
