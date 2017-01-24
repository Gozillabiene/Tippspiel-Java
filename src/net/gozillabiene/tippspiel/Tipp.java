package net.gozillabiene.tippspiel;

public class Tipp {

	private int tippHeim;
	private int tippGast;
	private final Spiel spiel;
	private final Spieler spieler;
	
	public Tipp(int tippHeim, int tippGast, Spiel spiel, Spieler spieler) {
		super();
		this.tippHeim = tippHeim;
		this.tippGast = tippGast;
		this.spiel = spiel;
		this.spieler = spieler;
	}
	public int getTippHeim() {
		return tippHeim;
	}

	public void setTippHeim(int tippHeim) {
		this.tippHeim = tippHeim;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((spiel == null) ? 0 : spiel.hashCode());
		result = prime * result + ((spieler == null) ? 0 : spieler.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tipp other = (Tipp) obj;
		if (spiel == null) {
			if (other.spiel != null)
				return false;
		} else if (!spiel.equals(other.spiel))
			return false;
		if (spieler == null) {
			if (other.spieler != null)
				return false;
		} else if (!spieler.equals(other.spieler))
			return false;
		return true;
	}
	public int getTippGast() {
		return tippGast;
	}

	public void setTippGast(int tippGast) {
		this.tippGast = tippGast;
	}

	public Spiel getSpiel() {
		return spiel;
	}
	public Spieler getSpieler() {
		return spieler;
	}


}
