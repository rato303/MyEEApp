package my.app.resource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import my.app.service.EmployeeService;

@Path("employees")
@RequestScoped
public class EmployeeResource {

	@Inject
	private EmployeeService employeeService;

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response selectById(@PathParam("id") int id) {
		return Response.ok(this.employeeService.selectById(id)).build();
	}

}
