package pagamento;

public class PagamentoDinheiro extends MeuValor{
	private static int qtd_transacoes;
	private static double valor_transacoes;
	private static double valor_dinheiro;
	
	public PagamentoDinheiro(double valor) {
		super(valor);
		this.qtd_transacoes++;
		this.valor_dinheiro = this.valor_dinheiro + valor;
	}
	
	//valor R$100
	//dinheiro = 120
	
	// 120 - 100 = 20
	
	public double pagamento_dinheiro(double produto) {
		
		this.valor_transacoes = this.valor_transacoes + produto;
		
		double troco = 0.0;
		
		if(produto > 0 && produto <= this.getValor()) {
			troco = this.getValor() - produto;
		}else {
			troco = -1;
		}
		return troco;
	}
	
	public static int getQtd_transacoes() {
		return qtd_transacoes;
	}
	
	public void historico_pagamento() {
		System.out.println("Historico de trasacoes: "+ this.valor_transacoes);
	}
	
	public static double getValor_dinheiro() {
		return valor_dinheiro;
	}
	
	public static double getValor_transacoes() {
		return valor_transacoes;
	}
}