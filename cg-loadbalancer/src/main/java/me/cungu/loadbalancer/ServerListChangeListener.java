package me.cungu.loadbalancer;

import java.util.List;

public interface ServerListChangeListener {
	void serverListChanged(List<Server> oldList, List<Server> newList);
}