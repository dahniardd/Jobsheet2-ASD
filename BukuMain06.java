import java.util.Scanner;
public class BukuMain06 {
    public static void main(String[] args) {
            
            Buku06 bk1 = new Buku06();
            bk1.judul = "Today Ends Tomorrow Comes";
            bk1.pengarang = "Denanda Pratiwi";
            bk1.halaman = 198;
            bk1.stok = 13;
            bk1.harga = 71000;
    
            bk1.tampilInformasi();
            bk1.terjual(5);
            bk1.gantiHarga(60000);
            bk1.tampilInformasi();
    
            Buku06 bk2 = new Buku06("Self Reward" , "Maheera Ayesha", 160, 29,  59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku06 bkDahniarr = new Buku06("Hujan", "Tere Liye", 200,10,90000);
        bkDahniarr.terjual(1);
        bkDahniarr.tampilInformasi();
    }
}

