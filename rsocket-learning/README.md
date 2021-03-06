[RSocket：又一个 REST 的挑战者](https://www.infoq.cn/article/gFia*KwwyjX7vxGd75KM)
[云原生实践之 RSocket 从入门到落地：Servlet vs RSocket](https://yq.aliyun.com/articles/688872)
[从微服务治理的角度看RSocket、. Envoy和. Istio](https://yq.aliyun.com/articles/683037?utm_content=g_1000036789)

RSocket 与 HTTP 的不同之处在于它定义了四种交互模型：

* 即发即忘（Fire-and-Forget）：这是对请求 / 响应的优化，在不需要响应时非常有用，比如用于非关键事件的日志记录。
* 请求 / 响应：当你发送一个请求并接收一个响应时，就像 HTTP 一样。即使在这种情况下，该协议也比 HTTP 更具优势，因为它是异步且多路复用的。
* 请求 / 流：类似于返回集合的请求 / 响应，集合将以流的方式返回，而不是等到查询完成，例如，发送一个银行帐号，使用一个实时的帐户事务流进行响应。
* 通道：允许任意交互模型的双向消息流。

> 基于消息意味着该协议可以在单个连接上支持多路复用。此外，与 TCP 一样，它是真正双向的，一旦客户端初始化了到服务器的连接，连接双方就变得彼此对等——实际上，服务器可以从客户端请求数据。

### RSocket and reactive programming
[Multi-Service Reactive Streams Using Spring, Reactor, and RSocket](https://springoneplatform.io/2018/sessions/multi-service-reactive-streams-using-spring-reactor-and-rsocket)