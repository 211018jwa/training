# Web Browser
- A web browser is a software application that can do 3 things
    - Render HTML/CSS
    - Execute JavaScript code
    - Send HTTP Requests / Receive HTTP Responses
- The primary way humans interact with the internet and make HTTP requests
- Designed to be human friendly

# HTML
- Stands for Hyper Text Markup Language
- Is **NOT** a programming language
- Used to define the structure and content of a web page
- Written using **elements (tags)**
    - Require opening tags `<...>` and closing tags `</...>`
    - Elements can be nested inside each other
    - Elements can have **attributes**
        - Some attributes are specific to certain element types, but id and class are universal
        - `id`: used to identify a single element. The value of id should be UNIQUE to a single element
        - `class`: used to identify elements. Multiple elements can share the same value for class
        - `name`
        - `src`
        - `target`
        - `action`
        - `method`

```html
<h1>Hi I am the largest heading</h1>
<p>I am a <b>paragraph</b></p>

<img src="./an-image.png" /> <!-- Self closing tag -->
```

# HTML v. CSS v. JavaScript
- HTML: Provides the content and structure of a webpage
- CSS: Provides styling to the HTML
- JS: Provides dynamic behavior to a webpage

HTML is the noun, CSS is the adjective, and JS is the verb