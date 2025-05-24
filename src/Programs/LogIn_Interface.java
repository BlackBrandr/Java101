package Programs;

import java.util.Scanner;

public class LogIn_Interface{
    public static void main(String[] args) {

        String password,new_password, username;
        int ask_reset;

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adı Giriniz : ");
        username = input.nextLine();

        System.out.println("Şifre Giriniz : ");
        password = input.nextLine();

        if (username.equals("burak1907") && password.equals("1907")){
            System.out.println("Hoşgeldiniz");
        }

        else {
            System.out.println("Şifreniz yanlış !!");
            System.out.println("Şifrenizi değiştirmek ister misiniz?");
            System.out.println("1- Evet\n2-Hayır");
            ask_reset = input.nextInt();
            input.nextLine();

            switch (ask_reset){

                case 1 :
                    System.out.println("Yeni Şifreyi Giriniz : ");
                    new_password = input.nextLine();


                    if (password.equals(new_password) ){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }else{
                        System.out.println("Şifre oluşturuldu.");
                    }
                    break;

                case 2:
                    System.out.println("Lütfen Tekrar Giriş Yapınız");
                    break;


            }

        }


    }
}
