package controller;

import java.util.ArrayList;
import model.Utente;

public class GestorUtente 
{
	
	public ArrayList<Utente> arrUtente;
	
	public GestorUtente()
	{
		arrUtente = new ArrayList<Utente>();

	}
	
	public void addUtente(int id, String nome, String dataNascimento, String morada, String contacto)
	{
		Utente x = new Utente(id, nome, dataNascimento, morada,contacto); 

		arrUtente.add(x);
	}
}
