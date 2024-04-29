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
//2) Faça um programa em Java para ler dois números inteiros e testar se o primeiro número
//é o maior. Se sim o programa deve exibir a mensagem “O primeiro é maior”.
//========================================================================================
/*public class Main{
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
        System.out.println("digite o numero 1");
        int n1 = scanner.nextInt();
        System.out.println("digite o numero 2");
        int n2 = scanner.nextInt();
        String reultado = ( n1 > n2)? "o primeiro numero digitado é maior que o segundo" : "o primeniro numero digitado nao é maior que o segundo.";
        System.out.println(reultado);
    }
}*/
//==============================calculo delta======================================

/* public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não existem raízes reais");
        } else {
            System.out.println("Delta: " + delta);
        }
    }
}
 */
//=================================operador ternario======================================================
//1) Faça um programa para ler 2 números inteiros do usuário. O programa deve calcular e
//exibir a mensagem “números iguais”, se os números digitados são iguais, ou “números
//diferentes”, caso contrário
/*public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o numero 1 ");
        int numero = scanner.nextInt();
        System.out.println("digite o numero 2 ");
        int numero2 = scanner.nextInt();

        String comparacao = (numero2 == numero) ? "os numeros sáo iguais" : "os numeros sáo diferentes";
        System.out.println(comparacao);
    }
}*/
//==============================if else ou operador ternario===================================================
//2) Faça um programa para ler 2 números inteiros, A e B, do usuário. O programa deve
//calcular e exibir a mensagem “A é divisível por B”, se o resto da divisão inteira de A por
//B for igual a zero. Caso contrário o programa deve exibir a mensagem: “A não é múltiplo
//de B”.
/*public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o numero 1");
        int n1 = scanner.nextInt();
        System.out.println("digite o numero 2");
        int n2 = scanner.nextInt();
        int comparacao = (n1 % n2);
        if (comparacao == 0){
            System.out.println("o primeiro numero digitado é divisivel pelo segundo");
        } else if (comparacao!= 0) {
            System.out.println("o primeiro numero digitado náo e divisivel pelo segundo");

        }
    }
}*/
//========================================calculo  IMC==============================================================
/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======PROGRAMA CALCULO IMC=========");
        System.out.println("DIGITE A SUA ALTURA: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o seu peso: ");
        double peso = scanner.nextDouble();

        double IMC = peso / (altura * altura);
//  isso é o mesmo que double IMC = peso/Math.pow(altura, 2);

        if (IMC < 17) {
            System.out.println("vocë esta muito abaixo do peso");

        }
        else if (IMC > 18.4 && IMC < 24.99) {
            System.out.println("seu peso esta  normal " +IMC);

        }
        else if (IMC >= 25 && IMC <= 29.99) {
            System.out.println("voce esta acima do peso " +IMC );

        }
        else if (IMC >= 30 && IMC <= 34.99) {
            System.out.println("obesidade nível 1 " +IMC );

        }
        else if (IMC >= 35 && IMC <= 39.99) {
            System.out.println("obesidade severa " +IMC);

        } else{
            System.out.println("seu quadro é de obesidade morbida " +IMC);

        }
    }
}*/
//=========================================algoritmo COM SWITCH==============================================================
/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);  // escaner especifico para introduzir um prato por meio de digitacao
        int codigo;
        System.out.println("Sabores de pizza");
        System.out.println  ("1 - pizza de carne\n"
                            +"2- pizza fracasse\n"
                            +"3 - pizza atum \n"
                            +"4 - monte seu prato: "
                            +"de o codigo da refeicao");
        codigo = scanner.nextInt();
        switch (codigo){
            case 1:
                System.out.println("a pizza g, custa 29, a GG custa 34"
                +"com adcional de borda, +4 reais, independentemente do tamanho");
                break;

            case 2:
                System.out.println("a pizza de fricasse custa 30 reias no tamanho G, no tamanho GG custa 35"
                +"borda custa + reais na de fricasse (independetemente do tamanho)");

            case 3:
                System.out.println("a pizza de atum custa 33  reais no tamanho g, no tamanho GG custa 36"
                +"borda custa + 6 reais");
                break;
            case 4:
                System.out.println("monte seu prato " );
                String  prato = scannerString.nextLine(); // tem um  scanner especifico para ler
                System.out.println( prato );
                break;

            default:
                System.out.println("o codigo digitado e invalido ");
        }
    }
}
*/
/*public class Main {
    public static void main (String[] args){
//        1) Faça um programa que leia 2 números reais e um número inteiro representando uma
//das opções abaixo. De acordo com a opção, execute as operações especificadas:
//1 - Média aritmética dos números: (𝑛1 + 𝑛2)/2
//2 - Média geométrica dos números: √𝑛1 ∗ 𝑛2
//3 - Diferença do maior pelo menor (descubra o maior e calcule a diferença)
        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O PRIMEIRO NÚMERO REAL: ");
        double r1 = scanner.nextDouble();
        System.out.println(" DIGITE O SEGUNDO NÚMERO REAL: ");
        double r2 = scanner.nextDouble();
        System.out.println(" DIGITE  UM NÚMERO INTEIRO: ");
        int inteiro1 = scanner.nextInt();

        double mediaAritimetica = (r1 + r2) / 2;
       double mediaGeometrica = Math.sqrt(r1 * r2);

        System.out.println("a media aritimetica dos dois numero e " + mediaAritimetica);
        System.out.println("a media geometrica 'e " +mediaGeometrica);
        if (r1 > r2 ) {
            System.out.println("o numero maior 'e o primeiro digitgado ");
            double maior1 = r1 - r2;
            System.out.println("a diferenca entre eles e: " +maior1);
        }else {
            System.out.println("o numero maior 'e o segundo digitado: ");
            double maior = r2 - r1;
            System.out.println("a diferenca entre eles e " +maior);
        }
        if (r2 != 0) {
            double divisao = r1/r2;
            System.out.println("a divisão do segundo pelo primeiro e " +divisao);
        }
        double resultado = Math.pow(r1, r2);
        System.out.println("o primeiro numero elevado ao segundo e igual a " + resultado);

    }
}
*/
//=============================================================================================================-========
//2) Faça um programa que receba o salário de um funcionário e usando a tabela a seguir
//calcule e mostre o novo salário, após aplicado o reajuste correto para a faixa:
/*public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTRE COM O SALARIO DO FUNCIONARIO ");
        double salario = scanner.nextDouble();
        if (salario < 500) {
            salario = (salario * 30) / 100;
            System.out.println("o reajuste salarial sera de 30%, o que equivale a " +salario+"BRL");
        } else if (salario >= 500 && salario <= 700) {
            salario = (salario * 25) / 100;
            System.out.println("o reajuste salarial sera de 25%, o que equivale a  " +salario+"BRL");
        } else if (salario > 700 && salario < 900) {
            salario = (salario * 20) / 15;
            System.out.println("o reajuste salarial sera de 20%, o que equivale a  " +salario+"BRL");
        } else if (salario >= 900 && salario <=1200) {
            salario = (salario * 15) / 100;
            System.out.println("o reajuste salarial sera de 15%, o que equivale a  " + salario + "BRL");
        }else {
            salario = (salario * 10) / 100;
            System.out.println("o reajuste salarial sera de 10%, o que equivale a  " + salario + "BRL");
        }
    }
}*/
/*
public class Main {
    public static final int nota_100 = 100;
    public static final int nota_50 = 50;
    public static final int nota_20 = 20;
    public static final int nota_10 = 10;
    public static final int nota_5 = 5;
public  static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("DIGITE O VALOR DO SAQUE ");
            int saque = scanner.nextInt();

    // Calcula a quantidade de notas de 100 necessárias e atualiza o valor de saque
    int quantidadeNotas100 = saque / nota_100; // Divide o valor do saque pelo valor da nota de 100
    saque %= nota_100; // Calcula o restante do saque após retirar as notas de 100

    // Calcula a quantidade de notas de 50 necessárias e atualiza o valor de saque
    int quantidadeNotas50 = saque / nota_50; // Divide o restante do saque pelo valor da nota de 50
    saque %= nota_50; // Calcula o restante do saque após retirar as notas de 50

    // Calcula a quantidade de notas de 20 necessárias e atualiza o valor de saque
    int quantidadeNotas20 = saque / nota_20; // Divide o restante do saque pelo valor da nota de 20
    saque %= nota_20; // Calcula o restante do saque após retirar as notas de 20

    // Calcula a quantidade de notas de 10 necessárias e atualiza o valor de saque
    int quantidadeNotas10 = saque / nota_10; // Divide o restante do saque pelo valor da nota de 10
    saque %= nota_10; // Calcula o restante do saque após retirar as notas de 10

    // Calcula a quantidade de notas de 5 necessárias e atualiza o valor de saque
    int quantidadeNotas5 = saque / nota_5; // Divide o restante do saque pelo valor da nota de 5
    saque %= nota_5; // Calcula o restante do saque após retirar as notas de 5

    System.out.println("Número de notas de 100: " + quantidadeNotas100);
    System.out.println("Número de notas de 50 : " + quantidadeNotas50);
    System.out.println("Número de notas de 20 : " + quantidadeNotas20);
    System.out.println("Número de notas de 10 : " + quantidadeNotas10);
    System.out.println("Número de notas de 5  : " + quantidadeNotas5);

}
    }
    */
