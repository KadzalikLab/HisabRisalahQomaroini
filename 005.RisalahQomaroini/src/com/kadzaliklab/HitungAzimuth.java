package com.kadzaliklab;

public class HitungAzimuth {

    public static double[] main(double miqwam, double hissoh, double irtifak, double ardulbalad) {
        //data - data yang dibutuhkan
        double miqwam_r=Math.toRadians(miqwam);
        double hissoh_r=Math.toRadians(hissoh);
        double ardulbalad_r=Math.toRadians(ardulbalad);

        //==================Mulai hisab======================\\
        double thulqomar=miqwam+irtifak;
        double thulqomar_r=Math.toRadians(thulqomar);

        double mailkulli=23.44444444;
        double mailkulli_r=Math.toRadians(mailkulli);

        double mel_syamsi=Math.toDegrees(Math.asin(Math.sin(miqwam_r)*Math.sin(mailkulli_r)));
        double mel_syamsi_r=Math.toRadians(mel_syamsi);
        double nisfu_qous_nahar=Math.toDegrees(Math.acos(Math.tan(mel_syamsi_r)*Math.tan(ardulbalad_r)));
        double takdil_matholi=Math.toDegrees(Math.asin(Math.cos(miqwam_r)/Math.cos(mel_syamsi_r)));
        double matholi_falakiyah=0;
        if (miqwam>=0 && miqwam<=180)matholi_falakiyah=180-takdil_matholi;
        else if (miqwam>=180 && miqwam<=270)matholi_falakiyah=360+takdil_matholi;
        else if (miqwam>=270 && miqwam<=360)matholi_falakiyah=takdil_matholi;

        double matholi_ghurub_syamsi=nisfu_qous_nahar+matholi_falakiyah;
        double siah_maghrib=Math.toDegrees(Math.asin(Math.sin(mel_syamsi_r)/Math.cos(ardulbalad_r)));
        double rumus_dq=0.808333333;
        double rumus_dq_r=Math.toRadians(rumus_dq);

        double daqoiq_tamkin=Math.toDegrees(Math.asin(Math.sin(rumus_dq_r)/Math.cos(ardulbalad_r)/Math.cos(mel_syamsi_r)));
        double ardulqomar=Math.toDegrees(Math.asin(Math.sin(hissoh_r)*Math.sin(Math.toRadians(5))));
        double ardulqomar_r=Math.toRadians(ardulqomar);
        double mel_tsani=Math.toDegrees(Math.atan(Math.sin(thulqomar_r)*Math.tan(mailkulli_r)));
        double ardul_muaddal=mel_tsani+ardulqomar;
        double bukdu_qomar=Math.toDegrees(Math.asin(Math.sin(Math.toRadians(ardul_muaddal))*Math.cos(mailkulli_r)/Math.cos(Math.toRadians(mel_tsani))));
        double bukdu_qomar_r=Math.toRadians(bukdu_qomar);
        double nisfu_qous_nahar_qomar=Math.toDegrees(Math.acos(Math.tan(ardulbalad_r)*Math.tan(bukdu_qomar_r)));
        double takdil_matholi_qomar=Math.toDegrees(Math.asin(Math.cos(thulqomar_r)*Math.cos(ardulqomar_r)/Math.cos(bukdu_qomar_r)));

        double matholi_falakiyah_qomar=0;
        if (miqwam>=0 && miqwam<=180)matholi_falakiyah_qomar=180-takdil_matholi_qomar;
        else if (miqwam>=180 && miqwam<=270)matholi_falakiyah_qomar=360+takdil_matholi_qomar;
        else if (miqwam>=270 && miqwam<=360)matholi_falakiyah_qomar=takdil_matholi_qomar;

        double matholi_ghurub_qomar=nisfu_qous_nahar_qomar+matholi_falakiyah_qomar;
        double qousil_muksi=matholi_ghurub_qomar-matholi_ghurub_syamsi;
        double qousil_muksi_mari=qousil_muksi-daqoiq_tamkin;
        double muksu_hilal=qousil_muksi_mari/15;
        double fadlu_dair=nisfu_qous_nahar_qomar-qousil_muksi_mari;
        double fadlu_dair_r=Math.toRadians(fadlu_dair);
        double irtifak_hilal=Math.toDegrees(Math.asin((Math.sin(ardulbalad_r)*Math.sin(bukdu_qomar_r))+(Math.cos(ardulbalad_r)*Math.cos(bukdu_qomar_r)*Math.cos(fadlu_dair_r))));
        double samtul_irtifak=Math.toDegrees(Math.atan((Math.tan(bukdu_qomar_r)*Math.cos(ardulbalad_r)/Math.sin(fadlu_dair_r))-(Math.sin(ardulbalad_r)*Math.tan(Math.toRadians(90-fadlu_dair)))));
        double bukdu_bain_samat_wasiah=samtul_irtifak-siah_maghrib;
        double qous_nurul_hilal=(irtifak/15)+(ardulqomar/60);


        return new double[]{0,siah_maghrib,samtul_irtifak};



    }


    
    
    
}
