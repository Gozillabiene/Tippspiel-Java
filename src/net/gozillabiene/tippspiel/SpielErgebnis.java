package net.gozillabiene.tippspiel;

public class SpielErgebnis {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((spiel == null) ? 0 : spiel.hashCode());
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
		SpielErgebnis other = (SpielErgebnis) obj;
		if (spiel == null) {
			if (other.spiel != null)
				return false;
		} else if (!spiel.equals(other.spiel))
			return false;
		return true;
	}

	public Spiel getSpiel() {
		return spiel;
	}

	public void setSpiel(Spiel spiel) {
		this.spiel = spiel;
	}

	private int heimErgebnis;
	private int gastErgebnis;
	private Spiel spiel;

	public SpielErgebnis(int heimErgebnis, int gastErgebnis, Spiel spiel) {
		super();
		this.heimErgebnis = heimErgebnis;
		this.gastErgebnis = gastErgebnis;
		this.spiel = spiel;
	}

	public int getHeimErgebnis() {
		return heimErgebnis;
	}

	public void setHeimErgebnis(int heimErgebnis) {
		this.heimErgebnis = heimErgebnis;
	}

	public int getGastErgebnis() {
		return gastErgebnis;
	}

	public void setGastErgebnis(int gastErgebnis) {
		this.gastErgebnis = gastErgebnis;
	}

}
