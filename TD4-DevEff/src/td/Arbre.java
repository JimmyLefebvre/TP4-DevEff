package td;

import java.util.ArrayList;

public class Arbre<T> {
    
    @SuppressWarnings("unused")
	private Node<T> racine;
    
    public Arbre() {
    	racine = null;
    }
    
    public Arbre(T data) {
    	racine = new Node<T>(data);
    }
    
    public void ajouteEtEcraseNG(T data) {
    	Node<T> n = new Node<T>(data);
    	this.racine.ng = n;
    }
    
    public void ajouteEtEcraseND(T data) {
    	Node<T> n = new Node<T>(data);
    	this.racine.nd = n;
    }
    
    public Node(T data) {
    	this.data = data;
    	ng = null;
    	nd = null;
    }
    
    
    public String toString() {
    	return racine.toString();
    }

    public String toStringPrefixe() {
    	StringBuilder sb = new StringBuilder();
    	
    	sb.append(racine.toString());
    	return sb.toString();
    			
    }

	private static class Node<T> {
        Node<T> ng, nd;
        T data;
        
        public String prefixe(Node<T> n) {
        	if(n==null) {return null;}
        	String sg = prefixe(n.ng);
        	String sd = prefixe(n.nd);
        	
        }

        public T getData() {
        	return data;
        }

        public void setData(T data) {
        	this.data = data;
        }

		public Node<T> getNg() {
			return ng;
		}

		public void setNg(Node<T> ng) {
			this.ng = ng;
		}

		public Node<T> getNd() {
			return nd;
		}

		public Node(Node<T> ng, Node<T> nd, T data) {
			super();
			this.ng = ng;
			this.nd = nd;
			this.data = data;
		}

		public void setNd(Node<T> nd) {
			this.nd = nd;
		}
        
        
        	
        }