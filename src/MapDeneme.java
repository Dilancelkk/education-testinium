import java.util.*;

public class MapDeneme {

    public static void main(String[] args) {
        mapOrnegi();
    }

    // 81 şehir ve plaka kodlarını saklayan Map
    private static void mapOrnegi() {
        Map<Integer, String> plakaSehir = new LinkedHashMap<>();

        String[] iller = {
                "Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın", "Balıkesir",
                "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli",
                "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane", "Hakkari",
                "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri", "Kırklareli", "Kırşehir",
                "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin", "Muğla", "Muş", "Nevşehir",
                "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat",
                "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt", "Karaman",
                "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye",
                "Düzce"
        };

        for (int i = 0; i < iller.length; i++) {
            plakaSehir.put(i + 1, iller[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir şehir adı giriniz: ");
        String girilenSehir = scanner.nextLine().trim();

        boolean bulundu = false;
        for (Map.Entry<Integer, String> entry : plakaSehir.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(girilenSehir)) {
                System.out.printf("%s ilinin plaka kodu: %02d%n", entry.getValue(), entry.getKey());
                bulundu = true;
                break;
            }
        }

        if (!bulundu) {
            System.out.println("Girdiğiniz şehir bulunamadı. Lütfen geçerli bir şehir adı giriniz.");
        }

        scanner.close();
    }
}
