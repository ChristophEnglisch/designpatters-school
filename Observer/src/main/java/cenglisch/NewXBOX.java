package cenglisch;


public class NewXBOX extends Subject {
    public NewXBOX(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public boolean isVerfuegbar(){
        return this.verfuegbar;
    }
}
