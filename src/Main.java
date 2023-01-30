import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\033[34m>>>On-\033[0m\033[31m*\033[0m\n\033[31["+"\033[34m>>>Off-\033[0m\033[0m\033[31m#\033[0m");
            tvChanel(in.next().charAt(0));

        }

    }
    static void tvChanel(char onOff){
        if (onOff=='*'){
            while (true)  {
                if (onOff=='*'){
                    System.out.println("\033[34m>>>>>Кош келиниз<<<<<\033[0m");
                    System.out.println("\033[34mTV-1\033[0m\n\033Youtube-2\033[0m");
                    int choose = new Scanner(System.in).nextInt();
                    if (choose==1){
                        sportChanel();
                    }
                }

            }
        }else if (onOff=='#'){
            System.out.println("\033[34mОчурулду!\033[0m");

        }

    }
   /* static void chanel(){
      //  int switchToChanel = new Scanner(System.in).nextInt();
       // if (switchToChanel==1){
            Random rnd = new Random();
            int chanals = new Scanner(System.in).nextInt();
            char plusChanal = '+';
            int plus = chanals+1;
            if (chanals==1){

                System.out.println("Спорт каналы\nКаналдар тизмесин коруу учун 1ди басыныз");
                int chanalSwitch = new Scanner(System.in).nextInt();

                if (chanalSwitch==1){
                    chanalsList();
                    System.out.println("Каналды танданыз");
                } else if (chanalSwitch==2) {
                    chanals++;
                    System.out.println(chanals);
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
                System.out.println("Биринчи каналы\nКаналдар тизмесин коруу учун * басыныз\nКийинки каналга отуу учун + басыныз");
               // int chanalSwitch = new Scanner(System.in).nextInt();
                char nextChanal = new Scanner(System.in).next().charAt(0);
                if (nextChanal=='*'){
                    chanalsList();
                    System.out.println("Каналды танданыз");
                } else if (nextChanal=='+') {
                    sportChanel();
                }


                //}
        }

    }*/
    static void chanalsList(){
        System.out.println("\033[34mКаналдар тизмеси:\nСпорт каналы-1\nКТРК каналы-2\nКТРК спорт каналы-3\nКТРК музыка каналы-4\n312 кино каналы-5\n" +
                "312 музыка каналы-6\nНТВ каналы-7\nРоссия каналы-8\nМузыка каналы-9\nБиринчи канал - 10\033[0m");
        Scanner in = new Scanner(System.in);
        int backToChanal = in.nextInt();
        if (backToChanal==1){
            sportChanel();
        } else if (backToChanal==2) {
            ktrkChanel();
        }else if (backToChanal==3) {
            ktrkSport();
        }else if (backToChanal==4) {
            ktrkMuzyka();
        }else if (backToChanal==5) {
            kino312();
        }else if (backToChanal==6) {
            muzyka312();
        }else if (backToChanal==7) {
            ntv();
        }else if (backToChanal==8) {
            russia();
        }else if (backToChanal==9) {
            muzyka();
        }else if (backToChanal==10) {
            birinchi();
        }
    }
        static void sportChanel(){
            System.out.println("\033[32m>>>>>Спорт каналы<<<<<\033[0m\n\033[32mMENU-'*' \n-->>'+'" +
                    "\n<<-- '-'\nOff-'^'\033[0m");
            char num1 = new Scanner(System.in).next().charAt(0);
            if (num1=='*'){
                chanalsList();
            } else if (num1=='+') {
                ktrkChanel();
            }else if (num1=='-'){
                birinchi();
            } else if (num1=='^') {
                Scanner in = new Scanner(System.in);
                System.out.println("\033[34mOff-'^'\033[0m");
                char onOff='^';
                tvChanel(onOff);
            }else {
                System.out.println("\033[31mКатачылык кетти\033[0m");
            }
        }
        static void ktrkChanel(){
            System.out.println("\033[34m>>>>>КТРК каналы<<<<<\nMENU-'*' \n-->>'+'" +
                    "\n<<-- '-'\nOff-'^'\033[0m");
            char num2 = new Scanner(System.in).next().charAt(0);
            if (num2=='*'){
                chanalsList();
            } else if (num2=='+') {
                ktrkSport();
            } else if (num2=='-') {
                sportChanel();
            }
        }
        static void ktrkSport(){
            System.out.println("\033[34m>>>>>КТРК cпорт каналы<<<<<\nMENU-'*' \n-->>'+'" +
                    "\n<<-- '-'\nOff-'^'\033[0m");
            char num2 = new Scanner(System.in).next().charAt(0);
            if (num2=='*'){
                chanalsList();
            } else if (num2=='+') {
                ktrkMuzyka();
            } else if (num2=='-') {
                ktrkChanel();
            }
        }
        static void ktrkMuzyka(){
            System.out.println("\033[>>>>>КТРК музыка каналы<<<<<\nMENU-'*' \n-->>'+'" +
                    "\n<<-- '-'\nOff-'^'");
            char num2 = new Scanner(System.in).next().charAt(0);
            if (num2=='*'){
                chanalsList();
            } else if (num2=='+') {
                kino312();
            } else if (num2=='-') {
                ktrkSport();
            }
        }
        static void kino312(){
            System.out.println(">>>>>312 кино каналы<<<<<\nMENU-'*' \n-->>'+'" +
                    "\n<<-- '-'\nOff-'^'");
            char num2 = new Scanner(System.in).next().charAt(0);
            if (num2=='*'){
                chanalsList();
            } else if (num2=='+') {
                muzyka312();
            } else if (num2=='-') {
                ktrkMuzyka();
            }
        }
        static void muzyka312(){
            System.out.println(">>>>>312 музыка каналы<<<<<\nMENU-'*' \n-->>'+'" +
                    "\n<<-- '-'\nOff-'^'");
            char num2 = new Scanner(System.in).next().charAt(0);
            if (num2=='*'){
                chanalsList();
            } else if (num2=='+') {
                ntv();
            } else if (num2=='-') {
                kino312();
            }
        }
        static void ntv(){
            System.out.println(">>>>>НТВ каналы<<<<<\nMENU-'*' \n-->>'+'" +
                    "\n<<-- '-'\nOff-'^'");
            char num2 = new Scanner(System.in).next().charAt(0);
            if (num2=='*'){
                chanalsList();
            } else if (num2=='+') {
            russia();
            } else if (num2=='-') {
                muzyka312();
            }
        }
        static void russia(){
            System.out.println(">>>>>Россия каналы<<<<<\nMENU-'*' \n-->>'+'" +
                    "\n<<-- '-'\nOff-'^'");
            char num2 = new Scanner(System.in).next().charAt(0);
            if (num2=='*'){
                chanalsList();
            } else if (num2=='+') {
            muzyka();
            } else if (num2=='-') {
                ntv();
            }
        }
        static void muzyka(){
            System.out.println(">>>>>Музыка каналы<<<<<\nMENU-'*' \n-->>'+'" +
                    "\n<<-- '-'\nOff-'^'");
            char num2 = new Scanner(System.in).next().charAt(0);
            if (num2=='*'){
                chanalsList();
            } else if (num2=='+') {
            birinchi();
            } else if (num2=='-') {
                russia();
            }
        }
        static void birinchi(){
            System.out.println("\033[34m>>>>>Биринчи каналы<<<<<\033[0m\nMENU-'*' \n-->>'+'" +
                    "\n<<-- '-'\nOff-'^'");
            char num2 = new Scanner(System.in).next().charAt(0);
            if (num2=='*'){
                chanalsList();
            } else if (num2=='+') {
            sportChanel();
            } else if (num2=='-') {
                muzyka();
            }
        }
}