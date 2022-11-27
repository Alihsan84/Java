import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String kullaniciAdi,password,select,npassword;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz:");
        kullaniciAdi= input.nextLine();
        System.out.print("Şifrenizi Giriniz :");
        password= input.nextLine();

        if(kullaniciAdi.equals("Java") && password.equals("123")){
            System.out.println("Giriş Başarılı");
        }else{
            System.out.println("Hatalı Giriş Yaptınız");
        }
       if (!password.equals("123")){
           System.out.println("Şifreyi Sıfırlamak İstemisiniz E/H ? : ");
           select=input.nextLine();
           switch (select){
               case "E":
                   System.out.println("Yeni bir şifre girin");
                   npassword=input.nextLine();
                   if(npassword.equals("123")){
                       System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                   }else{
                       System.out.println("Şifre oluşturuldu");
                   }
                   break;
               case "H":
                   System.out.println(("Lütfen tekrar deneyiniz!"));
           }
       }
    }
}
