package com.pinyougou.task;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 秒杀组件
 * 
 * @author cqb
 *
 */
@Component
public class SeckillTask {
	
	public void dele(){
		int i = 9 ;
		i = i + 10;
		System.out.println("i= "+ i);
		System.out.println("删除成功！");
		
	}

	/**
	 * 刷新秒杀商品
	 */
	@Scheduled(cron="12/4 * * * * ?")
	public void refreshSeckillGoods(){
		System.out.println("执行了任务调度"+new Date());		
	}	

		
	public void add(){
		
		System.out.println("哈哈，增加成功");
	}

}
