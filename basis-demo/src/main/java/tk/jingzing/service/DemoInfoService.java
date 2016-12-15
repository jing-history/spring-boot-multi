package tk.jingzing.service;


import tk.jingzing.bean.DemoInfo;

public interface DemoInfoService {

	void delete(Long id);

	DemoInfo update(DemoInfo updated) throws Exception;

	DemoInfo findById(Long id);

	DemoInfo save(DemoInfo demoInfo);

}
