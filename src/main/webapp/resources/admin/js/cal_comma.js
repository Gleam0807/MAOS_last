 //------------------ 콤마 넣기 펑션 -----------------
 function comma_add(box) {
 	if (box == null) return;
     var i; 
     var inits = "";
     var num_len = box.value.length;
 	var hoy = box.value;
 	if(hoy == "" || hoy=="NaN") {
 		if(hoy=="NaN") {
 			alert('숫자만 입력가능합니다.');
 			box.value="";
 			event.returnValue = false;
 			return;
 		}
 		box.value="";
 		event.returnValue = false;
 		return;
 	}
     for(i=0; i<num_len; i++) {
        var sect=box.value.substring(i,i+1);
        if (sect != ",") {
           inits += sect;
        }  
     }
     box.value = parseInt(inits);
  
     ing=box.value.length % 3; 
     num_len=(box.value.length - ing) / 3;
     sect=box.value.substring(0,ing);

     for(i=0; i<num_len; i++) {
 		if((ing == 0) && (i == 0)) {
 			sect += box.value.substring(ing+(3*i),ing+3+(3*i));  
 		} else {
 		    sect += ",";
 			sect += box.value.substring(ing+(3*i),ing+3+(3*i));  
 		}
     }
     box.value = sect; 

     return true; 
 }
 /** input말고 바로 value나 text를 파라미터로 받음 */
 function comma_add_value(nStr) {
     nStr += '';
     x = nStr.split('.');
     x1 = x[0];
     x2 = x.length > 1 ? '.' + x[1] : '';
     var rgx = /(\d+)(\d{3})/;
     while (rgx.test(x1)) {
         x1 = x1.replace(rgx, '$1' + ',' + '$2');
     }
     return x1 + x2;
 }
 //------------------ 콤마 넣기 펑션 끝 -----------------