///=-===============================================ordenamento de números-----=========================================
/* public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int aux = 0;
        System.out.println("entre com o primeiro numero");
        int primeiro = scanner.nextInt();
        System.out.println("entre com o segundo numero");
        int segundo =  scanner.nextInt();
        System.out.println("entre com o terceiro numero");
        int terceiro = scanner.nextInt();

        if(primeiro>terceiro){   // Se o primeiro número for maior que o terceiro,
            aux = primeiro;      // armazene o valor do primeiro número na variável auxiliar.
            primeiro = terceiro; // Atribua o valor do terceiro número ao primeiro.
            terceiro = aux;      // Atribua o valor armazenado na variável auxiliar ao terceiro número.
        }
        if (primeiro>segundo){  // Se o primeiro número for maior que o segundo,
            aux = primeiro;     // armazene o valor do primeiro número na variável auxiliar.
            primeiro = segundo; // Atribua o valor do segundo número ao primeiro.
            segundo = aux;      // Atribua o valor armazenado na variável auxiliar ao segundo número.
        }
        if (segundo>terceiro) {  // Se o segundo número for maior que o terceiro,
            aux = segundo;       // armazene o valor do segundo número na variável auxiliar.
            segundo = terceiro;  // Atribua o valor do terceiro número ao segundo.
            terceiro = aux;      // Atribua o valor armazenado na variável auxiliar ao terceiro número.


        }
        System.out.println("menor valor " +primeiro+ "\nsegundo menor:" +segundo+"\nmaior valor" +terceiro+ ".");
    }
}*/
//============================================ESTRUTURA SWITCH CASE E DO WHILE==========================================
/*public class Main {
    public static void main (String[] args){
        double resultado =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("===========cauculadora============");
        System.out.println("enter with the first nunber:");
        double valor1 = scanner.nextDouble();
        char operadorAritimetico;
//      ESTRUTURA DE REPETICAO ENQUANT0
        do {
            System.out.println("enter with tipe of operation ");
            operadorAritimetico = scanner.next().charAt(0);
        }while (operadorAritimetico != '+' && operadorAritimetico != '-'
                && operadorAritimetico != '/' && operadorAritimetico != '*');
//            ESTRUTURA DE REPETICAO ENQUANTO WHILE
        System.out.println("enter with the second value: ");
        double valor2 = scanner.nextDouble();

        switch (operadorAritimetico) {
            case '+':
                 resultado = valor1 + valor2;
                System.out.println(resultado);
                break;
            case  '-':
                resultado = valor1 - valor2;
                System.out.println(resultado);
                break;
            case  '/':
                resultado = valor1 / valor2;
                System.out.println(resultado);
                break;
            case  '*':
                resultado = valor1 / valor2;
                System.out.println(resultado);
            default:

        }
    }
}*/
//==================================================do while e while====================================================================
/*public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
         int vireDireita = 0;
        do {  vireDireita ++;
            System.out.println("vire a direita");
        }while (vireDireita <5);

        System.out.println("===========================================");
        System.out.println("Agora While\n");

                vireDireita = 0;
                while (vireDireita < 5) {
                    System.out.println("vire a direita");
                    vireDireita++;
                }
            }
        }*/
