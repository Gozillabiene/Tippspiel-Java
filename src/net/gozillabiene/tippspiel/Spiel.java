package net.gozillabiene.tippspiel;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Spiel {
	private LocalDateTime spielDatum;
	private final SpielPaarung spielPaarung;

	public SpielPaarung getSpielPaarung() {
		return spielPaarung;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((spielPaarung == null) ? 0 : spielPaarung.hashCode());
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
		Spiel other = (Spiel) obj;
		if (spielPaarung == null) {
			if (other.spielPaarung != null)
				return false;
		} else if (!spielPaarung.equals(other.spielPaarung))
			return false;
		return true;
	}

	public Spiel(LocalDateTime spielDatum, SpielPaarung spielPaarung) {
		super();
		this.setSpielDatum(spielDatum);
		this.spielPaarung = spielPaarung;
	}

	public LocalDateTime getSpielDatum() {
		return spielDatum;
	}

	public void setSpielDatum(LocalDateTime spielDatum) {
		this.spielDatum = spielDatum;
	}

}
