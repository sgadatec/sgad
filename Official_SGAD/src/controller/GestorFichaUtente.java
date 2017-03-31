package controller;

import java.util.ArrayList;
import model.Apoio;
import model.FichaUtente;
import model.Funcionario;
import model.Utente;

public class GestorFichaUtente {

	
	ArrayList<FichaUtente> arrFichaUtente;
	
	public GestorFichaUtente()
	{
		arrFichaUtente = new ArrayList<>();
		
	}
	
	public void addFichaUtente(int id, Utente u, Apoio a, Funcionario f)
	{
		FichaUtente x = new FichaUtente(arrFichaUtente.size(),u,a,f);
		
		arrFichaUtente.add(x);
	}
}
