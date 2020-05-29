package org.sang.search.controller;


import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.solr.client.solrj.SolrServerException;
import org.sang.beans.util.Dto;
import org.sang.beans.util.DtoUtil;
import org.sang.search.service.SolrService;
import org.sang.search.vo.CourseVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@RestController
@Api("/Solr")
public class SolrController {
    @Resource
    SolrService solrService;

    @GetMapping("/getCourse")
    @ApiOperation(value ="根据条件获取课程信息",notes = "使用json 格式返回发送状态")
    public Dto getAllUser(CourseVo courseVo) throws IOException, SolrServerException {
        List<CourseVo> courses= solrService.getCourses(courseVo);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("msg",courses);
        return DtoUtil.returnDataSuccess(courses);
    }
}
