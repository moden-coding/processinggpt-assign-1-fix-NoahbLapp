import processing.core.*;

public class App extends PApplet {
    int bgColor = color(50,30,240);
    public void settings(){
        size(400,400);
        
    }
    public void setup(){
        background(bgColor);
        stroke(66);
        strokeWeight(3);
        fill(20,190,10);
        ellipse(100,55,90,90);
        ellipse(300,55,90,90);
        fill(0,0,0);
        rect(55,100,90,110);
        rect(255,100,90,110);
        stroke(210,30,10);
        strokeWeight(25);
        line(100,300,300,300);
    }
    public static void main(String[] args)  {
        PApplet.main("App");
    }
}
