D:\Java\jdk-25\bin\java.exe "-javaagent:C:\Users\adity\AppData\Local\Programs\IntelliJ IDEA\lib\idea_rt.jar=51701" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "D:\Spring Framework\SpringExample\target\classes;C:\Users\adity\.m2\repository\org\springframework\spring-core\7.0.2\spring-core-7.0.2.jar;C:\Users\adity\.m2\repository\commons-logging\commons-logging\1.3.5\commons-logging-1.3.5.jar;C:\Users\adity\.m2\repository\org\jspecify\jspecify\1.0.0\jspecify-1.0.0.jar;C:\Users\adity\.m2\repository\org\springframework\spring-context\7.0.2\spring-context-7.0.2.jar;C:\Users\adity\.m2\repository\org\springframework\spring-aop\7.0.2\spring-aop-7.0.2.jar;C:\Users\adity\.m2\repository\org\springframework\spring-beans\7.0.2\spring-beans-7.0.2.jar;C:\Users\adity\.m2\repository\org\springframework\spring-expression\7.0.2\spring-expression-7.0.2.jar;C:\Users\adity\.m2\repository\io\micrometer\micrometer-observation\1.16.1\micrometer-observation-1.16.1.jar;C:\Users\adity\.m2\repository\io\micrometer\micrometer-commons\1.16.1\micrometer-commons-1.16.1.jar" car.example.autowire.type.App
Jan 14, 2026 6:15:36 PM org.springframework.context.support.ClassPathXmlApplicationContext refresh
WARNING: Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'myCar' defined in class path resource [autowireByType.xml]: Unsatisfied dependency expressed through bean property 'specification1': No qualifying bean of type 'car.example.autowire.type.Specification' available: expected single matching bean but found 2: specification,specification1
Exception in thread "main" org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'myCar' defined in class path resource [autowireByType.xml]: Unsatisfied dependency expressed through bean property 'specification1': No qualifying bean of type 'car.example.autowire.type.Specification' available: expected single matching bean but found 2: specification,specification1
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireByType(AbstractAutowireCapableBeanFactory.java:1543)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1437)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:602)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:525)
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:333)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:371)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:331)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:196)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.instantiateSingleton(DefaultListableBeanFactory.java:1218)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingleton(DefaultListableBeanFactory.java:1184)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:1121)
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:993)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:620)
	at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:144)
	at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:85)
	at car.example.autowire.type.App.main(App.java:8)
Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'car.example.autowire.type.Specification' available: expected single matching bean but found 2: specification,specification1
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveNotUnique(DependencyDescriptor.java:192)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1739)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1651)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireByType(AbstractAutowireCapableBeanFactory.java:1528)
	... 15 more

Process finished with exit code 1
