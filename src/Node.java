
    enum Color {

        RED, BLACK

    }

    class Node {
        int key;
        Color color;
        Node left, right, parent;

        Node (int key) {
            this.key = key;
            this.color = Color.RED;
            this.left = null;
            this.right = null;
            this.parent = null;
        }

    }



