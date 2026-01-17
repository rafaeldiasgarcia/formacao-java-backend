# Respostas - Active Recall: Strings em Java

### 1. Se eu tiver um loop for que roda 10.000 vezes e, dentro dele, eu fizer `texto = texto + "a";`, o que acontece na memória do computador (Heap) e por que isso é considerado uma má prática de performance?
Como as Strings em Java são imutáveis, a cada iteração do loop, o Java não altera o objeto original. Em vez disso, ele cria um novo objeto String no Heap contendo o resultado da concatenação (`texto` anterior + `"a"`). 
Ao final de 10.000 repetições, você terá criado milhares de objetos temporários que sobrecarregam a memória (Heap) e forçam o Garbage Collector a trabalhar muito mais para limpar esses objetos descartados. Para esses casos, o correto é usar `StringBuilder`.

### 2. Explique a diferença entre fazer `String s = "Java";` e `String s = new String("Java");` considerando o conceito de String Pool.
- `String s = "Java";`: O Java utiliza o **String Pool**. Ele verifica se a literal "Java" já existe na piscina. Se existir, ele apenas aponta a referência `s` para o objeto existente. Se não existir, ele cria na piscina.
- `String s = new String("Java");`: O Java é forçado a criar um **novo objeto** no Heap, fora (ou além) do String Pool, mesmo que a String "Java" já exista lá. Isso desperdiça memória, pois você acaba com dois objetos iguais em locais diferentes.

### 3. Por que a imutabilidade das Strings é importante para a segurança de uma aplicação?
A imutabilidade garante que o valor de uma String não mude após ser criado. Isso é crucial para a segurança porque:
- **Parâmetros de Rede/BD:** Se você passar uma URL de conexão ou uma senha para um método, tem a garantia de que esse valor não será alterado por outra parte do código maliciosa ou por erro.
- **Thread Safety:** Como o valor não muda, várias partes do programa (threads) podem ler a mesma String simultaneamente sem o risco de uma alterar o valor enquanto a outra está lendo.
- **Segurança de Referência:** Se Strings fossem mutáveis, um atacante poderia mudar o destino de um arquivo ou um comando SQL depois que o sistema já o validou, mas antes de ele ser executado.
