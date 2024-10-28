import java.util.Scanner;

public class MenghitungBuah {
    public static void main(String[] args) {
        
        // Variable
        String Buah[][] = {
            {"Apel", "35000"},
            {"Jeruk", "50000"},
            {"Mangga", "25000"},
            {"Duku", "15000"},
            {"Semangka", "20000"}
        };
        int JumlahBuah[] = {0, 0, 0, 0, 0};
        int TotalHarga[] = {35000, 50000, 25000, 15000, 20000};
        int beliBerapaBuah, j = 1;
        int pilihan, pilhanBuah;
        int total = 0, discount = 0;
        Scanner sc = new Scanner(System.in);
        String confirm;

        // Perintah
        do {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Beli Buah");
            System.out.println("2. Struk Belanja");
            System.out.println("3. Keluar");
            System.out.println();
            System.out.print("Pilih Menu: (1-3) ");
            pilihan = sc.nextInt();
            sc.nextLine();
            System.out.println();

            if (pilihan == 1) {
                for (int i = 0; i < Buah.length; i++) {
                    System.out.println((i + 1) + ". " + Buah[i][0] + " \t" + Buah[i][1]);
                }
                System.out.println();
                System.out.print("Pilih Buah yang Mana? : (1-5) ");
                pilhanBuah = sc.nextInt();
                sc.nextLine();
                System.out.println();
                System.out.println(Buah[pilhanBuah - 1][0] + " " + Buah[pilhanBuah - 1][1]);
                System.out.println();
                System.out.print("Beli Berapa Buah? : ");
                beliBerapaBuah = sc.nextInt();
                sc.nextLine();
                JumlahBuah[pilhanBuah - 1] += beliBerapaBuah; // Tambah jumlah
                System.out.println();
            }

            if (pilihan == 2) {
                System.out.println("Daftar Belanja :");
                System.out.println("================================================");
                System.out.println("No.\tNama Buah\tJumlah\tHarga\tSubtotal");
                for (int i = 0; i < Buah.length; i++) {
                    if (JumlahBuah[i] > 0) {
                        int subtotal = TotalHarga[i] * JumlahBuah[i];
                        System.out.print(j + ".\t");
                        System.out.print(Buah[i][0] + "\t\t");
                        System.out.print(JumlahBuah[i] + "\t\t");
                        System.out.print(TotalHarga[i] + "\t");
                        System.out.println(subtotal);
                        j++;
                        total += subtotal;
                    }
                }
                System.out.println("================================================");
                System.out.println("Total:\t\t" + total);
                discount = (int) (total * 0.15);
                System.out.println("Discount(15%):\t" + discount);
                System.out.println("Total Bayar:\t" + (total - discount));
                System.out.println();
            }

            System.out.print("Input Data Lagi? : (y/n) ");
            confirm = sc.nextLine();
        } while (confirm.equalsIgnoreCase("y"));
        
        sc.close();
    }
}
