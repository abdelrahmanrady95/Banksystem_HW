
public class Saving extends Account {
    //Atributes
    float Interst;
    //constructors
    public Saving(float Interst, float Balance){
        super(Balance);
        this.Interst=Interst;
    }
    //Methods
    public Saving(){
        Interst=0.0f;
    }
    //Getter
    public float getinterst(){
        return Interst;
    }
    //Setter
    public void setinterst(float Interst){
        this.Interst=Interst;
        
    }
    
}
