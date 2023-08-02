import java.net.Socket;

import org.w3c.dom.ls.LSOutput;

public class merkez2 {

	public static void main(String[] args) {

		// byte degerleri -127 128 arasidir

		byte sayi = 100;

		System.out.println(sayi);

		// short sayi degerleri -32768 ve 32767 arasindadir

		short sayik = 10121;

		System.out.println(sayik);

		// 9 basamaga kadar cikan sayilardir 4 byte
		// genelde int kullanılır

		int sayiki = 2012345;
		int sayiki2 = 201346;

		System.out.println(sayiki);
		System.out.println(sayiki2);

		// long sayilar cok buyuk sayidir 8byte
		// 19 basamaga kadar cikiyor

		long maxdeger = Long.MAX_VALUE;
		System.out.println(maxdeger);
		System.out.println("a");

		long mindeger = Long.MIN_VALUE;
		System.out.println(mindeger);

		// YORUM SATIRI KOLAY YOL HEPSİYLE TEK TEK UGRASMAK YERINE

		/*
		 * long maxdeger = Long.MAX_VALUE; System.out.println(maxdeger);
		 * System.out.println("a");
		 * 
		 * long mindeger = Long.MIN_VALUE; System.out.println(mindeger);
		 */

		long a = 25411036788L;
		System.out.println(a);

		float maxDeger = Float.MAX_VALUE;
		float minDeger = Float.MIN_VALUE;

		System.out.println(maxDeger);
		System.out.println(minDeger);

		// boolean sadece true false veriyor!!!!!!!!!!!!!

		boolean sonuc1 = 2 < 6;
		boolean sonuc2 = 2 > 6;

		System.out.println(sonuc1);
		System.out.println(sonuc2);

		// char sadece karakter !! amaaa tek tırnaklı ve sadece tek bir karakteri
		// tutabilir

		char karakter = '?';
		System.out.println(karakter);

		char karakter2 = 's';
		System.out.println(karakter2);

		// string veri tipi METİNSEL İFADELER İCİN KULLANILIR
		// STRİNGİN KUCUK HARFLISI YOK BUYUK YAZCAN

		String metin = "yuceturk";
		System.out.println(metin);

		String metinsel_ifade = "yuceturk" + " harika biri";
		System.out.println(metinsel_ifade);

		String fb = "Born in Los Born in Los Angeles, California, on June 4, 1975, "
				+ "Angelina Jolie starred in the HBO biopic Gia before earning a best"
				+ " supporting actress Academy Award for Girl, Interrupted. Jolie became one of Hollywood's marquee names,"
				+ " with starring roles in movies like Wanted, Mr. and Mrs. Smith, Salt and Changeling. She later had a huge"
				+ " international blockbuster with Disney's Maleficent, which spawned a sequel."
				+ " Jolie also directed the films In the Land of Blood and Honey, "
				+ "Unbroken and By the Sea, in which she co-starred with then-husband brad pitt";

		System.out.println(fb);

	}
}
