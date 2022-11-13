public class Main {
    public static void main(String[] args) {
        System.out.println("DoGvsCaT&PaperPls_Переменные");

        //Задача 1
        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //Задача 2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat +4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //Задача 3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = (double) cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        //Задание 4
        double friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = (double) friend / 7;
        System.out.println(friend);

        //Задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задание 6
        var firstBoxer = 78.2;
        System.out.println(firstBoxer + " кг" + " Вес первого боксера");
        var secondBoxer = 82.7;
        System.out.println(secondBoxer + " кг" + " Вес второго боксера");
        var vegetablesBoxer = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров " + vegetablesBoxer + " кг!");
        var differenceBoxer = (firstBoxer - secondBoxer);
        System.out.println("Разница между боксерами " + differenceBoxer +" кг!");

        //Задание 7
        var overBoxer = (secondBoxer - firstBoxer) % vegetablesBoxer;
        System.out.println("Разница между боксерами " + overBoxer + " кг!");

        //Задание 8
        var fullTime = 640;
        System.out.println(fullTime + " часов работы поделено между сотрудниками");
        var oneMan = 8;
        System.out.println("каждый сотрудник посвящает работе " + oneMan + " часов");
        var totalCompany1 = fullTime / oneMan;
        System.out.println("Всего работников в компании " + totalCompany1 + " человек");
        var totalCompany2 = totalCompany1 + 94;
        System.out.println("Если в компании работает " + totalCompany2 + " человека, то всего " + (totalCompany2 * oneMan) + " часов работы может быть поделено между сотрудниками");

    }
}