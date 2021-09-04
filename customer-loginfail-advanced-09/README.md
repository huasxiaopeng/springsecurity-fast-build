# 工程简介
```properties
在前面，我们简述了如何自定义用户登录失败页面。但是，在工作中，所遇到的业务场景压根不会这么简单。

比如要求记录登录失败时的IP、时间、SessionId；发送登录失败提醒到微信、邮箱、短信，提醒用户当前登录失败事件；同时记录到日志中，或者发送到远端日志监控平台，分析是否是攻击行为等等。

而这一切，Spring Security 框架非常贴心的提供了 AuthenticationFailureHandler 接口，当然了，框架同时也提供了一些简单的实现，最重要的，用户可自行扩展，以满足不同的业务场景

```
# 延伸阅读
