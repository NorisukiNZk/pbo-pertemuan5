
public class Main {
    public static void main(String[] args){
        String nama;
        int tahunRilis;

        Hp hpsaya = new Hp();
        hpsaya.merek = "Samsung a7";
        hpsaya.tahunRilis = 2020;

        Hp hporang = new Hp();
        hporang.merek = "Iphone 14 Pro Max";
        hporang.tahunRilis = 2023;

        Hp hpteman = new Hp();
        hpteman.merek = "Realme X3 Zoom";
        hpteman.tahunRilis = 2019;

        hpsaya.info();
        hporang.info();
        hpteman.info();

    }
}

