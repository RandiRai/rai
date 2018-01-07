
import java.util.Scanner;

public class BeratBadanIdeal {

    public static void main(String[] args) {

        Scanner masukan = new Scanner(System.in);

        float tinggi, berat, IMT ;

        System.out.print("Masukan Nama Anda = ");

	String nama = masukan.nextLine();

        System.out.print("Masukan Tinggi Badan Anda (m) = ");

        tinggi = masukan.nextFloat();

        System.out.print("Masukan Berat Badan Anda (Kg) = ");

        berat = masukan.nextFloat();

	float tinggi1 = (tinggi*tinggi);

        IMT = (berat/tinggi1);

        System.out.println("Berat Badan Anda Sesuai IMT = "+ IMT);


        if(IMT > 27) {

        System.out.println("Berat Badan Anda = Kegemukan (Obesitas) "); 
	System.out.println("Warning !!!");
	System.out.println("Sebaiknya memulai program menurunkan berat badan dan mengatur pola makan agar berat badan lebih ideal");
	}

        else if(IMT > 23) {

        System.out.println("Berat Badan Anda = Gemuk (Over Weight) ");
	System.out.println("Harus Waspada !!!");
	System.out.println("Jangan lupa olahraga dan makan teratur");
	}

        else if(IMT > 17) {

        System.out.println("Berat Badan Anda = Normal (Normal Weight)");
	System.out.println("Selamat !!!");
	System.out.println("Berat badan anda termasuk ideal");
	System.out.println("Pertahankan berat badan anda");
	}

        else {

        System.out.println("Berat Badan Anda = Kurus (Under Weight)");
	System.out.println("Sabar !!!");
	System.out.println("Tambah Konsumsi makanan berkalori");
	}   
}
}
