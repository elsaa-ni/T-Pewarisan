public class Main {
    public static void main(String[] args) {
        System.out.println("=== HASIL PROGRAM ===");

        System.out.println("\n[Bujur Sangkar]");
        BujurSangkar kotak = new BujurSangkar(8.5, "Kuning"); 
        kotak.printInfo(); 

        System.out.println("\n[Lingkaran]");
        Lingkaran bundar = new Lingkaran(14.0, "Merah"); 
        bundar.printInfo();

        System.out.println("\n[Silinder]");
        Silinder tabung = new Silinder(20.0, 14.0, "Hitam");
        tabung.printInfo();
        
        System.out.println("\n=========================");
    }
}