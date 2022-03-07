package computer;

public class Main {
	
	public static void main(String[] args) {
		
		Resolution resolution = new Resolution(1920, 1080);
		Monitor monitor = new Monitor("V1234", "Vestel", "25", resolution);
		Kasa kasa = new Kasa("Blade", "Cam");
		Anakart anakart = new Anakart("B250", "Asus", 10, "Windows10");
		Bilgisayar bilgisayar = new Bilgisayar(monitor, kasa, anakart);
		
		
		bilgisayar.getKasa().bilgisayariAc();
		bilgisayar.getMonitor().monitoruKapat();
		bilgisayar.getAnakart().isletimSistemiYukle("Linux");
	}	
}
