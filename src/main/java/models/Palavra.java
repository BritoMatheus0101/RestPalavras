package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Palavra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPalavra;
	
	private String string;
	private String vogal;
	private String tempoTotal;
	
	public int getIdPalavra() {
		return idPalavra;
	}
	public void setIdPalavra(int idPalavra) {
		this.idPalavra = idPalavra;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public String getVogal() {
		return vogal;
	}
	public void setVogal(String vogal) {
		this.vogal = vogal;
	}
	public String getTempoTotal() {
		return tempoTotal;
	}
	public void setTempoTotal(String tempoTotal) {
		this.tempoTotal = tempoTotal;
	}
}
