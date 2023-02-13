package psi_11_o.m17b_fichatrabalho5;

public class Ponto2D {
    private int x;
    private int y;
    
    public Ponto2D(){
        x = 0;
        y = 0;        
    }
    
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    public double distancia(Ponto2D a){
        return Math.abs(Math.sqrt(Math.pow((getX()-a.getX()),2)+Math.pow((getY()-a.getY()),2)));
    }

    @Override
    public String toString() {
        return "Ponto2D[" + getX() + "," + getY() + "]";
    }    

    /**
     * @return o valor do x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x define o valor de x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return o valor de y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y define o valor de y
     */
    public void setY(int y) {
        this.y = y;
    }
}
