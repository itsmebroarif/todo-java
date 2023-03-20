    import java.util.ArrayList;
    import java.util.Scanner;

    public class main {

      static ArrayList<String> data = new ArrayList<>();

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {

          /* Bagian Menu Dalam Aplikasi */

          System.out.println("-----------------------------");
          System.out.println("Aplikasi Penyimpanan Data");
          System.out.println("-----------------------------");
          System.out.println("Menu:");
          System.out.println("  1. Tambah data");
          System.out.println("  2. Lihat data");
          System.out.println("  3. Ubah data");
          System.out.println("  4. Hapus data");
          System.out.println("  5. Keluar");
          System.out.println("Pilihan Anda: ");
          System.out.println("-----------------------------");
          System.out.println("Developed By Kelompok 3 ");
          System.out.println("-----------------------------");

          /* Bagian Menu Dalam Aplikasi (End) */

          choice = scanner.nextInt();

          switch (choice) {
            case 1:
              addData();
              break;

            case 2:
              viewData();
              break;

            case 3:
              updateData();
              break;

            case 4:
              deleteData();
              break;

            case 5:
              System.out.println("Menutup Aplikasi...");
              break;

            default:
              System.out.println("Pilihan tidak tersedia");
              break;

          }
        }
      }

      static void addData() {
        Scanner scanner = new Scanner(System.in);
              System.out.print("Masukan List Kegiatan Disini ");
                  String newData = scanner.nextLine();
                  
                  data.add(newData);
              System.out.println("Data berhasil ditambahkan");
      }

      static void viewData() {
        if (data.size() == 0) {
            System.out.println("-----------------------------");
            System.out.println("Gagal, Belum ada data");
            System.out.println("-----------------------------");
        } else {

            System.out.println("-----------------------------");
          System.out.println("Data Yang Berhasil Diambil : ");
            System.out.println("-----------------------------");
              for (int i = 0; i < data.size(); i++) {
                System.out.println((i + 1) + ". " + data.get(i));
            }
        }
      }
      static void updateData() {
        Scanner scanner = new Scanner(System.in);
        viewData();
        System.out.print("Pilih nomor data yang ingin diubah: ");
        int choice = scanner.nextInt();

            scanner.nextLine(); // consume newline character
            if (choice < 1 || choice > data.size()) {
              System.out.println("Nomor data tidak valid");
            } else {
                    System.out.print("Masukkan data baru: ");
                    String newData = scanner.nextLine();
                    data.set(choice - 1, newData);
                    System.out.println("Data berhasil diubah");
            }
          }

      static void deleteData() {
        Scanner scanner = new Scanner(System.in);
        viewData();

            System.out.print("Pilih nomor data yang ingin dihapus: ");
            int choice = scanner.nextInt();
                if (choice < 1 || choice > data.size()) {
                System.out.println("Nomor data tidak valid");
            } else {
                data.remove(choice - 1);
                System.out.println("Data berhasil dihapus");
                }
        }
    }