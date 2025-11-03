import java.util.Scanner;

public class Deneme1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print ("Kullanıcı adı:");
        String  username = scanner.nextLine();
        System.out.print("Parola:");
                String password = scanner.nextLine();
        if ("admin".equalsIgnoreCase(username) && "1234".equals(password)) {
            System.out.println("Giriş Başarılı!");
        } else {
            System.out.println(" Giriş Başarısız!");

        }
        scanner.close();
    }
}

