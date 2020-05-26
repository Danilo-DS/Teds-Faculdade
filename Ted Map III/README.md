# Métodos Avançados de Programação

## UNIESP Faculdades

### Professora

* Drª Alana Morais ([alanamm.prof@gmail.com](mailto:alanamm.prof@gmail.com))

### Aluno
Danilo A. Costa da Silva


### Padrão Comportamental: 
## State
O padrão State(Estado) é utilizado quando queremos manipular o comportamento de uma objeto de acordo com o seu estado atual.
### Problema: 

Mudar estado de objetos sem a utilização de estruturas de condicionais, como fazer isso ?


### Solução: 
Utilizar classes para realizar as mudanças de estados, prevendo todos os estados possiveis do objeto.


### Consequências: 
Diminui a utilização de estruturas de controle muito extenças.

Aumenta a coesão.

Diminui o Acoplamento.

### Exemplo: 

Para o exemplo iremos utilizar uma lampada como objeto, então vamos listar os possiveis estados em que uma lampada pode se encontrar, esses são "Desligada", "Ligada", "Queimada". Esses são os possiveis e comuns estados em que uma lampada pode ter. Geralmente quando vamos verificar o estado da lampada utilizamos os IFs, mas com esse padrão iremos mudar o estado do objeto atraves de classes.

Para a implementação do Padrão State, vamos criar uma classe interface (poderia ser uma class abstract) que contém o metodo estado do tipo String que recebe um contexto(objeto) como parâmetro, após isso iremos criar as classes que com os estados citados a cima que vão implementar essa interface, por fim criaremos a classe contexto (no nosso exemplo Lampada) ela terar uma composição com a interface e seus getter e setter. Veja o diagrma e o codigo acima para melhor entendimento.
