package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//essa anotação está atendendo toda a classe , se estivesse 

@RestController //anotação indicando para a Spring que essa classe é uma controller 

@RequestMapping("/ola-mundo") // endereço do arquivo que eu coloco o nome

public class HelloworldController {
	@GetMapping //qual verbo HHTP vai ser usado  , retorna visualização
	//primeiro o verbo , depois o Mapping
	
	public String ola() { //metodo sem o void , então precisa de um return , nesse caso o metodo tem que retornar uma String
		
		
		
		return "Ola mundo bom dia "; // texto que irpa retornr 
	}
	
	//esse aqui está diferente do de cima , porque tem 2 get , e dá erro 
	//então eu coloco um complemento , para ficar diferente ai ficaria /ola-mundo/comidas
	@GetMapping("comidas") 
	
	public String comidasFavoritas() {
		
		return "sushi \n Hamburguer";
	}
	
@GetMapping("Livros") 
	
	public String livrosFavoritos() {
		
		return "Eragon \n Senhor dos aneis";
	}

@GetMapping("ListaBSMs") 
public String listaBsm() {
	
	return " A lista de BSMs  da Generation são :\n\nCompetencias Comportamentais: "
			+ "\n\nComunicação\n"
			+ "Proatividade\n"
			+ "Orientação ao Futuro\n"
			+ "Trabalho em Equipe"
			+ "\n\n"
			+ "Mentalidades: \n\n"
			+ "Responsabilidade Pessoal\n"
			+ "Mentalidade de Crescimento\n"
			+ "Orientação ao Futuro\n"
			+ "Persistência\n";			
}

@GetMapping("ListaMelhorias") 
public String listaMelhorias() {
	
	return"Lista de Competências e Mentalidades que eu preciso melhorar\n\n"
			+ "Competências:\n\n"
			+ "Comunicação:\n\n"
			+ "Quero que a minha comunicação seja mais acertiva , quero melhorar meu  tom de voz e a forma que expresso minhas ideias.\n\n"
			+ "Trabalho em equipe:\n\n"
			+ "Percebi que preciso ceder mais e tentar encaixar minhas ideias nas dos outros , dessa forma o trabalho em equipe fica mais leve. \n\n"
			+ "Mentalidades:\n\n"
			+ "Referente as mentalidades , todas elas se encontram em mim de forma clara , eu as pratico todos os dias com muito foco.";
}
}
