package main.java.Stream;

public class Data {
    private  String name;
    private String sex;
    private  int age;
    private  String email;

    public Data() {
        super();
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public Data(String name, String sex, int age, String email) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
