public class Main {
    public static void main(String[] args) {
        ProgrammingBook[] programBook = new ProgrammingBook[5];
        FictionBook[] ficBook = new FictionBook[5];

        programBook[0] = new ProgrammingBook("1230", "name0", 120, "hatake kakashi", "C#", "Bfkgj");
        programBook[1] = new ProgrammingBook("1294", "name1", 115.5, "sakura", "Java", "Spring");
        programBook[2] = new ProgrammingBook("1301", "name2", 60, "hyunga neiji", "Python", "Django");
        programBook[3] = new ProgrammingBook("1527", "name3", 82.5, "deidara", "Java", "Spring MVC");
        programBook[4] = new ProgrammingBook("1652", "name4", 202.6, "uchiha itachi", "Ruby", "on Rail");

        ficBook[0] = new FictionBook("2143", "fic1", 33.5,"gao red", "vien tuong 1");
        ficBook[1] = new FictionBook("2235", "fic2", 146,"gao yellow", "vien tuong 2");
        ficBook[2] = new FictionBook("2688", "fic3", 58.5,"gao blue", "vien tuong 1");
        ficBook[3] = new FictionBook("2164", "fic4", 174,"gao white", "vien tuong 3");
        ficBook[4] = new FictionBook("2923", "fic5", 82,"gao black", "vien tuong 1");

        //Tinh tong tien 10 cuon sach
        double total = 0;
        double totalPro = 0;
        double totalFic = 0;
        for (int i = 0; i < programBook.length; i++) {
            totalPro += programBook[i].getPrice();
        }
        for (int i = 0; i < ficBook.length; i++) {
            totalFic += ficBook[i].getPrice();
        }
        total = totalPro + totalFic;
        System.out.println("Tong tien 10 cuon sach la: "+ total);

        //Dem so sach ProgrammingBook co language la Java
        int countPr = 0;
        for (int i = 0; i < programBook.length; i++) {
            if (programBook[i].getLanguage().equals("Java")){
                countPr += 1;
            }
        }
        System.out.println("So luong sach ProgammingBook co language Java la: "+ countPr);

        //Dem so sach FictionBook co category la "vien tuong 1"
        int countVT1 = 0;
        for (int i = 0; i < ficBook.length; i++) {
            if (ficBook[i].getCategory().equals("vien tuong 1")){
                countVT1 += 1;
            }
        }
        System.out.println("So luong sach Fiction co category Vien tuong 1 la: "+ countVT1);

        //Dem so sach Fiction co gia <100
        int countPrice = 0;
        for (int i = 0; i < ficBook.length; i++) {
            if (ficBook[i].getPrice() < 100){
                countPrice += 1;
            }
        }
        System.out.println("So luong sach Fiction co gia <100 la: " + countPrice);


    }
}
