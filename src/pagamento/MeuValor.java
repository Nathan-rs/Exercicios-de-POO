package pagamento;

public class MeuValor {
	private double valor;
	
	
	public MeuValor(double valor) {
		this.valor = valor > 0? valor : 0;
	}
	
	@Override
	public String toString() {
		return "Valor: "+this.valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
}
