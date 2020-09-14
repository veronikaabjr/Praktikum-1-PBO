package projectkeramik01;

public class ProjectKeramik01 {

    public static void main(String[] args) {
        // TODO code application logic here
        Keramik k1 = new Keramik();
        k1.p = 30;
        k1.l = 30;
        k1.isiBox = 10;
        k1.harga = 54000;
        k1.luasKeramik();
        k1.BanyakBox();
        k1.hargaKeramik();
        
        Keramik k2 = new Keramik();
        k2.p = 40;
        k2.l = 40;
        k2.isiBox = 5;
        k2.harga = 65000;
        k2.luasKeramik();
        k2.BanyakBox();
        k2.hargaKeramik();
        
        Keramik k3 = new Keramik();
        k3.p = 30;
        k3.l = 40;
        k3.isiBox = 8;
        k3.harga = 60000;
        k3.luasKeramik();
        k3.BanyakBox();
        k3.hargaKeramik();
    }
    
}
