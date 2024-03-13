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
        String totalFormatado = String.format("%.4f", total); //formatacao do TOTAL, para reduzir as casas decimais (TAG: ARREDONDAR NUMERO
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

/*
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

    char caracter1 = nome.charAt(0); // entre os parenteses, se define o numero de caracters que se deseja imprimir
    char caracter2 = nomeDoMeio.charAt(0);
    char caracter3 = sobreNome.charAt(0);
//  System.out.println(caracter1+caracter2+caracter3); veja que se somassemos um nome, ele apresentaria um valor, isso acontece porque cada caracte possui um valor unicode
    System.out.println("as iniciais do nome sao \n" +caracter1+ "\n" + caracter2 + "\n" + caracter3);
//  se o nome digitado fosse joao vit
}
}



/*
// Agora imprima usando o comando abaixo. Verifique que os valores inteiros
//referentes a cada caractere serão somados e resultado será exibido. Isso ocorre
//porque com o tipo char é possível realizar a operação de soma de seus números
//inteiros associados. Lembre-se que cada caractere Unicode possui um número
//inteiro correspondente
//𝑆𝑦𝑠𝑡𝑒𝑚. 𝑜𝑢𝑡. 𝑝𝑟𝑖𝑛𝑡𝑙𝑛(caracter1 + caracter2 + caracter3);

 O problema anterior pode ser ajustado com o uso de uma String vazia
concatenada aos caracteres. Assim o compilador realizará a concatenação das
cadeias referentes aos caracteres com a String “”, ao invés de somar seus valores
na tabela de caracteres:
𝑆𝑦𝑠𝑡𝑒𝑚. 𝑜𝑢𝑡. 𝑝𝑟𝑖𝑛𝑡("" + 𝑐 + 𝑑 + 𝑒);



7) Faça um programa em Java para obter o nome e a idade do usuário. Seu programa deve
calcular e exibir o nome e a idade que o usuário terá em 2049. Exiba uma mensagem no
formato: < 𝑣𝑎𝑟𝑁𝑜𝑚𝑒 > 𝑣𝑜𝑐ê 𝑡𝑒𝑟á 𝑥𝑥 𝑎𝑛𝑜𝑠 𝑒𝑚 2049.
*/
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu nome ");
        String nome = scanner.nextLine();
        System.out.println("digite sua idade ");
        int idade = scanner.nextInt();
        int idadetotal = 2024 - idade;
        int cyberidade = idade + 25;
        System.out.println("Seu nome é " +nome+ "\n em 2049 vocë tera " +cyberidade + " anos de idade");

    }
}
*/

//==========================================CALCULO AREA DE UM CIRCULO==================================================
/*
public class Main {
    public static void main (String[] args){
        Scanner leitura = new Scanner(System.in);
        double raio, area;
        System.out.println("infome o raio da circunferencia ");
        raio = leitura.nextDouble();
        area = Math.PI*Math.pow(raio, 2);
        String totalFormatado = String.format("%.4f", area); // total de casa apos a virgula
        System.out.println("area do circulada pela circunferencia: " +totalFormatado);



    }

}
 */
//-========================================CALCULO SALARIAL VENDEDOR====================================================

// O QUE O PROGRAMA DEVE RECEBER? salário fixo, total de vendas e percentual de comissão sobre as vendas. Em seguida,
//calcular e exibir o salário final a receber.

/**/
/*
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" your seller salary ");
        double salary = scanner.nextDouble();

        System.out.println("\n enter total sales");
        double allSales = scanner.nextDouble();

        System.out.println("\n percentage of sales: ");
        double percentage = scanner.nextDouble();

        double total = (salary + allSales);
        double comissao = total * (percentage / 100);
        double salarioFinal = comissao + total;
        System.out.println("Caso vocë venda esse valor, vocë recebera "  +salarioFinal);
    }
}*/
//==============================================CALCULO DE GASTO========================================================
//O programa deve contar a medida dos lados da cozinha (x, y) e o preço em reais por
//unidade de piso. Seu programa deverá calcular e exibir a quantidade de pisos a comprar
//e o valor total gasto na reforma.

