Language : [EN](README_en.md) | [中文](README.md)
# Snowflake4J

[![GitHub Release](https://img.shields.io/github/release/fuqqqq/snowflake4j.svg)](https://github.com/fuqqqq/snowflake4j/releases)
[![License](https://img.shields.io/badge/license-Apache%202.0-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

Snowflake4J is a Java library, That can be used to get twitter snowflake ID.

References:
- https://github.com/twitter/snowflake/tree/snowflake-2010

## Import
Maven
```xml
<dependency>
    <groupId>com.fuqqqq</groupId>
    <artifactId>snowflake4j</artifactId>
    <version>1.0.2</version>
</dependency>
```
Gradle
```groovy
compile 'com.fuqqqq:snowflake4j:1.0.2'
```

## Usage

```java
import com.fuqqqq.snowflake4j.IdGenerator;

public class SimpleExample {

    private IdGenerator idGen;

    public SimpleExample() {
        long workerId = 0L;     //0~31
        long datacenterId = 0L; //0~31
        // create instance 
        IdGenerator idGen = new IdGenerator(workerId, datacenterId);
    }

    public long getNextId() {
        // get a id
        return idGen.nextId();
    }

    public Set<Long> getNextIds() {
        // get 10 ids
        int quantity = 10; //1~255
        return idGen.nextIds(quantity);
    }
}
```

### *License*
Released under the [Apache 2.0 License](LICENSE).
