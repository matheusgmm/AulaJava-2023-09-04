public class ExemploCondicional {
    
    public static void execute() {
        Boolean flag = false;

        if (flag) {
            System.out.println("Executa IF");

        } else {
            System.out.println("Executa ELSE");
        }

        String periodo = "Manhã";

        switch(periodo) {
            case "Manhã":
                System.out.println("Bom Dia");
            break;
            case "Tarde":
                System.out.println("Boa Tarde");
            break;
            case "Noite":
                System.out.println("Boa Noite");
            break;
            default:
                System.out.println("Valor Inválido");

        }

    };

}
