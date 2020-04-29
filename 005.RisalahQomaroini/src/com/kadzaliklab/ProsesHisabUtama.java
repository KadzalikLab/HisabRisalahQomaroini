package com.kadzaliklab;

public class ProsesHisabUtama {

    public static void main(String[] args) {

        //====================untuk mengambil nilai dari input user==============\\

        System.out.println("\n"+"\t\t"+"PROGRAM HISAB RISALAH QOMAROINI KWAGEAN"+"\n");


        //ganti dengan tahun yang akan dicari
        int tahun_yg_dicari=1441;

        int bulan_yg_dicari=1;
        // Masukkan nomor urut bulan hijriyah yang dicari
         //1 =MUHARRAM| 2=SHOFAR| 3=R.AWAL| 4=R.AKHIR| 5=J.AWAL| 6=J.AKHIR
        // 7 =ROJAB| 8=SYABAN| 9=ROMADLON| 10=SYAWAL| 11=DZ.QODAH| 12=DZULHIJJAH
        System.out.println("Tahun hijriyah = "+tahun_yg_dicari);
        System.out.println("Bulan hijriyah = "+bulan_yg_dicari);


        //============================Sesuaikan dengan kordinat tempat anda !===========
         double derajat_burjur=112;
         double menit_bujur=13;
         double bujur=derajat_burjur+(menit_bujur/60);

         double derajat_lintang=-7;
         double menit_lintang=47;
         double lintang=0;
         if (derajat_lintang<0)lintang=derajat_lintang-(menit_lintang/60);
         else lintang=derajat_lintang+(menit_lintang/60);

         //rumus
         double bujur_kediri=112.0333333;

        //mencari bulan tamm dan tahun tamm
        if (bulan_yg_dicari==1) {tahun_yg_dicari=tahun_yg_dicari-2; bulan_yg_dicari=12;}
        else {tahun_yg_dicari=tahun_yg_dicari-1; bulan_yg_dicari=bulan_yg_dicari-1;}

        System.out.println("\n"+"\t\t\t\t"+"Tahun tamm= "+(int)tahun_yg_dicari+"\t"+"Bulan tamm= "+(int)bulan_yg_dicari);

        //=======Hasil data bulan tamm + data tahun tamm===============
        double alamah=(TahunMajmuah.main(tahun_yg_dicari)[1]+ Bulan_ijtima.main(bulan_yg_dicari)[1]);
        int yaum_alamah=(int)((alamah/24)%7);
        double saah_alamah=  (alamah%24);


        double hissoh= TahunMajmuah.main(tahun_yg_dicari)[2]+ Bulan_ijtima.main(bulan_yg_dicari)[2];
        int buruj_hissoh=(int)(hissoh/30)%12;
        double derajat_hissoh=  (hissoh%30);

        double wasat=(TahunMajmuah.main(tahun_yg_dicari)[3]+ Bulan_ijtima.main(bulan_yg_dicari)[3]);
        int buruj_wasat=(int)(wasat/30)%12;
        double derajat_wasat=  (wasat%30);

        double khossoh= TahunMajmuah.main(tahun_yg_dicari)[4]+ Bulan_ijtima.main(bulan_yg_dicari)[4];
        int buruj_khossoh=(int)(khossoh/30)%12;
        double derajat_khossoh=  (khossoh%30);
        double kasar_m_khossoh=derajat_khossoh%1;

        double markaz= TahunMajmuah.main(tahun_yg_dicari)[5]+ Bulan_ijtima.main(bulan_yg_dicari)[5];
        int buruj_markaz=(int)(markaz/30)%12;
        double derajat_markaz=  (markaz%30);
        double kasar_m_markaz=derajat_markaz%1;

        System.out.print(System.lineSeparator());
        System.out.println("\t\t\t"+"Hasil data bulan tamm + data tahun tamm");
        System.out.println("   Markaz   |" + "   Khosoh   |" + "    Wasat    |" + "     Hissoh    |" + "   Alamah   " );
        String format = "%11s%13s%13s%15s%14s%n";
        System.out.printf(format, desimal_ke_derajat(derajat_markaz)[3] + "," + desimal_ke_derajat(derajat_markaz)[2] + "," + desimal_ke_derajat(derajat_markaz)[1] + "," + buruj_markaz, desimal_ke_derajat(derajat_khossoh)[3] + "," + desimal_ke_derajat(derajat_khossoh)[2] + "," + desimal_ke_derajat(derajat_khossoh)[1]+ "," + buruj_khossoh, desimal_ke_derajat(derajat_wasat)[3] + "," + desimal_ke_derajat(derajat_wasat)[2]  + "," + desimal_ke_derajat(derajat_wasat)[1]  + "," + buruj_wasat, desimal_ke_derajat(derajat_hissoh)[3]  + "," + desimal_ke_derajat(derajat_hissoh)[2] + "," + desimal_ke_derajat(derajat_hissoh)[1]  + "," + buruj_hissoh, desimal_ke_derajat(saah_alamah)[3]  + "," + desimal_ke_derajat(saah_alamah)[2]  + "," + desimal_ke_derajat(saah_alamah)[1]  + "," + yaum_alamah);

        String format2 = "%-20s%15s%n";
        System.out.print(System.lineSeparator());
        System.out.println("           (detik),(menit),(derajat)");
        System.out.println("------------------------------------");
        double takdilawal=Takdil_awwal.Takdilawal(buruj_khossoh,(int)derajat_khossoh,kasar_m_khossoh);
        System.out.printf(format2,"takdilawal =",desimal_ke_derajat(takdilawal)[3]+","+desimal_ke_derajat(takdilawal)[2]+","+desimal_ke_derajat(takdilawal)[1]);

        System.out.println("------------------------------------");
        double takdilsani=Takdil_sani.main(buruj_markaz,(int)derajat_markaz,kasar_m_markaz);
        System.out.printf(format2,"takdilsani =",desimal_ke_derajat(takdilsani)[3]+","+desimal_ke_derajat(takdilsani)[2]+","+desimal_ke_derajat(takdilsani)[1]);

        System.out.println("------------------------------------");
        double bukdu_niroini=takdilawal+takdilsani;
        System.out.printf(format2,"bukdu_niroini =",desimal_ke_derajat(bukdu_niroini)[3]+","+desimal_ke_derajat(bukdu_niroini)[2]+","+desimal_ke_derajat(bukdu_niroini)[1]);

        System.out.println("------------------------------------");
        double hissoh_saat=Hissoh_saat.main(buruj_khossoh,(int)derajat_khossoh,kasar_m_khossoh);
        System.out.printf(format2,"hissoh_saat =",desimal_ke_derajat(hissoh_saat)[3]+","+desimal_ke_derajat(hissoh_saat)[2]+","+desimal_ke_derajat(hissoh_saat)[1]);

        //qoidah 2 menit 30 detik
        double qoidah1=0.041666666;
        double hasil_dorbi_awal=hissoh_saat*qoidah1;
        double hasil_dorbi_sani=hasil_dorbi_awal*bukdu_niroini;
        System.out.println("------------------------------------");
        System.out.printf(format2,"hasil_dorbi_sani =",desimal_ke_derajat(hasil_dorbi_sani)[3]+","+desimal_ke_derajat(hasil_dorbi_sani)[2]+","+desimal_ke_derajat(hasil_dorbi_sani)[1]);

        System.out.println("------------------------------------");
        double takdilsyamsi=hasil_dorbi_sani+takdilsani;
        System.out.printf(format2,"takdilsyamsi =",desimal_ke_derajat(takdilsyamsi)[3]+","+desimal_ke_derajat(takdilsyamsi)[2]+","+desimal_ke_derajat(takdilsyamsi)[1]);

        System.out.println("------------------------------------");
        double miqwam_syamsi=((buruj_wasat*30)+derajat_wasat)-takdilsyamsi;
        System.out.printf(format2,"miqwam_syamsi =",pengkonversi_satuan_buruj(miqwam_syamsi)[4]+","+pengkonversi_satuan_buruj(miqwam_syamsi)[3]+","+pengkonversi_satuan_buruj(miqwam_syamsi)[2]+","+pengkonversi_satuan_buruj(miqwam_syamsi)[1]);

        System.out.println("------------------------------------");
        double takdilayam= TakdilAyyam.main(pengkonversi_satuan_buruj(miqwam_syamsi)[1],pengkonversi_satuan_buruj(miqwam_syamsi)[2],miqwam_syamsi%1);
        System.out.printf(format2,"takdilayam =",desimal_ke_derajat(takdilayam)[3]+","+desimal_ke_derajat(takdilayam)[2]+","+desimal_ke_derajat(takdilayam)[1]);
        System.out.println("------------------------------------");
        double bukduniroini_muaddal=bukdu_niroini-takdilayam;
        System.out.printf(format2,"biroini_muaddal =",desimal_ke_derajat(bukduniroini_muaddal)[3]+","+desimal_ke_derajat(bukduniroini_muaddal)[2]+","+desimal_ke_derajat(bukduniroini_muaddal)[1]);

        System.out.println("------------------------------------");
        double takdil_alamah=bukduniroini_muaddal*hissoh_saat;
        System.out.printf(format2,"takdil_alamah =",desimal_ke_derajat(takdil_alamah)[3]+","+desimal_ke_derajat(takdil_alamah)[2]+","+desimal_ke_derajat(takdil_alamah)[1]);

        System.out.println("------------------------------------");
        double alamah_m_kediri=((pengkonversi_alamah(alamah)[1]*24)+alamah%24)-takdil_alamah;
        System.out.printf(format2,"alamah_m_kediri =",pengkonversi_alamah(alamah_m_kediri)[4]+","+pengkonversi_alamah(alamah_m_kediri)[3]+","+pengkonversi_alamah(alamah_m_kediri)[2]+","+pengkonversi_alamah(alamah_m_kediri)[1]);

        System.out.println("------------------------------------");
        double fadlu_tulaini=Math.abs(bujur_kediri-bujur)/15;
        System.out.printf(format2,"fadlu_tulaini =",desimal_ke_derajat(fadlu_tulaini)[3]+","+desimal_ke_derajat(fadlu_tulaini)[2]+","+desimal_ke_derajat(fadlu_tulaini)[1]);

        System.out.println("------------------------------------");
        double alamah_muadalah=0;
        if (bujur>bujur_kediri)alamah_muadalah=(alamah_m_kediri)+fadlu_tulaini;
        else  alamah_muadalah=(alamah_m_kediri) -fadlu_tulaini;
        System.out.printf(format2,"alamah_muadalah =",pengkonversi_alamah(alamah_muadalah)[4]+","+pengkonversi_alamah(alamah_muadalah)[3]+","+pengkonversi_alamah(alamah_muadalah)[2]+","+pengkonversi_alamah(alamah_muadalah)[1]);

        System.out.println("------------------------------------");
        double min_ijtima_ilaghurub=24-(alamah_muadalah%24);
        System.out.printf(format2,"ijtima_ilaghurub =",desimal_ke_derajat(min_ijtima_ilaghurub)[3]+","+desimal_ke_derajat(min_ijtima_ilaghurub)[2]+","+desimal_ke_derajat(min_ijtima_ilaghurub)[1]);

        System.out.println("------------------------------------");
        double irtifak=min_ijtima_ilaghurub*0.5;
        System.out.printf(format2,"irtifak hilal=",desimal_ke_derajat(irtifak)[3]+","+desimal_ke_derajat(irtifak)[2]+","+desimal_ke_derajat(irtifak)[1]);


        System.out.println("------------------------------------");
        double muksu_hilal=irtifak/15;
        System.out.printf(format2,"muksu hilal=",desimal_ke_derajat(muksu_hilal)[3]+","+desimal_ke_derajat(muksu_hilal)[2]+","+desimal_ke_derajat(muksu_hilal)[1]);

        System.out.println("------------------------------------");
        double ardul_qomar= ArdulQomar.main(pengkonversi_satuan_buruj(hissoh)[1],pengkonversi_satuan_buruj(hissoh)[2],hissoh%1);
        System.out.printf(format2,"ardul_qomar=",desimal_ke_derajat(ardul_qomar)[3]+","+desimal_ke_derajat(ardul_qomar)[2]+","+desimal_ke_derajat(ardul_qomar)[1]);

        System.out.println("------------------------------------");
        double daqoiq_arqom=ardul_qomar/15;
        System.out.printf(format2,"daqoiq_arqom=",desimal_ke_derajat(daqoiq_arqom)[3]+","+desimal_ke_derajat(daqoiq_arqom)[2]+","+desimal_ke_derajat(daqoiq_arqom)[1]);

        System.out.println("------------------------------------");
        double qous_nurhilal=daqoiq_arqom+muksu_hilal;
        System.out.printf(format2,"qous_nurhilal=",desimal_ke_derajat(qous_nurhilal)[3]+","+desimal_ke_derajat(qous_nurhilal)[2]+","+desimal_ke_derajat(qous_nurhilal)[1]);

        System.out.println("------------------------------------");
        double azimuth_m=HitungAzimuth.main(miqwam_syamsi,(buruj_hissoh*30)+derajat_hissoh,irtifak,lintang)[1];
        double azimuth_b=HitungAzimuth.main(miqwam_syamsi,(buruj_hissoh*30)+derajat_hissoh,irtifak,lintang)[2];
        System.out.printf(format2,"azimuth_matahari=",desimal_ke_derajat(azimuth_m)[3]+","+desimal_ke_derajat(azimuth_m)[2]+","+desimal_ke_derajat(azimuth_m)[1]);
        System.out.println("------------------------------------");
        System.out.printf(format2,"azimuth_bulan=",desimal_ke_derajat(azimuth_b)[3]+","+desimal_ke_derajat(azimuth_b)[2]+","+desimal_ke_derajat(azimuth_b)[1]);


    }


    public static int [] pengkonversi_alamah(double alamah){
        int yaum_alamah=(int)(alamah/24)%7;
        int saah_alamah= (int) (alamah%24);
        double qoh_alamah=(alamah%1)*60;
        double ni_alamah=Math.round((qoh_alamah%1)*60);
        return new int[]{0,yaum_alamah,saah_alamah,(int)qoh_alamah,(int)ni_alamah};
    }
    public  static  int[] pengkonversi_satuan_buruj(double selain_alamah){
        int buruj=(int)(selain_alamah/30)%12;
        int derajat= (int) (selain_alamah%30);
        double qoh=(selain_alamah%1)*60;
        double ni=Math.round((qoh%1)*60);
        return new int[]{0,buruj,derajat,(int)qoh,(int)ni};

    }
    public  static int []desimal_ke_derajat(double desimal){
        int jah=(int)desimal;
        double qoh=Math.abs((desimal%1)*60);
        double ni=Math.round((qoh%1)*60);
        return new int[]{0,jah,(int)qoh,(int)ni};
    }




}
