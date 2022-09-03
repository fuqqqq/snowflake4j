Language : [中文](README.md) | [English](README_en.md)
# Snowflake4J

[![GitHub Release](https://img.shields.io/github/release/fuqqqq/snowflake4j.svg)](https://github.com/fuqqqq/snowflake4j/releases)
[![License](https://img.shields.io/badge/license-Apache%202.0-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

Snowflake4J is a Java library, That can be used to get twitter snowflake ID.

References:
- [twitter/snowflake-2010](https://github.com/twitter/snowflake/tree/snowflake-2010)

## Import
- Maven

```xml
<dependency>
    <groupId>com.fuqqqq</groupId>
    <artifactId>snowflake4j</artifactId>
    <version>1.1.0</version>
</dependency>
```

- Gradle

```
compile 'com.fuqqqq:snowflake4j:1.1.0'
```

## Usage

```java
package com.example.demo.snowflake4j;

import com.fuqqqq.snowflake4j.*;

public class SimpleExample {

    public long test() {
        long epoch = 1643738522222L; // 2022-02-22 22:22:22.222
        long workerId = 0L;          // 0-31
        long datacenterId = 0L;      // 0-31
        // build an instance
        IdWorker idWorker = new IdWorkerBuilder()
                .setEpoch(epoch)
                .setDataCenterId(datacenterId)
                .setWorkerId(workerId)
                .build();

        return idWorker.nextId();
    }
}
```

PS: The epoch timestamp in the same system must be consistent.

## License
Released under the [Apache 2.0 License](LICENSE).