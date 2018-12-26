
public abstract class Person{
    protected String surname;
    protected String name;
    Person(){}
    Person(String surname,String name){
        this.surname = surname;
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }

    public String toString(){
        return this.surname + " " + this.name;
    }
    public boolean equals(Object o){
        Person p = (Person)o;
        boolean ok = false;
        if(p.getSurname().equals(this.surname) && p.getName().equals(this.name)){
            ok = true;
        }
        return ok;
    }

}
