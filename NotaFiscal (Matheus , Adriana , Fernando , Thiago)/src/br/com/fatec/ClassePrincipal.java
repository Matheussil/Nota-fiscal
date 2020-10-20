/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import javax.swing.JOptionPane;

/**
 *
 * @author silas
 */
public class ClassePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NotaFiscal nF = new NotaFiscal();
        
        String op = "S";
            while(!op.equals("N")){ 
                 
                 int numeroNF;
                 numeroNF = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da NOTA FISCAL: "));
                 
                 String naturezaOperacao;
                 naturezaOperacao = JOptionPane.showInputDialog("Qual a natureza dessa operaçao?");
                 
                 nF.setNumero(numeroNF);
                 nF.setNaturOper(naturezaOperacao);
                 
                 System.out.println("Nota Fiscal nº: " + numeroNF);
                 System.out.println("Natureza Operação: " + naturezaOperacao);
                 
                 nF.addCliente();
                 nF.addPro();
                 
                 
                 
            int opc;
            opc = JOptionPane.showConfirmDialog(null, "Deseja fazer outra nota " + "?",
            "Mensagem ao usuario", JOptionPane.YES_NO_OPTION);
            if(opc == JOptionPane.NO_OPTION){
                op = "N";
       
    }
       }}}

/**Implemente um Projeto que possua as classes: Nota Fiscal,
Produto, Cliente, Lista de Produtos e Pilha de Notas Fiscais
(todas essas classes devem ser implementadas pelo grupo).
A classe Lista de Produtos deve possuir as operações 
explicadas em aula. As classes Nota Fiscal, Produto
e Cliente devem estar associadas segundo conceitos de
Orientação a Objetos. Esta nota fiscal tem um número,
data de emissão, natureza de operação, data de emissão,
cliente e uma lista de produtos. Elabore uma classe principal
com um menu que viabilize o teste. Na classe principal deve
ser possível criar uma nota fiscal (inserindo os dados da
nota fiscal, o cliente e os produtos). Cada nota fiscal será
adicionada em uma pilha*/