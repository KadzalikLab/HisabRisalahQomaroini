package com.kadzaliklab;

public class Bulan_ijtima {
    public static double[] main(double bulan_yg_dicari){

            //Alamah
            //rumus
            double r_alamah = (((36.73402222 * bulan_yg_dicari) / 168) % 1) * 168;
            //yaum
            int yaum = (int) (r_alamah / (double) 24);
            //sa'ah
            double saah = ((r_alamah / (double) 24) - yaum) * 24;


            //hisotul ardi
            double r_hissoh = (((30.67055556 * bulan_yg_dicari) / 360) % 1) * 360;

            //Buruj
            int buruj_hissoh = (int) (r_hissoh / (double) 30);
            //derajat
            double derajat_hissoh = ((r_hissoh / (double) 30) - buruj_hissoh) * 30;


            //Wasat

            double selisih=29.106667395230602;
            double r_wasat = (((selisih * bulan_yg_dicari) / 360) % 1) * 360;
            //Burujm
            int buruj_wasat = (int) (r_wasat / (double) 30);
            //derajat
            double derajat_wasat = ((r_wasat / (double) 30) - buruj_wasat) * 30;

            //Khosoh
            double r_khossoh = (((25.816525 * bulan_yg_dicari) / 360) % 1) * 360;
            //Buruj
            int buruj_khossoh = (int) (r_khossoh / (double) 30);
            //derajat
            double derajat_khossoh = ((r_khossoh / (double) 30) - buruj_khossoh) * 30;


            //Markaz
            double r_markaz = (((29.10555556 * bulan_yg_dicari) / 360) % 1) * 360;
            //Buruj
            int buruj_markaz = (int) (r_markaz / (double) 30);
            //derajat
            double derajat_markaz = (((r_markaz / (double) 30) - buruj_markaz) * 30)+0.01111111111;

        return new double[]{0,(yaum*24)+saah,(buruj_hissoh*30)+derajat_hissoh,(buruj_wasat*30)+derajat_wasat,(buruj_khossoh*30)+derajat_khossoh,(buruj_markaz*30)+derajat_markaz};

    }
}
