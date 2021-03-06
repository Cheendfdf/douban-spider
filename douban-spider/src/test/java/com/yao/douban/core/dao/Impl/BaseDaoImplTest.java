package com.yao.douban.core.dao.Impl;

import com.yao.spider.douban.dao.IMoveDao;
import com.yao.spider.douban.dao.Impl.MoveDaoImpl;
import com.yao.spider.douban.entity.move.Move;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by shanyao on 2018/3/10.
 */
public class BaseDaoImplTest {
    private static Logger logger = LoggerFactory.getLogger(BaseDaoImplTest.class);
    @Test
    public void insert() throws Exception {
        logger.info("test");
        Move move = new Move();
        move.setId("111");
        IMoveDao dao = new MoveDaoImpl();
        dao.insert(move);
    }

    @Test
    public void insertSelective() throws Exception {
        Move move = new Move();
        move.setId("001");
        IMoveDao dao = new MoveDaoImpl();
        dao.inserSelective(move);
    }

}