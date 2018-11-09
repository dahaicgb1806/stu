package cn.tedu.pojo;
/**
 * 用来表示订单详情对象
 * @author Administrator
 *属性：数量品项金额
 */
public class OrderDetail {
	private String item;
	private int num;
	private int id;
	private Double price;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
