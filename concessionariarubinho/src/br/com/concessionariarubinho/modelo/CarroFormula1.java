package br.com.concessionariarubinho.modelo;

public class CarroFormula1 {

	private String cor;
	private float valor;
	private String escuderia;
	private float velocidade;
	private boolean status;


	//Sintaxe m�todo:
	// <modificador> (se � private, se � public) <tipo do retorno> <nome do m�todo> (<tipoParam> <nome do par�metro>){

	//Resp. Professor:


	public float retornarVelocidade() {
		return velocidade;
	}

	public void brecar() {
		if (status=true) {
			velocidade=0;
		}
	}

	public void acelerar(float param) {
		if (param>0 && status==true) {
			velocidade+=param;
		}
	}

	public String desligar() {
		if (status==false) {
			return "Carro j� est�va desligado!";
		}
		status=false;
		velocidade=0;
		return "Carro desligado!";
	}

	public String ligar() {
		if (status = true) {
			return "Carro j� estava ligado!";
		}
		status=true;
		return "Carro ligado agora";
	}


	public String retornarCor() {
		return cor;
	}

	public float retornarValor() {
		return valor;
	}

	public String retornarEscuderia() {
		return escuderia;
	}


	public void preencherValor(float param) {
		if (param>0) {
			valor = param;
		}

	}


	public void preencherCor(String param) {
		cor = param.toUpperCase();
	}

	public void preencherEscuderia(String param) {
		escuderia = param.toUpperCase();
	}




	//Resp. Henrique
	/*
	public String retornarCor () {
		return cor;
	}

	public String retornarEscuderia () {
		return escuderia;
	}

	public void preencherValor (float param) {
		if (param>0) {
			valor = param;
		}
	}

	public void retornarCor (String param) {
		cor = param.toUpperCase();
	}

	public void retornarEscuderia (String param) {
		escuderia = param.toUpperCase();
	}

	 */























}