//=========================cauculo raizes equação de segundo grau====calcular raizes reais==============================
/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
            System.out.println("de o valor de a ou zero para finalizar; ");
            a = scanner.nextDouble();
            if (a != 0) {
                System.out.println("de o valor  de b:");
                b = scanner.nextDouble();
                System.out.println("de o valor de c ");
                c = scanner.nextDouble();
                delta = b * b - 4 * a * c;
                if (delta < 0) {
                    System.out.println("nao exitem raizes reais");
                } else if (delta == 0) {
                    x1 = -b / (2 * a);
                    System.out.println("raiz:  x1");
                } else {
                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("x1" + x1 + "\nx2" + x2);
                }
            }
        }
    }*/
//=====================================estrutrua de repetiçao while, media aluno----------------------------------------
/*public class Main {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double nota, soma = 0, media;
        int conta = 1;
        while (conta <= 7){
            System.out.println("dë a nota " +conta);
            nota = scanner.nextDouble();
            soma = soma + nota;
            conta++;
        }
        media = soma/7;
        System.out.println("a nota media é " +media);
    }
}*/
//======================== O mesmo feito acima, mas com estrutura de repeticao Do while==================================
/*public class Main {
    public void main (String[] args){
    double  nota, soma=0, media;
    Scanner scanner = new Scanner(System.in);
    int conta = 1;

    do{
        System.out.println("de a nota " +conta);
        nota = scanner.nextDouble();
        soma = nota + soma;

    }while (conta < 7);
    media = soma / 7;
        System.out.println("nota media " + media);
    }
}*/
//==========================estrutura de repetição for==================================================================
/*public class Main {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double nota, soma=0, media;
        for (int conta = 0; conta <7; conta++){
            System.out.println("de a nota " +conta);
            nota = scanner.nextDouble();
            soma = soma + nota;
        }
        media = soma / 7;
        System.out.println("a nota media foi " + media);
    }
}*/
//======================================================================================================================
/*public class Main {
    public void main(String[] args){
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
        System.out.println("=============================");
        i = 0;
        for (i = 1; i <= 10; i++){
            System.out.println("o valor de i é " +i);
        }
        System.out.println("===============================");
        i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= 10);

        System.out.println("=-============par ou impar=================");
        i = 0;
        for  (i = 2; i <= 20; i+=2){
            System.out.println(i);
        }

    }
}*/
////====================================================while==================================================================
/*public class Main {
    public void main(String[] args){
        int a = 1, b = 0, c = 0;
        while (a < 10){
            if (b < 4 ){
                a = a * 2;
            }else{
                a = a + 3;
            }
            if (c != 3) {
                b = b + 3;
            }else{
                b = b - 2;
            }
            c++;
        }
        System.out.println("a = " +a);
        System.out.println("b =" + b);
        System.out.println("c = " + c);
    }
}*/
//======================================================================================================================
/*public class Main {
    public void main (String[] args){
        Scanner scanner = new Scanner(System.in );
        double valor, maior=0;

        for   (int i= 0; i < 5; i++){
            System.out.println("de o valor ");
            valor = scanner.nextDouble();
            if (i == 0)
            maior = valor;


            if (maior < valor ){
                maior = valor;
            }

        }
        System.out.println("maior valor " +maior);
    }
}*/
// ========================================calcular menor valor e maior valor=========================================================
/*public class Main {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor = 0, maiorValor = 0, menorValor = 0, contador = 0;

        for (contador = 0; contador < 9; contador++) {
            System.out.println("de o valor: ");
            valor = scanner.nextDouble();
            if (contador == 0) {
                maiorValor = valor;
                menorValor = valor;

            }else{
                if (valor > maiorValor) {
                    maiorValor = valor;
                }
                if (valor < menorValor) {
                    menorValor = valor;
                }

            }

        }
                System.out.println("o menor valor 'e " + menorValor + "maior valor  " + maiorValor);
    }
}
*/
//==============================================cauculo valor de 2, elevado ao quadrado adcionado i-------------------
/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro n: ");
        int n = scanner.nextInt();

        // Inicializa a variável soma com 0
        double soma = 0;

        // Loop que vai de 0 até n (inclusive)
        for (int i = 0; i <= n; i++) {
            // Em cada iteração do loop, adiciona 2 elevado à potência i à soma
            soma += Math.pow(2, i);
        }

        // Imprime a soma calculada
        System.out.println("O valor do somatório é: " + soma);
    }
}*/
//==========================================DO WHILE ELSE IF============================================================================
//Considere as seguintes faixas etárias: criança (de 0 a 10 anos), adolescente (de 11 a 16
//anos), Jovem (de 17 a 26 anos), adulto (de 27 a 59 anos) e idoso (acima de 60 anos).
//Faça um programa que leia a idade de 20 pessoas e mostre para cada uma qual a faixa
//etária que pertence
/*public class Main {
    public void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int pessoa = 1;
        do {
            System.out.println("digite a idade da pessoa ");
            int idade = scanner.nextInt();
            if (idade < 16 && idade > 0) {
                System.out.println("criança[adolecente\n");
            }
            else if (idade > 16 && idade <= 27){
                System.out.println("jovem\n");

            } else if (idade >= 26 && idade < 60) {
                System.out.println("adulto\n");
            }else{
                System.out.println("idoso\n");
            }
            pessoa++;
            System.out.println("pessoa numero " + pessoa);
        }while (pessoa <= 20);
    }
}
 */

