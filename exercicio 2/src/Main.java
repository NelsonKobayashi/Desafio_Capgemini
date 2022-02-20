
import  java.util.regex.*;

public class Main {

    public static void main(String[] args) {

        String senha = "A#lalala@98";

        Pattern regex = Pattern.compile("^((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*-+()]).{6,}$)");
        Matcher m = regex.matcher(senha);
        System.out.println(m);
        if (m.matches()) {
            System.out.println("Senha cadastrada com sucesso!");
        } else {
                System.out.println("Sua senha deve conter:");
                System.out.println("- pelo menos 6 caracteres.");
                System.out.println("- pelo menos 1 número.");
                System.out.println("- pelo menos 1 letra minúscula.");
                System.out.println("- pelo menos 1 letra maiúscula.");
                System.out.println("- pelo menos uma caractere especial.");
                System.out.println("Tente novamente.");
        }
    }
}
