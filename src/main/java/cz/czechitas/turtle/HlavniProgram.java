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

nakresliTreuhelnik(150, new Color(50,250,100));
zofka.penUp();
zofka.turnRight(180);
zofka.move(200);
zofka.penDown();
nakresliCtverecek(200, Color.red);
zofka.penUp();
zofka.turnLeft(90);
zofka.move(250);
zofka.penDown();

nakresliObdelnik(150, new Color(150,25,200));

zofka.penUp();
zofka.move(300);
zofka.penDown();

nakresliKrug(30, Color.red);
    }

private void nakresliKrug(int delkaStrany, Color barva) {
   zofka.setPenColor(barva);
   for (int i = 0; i < 18; i++) {
   zofka.move(delkaStrany);
   zofka.turnRight(20);
        }
    }

    private void nakresliObdelnik(int delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        var velikostPrepony = Math.sqrt(2*Math.pow(delkaStrany, 2));
        for (int i = 0; i <2 ; i++) {
   zofka.move(delkaStrany);
   zofka.turnLeft(90);
   zofka.move(velikostPrepony);
   zofka.turnLeft(90);
           }
    }


    private void nakresliTreuhelnik(int delkaStrany, Color barva) {
    zofka.setPenColor(barva);
    for (int i = 0; i < 3; i++) {
        zofka.turnRight(30);
        zofka.move(delkaStrany);
        zofka.turnRight(90);
    }
}

public void nakresliCtverecek(int delkaStrany, Color barva) {
    zofka.setPenColor(barva);
    for (int i = 0; i < 4; i++) {
        zofka.move(delkaStrany);
        zofka.turnRight(90);

    }
}

}




