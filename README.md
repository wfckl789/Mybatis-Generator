# Mybatis-Generator

#### 环境依赖

Java JDK 1.8

Spring mybatis-generator插件

```xml
<build>
	<plugins>
    <plugin>
      <groupId>org.mybatis.generator</groupId>
      <artifactId>mybatis-generator-maven-plugin</artifactId>
      <version>1.4.0</version>
```

#### 使用步骤

1. ##### generator.properties

    1. 指定数据库名

   ```properties
   jdbc.connectionURL=jdbc:mysql://localhost:3306/数据库名
   ```

2. ##### generatorConfiguration.xml

   指定数据表和Key字段

   ```properties
   <table tableName="数据表1">
       <generatedKey column="key字段名" sqlStatement="MySql" identity="true"/>
   </table>
   <table tableName="数据表2">
       <generatedKey column="key字段名" sqlStatement="MySql" identity="true"/>
   </table>
   ```
   
   指定model、mapper.xml 接口的生成路径
   
   ```properties
   <!--指定生成model的路径-->
   <javaModelGenerator targetPackage="com.example.mybatisgenerator.model" targetProject="src/main/java"/>
   <!--指定生成mapper.xml的路径-->
   <sqlMapGenerator targetPackage="mapper" targetProject="src/main/resources"/>
   <!--指定生成mapper接口的的路径-->
   <javaClientGenerator type="XMLMAPPER" targetPackage="com.example.mybatisgenerator.dao"
   targetProject="src/main/java"/>
   ```

3. ##### generatorConfiguration.xml

```shell
mvn mybatis-generator:generate
```

#### 目录结构

```shell
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── example
    │   │           └── mybatisgenerator
    │   │               ├── dao												// Mapper接口文件
    │   │               └── model											// example和实体类
    │   └── resources
    │       ├── mapper																// Mapper XML
    │				├── application.yml												// Spring配置 数据库连接和Mybatis输出目录
    │       ├── generator.properties									// 存generatorConfiguration.xml要读的配置内容
    │       └── generatorConfiguration.xml						// Mybatis generator配置，生成文件输出路径等
    └── test
        └── java
            └── com
                └── example
                    └── mybatisgenerator
    └── pom.xml																				// Mybatis generator配置，定义配置文件名称、路径等

```

