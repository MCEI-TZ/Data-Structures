package DataStructure_NoLineal;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

// Clase Nodo del Árbol Binario
class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

// Clase Árbol Binario de Búsqueda (BST)
class BinarySearchTree {
    Node root;

    // Método para insertar un nodo en el árbol
    void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    // Método de búsqueda en el BST
    boolean search(int value) {
        return searchRec(root, value);
    }

    private boolean searchRec(Node root, int value) {
        if (root == null) return false;
        if (root.value == value) return true;

        return value < root.value
                ? searchRec(root.left, value)
                : searchRec(root.right, value);
    }

    // Recorridos: Inorder (Izquierda, Raíz, Derecha)
    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    // Recorrido Preorder (Raíz, Izquierda, Derecha)
    void preorder() {
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Recorrido Postorder (Izquierda, Derecha, Raíz)
    void postorder() {
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.value + " ");
        }
    }
}

public class DataStructure_Trees {
    public static void main(String[] args) {
        //***** DataStructure Trees ************************************
        BinarySearchTree bst = new BinarySearchTree();

        // Insertamos valores en el árbol
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(2);
        bst.insert(7);
        bst.insert(12);
        bst.insert(20);

        // Imprimimos recorridos
        System.out.print("Inorder  : "); bst.inorder();  // Debe imprimir 2 5 7 10 12 15 20
        System.out.print("Preorder : "); bst.preorder(); // Debe imprimir 10 5 2 7 15 12 20
        System.out.print("Postorder: "); bst.postorder();// Debe imprimir 2 7 5 12 20 15 10

        // Buscamos valores
        System.out.println("¿Existe el 7? " + bst.search(7));   // true
        System.out.println("¿Existe el 8? " + bst.search(8));   // false
    }
}