//===========================================WHILE DO WHILE===========================================================================
// Faça um programa que leia uma quantidade indeterminada de valores inteiros do usuário.
//O programa deve exibir quantos são maiores que 82, quantos números são menores que
//18 e quantos números informados estão no intervalo [18, 82]. while, do..while e
////for
/*public class Main {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = 1, maiorQue82 = 0, menorQue18 = 0, noIntervalo = 0;
        System.out.println("======================solucao while===========================");
        while (true) {  // TRUE e o mesmo que 1, ou seja, diferente de zero;
            System.out.println("Digite os valores inteiros (digite 0 para encerrar):");
            valor = scanner.nextInt();
            if (valor == 0) break; // se o numero digita for igual a zero aqui mesmo ele encerra o laco e  do DO.

            if (valor > 82) {
                maiorQue82++;
            } else if (valor < 18) menorQue18++;
            else noIntervalo++;

        }
        System.out.println("Quantidade de números maiores que 82: " + maiorQue82);
        System.out.println("Quantidade de números menores que 18: " + menorQue18);
        System.out.println("Quantidade de números no intervalo [18, 82]: " + noIntervalo+ "\n");


        System.out.println("=========================SOLUÇÃO DO WILE===================================");
        double dovalor = 1, numeromaiorQue82 = 0, numeromenorQue18 = 0, numeroIntervalo = 0;
        System.out.println("Digite os valores inteiros (digite 0 para encerrar):");
        do {
            valor = scanner.nextInt();
            if (valor == 0) break;
            if (valor > 82) maiorQue82++;
            else if (valor < 18) menorQue18++;
            else noIntervalo++;
        } while (true);

        System.out.println("Quantidade de números maiores que 82: " + maiorQue82);
        System.out.println("Quantidade de números menores que 18: " + menorQue18);
        System.out.println("Quantidade de números no intervalo [18, 82]: " + noIntervalo);
    }
}*/
/*public class Main {
    public void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double valor = 0;
        byte continuar = 0;
        while (continuar != 1 ){
        System.out.println("DIGITE O VALOR DO PRODUTO");
        valor += scanner.nextInt();
            System.out.println("o valor atual da soma é " +valor);
            System.out.println("Deseja continuar? digite 0 para continuar, 1 para parar\n");
            continuar = scanner.nextByte();
        }
        System.out.println("o valor total em compras foi: " +valor+ "\n deseja subtrair algum valor?; ");



    }
}*/
//======================================================================================================================
//8) Construa um programa que leia a idade e o estado civil (C - casado, S - solteiro, O -
//outros) para uma pesquisa com um conjunto de pessoas. A quantidade de pessoas é
//desconhecida pelo pesquisador. Use um laço indeterminado. O programa deve calcular
//e exibir: a) Quantidade de pessoas solteiras
//          b) Média da idade das pessoas casadas
//          c) Qual é a idade da pessoa mais velha.

/*public class Main {
    public void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade, solteiroIdad = 0, soleteiroSoma = 0, casadoIdade = 0, casadoSoma = 0,
                divorciadoIdade = 0, divorciadoSoma = 0, viuvoIdade = 0, maiorIdade = 0;
        char estadoCivil = 'w';
        byte continuar = 0;

        do {
            System.out.println("digite seu estado civil ");
            estadoCivil = scanner.next().charAt(0);
            switch (estadoCivil) {
                case 's':
                    soleteiroSoma++;
                    break;
                case 'c':
                    casadoSoma++;
                    break;
                case 'd':
                    divorciadoSoma++;
                    break;
                case 'v':
                    viuvoIdade++;
            }

            System.out.println("Digite sua idade ");
            idade = scanner.nextInt();
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            System.out.println("deseja continuar, 1 para sim, 0 para nao ");
            continuar = scanner.nextByte();
        }while (continuar != 0) ;
        System.out.println("a pessoa mais velha tem " + idade);
        int mediaCasado = idade/casadoSoma;
        System.out.println("a media de idade das pessoas casadas e de " +mediaCasado);
        System.out.println("a quantidade de solteiros é " +soleteiroSoma);
    }
}*/
//-----------------------------------------------Vetores--------------------------------------------------------------------------
/*public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] x = new double[3];
        x [0] = .1;
        x[1] = 1.5;
        x[2] = 100.5;
        double soma = x[0]+x[1]+x[2];
        System.out.println("soma : " +soma);
    }
}*/
/*public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(in);
        int [] idade = new int [14];

        for (int i = 0; i < idade.length; i++){ //enquanto ele nao preecher os 13 espacos, idade se repete.
            System.out.println("de a idade da pessoa");
//            i sera igual a zero, depois 1,2,ate 13(idade.lenght-1)
                idade[i] = scanner.nextInt();

        }
    }
}*/
//========================================vetores descobrir maior e menor mumero========================================
/* public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(in);
         int idade[] = new int[14];
         int maiorIdade = 0, menorIdade = 1;
         double soma = 0, media, acimaDaMedia;
         for (int i = 0; i < idade.length; i++){
             System.out.println("de a idada da pesosa");
             idade [i] = scanner.nextInt();
             soma += idade[i];
             if (i == 0) {
                 maiorIdade = idade[i];
                 menorIdade = idade[i];
             } else if (idade[i] < menorIdade) {
                    menorIdade = idade[i];
                 if (idade[i] > maiorIdade) {
                     maiorIdade = idade[i];
                 }
             }
         }
        System.out.println("menor idade " +menorIdade);
        System.out.println("maior idade " +maiorIdade);

         media = soma/idade.length; //soma e double portanto a divisão exata
        System.out.println("idade media" +media);

        //calculo da quantidade de pessoas aicma da media
        acimaDaMedia = 0;
        for (int i = 0; i < idade.length; i++){
            if (idade[i] >= media){
                acimaDaMedia++;
            }
        }
        System.out.println("ha " +acimaDaMedia+ "pessoas com " +"idade acima da media(" +media+ ")");
    }
}*/
//-===============================-------vetores menor e maior numero-----------------------==========================
/*public class Main {
    public void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        float soma = 0;
        float maiorTemperatura = 0, menorTemperatura = 0;
        float temp[] = new float[7]; // temp.length é igual a 7.
        for (int i = 0; i <temp.length; i++){  //temp.lenght é o mesmo que o valor float temp[] = new float[7];
            System.out.println("temperatura do dia" +(i+1)+")" );
            temp[i] = scanner.nextFloat();
            soma = soma + temp[i]; //soma de cada temperatura.

            if (i == 0) {  //como o i vai ser zero uma unica vez ele ira iniciar a maior e menor temperatura com o valor digitado
                maiorTemperatura = temp[i]; //valor digitado 2, maior temperatura = 2
                menorTemperatura = temp[i]; // valor digitado 2, menor temperatura = 2

            } else if (temp[i] < menorTemperatura) { // se o valor do primeiro  temp[i] digitado for maior, ex: 4, ele desconsidera esse else e vai para o proximo if
                menorTemperatura = temp[i];

            }if (temp[i] > maiorTemperatura) {  // se o valor digitado do primeiro temp[i] digitado for maior que o autal ex: 4, ele coloca o numero 4 na variavel maior temperautra;
                    maiorTemperatura = temp[i];
            }

        }
        float media  = soma/ temp.length;  //ou media = soma / 7 o que da no mesmo resultado, visto que temp.lenght e o mesmo que 7 valores.
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > media) {
                System.out.println("temperaturas acima da media " +temp[i]+ "\n");
            }
        }
            System.out.println("media de temperatura = " + media + "\n");
            System.out.println("a maior temperatura registrada foi " + maiorTemperatura + "\n a menor temperatura registrada foi " + menorTemperatura);

    }
}*/
//=====================================================vetrores=================================================================
/*public class Main {
    public void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int tam;
        System.out.println("insira o tamanho dos tres vetores a seguir: " );
        tam = scanner.nextInt();

        int a[] = new int[tam], b[] = new int[tam], c[] = new int [tam];

//        leitura dos elementos de a e b;
        for (int i=0; i < a.length; i++){
            System.out.println("A ["+i+"]");
            a[i] = scanner.nextInt();
            System.out.println("b ["+i+"]");
            b[i] = scanner.nextInt();
//            vetor produto
            c[i] = a[i] * b[i];
        }
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i] +"*"+b[i]+"="+c[i]);
        }
    }
}*/
//========================vetores, lista de convidados, INTRODUZIR NOMES E PESQUISAR PESSOAS----------------------------------------
/*public class Main {
    public void main(String [] args){

        // Cria dois objetos Scanner para ler diferentes tipos de dados
        // scanner para números inteiros
        Scanner scanner = new Scanner(System.in); // para numeros inteiros
        Scanner scanner1 = new Scanner(System.in);

        // Declara a variável tam para armazenar o número de convidados
        int tam;

        // Lê o número de convidados da entrada padrão
        System.out.println("informe o numero de convidados da festa");
        tam = scanner.nextInt();

        // Cria um vetor de strings para armazenar os nomes dos convidados, que sera introduzido no scanner acima
        String convidado[] = new String[tam];
//      A PARTIR DAQUI TEREMOS A LEITURA DOS NOMES QUE IRÁO SER ATRIBUIDOS AO NUMERO DE POSIÇÕES QUE HAVERA NA STRING
        for (int i = 0; i< convidado.length; i++) {  ///convidado.length É O NUMERO DE POSIÇÕES INSERIDA NO PRIMERO SCANNER
            System.out.println("de o nome completo do convidado ");
            convidado[i] = scanner1.nextLine(); //ENQUANTO NAO CHEGARMOS AO NUMERO DIGITADO NO ARRAY ELE CONTINUA A REPETIR.
        }
        System.out.println("informe o nome para pesquisa: ");
        String nome = scanner1.nextLine();
        boolean achou = false; // achou sera true se o nome estiver no vetor,
        //pesquisa por um nome no vetor;
        for(int i = 0; i < convidado.length; i++){ // Loop para percorrer cada nome no array
            // Compara o nome digitado com o nome na posição i do vetor
            // ignorando a diferença entre maiúsculas e minúsculas

            if (convidado[i].equalsIgnoreCase(nome)){ // Verifica se o nome na posição 'i' do array é igual ao nome pesquisado (desconsiderando maiúsculas/minúsculas)
                achou = true;
                break; // interrompe o laco de repeticao
            }
        }
        // exibe o resultado da busca;
        if (achou) {
            System.out.println(nome+ " foi convidado");
        }else
            System.out.println(nome+ " náo foi convidado, nome náo localizdo");
        scanner.close(); scanner1.close();//essa parte nao e obirgatoria mas e importante para fechar os streams de entrada.
    }
}

 */
