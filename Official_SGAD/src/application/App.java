package application;

import java.util.Scanner;

import controller.*;
import model.Utente;


public class App 
{
	//Importar Controladores
	public static Scanner sc = new Scanner(System.in);
	public static GestorFuncionario gFuncionario = new GestorFuncionario();
	public static GestorUtente gUtente = new GestorUtente();
	public static GestorApoio 	  gApoio       = new GestorApoio();
	public static GestorFichaUtente gFicha       = new GestorFichaUtente();
	public static void main(String[] args) 
	{
		//Dados para a utilização da app
		int opc=0;
		
		do
		{
			System.out.printf("1. Adicionar novo Funcionario \n");
			System.out.printf("2. Adicionar novo Utente 	 \n");
			System.out.printf("3. Adicionar novo Apoio  	 \n");
			System.out.printf("4. Adicionar nova Ficha 	     \n");
			opc = sc.nextInt();
			
			switch(opc)
			{
				case 1:
					adicionarFuncionario();
					break;
				case 2:
					adicionarUtente();
					break;
				case 3:
					adicionarApoio();
					break;
				case 4:
					break;
				case 5:
					System.out.printf("Terminando Software... \n");
					break;
			}
		
		}while(opc!=5);
	}
	
	static public void adicionarFuncionario()
	{
		int id = gFuncionario.arrFuncionario.size();
		String nome,dataNascimento,morada,contacto;
		
		System.out.printf("\n Adicione o nome ao funcionario novo: ");
		nome = sc.next();
		System.out.printf("\n Adicione a data de nascimento: ");
		dataNascimento = sc.next();
		System.out.printf("\n Adicione a morada: ");
		morada = sc.next();
		System.out.printf("\n Adicione o contacto: ");
		contacto = sc.next();
		
		gFuncionario.addFuncionario(id, nome, dataNascimento, morada, contacto);
	}
	
	static public void adicionarUtente()
	{
		int id = gUtente.arrUtente.size();
		String nome,dataNascimento,morada,contacto;
		
		System.out.printf("\n Adicione o nome ao Utente novo: ");
		nome = sc.next();
		System.out.printf("\n Adicione a data de nascimento: ");
		dataNascimento = sc.next();
		System.out.printf("\n Adicione a morada: ");
		morada = sc.next();
		System.out.printf("\n Adicione o contacto: ");
		contacto = sc.next();
		
		gUtente.addUtente(id, nome, dataNascimento, morada, contacto);
	}
	
	static public void adicionarApoio(){
	//	int id, String tipo, Utente u, int hora, String morada;
		
		int id = gApoio.arrApoio.size();
		String tipo,morada;
		Utente u;
		int hora,IDutente;
		
		System.out.printf("\n Adicione o tipo de apoio: ");
		tipo = sc.next();
		System.out.printf("\n Adicione a morada para o apoio: ");
		morada = sc.next();
		System.out.printf("\n Adicione o id do utente para o apoio: ");
		IDutente = sc.nextInt();
		System.out.printf("\n Adicione a hora: ");
		hora = sc.nextInt();
		
		u = buscaUtente(IDutente);
		gApoio.addApoio(id, tipo, u, hora, morada);
	}
	public static Utente buscaUtente(int id) {
		Utente aux = null;
		for (Utente u : gUtente.arrUtente){
			if (u.getId() == id)
				aux = u;
		}
		return aux;
	}
	
	
}
