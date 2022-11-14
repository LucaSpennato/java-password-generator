package org.generation.Italy.securityt;

import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci nome: ");
		String userName = sc.nextLine();
		
		System.out.print("Inserisci cognome: ");
		String userSurname = sc.nextLine();
		
		System.out.print("Inserisci il tuo colore preferito: ");
		String userColor = sc.nextLine();
		
		System.out.print("Giorno di nascita: ");
		int userDay = sc.nextInt();
		
		System.out.print("Mese di nascita: ");
		int userMonth = sc.nextInt();
		
		System.out.print("Anno di nascita: ");
		int userYear = sc.nextInt();
		
		
		String userPassword = userName + "-" + userColor + "-" + (userDay + userMonth + userYear) ;
		
		System.out.println("La tua password:" + "\r" + userPassword);
		
		
		
	}
	
}
