package br.nom.belo.marcio;


public class Data
{
    private int dia, mes, ano;
    public Data(int i, int j, int k)
    {
        dia = k;
        mes = j;
        ano = i;
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes < 1 || dia > diasPorMes[mes]) {
            dia = 1;
            mes = 1;
            ano = 1900;
        }

    }

    public int getDia()
    {
        return dia;
    }

    public int getMes()
    {
        return mes;
    }

    public int getAno()
    {
        return ano;
    }

    public Data adicionarDias(int i)
    {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int novoDia = this.dia + i;
        int novoMes = this.mes;
        int novoAno = this.ano;

        while (novoDia > diasPorMes[novoMes]) {
            novoDia -= diasPorMes[novoMes];
            novoMes++;
            if (novoMes > 12) {
                novoMes = 1;
                novoAno++;
            }
        }

        if (novoDia > diasPorMes[novoMes] || novoMes < 1 || novoDia < 1) {
            return new Data(1900, 1, 1);
        }

        return new Data(novoAno, novoMes, novoDia);
    }
}