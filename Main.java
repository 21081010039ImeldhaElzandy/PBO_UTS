package utspbo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int jumlahAwal=0, jumlahTungguPorong=0, jumlahTungguSurabaya=0, jumlahNaikPorong=0, jumlahNaikSurabaya=0, 
    jumlahTurunPorong=0, jumlahTurunSurabaya=0, jumlahTurunGresik=0  ;
    Scanner input = new Scanner(System.in);
    
    Bus bus = new Bus(jumlahAwal);
    Halte haltePorong = new Halte(jumlahTungguPorong);
    Halte halteSurabaya = new Halte(jumlahTungguSurabaya);
        
    // jumlah penumpang awal
    System.out.println("---------------------------------------------------");
    System.out.println("OUTPUT");
    System.out.println("---------------------------------------------------");
    System.out.println("-> Bus Berangkat dari PULL/Kantor");
    System.out.print("  Jumlah Penumpang Awal : ");
    jumlahAwal = input.nextInt();
    bus.naik(jumlahAwal);
    System.out.println("    - Jumlah Penumpang : " +bus.getJumlahPenumpang()+ " Penumpang");
            
    // penumpang turun di porong
    System.out.print("  Jumlah Penumpang Turun di Halte Porong : ");
    jumlahTurunPorong = input.nextInt();
    System.out.println("    - " +jumlahTurunPorong+ " Penumpang turun di Halte Porong");
        
    // penumpang turun di gresik
    System.out.print("  Jumlah Penumpang Turun di Halte Gresik : ");
    jumlahTurunGresik = input.nextInt();
    System.out.println("    - " +jumlahTurunGresik+ " Penumpang turun di Halte Gresik");
        
    System.out.println("---------------------------------------------------");
        
    // halte porong
    System.out.print("  Jumlah Penumpang Menunggu di Halte Porong : ");
    jumlahTungguPorong = input.nextInt();
    System.out.println("-> Halte Porong : " +jumlahTungguPorong+ " Penumpang Menunggu");
            
    // bus sampai di porong
    System.out.println("-> Bus Sampai di Halte Porong ");
    System.out.print("  Jumlah Penumpang Turun di Halte Porong : ");
    jumlahTurunPorong = input.nextInt();
    System.out.print("  Jumlah Penumpang Naik di Halte Porong : ");
    jumlahNaikPorong = input.nextInt();
    
    System.out.println("    - " +jumlahTurunPorong+ " Penumpang Turun");
    System.out.println("    - " +jumlahNaikPorong+ " Penumpang Naik");
    bus.turun(jumlahTurunPorong);
    bus.naik(jumlahNaikPorong);
    haltePorong.setPenumpangMenunggu(jumlahTungguPorong - jumlahNaikPorong);
    System.out.println("       - tujuan surabaya");
    System.out.println("       - tujuan gresik");
    System.out.println("    - Jumlah Penumpang : " +bus.getJumlahPenumpang()+ " Penumpang");
    
    // halte porong
    System.out.println("-> Halte Porong : " +haltePorong.getPenumpangMenunggu()+ " Penumpang Menunggu");
           
    System.out.println("---------------------------------------------------");
     
    //halte surabaya
    System.out.print("  Jumlah Penumpang Menunggu di Halte Surabaya : ");
    jumlahTungguSurabaya = input.nextInt();
    System.out.println("-> Halte Surabaya : " +jumlahTungguSurabaya+ " Penumpang Menunggu");
        
    // bus sampai di surabaya
    System.out.println("-> Bus Sampai di Halte Surabaya");
    System.out.print("  Jumlah Penumpang Turun di Halte Surabaya : ");
    jumlahTurunSurabaya = input.nextInt();
    System.out.print("  Jumlah Penumpang Naik di Halte Surabaya : ");
    jumlahNaikSurabaya = input.nextInt();
    bus.turun(jumlahTurunSurabaya);
    bus.naik(jumlahNaikSurabaya);
    halteSurabaya.setPenumpangMenunggu(jumlahTungguSurabaya - jumlahNaikSurabaya);
    System.out.println("    - " +jumlahTurunSurabaya+ " Penumpang Turun");
    System.out.println("    - " +jumlahNaikSurabaya+ " Penumpang Naik");
    System.out.println("       - " +jumlahNaikSurabaya+ " Penumpang Tujuan Gresik");
    System.out.println("    - Jumlah Penumpang : " +bus.getJumlahPenumpang()+ " Penumpang");
    
    // halte surabaya
    System.out.println("    Halte Surabaya : " +halteSurabaya.getPenumpangMenunggu()+ " Penumpang Menunggu");
    System.out.println("---------------------------------------------------");
    }        
}