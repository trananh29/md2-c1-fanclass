public class Fan {
    // make var ------------------------
    public int Slow=1;
    public   int Medium=2;
    public int Fast=3;
    private int  radius=5;
    private  String colour="blue";
    private int speed;
    boolean stastus=false;
    //make contructor ----------------
    public Fan(){}
//make method ------------------------
public void turnOn (){
        this.stastus=true;
}
public void turnOff(){
        this.stastus=false;
    }


    public int getRadius(){
       return this.radius;
    }
    public String getColour(){
       return this.colour;
    }
    public int getSpeed() {
       return this.speed;
    }
    public void setRadius (int a) {
        this.radius=a;
    }
    public void setSpeed(int a) {
       this.speed=a;
    }
    public void setColour(String a){
        this.colour=a;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                ", speed=" + speed +
                ", stastus=" + stastus +
                '}';
    }
}

