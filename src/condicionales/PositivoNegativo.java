package condicionales;

public class PositivoNegativo {
    public static void main(String[] args) {
        //bucleIf(5);
        //bucleWhile(0);
        //bucleDoWhile(0);
        //bucleFor(0);
        //bucleSwitch("verano");
    }

    public static void bucleIf(int numeroIf) {
        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }
    }

    public static void bucleWhile(int numeroWhile) {
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }

    public static void bucleDoWhile(int numeroDoWhile) {
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);
    }

    public static void bucleFor(int numeroFor) {
        for (int i = 0; i < 3; i++) {
            System.out.println(numeroFor);
            numeroFor++;
        }
    }

    public static void bucleSwitch(String estacion) {
        switch (estacion) {
            case "verano" -> System.out.println("Estamos en verano");
            case "invierno" -> System.out.println("Estamos en invierno");
            case "primavera" -> System.out.println("Estamos en primavera");
            case "otoño" -> System.out.println("Estamos en otoño");
            default -> System.out.println("No es una estacion");
        }
    }

}
