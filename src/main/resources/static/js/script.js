
function validateInfo() {

	var id = document.getElementById("firstname").value;
	var contName = document.getElementById("lastname").value;
	
	

	if (fname.length <= 2) {
		alert("please enter a longer firstname!");
		document.getElementById("firstname").focus(); 
		return false;
	} else if (lName.length <= 2) {
		alert("please enter a longer lastname!");
		document.getElementById("lastname").focus(); 
		return false;
	} 
}