//package realization;

enum orderType{ NEW, ACCEPTED,REJECTED }

public class Order {
    private String message;
    private orderType type;
    Order(){}
    Order(String message,orderType type){
        this.message = message;
        this.type = type;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public void setType(orderType type){
        this.type = type;
    }
    public String getMessage(){
        return this.message;
    }
    public orderType getType(){
        return this.type;
    }
}
