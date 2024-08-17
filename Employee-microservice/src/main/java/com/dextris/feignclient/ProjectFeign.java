package com.dextris.feignclient;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "http://localhost:8082",value ="project",path = "/api/project")
public class ProjectFeign {

}
