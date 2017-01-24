package net.gozillabiene.tippspiel.web;

import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.gozillabiene.tippspiel.Spiel;
import net.gozillabiene.tippspiel.SpielManager;
import net.gozillabiene.tippspiel.Spieltag;

@Path("/tippspiel")
public class SpielService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlain(){
		return "WUAST";
	}
	
	@GET
	@Path("spieltag/{x}")
	@Produces(MediaType.APPLICATION_JSON)
	public Set<Spiel> getSpieltage(@PathParam("x") String x){
		Set<Spiel> spiele = SpielManager.getSpielManager().getSpiele(Spieltag.valueOf("_"+x));
		return spiele;
	}
	
}


