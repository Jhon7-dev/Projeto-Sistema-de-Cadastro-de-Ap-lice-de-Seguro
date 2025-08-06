import java.util.Scanner;

public class MainApolice {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          Apolice apolice = new Apolice ();
          char opcao;
          do{
               System.out.println("=== MENU ===");
               System.out.println("1 - Criar Apólice");
               System.out.println("2 - Ver Dados Apólice");
               System.out.println("3 - Sair");
               opcao = scanner.nextLine().charAt(0);
               switch (opcao) {
                    case '1':{

                         System.out.println(" ==== CRIAÇÃO DE APÓLICE ====");
                         System.out.print("Número: ");
                         apolice.setNumero(scanner.nextInt()); // Apenas chama o método, não atribui
                         scanner.nextLine(); // Consome o ENTER pendente do nextInt
                         System.out.print("Nome: ");
                         apolice.setNome(scanner.nextLine()); // Agora sim, corretamente
                         System.out.print("Idade: ");
                         apolice.setIdade(scanner.nextInt());
                         scanner.nextLine();
                         System.out.print("Sexo: ");
                         apolice.setSexo(scanner.nextLine().charAt(0));
                         System.out.print("Valor do Automóvel: ");
                         apolice.setValorAutomovel(scanner.nextDouble());

                         // CÁLCULO DO VALOR DA APÓLICE
                         apolice.calcularValorApolice();

                         System.out.println("CADASTRO REALIZADO COM SUCESSO!");
                         System.out.println("Segue em Anexo o cadastro da Apólice com resumo do cadastro.");
                         apolice.imprimirDadosApolice();
                         break;
                       }
                       case '2':{
                              System.out.println("==== CONSULTA DA APÓLICE ===");
                              apolice.imprimirDadosApolice();
                              break;
                       }  
                       case '3':{
                         System.out.println("ATÉ BREVE!");
                         break;
                       }
                       default:{
                         System.out.println("errrorrr!!!!");
                       }
               }
          }while(opcao != '3');
          System.out.println("Programa encerrado!");
     }
}
