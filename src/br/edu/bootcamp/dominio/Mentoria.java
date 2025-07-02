package br.edu.bootcamp.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria(){}

    public Mentoria(String titulo, String descricao, int cargaHoraria) {
       super(titulo, descricao, cargaHoraria);
    }

    @Override
    public double getXP() {
        return XP_PADRAO + 40d;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo: " + getTitulo() +
                "Descricao: " + getDescricao() +
                "Data: " + data +
                "}";
    }
}
