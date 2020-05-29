package org.sang.search.service;

import org.apache.solr.client.solrj.SolrServerException;
import org.sang.beans.entity.Course;
import org.sang.search.vo.CourseVo;

import java.io.IOException;
import java.util.List;

public interface SolrService {
    List<CourseVo> getCourses(CourseVo courseVo) throws IOException, SolrServerException;
}
