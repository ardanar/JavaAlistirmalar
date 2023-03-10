package odev1;

public class Bilgisayar extends Telefon{   // Telefon sınıfını extends yaptığım için Telefon sınıfındaki tüm özellikler Bilgisayar sınıfına da geçti.
	
	// Telefon sınıfının üstüne yazar baskın olur
	boolean cepteTasinirMi = false;
	
	
	// Telefon sınıfında aynı fonksiyon var fakat Bilgisayar sınıfına aynısını yazarsam Bilgisayar sınıfındaki fonksiyon baskın olacaktır.
	void kullanım() {
		pil -= 20;
	}
	
}
