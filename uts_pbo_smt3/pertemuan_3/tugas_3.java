public class Mahasiswa {
    private String nama;
    private String nim;

    // Setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter nama
    public String getNama() {
        return this.nama;
    }

    // Setter nim (dengan validasi 10 digit)
    public void setNim(String nim) {
        if (nim.length() == 10 && nim.matches("[0-9]+")) {
            this.nim = nim;
        } else {
            System.out.println("NIM harus 10 digit angka.");
        }
    }

    // Getter nim
    public String getNim() {
        return this.nim;
    }

    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.setNama("Andi");
        m.setNim("2023123456"); // valid

        System.out.println("Nama: " + m.getNama());
        System.out.println("NIM: " + m.getNim());
    }
}
