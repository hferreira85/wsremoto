package br.com.universidadexyz.beans;

public class Aluno {


	private int rm;
	private String nome = new String();
	private String cpf;
	
	public Aluno() {
		//nome = new String();
		cpf = new String();
	}
	
	public Aluno(int rm, String nome, String cpf) {
		this.rm=rm;
		this.nome =nome;
		this.cpf=cpf;
	}
	
	
	public String getAll() {
		return 
				"RM..: " + rm + "\n" +
				"Nome: " + nome + "\n" + 
				"CPF.: " + cpf; 
	}
	
	public void setAll(int rm, String nome, String cpf) {
		this.rm = rm;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
}
