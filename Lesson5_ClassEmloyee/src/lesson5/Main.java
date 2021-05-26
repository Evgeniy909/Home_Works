package lesson5;

public class Main {

    public static void main(String[] args) {

//region [ArrayEmployee]

        Employee[] EmployeeArray = new Employee[5];

        EmployeeArray[0] = new Employee(
                "Иванов",
                "Иван",
                "Иванович",
                34,
                "ivan@ja.ru",
                "+764 499 33 22",
                "Инженер",
                44000);

        EmployeeArray[1] = new Employee(
                "Петров",
                "Пётр",
                "Петрович",
                42,
                "petr@ja.ru",
                "+7 443 322 22 29",
                "Менеджер",
                38000);

        EmployeeArray[2] = new Employee(
                "Сидоров",
                "Вадим",
                "Дмитриевич",
                25,
                "VadimS@ja.ru",
                "+7 656 436 53 42",
                "Администратор",
                35000);

        EmployeeArray[3] = new Employee(
                "Сидорова",
                "Елена",
                "Владимировна",
                51,
                "ElenaS@ja.ru",
                "+7 656 436 42 53",
                "Зам. администратора",
                35000);

        EmployeeArray[4] = new Employee(
                "Козлов",
                "Сергей",
                "Александрович",
                54,
                "KozlovS@ja.ru",
                "+7 433 075 43 43",
                "Токарь",
                65000);
//endregion

        for (int i = 0; i < EmployeeArray.length; i++) {
            if (EmployeeArray[i].getAge() > 40) {
                EmployeeArray[i].showInfo();
            }
        }

    }

}
