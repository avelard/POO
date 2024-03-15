import java.util.Scanner;

public class App {
    static Turma[] turmas = new Turma[10];
    static int quantidadeTurma = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {   
        int opcao = 0;
        do{
            exibirMenu();
            opcao = scanner.nextInt();
            roteador(opcao);

        } while(opcao != 0);        
    }
    public static void roteador(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarTurma();
                break;
            case 2:
                cadastrarCampus();
                
                break;
            case 3:
                cadastrarCurso();
                
                break;
            case 4:
                cadastrarEstudante();
                
                break;
            case 5:
                cadastrarMatricula();
                break;
            case 6:
                gerarRelatorio();
                break;
            default:
                if (opcao != 0){
                    System.out.println("Opção Inválida!");
                }
                break;    
        }
    }
    private static void gerarRelatorio() {
        for (int i = 0; i < quantidadeTurma; i++) {
            System.out.println("Nome turma: " + turmas[i].nome);
            System.out.println("Numero minimo: " + turmas[i].numeroMinimo);
            System.out.println("Ano de Ingresso: " + turmas[i].anoIngresso);            
        }
    }
    private static void cadastrarMatricula() {
        for (int i = 0; i < quantidadeTurma; i++) {
            System.out.println("Nome turma: " + turmas[i].);
            System.out.println("Numero minimo: " + turmas[i].numeroMinimo);
            System.out.println("Ano de Ingresso: " + turmas[i].anoIngresso);            
        }
    }
    private static void cadastrarEstudante() {
    }
    private static void cadastrarCurso() {
    }
    private static void cadastrarCampus() {
    }
    private static void cadastrarTurma() {
        scanner.nextLine(); // APAGA O \n
        Turma turma = new Turma();
        System.out.println("Digite o nome da turma: ");
        turma.nome = scanner.nextLine();
        System.out.println("Digite o numero minimo de alunos: ");
        turma.numeroMinimo = scanner.nextInt();
        System.out.println("Digite o ano de ingresso: ");
        turma.anoIngresso = scanner.nextInt();
        turmas[quantidadeTurma] = turma;
        quantidadeTurma++;

    }
    public static void exibirMenu() {
        System.out.println("--------------------------------------");
        System.out.println("             MENU");
        System.out.println("Digite 1 para cadastro de turma: ");
        System.out.println("Digite 2 para cadastro de campus: ");
        System.out.println("Digite 3 para cadastro de curso: ");
        System.out.println("Digite 4 para cadastro de estudante: ");
        System.out.println("Digite 5 para cadastro de matricula: ");
        System.out.println("Digite 6 para exibir tudo: ");
        System.out.println("Digite 0 para sair : ");
        System.out.println("--------------------------------------");
    }
}
