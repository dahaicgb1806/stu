package cn.tedu.pojo;
/**
 * 
 *用来表示一个门店对象
 *有一些自己的属性
 *属性有自己的Setter和Getter
 *没有业务逻辑
 * @author Administrator
 *
 */
public class Door {
//门店名称属性:三个属性
	private String doorName;
	private String tel;
	private int id;
	public String getDoorName() {
		return doorName;
	}
	public void setDoorName(String doorName) {
		this.doorName = doorName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	//设置Setter和Getter
	
}
