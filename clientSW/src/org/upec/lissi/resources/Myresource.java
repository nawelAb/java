package org.upec.lissi.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import com.intempora.rtmaps.api.rtmaps;

@Path("/testing")
public class Myresource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getRandom() {

		String s = "Hello Jersey";
		return s;
	}
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public void setRandom() {
	}
}