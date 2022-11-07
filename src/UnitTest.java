import org.testng.annotations.Test;

public class UnitTest {

    Pegawai data = new Pegawai();
    TestCase testcase = new TestCase();
    private int n;

    @Test
    public void GajiTotalTest(){

        // select test case ke(n)
        n =1;

        testcase.setTcKe(n);


        inputPara();

        data.setGajipokok();
        data.setTunjangan();
        data.setBonus();

        if (data.getGajipokok() == 0) {
            System.out.println("test case ada yang salah");
        } else {
            data.setGajitotal();
        }

        System.out.print("Test Case "+n+" : ");
        testcase.TCkeView();
        System.out.println("Output gaji Testcase"+" : "+data.getGajitotal());

        //Assert.assertEquals(data.getGajitotal(),1_105_000);

    }

    public void inputPara(){

        testcase.setTcKe(n);

        data.setGolongan(testcase.getGol());
        data.setMasakerja(testcase.getMasker());
        data.setKehadiran(testcase.getHadir());
    }

}
