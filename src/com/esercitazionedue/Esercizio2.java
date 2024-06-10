package com.esercitazionedue;

import javax.swing.JOptionPane;

public class Esercizio2 {

	/*
	 * Esercizio 2
	 * 
	 * Scrivere un programma che inverta prima ed ultima lettera della stringa presa
	 * in esame come input da tastiera.
	 * 
	 * Suggerimento: Usare la classe JOptionPane
	 */

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Inserire il Nome");

		// Iniziale del nome
		String iniziale = input.substring(0, 1);

		// Ultima lettere del nome
		String ultima = input.substring(input.length() - 1, input.length());

		// Stampa delle lettere concatenate su un unica riga
		System.out.println(iniziale + ultima);
	}

}
