package me.patricio.tap_hibernate.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {
	@Id
	@Column(name = "matricula", nullable = false, length = 9)
	private String matricula;
	@Column(name = "nome", nullable = false, length = 50)
	private String nome;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Column(name = "cidade", nullable = false, length = 30)
	private String cidade;
	@Column(name = "estado", nullable = true, length = 2)
	private String estado;
	@Column(name = "pais", nullable = false, length = 30)
	private String pais;

}
