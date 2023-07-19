package JogoModelo;

import JogoApresentacao.TelaJogo;
import java.util.ArrayList;

public class Residuo
{

    private String nome;
    private String tipo;

    public Residuo(String nome, String tipo)
    {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome()
    {
        return nome;
    }

    public String getTipo()
    {
        return tipo;
    }
}
