package Trabalho04;

public class Aresta {
    private int v;
    private int w;

    public Aresta(){
    }
    public Aresta(int v, int w){
        this.v = v;
        this.w = w;
    }

    public void setV(int v) {
        this.v = v;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getV() {
        return v;
    }

    public int getW() {
        return w;
    }

    @Override
    public String toString() {
        return "Atividade04.Aresta Existente{" +
                + v +
                " -> " + w +
                '}';
    }
}
