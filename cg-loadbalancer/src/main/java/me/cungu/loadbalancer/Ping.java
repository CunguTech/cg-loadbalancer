package me.cungu.loadbalancer;

public interface Ping {
	
	boolean isAlive(Server server);
	
	void setLoadBalancer(LoadBalancer lb);

	LoadBalancer getLoadBalancer();
}