import java.util.Scanner;

public class InputData {
    private String namaP;
    private String idP;
    private int golP;
    private int maskerP;
    private int hadirp;

    Scanner sc = new Scanner(System.in);

    public String getNamaP() {
        return namaP;
    }

    public void setNamaP(String namaP) {
        this.namaP = namaP;
    }

    public String getIdP() {
        return idP;
    }

    public void setIdP(String idP) {
        this.idP = idP;
    }

    public int getGolP() {
        return golP;
    }

    public void setGolP(int golP) {
        this.golP = golP;
    }

    public int getMaskerP() {
        return maskerP;
    }

    public void setMaskerP(int maskerP) {
        this.maskerP = maskerP;
    }

    public int getHadirp() {
        return hadirp;
    }

    public void setHadirp(int hadirp) {
        this.hadirp = hadirp;
    }

    public void InputPara() {
        InputBio();
        InputGol();
        InputMas();
        InputHad();
    }

    private void InputBio() {
        System.out.print("Masukan nama pegawai: ");
        this.namaP = sc.nextLine();
        System.out.print("Masukan id pegawai\t: ");
        this.idP = sc.nextLine();
    }

    private void InputGol() {
        System.out.print("Golongan pegawai\t: ");
        this.golP = sc.nextInt();
        if (this.golP == 1 || this.golP == 2 || this.golP == 3 || this.golP == 4) {
            setGolP(this.golP);
        } else {
            System.out.println("\nGolongan tidak tersedia");
            System.out.println("Ulangi input!\n");

            //delay 1 sec
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } InputGol();
        }
    }

    private void InputMas() {
        System.out.print("Masukan masa kerja\t: ");
        maskerP = sc.nextInt();
    }

    private void InputHad() {
        System.out.print("Masukan kehadiran\t: ");
        hadirp = sc.nextInt();
    }
}
