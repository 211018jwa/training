window.addEventListener('load', async () => {
    let res = await fetch('https://localhost:8080/loginstatus', {
        credentials: 'include',
        method: 'GET'
    });

    let data = await res.json();

    console.log(data);

    document.querySelector('#json-user-output').innerHTML = JSON.stringify(data);
});

document.querySelector('#logout-btn').addEventListener('click', async () => {

    let res = await fetch('https://localhost:8080/logout', {
        credentials: 'include',
        method: 'POST'
    });

    if (res.status == 200) {
        window.location.href = '/index.html';
    }

});