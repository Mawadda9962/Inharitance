public class Person {
    String name;
    Double age;
    String address;
    String nationality;

    public Person(){

    }

    public Person(String name, Double age, String address, String nationality) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
