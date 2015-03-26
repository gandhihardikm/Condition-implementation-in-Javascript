/**
 * 
 */

function checkStudentValid() {
	toUnselectItems("zone");
	toUnselectItems("hours");
	var studentId = prompt("Please Enter student Id","");
	var hasLibraryCard = prompt("Do you have a library card","");
	studentIdInt = parseInt(studentId);
	if(checkValidId(studentIdInt) && hasLibraryCard.toString().toLowerCase() == "yes") {
		alert("Appointment Slot is booked.");
	} else {
			alert("Sorry can't book appointment.");
	}
}

function toUnselectItems(string) {
	var anyVariable = document.getElementsByName(string);
	for (var j = 0; j < anyVariable.length; j++) {
		if (anyVariable[j].checked) {
			anyVariable[j].checked = false;
		}
	}
}

function checkValidId(number1){
	var decimalPlaces=0;
	for(var temp = number1; temp >= 1;)
	{
	    temp/=10;
	    decimalPlaces++;
	} 
	if(decimalPlaces == 8)
		return true;
	return false;
}