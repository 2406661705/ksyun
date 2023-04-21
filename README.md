1.编写字符串工具类实现下如下四个方法，方法接收字符串参数并实现如下目标：
	1.1反转字符串参数，并作为方法结果返回(10分)
	1.2统计字符串中每个字母出现的次数，以Map结构返回（10分）
	1.3打印出现次数最多的字母及其次数（10分）
	1.4 返回不含有重复字符的最长子串（20分）

2.创建学生对象，包括姓名、年龄、住址、出生年月等属性；模拟生成学生集合，基于字段注解、打印输出该集合，要求输出的第一行数据为字段名称、后续行数据为集合数据；不限输出格式，可以是excel、htm、txt等；
	2.1.定义注解类：用于标注集合对象属性；（10分）
	2.2.定义工具类输出集合对象:集合输出时根据属性的标注输出属性字段名;(20分)

3.编写一个程序，启动三个线程，三个线程的ID分别是A，B，C；，每个线程将自己的ID值在屏幕上打印5遍，打印顺序是ABCABC…  （20分）

第一题：编写字符串工具类StringUtil.class；
路径：com.ksyun.whgc.zhoujunjun\src\main\java\practice1\StringUtil.class。
编写测试的类为StringUtilTest.class。
测试类路径：com.ksyun.whgc.zhoujunjun\src\test\java\practice1\StringUtilTest.class。

第二题：编写学生相关的类，包括Student.class、StudentField接口、StudentCollectionPrinter.class。
其路径均在：com.ksyun.whgc.zhoujunjun\src\main\java\practice2\
编写测试的类为StudentCollectionPrinterTest.class。
测试类路径：com.ksyun.whgc.zhoujunjun\src\test\java\practice2\StudentCollectionPrinterTest.class。

第三题：编写打印线程类ThreeThreads.class；
路径：com.ksyun.whgc.zhoujunjun\src\main\java\practice3\ThreeThreads.class。
编写测试的类为ThreeThreadsTest.class。
测试类路径：com.ksyun.whgc.zhoujunjun\src\test\java\practice1\ThreeThreadsTest.class。
