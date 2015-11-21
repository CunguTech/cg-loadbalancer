package me.cungu.loadbalancer;

public interface Rule {
	
	Server choose(Object key);

	void setLoadBalancer(LoadBalancer lb);

	LoadBalancer getLoadBalancer();
}
