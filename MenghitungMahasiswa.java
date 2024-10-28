import java.util.Scanner;

public class MenghitungMahasiswa {
    public static void main(String[] args) {
        String[] mahasiswa = new String[100];
        String inputData;
        Scanner sc = new Scanner(System.in);
        int[] nilai = new int[100];
        int i = 0, total = 0;

        do {
            System.out.print("Masukkan nama: ");
            mahasiswa[i] = sc.nextLine();

            System.out.print("Masukkan nilai: ");
            nilai[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Input data lagi? (y/n): ");
            inputData = sc.nextLine();

            i++;
        } while (i < mahasiswa.length && inputData.equalsIgnoreCase("y"));
        sc.close();

        System.out.println();

        System.out.println("Masukkan Jumlah Data: "+ i);
        
        for (int j = 0; j < mahasiswa.length; j++){
            if (mahasiswa[j]!=null) {
                System.out.println("_______________________________");
                System.out.println("Mahasiswa Ke : "+(j+1));
                System.out.println("Nama: "+mahasiswa[j]);
                System.out.println("Nilai: "+nilai[j]);
            }
        }
        System.out.println();

        System.out.println("Daftar mahasiswa: ");
        System.out.println("======================================");
        System.out.println("No\t\tNama\tNilai\tStatus");
        System.out.println("======================================");

        for (int j = 0; j < mahasiswa.length; j++) {
            String status;
            if (nilai[j] >= 75) {
                status = "Lulus";
            } else {
                status = "Tidak Lulus";
            }
            if (mahasiswa[j] != null) {
                System.out.println((j + 1) + "\t\t"+ mahasiswa[j] +"\t" + nilai[j] + "\t" + status);
            }
        }

        for (int j = 0; j < nilai.length; j++) {
            if (nilai[j] >= 0) {
                total = total + nilai[j];
            }
        }
        System.out.println();
        System.out.println("Total Nilai : "+total);
        System.out.println("Rata-Rata : "+total/i);
    }
}