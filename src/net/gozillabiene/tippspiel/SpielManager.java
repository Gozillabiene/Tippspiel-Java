package net.gozillabiene.tippspiel;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SpielManager {

	private final static SpielManager INSTANCE = new SpielManager();
	static{
		INSTANCE.addSpiel(new Spiel(LocalDateTime.now(), new SpielPaarung("WUAST", "TITTEN", Spieltag._1)));
		INSTANCE.addSpiel(new Spiel(LocalDateTime.now(), new SpielPaarung("ARGH", "GRRR", Spieltag._1)));
		INSTANCE.addSpiel(new Spiel(LocalDateTime.now(), new SpielPaarung("WUAST", "TITTEN", Spieltag._2)));
		INSTANCE.addSpiel(new Spiel(LocalDateTime.now(), new SpielPaarung("ARGH", "GRRR", Spieltag._2)));
		
	}
	private Map<Spieltag,Set<Spiel>> spielMap;

	private SpielManager() {
		this.spielMap = new HashMap<>();

	}

	public static SpielManager getSpielManager(){
		return INSTANCE;
	}

	public Set<Spiel> getSpiele(Spieltag spielTag){
		return spielMap.get(spielTag);
	} 
	
	public Map<Spieltag, Set<Spiel>> getSpiele() {
		return spielMap;
	}

	private boolean addSpiel(Spiel spiel) {
		HashSet<Spiel> set = new HashSet<Spiel>();
		if(!spielMap.containsKey(spiel.getSpielPaarung().getSpielTag()))
			spielMap.put(spiel.getSpielPaarung().getSpielTag(), set);
		if(spielMap.get(spiel.getSpielPaarung().getSpielTag())==null)
			spielMap.put(spiel.getSpielPaarung().getSpielTag(), set);
			
		return spielMap.get(spiel.getSpielPaarung().getSpielTag()).add(spiel);
	}

	private boolean updateSpiel(Spiel spiel) {
		return addSpiel(spiel);
	}
}
