import java.util.Scanner;

//==============================incremento e decremento pre e pos FIXado==============================================
/*
  public class Main {
      public static void main(String[] args) {
          System.out.println("INCREMENTO PÓS FIXADO ");
          Scanner leitura = new Scanner(System.in);
          int a = 8;
          int b = a++;
          System.out.println(a); //na linha 9 incrementa 1 na variavel A
          System.out.println(+b+ "\n"); // variável B recebe variavle A antes de incrementar.

          System.out.println("INCREMENTO PRÉ FIXADO: ");
          int c = 8;
          int e = ++c;
          System.out.println(c);  // imprime C com incremento;
          System.out.println(e);  // imprime E com incremento;


      }
  }
*/
//=================================================================================================
          /*
          public class Main {
           public static void main(String[] args) {
          System.out.println("digite um numero");
          int numero = leitura.nextInt();
          System.out.println("digite outro numero");  // considerando o usuario digitar 10+10=20
          int numero2 = leitura.nextInt();
          int resultado = numero2+numero; // resultado = 20
          resultado++;
          System.out.println("o resultado com incremento POS FIXADO É " +resultado); // 20+1 resultado 21
          resultado--;
          System.out.println("o resultado com decremento POS FIXADO É " +resultado); // 21-1 resultado 20
          System.out.println();
          System.out.println();
          ++resultado;
          System.out.println("o resultado com incrememento PRÉ FIXADO É " +resultado);
          --resultado;
          System.out.println("o resultado com decremneto pre fixado é " +resultado);
      }
      }*/
//=================================================================================================================
//                        =======RETOMAR CARACTER PASSANDO PARA MAIUSCULO OU MINUSCULO======
/*
public class Main {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
//          vamos obter o caracter digitado apos a primeira palavra
        System.out.println("Deseja iniciar: (S/N): ");
        String  letra = leitura.next(); //faz a leitura e salva na variavel letra
        char continuar = letra.charAt(0); //extrai o primeiro caracter da string

//          Uma maneira mais direta de fazer o mesmo:
//          -extrai de [leitura.next()] o primeiro caracter com:
//          -leitura.next().charAt()
//          -ou seja, ao inves de fazer como na linha 53 e 54, tudo e feito em uma unica linha, como mostra a linha 61
        System.out.println("Deseja continuar: (S/N): " );
        continuar = leitura.next().charAt(0);

//        transformar o que está na variável char continuar em minusculo
        char minusculo = Character.toLowerCase(continuar);
        System.out.println("agora minusculo: " +minusculo);

        char mauisculo = Character.toUpperCase(continuar);
        System.out.println("agora mauisculo: " +mauisculo);
      }
  }

*/

/*public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
//        double total, combustivel, kmPercorrido = 0; poderia ter declarado todas as variaveis em uma unica linha
//        pois sáo do  tipo double. ou seja, o mesmo tipo de dado.

        System.out.println("==============medidor autonomia===============");
        System.out.println("digite a quantidade de combustivel que gastou: ");
        double combustivel = leitura.nextInt();
        System.out.println("digite a quantidade de km percorrido ");
        double kmPercorrido = leitura.nextInt();
        double total =  kmPercorrido / combustivel;
        String totalFormatado = String.format("%.4f", total); //formatacao do TOTAL, para reduzir as casas decimais
        System.out.println("==============medidor autonomia===============");
        System.out.println("A autonomia do veículo é de " + totalFormatado + " km por litro"); // total foi para totalFormatado


        System.out.println('x');

    }
}
*/
//        =====================SINTAXE JAVA, EXEMPLO==================
//   Exemplos:
//System.out.println(“Hello World!”); // Saída: Hello World!
//System.out.println(“Soma = ”+ (1200 + 27)); // Saída: Soma = 1227
//System.out.println(“Consumo médio: ”+ consumoMedio);


//====================================================================================================
/*
1.2.4. Pratique
1) Enumere os tipos de dados primitivos da linguagem Java.
2) Conceitue variáveis e constantes e descreva sua sintaxe de declaração.
3) Supondo que seja necessário armazenar os valores abaixo em programas. Aponte que
tipo de dado ou que tipos, se houver mais de um, podem ser utilizados para armazenar
cada valor.

a) 613:             int
b) 613,0:           float
c) -613:            short
d) ‘6’:             int
e) -3.012 x 1015:   float
f) 1.7 x 1012:      float
g) -28.3 x 10 -23:  double
h) ‘F’:             bolean
i) “Curso de Programação em Java para Iniciantes”  : Uma string, por exemplo, String curso
j) Dois estados: ligado ou desligado :  Boolean

//                           //Instituto Federal de Minas Gerais//
//                               //Pró-Reitoria de Extensão//

4) Faça um programa em Java para somar dois números inteiros informados pelo usuário.
Lembre-se que é necessário que sua classe Java tenha o método main, isto é, que sua
classe seja uma classe executável.

5) Indique as saídas para o programa a seguir, em duas situações:
a) Supondo que o usuário informe 3 para x e 5 para y  == 3 e 5
b) Supondo que o usuário informe -5 para x e 7 para y  == -5 e 7
 */

