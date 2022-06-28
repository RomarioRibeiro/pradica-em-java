package exercicioencapsulamento;

public class Pedido {
	Integer codigo;

	double subTotal;

	Integer desconto;

	

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public Integer getDesconto() {
		return desconto;
	}

	public void setDesconto(Integer desconto) {
		this.desconto = desconto;
	}

	public double getTotal() {
		return subTotal - desconto ;
	}


	
}
