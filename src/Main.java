//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 0.8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Собака "  + dog );
        System.out.println("Кот "  + cat );
        System.out.println("бумага "  + paper );

        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("Собака "+dog);
        System.out.println("Кот "+cat);
        System.out.println("Бумага "+ paper);

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("Собака "+dog);
        System.out.println("Кот "+cat);
        System.out.println("Бумага "+ paper);

        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 35;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        var boxPlayer1 = 78.2;
        var boxPlayer2 = 82.7;

        System.out.println(boxPlayer1+boxPlayer2+" Кг"+" Общая масса двух боксеров");
        System.out.println(boxPlayer2-boxPlayer1+" разница между массами бойцов");


        var remainder = boxPlayer2 % boxPlayer1;
        System.out.println( "Остаток "+ remainder);


        var onePeople = 8;
        var sumPeople = 640;
        var people = (sumPeople/onePeople);
       System.out.println("Всего работников в компании  " + people +   " человек");

       var newPeopleSum = people +94;
       var newOnePeople = (sumPeople/newPeopleSum);
       System.out.println(newOnePeople +" часов работы может быть поделено между сотрудниками");








    }
}