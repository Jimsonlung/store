$(document).ready(function(){
						
		if($(".login").is(":hidden")){
			
			$("div:not(.login)").dblclick(function(){
				$(".login").slideUp(1000);
			});
		}
		
		$(".TopNav .login1").mousedown(function(){
				if($(".login").css("display")=="none"){
					$(".login").slideDown(1000);
				}
		});
	
});