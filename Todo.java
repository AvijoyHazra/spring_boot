package entity;

public class Todo {
 private String mail;
 private String phone;
 private String name;
 
 	public String getMail() {
 		return mail;
 		}
 	public void setMail(String mail) {
 		this.mail = mail;
 	}
 	public String getPhone() {
 		return phone;
 	}
 	public void setPhone(String phone) {
 		this.phone = phone;
 	}
 	public String getName() {
 		return name;
 	}
 	public void setName(String name) {
 		this.name = name;
 	}
	@Override
	public String toString() {
		return "Todo [mail=" + mail + ", phone=" + phone + ", name=" + name + "]";
	}
}
