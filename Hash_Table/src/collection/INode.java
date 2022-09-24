package collection;

import collection.MapNode.INode;

public interface INode<T> {

	K getKey();
	void setKey(K key);
	INode<K> getNext();
	void setnext(INode<K> next);
	void setnext(INode<K> next);
	void setKey(K key);
	void setKey(K key);
}
