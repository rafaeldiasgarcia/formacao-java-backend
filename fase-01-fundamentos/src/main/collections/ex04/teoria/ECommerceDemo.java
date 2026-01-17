package collections.ex04.teoria;

import java.util.*;

public class ECommerceDemo {
    public static void main(String[] args) {
        
        // 1. LIST: Histórico de Compras (Ordem importa, duplicatas permitidas)
        // Usamos List porque o cliente pode comprar o mesmo item em momentos diferentes
        List<String> historicoCompras = new ArrayList<>();
        historicoCompras.add("Notebook Dell");
        historicoCompras.add("Mouse Logitech");
        historicoCompras.add("Notebook Dell"); // Comprou outro para a empresa
        
        System.out.println("--- Histórico de Compras (List) ---");
        for (String item : historicoCompras) {
            System.out.println("Item comprado: " + item);
        }

        // 2. SET: Catálogo de Categorias Únicas
        // Usamos Set para garantir que não listamos "Eletrônicos" duas vezes na tela.
        Set<String> categoriasDisponiveis = new HashSet<>();
        categoriasDisponiveis.add("Eletrônicos");
        categoriasDisponiveis.add("Livros");
        categoriasDisponiveis.add("Eletrônicos"); // O Java ignora silenciosamente esta linha
        
        System.out.println("\n---- Categorias (Set) ----");
        for (String categoria : categoriasDisponiveis) {
            System.out.println("Categoria: " + categoria);
        }

        // 3. MAP: Estoque de Produtos
        // Chave: ID do produto (String), Valor: Quantidade (Integer)
        // Usamos Map para busca rápida. "Qual o estoque do produto X?" é respondido instantaneamente.
        Map<String, Integer> estoque = new HashMap<>();
        estoque.put("PROD-001", 50); // Notebooks
        estoque.put("PROD-002", 15); // Mouses
        
        // Atualizando o estoque (sobrescreve o valor da chave existente)
        estoque.put("PROD-001", 49); 

        System.out.println("\n--- Estoque (Map) ---");
        String idBuscado = "PROD-001";
        if (estoque.containsKey(idBuscado)) {
            System.out.println("Produto: " + idBuscado + " | Quantidade: " + estoque.get(idBuscado));
        }
    }
}