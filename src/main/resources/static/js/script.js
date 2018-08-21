
function validateInfo() {

	var fname = document.getElementById("firstname").value;
	var lname = document.getElementById("lastname").value;
	
	

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