package controller;

import java.util.ArrayList;

import model.Apoio;
import model.Utente;

public class GestorApoio {

	ArrayList<Apoio> arrApoio;
	
	public GestorApoio()
	{
		arrApoio = new ArrayList<>();
		
	}
	
	public void addApoio(String tipo, Utente u, int hora, String morada)
	{
		Apoio x = new Apoio(tipo,u,hora,morada);
		
		arrApoio.add(x);
	}
}
