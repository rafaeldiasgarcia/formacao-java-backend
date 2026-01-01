# Active Recall - Primitivos vs Wrappers

## Questão 1: NullPointerException
**Pergunta:** Por que Integer pode causar NullPointerException e int não?

**Resposta:** Porque Integer é um Objeto (Reference Type), enquanto int é um Primitivo. Um Integer é apenas um "apontador" para um lugar na memória; se ele não apontar para lugar nenhum, ele é null. O int armazena o valor diretamente, então ele sempre terá um valor (padrão é 0), nunca nulo.

---

## Questão 2: Cenários de Uso de Wrapper
**Pergunta:** Em que cenário real de backend o uso de wrapper é obrigatório?

**Resposta:** Existem dois cenários principais e muito comuns:

Frameworks de Coleção (Generics): O Java não permite coleções de primitivos. Você não pode escrever List<int>, é obrigatório usar List<Integer>.

Mapeamento Objeto-Relacional (JPA/Hibernate): Se uma coluna no banco de dados aceita valores nulos (ex: nota_final pode ser NULL se o aluno não fez a prova), você deve usar Integer na entidade Java. Se usar int, o Hibernate converterá o NULL do banco para 0, alterando o significado do dado (uma nota 0 é diferente de "não fez a prova").

---

## Questão 3: Comparação com ==
**Pergunta:** Por que comparar Integer com == é um bug sutil?

**Resposta:** porque == compara luar na memoria, não o conteúdo. O bug é "sutil" (traiçoeiro) por causa do Integer Cache.

O Java faz cache de objetos Integer entre -128 e 127.

Se você comparar Integer a = 100 e Integer b = 100 com ==, dará true (mesmo objeto no cache).

Se você comparar Integer a = 200 e Integer b = 200 com ==, dará false (objetos diferentes na memória). Isso faz com que testes unitários com números pequenos passem, mas o código quebre em produção com IDs altos. Sempre use .equals().
