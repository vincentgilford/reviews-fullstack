const xhr = new XMLHttpRequest();
document.addEventListener("DOMContentLoaded", function() {
	removeCollection = document.querySelectorAll('.removeButton'); //receiving htmlcollection
	removeTagArray = Array.from(removeCollection);//converting
	removeTagArray.addEventListener('click', removeTag); 
});


removeTag = (event) => {
	buttonRemove = event.target; //will reference where to actually remove DOM element
	tagId = document.querySelector('.removeButton');


	xhr.onreadystatechange = function () {
		if (this.readyState == 4 && this.status == 200){
			const res = JSON.parse(xhr.response);
			console.log(tagId.id); 


		}
	}
	


xhr.open('POSt', './review/{animeTitle}/{id}/delete-tag', true);
//animeTitle and id let names will go into url open parameter
xhr.send();
}