
$(function(){ 
        "use strict";
      $("#insuranceBtn").click(function() {
        // 국민 연금 계산
        let payBox = $("#payBox").val().replace(/,/g,"");
        const taxNaion = 0.045;                                                                             // 국민연금 4.5%
        let nationPension = Math.floor(payBox * taxNaion/10)*10;                                            // 근로자 부담 국민연금
        let com_nationPension = Math.floor(payBox * taxNaion/10)*10;
        let totalNation = nationPension + com_nationPension;                                        // 기업 부담 국민연금
        //Math.floor(/10)*10 -> 소수점,1의 단위 절사
        $("#nationPension").val(nationPension.format());
        $("#com_nationPension").val(com_nationPension.format());
        $("#totalNation").val(totalNation.format());

        // 건강보험 계산
        const taxHealthInsurance = 0.03335;                                                                 // 겅강보험 3.335%
        let healthInsurance = Math.floor(payBox * taxHealthInsurance/10)*10;                                // 근로자 부담 건강보험
        let com_healthInsurance = Math.floor(payBox * taxHealthInsurance/10)*10;                            // 사업주 부담 건강보험
        let totalhealthInsurance = healthInsurance + com_healthInsurance;
        $("#healthInsurance").val(healthInsurance.format());
        $("#com_healthInsurance").val(com_healthInsurance.format());
        $("#totalhealthInsurance").val(totalhealthInsurance.format());
        
        // 장기요양 보험 계산
        const taxLongTermCare = 0.1025;                                                                      // 요양보험(건강보험료)*10.25%
        const longTermCareRate =$("#healthInsurance").val().replace(/,/g,"");;                               //장기요양보험은 건강보험의 값에서 계산을 함  
        let longTermCare = Math.floor(longTermCareRate * taxLongTermCare/10)*10;                             // 근로자 부담 요양보험
        let com_longTermCare = Math.floor(longTermCareRate * taxLongTermCare/10)*10;                         // 사업주 부담 요양보험
        let totalLongTermCare = longTermCare + com_longTermCare;
        $("#longTermCare").val(longTermCare.format());
        $("#com_longTermCare").val(com_longTermCare.format());
        $("#totalLongTermCare").val(totalLongTermCare.format());


        // 근로자 수에 따른 고용보험 계산
        const taxEmployInsurance = 0.008;                                                                     // 고용보험(실업급여) 0.8%
        let com_inuranceRate = parseFloat($('input[name="worker"]:checked').val()); //근로자 수에 따른(실업급여+고용안정,직업능력 개발사업 부담금) 
        let employInsurance = Math.floor(payBox * taxEmployInsurance/10)*10;                                  // 근로자 부담 고용보험
        let com_employInsurance= Math.floor(payBox * (taxEmployInsurance + com_inuranceRate)/10)*10;          // 사업주 부담 고용보험
        let totalEmployInsurance = employInsurance + com_employInsurance; 
        $("#employInsurance").val(employInsurance.format());
        $("#com_employInsurance").val(com_employInsurance.format());
        $("#totalEmployInsurance").val(totalEmployInsurance.format()); 

       //  합계 구하기
       let totalWorker = (nationPension + healthInsurance + longTermCare + employInsurance).toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");                     
       let totalCompany = (com_nationPension + com_healthInsurance + com_longTermCare + com_employInsurance).toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");   
       let totalInsurance = (totalNation + totalhealthInsurance + totalLongTermCare + totalEmployInsurance).toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
       $("#totalTot").val(totalInsurance);
       $("#workerTot").val(totalWorker);
       $("#comTot").val(totalCompany);
     });
        Number.prototype.format = function(){
     if(this==0) return 0;
  
     var reg = /(^[+-]?\d+)(\d{3})/;
     var n = (this + '');
  
     while (reg.test(n)) n = n.replace(reg, '$1' + ',' + '$2');
  
     return n;
   };        
  

  });
 
