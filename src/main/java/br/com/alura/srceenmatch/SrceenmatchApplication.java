package br.com.alura.srceenmatch;

import br.com.alura.srceenmatch.model.DadosSerie;
import br.com.alura.srceenmatch.service.ConsumoApi;
import br.com.alura.srceenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SrceenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SrceenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=Suits&apikey=5896010");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json,DadosSerie.class);

		System.out.println(dados);






	}
}
