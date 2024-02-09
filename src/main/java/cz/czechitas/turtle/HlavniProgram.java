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

//zmrzlina
//nakresliKrug(100, Color.blue);
//
//zofka.penUp();
//zofka.turnRight(180);
// for (int i = 0; i <3 ; i++) {
//   zofka.move(2*0.08715574274*100);
//   zofka.turnLeft(10);
//        }
//zofka.penDown();
// zofka.turnLeft(90);
// nakresliTreuhelnik(180,  Color.ORANGE);

//snehulak
nakresliKrug(50, Color.CYAN);
otockaKolo(50);
nakresliKrug(80, Color.blue);
otockaKolo(80);
nakresliKrug(20,Color.cyan);
zofka.turnLeft(75);
zofka.penUp();
zofka.move(160);
zofka.turnLeft(90);
zofka.penDown();
nakresliKrug(20, Color.cyan);
zofka.turnLeft(140);
zofka.penUp();
zofka.move(102);
zofka.penDown();
zofka.turnLeft(128);
nakresliKrug(100, Color.blue);
    }

    private void otockaKolo(double radiusStrany) {
        zofka.penUp();
        zofka.turnRight(180);
        for (int i = 0; i <8 ; i++) {
          zofka.move(2*0.08715574274*radiusStrany);
          zofka.turnLeft(12);
               }
        zofka.penDown();
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




