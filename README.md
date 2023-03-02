# TargetSistemas
Desafio técnico para estágio na Target Sistemas.

## 1) Observe o trecho de código abaixo:
Qual será o valor da variável SOMA?
```
int INDICE = 13, SOMA = 0, K = 0;
enquanto K < INDICE faça
{
K = K + 1;
SOMA = SOMA + K;
}
imprimir(SOMA);
```
O valor da SOMA é 91, cheguei neste resultado de uma forma bem simples, escrevi esse pseudocódigo na linguagem Kotlin, você pode conferir [clicando AQUI](https://github.com/YgorDoring/TargetSistemas/blob/master/src/main/kotlin/FirstQuestion/Main.kt). Executando o código cheguei no resultado de 91.

## 3) Descubra a lógica e complete o próximo elemento:
a) A sequência é composta pelos números ímpares consecutivos começando em 1. O próximo número seria 9.

b) Acredito que seja referenciado ao 2 elevado à potência n, começando em n = 1. O próximo número seria 128.

c) 

d) A sequência em questão é composta pelos quadrados dos números pares, a resposta da sequência é 100.

e) Tirando o zero, como mostrado inclusive no segundo desafio, a sequência em questão parece ser a fibonacci, logo, chuto que o resultado seja 13.

f) Talvez a resposta seja 20, acredito que aqui não tenha nenhuma lógica já que não existe padrão. Apenas posso afirmar que os últimos 4 números seguiram uma sequência.

## 4) Dois veiculos ao se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?
A quarta questão parece complexa, mas, na verdade, não passa de uma pegadinha que desafia seu senso lógico. Aqui não há necessidade de NENHUM cálculo, afinal a pergunta em questão é: Ao se cruzarem, qual estará mais próximo da cidade de Ribeirão Preto?

Horas... Imaginando o percurso como uma linha:

A______________________________B

Dado o cenário onde, do ponto A ao ponto B temos respectivamente as cidades de Ribeirão Preto e Franca, o caminhão, saindo do ponto B (Franca) a caminho do ponto A (Ribeirão Preto), independentemente de onde eles estejam, cruzando-se, o carro, que partiu do ponto A (Ribeirão Preto), estará mais "longe" do que o caminhão que partiu do ponto B (Franca) a caminho do ponto A (Ribeirão Preto).

A___CARRO___________<->___________CAMINHÃO___B

Logo, para concluir, independente de onde estejam, suas distâncias, velocidades ou obstáculos, ao se cruzarem, automaticamente o Caminhão que partiu do ponto B (Franca) estará mais próximo a cidade de Ribeirão Preto. Respondendo assim, a quarta questão.

## 5) Escreva um programa que inverta os caracteres de um string:
Seguindo as recomendações, segue a solução: [Acesse o código aqui.](https://github.com/YgorDoring/TargetSistemas/blob/master/src/main/kotlin/FifthQuestion/Main.kt)
