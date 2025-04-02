/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor;


/**
 *
 * @author Biehl
 */
public class conversorTemperatura extends conversorJframe{

    private double temperatura;
    private String tipoClima;

    public conversorTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperaturaFahrenheit() {
        double conta = (temperatura - 32) * 5 / 9;
        return conta;
    }

    public double getTemperaturaCelsius() {
        double conta = (temperatura * 9 / 5) + 32;
        return conta;
    }

    public String getTipoClima() {
        if (temperatura <= 64.2) {
            return "Clima frio";
        } else if (temperatura >= 66.2 && temperatura <= 73.4) {
            return "Clima agradável";
        } else if (temperatura >= 75.2 && temperatura <= 95) {
            return "Clima quente";
        } else {
            return "Clima muito quente";
        }
    }

    public void setTipoClima(String tipoClima) {
        this.tipoClima = tipoClima;
    }

    @Override
    public String toString() {
        return tipoClima;
    }

}
