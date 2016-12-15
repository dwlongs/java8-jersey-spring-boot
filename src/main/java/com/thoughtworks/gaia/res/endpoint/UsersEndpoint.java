package com.thoughtworks.gaia.res.endpoint;

import com.thoughtworks.gaia.common.exception.*;
import com.thoughtworks.gaia.common.exception.NotFoundException;
import com.thoughtworks.gaia.product.entity.Product;
import com.thoughtworks.gaia.res.entity.User;
import com.thoughtworks.gaia.res.service.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Component
@Path("users")
@Api(value = "users", description = "Access to users resource")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UsersEndpoint {
    @Autowired
    private UsersService usersService;

    @Path("/{user_id}")
    @ApiOperation(value = "Get user by id", response = Product.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Get user successfully"),
            @ApiResponse(code = 404, message = "No user matches given id")
    })
    @GET
    public Response getUser(@PathParam("user_id") Long userId) {
        User user = usersService.getUser(userId);
        if (user == null) {
            throw new NotFoundException();
        }
        return Response.ok().entity(user).build();
    }
}
