// fetch('https://javascript.info/article/promise-chaining/user.json')
//   // .then below runs when the remote server responds
//   .then(function(response) {
//     // response.text() returns a new promise that resolves with the full response text
//     // when it loads
//     return response.text();
//   })
//   .then(function(text) {
//     // ...and here's the content of the remote file
//     alert(text); // {"name": "iliakan", "isAdmin": true}
// });

// fetch('https://javascript.info/article/promise-chaining/user.json')
//   // .then below runs when the remote server responds
//   .then(response => response.json())
//   .then(user => alert(user.name + "\n" + user.isAdmin));

// Make a request for user.json
// fetch('https://raw.githubusercontent.com/garzarobm/TTS-Febraury6/master/week9/lectureDay2/user2.json')
//   // Load it as json
//   .then(response => response.json())
//   // Make a request to GitHub
//   .then(user => fetch(`https://api.github.com/users/zoe6298`))
//   // Load the response as json
//   .then(response => response.json())
//   // Show the avatar image (githubUser.avatar_url) for 3 seconds (maybe animate it)
//   .then(githubUser => {
//     let img = document.createElement('img');
//     img.src = githubUser.avatar_url;
//     img.className = "promise-avatar-example";
//     document.body.append(img);
// });

// async function showAvatar() {

//     // read our JSON
//     let response = await fetch('https://javascript.info/article/promise-chaining/user.json');
//     let user = await response.json();
  
//     // read github user
//     let githubResponse = await fetch(`https://api.github.com/users/${user.name}`);
//     let githubUser = await githubResponse.json();
  
//     // show the avatar
//     let img = document.createElement('img');
//     img.src = githubUser.avatar_url;
//     img.className = "promise-avatar-example";
//     document.body.append(img);
//   }
  
  //showAvatar();


// function loadJson(url) {
//   return fetch(url)
//     .then(response => {
//       if (response.status == 200) {
//         return response.json();
//       } else {
//         //console.log(response.status)
//         throw new Error(response.status);
//       }
//     });
// }

// loadJson('https://raw.githubusercontent.com/garzarobm/TTS-Febraury6/master/week9/lectureDay2/user2.json')
//   .catch(alert); // Error: 500

  //console.log(response.text());
//   async function loadJson(url) { // (1)
//     let response = await fetch(url); // (2)
  
//     if (response.status == 200) {
//       let json = await response.json(); // (3)
//       return json;
//     }
  
//     throw new Error(response.status);
//   }
  
//   loadJson('https://raw.githubusercontent.com/garzarobm/TTS-Febraury6/master/week9/lectureDay2/user2.json').then()
//     .catch(alert); // Error: 500 (4)


// console.log(text);

// async function wait() {
//     await new Promise(resolve => setTimeout(resolve, 1000));
  
//     return 10;
//   }
  
//   function f() {
//     // shows 10 after 1 second
//     wait().then(result => alert(result));
//   }
  
//   f();

  async function loadJson(url) { // (1)
    let response = await fetch(url); // (2)
  
    if (response.status == 200) {
      let json = await response.json(); // (3)
      return json;
    }
  
    throw new Error(response.status);
  }

  function g() {
    // shows 10 after 1 second
    wait().then(result => alert(result));
  }
  
  loadJson('https://raw.githubusercontent.com/garzarobm/TTS-Febraury6/master/week9/lectureDay2/user2.json')
    .then(json_file_response => alert(json_file_response.name)); // Error: 500 (4)