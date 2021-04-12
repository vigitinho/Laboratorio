/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

import java.util.Scanner;

public class Laboratorio2 {

    String Produto;
    int Qproduto;
    int Expiration_date;
    int n1, n2, n3, n4;

    int Qestoque, Pcomprado;
    int mod;
    int PQ;

    Scanner entrada = new Scanner(System.in);

    int menos() {

        System.out.println("Informe a quantia gasta do produto: ");
        n4 = entrada.nextInt();

        return Qestoque = Qproduto - n4;
    }

    int mais() {

        System.out.println("Informe a quantia acrescentada: ");
        n4 = entrada.nextInt();

        return Qestoque = Qproduto + n4;

    }

    void escolha() {

        System.out.println(">>Selecione uma das opções<<");
        System.out.println("[1]>>Descontar do estoque<<");
        System.out.println("[2]>>Adicionar produtos ao estoque<<");

        mod = entrada.nextInt();
        produtoQuimico();
        //Laboratorio es = new Laboratorio();

        switch (mod) {
            case 1:

                System.out.println("Você possui " + menos() + " em estoque.");
                break;

            case 2:
                System.out.println("Você possui " + mais() + " em estoque.");
                break;
        }
    }

    void produtoQuimico() {

        System.out.println(">>Selecione uma das opções<<");
        System.out.println("[1]>>Alcool Etilico<<");
        System.out.println("[2]>>Sulfato de Sodio<<");
        System.out.println("[3]>>Clorofórmio<<");
        PQ = entrada.nextInt();

        switch (PQ) {
            case 1:
                Qproduto = 400;
                System.out.println("No momento seu estoque possue " + Qproduto + " de álcool etílico.");

                break;
            case 2:
                Qproduto = 500;
                System.out.println("No momento seu estoque possue " + Qproduto + " de Sulfato de Sodio.");

                break;

            case 3:
                Qproduto = 600;
                System.out.println("No momento seu estoque possue " + Qproduto + " de Clorofórmio.");

                break;
        }

    }

    public static void main(String[] args) {

        Laboratorio2 es = new Laboratorio2();

        es.escolha();

    }
}
