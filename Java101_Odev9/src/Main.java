import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int select;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifre giriniz: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş yaptınız!");
        } else if((userName.equals("patika") && !password.equals("java123"))){
            System.out.println("Yanlış şifre girdiniz!");
            System.out.println(("Şifreyi sıfırlamak ister misiniz?\n1-Evet\n2-Hayır"));
            Scanner inp = new Scanner(System.in);
            select = inp.nextInt();
            if(select==1){
                System.out.print("Yeni Şifre: ");
                Scanner newInp = new Scanner(System.in);
                password = newInp.nextLine();
                if(password.equals("java123")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.print("Şifre oluşturuldu");
                }
            }
        } else {
            System.out.println("Sistemde " + userName + " isimli bir kullanıcı kayıtlı değil!");
        }
    }
}
