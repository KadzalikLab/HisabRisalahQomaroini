package com.kadzaliklab;

public class TahunMajmuah {
    public static double[] main(double tahun_yg_dicari) {

        //Alamah tahun_yg_dicari
        //rumus
        double r_alamah = (((123.1497222 + 104.8083333 * tahun_yg_dicari) / 168) % 1) * 168;
        //yaum
        int yaum = (int) (r_alamah / (double) 24);
        //sa'ah
        double saah = ((r_alamah / (double) 24) - yaum) * 24;


        //hisotul ardi
        double r_hissoh = (((348.7761111 + 8.046666667 * tahun_yg_dicari) / 360) % 1) * 360;
        //Buruj
        int buruj_hissoh = (int) (r_hissoh / (double) 30);
        //derajat
        double derajat_hissoh = ((r_hissoh / (double) 30) - buruj_hissoh) * 30;

        //Wasat
        double r_wasat = (((117.3566667 + 349.28 * tahun_yg_dicari) / 360) % 1) * 360;
        //Buruj
        int buruj_wasat = (int) (r_wasat / (double) 30);
        //derajat
        double derajat_wasat = ((r_wasat / (double) 30) - buruj_wasat) * 30;

        //Khosoh
        double r_khossoh = (((110.1983333 + 309.7983333 * tahun_yg_dicari) / 360) % 1) * 360;
        //Buruj
        int buruj_khossoh = (int) (r_khossoh / (double) 30);
        //derajat
        double derajat_khossoh = ((r_khossoh / (double) 30) - buruj_khossoh) * 30;

        //Markaz
        double r_markaz = (((33.99444444 + 349.2666667 * tahun_yg_dicari) / 360) % 1) * 360;
        //Buruj
        int buruj_markaz = (int) (r_markaz / (double) 30);
        //derajat
        double derajat_markaz = ((r_markaz / (double) 30) - buruj_markaz) * 30;

        return new double[]{0,(yaum*24)+saah,(buruj_hissoh*30)+derajat_hissoh,(buruj_wasat*30)+derajat_wasat,(buruj_khossoh*30)+derajat_khossoh,(buruj_markaz*30)+derajat_markaz};


    }
}
