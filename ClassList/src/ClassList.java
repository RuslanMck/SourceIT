public class ClassList {
    public static void main(String[] args) {

        Student[] array = {

                new Student("Повитчан", "Владимир", 24),
                new Student("Повитчан", "Александр", 23),
                new Student("Марчук", "Руслан", 20),
                new Student("Морозов", "Дмитрий", 21),
                new Student("Батанов", "Дмитрий", 19),
                new Student("Глущенко", "Рената", 22),
                new Student("Щукина", "Анастасия", 30),
                new Student("Сибилев", "Богдан", 18),
                new Student("Соловей", "Никита", 22),
                new Student("Симоненко", "Татьяна", 25),
                new Student("Бондарев", "Дмитрий", 29),
                new Student("Жидкова", "Александра", 11),
                new Student("Шумаков", "Сергей", 25),
                new Student("Москаленко", "Оксана", 22)
        };

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getName() + " ");
        }
    }

    static class Student {

        String name = "";
        String second = "";
        int age;

        public Student(String n, String s, int a) {

            name = n;
            second = s;
            age = a;
        }

        public String getName() {

            return name + " " + second + " " + age;
        }
    }
}