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
	<form action="noticeModify" method="post">
		<body>
			<p>
				<label>글번호</label> <input type="text" name="noticeid"
					value="${noticeBoardVO.noticeid}" readonly="readonly">
			</p>
			<p>
				<label>제목</label><input type="text" name="title"
					value="${noticeBoardVO.title}">
			</p>
			<p>
				<label>작성자</label> <input type="text" name="name" size="15"
					value="${noticeBoardVO.name}" readonly="readonly">
			</p>
			<label>내용</label>
			<textarea name=content rows="10" cols="70">${noticeBoardVO.content}</textarea>
			<br>
			<button type="submit">완료</button>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</body>
	</form>
</html>