<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Formulario de usuario</title>
</head>
<body>
<h2>Ingresa tus datos</h2>
<form action="procesar" method="post">

    <label>Nombre:</label>
    <input type="text" name="nombre" required><br><br>

    <label>Edad:</label>

    <input type="number" name="edad" required><br><br>

    <input type="submit" value="Enviar">
</form>
</body>
</html>tml>