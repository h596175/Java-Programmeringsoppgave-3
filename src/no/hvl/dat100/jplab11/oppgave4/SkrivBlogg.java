package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {
	
	
	
	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		String innSam = "";
		boolean lagtInn = true;
		
		innSam = samling.toString();
		
		File fil = new File(mappe + filnavn);
		
		try {
			PrintWriter writer = new PrintWriter(fil);
			writer.write(innSam);
			writer.close();
			
		} catch (FileNotFoundException e) {
			lagtInn = false;
			e.printStackTrace();
			
		}
		return lagtInn;
	}
}
