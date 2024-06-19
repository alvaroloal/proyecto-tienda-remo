function validateForm() {
    var nombre = document.getElementById('nombre').value;
    var apellidos = document.getElementById('apellidos').value;
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
    var email = document.getElementById('email').value;

    if (nombre.trim() === '') {
        alert('Por favor, ingresa un nombre válido.');
        return false;
    }

    if (apellidos.trim() === '') {
        alert('Por favor, ingresa los apellidos.');
        return false;
    }

    if (username.trim() === '') {
        alert('Por favor, ingresa un nombre de usuario.');
        return false;
    }

    if (password.trim() === '' || password.length < 6) {
        alert('La contraseña debe tener al menos 6 caracteres.');
        return false;
    }

    if (email.trim() === '' || !validateEmail(email)) {
        alert('Por favor, ingresa un correo electrónico válido.');
        return false;
    }

    return true;
}

function validateEmail(email) {
    var re = /\S+@\S+\.\S+/;
    return re.test(email);
}
