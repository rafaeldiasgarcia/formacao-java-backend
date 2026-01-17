# Desafio - Manipulação de Strings

Agora é hora de sujar as mãos. Resolva os desafios abaixo. Tente não usar IA para gerar o código, use apenas a documentação do Java se precisar.

---

### Desafio 1: O Formatador de Nomes
- **Cenário:** Um usuário cadastrou o nome completo tudo em minúsculo e com espaços extras nas pontas: `" joao silva "`.
- **Objetivo:** Crie um método que receba essa String suja e retorne o nome limpo e em caixa alta: `"JOAO SILVA"`.

### Desafio 2: O Detector de Spam
- **Cenário:** Você está criando um filtro de chat. Palavras ofensivas ou proibidas não podem passar.
- **Objetivo:** Crie um método que receba uma frase e uma lista de palavras proibidas (ex: `"venda"`, `"oferta"`). Se a frase contiver alguma dessas palavras (independente de maiúsculas/minúsculas), retorne `true` (é spam), caso contrário `false`.

### Desafio 3: O Extrator de Iniciais
- **Cenário:** Para criar um avatar padrão, precisamos das iniciais do nome da pessoa.
- **Objetivo:** Dado um nome completo (ex: `"Maria da Silva Souza"`), extraia a primeira letra de cada nome e retorne em maiúsculo (ex: `"MDSS"`). 
- **Dica:** `split()` pode ser útil.

### Desafio 4: O Gerador de CSV (Performance)
- **Cenário:** Você precisa exportar uma lista de 100 nomes para um arquivo CSV (valores separados por vírgula).
- **Objetivo:** Receba um Array ou Lista de Strings (ex: `["Ana", "Beto", "Carla"]`). Use `StringBuilder` para montar uma única String final onde os nomes sejam separados por vírgula, sem vírgula no final (ex: `"Ana,Beto,Carla"`).

### Desafio 5: O Validador de Palíndromo
- **Cenário:** Entrevistas técnicas adoram isso. Um palíndromo é uma palavra/frase que se lê igual de trás para frente (desconsiderando espaços).
- **Objetivo:** Crie um método que receba uma String (ex: `"Ame o poema"`) e verifique se é um palíndromo. O código deve ignorar espaços e diferenças entre maiúsculas/minúsculas.
- **Exemplo:** `"Ame o poema"` -> `"ameopoema"` (invertido é igual) -> `true`.
