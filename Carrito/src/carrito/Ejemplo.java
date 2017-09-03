/* Ejercicio: Ejemplo del carrito
 @author: Rodríguez de la Mora Elizabeth Dayanne
 @version:  1.0 */
package carrito;

import java.util.Scanner;

public class Ejemplo {

    Scanner Leer = new Scanner(System.in);
    private String nombre, genero, total;
    private int r1, r2, r3, r4, r5, r6, r7, r8;
    private int semestre;
    //Pregunta datos al usuario
    public void Datos() {
        System.out.println("---------¿Como tener pareja en Batiz?--------");
        System.out.println("Nombre");
        nombre = Leer.next();
        System.out.println("Genero (M/F)");
        genero = Leer.next();
        System.out.println("Semestre");
        semestre = Leer.nextInt();
        System.out.println("¿Tienes pareja?");
        System.out.println("1.- Si");
        System.out.println("2.- No");
        r1 = Leer.nextInt();
    }
    //Realiza el test para encontrar pareja
    public void Cases() {
            switch (r1) {
                case 1:
                    total = "No necesitas este programa";
                    break;
                case 2:
                    if (genero.equals("M")) {
                        System.out.println("¿Quieres una?");
                        System.out.println("1.- Si");
                        System.out.println("2.- No");
                        r2 = Leer.nextInt();
                        if (r2 == 1) {
                            System.out.println("¿Eres guap@");
                            System.out.println("1.- Si");
                            System.out.println("2.- No");
                            r3 = Leer.nextInt();
                            if (r3 == 1) {
                                System.out.println("Solo tienes que esperar a que alguien se fije en ti ;)");
                            } else if (r3 == 2) {
                                System.out.println("¿Vas al GYM?");
                                System.out.println("1.- Si");
                                System.out.println("2.- No");
                                r4 = Leer.nextInt();
                                if (r4 == 1) {
                                    System.out.println("Solo tienes que esperar a que alguien se fije en ti ;)");
                                } else if (r4 == 2) {
                                    System.out.println("¿Eres inteligente?");
                                    System.out.println("1.- Si");
                                    System.out.println("2.- No");
                                    r5 = Leer.nextInt();
                                    if (r5 == 1) {
                                        System.out.println("Solo tienes que esperar a que alguien se fije en ti ;)");
                                    } else if (r5 == 2) {
                                        System.out.println("¿Estas inscrito o eres semi regular?");
                                        System.out.println("1.- Si");
                                        System.out.println("2.- No");
                                        r6 = Leer.nextInt();
                                        if (r6 == 1) {
                                            System.out.println("Puede haber alguien haya afuera esperando por ti");
                                        } else if (r6 == 2) {
                                            System.out.println("¿Creditos o dictamen?");
                                            System.out.println("1.- Creditos");
                                            System.out.println("2.- Dictamen");
                                            r7 = Leer.nextInt();
                                            if (r7 == 1) {
                                                System.out.println("Puede haber alguien en algun grupo alterno con quien hagas match");
                                            } else if (r7 == 2) {
                                                System.out.println("Mejor ponte a estudiar >:V");
                                            }
                                        }
                                    }

                                }

                            }
                        } else if (r2 == 2) {
                            System.out.println("No necesitas este programa");
                        }
                    } else if (genero.equals("F")) {
                        System.out.println("Solo tienes que esperar");
                    }

            }

        }
    }
