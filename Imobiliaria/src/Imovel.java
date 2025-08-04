public class Imovel {
	private int tipo;
	private String proprietario;
	private double tamanho;
	private boolean isNobre;
	private int anoConstrucao;
	private double valorCompra;
	
	public Imovel(int tipo, String proprietario, double tamanho, boolean isNobre, int anoConstrucao, double valorCompra) {
		this.tipo = tipo;
		this.proprietario = proprietario;
		this.tamanho = tamanho;
		this.isNobre = isNobre;
		this.anoConstrucao = anoConstrucao;
		this.valorCompra = valorCompra;
	}
	
	public double getIPTU() {
		if( tipo == 2 && tamanho < 100){
			return valorCompra * 0.05;
		}else if (tipo == 2 && tamanho <= 100) {
			return valorCompra * 0.02;
		}else if(tipo == 1 && tamanho > 100) {
			return valorCompra * 0.03;
		}else {
			return valorCompra * 0.01;
		}
	}
	public double getValorVenda() {
		if( isNobre && tamanho < 100){
			return valorCompra * 1.8;
		}else if (isNobre && tamanho <= 100) {
			return valorCompra * 1.1;
		}else if(!isNobre && tamanho > 100) {
			return valorCompra * 1.2;
			
		}else {
			return valorCompra * 1.05;
		}
	}
	public int getIdade(int anoAtual) {
		return anoAtual - anoConstrucao;
	}
	public void mostrar() {
		System.out.println("Tipo" + tipo);
		System.out.println("Nome do proprietario:" + proprietario);
		System.out.println("Tamanho:" + tamanho);
		System.out.println("Area nobre? " + isNobre);
		System.out.println("Ano de construcao:" + anoConstrucao);
		System.out.println("Valor da compra:" + valorCompra);
	}
}
