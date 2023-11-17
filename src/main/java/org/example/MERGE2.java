package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MERGE2
{
    public static void main(String[] args)
    {
        int profit;
        int zarada=0;
        int brojPrveKugle;
        int brzinaPrikazivanja;
        int ulog;
        int igra;
        int samostalnoDaIliNe;
        int samostalnaBoja;
        int samostalnaParnost;
        int brojBojevaPoKombinaciji=0;
        int brojKombinacija=0;
        int i=0;
        int o=0;
        int p=0;
        int v=0;
        int l=0;
        int k;
        int brojUnosa;
        int[][] nizKombinacija;
        nizKombinacija = new int[10][10];
        Integer [][] nizDobijenihBrojevaIzKombinacija;
        nizDobijenihBrojevaIzKombinacija=new Integer [10][10];
        int[]dobijeneKvote=new int[10];
        List<String> listaBoja = new ArrayList<>();
        List<String> listaParnosti = new ArrayList<>();
        List<Integer> lista=new ArrayList<>();
        List<Integer>lista2=new ArrayList<>();
        List<Integer>lista3=new ArrayList<>();
        List<String> listaKvota = getIntegers();
        List<Integer> listaIzvucenihBrojeva = new ArrayList<>();





        System.out.println("=========================================================================================");
        System.out.println(" ");
        System.out.println("DOBRO DOSLI U GENERATOR NASUMICNIH IGARA ZA LUCKY6 ");
        System.out.println(" ");
        delay2000();
        System.out.println("Izaberite igru koju zelite da igrate (upisite broj)");
        System.out.println(" ");
        delay2000();
        System.out.println("1.Boja prve kugle");
        delay500();
        System.out.println("2.Parnost prvog broja");
        delay500();
        System.out.println("3.Kombinacije");
        System.out.println(" ");
        igra = new Scanner(System.in).nextInt();
        System.out.println(" ");
        switch (igra)
        {
            case 1:
                System.out.println("Da li zelite sami da unesete boju ili zelite nasumicnu?");
                System.out.println(" ");
                delay1000();
                System.out.println("1.Zelim sam da unesem boju");
                delay500();
                System.out.println("2.Zelim nasumicnu boju");
                System.out.println(" ");
                samostalnoDaIliNe=new Scanner(System.in).nextInt();
                System.out.println(" ");
                switch (samostalnoDaIliNe)
                {
                    case 1:
                        System.out.println("Unesite svoju zeljenu boju:");
                        System.out.println(" ");
                        delay1000();
                        System.out.println("1.Crvena");
                        System.out.println("2.Zelena");
                        System.out.println("3.Plava");
                        System.out.println("4.Ljubicasta");
                        System.out.println("5.Braon");
                        System.out.println("6.Zuta");
                        System.out.println("7.narandzasta");
                        System.out.println("8.Crna");
                        System.out.println(" ");
                        samostalnaBoja=new Scanner(System.in).nextInt();
                        System.out.println(" ");
                        listaBoja.add("Crvena");
                        listaBoja.add("Zelena");
                        listaBoja.add("Plava");
                        listaBoja.add("Ljubicasta");
                        listaBoja.add("Braon");
                        listaBoja.add("Zuta");
                        listaBoja.add("Narandzasta");
                        listaBoja.add("Crna");
                        System.out.println("Vasa boja prvog broja je: "+listaBoja.get(samostalnaBoja-1));
                        break;
                    case 2:
                        listaBoja.add("Crvena");
                        listaBoja.add("Zelena");
                        listaBoja.add("Plava");
                        listaBoja.add("Ljubicasta");
                        listaBoja.add("Braon");
                        listaBoja.add("Zuta");
                        listaBoja.add("Narandzasta");
                        listaBoja.add("Crna");
                        Collections.shuffle(listaBoja);
                        System.out.println("Vasa nasumicna boja je : "+listaBoja.get(0));
                        break;
                    default:
                        System.out.println(" ");
                        System.out.println("Uneli ste pogresnu komandu!");
                        delay1000();
                        System.out.println("Pokusajte ponovo :(");
                        System.out.println(" ");
                        System.out.println("=========================================================================================");
                        System.exit(0);
                }
                break;
            case 2:
                System.out.println("Da li zelite sami da unesete parnost ili zelite nasumicnu parnost prvog broja?");
                System.out.println(" ");
                delay1000();
                System.out.println("1.Zelim sam da unesem parnost prvog broja");
                delay500();
                System.out.println("2.Zelim nasumicnu parnost prvog broja");
                System.out.println(" ");
                samostalnoDaIliNe=new Scanner(System.in).nextInt();
                switch (samostalnoDaIliNe)
                {
                    case 1:
                        System.out.println("Unesite svoju zeljenu parnost prvog broja");
                        System.out.println(" ");
                        delay1000();
                        System.out.println("1.Paran");
                        delay500();
                        System.out.println("2.Neparan");
                        System.out.println(" ");
                        samostalnaParnost=new Scanner(System.in).nextInt();
                        System.out.println(" ");
                        listaParnosti.add("Paran");
                        listaParnosti.add("Neparan");
                        System.out.println("Parnost Vaseg prvog nasumicnog broja je : "+listaParnosti.get(samostalnaParnost-1));
                        break;
                    case 2:
                        listaParnosti.add("Paran");
                        listaParnosti.add("Neparan");
                        Collections.shuffle(listaParnosti);
                        System.out.println(" ");
                        System.out.println("Parnost Vaseg prvog nasumicnog broja je : "+listaParnosti.get(0));
                        break;
                    default:
                        System.out.println(" ");
                        System.out.println("Uneli ste pogresnu komandu!");
                        delay1000();
                        System.out.println("Pokusajte ponovo :(");
                        System.out.println(" ");
                        System.out.println("=========================================================================================");
                        System.exit(0);
                }
                break;
            case 3:
                System.out.println("Upisite koliko zelite brojeva po kombinaciji (6-10)");
                System.out.println(" ");
                brojBojevaPoKombinaciji=new Scanner(System.in).nextInt();
                System.out.println(" ");
                System.out.println("Unesite koliko zelite kombinacija (1-10)");
                System.out.println(" ");
                brojKombinacija=new Scanner(System.in).nextInt();
                System.out.println(" ");
                System.out.println("Da li zelite sami da unesete kombinacije ili zelite nasumicne kombinacije brojeva");
                System.out.println(" ");
                delay1000();
                System.out.println("1.Zelim sam da unesem kombinacije");
                delay500();
                System.out.println("2.Zelim nasumicne kombinacije brojeva");
                System.out.println(" ");
                samostalnoDaIliNe=new Scanner(System.in).nextInt();
                System.out.println(" ");
                switch (samostalnoDaIliNe)
                {
                    case 1:
                        while (i<brojKombinacija)
                        {
                            System.out.println("Unesi "+(i+1)+" kombinaciju:");
                            while(o<brojBojevaPoKombinaciji)
                            {
                                brojUnosa = new Scanner(System.in).nextInt();
                                while (p<brojBojevaPoKombinaciji)
                                {
                                    if(brojUnosa==nizKombinacija[i][p])
                                    {
                                        System.out.println("Uneli ste iste brojeve!");
                                        System.out.println(" ");
                                        System.out.println("=========================================================================================");
                                        System.exit(0);
                                    }
                                    p++;
                                }
                                if(brojUnosa<1||brojUnosa>48)
                                {
                                    System.out.println("Uneli ste nevazece brojeve!");
                                    System.out.println(" ");
                                    System.out.println("=========================================================================================");
                                    System.exit(0);
                                }
                                nizKombinacija[i][o] = brojUnosa;
                                o++;
                                p=0;
                            }
                            o=0;
                            i++;
                        }
                        i=0;
                        while(i<brojKombinacija)
                        {
                            if (i<9)
                            {
                                System.out.print("Kombinacija broj " + (i + 1) + ":     ");
                            }
                            else
                            {
                                System.out.print("Kombinacija broj " + (i + 1) + ":    ");
                            }
                            while(o<brojBojevaPoKombinaciji)
                            {
                                lista3.add(nizKombinacija[i][o]);
                                o++;
                            }
                            o=0;
                            Collections.sort(lista3);
                            while(o<brojBojevaPoKombinaciji)
                            {
                                if(o<brojBojevaPoKombinaciji-1)
                                {
                                    System.out.print(lista3.get(o) + ", ");
                                }
                                else
                                {
                                    System.out.print(lista3.get(o) + " ");
                                }
                                o++;
                            }
                            lista3.clear();
                            System.out.println(" ");
                            i++;
                            o=0;
                        }
                        break;
                    case 2:
                        while (i<brojKombinacija)
                        {
                            if (i<9)
                            {
                                System.out.print("Kombinacija broj " + (i + 1) + ":     ");
                            }
                            else
                            {
                                System.out.print("Kombinacija broj " + (i + 1) + ":    ");
                            }
                            for (int a = 1; a < 49; a++) lista.add(a);
                            Collections.shuffle(lista);
                            for (int s = 0; s < brojBojevaPoKombinaciji; s++) lista2.add(lista.get(s));
                            Collections.sort(lista2);
                            while(o<brojBojevaPoKombinaciji)
                            {
                                nizKombinacija[i][o]=lista2.get(o);
                                if(o<(brojBojevaPoKombinaciji-1))
                                {
                                    System.out.print(nizKombinacija[i][o] + ", ");
                                }
                                else
                                {
                                    System.out.print(nizKombinacija[i][o]);
                                }
                                o++;
                            }
                            System.out.println(" ");
                            lista.clear();
                            lista2.clear();
                            i++;
                            o=0;
                        }
                    break;
                }
                break;
            default:
                System.out.println(" ");
                System.out.println("Uneli ste pogresnu komandu!");
                delay1000();
                System.out.println("Pokusajte ponovo :(");
                System.out.println(" ");
                System.out.println("=========================================================================================");
                System.exit(0);
        }
        System.out.println(" ");
        System.out.println("Unesite ulog po kombinaciji (30 din - 1000 din)");
        System.out.println(" ");
        ulog=new Scanner(System.in).nextInt();
        if(ulog<30||ulog>1000)
        {
            System.out.println("Uneli ste nevazeci ulog!");
            delay1000();
            System.out.println("Pokusajte ponovo :(");
            System.out.println(" ");
            System.out.println("=========================================================================================");
            System.exit(0);
        }
        System.out.println(" ");
        System.out.println("Unesite brzinu prikazivanja brojeva (500 ms - 5000 ms)");
        System.out.println(" ");
        brzinaPrikazivanja=new Scanner(System.in).nextInt();
        if(brzinaPrikazivanja<500||brzinaPrikazivanja>5000)
        {
            System.out.println("Uneli ste nevazecu brzinu!");
            delay1000();
            System.out.println("Pokusajte ponovo :(");
            System.out.println(" ");
            System.out.println("=========================================================================================");
            System.exit(0);
        }
        System.out.println(" ");
        System.out.println("=========================================================================================");
        System.out.println(" ");
        System.out.println("IGRA CE USKORO POCETI!");
        System.out.println(" ");
        delay2000();
        odbrojavanje();
        System.out.println(" ");
        System.out.println("SRECNO!");
        System.out.println(" ");
        System.out.println("=========================================================================================");
        System.out.println(" ");
        delay1000();
        System.out.println("IZVLACENJE BROJEVA");
        System.out.println(" ");
        delay1000();
        i=0;
        for (int d = 1; d < 49; d++) listaIzvucenihBrojeva.add(d);
        Collections.shuffle(listaIzvucenihBrojeva);
        while(l<35)
        {
            System.out.println("("+listaKvota.get(l)+")  "+listaIzvucenihBrojeva.get(l));
            try {
                Thread.sleep(brzinaPrikazivanja);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while(i<brojKombinacija)
            {
                while(o<brojBojevaPoKombinaciji)
                {
                    if(nizKombinacija[i][o]==listaIzvucenihBrojeva.get(l))
                    {
                        nizDobijenihBrojevaIzKombinacija[i][o]=listaIzvucenihBrojeva.get(l);
                        while(p<brojBojevaPoKombinaciji)
                        {
                            if(nizDobijenihBrojevaIzKombinacija[i][p]!=null)
                            {
                                v++;
                            }
                            p++;
                        }
                        if(v==brojBojevaPoKombinaciji)
                        {
                            k=Integer.parseInt(listaKvota.get(l));
                            dobijeneKvote[i]=k;
                        }
                        v=0;
                        p=0;
                    }
                    o++;
                }

                o=0;
                i++;
            }
            i=0;
            l++;
        }
        System.out.println(" ");
        System.out.println("KRAJ IZVLACENJA");
        System.out.println(" ");
        System.out.println("=========================================================================================");
        delay1000();
        System.out.println(" ");
        System.out.println("Rezultati za igru su sledeci:");
        System.out.println(" ");
        delay1000();
        brojPrveKugle = listaIzvucenihBrojeva.get(0);
        switch (brojPrveKugle)
        {
            case 1:
            case 9:
            case 17:
            case 25:
            case 33:
            case 41:
                System.out.println("Boja prve kugle : Crvena");
                break;
            case 2:
            case 10:
            case 18:
            case 26:
            case 34:
            case 42:
                System.out.println("Boja prve kugle : Zelena");
                break;
            case 3:
            case 11:
            case 19:
            case 27:
            case 35:
            case 43:
                System.out.println("Boja prve kugle : Plava");
                break;
            case 4:
            case 12:
            case 20:
            case 28:
            case 36:
            case 44:
                System.out.println("Boja prve kugle : Ljubicasta");
                break;
            case 5:
            case 13:
            case 21:
            case 29:
            case 37:
            case 45:
                System.out.println("Boja prve kugle : Braon");
                break;
            case 6:
            case 14:
            case 22:
            case 30:
            case 38:
            case 46:
                System.out.println("Boja prve kugle : Zuta");
                break;
            case 7:
            case 15:
            case 23:
            case 31:
            case 39:
            case 47:
                System.out.println("Boja prve kugle : Narandzasta");
                break;
            case 8:
            case 16:
            case 24:
            case 32:
            case 40:
            case 48:
                System.out.println("Boja prve kugle : Crna");
                break;
        }
        delay1000();
        if(brojPrveKugle%2==0)
        {
            System.out.println("Parnost prvog broja : Paran");
        }
        else
        {
            System.out.println("Parnost prvog broja : Neparan");
        }
        System.out.println(" ");
        delay1000();
        while (i<brojKombinacija)
        {
            if(i<brojKombinacija-1)
            {
                System.out.print("Dobitni brojevi " + (i + 1) + ". kombinacije su:   ");
            }
            else
            {
                System.out.print("Dobitni brojevi " + (i + 1) + ". kombinacije su:  ");
            }
            while(o<brojBojevaPoKombinaciji)
            {
                if(nizDobijenihBrojevaIzKombinacija[i][o]!=null)
                {
                    if (o < brojBojevaPoKombinaciji - 1) {
                        System.out.print(nizDobijenihBrojevaIzKombinacija[i][o] + ", ");
                    } else {
                        System.out.print(nizDobijenihBrojevaIzKombinacija[i][o]);
                    }
                    p=p+1;

                }
                o++;
            }
            if(p==brojBojevaPoKombinaciji)
            {
                System.out.print("  DOBITAN");
            }
            else
            {
                System.out.print("  GUBITAN");
            }
            o=0;
            p=0;
            System.out.println();
            i++;
            delay1000();
        }
        System.out.println(" ");
        i=0;
        while(i<brojKombinacija)
        {
            if(dobijeneKvote[i]>0)
            {
                System.out.println("Dobitak za kombinaciju broj "+(i+1)+". sa kvotom ("+dobijeneKvote[i]+") iznosi: "+(ulog*dobijeneKvote[i]));
                zarada=zarada+(ulog*dobijeneKvote[i]);
                delay500();
            }
            i++;
        }
        delay500();
        System.out.println(" ");
        System.out.println("Vas ukupan dobitak iz kombinacija : "+zarada);
        delay1000();
        System.out.println("Vas ukupan ulog za sve kombinacije : "+(ulog*brojKombinacija));
        delay1000();
        System.out.println();
        profit=zarada-(ulog*brojKombinacija);
        if(profit>0)
        {
            System.out.println("Cestitamo, u profitu ste "+profit+" dinara!");
        }
        else if (profit==0)
        {
            System.out.println("Vratili ste isti iznos uloga, pokusajte opet?");
        }
        else
        {
            System.out.println("Izgubili ste "+(profit*(-1))+" dinara. Vise srece drugi put :(");
        }
        System.out.println();
        delay1000();
        System.out.println("=========================================================================================");
        System.out.println();
        System.out.println("Hvala vam na igranju, dodjite nam ponovo :)");
        System.out.println(" ");
        System.out.println("=========================================================================================");
        System.out.println("""
                ⣿⣿⣿⠟⠛⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢋⣩⣉⢻⣿⣿
                ⣿⣿⣿⠀⣿⣶⣕⣈⠹⠿⠿⠿⠿⠟⠛⣛⢋⣰⠣⣿⣿⠀⣿⣿
                ⣿⣿⣿⡀⣿⣿⣿⣧⢻⣿⣶⣷⣿⣿⣿⣿⣿⣿⠿⠶⡝⠀⣿⣿
                ⣿⣿⣿⣷⠘⣿⣿⣿⢏⣿⣿⣋⣀⣈⣻⣿⣿⣷⣤⣤⣿⡐⢿⣿
                ⣿⣿⣿⣿⣆⢩⣝⣫⣾⣿⣿⣿⣿⡟⠿⠿⠦⠀⠸⠿⣻⣿⡄⢻
                ⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣾⣿⣿⣿⣿⠇⣼
                ⣿⣿⣿⣿⣿⣿⡄⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣰⣿
                ⣿⣿⣿⣿⣿⣿⠇⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢀⣿⣿
                ⣿⣿⣿⣿⣿⠏⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿⣿
                ⣿⣿⣿⣿⠟⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣿⣿
                ⣿⣿⣿⠋⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⣿⣿
                ⣿⣿⠋⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿""");
        System.out.println("=========================================================================================");
    }
    private static void delay500()
    {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private static void delay1000()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private static void delay2000()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private static List<String> getIntegers() {
        List<String> listaKvota = new ArrayList<>();
        listaKvota.add("PB1");
        listaKvota.add("PB2");
        listaKvota.add("PB3");
        listaKvota.add("PB4");
        listaKvota.add("PB5");
        listaKvota.add(String.valueOf(10000));
        listaKvota.add(String.valueOf(7500));
        listaKvota.add(String.valueOf(5000));
        listaKvota.add(String.valueOf(2500));
        listaKvota.add(String.valueOf(1000));
        listaKvota.add(String.valueOf(500));
        listaKvota.add(String.valueOf(300));
        listaKvota.add(String.valueOf(200));
        listaKvota.add(String.valueOf(150));
        listaKvota.add(String.valueOf(100));
        listaKvota.add(String.valueOf(90));
        listaKvota.add(String.valueOf(80));
        listaKvota.add(String.valueOf(70));
        listaKvota.add(String.valueOf(60));
        listaKvota.add(String.valueOf(50));
        listaKvota.add(String.valueOf(40));
        listaKvota.add(String.valueOf(30));
        listaKvota.add(String.valueOf(25));
        listaKvota.add(String.valueOf(20));
        listaKvota.add(String.valueOf(15));
        listaKvota.add(String.valueOf(10));
        listaKvota.add(String.valueOf(9));
        listaKvota.add(String.valueOf(8));
        listaKvota.add(String.valueOf(7));
        listaKvota.add(String.valueOf(6));
        listaKvota.add(String.valueOf(5));
        listaKvota.add(String.valueOf(4));
        listaKvota.add(String.valueOf(3));
        listaKvota.add(String.valueOf(2));
        listaKvota.add(String.valueOf(1));
        return listaKvota;
    }
    private static void odbrojavanje()
    {
        System.out.println(10);
        delay1000();
        System.out.println(9);
        delay1000();
        System.out.println(8);
        delay1000();
        System.out.println(7);
        delay1000();
        System.out.println(6);
        delay1000();
        System.out.println(5);
        delay1000();
        System.out.println(4);
        delay1000();
        System.out.println(3);
        delay1000();
        System.out.println(2);
        delay1000();
        System.out.println(1);
        delay1000();
    }
}
