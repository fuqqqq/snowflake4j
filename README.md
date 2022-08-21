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
    <version>1.0.3</version>
</dependency>
  ```
Gradle
```groovy
compile 'com.fuqqqq:snowflake4j:1.0.3'
```

## 用法

```java
import com.fuqqqq.snowflake4j.IdGenerator;

public class SimpleExample {

    private IdGenerator idGen;

    public SimpleExample() {
        long workerId = 0L;     //0~31
        long datacenterId = 0L; //0~31
        // 创建实例
        IdGenerator idGen = new IdGenerator(workerId, datacenterId);
    }

    public long getNextId() {
        // 获取1个ID
        return idGen.nextId();
    }
    
    public Set<Long> getNextIds() {
        // 获取10个ID
        int quantity = 10; //1~255
        return idGen.nextIds(quantity);
    }
}
```

## *许可证*
根据[Apache 2.0 License](LICENSE)许可证发布。
