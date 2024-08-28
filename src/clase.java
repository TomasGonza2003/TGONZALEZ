/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class clase {
    private String marca,modelo,color,tipoTransmision,tipocombustible;
    private int año,cantidadPuertas;
    private double cilindrada;

    public clase() {
        
    }

    public clase(String marca, String modelo, String color, String tipoTransmision, String tipocombustible, int año, int cantidadPuertas, double cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoTransmision = tipoTransmision;
        this.tipocombustible = tipocombustible;
        this.año = año;
        this.cantidadPuertas = cantidadPuertas;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public String getTipocombustible() {
        return tipocombustible;
    }

    public void setTipocombustible(String tipocombustible) {
        this.tipocombustible = tipocombustible;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "clase{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipoTransmision=" + tipoTransmision + ", tipocombustible=" + tipocombustible + ", a\u00f1o=" + año + ", cantidadPuertas=" + cantidadPuertas + ", cilindrada=" + cilindrada + '}';
    }
    public static void main(String[] args) {
        clase auto1 = new clase();
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("");
        clase auto2=new clase("VW", "Escarabajo", "Amarillo", "Mecanica", "Bencinero", 1981, 2, 1500);
        System.out.println("");
        System.out.println("Marca: " + auto2.getMarca());
        System.out.println("Modelo: " + auto2.getModelo());
        System.out.println(auto2.toString());
    }
    
    
}
