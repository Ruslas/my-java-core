package lesson8.student;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        Aspirant aspirant1 = new Aspirant("Геннадий", "Вальтер", "ГР-13-1", 4.2, "Радары");
        Student student2 = aspirant1;

        student1.printStudent();
        System.out.println(student1.getScholarship());
        aspirant1.printStudent();
        System.out.println(aspirant1.getScholarship());
        student2.printStudent();
        System.out.println(student2.getScholarship());

        Student student3 = new Student("Раптор", "Рекс", "РР-16-3", 5);
        Student student4 = new Student("Глеб", "Неверов", "КТ-17-1", 3.2);
        Aspirant aspirant2 = new Aspirant("Тимур", "Авдеев", "НП-17-2", 4.1, "Сети");
        Aspirant aspirant3 = new Aspirant("Реал", "Магаз", "РН-17-2", 4.8, "Радиосвязь");

        aspirant2.printStudent();

        Student[] students = {student1, student2, student3, student4, aspirant1, aspirant2, aspirant3};
        for (Student student : students) {
            System.out.println(student.getFirstName() + " получает " + student.getScholarship());
        }

        Student aspirant4 = new Aspirant("Федор", "Димас", "ГП-17-2", 4.8, "Связь");
        aspirant4.printStudent();
    }
}
