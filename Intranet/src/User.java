//package realization;

public abstract class User extends Person{
    protected String login;
    protected String password;
    protected String id;
    User(){}
    User(String surname,String name,String login,String password, String id){
        super(surname,name);
        this.login = login;
        this.password = password;
        this.id = id;
    }
    User(Person p,String login,String password,String id){
        super(p.getSurname(),p.getName());
        this.login = login;
        this.password = password;
        this.id = id;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getLogin(){
        return this.login;
    }

    public String getId(){
        return this.id;
    }
    protected String getPassword(){
        return this.password;
    }
    public String toString(){
        return super.toString() + " " + this.login + " " + this.id;
    }
    public boolean equals(Object o){
        User u = (User)o;
        boolean ok = false;
        if(super.equals(u) && u.getLogin().equals(this.login) && u.getId().equals(this.id)){
            ok = true;
        }
        return ok;
    }

}