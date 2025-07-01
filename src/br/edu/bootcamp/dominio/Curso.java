package br.edu.bootcamp.dominio;

public class Curso extends Conteudo{

    public Curso(){}

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao, cargaHoraria);
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

}
