package controller;

import java.util.ArrayList;
import model.Apoio;
import model.Utente;

public class GestorApoio {

	public ArrayList<Apoio> arrApoio;
	
	public GestorApoio()
	{
		arrApoio = new ArrayList<Apoio>();
		
	}
	
	public void addApoio(int id, String tipo, Utente u, int hora, String morada)
	{
		Apoio x = new Apoio(id,tipo,u,hora,morada);
		
		arrApoio.add(x);
	}
}
