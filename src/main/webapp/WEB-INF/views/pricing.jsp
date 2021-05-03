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
	<script langauge="javascript">
            function popup1(){
                var url="payment1";
                var option="width=400, height=500, top=200"
                window.open(url, "", option);
            }
    </script>
    	<script langauge="javascript">
            function popup2(){
                var url="payment2";
                var option="width=400, height=500, top=200"
                window.open(url, "", option);
            }
    </script>
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


		<section id="fh5co-hero" class="no-js-fullheight" style="background-image: url(/resources/images/bg2.jpg);" data-next="yes">
			<div class="fh5co-overlay"></div>
			<div class="container">
				<div class="fh5co-intro no-js-fullheight">
					<div class="fh5co-intro-text">
						<!-- 
							INFO:
							Change the class to 'fh5co-right-position' or 'fh5co-center-position' to change the layout position
							Example:
							<div class="fh5co-right-position">
						-->
						<div class="fh5co-center-position">
							<h2 class="animate-box">MCOS의 멋진 기능들을 활용해볼까요?</h2>
							<h3 class="animate-box">MCOS는 별도 설치 비용도, 업그레이드 비용도, 의무 가입 기간도 없습니다.
								지금 MCOS를 시작하고, 반복적인 인사업무에서 벗어나 회사의 성장에 집중하세요.</h3>
							
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

		<section id="fh5co-pricing">
			<div class="container">
				<div class="row">
				<div class="col-md-3 col-sm-6 animate-box">
					<div class="price-box">
						<h2 class="pricing-plan">스탠다드</h2>
						<div class="price">8,000<sup class="currency">원</sup><small>/월</small></div>
						<p>스마트한 급여정산과 급여관리</p>
						<hr>
						<ul class="pricing-info">
							<li>근무시간 관리</li>
							<li>휴가 등록 및 신청</li>
							<li>근무/휴가 승인 시스템</li>
							<li>인사 DB 관리</li>
							<li>급여정산/급여대장 관리</li>
						</ul>
						<a href="" role="button" class="btn btn-default btn-sm" onclick="popup1()">시작하기</a>
					</div>
				</div>
				<div class="clearfix visible-sm-block"></div>
				<div class="col-md-3 col-sm-6 animate-box">
					<div class="price-box popular">
						<div class="popular-text">Best value</div>
						<h2 class="pricing-plan">프리미엄</h2>
						<div class="price">21,000<sup class="currency">원</sup><small>/월</small></div>
						<p>인사전문가를 위한 컨설팅</p>
						<hr>
						<ul class="pricing-info">
							<li>스탠다드의 모든 서비스 포함</li>
							<li>입사부터 퇴직까지 인사 컨설팅</li>
							<li>워크플로우 (전자결재)</li>
							<li>전자계약 서비스</li>
							<li>조직도 검색</li>
						</ul>
						<a href="#" class="btn btn-primary btn-sm" onclick="popup2()">시작하기</a>
					</div>
				</div>
				</div>
			</div>
		</section>

		<!-- END #fh5co-pricing -->

		<div id="fh5co-faqs">
			<div class="container">
				<div class="row row-bottom-padded-lg">
					<div class="col-md-6 col-md-offset-3 text-center">
						<div class="fh5co-label animate-box">FAQ</div>
						<h2 class="fh5co-lead animate-box">자주 묻는 질문</h2>
					</div>
				</div>
				<div class="row">
					<div class="col-md-8 col-md-offset-2">
						<ul class="fh5co-faq-list">
							<li class="animate-box">
								<h2>What is Guide?</h2>
								<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.</p>
							</li>
							<li class="animate-box">
								<h2>What language are available?</h2>
								<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.</p>
							</li>
							<li class="animate-box">
								<h2>I have technical problem, who do I email?</h2>
								<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.</p>
							</li>
							<li class="animate-box">
								<h2>Can I have a username that is already taken?</h2>
								<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.</p>
							</li>
							<li class="animate-box">
								<h2>How do I use Guide features?</h2>
								<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.</p>
							</li>
							<li class="animate-box">
								<h2>Is Guide free??</h2>
								<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.</p>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		

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
								<li><a href="#">로그인</a></li>
							</ul>
						</div>
					</div>

					<div class="col-md-3 col-sm-6 col-xs-12 animate-box">
						<div class="fh5co-footer-widget">
							<h3>기능</h3>
							<ul class="fh5co-links">
								<li><a href="#">근태관리</a></li>
								<li><a href="#">급여정산</a></li>
								<li><a href="#">워크플로우</a></li>
								<li><a href="#">전자계약</a></li>
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
	</script>
	

	</body>
</html>

    