##JDBC Template
1.   spring-boot-starter-jdbc
    +spring-boot-starter-web
    +druid-spring-boot-starter
   
2. DataSourceConfig,读取配置文件内多个数据源(目前发现配置参数顺序会导致不一样的效果,参见配置文件说明)
    (deleted)无论多少个都必须要有spring.datasource.url/spring.datasource.druid.url 的配置信息

3. 配置JdbcTemplate

4. 配置API用于测试