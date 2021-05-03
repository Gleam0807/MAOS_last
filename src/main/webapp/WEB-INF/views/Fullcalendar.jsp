<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8" />
<title>Calendar</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style type="text/css">
.cal_top{
    text-align: center;
    font-size: 30px;
}
.cal{
    text-align: center; 
}
table.calendar{
    border: 1px solid black;
    display: inline-table;
    text-align: left;
}
table.calendar td{
    vertical-align: top;
    border: 1px solid skyblue;
    width: 200px;
}
</style>
</head>
<body>
    <div class="cal_top">
        <a href="#" id="movePrevMonth"><span id="prevMonth" class="cal_tit">&lt;</span></a>
        <span id="cal_top_year"></span>
        <span id="cal_top_month"></span>
        <a href="#" id="moveNextMonth"><span id="nextMonth" class="cal_tit">&gt;</span></a>
    </div>
    <div id="cal_tab" class="cal">
    </div>
 
<script type="text/javascript">
    
    var today = null;
    var year = null;
    var month = null;
    var firstDay = null;
    var lastDay = null;
    var $tdDay = null;
    var $tdSche = null;
    var jsonData = null;

    $(document).ready(function() {
        drawCalendar();
        initDate();
        drawDays();
       
        //ajax 요청 보내기  Fullcalendar
        var reply =   $("#cal_top_year").text()+"-"+ $("#cal_top_month").text()+"-00" ;
         
    $.ajax({
        type : 'GET',
        url : '/Fullcalendar?current='+reply,
                
        //요청결과가 성공일 경우
        success : function(data) {
        	 drawSche(data);    
        	 
            },
        //요청결과가 실패일 경우
        error : function(xhr, status, error){
            alert("Error!");
        }
    });

       
        $("#movePrevMonth").on("click", function(){movePrevMonth();});
        $("#moveNextMonth").on("click", function(){moveNextMonth();});
    });
    
    //Calendar 그리기
    function drawCalendar(){
        var setTableHTML = "";
        setTableHTML+='<table class="calendar">';
        setTableHTML+='<tr><th>SUN</th><th>MON</th><th>TUE</th><th>WED</th><th>THU</th><th>FRI</th><th>SAT</th></tr>';
        for(var i=0;i<6;i++){
            setTableHTML+='<tr height="100">';
            for(var j=0;j<7;j++){
                setTableHTML+='<td style="text-overflow:ellipsis;overflow:hidden;white-space:nowrap">';
                setTableHTML+='    <div class="cal-day"></div>';
                setTableHTML+='    <div class="cal-schedule"></div>';
                setTableHTML+='</td>';
            }
            setTableHTML+='</tr>';
        }
        setTableHTML+='</table>';
        $("#cal_tab").html(setTableHTML);
    }
    
    //날짜 초기화
    function initDate(){
    	
        $tdDay = $("td div.cal-day")
        $tdSche = $("td div.cal-schedule")
        dayCount = 0;
        today = new Date();
        year = today.getFullYear();
        month = today.getMonth()+1;
       // if(month < 10){month = "0"+month;}
        firstDay = new Date(year,month-1,1);
        lastDay = new Date(year,month,0);
    }
    
    //calendar 날짜표시
    function drawDays(){
        $("#cal_top_year").text(year);
        $("#cal_top_month").text(month);
        for(var i=firstDay.getDay();i<firstDay.getDay()+lastDay.getDate();i++){
            $tdDay.eq(i).text(++dayCount);
        }
        for(var i=0;i<42;i+=7){
            $tdDay.eq(i).css("color","red");
        }
        for(var i=6;i<42;i+=7){
            $tdDay.eq(i).css("color","blue");
        }
    }
    
    //calendar 월 이동
    function movePrevMonth(){
        month--;
        if(month<=0){
            month=12;
            year--;
        }
        if(month<10){
            month=String("0"+month);
        }
        getNewInfo();
        }
    
    function moveNextMonth(){
        month++;
        if(month>12){
            month=1;
            year++;
        }
        if(month<10){
            month=String("0"+month);
        }
        getNewInfo();
    }
    
    //정보갱신
    function getNewInfo(){
        for(var i=0;i<42;i++){
            $tdDay.eq(i).text("");
            $tdSche.eq(i).text("");
        }
        dayCount=0;
        firstDay = new Date(year,month-1,1);
        lastDay = new Date(year,month,0);
        drawDays();
        drawSche(data);
    }
    
    //2019-08-27 추가본
    
    //데이터 등록

    function setData(data){
    	  obj0 =  data[0];
          jsonData = {  }       
          temp ={}
          temp[obj0["month"]]={}       
          var ykey = obj0["year"]  ; 
          var mkey = obj0["month"]  ;      
          jsonData[ykey] = temp;
              
          $.each(data , function(key, valObj){
                let dkey = valObj["day"];
                temp ={}
                temp[valObj["day"]]= valObj["title"]  ;
             if(Object.keys( jsonData[ykey][mkey]).includes(dkey)){
                // console.log(jsonData[ykey][mkey][dkey])   ;         
                 jsonData[ykey][mkey][dkey] += ", " ;
                 jsonData[ykey][mkey][dkey] +=valObj["title"] ;
             }else{  
                temp ={}
                temp[valObj["day"]]= valObj["title"]  ;
                $.extend(jsonData[ykey][mkey], temp);
             }
          });
        }
    
    //스케줄 그리기
    function drawSche(data){
        setData(data);
        console.log(year,month);
        var dateMatch = null;
        for(var i=firstDay.getDay();i<firstDay.getDay()+lastDay.getDate();i++){
            var txt = "";
            txt =jsonData[year];
           // console.log(txt);
            if(txt){
                txt = jsonData[year][month];
               // console.log(txt);
                if(txt){
                    txt = jsonData[year][month][i];
                    dateMatch = firstDay.getDay() + i -1; 
                    $tdSche.eq(dateMatch).text(txt);
                }
            }
        }
    }
 
</script>
</body>
</html>
