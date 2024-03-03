package modificador.estado;

public class Main {
	public static void main(String[] args) {
		Produto prod = new Produto();
		prod.setDescricao("Batata");
		prod.setValor(5.12);
		prod.setQuantidade(900);
		
		Produto.peso = 10.10;
		
		if (1==1) {
			int a = 10;


			int aa = 12;
			System.out.println(a);
		}
	}
}
