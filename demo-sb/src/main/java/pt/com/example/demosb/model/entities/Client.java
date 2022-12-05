package pt.com.example.demosb.model.entities;

public class Client {
	
	private int id;
	private String name;
	private String nif;
	
	
	public Client(int id, String name, String nif) {
		super();
		this.id = id;
		this.name = name;
		this.nif = nif;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNif() {
		return nif;
	}


	public void setNif(String nif) {
		this.nif = nif;
	}
	
	
	
	

}
