package com.snapstore.core.resource;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

@Path("/item")
@Component
public class ItemResource {
	
	@GET
	public Response getItem() throws IOException {
		return Response.ok("item").build();
	}

}
