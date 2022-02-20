import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
            String[] impressao = new String[6];
            int j; // contador dos espaços
            int k = 6; // contador dos asteríscos

                for (j = 0; j < k; j++) {  //loop dos espaços em branco
                    impressao[j] = " ";
                }
                for (k = 5; k >= 0; k--) {  //loop dos asteríscos
                    impressao[k] = "*";

                    System.out.println(Arrays.toString(impressao));
                }

    }
}

