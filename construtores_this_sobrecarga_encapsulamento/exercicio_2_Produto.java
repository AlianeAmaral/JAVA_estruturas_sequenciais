package construtores;

public class Produto {

	public String name;
	public double price;
	public int quantity;
	
	public Produto (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Produto (String name, double price) { //esse é o construtor sobrecarregado.
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInStock() {
		return price * quantity; 
	}

	public void addProducts (int quantity) { //essa função deve alterar o valor do atributo "quantity".
		this.quantity += quantity;
		/* o "this" servirá para ser explícito que o quantity que você está se referindo, é o atributo da classe e não o parâmetro que chegou na função acima (int quantity).
		aqui será feita a soma do quantity (inserido como parâmetro pelo usuário) + quantity (atributo)*/
	}
	
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format ("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format ("%.2f", totalValueInStock());
	}
	
}
