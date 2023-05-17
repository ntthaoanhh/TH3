package bai1;

public class OrderDetail {
	private int quatity;
	private Product product;
	
	public OrderDetail(int quatity,Product product) {
		this.quatity = quatity;
		this.product = product;
	}
	public OrderDetail() {
		
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product=product;
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity=quatity;
	}
	public double calcTotalPrice() {
		double thanhtien;
		thanhtien = quatity*product.getPrice();
		return thanhtien;
	}
	@Override
	public String toString() {
		return "Ma SP:" + product.getProductID() + ",Mo ta:" + product.getDescription() + ",Don gia:" + product.getPrice() + ",So luong:" + quatity + ",Thanh tien:" + calcTotalPrice();
	}

}