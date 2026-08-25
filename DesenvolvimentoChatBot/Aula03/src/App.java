import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Sou o assistente virtual.");
        System.out.print("Digite uma mensagem: ");
        String mensagem = scanner.nextLine();
        mensagem = mensagem.toLowerCase();
        mensagem = mensagem.trim();
        int resposta = 0;

        while (resposta != 5) {
        if (mensagem.contains("olá") || mensagem.contains("ola") || mensagem.contains("oi")) {
            System.out.println("Olá! Como posso ajudar?");
            mensagem = scanner.nextLine();
            mensagem = mensagem.toLowerCase();
            mensagem = mensagem.trim();
        } else {
            System.out.println("Não entendi, você pode reformular a pergunta?");
            mensagem = scanner.nextLine();
            mensagem = mensagem.toLowerCase();
            mensagem = mensagem.trim();
        }
        if (mensagem.contains("bib")) {
            resposta = 1;
        }
        if (mensagem.contains("secretaria")) {
            resposta = 2;
        }
        if (mensagem.contains("matricula")) {
            resposta = 3;
        }
        if (mensagem.contains("obrigado") || mensagem.contains("obg")) {
            resposta = 4;
        }
        if (mensagem.contains("tchau")) {
            resposta = 5;
        }
        switch (resposta) {
            case 1:
            System.out.println("\nA biblioteca funciona das 07h às 22h.");
            System.out.println("Te ajudo com algo mais?");
            mensagem = scanner.nextLine();
            mensagem = mensagem.toLowerCase();
            if (mensagem.contains("sim")) {
                resposta = 0;
                mensagem = "oi";
            } else {
                resposta = 5;
            }
            break;
            case 2:
            System.out.println("\nA secretaria funciona das 08h às 18h");
            System.out.println("Te ajudo com algo mais?");
            mensagem = scanner.nextLine();
            mensagem = mensagem.toLowerCase();
            if (mensagem.contains("sim")) {
                resposta = 0;
                mensagem = "oi";
            } else {
                resposta = 5;
            }
            break;
            case 3:
            System.out.println("\nPara realizar sua matrícula, acesse o portal acadêmico.");
            System.out.println("Te ajudo com algo mais?");
            mensagem = scanner.nextLine();
            mensagem = mensagem.toLowerCase();
            if (mensagem.contains("sim")) {
                resposta = 0;
                mensagem = "oi";
            } else {
                resposta = 5;
            }
            break;
            case 4:
            System.out.println("\nPor nada!");
            System.out.println("Te ajudo com algo mais?");
            mensagem = scanner.nextLine();
            mensagem = mensagem.toLowerCase();
            if (mensagem.contains("sim")) {
                resposta = 0;
                mensagem = "oi";
            } else {
                resposta = 5;
            }
            break;
            case 5:
            System.out.println("\nAté mais!");
            break;
            case 6:
            break;
        }
    }

    }
}
