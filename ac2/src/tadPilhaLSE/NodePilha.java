package tadPilhaLSE;

public class NodePilha<E> implements Pilha<E>{
	protected Node<E> top; // referência para o nodo cabeça
	protected int size; // quantidade de elementos na pilha
	public NodePilha() { // constrói uma pilha vazia
		top = null;
		size = 0;
	}
	public int size() {return size; }
	public boolean isEmpty() {
		if (top == null) return true;
		return false;
	}
	public void push(E elem) {
		Node<E> v = new Node<E>(elem, top); // cria e encadeia um nodo novo
		top = v;
		size++;
	}
	public E top() throws EmptyPilhaException {
		if (isEmpty()) throw new EmptyPilhaException("Stack is empty.");
		return top.getElement();
	}
	public E pop() throws EmptyPilhaException {
		Node<E> aux = top;

		if (isEmpty()) throw new EmptyPilhaException("Stack is empty.");
		E temp = top.getElement();
		top = top.getNext(); // desencadeia o nodo topo
		aux.setNext(null);
		size--;
		return temp;
	}
	public String toString() {
		String s;
		Node<E> p = top;

		s = "[";
		while (p != null) {
			s += p.getElement();
			s += ", ";
			p = p.getNext();
		}
		if (s.length() > 1) 
			s = s.substring(0, s.length() - 2);
		return s + "]";
	}
}
