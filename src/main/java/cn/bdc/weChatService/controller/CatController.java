package cn.bdc.weChatService.controller;


import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.bdc.weChatService.bean.CatBean;
import cn.bdc.weChatService.service.CatService;

@RestController
@RequestMapping("/cat")
public class CatController {

	@Resource
	private CatService catService;
	
	@RequestMapping("/save")
	public String save() {
		CatBean cat = new CatBean();
		cat.setCatName("Tom");
		cat.setCatAge(3);
		catService.save(cat);
		
		return "save ok.";
	}
	
	@RequestMapping("/delete")
	public String delete(int id) {
		catService.delete(id);
		return "delete ok.";
	}

	@RequestMapping("/getAll")
	public Iterable<CatBean> getAll(){
		return catService.getAll();
	}
	
	

}
