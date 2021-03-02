public class worker {
    private String name;
    private String post;
    private String email;
    private String telephone;
    private String pay;
    private String age;

    public worker(String name, String post, String email, String telephone, String pay, String age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.pay = pay;
        this.age = age;
    }

    public void information() {
        System.out.println("Сотрудник имя" + this.name + "Должность" + post + "Email + email" + "Телефон" + telephone + "Зарплата" + pay + "Возраст" + age);
    }
}




