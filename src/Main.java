import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Жандыруу учун 1ди басыныз\nОчуруу учун каалаган бир санды басыныз.");
        tvChanel(in.nextInt());

    }
    static void tvChanel(int onOff){
        if (onOff==1){
            while (true)  {
                if (onOff==1){
                    System.out.println("Televizor jandyryldy");
                    System.out.println("Каналдар болумуно отуу учун 1ди басыныз\nЮтуб каналына отуу учун 2ни басыныз\n");
                    int choose = new Scanner(System.in).nextInt();
                    if (choose==1){
                        chanel();
                    }
                }
                continue;
            }
        }else {
            System.out.println("Очурулду!");

        }

    }
    static void chanel(){
      //  int switchToChanel = new Scanner(System.in).nextInt();
       // if (switchToChanel==1){
            Random rnd = new Random();
            int chanals = new Scanner(System.in).nextInt();
            int plus = chanals+1;
            if (chanals==1){
                System.out.println("Спорт каналы\nКаналдар тизмесин коруу учун 1ди басыныз");
                int chanalSwitch = new Scanner(System.in).nextInt();
                if (chanalSwitch==1){
                    chanalsList();
                    System.out.println("Каналды танданыз");
                } else if (chanalSwitch==2) {
                    System.out.println(plus);
                }
            } else if (chanals==2) {
                System.out.println("КТРК каналы\nКаналдар тизмесин коруу учун 1ди басыныз");
                int chanalSwitch = new Scanner(System.in).nextInt();
                if (chanalSwitch==1){
                    chanalsList();
                    System.out.println("Каналды танданыз");

                }
            }else if (chanals==3) {
                System.out.println("КТРК спорт каналы\nКаналдар тизмесин коруу учун 1ди басыныз");
                int chanalSwitch = new Scanner(System.in).nextInt();
                if (chanalSwitch==1){
                    chanalsList();
                    System.out.println("Каналды танданыз");
                }
            }else if (chanals==4) {
                System.out.println("КТРК музыка каналы\nКаналдар тизмесин коруу учун 1ди басыныз");
                int chanalSwitch = new Scanner(System.in).nextInt();
                if (chanalSwitch==1){
                    chanalsList();
                    System.out.println("Каналды танданыз");

                }
            }else if (chanals==5) {
                System.out.println("312 кино каналы\nКаналдар тизмесин коруу учун 1ди басыныз");
                int chanalSwitch = new Scanner(System.in).nextInt();
                if (chanalSwitch==1){
                    chanalsList();
                    System.out.println("Каналды танданыз");

                }
            }else if (chanals==6) {
                System.out.println("312 музыка каналы\nКаналдар тизмесин коруу учун 1ди басыныз");
                int chanalSwitch = new Scanner(System.in).nextInt();
                if (chanalSwitch==1){
                    chanalsList();
                    System.out.println("Каналды танданыз");

                }
            }else if (chanals==7) {
                System.out.println("НТВ каналы\nКаналдар тизмесин коруу учун 1ди басыныз");
                int chanalSwitch = new Scanner(System.in).nextInt();
                if (chanalSwitch==1){
                    chanalsList();
                    System.out.println("Каналды танданыз");

                }
            }else if (chanals==8) {
                System.out.println("Россия каналы\nКаналдар тизмесин коруу учун 1ди басыныз");
                int chanalSwitch = new Scanner(System.in).nextInt();
                if (chanalSwitch==1){
                    chanalsList();
                    System.out.println("Каналды танданыз");

                }

            }else if (chanals==9) {
                System.out.println("Музыка каналы\nКаналдар тизмесин коруу учун 1ди басыныз");
                int chanalSwitch = new Scanner(System.in).nextInt();
                if (chanalSwitch==1){
                    chanalsList();
                    System.out.println("Каналды танданыз");

                }


            }else if (chanals==10) {
                System.out.println("Биринчи каналы\nКаналдар тизмесин коруу учун 1ди басыныз");
                int chanalSwitch = new Scanner(System.in).nextInt();
                if (chanalSwitch==1){
                    chanalsList();
                    System.out.println("Каналды танданыз");

                }

            //}
        }
    }
    static void chanalsList(){
        System.out.println("Каналдар тизмеси:\nСпорт каналы-1\nКТРК каналы-2\nКТРК спорт каналы-3\nКТРК музыка каналы-4\n312 кино каналы-5\n" +
                "312 музыка каналы-6\nНТВ каналы-7\nРоссия каналы-8\nМузыка каналы-9\nБиринчи канал - 10");
        Scanner in = new Scanner(System.in);
        int backToChanal = in.nextInt();
        if (backToChanal==1){
            chanel();
        } else if (backToChanal==2) {
            chanel();
        }else if (backToChanal==3) {
            chanel();
        }else if (backToChanal==4) {
            chanel();
        }else if (backToChanal==5) {
            chanel();
        }else if (backToChanal==6) {
            chanel();
        }else if (backToChanal==7) {
            chanel();
        }else if (backToChanal==8) {
            chanel();
        }else if (backToChanal==9) {
            chanel();
        }else if (backToChanal==10) {
            chanel();
        }


    }

}