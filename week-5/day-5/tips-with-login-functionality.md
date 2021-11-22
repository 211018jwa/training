# Tips

1. When using fetch API in JavaScript for your frontend (HTML + CSS + JS)

```javascript
fetch('http://localhost:8080/someendpoint', {
    method: 'GET',
    credentials: 'include' // make sure to have the credentials: 'include' option
})
```

2. When hosting your frontend (on 127.0.0.1), make sure the URL in the browser is changed to localhost
- Ex. http://127.0.0.1:5500 will not retain cookies in the browser if you're sending requests to the backend w/ http://localhost:8080
- But, http://localhost:5500 will work fine with http://localhost:8080
- So, change the browser address from 127.0.0.1 to localhost

[Why this is the case](https://web.dev/samesite-cookies-explained/)
- Browser security feature
