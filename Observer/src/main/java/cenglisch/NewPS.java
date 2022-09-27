package cenglisch;

import cenglisch.Subject;

public class NewPS extends Subject {
    public NewPS(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public boolean isVerfuegbar(){
        return this.verfuegbar;
    }
}
