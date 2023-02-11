public class Ford {

    public static void main(String[] args) {

        String carMake = "Ford";
        int doors = 4;

        if (carMake.equals("Ford")) {
            if (doors == 3) {
                System.out.println("Proizvodjac automobila je Ford. Vozilo je kupe (2 vrata). ");
            } else if (doors == 4) {
                System.out.println("Proizvodjac automobila je Ford. Vozilo je limuzina (4 vrata).");
            } else {
                System.out.println("Proizvodjac automobila je Ford. Vozilo nije putnicko.");
            }

        } else {
            System.out.println("Proizvodjac automobila nije Ford.");
        }
    }

}

