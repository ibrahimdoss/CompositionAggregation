package compositionExample.home;

public class Mutfak {
	
	private int tabakSayisi;
	private String beyazEsya;
	private String beyazEsyaMarkasi;
	
	public Mutfak(int tabakSayisi, String beyazEsya, String beyazEsyaMarkasi) {
		super();
		tabakSayisi = tabakSayisi;
		beyazEsya = beyazEsya;
		beyazEsyaMarkasi = beyazEsyaMarkasi;
	}
	
	
	public void BilgileriGoster() {
		
		System.out.println("Tabak sayısı : " + this.tabakSayisi);
		System.out.println("Beyaz Esya Türü : " + this.beyazEsya);
		System.out.println("Beyaz Esya Markası : " + this.beyazEsyaMarkasi);

	}


	public int getTabakSayisi() {
		return tabakSayisi;
	}


	public void setTabakSayisi(int tabakSayisi) {
		tabakSayisi = tabakSayisi;
	}


	public String getBeyazEsya() {
		return beyazEsya;
	}


	public void setBeyazEsya(String beyazEsya) {
		beyazEsya = beyazEsya;
	}


	public String getBeyazEsyaMarkasi() {
		return beyazEsyaMarkasi;
	}


	public void setBeyazEsyaMarkasi(String beyazEsyaMarkasi) {
		beyazEsyaMarkasi = beyazEsyaMarkasi;
	}
	
}
