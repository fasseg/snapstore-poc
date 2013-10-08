package com.snapstore.core;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.simple.SimpleContainerFactory;


public class SnapStoreNode {
	private Closeable httpServer;
	
	public void startHttpServer(){
		ResourceConfig config = new ResourceConfig()
			.property("contextConfigLocation", "classpath:context.xml");
		this.httpServer = SimpleContainerFactory.create(URI.create("http://localhost:4332"), config);
	}
	
	public void stopHttpServer() throws IOException {
		this.httpServer.close();
	}
	
	public static void main(String[] args) {
		SnapStoreNode node = new SnapStoreNode();
		node.startHttpServer();
	}
}
