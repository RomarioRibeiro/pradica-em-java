package exercicioencapsulamento;

public class PedidoVenda {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		
		pedido.setCodigo(1);
		pedido.setDesconto(10);
		pedido.setSubTotal(100);
		
		System.out.println("O código: " +pedido.getCodigo());
		System.out.println("O seu Desconto: " +pedido.getDesconto());
		System.out.println("O seu Sub-Total: " +pedido.getSubTotal());
		System.out.println("O Total: " +pedido.getTotal());
	}

}
