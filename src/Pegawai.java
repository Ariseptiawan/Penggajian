public class Pegawai {
    private String nama;
    private String id;
    private int golongan;
    private int masakerja;
    private int kehadiran;
    private int gajipokok;
    private int tunjangan;
    private int bonus;
    private int gajitotal;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public int getMasakerja() {
        return masakerja;
    }

    public void setMasakerja(int masakerja) {
        this.masakerja = masakerja;
    }

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public int getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok() {
        if (this.golongan == 1 || this.golongan == 2 ) {
            this.gajipokok = 1_000_000;
        } else if (this.golongan == 3 || this.golongan == 4 ) {
            this.gajipokok = 2_000_000;
        }
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan() {
        if ((this.golongan == 1 || this.golongan == 2 ) && this.masakerja > 5) {
            this.tunjangan = this.masakerja * 500_000;
        } else if ((this.golongan == 3 || this.golongan == 4 ) && this.masakerja > 5) {
            this.tunjangan = this.masakerja * 700_000;
        } else {
            this.tunjangan = 0;
        }
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus() {
        this.bonus = this.kehadiran * 35_000;
    }

    public int getGajitotal() {
        return gajitotal;
    }

    public void setGajitotal() {
        this.gajitotal = this.gajipokok + this.tunjangan + this.bonus;
    }
}
