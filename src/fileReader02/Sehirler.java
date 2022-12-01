package fileReader02;

public class Sehirler {

	private String name;
	private int plaka;
	public Sehirler(String name, int plaka) {
		super();
		this.name = name;
		this.plaka = plaka;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPlaka() {
		return plaka;
	}
	public void setPlaka(int plaka) {
		this.plaka = plaka;
	}
	@Override
	public String toString() {
		return "Sehirler [name=" + name + ", plaka=" + plaka + "]";
	}
	
	
}
