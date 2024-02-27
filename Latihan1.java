import java.util.Scanner;
public class Latihan1 {
        String judul, pengarang;
        int halaman, stok, harga;
        double hargaTotal, diskon;
        
     public Latihan1() {
     }
        public Latihan1(String jud, String pg, int hal, int stok, int har) {
            judul = jud;
            pengarang = pg;
            halaman = hal;
            stok = stok;
            harga = har;
    
     }
            void tampilInformasi(){
                System.out.println("Judul: " + judul);
                System.out.println("Pengarang: " + pengarang);
                System.out.println("Jumlah halaman:" + halaman);
                System.out.println("Sisa stok: "+ stok);
                System.out.println("Harga: "+ harga);
            }
            void terjual(int jml){
                if(stok > 0){
                    stok -= jml;
                }
                stok -= jml;
            }
            void restock(int jml){
                stok+=jml;
            }
            void gantiHarga(int hrg){
                harga = hrg;
            }
            void hitunghargaTotal(int jml) {
                hargaTotal = harga * jml;
            }
            void hitungDiskon(){
                if (hargaTotal > 250000){
                    diskon = hargaTotal * 0.12;
                } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
                    diskon = hargaTotal * 0.05;
                }
            }
            double hargaBayar;
            void hitungHargaBayar(){
                hargaBayar = hargaTotal - diskon;
            }
        {
     
        } 
    }       
     

