package helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {
	public static void main(String[] args) {
		SpringApplication.run(  HelloApplication.class   , args);
	}


//2020-04-22 21:24:46.728  INFO 12136 --- [           main] helloworld.HelloApplication              : Starting HelloApplication on DESKTOP-RVIVLBO with PID 12136 (D:\YCzy\helloworld\target\classes started by 聂仁美男朋友 in D:\YCzy\helloworld)
//2020-04-22 21:24:46.741  INFO 12136 --- [           main] helloworld.HelloApplication              : No active profile set, falling back to default profiles: default
//2020-04-22 21:24:49.257  INFO 12136 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
//2020-04-22 21:24:49.344  INFO 12136 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
//2020-04-22 21:24:49.345  INFO 12136 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.14]
//2020-04-22 21:24:49.360  INFO 12136 --- [           main] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [C:\Program Files\Java\jdk1.8.0_65\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:/Program Files/Java/jdk1.8.0_65/bin/../jre/bin/server;C:/Program Files/Java/jdk1.8.0_65/bin/../jre/bin;C:/Program Files/Java/jdk1.8.0_65/bin/../jre/lib/amd64;D:\hadoop-2.5.2\bin;D:\maven3\bin;D:\YC大数据一\python自学\Scripts\;D:\YC大数据一\python自学\;D:\Xshell 6\;E:\Xftp 6\;D:\oracle\product\10.2.0\db_2\bin;C:\Program Files\Java\jdk1.8.0_65\bin;C:\ProgramData\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;;C:\Program Files (x86)\NVIDIA Corporation\PhysX\Common;C:\Program Files\NVIDIA Corporation\NVIDIA NvDLISR;C:\Users\聂仁美男朋友\AppData\Local\Microsoft\WindowsApps;;D:\Pycharm\PyCharm 2019.3.1\bin;;D:\eclipse64\eclipse;;.]
//2020-04-22 21:24:49.570  INFO 12136 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
//2020-04-22 21:24:49.573  INFO 12136 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2740 ms
//2020-04-22 21:24:49.982  INFO 12136 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
//2020-04-22 21:24:50.362  INFO 12136 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
//2020-04-22 21:24:50.368  INFO 12136 --- [           main] helloworld.HelloApplication              : Started HelloApplication in 4.324 seconds (JVM running for 5.169)
//2020-04-22 21:54:45.341  INFO 12136 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
//2020-04-22 21:54:45.342  INFO 12136 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
//2020-04-22 21:54:45.393  INFO 12136 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 50 ms

	
}
