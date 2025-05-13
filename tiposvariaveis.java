public class tiposvariaveis {
    public static void main(String[] args) {
    // números inteiros

     // valores -128 a 127
     // armazenar pequenos valores (8 bit)
         byte idade = 127;

    // valores -32.768 a 32.767
    // armazenar valores pequenos (aguenta mais do que byte) (16 bits)
         short estoque = 32767;

    // valores -2.147.483.648 a 2.147.483.647
    // armazenar valores pequenos (aguenta mais do que short) (32 bits)
         int populacao = 2147483647;

    // valores -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
    // armazenar valores pequenos (aguenta mais do que int) (64 bits)
        long contaCorrente = 9223372036854775807L;
    //precisa colocar L ou l no final para indicar que é long




    //números decimais

    //7 casas decimais (se passar disso não mostra a partir da 8 casa) - 1234567 (4 bytes ou 32 bits) 
        float real = 10.1234567f; 
    //precisa colocar f ou F no final para indicar que é float
        
    // 15 casas decimais (se passar disso não mostra a partir da 16 casa) - 123456789012345 (8 bytes ou 64 bits)
        double real2 = 10.123456789012345;




    //recebe textos, palavras e frases
        String nome = "I am Bob :)";

    //suporta apenas um caractere, pode ser letra, número ou símbolo
        char inicial = 'B'; 
        //char só reconhece dentro de aspas simples


    //forma atual de declarar váriaveis
     // não precisa declarar o tipo, pois ele ja identifica o tipo da variável (deu erro não sei porque)
        var sobrenome = 'G';

        //true ou false
        boolean botaoAtivado = true;
        //não precisa colocar aspas simples ou duplas

  System.out.println(botaoAtivado);
    }
}
