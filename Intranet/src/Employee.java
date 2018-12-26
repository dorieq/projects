public abstract class Employee extends User{
    protected int salary;
    protected int workExperience;
    Employee(){}
    Employee(String surname,String name,String login,String password,String id,int salary,int workExperience){
        super(surname,name,login,password,id);
        this.salary = salary;
        this.workExperience = workExperience;
    }
    Employee(User u,int salary,int workExperience){
        super(u,u.getLogin(),u.getPassword(),u.getId());
        this.salary = salary;
        this.workExperience = workExperience;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setWorkExperience(int workExperience){
        this.workExperience = workExperience;
    }
    public int getSalary(){
        return this.salary;
    }
    public int getWorkExperience(){
        return this.workExperience;
    }
    public String toString(){
        return super.toString() + " " + this.salary + " " + this.workExperience;
    }
    public boolean equals(Object o){
        Employee e = (Employee)o;
        boolean ok = false;
        if(super.equals(e) && e.getSalary() == this.salary && e.getWorkExperience() == this.workExperience){
            ok = true;
        }
        return ok;
    }
}
