/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa;

/**
 *
 * @author Aluno_Manha
 */
public class Cliente {
    private static String nome;
    private static String catCNH;
    private static String telefone;
    private static int idade;
    private static int compra; // 0 = aluguel | 1 = compra
    private static int qtd_dias;
    private static int id_carro;

    public Cliente(String nome, String catCNH, String telefone, int idade){
        Cliente.nome = nome;
        Cliente.catCNH = catCNH;
        Cliente.telefone = telefone;
        Cliente.idade = idade;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String aNome) {
        nome = aNome;
    }

    public static String getCatCNH() {
        return catCNH;
    }

    public static void setCatCNH(String aCatCNH) {
        catCNH = aCatCNH;
    }

    public static String getTelefone() {
        return telefone;
    }

    public static void setTelefone(String aTelefone) {
        telefone = aTelefone;
    }

    public static int getIdade() {
        return idade;
    }

    public static void setIdade(int aIdade) {
        idade = aIdade;
    }

    public static int getCompra() {
        return compra;
    }

    public static void setCompra(int aCompra) {
        compra = aCompra;
    }

    public static int getQtd_dias() {
        return qtd_dias;
    }

    public static void setQtd_dias(int aQtd_dias) {
        qtd_dias = aQtd_dias;
    }

    public static int getId_carro() {
        return id_carro;
    }

    public static void setId_carro(int aId_carro) {
        id_carro = aId_carro;
    }
}
