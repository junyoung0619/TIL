# Spring 정리
- 클라이언트 
    - 웹서버를 통해 서버가 보내주는 view를 볼 수 있음
	- form태그의 input태그에 입력하여 서버에 정보를 파라미터에 담아 보낼 수 있음 
		- url은 action으로,	
		- method 는 GET, POST방식이 있음 	

- Dispatcher servlet이 클라이언트로부터 요청을 받으면
- HandlerMapping에게 요청을 보내 어떤 컨트롤러를 사용할지를 받음
- 컨트롤러에게 요청을 보내면 어떤 뷰를 쓸지를 받음(ModelAndView)
- viewresolver에게 보내서 해당하는 view를 받음
- 결과물을 만들어 (주로 JSP) 클라이언트에게 감

- Model  
    - Service: Dao와 통신
    - Dao : DB와 통식