/*public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira as dimensões da sua cozinha, primeira a largura: (em metros) ");
        double lragura = scanner.nextDouble();
        System.out.println("agora insira o comprimento (em metros) : ");
        double comprimento = scanner.nextDouble();
        System.out.println("insira o valor gasto por unidade do piso ");
        double precoUnidadePiso = scanner.nextDouble();

        double dimensaoTotal = (comprimento * lragura);

//       o dois serve para elevar o resultado da divisáo de 60 por 100 ao quadrado, ou seja,
//       como o problema afirma que o piso tem 60cm ele equivale a 0.36 metros
        double areaPiso = Math.pow((60/100.0), 2);

//        a quantidade de pisos gastos será igual a dimensao total da cozinha dividida pela are que tem o piso, 0.36
        double quantidadePisos = dimensaoTotal/areaPiso;
        System.out.println("quantidade de pisos a compar: " +quantidadePisos);

//        a partir disso, já é possível saber quantos pisos iremos compar
        double totalGasto = quantidadePisos* precoUnidadePiso;

        System.out.println("para cobrir uma area de " +lragura+ " por " +comprimento+  "\n vocë vai gastar: " +totalGasto);

    }
}*/

//===============================================CALCULO RETANGULO======================================================
// faça um programa que caucule a area de um retangulo informada por um  usuário, o programa deve exibir a area calculada
/*public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("infrome o cumprimento a ser calculado");
        double cumprimento = scanner.nextDouble();
        System.out.println("informe a largura a ser calculada ");
        double largura = scanner.nextDouble();
        double areaTotal = (cumprimento * largura);
        System.out.println("a area total é " +areaTotal +"M²");
    }
}
*/
//================================================CALCULO AREA TRIANGULO================================================
//FACA UM PROGAMA QUE CALCULE A AREA DE UM TRIANGULO A PARTIR DA  BASE E ALTURA INFORMADO PELO USUÁRIO
/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o tamanho da base triangulo (em CM) ");
        double base = scanner.nextDouble();
        System.out.println("digite a altura de um triangulo (em CM) ");
        double altura = scanner.nextDouble();

        double total = (altura*base) / 2;
        System.out.println("a area total de um triangulo é " + total+ "CM²");


    }
}*/
//=============================================calculo de preco=========================================================
//faca um progrma que calcula o total a pagar por uma roupa apos obter do usuário o preco sem desconto e o percentual de
//desconto para pagamento a viste
/* public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira o valor da roupa ");
        double preco = scanner.nextDouble();
        double porcentagemDesconto = 10;
        double avista = (preco * porcentagemDesconto) /100;
        System.out.println("a vista vocë tem " +avista+ "%\n a prazo náo ha desconto e vocë paga o valor integral\n");
        double aPagar = (preco- porcentagemDesconto);
        System.out.println("valor total a pagar com desconto: " +aPagar);
    }

}*/
//=============================================calculo media do aluno===================================================
/*public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE A NOTA DO ALUNO EM PORTUGUES na unidade 1 ");
        float portugues = scanner.nextFloat();
        System.out.println("DIGITE A NOTA DO ALUNO EM PORTUGUES na unidade 2 ");
        float matematica = scanner.nextFloat();
        System.out.println("DIGITE A NOTA DO ALUNO EM PORTUGUES na unidade 3 ");
        float geografia = scanner.nextFloat();
        System.out.println("DIGITE A NOTA DO ALUNO EM PORTUGUES na unidade 4 ");
        float historia = scanner.nextFloat();
        System.out.println("DIGITE A NOTA DO ALUNO EM PORTUGUES na unidade 5 ");
        float ciencie = scanner.nextFloat();
        float mediafianl = (portugues + matematica + geografia + historia + ciencie) / 5;

        System.out.println("\n a média do aluno em questáo é " + mediafianl);
        if (mediafianl < 5) {
            System.out.println("Aluno em recuperacao ");
            if (mediafianl >=  5) {
                System.out.println("aluno passou direto");

            }
        }
    }
}*/
//=============================================MEDIA PONDERADA=========================================ESTRUTURA DO WILE
// ====================================ESTINGS DECLARADAS FORA DO LAÇO WILE=============================================
 // faca um progama que leia 2 notas de 1 aluno, a nota 1 tem peso 3.5 e nota 2 tem peso 7.5. faça a media ponderada do aluno
