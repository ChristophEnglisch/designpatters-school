package cenglisch;


public class NewGamingPC extends Subject {
    public NewGamingPC(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public boolean isVerfuegbar(){
        return this.verfuegbar;
    }
}
