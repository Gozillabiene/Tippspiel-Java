package net.gozillabiene.tippspiel;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SpielPaarung {
	private String heimVerein;

	public void setHeimVerein(String heimVerein) {
		this.heimVerein = heimVerein;
	}

	public void setGastVerein(String gastVerein) {
		this.gastVerein = gastVerein;
	}

	public void setSpielTag(Spieltag spielTag) {
		this.spielTag = spielTag;
	}

	private String gastVerein;
	private Spieltag spielTag;

	public SpielPaarung(String heimVerein, String gastVerein, Spieltag spielTag) {
		this.heimVerein = heimVerein;
		this.gastVerein = gastVerein;
		this.spielTag = spielTag;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gastVerein == null) ? 0 : gastVerein.hashCode());
		result = prime * result + ((heimVerein == null) ? 0 : heimVerein.hashCode());
		result = prime * result + ((spielTag == null) ? 0 : spielTag.hashCode());
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
		SpielPaarung other = (SpielPaarung) obj;
		if (gastVerein == null) {
			if (other.gastVerein != null)
				return false;
		} else if (!gastVerein.equals(other.gastVerein))
			return false;
		if (heimVerein == null) {
			if (other.heimVerein != null)
				return false;
		} else if (!heimVerein.equals(other.heimVerein))
			return false;
		if (spielTag != other.spielTag)
			return false;
		return true;
	}

	public String getHeimVerein() {
		return heimVerein;
	}

	public String getGastVerein() {
		return gastVerein;
	}

	public Spieltag getSpielTag() {
		return spielTag;
	}
}