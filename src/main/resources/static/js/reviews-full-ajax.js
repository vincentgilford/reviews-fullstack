const xhr = new XMLHttpRequest();

xhr.onreadystatechange = function () {
	if (this.readyState == 4 && this.status == 200){}
		const res = JSON.parse(xhr.response);
		

	


	}	

}
xhttp.open('POSt', '../reviewView.html', true);
xhttp.send();