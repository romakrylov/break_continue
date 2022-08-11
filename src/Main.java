public class Main {
    public static void main(String[] args) {

/* оператор break

        int soughtYear = 1983;

        int firstYear = 1922;
        int lastYear = 2022;

        boolean yearExists = false;

        for (int year = firstYear; year <= lastYear; year = year + 1) {
            if (year == soughtYear) {
                yearExists = true;
                break;
            }
        }

        String found = "Год найден";
        String notFound = "Год не найден";
        System.out.println(yearExists ? found : notFound);
    }
}

         */


// оператор continue
        int firstYear = 1922;
        int lastYear = 2022;


        for (int year = firstYear; year <= lastYear; year = year + 1) {
            if (year % 4 != 0) {
                continue;
            }
            System.out.println(year);
            for (int month = 1; month <= 12; month = month + 1) {
                String zero = month < 10 ? "0" : "";
                System.out.println("29." + zero + month + "." + year);
            }
        }
    }
}
