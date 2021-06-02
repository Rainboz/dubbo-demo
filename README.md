# dubbo-demo

#### 介绍
dubbo学习，注解配置

#### 软件架构
软件架构说明

springboot2.1.6.RELEASE+dubbo2.7.3+zookeeper3.4.14

#### 安装教程

1.  java环境
2.  zookeeper环境
3.  可视化dubbo-admin管理控制台

#### 使用说明

### Duboo-demo

#### 1. 依赖

1. dubbo-provider(pom.xml)

   ```xml
   <dependencies>
       	<!-- 接口依赖 -->
           <dependency>
               <groupId>com.zhb</groupId>
               <artifactId>dubbo-interface</artifactId>
               <version>0.0.1-SNAPSHOT</version>
           </dependency>
           <dependency>
               <groupId>org.springframework.boot</groupId>
               <artifactId>spring-boot-starter-web</artifactId>
           </dependency>
           <!-- 升级 apache dubbo -->
           <dependency>
               <groupId>org.apache.dubbo</groupId>
               <artifactId>dubbo</artifactId>
               <version>2.7.3</version>
           </dependency>
           <!-- 集成dubbo所需依赖 start -->
   
           <dependency>
               <groupId>org.apache.dubbo</groupId>
               <artifactId>dubbo-spring-boot-starter</artifactId>
               <version>2.7.3</version>
           </dependency>
           <dependency>
               <groupId>org.apache.curator</groupId>
               <artifactId>curator-framework</artifactId>
               <version>2.12.0</version>
           </dependency>
           <dependency>
               <groupId>org.apache.curator</groupId>
               <artifactId>curator-recipes</artifactId>
               <version>2.12.0</version>
           </dependency>
           <dependency>
               <groupId>org.apache.curator</groupId>
               <artifactId>curator-client</artifactId>
               <version>2.12.0</version>
           </dependency>
           <dependency>
               <groupId>org.apache.curator</groupId>
               <artifactId>curator-x-discovery</artifactId>
               <version>4.0.1</version>
           </dependency>
           <!-- 集成dubbo所需依赖 end -->
   
       </dependencies>
   ```

   

2. dubbo-consumer(pom.xml)

   1. 同dubbo-provider所有依赖

#### 2. 配置

1. application-provider.yml

   ```yml
   server:
     port: 8084
   dubbo:
     application:
       name: dubbo-provider
     scan:
       # 包名根据自己的实际情况写
       base-packages: com.zhb.service.impl
     protocol:
       port: 20880
       name: dubbo
     registry:
       #zookeeper注册中心地址
       address: zookeeper://127.0.0.1:2181
       timeout: 15000
   ```

   

2. application-consumer.yml

   ```yml
   server:
     port: 8085
   dubbo:
       application:
         name: dubbo-consumer
       scan:
         base-packages: com.zhb.controller
       registry:
         address: zookeeper://127.0.0.1:2181
   ```

   



#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 特技
