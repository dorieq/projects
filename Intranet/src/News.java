
public class News {
    protected String news;

    public void setNews(String news){
        this.news = news;
    }
    public void addNews(String news){
        this.news+=(news + "\n");
    }
    public String getNews(){
        return this.news;
    }
}
