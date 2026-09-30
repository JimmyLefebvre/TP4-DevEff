package td;

import java.util.ArrayList;

public class Arbre<T> {
    
    @SuppressWarnings("unused")
	private Node<T> racine;


    private static class Node<T> {
        private ArrayList<Node<T>> children;
        private T element;

        private Node(T element) {

            this.setChildren(new ArrayList<>());
            this.setElement(element);
        }


        @SuppressWarnings("unused")
		public ArrayList<Node<T>> getChildren() {
            return children;
        }

        public void setChildren(ArrayList<Node<T>> children) {
            this.children = children;
        }

        @SuppressWarnings("unused")
		public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }
        
    }
}
