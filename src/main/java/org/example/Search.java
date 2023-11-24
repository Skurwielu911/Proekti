package org.example;

import javax.swing.*;

public class Search
{
    public static void main(String[] args)
    {
        String recenica= JOptionPane.showInputDialog("Unesite recenicu");
        String rec= JOptionPane.showInputDialog("Unesite rec koju zelite da proverite");
        int brojPonavljanjaReci = getBrojPonavljanjaReci(recenica, rec);
        if(brojPonavljanjaReci==0)
        {
            String message = "Rec '"+rec+"' se ne pojavljuje u recenici :(";
            JOptionPane.showMessageDialog(null,message);
        }
        else if(brojPonavljanjaReci==1)
        {
            String message = "Rec '"+rec+"' se pojavljuje jednom u recenici :)";
            JOptionPane.showMessageDialog(null,message);
        }
        else
        {
            String message = "Rec '"+rec+"' se pojavljuje u navedenoj recenici "+brojPonavljanjaReci+" puta :)";
            JOptionPane.showMessageDialog(null,message);
        }
    }

    private static int getBrojPonavljanjaReci(String recenica, String rec) {
        int medja= recenica.length()- rec.length()+1;
        int brojPonavljanjaReci=0;
        String LCrecenica= recenica.toLowerCase();
        String LCrec= rec.toLowerCase();
        LABELA: for(int i=0;i<medja;i++)
        {
            for(int j = 0; j< rec.length(); j++)
            {
                char slovoRecenice= LCrecenica.charAt(i+j);
                char slovoReci= LCrec.charAt(j);
                if(slovoReci!=slovoRecenice)
                {
                    continue LABELA;
                }
            }
            brojPonavljanjaReci++;
        }
        return brojPonavljanjaReci;
    }
}
