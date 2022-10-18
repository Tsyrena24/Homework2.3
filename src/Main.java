public class Main {
    public static void main(String[] args) {
        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var totalWeight = oneBoxer + twoBoxer;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        System.out.println("Разница в весе " + (twoBoxer - oneBoxer) + " кг!");

        var bigSmaller = twoBoxer - oneBoxer;
        System.out.println("Разница двух бойцов (1 способ) " + bigSmaller + " кг");
        var remnant = twoBoxer % oneBoxer;
        System.out.println("Разница двух бойцов (2 способ) " + remnant + " кг");

        var totalTime = 640;
        var employeeTime = 8;
        var totalWorkers = totalTime / employeeTime;
        System.out.println("Всего работников в компании " + totalWorkers + " человек");
        var workers = 94;
        var finalNumberOfWorkers = totalWorkers + workers;
        System.out.println("Если в компании работает " + finalNumberOfWorkers + " человек, то всего " + (finalNumberOfWorkers * employeeTime) + " часов работы может быть поделено между сотрудниками");
    }
}