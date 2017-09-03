# Seaview
Projeto de Um submarino que receberá comandos basicos como Left, right, upper and Down, converterá essas sequencias de comandos em um tratamento único e realizará a ação de um dos melhores submarinos das séries de TV. 

# Sobre o projeto

É um projeto simples que tem por objetivo criar uma classe que receberá comandos e fará um submarino mover-se no plano cartesiano. 

# Descrição da Atividade: Viagem ao fundo do mar 


Uma equipe de cientista está explorando a fossa das Marianas e para isso utiliza submarinos não tripulados. Os cientistas já mapearam a área a ser explorada e a dividiram em três eixos: X, Y e Z. Esses eixos controlam o posicionamento e profundidade do submarino.

A posição do submarino é representado pela notação (0, 0, 0, NORTE) que indica os pontos X, Y, Z e a direção que o submarino aponta (Norte, Sul, Leste e Oeste).

Os cientistas utilizam uma serie comandos simples para fazer a movimentação do submarino: L, R, para girar o submarino para esquerda ou direita, M para mover o submarino e U e D para subir ou descer o submarino.

Você deve desenvolver um sistema que processe uma série de comandos e faça a navegação desse submarino.

Para simplificar, leve em consideração que o submarino sempre começará no ponto (0, 0, 0, NORTE) e que todo movimento quando o submarino estiver apontada para o NORTE, somará 1 ao eixo Y, todo movimento quando o submarino estiver apontada para o LESTE somará 1 ao eixo X e todo movimento para baixo diminuirá 1 do eixo Z. Ah, vale lembrar que 0 no eixo Z é a superfície do oceano

## Considerações

Ao "M"over para NORTE acrescenta 1 em Y, logo, ao "M"over para SUL, subtrai 1 em Y.
Ao "M"over para LESTE acrescenta 1 em X, logo, ao "M"over para OESTE, subtrai 1 em X.
A cada "D"own subtrairá 1 em Z, assim como, cada U, acrescentará 1 em Z.


## Entradas de Exemplo:

Os cientistas mandarão os comandos agrupados em uma única linha, como no exemplo:
```
LMRDDMMUU
```
e
```
RMMLMMMDDLL
```


## Saída:

A saída deverá conter a coordenada final do submarino junto com sua direção, como no exemplo:

```
-1 2 0 NORTE
```
e
```
2 3 -2 SUL
```
respectivamente

## Sobre o Desenvolvimento:


Foi utilizado:

```
## Java7 
## JUnit
## Demoiselle Framework
```

## Sobre os Testes

Foram planejados testes simples usando JUNIT e testando todas os métodos públicos 

## Sobre a Execução
Prefira rodar os testes via JUNIT a rodar pelo executavel. Caso descida rodar o executavel, segue o comando.
```
java -jar SeaView.jar LMRDDMMUU
```
