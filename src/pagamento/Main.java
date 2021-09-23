package pagamento;

public class Main {
	public static void main(String[] args) {
		
		PagamentoDinheiro pd = new PagamentoDinheiro(60.00);
		
		double produto = 50.00;
		double troco = pd.pagamento_dinheiro(produto);
		
		if(troco == -1) {
			System.out.println("Transação não realizada!");
		}else {
			System.out.println("Seu troco: "+troco);
		}
		
		PagamentoDinheiro pd_1 = new PagamentoDinheiro(100);
		
		produto = 50.00;
		troco = pd_1.pagamento_dinheiro(produto);
		
		PagamentoDinheiro pd_2 = new PagamentoDinheiro(200);
		
		produto = 20.00;
		troco = pd_2.pagamento_dinheiro(produto);
		
		System.out.println("Seu troco: "+troco);
		
		System.out.println("Quantidade de transações: "+pd.getQtd_transacoes());
		System.out.println("Quantidade de transações em dinheiro: "+pd.getValor_dinheiro());
		System.out.println("Quantidade de transações em pagamentos: "+pd.getValor_transacoes());
	}
}
