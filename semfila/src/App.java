import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome de usuário: ");
        String usuario_registro = leitor.nextLine();



        

        System.out.print("Digite sua senha: ");
        String senha = leitor.nextLine();
        System.out.print("Confirme sua senha: ");
        String senha_registro = leitor.nextLine();

        String admin_usuario;
        String admin_senha;

        admin_usuario = "gustavoeduardo";
        admin_senha = "123456";
        

        

        if (usuario_registro.equals(admin_usuario) && senha.equals(admin_senha)) {
            System.out.println("Logado com sucesso");
        } else {
            System.out.println("Usuário ou senha incorretos!");
        };
        

    leitor.close();
    }

    
}
