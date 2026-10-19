package br.com.produtos.pratica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ProdutoPerecivel extends Produto {
    //Atributo referenciando Framework LocalDate
    private LocalDate dataVencimento;
    
    //Construtor
    public ProdutoPerecivel (String nome, float preco, int quantidade, LocalDate dataVencimento){
        //Parâmetros da SuperClasse
        super(nome, preco,quantidade);
        
        //Referência de Atributo
        this.dataVencimento = dataVencimento;
    }
    
    //Modicador
    public void setDataVencimento(LocalDate dataVencimento){
        this.dataVencimento = dataVencimento;
    }
    
    //Acessor
    public LocalDate getDataVencimento(){
        return dataVencimento;
    }
    
    //Sobreposição toString
    @Override
    public String toString(){
        //Ajuste para exibição de Data
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Produto: " + getNome() + " | " + "Preco: " + getPreco() + " | " + "Quantidade: " + getQuantidade() + 
                " | " + getDataVencimento().format(formatador);
    }
    
    public static void main(String[] args) {
        //Declaração dos Objetos e Lista
        ArrayList<ProdutoPerecivel> listaProduto = new ArrayList<>();
        ArrayList<ProdutoPerecivel> listaProduto2 = new ArrayList<>();
        ProdutoPerecivel produto1 = new ProdutoPerecivel("Arroz", 27.4f, 40, LocalDate.of(2027, 04, 21));
        
        //Adição de itens
        listaProduto.add(produto1);
        
        //Saída dos valores antes do Setter
        System.out.println(produto1 + "\n__________________________" 
                + "\nLista: " + listaProduto);
        
        System.out.println("=====================================================================");
        
        //Após os Setters
        produto1.setDataVencimento(LocalDate.of(2026, 11, 15));
        produto1.setPreco(58.6f);
        produto1.setQuantidade(3);
        listaProduto2.add(produto1);
        System.out.println(produto1 + "\n__________________________" 
                + "\nLista: " + listaProduto2);
    }
}
