public class Main {
    public static void main(String[] args) {
        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var totalWeight = oneBoxer + twoBoxer;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        var weightDifference = oneBoxer - twoBoxer;
        System.out.println("Разница в весе " + weightDifference + " кг!");

        var bigSmaller = twoBoxer - oneBoxer;
        System.out.println("Вычитание из большего веса меньшего " + bigSmaller);
        var remnant = twoBoxer % oneBoxer;
        System.out.println("Функция остаток от деления " + remnant);

        var totalTime = 640;
        var employeeTime = 8;
        var totalWorkers = totalTime / employeeTime;
        System.out.println("Всего работников в компании " + totalWorkers + " человек");
        var workers = 94;
        var finalNumberOfWorkers = totalWorkers + workers;
        var generalTime = finalNumberOfWorkers * employeeTime;
        System.out.println("Если в компании работает " + finalNumberOfWorkers + " человек, то всего " + generalTime + " часов работы может быть поделено между сотрудниками");
    }
}