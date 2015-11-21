package me.cungu.loadbalancer;

public abstract class AbstractLoadBalancerPing implements Ping, ClientConfigAware {
	
	private LoadBalancer loadBalancer;

	@Override
	public void setLoadBalancer(LoadBalancer loadBalancer) {
		this.loadBalancer = loadBalancer;
	}

	@Override
	public LoadBalancer getLoadBalancer() {
		return loadBalancer;
	}
}