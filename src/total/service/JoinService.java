package total.service;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinService {
	@Autowired
	SqlSessionTemplate template;
	
	
	public boolean regeisterNewOne(Map map) {
		return template.insert("member.regeisterNewOne", map)==1;
	}
}
