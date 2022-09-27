package cenglisch;

public interface Observer {
    void aktualisiere();
    Customer aufWunschliste(Subject subject);
    Customer runterVonWunschliste(Subject subject);
}
