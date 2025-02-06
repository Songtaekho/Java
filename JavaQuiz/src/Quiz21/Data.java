package Quiz21;

public class Data {

	private String name;
	private String age;
	private String mail;
	private String town;
	
	public Data(String name, String age, String mail, String town) {
		this.name = name;
		this.age = age;
		this.mail = mail;
		this.town = town;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}
}
