package com.example.demo.service.impl;

import com.example.demo.domain.Device;
import com.example.demo.dao.DeviceMapper;
import com.example.demo.service.IDeviceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lqd
 * @since 2020-11-11
 */
@Service
@Slf4j
public class DeviceServiceImpl extends ServiceImpl<DeviceMapper, Device> implements IDeviceService {

    @Autowired
    DeviceMapper deviceMapper;

//    public String importEs() {
//        List<DeviceEs> deviceEs = deviceMapper.queryAll();
//        Iterable<DeviceEs> devices = esProductRepository.saveAll(deviceEs);
//        int i = 0;
//        for (DeviceEs device : devices) {
//            i++;
//        }
//        return i + "";
//    }


//    public SearchHits<DeviceEs> search(String deviceName) {
//        Pageable pageable = PageRequest.of(1, 10);
//        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
//        //分页
//        nativeSearchQueryBuilder.withPageable(pageable);
//        //过滤
//
////            BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
////            boolQueryBuilder.must(QueryBuilders.termQuery("deviceName", deviceName));
////            nativeSearchQueryBuilder.withFilter(boolQueryBuilder);
//
//        //搜索
//        QueryBuilder queryBuilder = QueryBuilders.matchQuery("deviceName", deviceName);
////        if (StringUtils.isEmpty(deviceName)) {
////            nativeSearchQueryBuilder.withQuery(QueryBuilders.matchAllQuery());
////        } else {
////            List<FunctionScoreQueryBuilder.FilterFunctionBuilder> filterFunctionBuilders = new ArrayList<>();
////            filterFunctionBuilders.add(new FunctionScoreQueryBuilder.FilterFunctionBuilder(QueryBuilders.matchQuery("deviceName", deviceName),
////                    ScoreFunctionBuilders.weightFactorFunction(10)));
////            FunctionScoreQueryBuilder.FilterFunctionBuilder[] builders = new FunctionScoreQueryBuilder.FilterFunctionBuilder[filterFunctionBuilders.size()];
////            filterFunctionBuilders.toArray(builders);
////            FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery(builders)
////                    .scoreMode(FunctionScoreQuery.ScoreMode.SUM)
////                    .setMinScore(2);
////            nativeSearchQueryBuilder.withQuery(queryBuilder);
////        }
//        nativeSearchQueryBuilder.withQuery(queryBuilder);
//        //排序
//
//            //按新品从新到旧
//        nativeSearchQueryBuilder.withSort(SortBuilders.fieldSort("id").order(SortOrder.DESC));
//        nativeSearchQueryBuilder.withSort(SortBuilders.scoreSort().order(SortOrder.DESC));
//        NativeSearchQuery searchQuery = nativeSearchQueryBuilder.build();
//        log.info("DSL:{}", searchQuery.getQuery().toString());
//        SearchHits<DeviceEs> searchHits = elasticsearchRestTemplate.search(searchQuery, DeviceEs.class);
//        return searchHits;
//     }
}
