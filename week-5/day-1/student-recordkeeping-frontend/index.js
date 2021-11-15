let url = 'ec2-18-219-69-82.us-east-2.compute.amazonaws.com';
/* When the window object is loaded (load event), go ahead and fetch all of the data about students
and populate the student table */
window.addEventListener('load', getAndPopulateStudents);

async function getAndPopulateStudents() {
    let res = await fetch(`http://${url}:8080/students`);

    let studentsArray = await res.json();

    populateStudentTable(studentsArray);

}

function populateStudentTable(array) {
    let tbody = document.querySelector('.main-section .table-container tbody');
    tbody.innerHTML = '';
    /*
        we could iterate over the array using
        1. traditional for loop ( for (let i = 0; i < ...; i++) {} )
        2. for of: iterates over the actual elements (or values)
        3. for in: iterates over the indices of whatever you are iterating over (or keys)

    */

    for (let personObject of array) {
        let tr = document.createElement('tr');

        let td1 = document.createElement('td');
        td1.innerText = personObject.id;
        let td2 = document.createElement('td');
        td2.innerText = personObject.firstName;
        let td3 = document.createElement('td');
        td3.innerText = personObject.lastName;
        let td4 = document.createElement('td');
        td4.innerText = personObject.classification;
        let td5 = document.createElement('td');
        td5.innerText = personObject.age;

        tr.appendChild(td1);
        tr.appendChild(td2);
        tr.appendChild(td3);
        tr.appendChild(td4);
        tr.appendChild(td5);

        tbody.appendChild(tr);
    }

}


let studentSubmitButton = document.querySelector('#student-submit');
studentSubmitButton.addEventListener('click', async () => {

    let firstNameInputElement = document.querySelector('#first-name');
    let lastNameInputElement = document.querySelector('#last-name');
    let classificationDropdownElement = document.querySelector('#classification');
    let ageInputElement = document.querySelector('#age');
    
    let personObjectToAdd = {
        'firstName': firstNameInputElement.value,
        'lastName': lastNameInputElement.value,
        'classification': classificationDropdownElement.value,
        'age': ageInputElement.value
    };

    console.log(personObjectToAdd);

    let res = await fetch(`http://${url}:8080/students`, {
        method: 'POST',
        body: JSON.stringify(personObjectToAdd)
    });
    /* JSON.stringify(obj) takes an object and converts it into a JSON String */
    /* JSON.parse(string) takes a JSON string and turns it into a JavaScript object */

    getAndPopulateStudents();
});