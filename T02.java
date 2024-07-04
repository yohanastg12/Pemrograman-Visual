// 12S22008 - RAHEL SIMANJUNTAK
// 122S22050 - YOHANA SITANGGANG

 import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;
        
        iSBN = input.nextLine();
        String judul;
        
        judul = input.nextLine();
        String penulis;
        
        penulis = input.nextLine();
        String tahunTerbit;
        
        tahunTerbit = input.nextLine();
        String penerbit;
        
        penerbit = input.nextLine();
        String formatBuku;
        
        formatBuku = input.nextLine();
        double hargaPembelian;
        
        hargaPembelian = Double.parseDouble(input.nextLine());
        double mM;
        
        mM = Double.parseDouble(input.nextLine());
        int stok;
        
        stok = Integer.parseInt(input.nextLine());
        double rating;
        
        rating = Double.parseDouble(input.nextLine());
        String ratingPick;
        
        ratingPick = "";
        if (rating >= 4.7) {
            ratingPick = "Best Pick";
        } else {
            if (rating >= 4.5) {
                ratingPick = "Must Read";
            } else {
                if (rating >= 4.0) {
                    ratingPick = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        ratingPick = "Average";
                    } else {
                        if (rating <= 3.0) {
                            ratingPick = "Low";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBuku + "|" + hargaPembelian + "|" + mM + "|" + stok + "|" + rating + "|" + ratingPick);
    }
}
