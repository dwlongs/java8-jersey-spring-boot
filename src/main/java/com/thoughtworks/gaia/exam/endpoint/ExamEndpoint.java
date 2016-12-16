package com.thoughtworks.gaia.exam.endpoint;

import com.thoughtworks.gaia.exam.entity.Exam;
import com.thoughtworks.gaia.exam.model.ExamModel;
import com.thoughtworks.gaia.exam.service.ExamService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by hliang on 15/12/2016.
 */
@Component
@Path("exams")
@Api(value = "exams", description = "Access to product resource")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ExamEndpoint {
    @Autowired
    private ExamService examService;
    private ExamModel examModel;

    @Path("/")
    @ApiOperation(value = "Add a exam")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Exam created successfully!"),
            @ApiResponse(code = 404, message = "Failed to create exam.")
    })
    @RequestMapping(method = RequestMethod.POST)
    public Response addExam(@RequestBody Exam exam) {
        examModel = examService.addExam(exam);
        return Response.status(Response.Status.CREATED ).entity(examModel).build();
    }


}
