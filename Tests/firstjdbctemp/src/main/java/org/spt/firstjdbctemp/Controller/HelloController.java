package org.spt.firstjdbctemp.Controller;

import com.alibaba.druid.stat.DruidStatManagerFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    @Qualifier("jdbcTemplateOne")
    JdbcTemplate jdbcTemplateOne;

    @Autowired
    @Qualifier("jdbcTemplateTwo")
    JdbcTemplate jdbcTemplateTwo;

    @Autowired
    @Qualifier("jdbcTemplate3th")
    JdbcTemplate jdbcTemplate3th;

    @GetMapping("/getHrCount")
    public Integer getHrCount(){
        String sql = "select count(*) from hr";
        int count = jdbcTemplateOne.queryForObject(sql, Integer.class);
        return count;
    }

    @GetMapping("/getjoblevelCount")
    public Integer getjoblevelCount(){
        String sql = "select count(*) from joblevel";
        int count = jdbcTemplate3th.queryForObject(sql, Integer.class);
        return count;
    }

    @GetMapping("/getuserconut")
    public Integer getuserconut(){
        String sql = "select count(*) from t1";
        int count = jdbcTemplateTwo.queryForObject(sql, Integer.class);
        return count;
    }

    @GetMapping("/druid/stat")
    public Object druidStat(){
        // DruidStatManagerFacade#getDataSourceStatDataList 该方法可以获取所有数据源的监控数据，除此之外 DruidStatManagerFacade 还提供了一些其他方法，你可以按需选择使用。
        return DruidStatManagerFacade.getInstance().getDataSourceStatDataList();
    }

}