//--------------------------------------vetores, exibir numeros por odem de digitação--------------------------------------------------------------
/*
import java.util.Collections;
public class Main {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[10];
        int i;
        for ( i = 0; i < numeros.length; i++) {
            System.out.println("digite o numero" + (i + 1) + ")");
            numeros[i] = scanner.nextInt();

            }
        // Ordenando os números em ordem decrescente
        System.out.println("Os números em ordem decrescente são:");
//
        Collections.reverse(Arrays.asList(numeros));

        // Imprimir o array invertido
        System.out.println("Os números em ordem inversa são:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

    }
}*/
//========================arrays vetores, maior para o menor do vetor===================================================

// Importação da classe Scanner para receber entrada de dados do usuário


// Declaração da classe Main
/*public class Main {
    // Método principal que inicia a execução do programa
    public static void main(String[] args) {
        // Criação de um objeto Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declaração de um array de inteiros com tamanho 10
        int numeros[] = new int[10];
        int i; // Declaração de uma variável de controle para os loops

        // Loop para preencher o array com números fornecidos pelo usuário, que vai de zero at[e o numero definido pelo user
        for (i = 0; i < numeros.length; i++) {
            // Solicitação para o usuário digitar um número e armazena no array
            System.out.println("Digite o número " + (i + 1) + ")");
            numeros[i] = scanner.nextInt();
        }

        // Impressão de uma mensagem indicando o início da impressão dos números em ordem inversa
        System.out.println("Os números em ordem inversa são:");

//         Loop para imprimir os números do array na ordem inversa
//        Essa linha itera o array "numeros" do final ao início.
//        A variável "i" é inicializada com o valor do tamanho do array "numeros" menos 1.
//        A cada iteração, o valor de "i" é decrementado em 1.
//        O loop termina quando "i" for menor que 0.
        for (i = numeros.length - 1; i >= 0; i--) {
            // Imprime o número atual do array
            System.out.println(numeros[i]);
        }
    }
}*/
//==============================================vetores=================================================================
//Dado um vetor de inteiros de x posições informadas pelo usuário, calcule e exiba a soma
//dos elementos do vetor.
/*public class Main {
    public void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int tam; int soma = 0;
        System.out.println("digite a quantidade de produtos total ");
        tam = scanner.nextInt();

        int produtos[] = new int[tam];

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Dgite o valor do produto "+i+".\n"); // aqui se refere a posição atual do array.
            int mercadoria = scanner1.nextInt();
            soma += mercadoria;
            System.out.println("o valor do produto é " +mercadoria);
        }
        System.out.println("O VALOR TOTAL EM PRODUTOS É " +soma);

        }
    }*/
