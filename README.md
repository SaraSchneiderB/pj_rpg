# Ficha de RPG
#### Projeto simples em Java, orientado a objetos, efeituado para a criação de uma ficha (básica) de RPG - utilizando os conceitos de D&D (Dungeons & Drangons).

## Descrição
#### A ficha consiste em identificar determinadas características do personagem;
* A classe é de escolha livre. Sendo as possibilidades reservadas a mago, feiticeiro, guerreiro, bárbaro, clérigo e paladino;
* O nome do personagem é de escolha livre;
* O nível é de escolha livre - considerando do primeiro ao quinto;
* A classe de armadura é de escolha livre;
* O inventário será estipulado de acordo com a classe de personagem escolhida;
* Os pontos de vida serão estipulados de acordo com a classe de personagem e nível escolhidos;
* Aos conjuradores, os espaços de magia (spellslot) serão estipulados de acordo com a classe de personagem e nível escolhidos;
* As características de personagem será estipuladas de acordo com a classe de personagem e nível escolhidos;
* As peças de ouro (POs) serão estipuladas de modo aleatório, considerando média indicada pelo criador, tendo em mente as informações do livro de D&D 5e.

## Iniciando a criação da ficha
#### Ao iniciar, você verá a lista de opções de classes e em seguida deve digitar sua escolha.
#### Após preencher a opção, o programa irá lhe perguntar o nome do personagem, digite para continuar.
#### Em seguida, você será perguntado qual nível de personagem desejará ter.
#### Após essas informações, o programa irá lhe repassar o resumo de suas escolhas juntamente com as especificidades da classe e nível do personagem que você escolheu, como PVs (pontos de vida), spellslots, características do personagem e POs (peças de ouro). Dessa forma o procedimento estará completo!

## Estrutura do Projeto
#### O projeto constiste nas seguintes classes:

``` MeuPersonagem_RPG ```: Classe principal, onde o projeto será iniciado/executado. 

---
```Personagem```: Classe abstrata, que armazena atributos e métodos em comum com as classes herança. Sendo esses o nome, o nível, a característica de nível/personagem, a classe de armadura, os pontos de vida e o spellslot como atributos e peças de ouro como método.

---
```ClasseMago```: Classe herança

---
```ClasseFeiticeiro```: 

---
```ClasseGuerreiro```: 

---
```ClasseBarbaro```: 

---
```ClasseClerigo```: 

---
```ClassePaladino```: 

---

