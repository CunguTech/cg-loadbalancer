package me.cungu.util;

import java.io.Serializable;

public class Pair<K, V> implements Serializable {

	private K first;
	private V second;

	public Pair() {
	}

	public Pair(K first, V second) {
		this.first = first;
		this.second = second;
	}

	public K first() {
		return first;
	}

	public V second() {
		return second;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		} else if (obj == null || obj.getClass() != getClass()) {
			return false;
		}
		Pair other = (Pair) obj;
		return HashCode.equalObjects(first, other.first) && HashCode.equalObjects(second, other.second);
	}

	@Override
	public int hashCode() {
		HashCode h = new HashCode();
		h.addValue(first);
		h.addValue(second);
		return h.hashCode();
	}
}