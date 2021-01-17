##1.mybatis-generator-maven插件的配置
https://blog.csdn.net/x18707731829/article/details/82811520
1.pom.xml
<dependency>
	<groupId>org.mybatis.generator</groupId>
	<artifactId>mybatis-generator-core</artifactId>
	<version>1.3.7</version>
</dependency>
<plugin>
	<groupId>org.mybatis.generator</groupId>
	<artifactId>mybatis-generator-maven-plugin</artifactId>
	<version>1.3.7</version>
	<configuration>
		<configurationFile>src/main/resources/generatorConfig.xml</configurationFile>
		<verbose>true</verbose>
		<overwrite>true</overwrite>
	</configuration>
</plugin>

2.generatorConfig.xml
	需要注意天下jar路径, 数据库连接信息, table模块改为%以便匹配所有数据库表<table tableName="%" …/>

3.其余参考链接里面的教程

##2.解决IDEA中springboot整合mybatis中出现的Invalid bound statement(not found)的问题
https://blog.csdn.net/benben513624/article/details/81076182

##3.解决直接使用生成的xml进行insert数据库操作时自增id无法自动填充后返回的问题
https://blog.csdn.net/weixin_30699235/article/details/98956088