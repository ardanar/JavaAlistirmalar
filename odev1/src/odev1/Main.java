package odev1;

public class Main {

	public static void main(String[] args) {
		
		// Nesne oluşturma
		Telefon telefon = new Telefon();
		Bilgisayar bilgisayar = new Bilgisayar();
		
		// Telefon 

		telefon.fiyat = 9999.99;
		telefon.inc = 6.1;
		telefon.pil = 50;
		System.out.println("Telefonun eski pili: " + telefon.pil);
		
		telefon.kullanım();  // kullanım fonksiyonu 
		
		System.out.println("Telefonun yeni pili: " + telefon.pil);
		System.out.println("Telefonun fiyatı: " + telefon.fiyat);
		System.out.println("Telefonun boyutu: " + telefon.inc);
		System.out.println("Telefon kod yazar mı? -> " + telefon.cepteTasinirMi);
		
		System.out.println("********");
		
		// Bilgisayar
		bilgisayar.fiyat = 29999.99;
		bilgisayar.inc = 13.3;
		bilgisayar.pil = 100;
		System.out.println("Bilgisayarın eski pili: " + bilgisayar.pil);
		
		bilgisayar.kullanım();   // baskın olan kullanım fonksiyonu 
		
		System.out.println("Bilgisayarın yeni pili: " + bilgisayar.pil);
		System.out.println("Bilgisayarın fiyatı: " + bilgisayar.fiyat);
		System.out.println("Bilgisayarın boyutu: " + bilgisayar.inc);
		System.out.println("Bilgisayar kod yazar mı? -> " + bilgisayar.cepteTasinirMi);

	}

}
