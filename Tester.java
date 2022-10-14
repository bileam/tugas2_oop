import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chosen;
        boolean status = false;
        String name, fakultas;
        int nim, umur;
        int index = 0;
        Mahasiswa[] mahasiswas = new Mahasiswa[100];
        System.out.println(mahasiswas.length);
        do {
          System.out.println("\nMENU");
          System.out.println("1. Input data mahasiswa");
          System.out.println("2. Input point mahasiswa");
          System.out.println("3. Tampilkan data mahasiswa");
          System.out.println("4. Keluar");
          System.out.print("Pilihan: ");
          chosen = scanner.nextInt();
          if (chosen == 1) {
            System.out.println("Input Data Mahasiswa");
            System.out.print("Masukkan nama:");
            scanner.nextLine();
            name = scanner.nextLine();
            System.out.print("Masukkan NIM:");
            nim = scanner.nextInt();
            System.out.print("Masukkan umur:");
            umur = scanner.nextInt();
            System.out.print("Masukkan fakultas:");
            scanner.nextLine();
            fakultas = scanner.nextLine();
            mahasiswas[index] = new Mahasiswa(nim, umur, name, fakultas);
            index++;
          } else if (chosen == 2) {
    
            System.out.println("List NIM mahasiswa: ");
            for (int i = 0; i < index; i++) {
              System.out.println("Nim ke-" + (i + 1) + " = " + mahasiswas[i].nim);
            }
            System.out.print("Pilih nim mahasiswa: ");
            nim = scanner.nextInt();
            for (int i = 0; i < index; i++) {
              if (mahasiswas[i].nim == nim) {
                status = true;
                boolean statusGetPoin = false;
                System.out.print("Masukkan id jenis poin(1-4): ");
                int idPoin = scanner.nextInt();
                PointKKM pointKKM = new PointKKM();
                for (int j = 0; j < pointKKM.id.length; j++) {
                  if (idPoin == pointKKM.id[j]) {
                    statusGetPoin = true;
                    mahasiswas[i].pointKKM += pointKKM.jumlahPoin[j];
                    System.out.println("Poin KKM jenis " + pointKKM.namaPoin[j] + " berhasil ditambahkan ke NIM = " + nim);
                    break;
                  } else {
                    statusGetPoin = false;
                  }
                }
                if (!statusGetPoin) {
                  System.out.println("ID Poin tidak ditemukkan");
                }
                break;
              } else {
                status = false;
              }
            }
    
            if (!status) {
              System.out.println("Data tidak ditemukkan!");
            }
    
          } else if (chosen == 3) {
            for (; ; ) {
              System.out.println("\nMenu tampilan data mahasiswa:");
              System.out.println("1. Semua data mahasiswa");
              System.out.println("2. Data mahasiswa tertentu");
              System.out.println("3. Kembali");
              int pilihan = scanner.nextInt();
              if (pilihan == 1) {
                for (int i = 0; i < index; i++) {
                  System.out.println((i + 1) + ". Nama: " + mahasiswas[i].name + "\tNIM: " + mahasiswas[i].nim + "\tUmur: " +
                    mahasiswas[i].umur + "\tPoinKKM: " + mahasiswas[i].pointKKM + "\tFakultas: " + mahasiswas[i].fakultas);
                }
    
              } else if (pilihan == 2) {
                boolean statusSearchMhs = false;
                System.out.println("Masukkan NIM yang ingin dicari: ");
                nim = scanner.nextInt();
                for (int i = 0; i < index; i++) {
                  if (mahasiswas[i].nim == nim) {
                    statusSearchMhs = true;
                    System.out.println((i + 1) + ". Nama: " + mahasiswas[i].name + "\tNIM: " + mahasiswas[i].nim +
                      "\tPoinKKM: " + mahasiswas[i].pointKKM);
                  }
                }
                if (!statusSearchMhs) {
                  System.out.println("Data mahasiswa tidak ditemukkan");
                }
              } else if (pilihan == 3) {
                break;
              } else {
                System.out.println("Pilihan tidak tepat");
              }
            }
          }
        } while (chosen != 4);
    }
}
