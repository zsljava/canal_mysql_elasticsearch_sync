package com.star.sync.elasticsearch.service;

import com.star.sync.elasticsearch.model.IndexTypeModel;
import com.star.sync.elasticsearch.model.request.SyncByTableRequest;

/**
 * @author <a href="mailto:wangchao.star@gmail.com">wangchao</a>
 * @version 1.0
 * @since 2017-08-31 17:48:00
 */
public interface SyncService {
    /**
     * 通过database和table同步数据库
     *
     * @param request 请求参数
     * @return 后台同步进程执行成功与否
     */
    boolean syncByTable(SyncByTableRequest request);

    /**
     * 开启事务的读取mysql并插入到Elasticsearch中（读锁）
     */
    void batchInsertElasticsearch(SyncByTableRequest request, String primaryKey, long from, long to, IndexTypeModel indexTypeModel);
}
