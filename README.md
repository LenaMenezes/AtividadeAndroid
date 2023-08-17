# AtividadeAndroid

<h2>Atividade de JAVA, exercicios de Fixação</h2>
<h4>Nome da Dupla: José Vinicius Valmoleda Laranjeira de Araujo e Helena Menezes Macedo</h4>

<p>2 Parte: Código do Menu/MainActivity</p>

![Manipular Strings](https://github.com/LenaMenezes/AtividadeAndroid/assets/101807407/cacbc00b-20c8-4ca6-89f3-928603dfca86)
Á cima codigo utilizado para declarar as strings das Views para manipulação. "<string name= >" declarar o nome do id da view, e entre as duas tagas, o que vai dentro do corpo da view.

<h2><p>Aqui está o código da Activity principal, que será usada para implementar as outras telas</p></h2>

![Intents](https://github.com/LenaMenezes/AtividadeAndroid/assets/101807407/a537094b-7c15-43e8-ab9c-64e861393ca7)
<h2>usando método void pois não ira retornar valor para a tela. "abrirTela1(View view)" nome que damos para o método e em seguida qual é sua classe, no caso view já que toda activity é uma.</h2>  
<h3>"Intent intent = new Intent(this, verificarMultiplos.class);" Criando a função intent, o this mostra qual será o caminho para essa nova tela, sendo a classe da activity específica usada como ponto de ligação. Depois temos o "startActivity(intent);" para iniciar a atividade ou abrir a nova tela.</h3>

<p>3 Parte: Código dos Exercicio</p>

<h2>Exercicio 1</h2>

![Exercicio1 Cod](https://github.com/LenaMenezes/AtividadeAndroid/assets/101807407/a3707987-96b2-4be3-8f4d-8a4c7686d24d)
Na classe public nós criamos o método que será usado para escrever a logica. 
"EditText idValorA = findViewById(R.id.idValorA);
        EditText idValorB = findViewById(R.id.idValorB);
        TextView idResultado2 = findViewById(R.id.idResultado2);" nessa parte temos a declaração de cada subclasse de uma view na classe da activity do exercicio 1, usando a função findViewById para achar a view pelo id, qeu está na parte das strings.

<h4><p>Declarando as vars que determinam o valor que as views devem receber.</p></h4>
" int a = Integer.parseInt(idValorA.getText().toString());
        int b = Integer.parseInt(idValorB.getText().toString());" 

"  if (saoMultiplos(a, b)) {
            idResultado2.setText("São múltiplos");
        } else {
            idResultado2.setText("Não são múltiplos");
        }
    }"
estrutura condicional, onde irá mostrar de acordo como exercicio se os valores que forem colocados na View forem múltiplos ou não forem múltiplos. "setText" envia a mensagem dependendo do valor e da condição dele.

<h3><p>Parte em que será feito o cálculo de ambos os números, para ver se eles são múltiplos. Retornando o valor, seguindo a regra de o n1/n2, sendo resto não múltiplo e, não tendo o resto sendo múltiplo.</p></h3>
"  public boolean saoMultiplos(int a, int b) {
        return a % b == 0 || b % a == 0;
    }
}" 

<h2>Exercicio 4</h2>

![Exercicio 2 Cod](https://github.com/LenaMenezes/AtividadeAndroid/assets/101807407/1e941dd8-be3b-43cb-8385-91e3c940a709)

<p>Nesse temos uma mudança na declaração do que será resgatado das views. No caso</p>

"int horarioEntrada = Integer.parseInt(id_horario_entrada.getText().toString());
        int horarioSaida = calcularHorarioSaida(horarioEntrada);"
"integer.parseInt" pegando o valor que será inteiro, "getText" método que resgata o resultado que será um valor int e "toString" para converter para string.

<p>Aqui estamos fazendo uma concatenando para mostrar o resultado</p>
"  idResultado.setText("Horário de Saída: " + horarioSaida + "h");"
"+ horarioSaida +" mostrar junto das strings o valor da var que está declarada como horarioSaida.

<p>Cálculo do horario de entrada junto das horas trabalhadas.</p>
"   public int calcularHorarioSaida(int horarioEntrada) {
        return (horarioEntrada + 6) % 24;
    }"
"return (horarioEntrada + 6) % 24" retorna o valor do cálculo, horarioEntrada que será colocado na view com mesmo Id, + 6, que são as horas trabalhadas e por % que significa o total no geral, á partir de 1 dia.

<h3>Com isso acabamos as atividades.</h3>
