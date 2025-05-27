import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Arvore {
    private No raiz;
    private No node;

    public Arvore(String conteudo) {
        this.raiz = new No(conteudo);
    }

    public void InserirFilho(String conteudo) {
        if (raiz.getEsquerda() == null) {
            No novo = new No(conteudo);
            raiz.setEsquerda(novo);
        } else if (raiz.getDireita() == null) {
            No novo = new No(conteudo);
            raiz.setDireita(novo);
        }
    }

    public int contarNos(No node) {
        if (node == null) return 0;
        return 1 + contarNos(node.getEsquerda()) + contarNos(node.getDireita());
    }

    public void contarNosSemRecursao() {
        if (raiz == null) return;

        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);
        int contador = 0;

        while (!fila.isEmpty()) {
            No atual = fila.poll();
            contador++;

            if (atual.getEsquerda() != null) {
                fila.add(atual.getEsquerda());
            }
            if (atual.getDireita() != null) {
                fila.add(atual.getDireita());
            }
        }

        System.out.println("Total de nós (sem recursão): " + contador);
    }

    public void buscarPreOrdem(No node) {
        if (node != null) {
            System.out.print(node.getConteudo() + " ");
            buscarPreOrdem(node.getEsquerda());
            buscarPreOrdem(node.getDireita());
        }
    }

    public void buscarPreOrdemSemRecursao() {
        if (raiz == null) return;

        Stack<No> pilha = new Stack<>();
        pilha.push(raiz);

        while (!pilha.isEmpty()) {
            No atual = pilha.pop();
            System.out.print(atual.getConteudo() + " ");

            if (atual.getDireita() != null) {
                pilha.push(atual.getDireita());
            }
            if (atual.getEsquerda() != null) {
                pilha.push(atual.getEsquerda());
            }
        }
    }

    public void buscaEmOrdem(No node) {
        if (node != null) {
            buscaEmOrdem(node.getEsquerda());
            System.out.print(node.getConteudo() + " ");
            buscaEmOrdem(node.getDireita());
        }
    }

    public void buscaEmOrdemSemRecursao() {
        Stack<No> pilha = new Stack<>();
        No atual = raiz;

        while (atual != null || !pilha.isEmpty()) {
            while (atual != null) {
                pilha.push(atual);
                atual = atual.getEsquerda();
            }

            atual = pilha.pop();
            System.out.print(atual.getConteudo() + " ");

            atual = atual.getDireita();
        }
    }

    public void buscaPosOrdem(No node) {
        if (node != null) {
            buscaPosOrdem(node.getEsquerda());
            buscaPosOrdem(node.getDireita());
            System.out.print(node.getConteudo() + " ");
        }
    }

    public void buscaPosOrdemSemRecursao() {
        if (raiz == null) return;

        Stack<No> pilha1 = new Stack<>();
        Stack<No> pilha2 = new Stack<>();

        pilha1.push(raiz);

        while (!pilha1.isEmpty()) {
            No atual = pilha1.pop();
            pilha2.push(atual);

            if (atual.getEsquerda() != null) {
                pilha1.push(atual.getEsquerda());
            }
            if (atual.getDireita() != null) {
                pilha1.push(atual.getDireita());
            }
        }

        while (!pilha2.isEmpty()) {
            System.out.print(pilha2.pop().getConteudo() + " ");
        }
    }

    public No getRaiz() {
        return raiz;
    }
}
