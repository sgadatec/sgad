package controller;

import java.util.ArrayList;
import model.Funcionario;

public class GestorFuncionario {

	public ArrayList<Funcionario> arrFuncionario;
	
	public GestorFuncionario()
	{
		arrFuncionario = new ArrayList<Funcionario>();
		
	}
	
	public void addFuncionario(int id, String nome, String dataNascimento, String morada, String contacto)
	{
		Funcionario x = new Funcionario(arrFuncionario.size(),nome,dataNascimento,morada,contacto);
		
		arrFuncionario.add(x);
	}
	
}
