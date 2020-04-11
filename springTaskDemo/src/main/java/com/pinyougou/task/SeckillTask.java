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