/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1,  peso1, peso2, nota2;
        do {
            System.out.println("Digite a nota 1 ");
            nota1 = scanner.nextFloat();
            System.out.println("digite o peso da nota 1 ");
            peso1 = scanner.nextFloat();
            System.out.println("\n digite a nota 2: ");
            nota2 = scanner.nextFloat();
            System.out.println("digite o peso 2: ");
            peso2 = scanner.nextFloat();

            if (nota1 > peso1) {
                System.out.println("nota invalida, o peso maximo é 3.5 Tente novament ");
            } else {
                break;
            }
            if (peso2 < nota2) {
                System.out.println("nota invalida, peso maximo 7.5 para essa nota é 3.5");
            }else{
                break;
            }

        }  while (true);

        double ponderadaN1 = (nota1 * peso1);
        double ponderadaN2 = (nota2 * peso2);
        double pesototal = (peso1 + peso2);

        double mediaFinal = (ponderadaN1 + ponderadaN2) / pesototal;
        System.out.println("a media ponderada final será de " +mediaFinal);
///      media ponderada vai ser ultiplicacao das medias dividido pela multiplicacaa dos pesos
   */
//========================================TEOREMA DE PITAGORAS==========================================================
//com base em X: altura da pipa;
//com base em y: distancia do menino da arvore
//descubra o z: que sera o comprimento da escada usado para pegar a pipa.
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("digite a altura que está a pipa: ");
       double alturaPipa = scanner.nextInt();
       System.out.println("digite a distancia que o menino está da arvore");
       double distanciMenino = scanner.nextInt();

       double cumprimentoEscada = (alturaPipa*alturaPipa) + (distanciMenino*distanciMenino);
       double raizQuadrada = Math.sqrt(cumprimentoEscada);
       System.out.println("o comprimento da escada é " +raizQuadrada);
    }

}*/
//========================================estrutura de repeticao if=====================================================
/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("============catraca piscina============");
            System.out.println("digite a sua idade");
            int idade = scanner.nextInt();
            System.out.println("digite o seu nome ");
            String nome = scanner.next();
            if (idade < 17) {
                System.out.println(nome + " ,na sua idade, náo é permitido entrar na piscina, por favor, ceda o lugar para proximo da fila");

            } else {
                System.out.println("idade permitida, entrada liberada");;
                break;


            }
        }while (true) ;

    }
}*/

//========================================estrutura de repeticao if====================================================
/*public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("entre com o número X");
        double x = scanner.nextInt();
//         se o número estiver no intervalo entre 27 e 100, soma +57 encima do x
        if (x > 16 || x < 101){
            x +=51;
        }
        if (x > 102){
            x = (x / 2) + 5;
        }
        System.out.println("x é ingual a " +x+ "onde x deve ser substituido pelo conteudo da variável" +x);

    }
}*/
//------------------------------atividades pág 55, 1) par o impar-------------------------------------------------------
/*public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;
        do {
            System.out.println("quer continuar sim;nao? ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "sim":
                    System.out.println("digite um numero ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    String resultado = (numero % 2 == 0) ? "par" : "impar";
                    System.out.println(resultado);
                    break;
                case "não":
                    System.out.println("Programa encerrado.");
                    break;
                default:
            }
        } while (!opcao.equalsIgnoreCase("não"));
        scanner.close();
    }
}
*/