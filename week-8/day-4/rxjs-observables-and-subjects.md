# RxJS Observables and Subjects
## Observables
Observables are from the RxJS library, which the developers of Angular decided to utilize within the Angular framework. Therefore this preference of the Angular developers is what led to the fact that we deal with Observables instead of Promises when it comes to utilizing HttpClient (unlike with fetch).

- Similar to Promises, observables require a callback function for the data to be passed into once the data is made available (when the promise/observable has "published" some data)
    - The main difference is that Observables can technically have multiple values "published" over time, unlike a Promise which can only "publish" a single value
- You can have multiple subscribers to an Observable, but only a single subscriber to a Promise
- Observables can be cancelled, while Promises cannot
- Overall, however, promises and observables are pretty similar
    - You can actually convert from an observable to a Promise
    - But this should only be done if you only expect the Observable to have a single value (such as when you utilize HttpClient)
        - Because HTTP requests send a single request and have a single response

## Subjects
- Subjects follow the pattern of pub-sub (publisher - subscriber)
- There can be multiple subscribers
- You can publish information from many different sources to that Subject
- Any subscriber to the subject will then receive that information
    - An analogy would be like a weather channel that publishes weather updates from many different "weather reporters" to all viewers/listeners

The difference between a subject and observable is that you can have a high level of control over publishing new information for a subject. Observables are more "pre-planned" (kind of like Promises).