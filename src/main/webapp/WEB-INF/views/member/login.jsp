<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html class="no-js" lang="zxx">
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>MCOS &ndash; 관리를 편리하게</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="manifest" href="site.webmanifest">
    <link rel="shortcut icon" type="image/x-icon" href="/resources/images/mainlogo.svg">

	<!-- CSS here -->
	<link rel="stylesheet" href="/resources/assets/css/bootstrap.min.css">
	<link rel="stylesheet" href="/resources/assets/css/owl.carousel.min.css">
	<link rel="stylesheet" href="/resources/assets/css/slicknav.css">
    <link rel="stylesheet" href="/resources/assets/css/flaticon.css">
    <link rel="stylesheet" href="/resources/assets/css/progressbar_barfiller.css">
    <link rel="stylesheet" href="/resources/assets/css/gijgo.css">
    <link rel="stylesheet" href="/resources/assets/css/animate.min.css">
    <link rel="stylesheet" href="/resources/assets/css/animated-headline.css">
	<link rel="stylesheet" href="/resources/assets/css/magnific-popup.css">
	<link rel="stylesheet" href="/resources/assets/css/fontawesome-all.min.css">
	<link rel="stylesheet" href="/resources/assets/css/themify-icons.css">
	<link rel="stylesheet" href="/resources/assets/css/slick.css">
	<link rel="stylesheet" href="/resources/assets/css/nice-select.css">
	<link rel="stylesheet" href="/resources/assets/css/style.css">
</head>
<body>
    <!-- ? Preloader Start -->
    <div id="preloader-active">
        <div class="preloader d-flex align-items-center justify-content-center">
            <div class="preloader-inner position-relative">
                <div class="preloader-circle"></div>
                <div class="preloader-img pere-text">
                    <img src="/resources/images/mainlogo.svg" alt="">
                </div>
            </div>
        </div>
    </div>
    <!-- Preloader Start-->


<main class="login-body" data-vide-bg="/resources/assets/img/login-bg.mp4">
    <!-- Login Admin --> 
    <form class="form-default" action="/login" method="POST">
        
        <div class="login-form">
            <!-- logo-login -->
            <div class="logo-login">
                <a href="index.jsp"><img src="/resources/images/mainlogo.svg" alt=""></a>
            </div>
            <h2>회원 로그인 </h2>
            <div class="form-input">
                <label for="name">사번</label>
                <input type="text" name="userId" placeholder="ID">
            </div>
            <div class="form-input">
                <label for="name">비밀번호</label>
                <input type="password" name="userPass" placeholder="Password">
            </div>
            <div class="form-input pt-30">
                <input type="submit" name="submit" value="로그인">
                <c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION }">
	<p style="color:red; font-weight:bold;"> 로그인 실패 : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message }</p>
	<c:remove var="SPRING_SECURITY_LAST_EXCEPTION" scope="session" />
	</c:if>  
            </div>
            
            <!-- Forget Password -->
    
            <!-- Forget Password -->
            <a href="register" class="registration">Registration</a>
        </div>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    </form>
    <!-- /end login form -->
</main>


    <script src="/resources/assets/js/vendor/modernizr-3.5.0.min.js"></script>
    <!-- Jquery, Popper, Bootstrap -->
    <script src="/resources/assets/js/vendor/jquery-1.12.4.min.js"></script>
    <script src="/resources/assets/js/popper.min.js"></script>
    <script src="/resources/assets/js/bootstrap.min.js"></script>
    <!-- Jquery Mobile Menu -->
    <script src="/resources/assets/js/jquery.slicknav.min.js"></script>

    <!-- Video bg -->
    <script src="/resources/assets/js/jquery.vide.js"></script>

    <!-- Jquery Slick , Owl-Carousel Plugins -->
    <script src="/resources/assets/js/owl.carousel.min.js"></script>
    <script src="/resources/assets/js/slick.min.js"></script>
    <!-- One Page, Animated-HeadLin -->
    <script src="/resources/assets/js/wow.min.js"></script>
    <script src="/resources/assets/js/animated.headline.js"></script>
    <script src="/resources/assets/js/jquery.magnific-popup.js"></script>

    <!-- Date Picker -->
    <script src="/resources/assets/js/gijgo.min.js"></script>
    <!-- Nice-select, sticky -->
    <script src="/resources/assets/js/jquery.nice-select.min.js"></script>
    <script src="/resources/assets/js/jquery.sticky.js"></script>
    <!-- Progress -->
    <script src="/resources/assets/js/jquery.barfiller.js"></script>
    
    <!-- counter , waypoint,Hover Direction -->
    <script src="/resources/assets/js/jquery.counterup.min.js"></script>
    <script src="/resources/assets/js/waypoints.min.js"></script>
    <script src="/resources/assets/js/jquery.countdown.min.js"></script>
    <script src="/resources/assets/js/hover-direction-snake.min.js"></script>

    <!-- contact js -->
    <script src="/resources/assets/js/contact.js"></script>
    <script src="/resources/assets/js/jquery.form.js"></script>
    <script src="/resources/assets/js/jquery.validate.min.js"></script>
    <script src="/resources/assets/js/mail-script.js"></script>
    <script src="/resources/assets/js/jquery.ajaxchimp.min.js"></script>
    
    <!-- Jquery Plugins, main Jquery -->	
    <script src="/resources/assets/js/plugins.js"></script>
    <script src="/resources/assets/js/main.js"></script>
    
    </body>
</html>