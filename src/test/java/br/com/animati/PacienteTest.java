package br.com.animati;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.animati.entity.Paciente;
import br.com.animati.service.PacienteService;
import br.com.animati.service.PacienteServiceImpl;

public class PacienteTest {
	
	private PacienteService pacienteService;
	
	@Before
	public void init() {
		pacienteService = new PacienteServiceImpl();
	}
	
	@Test
	public void addTest() {
		pacienteService.limparLista();
		
		Paciente paciente = new Paciente();
		paciente.setNome("Rafael Scheidt");
		paciente.setCpf("1234567890");
		
		pacienteService.add(paciente);
		
		assertEquals(1, pacienteService.list().size());
		
		pacienteService.limparLista();
	}
	
	@Test
	public void editTest() {
		pacienteService.limparLista();
		
		Paciente paciente = new Paciente();
		paciente.setIdPaciente(123);
		paciente.setNome("Andre Jobim");
		paciente.setCpf("0987654321");
		pacienteService.add(paciente);
		
		Paciente pacientePesquisado = pacienteService.findById(123);
		pacientePesquisado.setNome("Jobim Andre");
		pacienteService.edit(pacientePesquisado);
		
		Paciente pacienteEditado = pacienteService.findById(123);
		
		assertEquals("Jobim Andre", pacienteEditado.getNome());
		
		pacienteService.limparLista();
	}
	
	@Test
	public void listTest() {
		pacienteService.limparLista();
		
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Rafael Scheidt1");
		paciente1.setCpf("12345678901");
		pacienteService.add(paciente1);
		
		Paciente paciente2 = new Paciente();
		paciente2.setNome("Rafael Scheidt2");
		paciente2.setCpf("12345678902");
		pacienteService.add(paciente2);
		
		List<Paciente> list = pacienteService.list();
		
		assertEquals(2, list.size());
	}
	
	public void deleteTest() {
		
	}
	
	public void findByIdTest() {
		
	}

}
