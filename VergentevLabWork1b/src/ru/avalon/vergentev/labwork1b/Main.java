package ru.avalon.vergentev.labwork1b;

public class Main {
    static public void main (String[] args) {
        BookParameters [] books = new BookParameters[5];
        books[0] = new BookParameters("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", new String[]{"Седжвик Роберт", "Уэйн Кевин"},  2018, new PublishingHouseParameters("Питер", "Санкт-Петербург"));
        books[1] = new BookParameters("Разработка требований к программному обеспечению. 3-е издание, дополненное", "Вигерс Карл",2019, new PublishingHouseParameters("БХВ", "Санкт-ПЕТЕБУРГ"));
        books[2] = new BookParameters("Java. Полное руководство, 10-е издание", "Шилдт Герберт", 2018, new PublishingHouseParameters("Диалектика", "Киев"));
        books[3] = new BookParameters("C/C++. Процедурное программирование", "Полубенцева М.И.",  2017, new PublishingHouseParameters("БХВ", "Санкт-ПЕТЕБУРГ"));
        books[4] = new BookParameters("Конституция РФ", 2020, new PublishingHouseParameters("Питер", "Санкт-Петербург"));


        BookParameters.printAll(books);
        System.out.println('\n');
        System.out.println('\n');
        System.out.println("ДАЛЕЕ ЗАПУСТИТСЯ ВТОРОЙ МЕТОД С ПРОВЕРКОЙ ОШИБКИ В НАЗВАНИИ ГОРОДА САНКТ-ПЕТЕРБУРГ");
        System.out.println('\n');
        BookParameters.printAll2(books);



    }

}
