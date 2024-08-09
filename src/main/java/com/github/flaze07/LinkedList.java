package com.github.flaze07;

import java.util.Optional;

public class LinkedList {
	private class Node {
		private Node next;
		private int value;

		public Node() {
			next = null;
		}

		public Node getNext() {
			return next;
		}

		public int getValue() {
			return value;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}

	private Node head;

	public void add(int value) {
		if (head == null) {
			head = new Node();
			head.setValue(value);
		} else {
			var temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			var tempNode = new Node();
			tempNode.setValue(value);
			temp.setNext(tempNode);
		}
	}

	public Optional<Node> find(int value) {
		var temp = head;
		while (temp.getNext() != null) {
			if (temp.getValue() == value) {
				return Optional.of(temp);
			}
			temp = temp.getNext();
		}
		return Optional.empty();
	}
}