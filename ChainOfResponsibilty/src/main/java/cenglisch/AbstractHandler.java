package cenglisch;

abstract public class AbstractHandler {
    private AbstractHandler next;

    public AbstractHandler setNext(AbstractHandler next) {
        this.next = next;

        return this;
    }

    private void druckeHinweis(Einkauf einkauf){
        System.out.println();
    }

    protected void weiterleiten(Einkauf einkauf){
        next.verkaufen(einkauf);
    }

    public abstract void verkaufen(Einkauf einkauf);
}
