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
    <version>1.0.0</version>
</dependency>
```
Gradle
```groovy
compile 'com.fuqqqq:snowflake4j:1.0.0'
```

## Usage

```java
import com.fuqqqq.snowflake4j.IdGenerator;

public class SimpleExample {

    public long getNextId() {
        long workerId = 0L;     //0~31
        long datacenterId = 0L; //0~31
        // create instance 
        IdGenerator idGen = new IdGenerator(workerId, datacenterId);
        // get id
        return idGen.nextId();
    }
}
```

### *License*
Released under the [Apache 2.0 License](LICENSE).
