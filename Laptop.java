
import java.util.Scanner;


public class Laptop {
    public Laptop(int i, String string, String string2, String string3, String string4, int j, int k, int l, double d) {
    }

    public static void main(String[] args) {
    Laptop It1 = new Laptop(001, "Samsung", "White", "Windows", "USA", 16, 512, 56000, 18);        
    Laptop It2 = new Laptop(002, "Apple", "Silver", "Ios", "USA", 16, 512, 78000, 15.5);
    Laptop It3 = new Laptop(003, "Lenovo", "Black", "Windows", "China", 8, 256, 45000, 19.3);
    Laptop It4 = new Laptop(004, "Acer", "White", "Linux", "Russia", 4, 124, 25000, 14);

    Laptop[] It = new Laptop[] {It1, It2, It3, It4};
    System.out.println("");
    System.out.println("Введите критерий ноутбука: \n1 - наименование\n2 - цвет\n3 - Операциооная система\n4 - производитель\n5 - RAM\n6 -память\n7 - цена\n8 - диагональ");
    System.out.println("");
    Scanner sc = new Scanner(System.in);
    int num =  sc.nextInt();
    
    switch (num) {
        case 1:
            System.out.println("Введите наменование:");
            Scanner sc1 = new Scanner(System.in);
            System.out.println(Laptop.getLaptopByTm(It, sc1.nextLine()));
            break;
        case 2:
            System.out.println("Введите цвет:");
            Scanner sc2 = new Scanner(System.in);
            System.out.println(Laptop.getLaptopByColor(It, sc2.nextLine()));
            break;
        case 3:
            System.out.println("Введите операционную систему:");
            Scanner sc3 = new Scanner(System.in);
            System.out.println(Laptop.getLaptopByOs(It, sc3.nextLine()));
            break;
        case 4: 
            System.out.println("Введите страну:");
            Scanner sc4 = new Scanner(System.in);
            System.out.println(Laptop.getLaptopByCoN(It, sc4.nextLine()));
            break;
        case 5:
            System.out.println("Введите количество RAM:");
            int RAM = sc.nextInt();
            System.out.println(Laptop.getLaptopByRAM(It, RAM));
            break;
        case 6:
            System.out.println("Введите объём памяти:");
            int HD = sc.nextInt();
            System.out.println(Laptop.getLaptopByHD(It, HD));
            break;
        case 7:
            System.out.println("Введите минимальную цену:");
            int price_min = sc.nextInt();
            System.out.println("Введите максимальную цену:");
            int price_max = sc.nextInt();
            System.out.println(Laptop.getLaptopByPrice(It, price_min, price_max));
            break;
        case 8:
            System.out.println("Введите диагональ:");
            double scr = sc.nextDouble();
            System.out.println(Laptop.getLaptopByScreen(It, scr));
        case 9:
            System.out.println("Наличие:");
            System.out.println(It1.toString());
            System.out.println(It2.toString());
            System.out.println(It3.toString());
            System.out.println(It4.toString());
            break;
        default:
            System.out.println("Данного значения нет, введите от 1 до 9.");           
 }
 sc.close();
}

    private static Object getLaptopByScreen(Laptop[] it, double scr) {
        return null;
    }

    private static char[] getLaptopByPrice(Laptop[] it, int price_min, int price_max) {
        return null;
    }

    private static char[] getLaptopByHD(Laptop[] it, int hD) {
        return null;
    }

    private static char[] getLaptopByRAM(Laptop[] it, int rAM) {
        return null;
    }

    private static char[] getLaptopByCoN(Laptop[] it, String nextLine) {
        return null;
    }

    private static char[] getLaptopByColor(Laptop[] it, String nextLine) {
        return null;
    }

    private static char[] getLaptopByTm(Laptop[] it, String nextLine) {
        return null;
    }

    private static char[] getLaptopByOs(Laptop[] it, String nextLine) {
        return null;
    }

                 
}
