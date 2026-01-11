public class App {
    public static void main(String[] args) throws Exception {
        int [][] num = new int [4][5];
        int [] sumaColumna = new int [5];
        int sumaTotalGeneral = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Fila " + i + ", Columna " + j + ": ");
                num[i][j] = (int)(Math.random() * 900) + 100;
            }
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                Thread.sleep(300);
                System.out.printf("%5d", num[i][j]);
                sumaFila += num [i][j];
                sumaColumna[j] += num [i][j];
            }
            Thread.sleep(600);
            System.out.printf(" | SUMA:%5d", sumaFila);
            System.out.println();
        }

        System.out.println("---------------------------------------------");

        for (int i = 0; i < 5; i++) {
            Thread.sleep(300);
            System.out.printf("%5d", sumaColumna[i]);
            sumaTotalGeneral += sumaColumna[i]; 
        }
        Thread.sleep(600);
        System.out.printf(" | TOTAL:%5d", sumaTotalGeneral);
        System.out.println();
    }
}
