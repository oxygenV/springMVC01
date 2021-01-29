基于xml配置方式使用springmvc遇到的问题：
找不到DispatcherServlet类？
File---Project Structure---Artifacts---WEB-INF下创建lib---add copy of
启动项目报错404？
id前+/
<bean id="/mvc" class="com.example.control.RequestControl"></bean>
配置解析器
<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
     <property name="prefix" value="/WEB-INF/page/"></property>
     <property name="suffix" value=".jsp"></property>
</bean>

