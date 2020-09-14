package projectkeramik01;

public class Keramik {
    double p;
    double l;
    double isiBox;
    double harga;
    double luasTanah = 1000000;
    
    void luasKeramik (){
        double luasTotal;
        luasTotal = this.p * this.l * this.isiBox;
        System.out.println ("Luas Total Keramik 1 box adalah " + luasTotal + " cm^2");
    }
    
    void BanyakBox (){
        double totalBox = Math.ceil((double)(this.luasTanah /(this.p * this.l * this.isiBox)));
        System.out.println ("Banyak box yang dibutuhkan " + totalBox);
    }
    
    void hargaKeramik(){
        double hargaTotal = Math.ceil((double)(this.luasTanah/(this.p * this.l * this.isiBox)))* harga;
        System.out.println("Total harga untuk keramik ini Rp " + hargaTotal);
    }
    
}
   