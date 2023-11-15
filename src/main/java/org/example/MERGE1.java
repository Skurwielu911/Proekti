package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MERGE1
{
    public static void main(String[] args) {
        List<Integer>lista = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        List<Integer> lista4= new ArrayList<>();
        List<Integer> listaDobijenihBrojeva=new ArrayList<>();
        int ulog;
        System.out.println("=========================================================================================");
        System.out.println(" ");
        System.out.println("DOBRO DOSLI U GENERATOR NASUMICNIH IGARA ZA LUCKY6 ");
        System.out.println(" ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Izaberite igru koju zelite da igrate (upisite broj)");
        System.out.println(" ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("1.Boja prve kugle");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("2.Parnost prvog broja");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("3.Kombinacije");
        System.out.println(" ");
        int igra = new Scanner(System.in).nextInt();
        System.out.println(" ");
        System.out.println("=========================================================================================");
        System.out.println(" ");
        int brojNasumicnihBrojeva=0;
        if (igra>3 || igra<1)
        {
            System.out.println("Uneli ste pogresnu igru!");
            System.out.println(" ");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Pokusajte ponovo :'(");
        }
        else if (igra==1)
        {
            List<String> listaBoja = new ArrayList<>();
            listaBoja.add("Crvena");
            listaBoja.add("Zelena");
            listaBoja.add("Plava");
            listaBoja.add("Ljubicasta");
            listaBoja.add("Braon");
            listaBoja.add("Zuta");
            listaBoja.add("Narandzasta");
            listaBoja.add("Crna");
            Collections.shuffle(listaBoja);
            int boja=0;
            System.out.println("Vasa nasumicna boja je : 2"+listaBoja.get(boja));
        }
        else if (igra==2)
        {
            List<String> listaParnosti = new ArrayList<>();
            listaParnosti.add("Paran");
            listaParnosti.add("Neparan");
            Collections.shuffle(listaParnosti);
            int parnost=0;
            System.out.println("Parnost Vaseg prvog nasumicnog broja je : "+listaParnosti.get(parnost));


        }
        else
        {
            System.out.println("Upisite koliko zelite nasumicnih brojeva po kombinaciji (6-10)");
            System.out.println(" ");
            brojNasumicnihBrojeva = new Scanner(System.in).nextInt();
            System.out.println(" ");
            if(brojNasumicnihBrojeva>10 || brojNasumicnihBrojeva<6)
            {
                System.out.println("Uneli ste pogresan broj!");
                System.out.println(" ");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Dostupni brojevi su 6,7,8,9 i 10");
                System.out.println(" ");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Pokusajte ponovo :'(");
            }
            else
            {
                System.out.println("Upisite koliko zelite ukupno kombinacija (1-10)");
                System.out.println(" ");
                int brojNasumicnihKombinacija = new Scanner(System.in).nextInt();
                System.out.println(" ");
                if (brojNasumicnihKombinacija > 10) {
                    System.out.println("UNELI STE PREVISE KOMBINACIJA!");
                    System.out.println(" ");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Minimalan broj kombinacija je 1, a maksimalan 10");
                    System.out.println(" ");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Pokusajte ponovo :'(");
                }
                else if (brojNasumicnihKombinacija < 1)
                {
                    System.out.println("UNELI STE PREMALO KOMBINACIJA!");
                    System.out.println(" ");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Minimalan broj kombinacija je 1, a maksimalan )");
                    System.out.println(" ");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Pokusajte ponovo :'(");
                }
                else
                {
                    int b = 0;
                    if (brojNasumicnihBrojeva == 6) {
                        while (b < brojNasumicnihKombinacija) {
                            for (int i = 1; i < 49; i++) lista.add(i);
                            Collections.shuffle(lista);
                            for (int a = 0; a < 6; a++) lista2.add(lista.get(a));
                            Collections.sort(lista2);
                            if (brojNasumicnihKombinacija == 1) {
                                System.out.println("Vasi nasumicni brojevi su: " + lista2);
                            } else {
                                System.out.println("Kombinacija " + (b + 1) + " :" + lista2);
                            }
                            b++;
                        }
                    } else if (brojNasumicnihBrojeva == 7) {
                        while (b < brojNasumicnihKombinacija) {
                            for (int i = 1; i < 49; i++) lista.add(i);
                            Collections.shuffle(lista);
                            for (int a = 0; a < 7; a++) lista2.add(lista.get(a));
                            Collections.sort(lista2);
                            if (brojNasumicnihKombinacija == 1) {
                                System.out.println("Vasi nasumicni brojevi su: " + lista2);
                            } else {
                                System.out.println("Kombinacija " + (b + 1) + " :" + lista2);
                            }
                            b++;
                        }
                    } else if (brojNasumicnihBrojeva == 8) {
                        while (b < brojNasumicnihKombinacija) {
                            for (int i = 1; i < 49; i++) lista.add(i);
                            Collections.shuffle(lista);
                            for (int a = 0; a < 8; a++) lista2.add(lista.get(a));
                            Collections.sort(lista2);
                            if (brojNasumicnihKombinacija == 1) {
                                System.out.println("Vasi nasumicni brojevi su: " + lista2);
                            } else {
                                System.out.println("Kombinacija " + (b + 1) + " :" + lista2);
                            }
                            b++;
                        }
                    } else if (brojNasumicnihBrojeva == 9) {
                        while (b < brojNasumicnihKombinacija) {
                            for (int i = 1; i < 49; i++) lista.add(i);
                            Collections.shuffle(lista);
                            for (int a = 0; a < 9; a++) lista2.add(lista.get(a));
                            Collections.sort(lista2);
                            if (brojNasumicnihKombinacija == 1) {
                                System.out.println("Vasi nasumicni brojevi su: " + lista2);
                            } else {
                                System.out.println("Kombinacija " + (b + 1) + " :" + lista2);
                            }
                            b++;
                        }
                    } else {
                        while (b < brojNasumicnihKombinacija) {
                            for (int i = 1; i < 49; i++) lista.add(i);
                            Collections.shuffle(lista);
                            for (int a = 0; a < 10; a++) lista2.add(lista.get(a));
                            Collections.sort(lista2);
                            if (brojNasumicnihKombinacija == 1) {
                                System.out.println("Vasi nasumicni brojevi su: " + lista2);
                            } else {
                                System.out.println("Kombinacija " + (b + 1) + " :" + lista2);
                            }
                            b++;
                        }
                    }
                }

            }
        }
        System.out.println(" ");
        System.out.println("Izaberite vas ulog (30 din-1000 din)");
        System.out.println(" ");
        ulog=new Scanner(System.in).nextInt();
        System.out.println(" ");
        if(ulog<30){System.out.println("Vas ulog je premali, pokusajte ponovo!");}
        else if(ulog>1000){System.out.println("Vas ulog je previsok, pokusajte ponovo!");}
        else {
            System.out.println(" ");
            System.out.println("=========================================================================================");
            System.out.println(" ");
            System.out.println("Izaberite brzinu prikazivanja brojeva (500-5000)");
            System.out.println(" ");
            int brzina = new Scanner(System.in).nextInt();
            System.out.println(" ");
            if (brzina > 5000 || brzina < 500) {
                System.out.println("Uneli ste pogresnu brzinu, pokusajte ponovo");
            } else {
                System.out.println("Igra ce uskoro poceti!");
                System.out.println(" ");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("10");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("9");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("8");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("7");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("6");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("5");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("4");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("3");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(" ");
                System.out.println("SRECNO!");
                System.out.println(" ");


                List<Integer> listaBrojeva = new ArrayList<>();
                List<Integer> listaKvota = getIntegers();
                if (brojNasumicnihBrojeva == 6) {
                    for (int i = 1; i < 49; i++) listaBrojeva.add(i);
                    Collections.shuffle(listaBrojeva);
                    int i = 0;
                    int pb = 1;
                    int v = 0;
                    while (i < 5) {
                        System.out.println("PB" + pb + " " + listaBrojeva.get(i));
                        i++;
                        pb++;
                        while (v < 6) {
                            int nn1 = lista2.get(v);
                            int nn2 = listaBrojeva.get(i - 1);
                            if (nn1 == nn2) {
                                listaDobijenihBrojeva.add(nn2);
                                lista4.add(0);
                            }
                            v++;
                        }
                        v = 0;
                        try {
                            Thread.sleep(brzina);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    while (i < 35) {
                        System.out.println("(" + listaKvota.get(i - 5) + ") " + listaBrojeva.get(i));
                        i++;
                        while (v < 6) {
                            int nn1 = lista2.get(v);
                            int nn2 = listaBrojeva.get(i - 1);
                            int nn3 = listaKvota.get(i - 6);
                            if (nn1 == nn2) {
                                listaDobijenihBrojeva.add(nn2);
                                lista4.add(nn3);
                            }
                            v++;
                        }
                        v = 0;
                        try {
                            Thread.sleep(brzina);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(" ");
                    System.out.println("IGRA JE ZAVRSENA!");
                    System.out.println(" ");
                    System.out.println("=========================================================================================");
                } else if (brojNasumicnihBrojeva == 7) {
                    for (int i = 1; i < 49; i++) listaBrojeva.add(i);
                    Collections.shuffle(listaBrojeva);
                    int i = 0;
                    int pb = 1;
                    int v = 0;
                    while (i < 5) {
                        System.out.println("PB" + pb + " " + listaBrojeva.get(i));
                        i++;
                        pb++;
                        while (v < 7) {
                            int nn1 = lista2.get(v);
                            int nn2 = listaBrojeva.get(i - 1);
                            if (nn1 == nn2) {
                                listaDobijenihBrojeva.add(nn2);
                                lista4.add(0);
                            }
                            v++;
                        }
                        v = 0;
                        try {
                            Thread.sleep(brzina);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    while (i < 35) {
                        System.out.println("(" + listaKvota.get(i - 5) + ") " + listaBrojeva.get(i));
                        i++;
                        while (v < 7) {
                            int nn1 = lista2.get(v);
                            int nn2 = listaBrojeva.get(i - 1);
                            int nn3 = listaKvota.get(i - 6);
                            if (nn1 == nn2) {
                                listaDobijenihBrojeva.add(nn2);
                                lista4.add(nn3);
                            }
                            v++;
                        }
                        v = 0;
                        try {
                            Thread.sleep(brzina);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(" ");
                    System.out.println("IGRA JE ZAVRSENA!");
                    System.out.println(" ");
                    System.out.println("=========================================================================================");
                } else if (brojNasumicnihBrojeva == 8) {
                    for (int i = 1; i < 49; i++) listaBrojeva.add(i);
                    Collections.shuffle(listaBrojeva);
                    int i = 0;
                    int pb = 1;
                    int v = 0;
                    while (i < 5) {
                        System.out.println("PB" + pb + " " + listaBrojeva.get(i));
                        i++;
                        pb++;
                        while (v < 8) {
                            int nn1 = lista2.get(v);
                            int nn2 = listaBrojeva.get(i - 1);
                            if (nn1 == nn2) {
                                listaDobijenihBrojeva.add(nn2);
                                lista4.add(0);
                            }
                            v++;
                        }
                        v = 0;
                        try {
                            Thread.sleep(brzina);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    while (i < 35) {
                        System.out.println("(" + listaKvota.get(i - 5) + ") " + listaBrojeva.get(i));
                        i++;
                        while (v < 8) {
                            int nn1 = lista2.get(v);
                            int nn2 = listaBrojeva.get(i - 1);
                            int nn3 = listaKvota.get(i - 6);
                            if (nn1 == nn2) {
                                listaDobijenihBrojeva.add(nn2);
                                lista4.add(nn3);
                            }
                            v++;
                        }
                        v = 0;
                        try {
                            Thread.sleep(brzina);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(" ");
                    System.out.println("IGRA JE ZAVRSENA!");
                    System.out.println(" ");
                    System.out.println("=========================================================================================");
                } else if (brojNasumicnihBrojeva == 9) {
                    for (int i = 1; i < 49; i++) listaBrojeva.add(i);
                    Collections.shuffle(listaBrojeva);
                    int i = 0;
                    int pb = 1;
                    int v = 0;
                    while (i < 5) {
                        System.out.println("PB" + pb + " " + listaBrojeva.get(i));
                        i++;
                        pb++;
                        while (v < 9) {
                            int nn1 = lista2.get(v);
                            int nn2 = listaBrojeva.get(i - 1);
                            if (nn1 == nn2) {
                                listaDobijenihBrojeva.add(nn2);
                                lista4.add(0);
                            }
                            v++;
                        }
                        v = 0;
                        try {
                            Thread.sleep(brzina);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    while (i < 35) {
                        System.out.println("(" + listaKvota.get(i - 5) + ") " + listaBrojeva.get(i));
                        i++;
                        while (v < 9) {
                            int nn1 = lista2.get(v);
                            int nn2 = listaBrojeva.get(i - 1);
                            int nn3 = listaKvota.get(i - 6);
                            if (nn1 == nn2) {
                                listaDobijenihBrojeva.add(nn2);
                                lista4.add(nn3);
                            }
                            v++;
                        }
                        v = 0;
                        try {
                            Thread.sleep(brzina);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(" ");
                    System.out.println("IGRA JE ZAVRSENA!");
                    System.out.println(" ");
                    System.out.println("=========================================================================================");
                } else {
                    for (int i = 1; i < 49; i++) listaBrojeva.add(i);
                    Collections.shuffle(listaBrojeva);
                    int i = 0;
                    int pb = 1;
                    int v = 0;
                    while (i < 5) {
                        System.out.println("PB" + pb + " " + listaBrojeva.get(i));
                        i++;
                        pb++;
                        while (v < 10) {
                            int nn1 = lista2.get(v);
                            int nn2 = listaBrojeva.get(i - 1);
                            if (nn1 == nn2) {
                                listaDobijenihBrojeva.add(nn2);
                                lista4.add(0);
                            }
                            v++;
                        }
                        v = 0;
                        try {
                            Thread.sleep(brzina);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    while (i < 35) {
                        System.out.println("(" + listaKvota.get(i - 5) + ") " + listaBrojeva.get(i));
                        i++;
                        while (v < 10) {
                            int nn1 = lista2.get(v);
                            int nn2 = listaBrojeva.get(i - 1);
                            int nn3 = listaKvota.get(i - 6);
                            if (nn1 == nn2) {
                                listaDobijenihBrojeva.add(nn2);
                                lista4.add(nn3);
                            }
                            v++;
                        }
                        v = 0;
                        try {
                            Thread.sleep(brzina);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(" ");
                    System.out.println("IGRA JE ZAVRSENA!");
                    System.out.println(" ");
                    System.out.println("=========================================================================================");
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(" ");
                System.out.println("Rezultati za igru su sledeci:");
                System.out.println(" ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int bojaKuglePrvogBroja = listaBrojeva.get(0);
                if (bojaKuglePrvogBroja == 1) {
                    System.out.println("Boja prve kugle: Crvena");
                } else if (bojaKuglePrvogBroja == 9) {
                    System.out.println("Boja prve kugle: Crvena");
                } else if (bojaKuglePrvogBroja == 17) {
                    System.out.println("Boja prve kugle: Crvena");
                } else if (bojaKuglePrvogBroja == 25) {
                    System.out.println("Boja prve kugle: Crvena");
                } else if (bojaKuglePrvogBroja == 33) {
                    System.out.println("Boja prve kugle: Crvena");
                } else if (bojaKuglePrvogBroja == 41) {
                    System.out.println("Boja prve kugle: Crvena");
                } else if (bojaKuglePrvogBroja == 2) {
                    System.out.println("Boja prve kugle: Zelena");
                } else if (bojaKuglePrvogBroja == 10) {
                    System.out.println("Boja prve kugle: Zelena");
                } else if (bojaKuglePrvogBroja == 18) {
                    System.out.println("Boja prve kugle: Zelena");
                } else if (bojaKuglePrvogBroja == 26) {
                    System.out.println("Boja prve kugle: Zelena");
                } else if (bojaKuglePrvogBroja == 34) {
                    System.out.println("Boja prve kugle: Zelena");
                } else if (bojaKuglePrvogBroja == 42) {
                    System.out.println("Boja prve kugle: Zelena");
                } else if (bojaKuglePrvogBroja == 3) {
                    System.out.println("Boja prve kugle: Plava");
                } else if (bojaKuglePrvogBroja == 11) {
                    System.out.println("Boja prve kugle: Plava");
                } else if (bojaKuglePrvogBroja == 19) {
                    System.out.println("Boja prve kugle: Plava");
                } else if (bojaKuglePrvogBroja == 27) {
                    System.out.println("Boja prve kugle: Plava");
                } else if (bojaKuglePrvogBroja == 35) {
                    System.out.println("Boja prve kugle: Plava");
                } else if (bojaKuglePrvogBroja == 43) {
                    System.out.println("Boja prve kugle: Plava");
                } else if (bojaKuglePrvogBroja == 4) {
                    System.out.println("Boja prve kugle: Ljubicasta");
                } else if (bojaKuglePrvogBroja == 12) {
                    System.out.println("Boja prve kugle: Ljubicasta");
                } else if (bojaKuglePrvogBroja == 20) {
                    System.out.println("Boja prve kugle: Ljubicasta");
                } else if (bojaKuglePrvogBroja == 28) {
                    System.out.println("Boja prve kugle: Ljubicasta");
                } else if (bojaKuglePrvogBroja == 36) {
                    System.out.println("Boja prve kugle: Ljubicasta");
                } else if (bojaKuglePrvogBroja == 44) {
                    System.out.println("Boja prve kugle: Ljubicasta");
                } else if (bojaKuglePrvogBroja == 5) {
                    System.out.println("Boja prve kugle: Braon");
                } else if (bojaKuglePrvogBroja == 13) {
                    System.out.println("Boja prve kugle: Braon");
                } else if (bojaKuglePrvogBroja == 21) {
                    System.out.println("Boja prve kugle: Braon");
                } else if (bojaKuglePrvogBroja == 29) {
                    System.out.println("Boja prve kugle: Braon");
                } else if (bojaKuglePrvogBroja == 37) {
                    System.out.println("Boja prve kugle: Braon");
                } else if (bojaKuglePrvogBroja == 45) {
                    System.out.println("Boja prve kugle: Braon");
                } else if (bojaKuglePrvogBroja == 6) {
                    System.out.println("Boja prve kugle: Zuta");
                } else if (bojaKuglePrvogBroja == 14) {
                    System.out.println("Boja prve kugle: Zuta");
                } else if (bojaKuglePrvogBroja == 22) {
                    System.out.println("Boja prve kugle: Zuta");
                } else if (bojaKuglePrvogBroja == 30) {
                    System.out.println("Boja prve kugle: Zuta");
                } else if (bojaKuglePrvogBroja == 38) {
                    System.out.println("Boja prve kugle: Zuta");
                } else if (bojaKuglePrvogBroja == 46) {
                    System.out.println("Boja prve kugle: Zuta");
                } else if (bojaKuglePrvogBroja == 7) {
                    System.out.println("Boja prve kugle: Narandzasta");
                } else if (bojaKuglePrvogBroja == 15) {
                    System.out.println("Boja prve kugle: Narandzasta");
                } else if (bojaKuglePrvogBroja == 23) {
                    System.out.println("Boja prve kugle: Narandzasta");
                } else if (bojaKuglePrvogBroja == 31) {
                    System.out.println("Boja prve kugle: Narandzasta");
                } else if (bojaKuglePrvogBroja == 39) {
                    System.out.println("Boja prve kugle: Narandzasta");
                } else if (bojaKuglePrvogBroja == 47) {
                    System.out.println("Boja prve kugle: Narandzasta");
                } else if (bojaKuglePrvogBroja == 8) {
                    System.out.println("Boja prve kugle: Crna");
                } else if (bojaKuglePrvogBroja == 16) {
                    System.out.println("Boja prve kugle: Crna");
                } else if (bojaKuglePrvogBroja == 24) {
                    System.out.println("Boja prve kugle: Crna");
                } else if (bojaKuglePrvogBroja == 32) {
                    System.out.println("Boja prve kugle: Crna");
                } else if (bojaKuglePrvogBroja == 40) {
                    System.out.println("Boja prve kugle: Crna");
                } else {
                    System.out.println("Boja prve kugle: Crna");
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (bojaKuglePrvogBroja % 2 == 0) {
                    System.out.println("Prvi broj je paran");
                } else {
                    System.out.println("Prvi broj je neparan");
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (listaDobijenihBrojeva.size() == 1) {
                    System.out.println("Dobitni brojervi iz vase kombinacije su: " + listaDobijenihBrojeva.get(0) + "(" + lista4.get(0) + ")");
                }
                if (listaDobijenihBrojeva.size() == 2) {
                    System.out.println("Dobitni brojervi iz vase kombinacije su: " + listaDobijenihBrojeva.get(0) + "(" + lista4.get(0) + "), " + listaDobijenihBrojeva.get(1) + "(" + lista4.get(1) + ")");
                }
                if (listaDobijenihBrojeva.size() == 3) {
                    System.out.println("Dobitni brojervi iz vase kombinacije su: " + listaDobijenihBrojeva.get(0) + "(" + lista4.get(0) + "), " + listaDobijenihBrojeva.get(1) + "(" + lista4.get(1) + "), " + listaDobijenihBrojeva.get(2) + "(" + lista4.get(2) + ")");
                }
                if (listaDobijenihBrojeva.size() == 4) {
                    System.out.println("Dobitni brojervi iz vase kombinacije su: " + listaDobijenihBrojeva.get(0) + "(" + lista4.get(0) + "), " + listaDobijenihBrojeva.get(1) + "(" + lista4.get(1) + "), " + listaDobijenihBrojeva.get(2) + "(" + lista4.get(2) + "), " + listaDobijenihBrojeva.get(3) + "(" + lista4.get(3) + ")");
                }
                if (listaDobijenihBrojeva.size() == 5) {
                    System.out.println("Dobitni brojervi iz vase kombinacije su: " + listaDobijenihBrojeva.get(0) + "(" + lista4.get(0) + "), " + listaDobijenihBrojeva.get(1) + "(" + lista4.get(1) + "), " + listaDobijenihBrojeva.get(2) + "(" + lista4.get(2) + "), " + listaDobijenihBrojeva.get(3) + "(" + lista4.get(3) + "), " + listaDobijenihBrojeva.get(4) + "(" + lista4.get(4) + ")");
                }
                if (listaDobijenihBrojeva.size() == 6) {
                    System.out.println("Dobitni brojervi iz vase kombinacije su: " + listaDobijenihBrojeva.get(0) + "(" + lista4.get(0) + "), " + listaDobijenihBrojeva.get(1) + "(" + lista4.get(1) + "), " + listaDobijenihBrojeva.get(2) + "(" + lista4.get(2) + "), " + listaDobijenihBrojeva.get(3) + "(" + lista4.get(3) + "), " + listaDobijenihBrojeva.get(4) + "(" + lista4.get(4) + "), " + listaDobijenihBrojeva.get(5) + "(" + lista4.get(5) + ")");
                }
                if (listaDobijenihBrojeva.size() == 7) {
                    System.out.println("Dobitni brojervi iz vase kombinacije su: " + listaDobijenihBrojeva.get(0) + "(" + lista4.get(0) + "), " + listaDobijenihBrojeva.get(1) + "(" + lista4.get(1) + "), " + listaDobijenihBrojeva.get(2) + "(" + lista4.get(2) + "), " + listaDobijenihBrojeva.get(3) + "(" + lista4.get(3) + "), " + listaDobijenihBrojeva.get(4) + "(" + lista4.get(4) + "), " + listaDobijenihBrojeva.get(5) + "(" + lista4.get(5) + ") ," + listaDobijenihBrojeva.get(6) + "(" + lista4.get(6) + ")");
                }
                if (listaDobijenihBrojeva.size() == 8) {
                    System.out.println("Dobitni brojervi iz vase kombinacije su: " + listaDobijenihBrojeva.get(0) + "(" + lista4.get(0) + "), " + listaDobijenihBrojeva.get(1) + "(" + lista4.get(1) + "), " + listaDobijenihBrojeva.get(2) + "(" + lista4.get(2) + "), " + listaDobijenihBrojeva.get(3) + "(" + lista4.get(3) + "), " + listaDobijenihBrojeva.get(4) + "(" + lista4.get(4) + "), " + listaDobijenihBrojeva.get(5) + "(" + lista4.get(5) + ") ," + listaDobijenihBrojeva.get(6) + "(" + lista4.get(6) + ") ," + listaDobijenihBrojeva.get(7) + "(" + lista4.get(7) + ")");
                }
                if (listaDobijenihBrojeva.size() == 9) {
                    System.out.println("Dobitni brojervi iz vase kombinacije su: " + listaDobijenihBrojeva.get(0) + "(" + lista4.get(0) + "), " + listaDobijenihBrojeva.get(1) + "(" + lista4.get(1) + "), " + listaDobijenihBrojeva.get(2) + "(" + lista4.get(2) + "), " + listaDobijenihBrojeva.get(3) + "(" + lista4.get(3) + "), " + listaDobijenihBrojeva.get(4) + "(" + lista4.get(4) + "), " + listaDobijenihBrojeva.get(5) + "(" + lista4.get(5) + ") ," + listaDobijenihBrojeva.get(6) + "(" + lista4.get(6) + ") ," + listaDobijenihBrojeva.get(7) + "(" + lista4.get(7) + ") ," + listaDobijenihBrojeva.get(8) + "(" + lista4.get(8) + ")");
                }
                if (listaDobijenihBrojeva.size() == 10) {
                    System.out.println("Dobitni brojervi iz vase kombinacije su: " + listaDobijenihBrojeva.get(0) + "(" + lista4.get(0) + "), " + listaDobijenihBrojeva.get(1) + "(" + lista4.get(1) + "), " + listaDobijenihBrojeva.get(2) + "(" + lista4.get(2) + "), " + listaDobijenihBrojeva.get(3) + "(" + lista4.get(3) + "), " + listaDobijenihBrojeva.get(4) + "(" + lista4.get(4) + "), " + listaDobijenihBrojeva.get(5) + "(" + lista4.get(5) + ") ," + listaDobijenihBrojeva.get(6) + "(" + lista4.get(6) + "), " + listaDobijenihBrojeva.get(7) + "(" + lista4.get(7) + ") ," + listaDobijenihBrojeva.get(8) + "(" + lista4.get(8) + ") ," + listaDobijenihBrojeva.get(9) + "(" + lista4.get(9) + ")");
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (brojNasumicnihBrojeva == 6) {
                    System.out.println(" ");
                    int size = listaDobijenihBrojeva.size();
                    if (size < 6) {
                        System.out.println("Tiket je gubitan :(");
                    } else {
                        System.out.println("Tiket je dobitan :)");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Vas dobitak sa ulogom od "+ulog+" je: "+ulog*lista4.get(5));
                    }
                }
                if (brojNasumicnihBrojeva == 7) {
                    System.out.println(" ");
                    int size = listaDobijenihBrojeva.size();
                    if (size < 6) {
                        System.out.println("Tiket je gubitan :(");
                    } else if (size == 6) {
                        System.out.println("Tiket je dobitan sa 6/7 brojeva :)");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Vas dobitak sa ulogom od "+ulog+" je: "+ulog*lista4.get(5)/4);
                    } else {
                        System.out.println("Tiket je dobitan sa 7/7 brojeva :)");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Vas dobitak sa ulogom od "+ulog+" je: "+ulog*lista4.get(6));
                    }
                }
                if (brojNasumicnihBrojeva == 8) {
                    System.out.println(" ");
                    int size = listaDobijenihBrojeva.size();
                    if (size < 6) {
                        System.out.println("Tiket je gubitan :(");
                    } else if (size == 6) {
                        System.out.println("Tiket je dobitan sa 6/8 brojeva :)");

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Vas dobitak sa ulogom od "+ulog+" je: "+ulog/4);
                    } else if (size == 7) {
                        System.out.println("Tiket je dobitan sa 7/8 brojeva :)");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Vas dobitak sa ulogom od "+ulog+" je: "+ulog);
                    } else {
                        System.out.println("Tiket je dobitan sa 8/8 brojeva :)");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Vas dobitak sa ulogom od "+ulog+" je: "+ulog*lista4.get(7)*2);
                    }
                }
                if (brojNasumicnihBrojeva == 9) {
                    System.out.println(" ");
                    int size = listaDobijenihBrojeva.size();
                    if (size < 7) {
                        System.out.println("Tiket je gubitan :(");
                    } else if (size == 7) {
                        System.out.println("Tiket je dobitan sa 7/9 brojeva :)");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Vas dobitak sa ulogom od "+ulog+" je: "+ulog);
                    } else if (size == 8) {
                        System.out.println("Tiket je dobitan sa 8/9 brojeva :)");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Vas dobitak sa ulogom od "+ulog+" je: "+ulog*lista4.get(7)*1.5);
                    } else {
                        System.out.println("Tiket je dobitan sa 9/9 brojeva :)");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Vas dobitak sa ulogom od "+ulog+" je: "+ulog*lista4.get(8)*6);
                    }
                }
                if (brojNasumicnihBrojeva == 10) {
                    System.out.println(" ");
                    int size = listaDobijenihBrojeva.size();
                    if (size < 7) {
                        System.out.println("Tiket je gubitan :(");
                    } else if (size == 7) {
                        System.out.println("Tiket je dobitan sa 7/10 brojeva :)");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Vas dobitak sa ulogom od "+ulog+" je: "+ulog);
                    } else if (size == 8) {
                        System.out.println("Tiket je dobitan sa 8/10 brojeva :)");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Vas dobitak sa ulogom od "+ulog+" je: "+ulog*6);
                    } else if (size == 9) {
                        System.out.println("Tiket je dobitan sa 9/10 brojeva :)");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Vas dobitak sa ulogom od "+ulog+" je: "+ulog*18);
                    } else {
                        System.out.println("Tiket je dobitan sa 10/10 brojeva :)");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Vas dobitak sa ulogom od "+ulog+" je: "+ulog*lista4.get(9)*18);
                    }
                }
            }
            System.out.println(" ");
            System.out.println("=========================================================================================");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(" ");
            System.out.println("Hvala Vam na igranju!");
        }
        System.out.println(" ");
        System.out.println("=========================================================================================");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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
    private static List<Integer> getIntegers() {
        List<Integer> listaKvota = new ArrayList<>();
        listaKvota.add(10000);
        listaKvota.add(7500);
        listaKvota.add(5000);
        listaKvota.add(2500);
        listaKvota.add(1000);
        listaKvota.add(500);
        listaKvota.add(300);
        listaKvota.add(200);
        listaKvota.add(150);
        listaKvota.add(100);
        listaKvota.add(90);
        listaKvota.add(80);
        listaKvota.add(70);
        listaKvota.add(60);
        listaKvota.add(50);
        listaKvota.add(40);
        listaKvota.add(30);
        listaKvota.add(25);
        listaKvota.add(20);
        listaKvota.add(15);
        listaKvota.add(10);
        listaKvota.add(9);
        listaKvota.add(8);
        listaKvota.add(7);
        listaKvota.add(6);
        listaKvota.add(5);
        listaKvota.add(4);
        listaKvota.add(3);
        listaKvota.add(2);
        listaKvota.add(1);
        return listaKvota;
    }
}