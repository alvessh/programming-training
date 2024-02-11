package modificador.estado;

public class Produto {
	private String descricao;
	private Double valor;
	private Integer quantidade;
	public static Double peso;
	private Boolean ehCasado = true;
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Double getValor() {
		return this.valor;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Integer getQuantidade() {
		return this.quantidade; 
	}

}