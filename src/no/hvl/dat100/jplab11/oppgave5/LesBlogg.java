package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		
			Blogg nyBlogg = null;
			int antInn;
			
			 
		try {
			FileReader fil = new FileReader(mappe+filnavn);
			BufferedReader reader = new BufferedReader(fil);
			
			antInn = Integer.parseInt(reader.readLine());
			nyBlogg = new Blogg(antInn);
			
			while((TEKST = reader.readLine()) != "BILDE") {
				TEKST += reader.readLine();
				
			}
			
			while((BILDE = reader.readLine()) != null) {
				BILDE += reader.readLine();
			
			}
		
			reader.close();
				
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
			
		} catch(IOException f) {
			
			f.printStackTrace();
		}
		return nyBlogg;
	}
}
