public class QUIZ {
    public static void main(String[] args) {

        Cabecalho.escrava_na_tela();
        //Cabecalho c = new Cabecalho();
       // c.escrava_na_tela();

        int contador = 0;
        double taxa_de_acerto;

        System.out.println("Bem-vindo ao quiz!");

        Questao q1 = new Questao();

        // Configurando os atributos da questão
        q1.pergunta = "Qual é o nome do equipamento que reduz as emissões de gases poluentes nos carros?";
        q1.opcaoA = "A) Catalisador";
        q1.opcaoB = "B) Radiador";
        q1.opcaoC = "C) Alternador";
        q1.opcaoD = "D) Compressor";
        q1.opcaoE = "E) Amortecedor";
        q1.correta = "A";

        // Mostra a questão para o usuário
        q1.escrevaQuestao();

        // Lê a resposta do usuário
        String respostaUsuario = q1.leiaResposta();

        // Verifica se a resposta está correta
        q1.isCorreta(respostaUsuario);

        if (q1.isCorreta(respostaUsuario))
            contador = contador+ 1;


        //questoes da segunda perguta do quiz
        Questao q2 = new Questao();
        q2.pergunta= "Qual componente é responsável por transmitir a potência do motor para as rodas?";
        q2.opcaoA = "A) Transmissão";
        q2.opcaoB = "B) Radiador";
        q2.opcaoC = "C) Alternador";
        q2.opcaoD = "D) Amortecedor";
        q2.opcaoE = "E) Embreagem";
        q2.correta = "A";
//      escrevendo segunda questão
        q2.escrevaQuestao();
        // lendo a resposta do usuario
        String respostaUsuario2 = q2.leiaResposta();


        q2.isCorreta(respostaUsuario2);
        if (q2.isCorreta(respostaUsuario2))
            contador = contador+ 1;


        Questao q3 = new Questao();
        q3.pergunta = "Qual é o nome do sistema que impede que as rodas do carro patinem ao arrancar?";
        q3.opcaoA = "A) ABS";
        q3.opcaoB = "B) Controle de tração";
        q3.opcaoC = "C) Amortecedor";
        q3.opcaoD = "D) Transmissão";
        q3.opcaoE = "E) Suspensão";
        q3.correta = "B";

        q3.escrevaQuestao();
        // lendo a resposta do usuario
        String respostaUsuario3 = q3.leiaResposta();


        q3.isCorreta(respostaUsuario3);
        if (q3.isCorreta(respostaUsuario3))
            contador = contador + 1;
        taxa_de_acerto = (contador * 100) /15;


        Questao q4 = new Questao();
        q4.pergunta = "Qual é a principal função do diferencial em um veículo?";
        q4.opcaoA = "A) Distribuir a força igualmente entre as rodas.";
        q4.opcaoB = "B) Reduzir o desgaste dos pneus.";
        q4.opcaoC = "C) Aumentar a potência do motor.";
        q4.opcaoD = "D) Permitir que as rodas girem a velocidades diferentes em curvas.";
        q4.opcaoE = "E) Melhorar a aerodinâmica do carro.";
        q4.correta = "B";

        q4.escrevaQuestao();
        // lendo a resposta do usuario
        String respostaUsuario4 = q4.leiaResposta();


        q4.isCorreta(respostaUsuario4);
        if (q4.isCorreta(respostaUsuario4))
            contador = contador + 1;
        taxa_de_acerto = (contador * 100) /15;

        Questao q5 = new Questao();
        q5.pergunta = "Quem é considerado o inventor do primeiro automóvel movido a gasolina?";
        q5.opcaoA = "A) Henry Ford";
        q5.opcaoB = "B) Karl Benz";
        q5.opcaoC = "C) Nikolaus Otto";
        q5.opcaoD = "D) Gottlieb Daimler";
        q5.opcaoE = "E) Ferdinand Porsche";
        q5.correta = "B";

        q5.escrevaQuestao();
        // lendo a resposta do usuario
        String respostaUsuario5 = q5.leiaResposta();


        q5.isCorreta(respostaUsuario5);
        if (q5.isCorreta(respostaUsuario5))
            contador = contador + 1;
        taxa_de_acerto = (contador * 100) /15;

        Questao q6 = new Questao();
        q6.pergunta = "Em que ano foi lançado o Ford Model T, o primeiro carro produzido em massa?";
        q6.opcaoA = "A) 1915";
        q6.opcaoB = "B) 1920";
        q6.opcaoC = "C) 1895";
        q6.opcaoD = "D) 1908";
        q6.opcaoE = "E) 1910";
        q6.correta = "D";

        q6.escrevaQuestao();
        // lendo a resposta do usuario
        String respostaUsuario6 = q6.leiaResposta();


        q6.isCorreta(respostaUsuario6);
        if (q6.isCorreta(respostaUsuario6))
            contador = contador + 1;
        taxa_de_acerto = (contador * 100) /15;


        Questao q7 = new Questao();
        q7.pergunta = "Qual foi o primeiro carro esportivo da Ferrari?";
        q7.opcaoA = "A) Ferrari 250 GTO";
        q7.opcaoB = "B) Ferrari Dino";
        q7.opcaoC = "C) Ferrari Testarossa";
        q7.opcaoD = "D) Ferrari LaFerrari";
        q7.opcaoE = "E) Ferrari 125 S";
        q7.correta = "E";

        q7.escrevaQuestao();
        // lendo a resposta do usuario
        String respostaUsuario7 = q7.leiaResposta();


        q7.isCorreta(respostaUsuario7);
        if (q7.isCorreta(respostaUsuario7))
            contador = contador + 1;
        taxa_de_acerto = (contador * 100) /15;


       // System.out.println("parebéns você ja tem um acerto de " + contador);
        // System.out.println(" taxa de acerto em "+taxa_de_acerto+"%");

    }
}
