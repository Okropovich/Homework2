//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Собака " + dog);
        System.out.println("Кот " + cat);
        System.out.println("бумага " + paper);

        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("Собака " + dog);
        System.out.println("Кот " + cat);
        System.out.println("Бумага " + paper);

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("Собака " + dog);
        System.out.println("Кот " + cat);
        System.out.println("Бумага " + paper);

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

        System.out.println(boxPlayer1 + boxPlayer2 + " Кг" + " Общая масса двух боксеров");
        System.out.println(boxPlayer2 - boxPlayer1 + " разница между массами бойцов");


        var remainder = boxPlayer2 % boxPlayer1;
        System.out.println("Остаток " + remainder);


        var hoursPerEmployee = 8;
        var totalHours = 640;
        var numberOfEmployees = totalHours / hoursPerEmployee;
        System.out.println("Всего работников в компании — " + numberOfEmployees + " человек");


        var newEmployeeCount = numberOfEmployees + 94;
        var newHoursPerEmployee = totalHours / newEmployeeCount;
        System.out.println("Если в компании работает " + newEmployeeCount + " человек, то всего " + newHoursPerEmployee + " часов работы может быть поделено между сотрудниками");


    }
}