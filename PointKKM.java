public class PointKKM {
    public int[] id = new int[4];
  public String[] namaPoin = new String[4];
  public int[] jumlahPoin = new int[4];

  public PointKKM() {
    String listNamaPoint[] = {"Orientasi Mahasiswa Baru", "Keterampilan Profesional", "Keterampilan Bersifat Kemanusiaan", "Keterampilan Penunjang"};
    int listJumlahPoint[] = {150, 50, 100, 70};
    for (int i = 0; i < 4; i++) {
      id[i] = i + 1;
      namaPoin[i] = listNamaPoint[i];
      jumlahPoin[i] = listJumlahPoint[i];
    }
  }
}
