package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	// Variabler
	private Innlegg[] innleggstabell;
	private int nesteledig;

	public Blogg() {
		this.innleggstabell = new Innlegg[20];
		this.nesteledig = 0;
	}

	public Blogg(int lengde) {
		this.innleggstabell = new Innlegg[lengde];
		this.nesteledig = 0;
	}

	public int getAntall() {
		return this.nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return this.innleggstabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < this.innleggstabell.length; i++) {
			if (this.innleggstabell[i] == null) { continue; }
				if (this.innleggstabell[i].erLik(innlegg))
					return i;
		}

		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		for (int i = 0; i < this.innleggstabell.length; i++) {
			if (this.innleggstabell[i] == null)
				return true;
		}

		return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		// Skjekk om det allerede erher
		if (this.finnes(innlegg)) return false;

		// FInn ledig plass
		this.nesteledig++;
		int plass = this.nesteledig;
		this.innleggstabell[plass] = innlegg;
		return true;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(this.nesteledig + "\n");

		for (int i = 0; i < this.innleggstabell.length; i++) {
			if (this.innleggstabell[i] == null) { continue; }
			str.append(this.innleggstabell[i].toString());
		}

		return str.toString();
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}