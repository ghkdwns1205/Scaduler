package jh.scaduler.main;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MainDao {

	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;

	public String getTestID(String testSeq) {
		
		return sqlSession.selectOne("getTestID", testSeq);
	}
	
	
}
