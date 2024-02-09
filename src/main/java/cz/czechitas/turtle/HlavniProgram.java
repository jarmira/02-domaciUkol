package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        //TODO Tady bude kód pro kreslení želví grafiky.

nakresliTreuhelnik(-150.23d, new Color(50,250,100));

zofka.penUp();
zofka.turnRight(180);
zofka.move(200);
zofka.penDown();

nakresliCtverecek(200, Color.red);

zofka.penUp();
zofka.turnLeft(90);
zofka.move(250);
zofka.penDown();

nakresliObdelnik(-100, 200,  new Color(150,25,200));

zofka.penUp();
zofka.move(300);
zofka.turnLeft(90);
zofka.move(300);
zofka.turnRight(180);
zofka.penDown();

nakresliKrug(200, Color.red);
    }

private void nakresliKrug(double radiusStrany, Color barva) {
   zofka.setPenColor(barva);
   for (int i = 0; i < 36; i++) {
   zofka.move(2*0.08715574274*radiusStrany);
   zofka.turnRight(10);
        }
    }

    private void nakresliObdelnik(double delkaStranyA,double delkaStranyB, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i <2 ; i++) {
   zofka.move(delkaStranyA);
   zofka.turnLeft(90);
   zofka.move(delkaStranyB);
   zofka.turnLeft(90);
           }
    }


    private void nakresliTreuhelnik(double delkaStrany, Color barva) {
    zofka.setPenColor(barva);
    for (int i = 0; i < 3; i++) {
        zofka.turnRight(30);
        zofka.move(delkaStrany);
        zofka.turnRight(90);
    }
}

public void nakresliCtverecek(double delkaStrany, Color barva) {
    zofka.setPenColor(barva);
    for (int i = 0; i < 4; i++) {
        zofka.move(delkaStrany);
        zofka.turnRight(90);

    }
}

}




