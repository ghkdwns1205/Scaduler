package jh.scaduler.config.dataBase;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

@Configuration
public class DbConfig {

	@Bean(name="sqlSessionFactoryMain")
    public SqlSessionFactory sqlSessionFactoryMain(DataSource dataSource) throws Exception {

        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setVfs(SpringBootVFS.class);
        Resource[] resource = resolver.getResources("/sql/**/*_SQL.xml"); //
        factoryBean.setMapperLocations(resource);
 
        return factoryBean.getObject();
    }
	
}
