# Dubbo3 learning

## 环境
* JDK 17
* Dubbo 3.2.0
* Spring Boot 2.7.12

版本问题：
> java.lang.reflect.InaccessibleObjectException

解决方案：
> 启动时添加vm参数：--add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.util.concurrent=ALL-UNNAMED --add-opens=java.rmi/sun.rmi.transport=ALL-UNNAMED --add-opens java.base/java.lang.reflect=ALL-UNNAMED --add-opens java.base/java.util=ALL-UNNAMED --add-opens java.base/java.math=ALL-UNNAMED
