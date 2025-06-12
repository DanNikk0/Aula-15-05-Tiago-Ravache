public class ArvoreAVL {
    private NoAVL raiz;

    public ArvoreAVL() {
        this.raiz = null;
    }

    private int altura(NoAVL no) {
        if (no == null) return 0;
        return no.getAltura();
    }

    private int fatorBalanceamento(NoAVL no) {
        if (no == null) return 0;
        return altura(no.esquerdo) - altura(no.direito);
    }

    private NoAVL rotacaoDireita(NoAVL y) {
        NoAVL x = y.esquerdo;
        NoAVL T2 = x.direito;


        x.direito = y;
        y.esquerdo = T2;


        y.setAltura(Math.max(altura(y.esquerdo), altura(y.direito)) + 1);
        x.setAltura(Math.max(altura(x.esquerdo), altura(x.direito)) + 1);

        return x;
    }

    private NoAVL rotacaoEsquerda(NoAVL x) {
        NoAVL y = x.direito;
        NoAVL T2 = y.esquerdo;


        y.esquerdo = x;
        x.direito = T2;


        x.setAltura(Math.max(altura(x.esquerdo), altura(x.direito)) + 1);
        y.setAltura(Math.max(altura(y.esquerdo), altura(y.direito)) + 1);

        return y;
    }

    private NoAVL inserir(NoAVL no, int chave) {
        if (no == null)
            return new NoAVL(chave);

        if (chave < no.getChave())
            no.esquerdo = inserir(no.esquerdo, chave);
        else if (chave > no.getChave())
            no.direito = inserir(no.direito, chave);
        else
            return no;


        no.setAltura(1 + Math.max(altura(no.esquerdo), altura(no.direito)));


        int balanceamento = fatorBalanceamento(no);


        if (balanceamento > 1 && chave < no.esquerdo.getChave())
            return rotacaoDireita(no);


        if (balanceamento < -1 && chave > no.direito.getChave())
            return rotacaoEsquerda(no);


        if (balanceamento > 1 && chave > no.esquerdo.getChave()) {
            no.esquerdo = rotacaoEsquerda(no.esquerdo);
            return rotacaoDireita(no);
        }


        if (balanceamento < -1 && chave < no.direito.getChave()) {
            no.direito = rotacaoDireita(no.direito);
            return rotacaoEsquerda(no);
        }

        return no;
    }

    public void inserir(int chave) {
        raiz = inserir(raiz, chave);
    }

    private void emOrdem(NoAVL no) {
        if (no != null) {
            emOrdem(no.esquerdo);
            System.out.print(no.getChave() + " ");
            emOrdem(no.direito);
        }
    }

    public void imprimir() {
        emOrdem(raiz);
        System.out.println();
    }


    public static void main(String[] args) {
        ArvoreAVL arvore = new ArvoreAVL();

        int[] valores = {10, 20, 30, 40, 50, 25};

        for (int val : valores) {
            arvore.inserir(val);
        }

        System.out.println("Árvore AVL em ordem:");
        arvore.imprimir();
    }
}
