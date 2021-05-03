<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>MCOS &ndash; 관리를 편리하게</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Template by FREEHTML5.CO" />
	<meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
	<meta name="author" content="FREEHTML5.CO" />
	<link href="/resources/images/mainlogo.svg" rel="shortcut icon" type="image/x-icon">

  <!-- 
	//////////////////////////////////////////////////////

	FREE HTML5 TEMPLATE 
	DESIGNED & DEVELOPED by FREEHTML5.CO
		
	Website: 		http://freehtml5.co/
	Email: 			info@freehtml5.co
	Twitter: 		http://twitter.com/fh5co
	Facebook: 		https://www.facebook.com/fh5co

	//////////////////////////////////////////////////////
	 -->

  	<!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">

	<link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,600,400italic,700' rel='stylesheet' type='text/css'>
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="/resources/css/animate.css">
	<!-- Flexslider -->
	<link rel="stylesheet" href="/resources/css/flexslider.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="/resources/css/icomoon.css">
	<!-- Magnific Popup -->
	<link rel="stylesheet" href="/resources/css/magnific-popup.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="/resources/css/bootstrap.css">

	<!-- 
	Default Theme Style 
	You can change the style.css (default color purple) to one of these styles
	
	

	-->
	<link rel="stylesheet" href="/resources/css/style.css">

	<!-- Styleswitcher ( This style is for demo purposes only, you may delete this anytime. ) -->
	<link rel="stylesheet" id="theme-switch" href="/resources/css/style.css">
	<!-- End demo purposes only -->


	<style>
	@import url('https://fonts.googleapis.com/css2?family=Nanum+Brush+Script&display=swap');
	
	/* For Demo Purposes Only ( You can delete this anytime :-) */
	#colour-variations {
		padding: 10px;
		-webkit-transition: 0.5s;
	  	-o-transition: 0.5s;
	  	transition: 0.5s;
		width: 140px;
		position: fixed;
		left: 0;
		top: 100px;
		z-index: 999999;
		background: #fff;
		/*border-radius: 4px;*/
		border-top-right-radius: 4px;
		border-bottom-right-radius: 4px;
		-webkit-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);
		-moz-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);
		-ms-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);
		box-shadow: 0 0 9px 0 rgba(0,0,0,.1);
	}
	#colour-variations.sleep {
		margin-left: -140px;
	}
	#colour-variations h3 {
		text-align: center;;
		font-size: 11px;
		letter-spacing: 2px;
		text-transform: uppercase;
		color: #777;
		margin: 0 0 10px 0;
		padding: 0;;
	}

	#colour-variations ul,
	#colour-variations ul li {
		padding: 0;
		margin: 0;
	}
	#colour-variations ul {
		margin-bottom: 20px;
		float: left;	
	}
	#colour-variations li {
		list-style: none;
		display: inline;
	}
	#colour-variations li a {
		width: 20px;
		height: 20px;
		position: relative;
		float: left;
		margin: 5px;
	}


	#colour-variations a[data-layout="boxed"],
	#colour-variations a[data-layout="wide"] {
		padding: 2px 0;
		width: 48%;
		border: 1px solid #ededed;
		text-align: center;
		color: #777;
		display: block;
	}
	#colour-variations a[data-layout="boxed"]:hover,
	#colour-variations a[data-layout="wide"]:hover {
		border: 1px solid #777;
	}
	#colour-variations a[data-layout="boxed"] {
		float: left;
	}
	#colour-variations a[data-layout="wide"] {
		float: right;
	}

	.option-toggle {
		position: absolute;
		right: 0;
		top: 0;
		margin-top: 5px;
		margin-right: -30px;
		width: 30px;
		height: 30px;
		background: #8dc63f;
		text-align: center;
		border-top-right-radius: 4px;
		border-bottom-right-radius: 4px;
		color: #fff;
		cursor: pointer;
		-webkit-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);
		-moz-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);
		-ms-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);
		box-shadow: 0 0 9px 0 rgba(0,0,0,.1);
	}
	.option-toggle i {
		top: 2px;
		position: relative;
	}
	.option-toggle:hover, .option-toggle:focus, .option-toggle:active {
		color:  #fff;
		text-decoration: none;
		outline: none;
	}
	</style>
	<!-- End demo purposes only -->


	<!-- Modernizr JS -->
	<script src="/resources/js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

	</head>


	<!-- 
		INFO:
		Add 'boxed' class to body element to make the layout as boxed style.
		Example: 
		<body class="boxed">	
	-->
	<body>
	
	<!-- Loader -->
	<div class="fh5co-loader"></div>
	
	<div id="fh5co-page">
		<section id="fh5co-header">
			<div class="container">
				<nav role="navigation">
					<ul class="pull-left left-menu">
						<li><a href="/">홈</a></li>
						<li><a href="tour">기능소개</a></li>
						<li><a href="pricing">가격정책</a></li>
						<li><a href="/notice/list?num=1">고객지원</a></li>
					</ul>
					<h1 id="fh5co-logo"><img src="/resources/images/mainlogo.svg"><a href="/">MCOS<span>.</span></a></h1>
					<sec:authorize access="isAnonymous()">
					<ul class="pull-right right-menu">
						<li><a href="member/login">회원로그인</a></li>
						<li class="fh5co-cta-btn"><a href="member/register">회원회원가입</a></li>
						<li class="fh5co-cta-btn"><a href="member/executive_register">사용자회원가입</a></li>
					</ul>
					</sec:authorize>
					<sec:authorize access="isAuthenticated()"> 
					<ul class="pull-right right-menu">
						<li><form action="${pageContext.request.contextPath}/logout" method="POST">
						[[<input type="submit" id="logout" value="로그아웃" class="btn btn-link" style="text-decoration: none;color:rgba(190, 218, 213, 1);">]]
						<li><a href="/full">회사이동</a></li>
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /> </form></li>
					</ul>
					</sec:authorize>
				</nav>
			</div>
		</section>
		<!-- #fh5co-header -->

		<section id="fh5co-hero" class="js-fullheight" style="background-image: url(/resources/images/bg1.jpg);" data-next="yes">
			<div class="fh5co-overlay"></div>
			<div class="container">
				<div class="fh5co-intro js-fullheight">
					<div class="fh5co-intro-text">
						<!-- 
							INFO:
							Change the class to 'fh5co-right-position' or 'fh5co-center-position' to change the layout position
							Example:
							<div class="fh5co-right-position">
						-->
						<div class="fh5co-left-position">
							<h2 class="animate-box">편리한 작업 환경을 구성해보세요</h2>
							<p class="animate-box"><a onclick="loadMovie=('/resources/images/welcome.mp4')" id="myElement" class="btn btn-outline popup-vimeo btn-video"><i class="icon-play2"></i> Watch video</a></p>
						</div>
					</div>
				</div>
			</div>
			<div class="fh5co-learn-more animate-box">
				<a href="#" class="scroll-btn">
					<span class="arrow"><i class="icon-chevron-down"></i></span>
				</a>
			</div>
		</section>
		<!-- END #fh5co-hero -->



		<section id="fh5co-features">
			<div class="container">
				<div class="row text-center row-bottom-padded-md">
					<div class="col-md-8 col-md-offset-2">
						<figure class="fh5co-devices animate-box"><img src="/resources/images/noimage.jpg" alt="Free HTML5 Bootstrap Template" class="img-responsive"></figure>
						<h2 class="fh5co-lead animate-box">근태관리</h2>
						<p class="fh5co-sub-lead animate-box">복잡했던 구성원 관리를 간편하게!</p>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4 col-sm-6 col-xs-12 animate-box">
						<div class="fh5co-feature">
							<div class="fh5co-icon">
								<i class="icon-power"></i>
							</div>
							<h3>구성원과 회사 근무기록 관리</h3>
						</div>
					</div>
					<div class="col-md-4 col-sm-6 col-xs-12 animate-box">
						<div class="fh5co-feature">
							<div class="fh5co-icon">
								<i class="icon-flag2"></i>
							</div>
							<h3>간단한 휴가 신청부터 대체휴무 부여</h3>
						</div>
					</div>
					<div class="clearfix visible-sm-block"></div>
					<div class="col-md-4 col-sm-6 col-xs-12 animate-box">
						<div class="fh5co-feature">
							<div class="fh5co-icon">
								<i class="icon-anchor"></i>
							</div>
							<h3>캘린더 연동 서비스</h3>
						</div>
					</div>
					<div class="clearfix visible-sm-block"></div>
				</div>
			</div>
		</section>
		
		<section id="fh5co-features">
			<div class="container">
				<div class="row text-center row-bottom-padded-md">
					<div class="col-md-8 col-md-offset-2">
						<figure class="fh5co-devices animate-box"><img src="/resources/images/4insurance.png" alt="Free HTML5 Bootstrap Template" class="img-responsive"></figure>
						<h2 class="fh5co-lead animate-box">급여</h2>
						<p class="fh5co-sub-lead animate-box">급여 기준으로 4대보험 금액 계산</p>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4 col-sm-6 col-xs-12 animate-box">
						<div class="fh5co-feature">
							<div class="fh5co-icon">
								<i class="icon-power"></i>
							</div>
							<h3>복잡한 4대보험 심플하게 계산</h3>
						</div>
					</div>
					<div class="col-md-4 col-sm-6 col-xs-12 animate-box">
						<div class="fh5co-feature">
							<div class="fh5co-icon">
								<i class="icon-flag2"></i>
							</div>
							<h3>정확성 보장</h3>
						</div>
					</div>
					<div class="clearfix visible-sm-block"></div>
					<div class="col-md-4 col-sm-6 col-xs-12 animate-box">
						<div class="fh5co-feature">
							<div class="fh5co-icon">
								<i class="icon-anchor"></i>
							</div>
							<h3>안전한 급여관리</h3>
						</div>
					</div>
					<div class="clearfix visible-sm-block"></div>
				</div>
			</div>
		</section>	

		<!-- END #fh5co-features -->


		<section id="fh5co-features-2">
			<div class="container">
				<div class="col-md-6 col-md-push-6">
					<figure class="fh5co-feature-image animate-box">
						<img src="/resources/images/workflow2.png" alt="Free HTML5 Bootstrap Template by FREEHTML5.co">
					</figure>
				</div>
				<div class="col-md-6 col-md-pull-6">
					<h2 class="fh5co-lead animate-box">워크플로우</h2>
					<div class="fh5co-feature">
						<div class="fh5co-icon animate-box"><i class="icon-check2"></i></div>
						<div class="fh5co-text animate-box">
							<h3>중요한 결정을 효율적으로</h3>
						</div>
					</div>
					<div class="fh5co-feature">
						<div class="fh5co-icon animate-box"><i class="icon-check2"></i></div>
						<div class="fh5co-text animate-box">
							<h3>직관적인 프로세스</h3>
						</div>
					</div>
					<div class="fh5co-feature">
						<div class="fh5co-icon animate-box"><i class="icon-check2"></i></div>
						<div class="fh5co-text animate-box">
							<h3>간편한 요청,승인</h3>
						</div>
					</div>

					<div class="fh5co-btn-action animate-box">
						<a href="#" class="btn btn-primary btn-cta">자세히 보기</a>
					</div>

				</div>
			</div>
		</section>
		<!-- END #fh5co-features-2 -->
		

		<section id="fh5co-subscribe">
			<div class="container">
		
				<h3 class="animate-box"></h3>
				<form action="#" method="post" class="animate-box">
					<i class="fh5co-icon icon-paper-plane"></i>
					<input type="email" class="form-control" placeholder="Enter your email" id="email" name="email">
					<input type="submit" value="Send" class="btn btn-primary">
				</form>

			</div>
		</section>
		<!-- END #fh5co-subscribe -->

		<footer id="fh5co-footer">
			<div class="container">
				<div class="row row-bottom-padded-md">
					<div class="col-md-3 col-sm-6 col-xs-12 animate-box">
						<div class="fh5co-footer-widget">
							<h3>소개</h3>
							<ul class="fh5co-links">
								<li><a href="#">홈</a></li>
								<li><a href="#">기능소개</a></li>
								<li><a href="#">가격책정</a></li>
								<sec:authorize access="isAnonymous()">
								<li><a href="#">로그인</a></li>
								</sec:authorize>
								<sec:authorize access="isAuthenticated()">
								<li> </li>
								</sec:authorize>
							</ul>
						</div>
					</div>

					<div class="col-md-3 col-sm-6 col-xs-12 animate-box">
						<div class="fh5co-footer-widget">
							<h3>기능</h3>
							<ul class="fh5co-links">
								<li><a href="#">근태관리</a></li>
								<li><a href="#">급여</a></li>
								<li><a href="#">워크플로우</a></li>
								<li><a href="#">상담</a></li>
							</ul>
						</div>
					</div>

					<div class="col-md-3 col-sm-6 col-xs-12 animate-box">
						<div class="fh5co-footer-widget">
							<h3>지원</h3>
							<p>
								<a href="#">kosta@edu.co.kr</a> <br>
								경기도 성남시 분당구, <br>
								삼평동 682 유스페이스2 B동 <br>
								<a href="#">000-0000-0000</a>
							</p>
						</div>
					</div>

					<div class="col-md-3 col-sm-6 col-xs-12 animate-box">
						<div class="fh5co-footer-widget">
							<h3>Follow Us</h3>
							<ul class="fh5co-social">
								<li><a href="#"><i class="icon-twitter"></i></a></li>
								<li><a href="#"><i class="icon-facebook"></i></a></li>
								<li><a href="#"><i class="icon-google-plus"></i></a></li>
								<li><a href="#"><i class="icon-instagram"></i></a></li>
								<li><a href="#"><i class="icon-youtube-play"></i></a></li>
							</ul>
						</div>
					</div>

				</div>
				
			</div>
			<div class="fh5co-copyright animate-box">
				<div class="container">
					<div class="row">
						<div class="col-md-12">

						</div>
					</div>
				</div>
			</div>
		</footer>
		<!-- END #fh5co-footer -->
	</div>
	<!-- END #fh5co-page -->
	
	<!-- For demo purposes Only ( You may delete this anytime :-) -->
	<!-- End demo purposes only -->

	
	<!-- jQuery -->
	<script src="/resources/js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="/resources/js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="/resources/js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="/resources/js/jquery.waypoints.min.js"></script>
	<!-- Flexslider -->
	<script src="/resources/js/jquery.flexslider-min.js"></script>
	<!-- Magnific Popup -->
	<script src="/resources/js/jquery.magnific-popup.min.js"></script>
	<script src="/resources/js/magnific-popup-options.js"></script>

	<!-- For demo purposes only styleswitcher ( You may delete this anytime ) -->
	<script src="/resources/js/jquery.style.switcher.js"></script>
	<script>
		$(function(){
			$('#colour-variations ul').styleSwitcher({
				defaultThemeId: 'theme-switch',
				hasPreview: false,
				cookie: {
		          	expires: 30,
		          	isManagingLoad: true
		      	}
			});	
			$('.option-toggle').click(function() {
				$('#colour-variations').toggleClass('sleep');
			});
		});
	</script>
	<!-- End demo purposes only -->

	<!-- Main JS (Do not remove) -->
	<script src="/resources/js/main.js"></script>

	<!-- 
	INFO:
	jQuery Cookie for Demo Purposes Only. 
	The code below is to toggle the layout to boxed or wide 
	-->
	<script src="/resources/js/jquery.cookie.js"></script>
	<script>
		$(function(){

			if ( $.cookie('layoutCookie') != '' ) {
				$('body').addClass($.cookie('layoutCookie'));
			}

			$('a[data-layout="boxed"]').click(function(event){
				event.preventDefault();
				$.cookie('layoutCookie', 'boxed', { expires: 7, path: '/'});
				$('body').addClass($.cookie('layoutCookie')); // the value is boxed.
			});

			$('a[data-layout="wide"]').click(function(event){
				event.preventDefault();
				$('body').removeClass($.cookie('layoutCookie')); // the value is boxed.
				$.removeCookie('layoutCookie', { path: '/' }); // remove the value of our cookie 'layoutCookie'
			});
		});
		function loadMovie(url)
		{
	    jwplayer("myElement").setup({
	        file: url,
	        image: "/uploads/myPoster.jpg",
	  	width:580,
	  	height:366
	    });
		}
	</script>
	

	</body>
</html>

    