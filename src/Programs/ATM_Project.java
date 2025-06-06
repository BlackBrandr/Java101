package Programs;

import java.util.Scanner;

public class ATM_Project {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        boolean back_to_menu = true;


        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");


                while (back_to_menu) {

                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    switch (select){

                        case 1 :
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Yeni bakiyeniz: " + balance);
                            break;

                        case 2 :
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                                System.out.println("Yeni bakiyeniz: " + balance);
                            }
                            break;

                        case 3 :
                            System.out.println("Bakiyeniz : " + balance);
                            break;

                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            back_to_menu = false;
                            right = 0;
                            break;

                        default:
                            System.out.println("Geçersiz işlem seçimi.");
                            break;
                    }

                    if (select != 4) {  // Çıkış seçeneği seçilmediyse
                        System.out.println("\nBaşka bir işlem yapmak istiyor musunuz?");
                        System.out.println("1- Evet");
                        System.out.println("2- Hayır");
                        System.out.print("Seçiminiz: ");
                        int devam = input.nextInt();

                        if (devam == 2) {
                            System.out.println("İyi günler. Yine bekleriz!");
                            back_to_menu = false;
                            right = 0;
                        }
                        input.nextLine();
                    }
                }
                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
