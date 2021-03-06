package model;

public class Apoio {

		int id;
		String tipo;
		Utente u;
		int hora;
		String morada;

		public Apoio(int id, String tipo, Utente u, int hora, String morada) {
			super();
			this.id = id;
			this.tipo = tipo;
			this.u = u;
			this.hora = hora;
			this.morada = morada;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public Utente getU() {
			return u;
		}
		public void setU(Utente u) {
			this.u = u;
		}
		public int getHora() {
			return hora;
		}
		public void setHora(int hora) {
			this.hora = hora;
		}
		public String getMorada() {
			return morada;
		}
		public void setMorada(String morada) {
			this.morada = morada;
		}
}
