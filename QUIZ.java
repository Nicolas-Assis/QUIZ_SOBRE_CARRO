public class QUIZ {
    public static void main(String[] args) {

        Cabeçalho nome_da_facul = new Cabeçalho();
        Cabeçalho professor_nome = new Cabeçalho();
        professor_nome.nome_do_professor = "Professor: Brenno Pimenta";
        nome_da_facul.nome_da_faculdade = "UNIFAM";
        System.out.println(nome_da_facul);
        System.out.println(professor_nome);

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

       // System.out.println("parebéns você ja tem um acerto de " + contador);
        // System.out.println(" taxa de acerto em "+taxa_de_acerto+"%");

    }
}
