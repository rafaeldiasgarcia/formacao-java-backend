package collections.ex01;

import java.util.Objects;

public class Pessoa {
    private Long id;
    private String nome;

    public Pessoa(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return id.equals(pessoa.id) && nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}