//----------------------------------------------------------------------------------------------------------------------
//Um técnico deseja convocar um time jogadores anotando os nomes dos 11 titulares e
//dos 11 reservas para um torneio regional. Seu programa deve armazenar os nomes em
//dois vetores distintos: um para titulares e outro para reservas. Em seguida o programa
//deve obter um nome de jogador para uma pesquisa em ambos os vetores. O técnico
//deseja saber se o nome informado é titular, reserva ou não foi convocado. Faça
//comparação ignorando maiúsculas e minúsculas.
/*public class Main {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        String[] nomeTitular = new String[11];
        String[] nomereserva = new String[11];

        System.out.println("digite o nome dos jogadores ");
        for (int i = 0; i < nomeTitular.length; i++) {
            System.out.println("de o nome do jogador " + i + " titular\n");
            nomeTitular[i] = scanner1.nextLine();
        }

        System.out.println("Digite os nomes dos jogadores reservas: ");
        for (int i = 0; i < nomereserva.length; i++) {
            System.out.println("Digite o nome do jogador reserva " + i + ": ");
            nomereserva[i] = scanner.nextLine();
        }

        boolean achou = false;
        while (!achou) {
        System.out.println("pesquise o nome do jogador: ");
        String nome = scanner1.nextLine();  // a variavel do tipo String nome sera usada para pequisa de nome de jogador.
//            verificacao de titulares
            for (int i = 0; i < nomeTitular.length; i++) {
                if (nomeTitular[i].equalsIgnoreCase(nome)) {
                    achou = true;
                    System.out.println(nome + " é titular.");
                    break;
                }
            }
            // Verificação entre os reservas
            if (!achou) {
                for (int i = 0; i < nomereserva.length; i++) {
                    if (nomereserva[i].equalsIgnoreCase(nome)) {
                        achou = true;
                        System.out.println(nome + " é reserva.");
                        break;
                    }
                }
            }
            // Mensagem caso o jogador não seja encontrado
            if (!achou) {
                System.out.println("Jogador não localizado. Deseja continuar pesquisando? (S/N)");
                String resposta = scanner.nextLine();
                if (!resposta.equalsIgnoreCase("S"))
                    break;
            }
        }
    }
}*/
//=====================================================================================================================
//Leia para um conjunto de alunos seus nomes e suas notas finais. Armazene os valores
//em dois vetores: uma para nomes e outro para notas. O número de alunos na turma será
//informado pelo usuário. O programa deve calcular a média das notas e exibir o nome e
//a nota final dos alunos com notas inferiores à média da turma. Também deve exibir os
//nomes e notas dos que alcançaram rendimento igual ou acima da média. Por fim, o
//programa deve informar o nome do aluno que obteve a menor nota da turma e o nome
//do aluno que obteve a maior nota.
/*public class Main{
    public void main(String[] args){
        Scanner scanner = new Scanner(in);
        int qtAlunos;
        System.out.println("digite a quantidade de aluno");
        qtAlunos = scanner.nextInt();
        scanner.nextLine();
        int maiorNota = 0 ; int menorNota = 0 ; int media = 0;
        int alunos[] = new int[qtAlunos];
        int nota[] = new int[qtAlunos];
        String nomeAluno[] =new String[qtAlunos];


        for (int i = 0; i <alunos.length; i++) {

            System.out.println("digite o nome do aluno " +i);
            nomeAluno[i] = scanner.nextLine();
            System.out.println("\ndigite a nota do aluno("+nomeAluno[i]+")");
            nota[i] = scanner.nextInt();
            scanner.nextLine();

            if (i == 0 ) {
                menorNota = nota[i];
                maiorNota = nota[i];
            } else if (menorNota > nota[i]) {
                menorNota = nota[i];
            }
            if (nota[i] > maiorNota)
                maiorNota = nota[i];
            media += nota[i];
        }
        media = media / qtAlunos;
        for (int i = 0; i < alunos.length; i++)
        {
            System.out.println("a nota do aluno " +nomeAluno[i]+ " é: " +nota[i]);
        }

        System.out.println("a nota media e " +media);
        System.out.println("a menor nota digitada e " +menorNota);
        System.out.println("a maior nota digitada foi: " +maiorNota);
        for (int i = 0; i < alunos.length; i++)
        {
            if (nota[i] > media)
            {
                System.out.println("os alunos acima da media foram: " );
                System.out.println("a nota " +nota[i]+ " de " +nomeAluno[i]);
            }
        }
    }
}*/
//---------------------------------------------------------------------------------------------------------------------
//metodo do tipo função que calcula e retorna o fatorial do parametro x.
/*public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n, p;
        double combinacoes;
        System.out.println("de o valor de n: ");
        n = scanner.nextInt();
        System.out.println("de o valor de p: ");
        p = scanner.nextInt();
        int fatN  = fat(n);
        int fatP = fat(p);
        int fatNP= fat(n-p);
//        calculo de combinacions(o metodo main e o codigo chamador!)~;
        combinacoes = fatN/(fatP*fatNP);
        System.out.println("Cp, n= " +combinacoes);

    }
//    metodo do tipo funcao que calcula e retorna o fatorial do parametro de 'x'
    public static  int fat(int x){
        int fatorial = 1;
        for (int i=2; i<=x; i++){
            fatorial*=i; //ou fatorial * i;
        }
        return fatorial;
    }
}*/
//====================================================================================================================
/*public class Main {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        define e preenche o vetor para a lista de convidados
        String[] c = new String[5];
        for (int i = 0; i < c.length; i++) {
            System.out.println("informe o nome do convidado: ");
            c[i] = scanner.nextLine();
        }
        System.out.println("\n de o nome para pesquisa: ");
        String nome = scanner.nextLine();
        boolean eConvidado=false;
        for (int i = 0; i < c.length; i++) {
            if (nome.equals(c[i])) {
                eConvidado = true;
                break;
            }
        }
        if (eConvidado ) {
            System.out.println(nome+" esta na lista de convidados");

        }else{
            System.out.println(nome+ "nao esta na lista de candidatos");
        }
    }o qu
}*/
//====================================================================================================================
/*public class Main {
    public void main(String[] args){
        double v[] = {1, 5,7,9.8, 34.2, 12, 5, 9.8, 11, 12};
        int p = 0; double m = v[0];
        for (int i = 1; i < v.length; i++){
            if (v[i] > m){
                m = v[i];
                p = i;
            }
        }
        System.out.println("resultado " +p+ "que representa o indice do elemento");
    }
}*/
//====================================================================================================================
/*public class Main {
    public void main (String[] args){
//        chamada do procedimento;
        imprimeTriangulo();
//
    }
    public static void imprimeTriangulo(){
//        laço externo se repetindo a cada linha;
        for (int i = 1; i <= 5 ; i++) {
//            laço interno para exibir uma linha.
            for (int coluna = 1; coluna <= i; coluna++){ // coluna esta colocando o valor de i ++
                System.out.println(coluna+ " ");
            }
//            apos escrever inclui caracters de uma novalinha:
            System.out.println("");
        }
    }
}*/
//===============================================vetor de inteiros=====================================================
/*public class Main {
    public void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int alunos[] = new int[10]; int media = 0;
        for (int i = 0; i < alunos.length; i++) {
        System.out.println("digite a nota do aluno " +(i+1));
        alunos[i] = scanner.nextInt();
        System.out.println("a nota digitada foi " +alunos[i]);
            media += alunos[i];
            System.out.println("soma das notas " +media);
        }
        media = media / alunos.length;
        System.out.println("a nota media foi " +media);
    }
}*/
//-------------------------------------------------------------------------pu
//Explicação:
//
//   * A função media é declarada como static double media(int v[]). Isso significa que ela retorna um valor do tipo double, para o metodo main
//   * No método main, a função media é chamada com o array x como argumento: media(x).
//   * A função media calcula a média dos elementos do array x e retorna o resultado.
//   * O resultado da função media é então armazenado em uma variável no método main.
//   * Finalmente, o valor da variável é impresso usando System.out.println.
/*public class Main {
    public static void main(String[] args){
        int x[] = {10, 21, 3, 14, 35, 16, 7, 48};
        System.out.println("meida: " +media(x));
    }
//    calcula a media dos elementos de v;
    public static double media(int v[]){
        double soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return  (soma/v.length);
    }
}*/
//======================================================================================================================
//Suponha que o vetor da questão anterior armazene a idade de 20 pessoas. Use o
//método média já construído na Figura 59. O programa deve calcular e exibir quantas
//pessoas possuem idade acima da média. Faça esse cálculo em outro método estático
//que será chamado a partir do main. Exiba a média e a quantidade de pessoas com idade
//acima da média ao final
/*public class Main {
    public static int main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double idade[] = new double[10];
        for (int i = 0; i < idade.length; i++) {
        System.out.println("digita a idade da pessoa " +(1+i));
        idade[i] = scanner.nextDouble();
        }
        return (idade.length);
        }
    }*/
