import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        String userName, password;
        int balance = 3000, select, right = 0, price;

        while (right <= 3) {
            out.print("Kullanıcı adınız : ");
            userName = input.nextLine();
            out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                right=4;
                System.out.println("Merhaba, Patika Bankasına Hoşgeldiniz!");
                out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                out.print("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap\n" +
                        ": ");
                select = input.nextInt();
                switch (select) {
                    case 1:
                        System.out.print("Para miktarı : ");
                        price = input.nextInt();
                        balance += price;
                        System.out.println("Bakiyeniz : " + balance);
                        System.out.println("Tekrar görüşmek üzere.");
                        break;
                    case 2:
                        System.out.print("Para miktarı : ");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                    case 3:
                        System.out.println("Bakiyeniz : " + balance);
                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        break;
                }
            }
            if ((right == 0) || (right == 1)) {
                out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                System.out.println("Kalan Hakkınız : " + (2 - right));
                right++;
            }
            if (right == 2){
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                break;
            }


        }

    }

}

