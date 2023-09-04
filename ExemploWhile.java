public class ExemploWhile {
    
    public static void execute() {
        int contWhile = 0;

        while(contWhile < 4){
            System.out.println("While: " + contWhile);
            contWhile++;
        }

        int contDoWhile = 0;

        do {
            System.out.println("DoWhile: " + contDoWhile);
            contDoWhile++;

        } while(contDoWhile < 4);
    }
}
