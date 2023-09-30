package br.edu.faeterj;

public class Triangulo {

    Ponto pto1, pto2, pto3;

    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {

        if( verificaTriangulo( p1, p2, p3) )
        {
            this.pto1 = p1;
            this.pto2 = p2;
            this.pto3 = p3;
        }
        else
        {
            setaPontoInicial();
        }

    }

    private void setaPontoInicial() {
        this.pto1 = new Ponto( 0,0 );
        this.pto2 = new Ponto( 0,1 );
        this.pto3 = new Ponto( 1,0 );
    }

    private boolean verificaTriangulo(Ponto p1, Ponto p2, Ponto p3) {
        if( p1.distanciaAte(p2) >= p2.distanciaAte(p3)+ p1.distanciaAte(p3) )
        {
            return false;
        }
        if( p2.distanciaAte(p3) >= p1.distanciaAte(p2) + p1.distanciaAte(p3) )
        {
            return false;
        }
        return !(p1.distanciaAte(p3) >= p2.distanciaAte(p3) + p1.distanciaAte(p2));
    }

    public Ponto getP1() {
        return pto1;
    }

    public Ponto getP2() {
        return pto2;
    }

    public Ponto getP3() {
        return pto3;
    }

    public void setP3(Ponto ponto) {
        if( verificaTriangulo(pto1, pto2, ponto))
        {
            this.pto3 = ponto;
        }
        else
        {
            setaPontoInicial();
        }
    }

}