// tentativa 3
    /*public class Main {
        // O método main é o ponto de entrada para qualquer aplicação Java
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            // Declara um array para armazenar as idades
            int idade[] = new int[10];
            // Loop para ler as idades do usuário
            for (int i = 0; i < idade.length; i++) {
                System.out.println("digite um valor inteiro para idade ");
                idade[i] = scanner.nextInt();
            }
            // Calcula a média das idades
          double media = media(idade);
            System.out.println("a nota media foi " +media);
            // Calcula o número de idades acima da média
            int acimaMedia = acima(idade, media);
            System.out.println("acima da media há " +acimaMedia+ " pessoas");
        }
        // Método para calcular a média de um array de inteiros
        public static double media(int v[]){ //Declaração do método "media", que calcula a média dos valores de um array de inteiros.
            double soma = 0; //declaracao da variavel para armazenar a soma dos valores
            // Loop para somar os elementos do array
            for (int i = 0; i < v.length; i++) {
                soma += v[i]; /// Adiciona o valor atual do array à variável de soma
            }
            System.out.println("soma das idades " +soma);
            // Retorna a média
            return  soma/v.length;
        }
        // Método para contar o número de elementos em um array que estão acima de um certo valor
        public static int acima(int m[], double mediaAc) { // Declaração do método "acima",
            // que conta o número de elementos em um array que estão acima de um determinado valor (neste caso, a média)
            int count = 0; // inicializacao da variavel contadora
            // Loop para contar os elementos que estão acima da média
            for (int i = 0; i < m.length; i++) {
                if (m[i] > mediaAc) {
                   count++;
                }
            }
            // Retorna a contagem
            return count;
        }
    }*/
//----------------------------------------------------------------------------------------------------------------------
//Escreva uma classe Java executável que defina e teste um método estático do tipo
//função que dado dois inteiros como parâmetro, calcule e retorne valor do primeiro inteiro
//elevado ao segundo. Tente resolver a potenciação aplicando multiplicações sucessivas
//passagem de parametro, retono de valor tags;
/*public class Main {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero ");
        double numero1 = scanner.nextDouble();
        System.out.println("digite o segundo numero ");
        double numero2 = scanner.nextDouble();
        
     double media = potenciacao(numero1, numero2);
        System.out.println("o primeiro numero elevado ao segundo e " +media);

    }
    public static double potenciacao(double numero1, double numero2) {
        double media = Math.pow(numero1, numero2);
        return media;
    }
    }*/
