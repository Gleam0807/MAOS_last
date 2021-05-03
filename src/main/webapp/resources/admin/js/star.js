var attitude = function(){
	var $star = $(".star-attitude"),
		$result = $star.find("output>b");
	$(document)
	  .on("focusin", ".star-attitude>.attitude", function(){
	  $(this).addClass("focus");
	})
	  .on("focusout", ".star-attitude>.attitude", function(){
	  
		  var $this = $(this);
	  
		  setTimeout(function(){
		
			  if($this.find(":focus").length === 0){
				  $this.removeClass("focus");
			  }
	  }, 1000);
	})
	  .on("change", ".star-attitude :radio", function(){
	  $result.text($(this).next().text());
	})
	  .on("mouseover", ".star-attitude label", function(){
	  $result.text($(this).text());
	})
	  .on("mouseleave", ".star-attitude>.attitude", function(){
	  
		  var $checked = $star.find(":checked");
	  
		  if($checked.length === 0){
			  $result.text("0");
		  } else {
			  $result.text($checked.next().text());
		  }
	});
  };
  attitude();


  var tenacity = function(){
	var $star = $(".star-tenacity"),
		$result = $star.find("output>b");
		
		  $(document)
		.on("focusin", ".star-tenacity>.tenacity", 
			function(){
				$(this).addClass("focus");
		 })
			 
		   .on("focusout", ".star-tenacity>.tenacity", function(){
			var $this = $(this);
			setTimeout(function(){
				  if($this.find(":focus").length === 0){
					   $this.removeClass("focus");
				  }
			   }, 100);
		  })
	  
		.on("change", ".star-tenacity :radio", function(){
			$result.text($(this).next().text());
		  })
		.on("mouseover", ".star-tenacity label", function(){
			$result.text($(this).text());
		})
		.on("mouseleave", ".star-tenacity>.tenacity", function(){
			var $checked = $star.find(":checked");
				if($checked.length === 0){
					  $result.text("0");
					} else {
					  $result.text($checked.next().text());
				}
		  });
	};
	
	tenacity();


	
	var ability = function(){
		var $star = $(".star-ability"),
			$result = $star.find("output>b");
			
			  $(document)
			.on("focusin", ".star-ability>.ability", 
				function(){
					$(this).addClass("focus");
			 })
				 
			   .on("focusout", ".star-ability>.ability", function(){
				var $this = $(this);
				setTimeout(function(){
					  if($this.find(":focus").length === 0){
						   $this.removeClass("focus");
					  }
				   }, 100);
			  })
		  
			.on("change", ".star-ability :radio", function(){
				$result.text($(this).next().text());
			  })
			.on("mouseover", ".star-ability label", function(){
				$result.text($(this).text());
			})
			.on("mouseleave", ".star-ability>.ability", function(){
				var $checked = $star.find(":checked");
					if($checked.length === 0){
						  $result.text("0");
						} else {
						  $result.text($checked.next().text());
					}
			  });
		};
		
		ability();