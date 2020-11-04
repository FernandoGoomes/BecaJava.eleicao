package br.eleicao.app;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.eleicao.app.model.Candidato;
import br.eleicao.app.model.Eleitor;
import br.eleicao.app.model.Municipio;
import br.eleicao.app.model.ZonaEleitoral;
import br.eleicao.app.repository.CandidatoRepository;
import br.eleicao.app.repository.EleitorRepository;
import br.eleicao.app.repository.MunicipioRepository;
import br.eleicao.app.repository.ZonaEleitoralRepository;


@SpringBootApplication
public class EleicaoApplication implements CommandLineRunner {
	
//	final MunicipioRepository _municipioRepository;	
//	final ZonaEleitoralRepository _zonaEleitoralRepository;
//	final CandidatoRepository _candidatoRepository;
	final EleitorRepository _eleitorRepository;
	
	
//	public EleicaoApplication(MunicipioRepository municipioRepository) {
//		_municipioRepository = municipioRepository;		
//	}
	
//	public EleicaoApplication(ZonaEleitoralRepository zonaEleitoral) {
//	_zonaEleitoralRepository = zonaEleitoral;
//	}
	
//	public EleicaoApplication(CandidatoRepository candidato) {
//	_candidatoRepository = candidato;
//	}
	
	public EleicaoApplication(EleitorRepository eleitor) {
	_eleitorRepository = eleitor;
	}

	
	
