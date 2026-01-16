O padrão é set + NomeDoAtributo. Ele geralmente recebe um valor e não retorna nada (void).

Java

public void setForca(int novaForca) {
// Aqui podemos criar regras de proteção!
if (novaForca >= 0) {
this.forca = novaForca; // Se for positivo, aceita a mudança.
} else {
System.out.println("Erro: A força não pode ser negativa!");
// E não fazemos a alteração. O valor antigo é preservado.
}
}
4. 🚫 ERRO COMUM
   O Erro: Criar um Setter "bobo" que aceita tudo, sem validação nenhuma, quando a regra de negócio exigiria proteção.

Java

// Setter "Inseguro" - Aceita qualquer coisa, até força negativa
public void setForca(int forca) {
this.forca = forca;
}
Se for para aceitar tudo sem verificar, às vezes nem precisamos de encapsulamento ali. O poder do Setter é justamente a validação.