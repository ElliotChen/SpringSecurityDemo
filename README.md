# SpringSecurityDemo

## Reference Document:

[Official Doc](https://docs.spring.io/spring-boot/docs/current/reference/html/)

## Oauth2

[spring-security-oauth project](https://projects.spring.io/spring-security-oauth/docs/oauth2.html)
[spring-security-oauth2-boot](https://docs.spring.io/spring-security-oauth2-boot/docs/)

## 

[yorkxin OAuth 2.0 系列文](https://blog.yorkxin.org/2013/09/30/oauth2-1-introduction)


##
[OAuth 2 Developers Guide](https://projects.spring.io/spring-security-oauth/docs/oauth2.html)
The provider role in OAuth 2.0 is actually split between Authorization Service and Resource Service

The requests for the tokens are handled by Spring MVC controller endpoints, and access to protected resources is handled by standard Spring Security request filters.

The following endpoints are required in the Spring Security filter chain in order to implement OAuth 2.0 Authorization Server:

1. AuthorizationEndpoint is used to service requests for authorization. Default URL: /oauth/authorize.
2. TokenEndpoint is used to service requests for access tokens. Default URL: /oauth/token.

The following filter is required to implement an OAuth 2.0 Resource Server:

1. The OAuth2AuthenticationProcessingFilter is used to load the Authentication for the request given an authenticated access token.


## Authorization Server Configuration

1. @EnableAuthorizationServer
2. @Beans that implement AuthorizationServerConfigurer

### Implementation - extends AuthorizationServerConfigurerAdapter
1. ClientDetailsServiceConfigurer: a configurer that defines the client details service. Client details can be initialized, or you can just refer to an existing store.
2. AuthorizationServerSecurityConfigurer: defines the security constraints on the token endpoint.
3. AuthorizationServerEndpointsConfigurer: defines the authorization and token endpoints and the token services.


## Docs

[laoxu github](https://github.com/lexburner/oauth2-demo)
[laoxu](http://www.iocoder.cn/Spring-Security/laoxu/OAuth2-1/)

## oauth2 四種模式
### 1. Authorization code
### 2. Implicit (Authorization code的簡化模式)
### 3. Pasword 
Client提供username,password送到AuthorizationServer, 適合Client為同一公司的系統軟體或App, 
轉入的參數必需包含
```username```
```password```
```grant_type```,此時的值必為```password```
```scope```授權範圍，為Optional
### 4.

1.
2.
3. 
4.