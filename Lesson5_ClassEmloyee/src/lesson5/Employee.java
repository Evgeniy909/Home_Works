package lesson5;

public class Employee {
    private String name;//Имя
    private String lastName;//Фамилия
    private String patronymic;//Отчество
    private int age;//Возраст
    private String email;
    private String phoneNumber;
    private String post;//Должность
    private int salary;//Зарплата

    public Employee(String lastName, String name, String patronymic, int age, String email, String phoneNumber, String post, int salary) {
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.post = post;
        this.salary = salary;
    }

    //region getters

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPost() {
        return post;
    }

    public int getSalary() {
        return salary;
    }
    //endregion

    public void showInfo() {
        System.out.println("Информация о сотруднике");
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + patronymic);
        System.out.println("Возраст: " + age);
        System.out.println("Электронный адрес: " + email);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println("Должность: " + post);
        System.out.println("Размер заработной платы: " + salary + "р.\n");
    }
}
