import java.util.Scanner;

public class Penalti {
    public static void main(String[] args) throws InterruptedException {
        int player,maquina;
        Scanner jogo = new Scanner(System.in);
        System.out.println("======PENALIDADE MÁXIMA======");
        System.out.println("");
        System.out.println("1. Canto Direito");
        System.out.println("2. Canto Esquerdo");
        System.out.println("3. Centro");
        System.out.println("");
        System.out.println("Onde será o chute:");
        //player
        player = jogo.nextInt();
        switch (player){
            case 1:
                System.out.println("Jogador chutou no canto direito...");
                break;
            case 2:
                System.out.println("Jogador chutou no canto esquerdo...");
                break;
            case 3:
                System.out.println("Jogador chutou no meio...");
                break;
            default:
                System.out.println("ISOLOUU!!!");
                break;
        }
        System.out.println("");
        new Thread().sleep(3000);
        //máquina
        maquina = (int)(Math.random()*3 + 1);
        switch (maquina) {
            case 1:
                System.out.println("Goleiro pulou na direita");
                break;
            case 2:
                System.out.println("Goleiro pulou na esquerda");
                break;
            case 3:
                System.out.println("Goleiro ficou no meio");
                break;
        }
        //vencedor
        if (player == maquina){
            System.out.println("SAI QUE É SUA TAFAREL!!!");
        }
        if (player != maquina){
            System.out.println("OLHA O GOL, OLHA O GOL, OLHA O GOL,GOOOOOL");
        }
        jogo.close();

    }
}