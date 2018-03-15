const xhr = new XMLHttpRequest()

xhr.onreadystatechange = function() {
	if(xhr.readyState===4 && xhr.status===200) {
		const res= JSON.parse(xhr.response);
		
		if (res.length) {
			res.forEach(function(state) {
				appendOneElementToBody(state)
			})
		} else {
			appendOneElementToBody(res)
		}
		function appendOneElementToBody(res) {
			const body = document.body
			
			const stateContainer = document.createElement('div')
			stateContainer.classList.add('stateContainer')
			
			appendElement(stateContainer, createElement('h2', res.name))
			appendElement(stateContainer, createElement('h3', res.abb))
			appendElement(stateContainer, createElement('p', res.motto))
			appendElement(stateContainer, createElement('p', res.fish))
			
			appendElement(body, courseContainer)
		}
		
		function createElement(elem, textValue) {
			const newElem = document.createElement(elem)
			newElem.innerText = textValue
			return newElem
		}
		
		function appendElement(parent, child) {
			parent.appendChild(child)
		}
		
		function showAllPropsInObject() {
			for (prop in res) {
				console.log(`${prop}: ${res[prop]}`)
			}
		}
		showAllPropsInObject();
		console.log(res)
		
		
	}
}

xhr.open('GET', 'http://localhost:8080/states', true)
xhr.send()