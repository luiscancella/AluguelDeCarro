/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa;

/**
 *
 * @author Aluno_Manha
 */
public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double precoCompra;
    private double precoAluguel;

    public Carro(String modelo,String marca,int ano,double precoCompra,double precoAluguel){
        this.modelo = modelo; 
        this.marca = marca; 
        this.ano = ano; 
        this.precoCompra = precoCompra; 
        this.precoAluguel = precoAluguel; 
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoAluguel() {
        return precoAluguel;
    }

    public void setPrecoAluguel(double precoAluguel) {
        this.precoAluguel = precoAluguel;
    }
    
    
}