//============================================subrotinas operador ternario==========================================================================
//Desenvolva um método para validar o CPF passado via parâmetro. Pesquise sobre a
//validação de CPF. O método deve retornar true se o CPF for válido ou false, caso
//contrário. Teste invocando o método com seu CPF dentro do método main. CPF TEM 11 DIGITOS/
/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu cpf, (somente numeros) ");
        String cpf = scanner.nextLine();
        cpf = cpf.replaceAll("[^0-9]", ""); // remover caracters nao numericos
        boolean numeroValido = validarCpf(cpf);
        System.out.println(numeroValido ? "cpf valido" : "CPF INVALIDO, ELE DEVER TER 11 DIGITOS");
    }

    public static boolean validarCpf(String resultadocpf) {

        return resultadocpf.length() == 11;
    }
}*/
//==================================================subrotinas===================================================================
//Faça um método estático do tipo função, chamado Aumento. O método irá receber dois
//valores reais (X e Y) como parâmetros, calcular e retornar o aumento de X em Y%. Teste
//o método em main no qual o valor de X representará o preço à vista de uma mercadoria
//em uma loja de roupas e Y o percentual de acréscimo para o pagamento com cartão.
/*public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor da sua compra: ");
        int valorX = scanner.nextInt();
        scanner.nextLine();
        System.out.println("a compra sera no credito? ");
        String resposta = scanner.nextLine();
        switch (resposta){
            case "sim" :
                valorAdcional(valorX);
                System.out.println("o valor total e " +valorX); // note que o x ainda estara valendo o valor antes da chamado da subrotina,
                System.out.println("o valor total e " +valorAdcional(valorX)); // para adcionar o resultado da subrotina basta fazer isso, ou fazer SOUT na propria subrotina;
                break;
            case  "nao" :
                System.out.println("o valor total nao tem custo adcional " +valorX);
        }
    }
    public static int valorAdcional(int valorX){
        int total = (int) (valorX + valorX * 0.10);
        System.out.println("total " +total);
        return total;
    }
}*/
//-------------------------------------------------------maior valor----------------------------------------------------
//Faça um método que receba como parâmetro três números inteiros: a, b e c. O método
//deve calcular e retornar o maior dos três. Chame esse método a partir do método main
//da classe para testá-lo.
/*public class Main {
    public static void main (String[] args){
    int[] valor = new int [3];
        System.out.println("o maior valor digitado é " +valorAdd(valor));
    }
    public static int valorAdd (int valor[]) {
        Scanner scanner = new Scanner(System.in);
        int menorValor = 0;
        int maiorValor = 0;
        for (int i = 0; i < valor.length; i++) {
            valor[i] = i + 1;
            System.out.println("o valor atual e " + valor[i]);
             valor[i] = scanner.nextInt();
            if (valor[i] == 0) {
                menorValor = valor[i];
                maiorValor = valor[i];
            } else if (menorValor > valor[i]) {
                menorValor = valor[i]; // se o valor digitado for menor que o armazenado na variavel valor, menor valor sera igual a valor
            }
            if (valor[i] > maiorValor) {
                maiorValor = valor[i]; // se o valor digitado for maior que o valor armazenado na variavel, variavel recebe esse valor.
            }

        }
        return maiorValor; // retorna o valor final para o programa principal.
    }
}*/

//   if (i == 0 ) {
//menorNota = nota[i];
//maiorNota = nota[i];
//        } else if (menorNota > nota[i]) {
//menorNota = nota[i];
//        }
//        if (nota[i] > maiorNota)
//maiorNota = nota[i];
//import java.util.Scanner;
///===================================================================================================================
//public class Main {
//    public class exerciocio{
//        public static void main (String[] args){
//            Scanner scanner = new Scanner(System.in);
//
//            int x[] = {10, 21, 3, 14, 35, 16, 7 , 48};
//            System.out.println("media " +media(x));
//        }
////        calcula a media dos elementos de um vetor de v;
//        public  static double media(int v[]){
//            double soma = 0;
//            for (int i = 0; i < v.length; i++){
//                soma+= v[i];
//            }
//            return (soma/v.length);
//        }
//    }
//}
//-----------------------------------------------------------------------------------------------------------------------
//Faça uma classe Java executável para resolver o seguinte problema. Dados dois vetores,
//um para as idades e outro para os respectivos salários de 27 funcionários de uma
//empresa, o programa deve calcular e exibir a média dos salários dos funcionários com
//mais de 40 anos. O método main deve ler os dois vetores do usuário e chamar o seguinte
//método estático para realizar o cálculo: public static double media(double salario[], int idade[], int numeropessoas[]) {

/*public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tam;
        System.out.println("digite a quantidade de pessoas ");
        tam = scanner.nextInt();
        int numeropessoas[] = new int[tam];
        double salario[] = new double[tam];
        int idade[] = new int[tam];
        for (int i = 0; i < numeropessoas.length; i++) {
            System.out.println("digite o salario da pessoa " +(i +1));
            salario[i] = scanner.nextDouble();
            System.out.println("digite a idade da pessoa " +(i + 1));
            idade[i] = scanner.nextInt();
            System.out.println("o salario da pessoa " +(i+ 1)+ " é: " +salario[i]);
        }

        double resultado = media(idade, numeropessoas, salario);

        System.out.println("teste foi "+resultado);

    }
    public static double media(int[] idade, int[] numeropessoas, double[] salario) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double contador = 0;

        for (int i = 0; i < idade.length; i++) {
        if  (idade[i] > 40){
            soma += salario[i];
            contador++;
        }
        }
        if (contador == 0){
            return 0;
        }
        return soma/contador;
    }

}*/
//======================================PROGAMACAO ORIENTADA A OBJETOS POO==============================================

/*public class Carro {
    private String placa, cor, modelo;
    private LocalDateTime entrada, saida;

    public Carro (String placa, String cor, String modelo){
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;

    }
//    registra entraxa po:
    public void entrar (LocalDateTime daHoraEntrada){
        this.entrada = daHoraEntrada;
    }
    public void sair (LocalDateTime dataHoraSaida){
        this.saida = dataHoraSaida;
    }
//retorna a placa;
    public String getPlaca (){return  this.placa;}
//    calcula tempo de permanencia em minutos;

public long cauculaTempoViagem(){
    LocalDateTime ate;
    if (this.saida == null)  // se o carro nao saiu do estacionamento
        ate = LocalDateTime.now();
    else
        ate = this.saida; // calcula qual a data de saida ja registrada
        Duration periodo = Duration.between((Temporal) entrada, (Temporal) ate);
        return  periodo.toMinutes();
    }

    private static class LocalDateTime {
        public static LocalDateTime now() {
            return null;
        }
    }
}*/
//------------------------------------------------------------------------------------------------------------------
/*class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fat = fatorial(6);
        System.out.println("fatorial() =" +fat);
    }
    public static int fatorial (int n){
        int fat = 1;
        for (int i = 2; i <=n; i++) {
        fat = fat * i;
        }
        return  fat;
    }

}/*