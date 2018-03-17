const xhr = new XMLHttpRequest();
const method = 'POST'
xhr.onreadystatechange = function () {
	if (this.readyState == 4 && this.status == 200)
		const res = JSON.parse(xhr.response);


}
xhttp.open("GET", "../reviewView.html", true);
xhttp.send();