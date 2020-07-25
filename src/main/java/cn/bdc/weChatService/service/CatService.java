package cn.bdc.weChatService.service;


import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import cn.bdc.weChatService.bean.CatBean;
import cn.bdc.weChatService.repository.CatRepository;


@Service
public class CatService {
	
	@Resource
	private CatRepository catRepository;
	
	@Transactional
	public void save(CatBean cat) {
		catRepository.save(cat);
	}

	@Transactional
	public void delete(int id) {
		catRepository.deleteById(id);
	}
	
	public Iterable<CatBean> getAll() {
		return catRepository.findAll();
	}

}