/*

public class Main { //
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("digite um numero de -100 a +100 para Y ");
        byte y = leitura.nextByte();
        System.out.println("informe um numero -100 a +100 para 5\n");
        byte x = leitura.nextByte();
        System.out.println("a saida para x é " +x+ " a saida para y é " +y+ "\n");
        System.out.println("ïnforme um valor pra subtarcao ");


    }
}
*/

/*
6) Faça um programa em Java para ler o nome, o nome do meio e o sobrenome do usuário.
O programa deve extrair os caracteres iniciais de cada parte do nome. Em seguida, cada
caractere deve ser convertido para maiúsculo.
Pede-se:
 Supondo que você tenha dado os identificadores p, s, e t às variáveis dos
caracteres iniciais de cada parte do nome, imprima o conteúdo das três variáveis
na sequência, usando o comando:
𝑆𝑦𝑠𝑡𝑒𝑚. 𝑜𝑢𝑡. 𝑝𝑟𝑖𝑛𝑡(𝑝); 𝑆𝑦𝑠𝑡𝑒𝑚. 𝑜𝑢𝑡. 𝑝𝑟𝑖𝑛𝑡(𝑠); 𝑆𝑦𝑠𝑡𝑒𝑚. 𝑜𝑢𝑡. 𝑝𝑟𝑖𝑛𝑡(𝑡);
*/
public class Main{
public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("====leitura de nome=====");
    System.out.println("digite o primeiro nome: ");
    String nome = leitura.nextLine();
    System.out.println("digite  nome do meio: ");
    String nomeDoMeio= leitura.nextLine();
    System.out.println("digite o sobrenome: ");
    String sobreNome= leitura.nextLine();

    System.out.println("seu nome é " +nome+" " +nomeDoMeio+" " +sobreNome); // ou poderia fazer isso: 𝑆𝑦𝑠𝑡𝑒𝑚. 𝑜𝑢𝑡. 𝑝𝑟𝑖𝑛𝑡(𝑝); 𝑆𝑦𝑠𝑡𝑒𝑚. 𝑜𝑢𝑡. 𝑝𝑟𝑖𝑛𝑡(𝑠); 𝑆𝑦𝑠𝑡𝑒𝑚. 𝑜𝑢𝑡. 𝑝𝑟𝑖𝑛𝑡(𝑡);


}
}

/*
 Agora imprima usando o comando abaixo. Verifique que os valores inteiros
referentes a cada caractere serão somados e resultado será exibido. Isso ocorre
porque com o tipo char é possível realizar a operação de soma de seus números
inteiros associados. Lembre-se que cada caractere Unicode possui um número
inteiro correspondente
𝑆𝑦𝑠𝑡𝑒𝑚. 𝑜𝑢𝑡. 𝑝𝑟𝑖𝑛𝑡𝑙𝑛(𝑝 + 𝑠 + 𝑡);

 O problema anterior pode ser ajustado com o uso de uma String vazia
concatenada aos caracteres. Assim o compilador realizará a concatenação das
cadeias referentes aos caracteres com a String “”, ao invés de somar seus valores
na tabela de caracteres:
𝑆𝑦𝑠𝑡𝑒𝑚. 𝑜𝑢𝑡. 𝑝𝑟𝑖𝑛𝑡("" + 𝑐 + 𝑑 + 𝑒);



7) Faça um programa em Java para obter o nome e a idade do usuário. Seu programa deve
calcular e exibir o nome e a idade que o usuário terá em 2049. Exiba uma mensagem no
formato: < 𝑣𝑎𝑟𝑁𝑜𝑚𝑒 > 𝑣𝑜𝑐ê 𝑡𝑒𝑟á 𝑥𝑥 𝑎𝑛𝑜𝑠 𝑒𝑚 2049.

Esssa foi a primeira semana de estudos, dividida em 4 modulos */







