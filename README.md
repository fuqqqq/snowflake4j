语言: [EN](README_en.md) | [中文](README.md)
# Snowflake4J

[![GitHub Release](https://img.shields.io/github/release/fuqqqq/snowflake4j.svg)](https://github.com/fuqqqq/snowflake4j/releases)
[![License](https://img.shields.io/badge/license-Apache%202.0-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

snowflake4j是一个Java库，用于获取推特雪花ID。

参考:
- https://github.com/twitter/snowflake/tree/snowflake-2010

## 引入
Maven
```xml
<dependency>
    <groupId>com.fuqqqq</groupId>
    <artifactId>snowflake4j</artifactId>
    <version>1.0.0</version>
</dependency>
  ```
Gradle
```groovy
compile 'com.fuqqqq:snowflake4j:1.0.0'
```

## 用法

```java
import com.fuqqqq.snowflake4j.IdGenerator;

public class SimpleExample {

    public long getNextId() {
        long workerId = 0L;     //0~31
        long datacenterId = 0L; //0~31
        // 创建实例
        IdGenerator idGen = new IdGenerator(workerId, datacenterId);
        // 获取ID
        return idGen.nextId();
    }
}
```

### *许可证*
根据[Apache 2.0 License](LICENSE)许可证发布。