const loginBtn = document.getElementById('loginBtn');
    const logoutBtn = document.getElementById('logoutBtn');
    const statusMsg = document.getElementById('statusMsg');

    loginBtn.addEventListener('click', () => {
      const userId = document.getElementById('userId').value;
      const password = document.getElementById('password').value;

      if (userId && password) {
        localStorage.setItem('userId', userId);
        statusMsg.textContent = `Logged in as ${userId}`;
        statusMsg.style.color = 'green';
      } else {
        statusMsg.textContent = 'Please enter both User ID and Password';
        statusMsg.style.color = 'red';
      }
    });

    logoutBtn.addEventListener('click', () => {
      localStorage.removeItem('userId');
      statusMsg.textContent = 'Logged out';
      statusMsg.style.color = 'blue';
    });

    // Show login status on page load
    window.addEventListener('load', () => {
      const storedUser = localStorage.getItem('userId');
      if (storedUser) {
        statusMsg.textContent = ` Logged in as ${storedUser}`;
        statusMsg.style.color = 'green';
      }
    });
