package br.edu.bootcamp.dominio;

public class Curso extends Conteudo{

    public Curso(){}

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao, cargaHoraria);
    }

    @Override
    public double getXP() {
        return XP_PADRAO + 30d;
    }

}
