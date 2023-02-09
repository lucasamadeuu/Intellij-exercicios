package br.com.fiap;

import br.com.fiap.model.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Nome do produto");
        String descricao = JOptionPane.showInputDialog("Descrição do produto");
        BigDecimal preco = new BigDecimal(JOptionPane.showInputDialog("Preço do produto"));

        Produto prod = new Produto();

        prod.setNome(nome).setDescricao(descricao).setPreco(preco);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory( "oracle-fiap");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(prod);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