	public static void main(String[] args) {
		SpringApplication.run(EleicaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
							// ELEITOR
					// Salvar ELEITOR
		
		
//		Eleitor eleitor = new Eleitor();
//		eleitor.setNome("Clotilde");	
//		_eleitorRepository.save(eleitor);		
//		System.out.println("Eleitor salvo com sucesso!");	
//
//		eleitor = new Eleitor();
//		eleitor.setNome("Chiquinha");		
//		_eleitorRepository.save(eleitor);;		
//		System.out.println("Eleitor salvo com sucesso!");	
//
//		eleitor = new Eleitor();
//		eleitor.setNome("Godinez");		
//		_eleitorRepository.save(eleitor);;		
//		System.out.println("Eleitor salvo com sucesso!");	

					// DELETANDO UM ELEITOR

//		Eleitor eleitor = new Eleitor();	
//		eleitor.setId(new Long(3));
//		_eleitorRepository.delete(eleitor);
//		System.out.println("Eleitor deletado com sucesso!");	

					//   ATUALIZANDO UM ELEITOR

//		Eleitor eleitor = new Eleitor();	
//		eleitor.setId(new Long(4));
//		eleitor.setNome("Nhõnhõ");		
//		_eleitorRepository.save(eleitor);		
//		System.out.println("Eleitor atualizado com sucesso!");

					//   Selecionando apenas UM ELEITOR
			
//		Optional<Eleitor> eleitor = _eleitorRepository.findById(new Long(4));
//		System.out.println("Eleitor: " + eleitor.get().getNome());
//
//
//					//  Selecionando todos ELEITORES

//		Iterable<Eleitor> eleitores = _eleitorRepository.findAll();		
//		for(Eleitor e : eleitores) {
//			System.out.println("Zona: " + e.getNome());		
//		}
//				
		
		
		
							// CANDIDATO
		
						//	Salvar CANDIDATO
		
//			Candidato candidato = new Candidato();
//			Municipio municipio = new Municipio();
//			municipio.setId(1L);
//			candidato.setNome("Jaiminho");
//			candidato.setNumero("28RF3");
//			candidato.setTipo("Prefeito");
//			candidato.setMunicipio(municipio);		
//			_candidatoRepository.save(candidato);		
//			System.out.println("Candidato salvo com sucesso!");		
			
//			candidato = new Candidato();
//			municipio.setId(2L);
//			candidato.setNome("Chaves");
//			candidato.setNumero("CH4V35");
//			candidato.setTipo("Governador");	
//			candidato.setMunicipio(municipio);		
//			_candidatoRepository.save(candidato);
//			System.out.println("Candidato salvo com sucesso!");	
//			
//			candidato = new Candidato();
//			municipio.setId(4L);
//			candidato.setNome("Kiko");
//			candidato.setNumero("K1K0");
//			candidato.setTipo("Deputado");	
//			candidato.setMunicipio(municipio);		
//			_candidatoRepository.save(candidato);
//			System.out.println("Candidato salvo com sucesso!");	
		
		   			// DELETANDO UM CANDIDATO
		
//		Candidato candidato = new Candidato();	
//		candidato.setId(new Long(5));
//		_candidatoRepository.delete(candidato);
//		System.out.println("Candidato deletado com sucesso!");	
		
					//   ATUALIZANDO UM CANDIDATO
		
//		Candidato candidato = new Candidato();
//		Municipio municipio = new Municipio();
//		municipio.setId(4L);
//		candidato.setId(new Long(2));
//		candidato.setNome("Kiikoo");	
//		candidato.setNumero("K1K0");
//		candidato.setTipo("Vereador");	
//		candidato.setMunicipio(municipio);
//		_candidatoRepository.save(candidato);		
//		System.out.println("Candidato atualizado com sucesso!");
		
					//   Selecionando apenas UM CANDIDATO
		
//		Optional<Candidato> candidato = _candidatoRepository.findById(new Long(2));
//		System.out.println("Candidato: " + candidato.get().getNome());
//		
//		
//					//  Selecionando todos os CANDIDATOS
		
//		Iterable<Candidato> candidatos = _candidatoRepository.findAll();		
//		for(Candidato c : candidatos) {
//			System.out.println("Candidato: " + c.getNome());		
//		}
//		
		
		
					// ZONA ELEITORAL
		
					// Salvar ZONA ELEITORAL
		
//		ZonaEleitoral zonaEleitoral = new ZonaEleitoral();
//		zonaEleitoral.setNome("Capão Redondo");	
//		_zonaEleitoralRepository.save(zonaEleitoral);		
//		System.out.println("Zona Eleitoral salvo com sucesso!");	
//		
//		zonaEleitoral = new ZonaEleitoral();
//		zonaEleitoral.setNome("Parque Santo Antonio");	
//		_zonaEleitoralRepository.save(zonaEleitoral);		
//		System.out.println("Zona Eleitoral salvo com sucesso!");	
		
//		zonaEleitoral = new ZonaEleitoral();
//		zonaEleitoral.setNome("Vila Olimpia");	
//		_zonaEleitoralRepository.save(zonaEleitoral);		
//		System.out.println("Zona Eleitoral salvo com sucesso!");	
		
					// DELETANDO UMA ZONA
		
//		ZonaEleitoral zonaEleitoral = new ZonaEleitoral();	
//		zonaEleitoral.setId(new Long(3));
//		_zonaEleitoralRepository.delete(zonaEleitoral);
//		System.out.println("Zona Eleitoral deletado com sucesso!");	
		
					//   ATUALIZANDO UMA ZONA
		
//		ZonaEleitoral zonaEleitoral = new ZonaEleitoral();
//		zonaEleitoral.setId(new Long(4));
//		zonaEleitoral.setNome("Morumbi");		
//		_zonaEleitoralRepository.save(zonaEleitoral);		
//		System.out.println("Zona Eleitoral atualizado com sucesso!");
		
					//   Selecionando apenas UMA ZONA
		
//		Optional<ZonaEleitoral> zonaEleitoral = _zonaEleitoralRepository.findById(new Long(4));
//		System.out.println("Zona: " + zonaEleitoral.get().getNome());
//		
//		
//					//  Selecionando todas as ZONAS
		
//		Iterable<ZonaEleitoral> zonas = _zonaEleitoralRepository.findAll();		
//		for(ZonaEleitoral z : zonas) {
//			System.out.println("Zona: " + z.getNome());		
//		}
		
		
		
		
						//   MUNICIPIO
		
						//Salvar Município
		
//		Municipio municipio = new Municipio();
//		municipio.setNome("São Paulo");
//		municipio.setPopulacao(14000000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		
//		
//		municipio = new Municipio();
//		municipio.setNome("Sorocaba");
//		municipio.setPopulacao(150000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		
//		
//		municipio = new Municipio();
//		municipio.setNome("Guarulhos");
//		municipio.setPopulacao(1700000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		
		
		
		
					//Deletando um município
		
//		Municipio municipio = new Municipio();		
//		municipio.setId(new Long(3));
//		_municipioRepository.delete(municipio);
//		System.out.println("Município deletado com sucesso!");
		
		
					//Atualizando um município
		
//		Municipio municipio = new Municipio();
//		municipio.setId(new Long(2));
//		municipio.setNome("São Paulo");
//		municipio.setPopulacao(14000000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município atualizado com sucesso!");	
		
		
		
					//Selecionando apenas UM município
		
//		Optional<Municipio> municipio = _municipioRepository.findById(new Long(4));
//		System.out.println("Município: " + municipio.get().getNome());
		
		
					//Selecionando todos os municípios
		
//		Iterable<Municipio> municipios = _municipioRepository.findAll();		
//		for(Municipio m : municipios) {
//			System.out.println("Município: " + m.getNome());		
//		}
	
	}

}
