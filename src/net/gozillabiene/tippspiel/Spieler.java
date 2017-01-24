package net.gozillabiene.tippspiel;

public class Spieler {

	private final String spielerName;

	public Spieler(String spielerName) {
		super();
		this.spielerName = spielerName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((spielerName == null) ? 0 : spielerName.hashCode());
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
		Spieler other = (Spieler) obj;
		if (spielerName == null) {
			if (other.spielerName != null)
				return false;
		} else if (!spielerName.equals(other.spielerName))
			return false;
		return true;
	}

	public String getSpielerName() {
		return spielerName;
	}
	
	
}
