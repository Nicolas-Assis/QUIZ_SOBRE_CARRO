public class QUIZ {
    public static void main(String[] args) {

        Cabecalho.escrava_na_tela();

        double contador = 0;
        double taxa_de_acerto;


        Questao q1 = new Questao();

        // Configurando os atributos da questão
        q1.pergunta = " 1): Qual é o nome do equipamento que reduz as emissões de gases poluentes nos carros?";
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

        System.out.println("------------------------------------------------------------------------");


        //questoes da segunda perguta do quiz
        Questao q2 = new Questao();
        q2.pergunta= "2): Qual componente é responsável por transmitir a potência do motor para as rodas?";
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

        System.out.println("------------------------------------------------------------------------");

        Questao q3 = new Questao();
        q3.pergunta = "3): Qual é o nome do sistema que impede que as rodas do carro patinem ao arrancar?";
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

        System.out.println("------------------------------------------------------------------------");

        Questao q4 = new Questao();
        q4.pergunta = "4): Qual é a principal função do diferencial em um veículo?";
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

        System.out.println("------------------------------------------------------------------------");


        Questao q5 = new Questao();
        q5.pergunta = "5): Quem é considerado o inventor do primeiro automóvel movido a gasolina?";
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

        System.out.println("------------------------------------------------------------------------");

        Questao q6 = new Questao();
        q6.pergunta = "6): Em que ano foi lançado o Ford Model T, o primeiro carro produzido em massa?";
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

        System.out.println("------------------------------------------------------------------------");

        Questao q7 = new Questao();
        q7.pergunta = "7): Qual foi o primeiro carro esportivo da Ferrari?";
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

        System.out.println("------------------------------------------------------------------------");

        Questao q8 = new Questao();
        q8.pergunta = "8): Qual dessas marcas pertence ao grupo Volkswagen?";
        q8.opcaoA = "A) Ferrari";
        q8.opcaoB = "B) Bentley";
        q8.opcaoC = "C) Tesla";
        q8.opcaoD = "D) Rolls-Royce";
        q8.opcaoE = "E) Lexus";
        q8.correta = "B";

        q8.escrevaQuestao();
        // lendo a resposta do usuario
        String respostaUsuario8 = q8.leiaResposta();


        q8.isCorreta(respostaUsuario8);
        if (q8.isCorreta(respostaUsuario8))
            contador = contador + 1;
        taxa_de_acerto = (contador * 100) /15;


        System.out.println("------------------------------------------------------------------------");

        Questao q9 = new Questao();
        q9.pergunta = "9): Qual é o modelo de carro esportivo mais vendido de todos os tempos?";
        q9.opcaoA = "A) Ford Mustang";
        q9.opcaoB = "B) Chevrolet Corvette";
        q9.opcaoC = "C) Porsche 911";
        q9.opcaoD = "D) Mazda MX-5 Miata";
        q9.opcaoE = "E) Dodge Challenger";
        q9.correta = "D";

        q9.escrevaQuestao();
        // lendo a resposta do usuario
        String respostaUsuario9 = q9.leiaResposta();


        q9.isCorreta(respostaUsuario);
        if (q9.isCorreta(respostaUsuario9))
            contador = contador + 1;
        taxa_de_acerto = (contador * 100) /15;

        System.out.println("------------------------------------------------------------------------");

        Questao q10 = new Questao();
        q10.pergunta = "10): Qual montadora fabrica o famoso modelo Hilux?";
        q10.opcaoA = "A) Mitsubishi";
        q10.opcaoB = "B) Chevrolet";
        q10.opcaoC = "C) Ford";
        q10.opcaoD = "D) Toyota";
        q10.opcaoE = "E) Nissan";
        q10.correta = "D";

        q10.escrevaQuestao();
        // lendo a resposta do usuario
        String respostaUsuario10 = q10.leiaResposta();


        q10.isCorreta(respostaUsuario10);
        if (q10.isCorreta(respostaUsuario10))
            contador = contador + 1;
        taxa_de_acerto = (contador * 100) /15;

        System.out.println("------------------------------------------------------------------------");

        Questao q11 = new Questao();
        q11.pergunta = "11): Qual é a principal função do turbocharger em um motor?";
        q11.opcaoA = "A) Reduzir o consumo de combustível";
        q11.opcaoB = "B) Aumentar a potência ao comprimir mais ar para o motor";
        q11.opcaoC = "C) Diminuir a emissão de poluentes";
        q11.opcaoD = "D) Melhorar a refrigeração do motor";
        q11.opcaoE = "E)  Reduzir o ruído do motor";
        q11.correta = "B";

        q11.escrevaQuestao();
        // lendo a resposta do usuario
        String respostaUsuario11 = q11.leiaResposta();


        q11.isCorreta(respostaUsuario11);
        if (q11.isCorreta(respostaUsuario11))
            contador = contador + 1;
        taxa_de_acerto = (contador * 100) /15;

        System.out.println("------------------------------------------------------------------------");

        Questao q12 = new Questao();
        q12.pergunta = "12): Qual foi o primeiro carro de Fórmula 1 a usar motor híbrido com sucesso?";
        q12.opcaoA = "A) McLaren MP4/4";
        q12.opcaoB = "B) Red Bull RB9";
        q12.opcaoC = "C) Mercedes F1 W05 Hybrid";
        q12.opcaoD = "D) Ferrari SF90";
        q12.opcaoE = "E) Renault RS20";
        q12.correta = "C";

        q12.escrevaQuestao();
        // lendo a resposta do usuario
        String respostaUsuario12 = q12.leiaResposta();


        q12.isCorreta(respostaUsuario12);
        if (q12.isCorreta(respostaUsuario12))
            contador = contador + 1;
        taxa_de_acerto = (contador * 100) /15;

        System.out.println("------------------------------------------------------------------------");

        Questao q13 = new Questao();
        q13.pergunta = "13): Qual é a marca com mais títulos na história da Fórmula 1?";
        q13.opcaoA = "A) Ferrari";
        q13.opcaoB = "B) McLaren";
        q13.opcaoC = "C) Mercedes";
        q13.opcaoD = "D) Williams";
        q13.opcaoE = "E) Red Bull";
        q13.correta = "A";

        q13.escrevaQuestao();
        // lendo a resposta do usuario
        String respostaUsuario13 = q13.leiaResposta();


        q13.isCorreta(respostaUsuario13);
        if (q13.isCorreta(respostaUsuario13))
            contador = contador + 1;
        taxa_de_acerto = (contador * 100) /15;

        System.out.println("------------------------------------------------------------------------");

        Questao q14 = new Questao();
        q14.pergunta = "14): Qual carro ficou famoso como Herbie nos filmes??";
        q14.opcaoA = "A) Mini Cooper";
        q14.opcaoB = "B) Volkswagen Fusca";
        q14.opcaoC = "C) Ford Mustang";
        q14.opcaoD = "D) Chevrolet Camaro";
        q14.opcaoE = "E) Dodge Charger";
        q14.correta = "B";

        q14.escrevaQuestao();
        // lendo a resposta do usuario
        String respostaUsuario14 = q14.leiaResposta();


        q14.isCorreta(respostaUsuario14);
        if (q14.isCorreta(respostaUsuario14))
            contador = contador + 1;
        taxa_de_acerto = (contador * 100) /15;

        System.out.println("------------------------------------------------------------------------");

        Questao q15 = new Questao();
        q15.pergunta = "15): Em que país foi fundada a montadora Volvo?";
        q15.opcaoA = "A) Alemanha";
        q15.opcaoB = "B) Suíça";
        q15.opcaoC = "C) Suécia";
        q15.opcaoD = "D) Noruega";
        q15.opcaoE = "E) Finlândia";
        q15.correta = "C";

        q15.escrevaQuestao();
        // lendo a resposta do usuario
        String respostaUsuario15 = q15.leiaResposta();


        q15.isCorreta(respostaUsuario15);
        if (q15.isCorreta(respostaUsuario15))
            contador = contador + 1;
        taxa_de_acerto = (contador * 100) /15;


        System.out.println("------------------------------------------------------------------------");

        double taxa_de_erro = (15 - contador);
        System.out.println("Parebéns você acertou: " + contador + " questões");
        System.out.println("Questões erradas: " + taxa_de_erro + " questões");
        System.out.printf("Sua taxa de acerto foi de: %.2f%%\n", taxa_de_acerto);


    }
}
