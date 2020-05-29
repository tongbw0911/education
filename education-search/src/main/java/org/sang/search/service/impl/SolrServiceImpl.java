package org.sang.search.service.impl;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.sang.search.service.SolrService;
import org.sang.search.vo.CourseVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@Service("solrService")
public class SolrServiceImpl implements SolrService {
    @Resource
    private SolrClient client;


    @Override
    public List<CourseVo> getCourses(CourseVo course) throws IOException, SolrServerException {
        SolrQuery params = new SolrQuery();
        if (course.getIsFree()!=null){
            if (course.getIsFree()==1){
                System.out.println("gc1");
                params.setQuery("is_free:"+ 1);
            }else {
                System.out.println("gc2");
                params.setQuery("is_free:"+ 0);
            }

            if (course.getCategoryId1()!=null){
                System.out.println("gc");
                params.addFilterQuery("category_id1:"+course.getCategoryId1());
                if (course.getCategoryId2()!=null){
                    params.setQuery(" AND category_id2:"+course.getCategoryId2());
                    if (course.getCategoryId3()!=null){
                        params.setQuery(" AND category_id3:"+course.getCategoryId3());
                    }
                }
            }
        }else {
            System.out.println("gc3");
            params.setQuery("*:*");
        }
        params.add("start","0");
        params.add("rows","10");
        QueryResponse response = client.query("course",params);
        SolrDocumentList results = response.getResults();
        System.out.println(results.size());
//        List<Course> beans = new ArrayList<>();
//        Course course1;
//        for (SolrDocument doc:
//             results) {
//            course1 = new Course();
//            course1.setId(doc.getFieldValue("id").toString());
//            course1.setGmtCreate(doc.getFieldValue("gmtCreate"));
//        }
        List<CourseVo> beans = response.getBeans(CourseVo.class);
        System.out.println(beans.size());
        System.out.println(beans);
        return beans;
    }
}
