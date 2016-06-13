
var empList = [];

$( document ).ready(function() {
	
	console.log( "ready!" );
    $("#btn").click(function(){
    	$('#displayData').html("");
    	$.get("../service/home/"+$("#drpdwn").val(), function(data, status) {
    		document.getElementById("resultBlock").style.display = "";
        	empList = data;
        	var str = "exp";
        	var strr = "empid";
        	$.each(empList , function (index, value) {
        		var tableContent = "<tr><td id="+strr+">" + value.empId + "</td> <td>"+ value.empName +"</td> <td id="+str+">"+ value.exp +"</td> <td>"+ value.homeTown+"</tr></td>";
        		$("#displayData").append(tableContent);
        	});
    	});
    	searchByExp();
    });
    
    
    $("#searchBox").keyup(function() {
    	searchTable($(this).val());
    });
    
   	function searchTable(inputVal) {
		var table = $("#resultTable");
		table.find("tr").each(function(index, row) {
			var empidCells = $(row).find("#empid");
			if(empidCells.length > 0) {
				var found = false;
				empidCells.each(function(index, td) {
					var regExp = new RegExp(inputVal, "i");
					if(regExp.test($(td).text())) {
						found = true;
						return false;
					}
				});
				if(found == true)
					$(row).show();
				else 
					$(row).hide();
			}
		});
	}
   	
	 function searchByExp() {  	
		$("#filter").change(function() {
		    var expReq = $(this).val();
		    $("#resultTable").find("tr").each(function(index,row) {
		    	var empCells = $(row).find("#exp");
		    	if(empCells.length > 0) {
		    		var flag = false;
		    		if(expReq == "new") {
		    			empCells.each(function(index,col) {
		    				if($(col).text() >= 0 && $(col).text() <= 1) {
		    					flag = true;
		    					return false;
		    				}
			    			
			    		});
		    		}
		    		else if(expReq == "semi") {
		    			empCells.each(function(index,col) {
		    				if($(col).text() > 1 && $(col).text() <= 5) {
		    					flag = true;
		    					return false;
		    				}
			    			
			    		});
		    		}
		    		else if(expReq == "pro") {
		    			empCells.each(function(index,col) {
		    				if($(col).text() > 5 ) {
		    					flag = true;
		    					return false;
		    				}
			    			
			    		});
		    		}
		    		if(flag == true)
						$(row).show();
					else 
						$(row).hide();
		    	}
		    });
	
		});
	 }	
    
});

