<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page session="false"%>

<!DOCTYPE>

<html>

<head>

<title>글수정</title>

</head>

<body>
	글 수 정 페 이 지
	<form action="modify" method="post">
		<body>
			<p>
				<label>글번호</label> <input type="text" name="applyid"
					value="${boardVO.applyid}" readonly="readonly">
			</p>
			<p>
				<label>제목</label><input type="text" name="title"
					value="${boardVO.title}">
			</p>
			<p>
				<label>작성자</label> <input type="text" name="userid" size="15"
					value="${boardVO.userid}">
			</p>
			<label>내용</label>
			<textarea name=content rows="10" cols="70">${boardVO.content}</textarea>
			<br>
			<button type="submit">완료</button>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</body>
	</form>
</html>