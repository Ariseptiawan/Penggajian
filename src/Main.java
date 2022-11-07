public class Main {
    public static void main(String[] args) {
        Pegawai data = new Pegawai();
        InputData input = new InputData();

        input.InputPara();

        data.setNama(input.getNamaP());
        data.setId(input.getIdP());
        data.setGolongan(input.getGolP());
        data.setMasakerja(input.getMaskerP());
        data.setKehadiran(input.getHadirp());

        data.setGajipokok();
        data.setTunjangan();
        data.setBonus();
        data.setGajitotal();

        System.out.println("\nNama Pegawai\t: " + data.getNama());
        System.out.println("ID Pegawai\t\t: " + data.getId());
        System.out.println("Gaji Pegawai\t: Rp. " + data.getGajitotal());
    }
}