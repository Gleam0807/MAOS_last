<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page session="false"%>

<!DOCTYPE html>

<html>
<script>
function button_event(){

	var newForm = document.getElementById('fname');
	newForm.method="post";
	newForm.action="noticeRemove";
	
if (confirm("정말 삭제하시겠습니까??") == true){    //확인
    newForm.submit();
	}else{ //취소
		
	}
}

</script>
<head>

<title>글읽기</title>

</head>

<form id="fname">
	<body>
		<p>
			<label>글번호</label><input type="text" name="noticeid"
				value="${noticeBoardVO.noticeid}" readonly="readonly">
		</p>
		<p>
			<label>제목</label> <input type="text" name="title"
				style="background-color: #B0E0E6;" value="${noticeBoardVO.title}"
				readonly="readonly">
		</p>
		<p>
			<label>작성자</label> <input type="text" name="name" size="15"
				value="${noticeBoardVO.name}" readonly="readonly">
		<p>
			<label>내용</label>
			<textarea name=content rows="10" cols="70"
				style="background-color: #B0E0E6;" readonly="readonly">${noticeBoardVO.content}</textarea>
			<br>


			<button type="submit" formaction="noticeModify" formmethod="get">수정</button>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<button type="button" onclick="button_event();">삭제</button>
			<button type="submit" formaction="noticeBoard" formmethod="get">목록</button>
			
	</body>
</form>

</html>