public class Student {

    private String name;
    private int id;
    private int age;
    private String add;

    public Student(String name, int id, int age, String add) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.add = add;
    }

    public Student(){
        this.name = "";
        this.id = 0;
        this.age = 0;
        this.add = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
