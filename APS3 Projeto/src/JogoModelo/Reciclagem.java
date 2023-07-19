package JogoModelo;

import JogoApresentacao.TelaJogo;

public class Reciclagem
{
    private TelaJogo telaJogo;
    private int score = 0;
    
    public Reciclagem(TelaJogo telaJogo)
    {
        this.telaJogo = telaJogo;
    }

    public void verificarResiduo(Residuo residuo, String tipoLixeiraSelecionada)
    {
        if (residuo.getTipo().equals(tipoLixeiraSelecionada))
        {
            this.score++;
            //som.tocarSomAcerto();
        } else {
            //som.tocarSomErro();
        }
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }


}
