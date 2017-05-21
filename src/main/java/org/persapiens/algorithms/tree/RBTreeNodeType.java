package org.persapiens.algorithms.tree;

/**
 *
 * @author marcelo fernandes
 */
public enum RBTreeNodeType {

	RED,
	
	BLACK;

	boolean isRed() {
		return this.equals(RED);
	}

	boolean isBlack() {
		return this.equals(BLACK);
	}
}
