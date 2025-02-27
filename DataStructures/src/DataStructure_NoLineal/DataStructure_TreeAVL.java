package DataStructure_NoLineal;

class AVLNode {
    int key, height;
    AVLNode left, right;

    public AVLNode(int d) {
        key = d;
        height = 1;
    }
}

class AVLTree {
    AVLNode root;

    // Obtener la altura del nodo
    int height(AVLNode N) {
        return (N == null) ? 0 : N.height;
    }

    // Obtener el máximo entre dos números
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Rotación hacia la derecha
    AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;

        // Rotación
        x.right = y;
        y.left = T2;

        // Actualizar alturas
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Rotación hacia la izquierda
    AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;

        // Rotación
        y.left = x;
        x.right = T2;

        // Actualizar alturas
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Obtener el factor de balance
    int getBalance(AVLNode N) {
        return (N == null) ? 0 : height(N.left) - height(N.right);
    }

    // Insertar un nodo en el AVL Tree
    AVLNode insert(AVLNode node, int key) {
        // Paso 1: Inserción normal en BST
        if (node == null)
            return new AVLNode(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else // Duplicados no permitidos
            return node;

        // Paso 2: Actualizar la altura del nodo padre
        node.height = 1 + max(height(node.left), height(node.right));

        // Paso 3: Obtener el factor de balance
        int balance = getBalance(node);

        // Paso 4: Balancear el árbol si es necesario

        // Caso Izquierda-Izquierda (Rotación simple a la derecha)
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Caso Derecha-Derecha (Rotación simple a la izquierda)
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Caso Izquierda-Derecha (Rotación doble: izquierda y luego derecha)
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Caso Derecha-Izquierda (Rotación doble: derecha y luego izquierda)
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Método público para insertar un nodo
    void insert(int key) {
        root = insert(root, key);
    }

    // Imprimir el árbol en orden (in-order traversal)
    void inOrder(AVLNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }

    void printInOrder() {
        inOrder(root);
        System.out.println();
    }
}

public class DataStructure_TreeAVL {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        // Insertar nodos
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        // Imprimir en orden
        System.out.println("Árbol AVL en orden:");
        tree.printInOrder();
    }

}
