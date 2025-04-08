document.getElementById('submitBtn').addEventListener('click', function() {
    const name = document.getElementById('name').value;
    const address = document.getElementById('address').value;
    const contact = document.getElementById('contact').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
  
    // Print data to browser console
    console.log('User Profile:');
    console.log('Name:', name);
    console.log('Address:', address);
    console.log('Contact:', contact);
    console.log('Email:', email);
    console.log('Password:', password);
  });
  