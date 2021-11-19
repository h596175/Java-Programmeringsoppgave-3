package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	Innlegg [] innleggtabell;
	int nesteLedig;
	String bloggStr = "";
	
	public Blogg() {
		this.innleggtabell = new Innlegg [20];
		nesteLedig = 0;
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg [lengde];
		nesteLedig = 0;
	}

	public int getAntall() {
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int innPos = 0;
		
		for(int pos = 0; pos < nesteLedig; pos++) {
			
			if(innleggtabell[pos].erLik(innlegg)){
				innPos = pos;
				break;
				
			}
			
			else{
				innPos = -1;
			}
			
		}
		return innPos;
	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean tabFinnes = false;
			
		
			for(int i = 0; i <nesteLedig; i++) {
				if(innleggtabell[i].getId() == innlegg.getId())
				tabFinnes = true;
			}
		return tabFinnes;
	}

	public boolean ledigPlass() {
		
		boolean tabLedig = false;
				
			if(nesteLedig < innleggtabell.length) {
				tabLedig = true;
			}
		return tabLedig;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		boolean tabLagtTil = false;
				
		if(!finnes(innlegg) && ledigPlass()) {
			
			innleggtabell[nesteLedig] = innlegg;
			nesteLedig++;
			tabLagtTil = true;
		}
			return tabLagtTil;
		
	}
	
	public String toString() {
		bloggStr += nesteLedig + "\n";
		
		for(int i = 0; i < nesteLedig; i++) {
		bloggStr +=innleggtabell[i].toString();
		}
		return bloggStr;
		
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