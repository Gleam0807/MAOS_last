# MAOS_최종
kosta 프로젝트 결과물

# 스프링 시큐리티        

스프링 시큐리티는 스프링 기반의 어플리케이션의 보안(인증과 권한)을 담당하는 프레임워크이다. 만약 스프링시큐리티를 사용하지 않았다면, 자체적으로 세션을 체크하고 redirect 등을 해야할 것이다. 스프링 시큐리티는 보안과 관련해서 체계적으로 많은 옵션들로 이를 지원해준다. spring security는 filter 기반으로 동작하기 때문에 spring MVC 와 분리되어 관리 및 동작한다. 참고로 security 3.2부터는 XML로 설정하지 않고도 자바 bean 설정으로 간단하게 설정할 수 있도록 지원한다.

![image](https://user-images.githubusercontent.com/73210774/117611199-09a9bc80-b19e-11eb-9db5-2931b9ccf679.png)<br/>
spring security는 세션-쿠키방식으로 인증한다.

1. 유저가 로그인을 시도 (http request)<br/>
2. AuthenticationFilter 에서부터 위와같이 user DB까지 타고 들어감<br/>
3. DB에 있는 유저라면 UserDetails 로 꺼내서 유저의 session 생성<br/>
4. spring security의 인메모리 세션저장소인 SecurityContextHolder 에 저장<br/>
5. 유저에게 session ID와 함께 응답을 내려줌<br/>
6. 이후 요청에서는 요청쿠키에서 JSESSIONID를 까봐서 검증 후 유효하면 Authentication를 쥐어준다.<br/>

#설정
의존성 추가
````
<!-- Security --> 
<dependency> 
  <groupId>org.springframework.security</groupId> 
  <artifactId>spring-security-core</artifactId> 
  <version>${security.version}</version> 
</dependency> 
<dependency> 
  <groupId>org.springframework.security</groupId> 
  <artifactId>spring-security-web</artifactId> 
  <version>${security.version}</version> 
</dependency> 
<dependency> 
  <groupId>org.springframework.security</groupId> 
  <artifactId>spring-security-config</artifactId> 
  <version>${security.version}</version> 
</dependency> 
<dependency> 
  <groupId>org.springframework.security</groupId> 
  <artifactId>spring-security-taglibs</artifactId> 
  <version>${security.version}</version> 
</dependency> 
<dependency> 
  <groupId>org.springframework.security</groupId> 
  <artifactId>spring-security-test</artifactId> 
  <version>${security.version}</version> 
</dependency> ````

