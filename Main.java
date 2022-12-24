import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Pemilik pgs = new Pemilik();
        Scanner Pemilik = new Scanner(System.in);
        // Tampilkan output ke user
        System.out.println(" ### PEMILIK DVD ### ");
        System.out.println(" Nama Pemilik : ");
        pgs.nama_pemilik= Pemilik.nextLine();
        System.out.println(" Id : ");
        pgs.id = Pemilik.nextInt();
        // Tampilkan output lagi
        System.out.println(" No Hp : ");
        pgs.no_hp = Pemilik.nextInt();


        // Membuat Scanner untuk class Penyewa
        Penyewa in = new Penyewa();
        Scanner Penyewa = new Scanner(System.in);
        System.out.println(" ### PENDATAAN PENYEWA ### ");
        System.out.println(" Nama Penyewa : ");
        in.nama_lengkap= Penyewa.nextLine();
        System.out.println(" No Hp : ");
        in.no_hp = Penyewa.nextLine();


        //Rental Keluar
        System.out.println(" ### DATA HARGA ###");
        Transaksi byr = new Transaksi();
        Scanner RentalKeluar = new Scanner(System.in);
        byr.Jenis_DVD();
        System.out.print("Masukkan Harga DVD yg ingin anda sewa : ");
        //menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        ((Transaksi) byr).harga= (int) RentalKeluar.nextDouble();
        System.out.println("Masukkan berapa hari annda mau menyawa : ");
        ((Transaksi)byr).lama_sewa = (int) RentalKeluar.nextDouble();

        // Menampilkan data yang sudah di inputkan
        System.out.println("---------------------------");
        System.out.println(" Nama Pemilik : " +pgs.getNama_pemilik());
        System.out.println(" No Hp : " +pgs.getNo_hp());
        System.out.println(" ID : "+pgs.getId());
        System.out.println("--------------------------");
        System.out.println(" Nama Penyewa : " +in.getNama());
        System.out.println(" No Hp : " +in.getNo_hp());
        System.out.println(" Alamat : " +in.getAlamat());
        // Menampilkan Output untuk menghitung total
        System.out.println("--------------------");
        System.out.println("Harga : " + ((Transaksi) byr).getHarga());
        System.out.println("Lama Sewa : "+ ((Transaksi) byr).getLama_sewa());
        System.out.println("total  : "+ ((Transaksi) byr).getMoney());
        java.io.File file = new java.io.File("output.txt");
        try{
            java.io.PrintWriter output = new  java.io.PrintWriter(file);

            output.println("============Struk Pembayaran=============");
            output.println("Nama Pelanggan: " + in.getNama());
            output.println("Alamat : " + in.getAlamat());
            output.println("No Hp : " + in.getNo_hp() );
            output.println("--------------------");
            output.println("total bayar untuk sewa ");
            output.println("Harga: " + ((Transaksi) byr).getHarga());
            output.println("Lama sewa : "+ ((Transaksi) byr).getLama_sewa());
            output.println("total: "+ byr.getMoney());
            output.close();

        }   catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}