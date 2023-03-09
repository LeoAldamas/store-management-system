<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <jsp:include page="WEB-INF/templates/metadata.jsp"/>
    <!-- css -->
    <link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet">
    <title>Store Management</title>
</head>

<body>

<!-- header -->
<header class="fixed-top bg-light p-2 mb-2 border-bottom">
    <div class="container">
        <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
            <!-- icon -->
            <a href="${pageContext.request.contextPath}/"
               class="d-flex align-items-center mb-2 mb-lg-0 text-dark text-decoration-none">
                <img class="me-4" src="${pageContext.request.contextPath}/assets/img/img1.png" alt="store management"
                     height="60" width="60">
                <span class="fs-4">Gestión de Tiendas Niko Niko Code</span>
            </a>
        </div>
    </div>
</header>

<!-- main -->
<main class="form-login w-100 m-auto">
    <!-- log in -->
    <form method="POST" action="${pageContext.request.contextPath}/login">
        <h1 class="h1 mb-3 fw-normal text-center">Por favor, inicie sesión</h1>
        <!-- input username -->
        <div class="form-floating">
            <input id="username" type="text" name="username" class="form-control" placeholder="" required>
            <label for="username">Usuario</label>
        </div>
        <!-- input password -->
        <div class="form-floating">
            <input id="password" type="password" name="password" class="form-control" placeholder="" required>
            <label for="password">Contraseña</label>
        </div>
        <div class="mb-3">
            <label>
                <select class="form-select text-uppercase" name="type_user" required>
                    <option value="ADMIN">Administrador</option>
                    <option value="STORE">Dependiente</option>
                    <option value="SUPERVISOR">Supervisor</option>
                    <option value="WAREHOUSE">Bodega</option>
                </select>
            </label>
        </div>
        <!-- submit -->
        <button class="w-100 btn btn-lg btn-primary" type="submit">Iniciar sesión</button>
    </form>
</main>

<!-- footer -->
<footer class="fixed-bottom bg-dark text-lg-start border-top">
    <div class="text-center text-white p-4">
        &copy 2023 Copyright
    </div>
</footer>
<!-- bootstrap js -->
<script src="${pageContext.request.contextPath}/bootstrap-5.3.0/js/bootstrap.bundle.min.js"></script>
</body>

</html>