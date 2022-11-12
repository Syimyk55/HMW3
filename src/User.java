public class User {
    private String name;
    private Integer age;

    public String getName() {

        return name;
    }

    public void setName(String name) throws IllegalNameLengthException {
        if (name.length() > 20){
            throw new IllegalNameLengthException("Ошибка. в имени не должно быть больше 20 символов, вы ввели "+name);
        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age <= 0 || age >= 100){
            throw new IllegalAgeException("Ошибка.возраст не может быть меньше 0 или больше 100. "+"Вы задали "+age); }
        this.age = age;
    }
}
