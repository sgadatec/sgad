package model;

public class FichaUtente {
 
	private int id;
	private Utente u;
	private Apoio a;
	private Funcionario f;
	
	public FichaUtente(int id, Utente u, Apoio a, Funcionario f) {
		super();
		this.id = id;
		this.u = u;
		this.a = a;
		this.f = f;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Utente getU() {
		return u;
	}

	public void setU(Utente u) {
		this.u = u;
	}

	public Apoio getA() {
		return a;
	}

	public void setA(Apoio a) {
		this.a = a;
	}

	public Funcionario getF() {
		return f;
	}

	public void setF(Funcionario f) {
		this.f = f;
	}
	
}
