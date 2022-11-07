public class TestCase {
    private int gol;
    private int masker;
    private int hadir;
    private int tcKe;

    public TestCase() {
    }

    public int getGol() {
        return gol;
    }

    public int getMasker() {
        return masker;
    }

    public int getHadir() {
        return hadir;
    }

    public void setTcKe(int i) {
        //Tambahkan testcase disini
        switch (i) {
            case 1 -> {
                this.gol = 1;
                this.masker = 2;
                this.hadir = 3;
            }
            case 2 -> {
                this.gol = 2;
                this.masker = 5;
                this.hadir = 6;
            }
            case 3 -> {
                this.gol = 3;
                this.masker = 2;
                this.hadir = 7;
            }
            case 4 -> {
                this.gol = 4;
                this.masker = 2;
                this.hadir = 3;
            }
            case 5 -> {
                this.gol = 5;
                this.masker = 6;
                this.hadir = 9;
            }
            case 6 -> {
                this.gol = 0;
                this.masker = 0;
                this.hadir = 0;
            }
            // bisa ditambahkan dengan meng-copy case
        }
    }

    public void TCkeView(){

        setTcKe(this.tcKe);

        System.out.print(getGol()+",");
        System.out.print(getMasker()+",");
        System.out.print(getHadir()+"\n");

    }
}