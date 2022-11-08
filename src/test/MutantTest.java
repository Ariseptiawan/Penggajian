import org.testng.annotations.Test;

public class MutantTest {
    Pegawai data = new Pegawai();
    Mutant1 m1 = new Mutant1();

    TestCase testcase = new TestCase();
    private int n;

    @Test
    public void TestMutant1() {

        //select testcase ke(n)
        n=5;

        testcase.setTcKe(n);

        inputPara();

        m1.setGajipokok();
        m1.setTunjangan();
        m1.setBonus();
        m1.setGajitotal();

        data.setGajipokok();
        data.setTunjangan();
        data.setBonus();
        data.setGajitotal();

        if (data.getGajipokok() == 0 || m1.getGajipokok() == 0) {
            System.out.println("test case ada yang salah");
        } else {
            data.setGajitotal();
            m1.setGajitotal();
        }

        //menampilkan isi test case
        System.out.print("Test Case "+n+" : ");
        testcase.TCkeView();

        System.out.println("===============================================");
        System.out.println("Gaji Total Mutant1\t: " + m1.getGajitotal());
        System.out.println("Gaji Total Program\t: " + data.getGajitotal());

        if (m1.getGajitotal() != data.getGajitotal()){
            System.out.println("Test Case Kuat");
        } else {
            System.out.println("Test Case Lemah");
        }

    }

    public void inputPara(){

        testcase.setTcKe(n);

        m1.setGolongan(testcase.getGol());
        m1.setMasakerja(testcase.getMasker());
        m1.setKehadiran(testcase.getHadir());

        data.setGolongan(testcase.getGol());
        data.setMasakerja(testcase.getMasker());
        data.setKehadiran(testcase.getHadir());
    }

}

