package controller;

import java.util.ArrayList;
import model.Utente;

public class GestorUtente 
{
	
	ArrayList<Utente> arrUtentes;
	
	public GestorUtente()
	{
		arrUtentes = new ArrayList<>();

	}
	
	public void addUtente(int id, String nome, String dataNascimento, String morada)
	{
		Utente x = new Utente(arrUtentes.size(), nome, dataNascimento, morada); 

		arrUtentes.add(x);
	}
}
