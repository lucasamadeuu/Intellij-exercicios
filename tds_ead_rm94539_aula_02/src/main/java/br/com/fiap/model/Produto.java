package br.com.fiap.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Produto {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SQ_PRODUTO"
    )
    @SequenceGenerator(
            name = "SQ_PRODUTO",
            sequenceName = "SQ_PRODUTO",
            allocationSize = 1,
            initialValue = 1
    )
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;

    public Produto() {
    }

    public Produto(Long id, String nome, String descricao, BigDecimal preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public Produto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Produto setPreco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
