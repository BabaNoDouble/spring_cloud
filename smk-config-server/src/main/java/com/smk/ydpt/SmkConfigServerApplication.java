package com.smk.ydpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer  // 激活该应用为配置文件服务器：读取远程配置文件，转换为rest接口服务
@SpringBootApplication
public class SmkConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmkConfigServerApplication.class, args);
	}
}
