package fileReader;

public class Ogrenciler {
	
	private String adSoyad;
	private int ortPuan;
	
	public Ogrenciler(String adSoyad, int ortPuan) {
		super();
		this.adSoyad = adSoyad;
		this.ortPuan = ortPuan;
	}
	
	public String getAdSoyad() {
		return adSoyad;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	public int getOrtPuan() {
		return ortPuan;
	}
	public void setOrtPuan(int ortPuan) {
		this.ortPuan = ortPuan;
	}

	@Override
	public String toString() {
		return "Ogrenciler [adSoyad=" + adSoyad + ", ortPuan=" + ortPuan + "]";
	}
	
	
	

}
