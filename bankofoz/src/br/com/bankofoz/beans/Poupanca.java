package br.com.bankofoz.beans;

public class Poupanca extends Conta {

private float rendimento;

/*
 * public boolean depositar(float valor) {
		this.saldo = saldo + valor;
		return true;
 */

	public float verificarSaldo(){
		return super.getSaldo();
	}

	public void creditarRendimento () {
		super.setSaldo(super.getSaldo() + rendimento);
		rendimento=0;
}

public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
	super.setAll(numero, digito, agencia, saldo, cliente);
	this.rendimento = rendimento;
}

@Override
public String toString() {
	return "Poupanca [rendimento=" + rendimento + super.toString();
}

public Poupanca() {
	super();
}

public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
	super(numero, digito, agencia, saldo, cliente);
	this.rendimento = rendimento;
}

public float getRendimento() {
	return rendimento;
}

public void setRendimento(float rendimento) {
	this.rendimento = rendimento;
}



	
	
}
