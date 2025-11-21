public class Main {

    public static void main(String[] args) {

        System.out.println("=== 1. Pewarisan Sederhana ===");
        AlatMusik a = new AlatMusik();
        Gitar g = new Gitar();
        a.bunyi();
        g.bunyi();

        System.out.println("\n=== 2. Multilevel Inheritance ===");
        Direktur d = new Direktur();
        d.dataPegawai();
        d.tugasManajer();
        d.tugasDirektur();

        System.out.println("\n=== 3. Access Modifier Demo ===");
        RekeningTabungan rt = new RekeningTabungan(500000, "Andi", "Bank A");
        rt.infoRekening();
    }
}


// 1. Pewarisan Sederhana


class AlatMusik {
    public void bunyi() {
        System.out.println("Alat musik mengeluarkan bunyi...");
    }
}

class Gitar extends AlatMusik {
    @Override
    public void bunyi() {
        System.out.println("Gitar: jreng jreng!");
    }
}


// 2. Multilevel Inheritance


class Pegawai {
    public void dataPegawai() {
        System.out.println("Ini adalah data pegawai.");
    }
}

class Manajer extends Pegawai {
    public void tugasManajer() {
        System.out.println("Manajer mengatur pekerjaan tim.");
    }
}

class Direktur extends Manajer {
    public void tugasDirektur() {
        System.out.println("Direktur membuat keputusan besar perusahaan.");
    }
}


// 3. Access Modifier


class AkunBank {
    private double saldo;        // private: hanya di sini
    protected String pemilik;    // protected: bisa di subclass
    public String bank;          // public: bebas diakses

    public AkunBank(double saldo, String pemilik, String bank) {
        this.saldo = saldo;
        this.pemilik = pemilik;
        this.bank = bank;
    }

    public double getSaldo() {   // akses saldo lewat getter
        return saldo;
    }
}

class RekeningTabungan extends AkunBank {

    public RekeningTabungan(double saldo, String pemilik, String bank) {
        super(saldo, pemilik, bank);
    }

    public void infoRekening() {
        System.out.println("Pemilik: " + pemilik);  
        System.out.println("Bank   : " + bank);
        System.out.println("Saldo  : " + getSaldo()); 
    }
}