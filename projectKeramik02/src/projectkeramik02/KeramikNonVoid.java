/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkeramik02;

/**
 *
 * @author User
 */
public class KeramikNonVoid {
    double panjang;
    double lebar;
    double isiBox;
    double harga;
    double luasTanah;
    
    KeramikNonVoid(double p,double l,double ib){
        this.panjang = p;
        this.lebar = l;
        this.isiBox = ib;
    }
    double luasKeramik(){
        double luasTotal;
        luasTotal = this.panjang * this.lebar *this.isiBox;
        return luasTotal;
    }
    KeramikNonVoid(double p,double l, double ib, double lt){
            this.panjang = p;
            this.lebar = l;
            this.isiBox = ib;
            this.luasTanah = lt;
    }
    double banyakBox(){
        double totalBox = Math.ceil((double)(this.luasTanah /(this.panjang * this.lebar * this.isiBox)));
        return totalBox;
    }
    KeramikNonVoid(double p,double l, double ib, double lt, double h){
            this.panjang = p;
            this.lebar = l;
            this.isiBox = ib;
            this.luasTanah = lt;
            this.harga = h;
    }
    double hargaKeramik(){
        double hargaTotal = Math.ceil((double)(this.luasTanah/(this.panjang * this.lebar * this.isiBox)))* this.harga;
        return hargaTotal;
    }
}
