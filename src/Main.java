public class Main {
    public static void main(String[] args) {
        //Задание №1 страница 5 - раб тетр
        System.out.println("Hello World");


        // Задание № 18 страница 42 - рабочая тетрадь
        String str = " В солнечный день осенью на опушке елового леса собрались молодые разноцветные осинки," +
                " густо одна к другой, как будто им там, в еловом лесу, стало холодно и они вышли погреться на опушку:" +
                " как у нас в деревнях люди выходят на солнышко и сидят на завалинках!";
        int n = 0;
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == ',' || symbol == '!' || symbol == '?' || symbol == ':' || symbol == '-' || symbol == '.') {
                n++;
            }
        }
        System.out.println("В нашем тексте " + n + " знаков препинания");


        int word = 1;                   // Задание № 19 страница 43 - рабочая тетрадь
        String s = " В солнечный день осенью на опушке елового леса собрались молодые разноцветные осинки.";
        String str1 = s.trim();
        for (int i1 = 0; i1 < str1.length(); i1++) {
            if (str1.charAt(i1) == ' ' && str1.charAt(i1 + 1) != ' ')
                word++;
        }
        System.out.println("В нашем тексте " + word + " слов!!!");

        // Задание № 20 страница 43 - рабочая тетрадь
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ' || s.charAt(i) != ' ' && s.charAt(i + 1) == '.')
                System.out.print(s.charAt(i));
        }

        System.out.println(" ");

        // Задание № 21 страница 44 - рабочая тетрадь
        System.out.println("время исполнения c помощью String: " + getTime(() -> checkString()) / 1_000_000 + " милисекунд");
        System.out.println("время исполнения С помощью StringBuilder: " + getTime(() -> checkStringBuilder()) / 1_000_000 + " милисекунд");
    }

    private static void checkString() {
        String str = "";
        for (int i = 0; i < 150; i++) {
            str = str + (char)i;
        }
    }

    private static void checkStringBuilder() {
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < 150; i++) {
            strB.append((char)i);
        }
    }

    private static long getTime(Runnable runnable) {
        long begin;

        begin = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            runnable.run();
        }

        return System.nanoTime() - begin;
    }
}







