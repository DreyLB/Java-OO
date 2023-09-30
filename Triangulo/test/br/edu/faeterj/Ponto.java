package br.edu.faeterj;

public class Ponto {
    double x;
    double y;



    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanciaAte(Ponto outroPonto) {
        double deltaX = outroPonto.getX() - this.x;
        double deltaY = outroPonto.getY() - this.y;

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
