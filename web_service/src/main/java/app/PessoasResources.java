package app;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

@Path("/pessoas")
public class PessoasResources {
	@GET
	public String exibirNomePessoa() {
		return "Diego Caldas Chaves 2";
	}
	
	@GET
	@Path("/outro")
	public String exibirOutroNomePessoa() {
		return "José de Alencar";
	}
	
	@GET
	@Path("/echo/{nome}")
	public String ecoarNomePessoa(@PathParam("nome") String nome) {
		
		return  nome;
	}
	
	@GET
	@Path("/maiuscula")
	public String transformarMaiscular(@QueryParam("nome") String nome) {
		
		return nome.toUpperCase();
	}
}
