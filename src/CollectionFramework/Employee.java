package CollectionFramework;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    private String name;
    private int id;
    private int score;
    public Employee(String name,int id,int score){
        this.name = name;
        this.id = id;
        this.score = score;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }
    public void setScore(){
        this.score =score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return(name+" "+ id +" "+score);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && score == employee.score && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, score);
    }

    @Override
    public int compareTo(Employee o) {
        return this.score-o.score;
    }
}
