package br.com.produtos.pratica;

import java.util.ArrayList;

public class Produto {
    //Atributos
    private String nome;
    private float preco;
    private int quantidade;
    
    //Construtor
    public Produto(String nome, float preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    //Modificadores
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    //Acessores
    public String getNome(){
        return nome;
    }
    
    public float getPreco(){
        return preco;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public static void main(String[] args) {
    //Criação de lista e Objeto
    ArrayList<Produto> novaLista = new ArrayList<>();
    Produto p1 = new Produto("Aveia", 10.0f, 5);
    
    //Entrada ba Lista
    novaLista.add(p1);
    
    for(Produto p : novaLista){
        System.out.println("Produto: " + p.getNome() + " | Preco: " + p.getPreco() + " | Quantidade: " + p.getQuantidade());
    }
 }
}
