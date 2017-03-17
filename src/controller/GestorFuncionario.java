package controller;

import java.util.ArrayList;

import model.Funcionario;

public class GestorFuncionario {

	ArrayList<Funcionario> arrFuncionario;
	
	public GestorFuncionario()
	{
		arrFuncionario = new ArrayList<>();
		
	}
	
	public void addFuncionario(int id, String nome, String dataNascimento, String morada, String contacto)
	{
		Funcionario x = new Funcionario(arrFuncionario.size(),nome,dataNascimento,morada,contacto);
		
		arrFuncionario.add(x);
	}
	
}
