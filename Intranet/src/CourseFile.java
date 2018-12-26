import java.util.Date;
public class CourseFile {
    private String title;
    private Date date;
    CourseFile(){}
    CourseFile(String title,Date date){
        this.title = title;
        this.date = date;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public Date getDate(){
        return this.date;
    }
}
