<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <jsp:include page="../../WEB-INF/templates/metadata.jsp"/>
    <title>Supervisor</title>
</head>

<body>

<!-- wrapper -->
<div class="container py-3">
    <!-- header -->
    <header>
        <div class="d-flex flex-column flex-md-row align-items-center pb-3 mb-4 border-bottom">
            <!-- header options -->
            <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                <li><a href="#" class="nav-link px-4 link-secondary">Overview</a></li>
            </ul>
            <!-- drop profile menu -->
            <div class="dropdown text-end">
                <a href="#" class="d-block link-dark text-decoration-none dropdown-toggle" data-bs-toggle="dropdown"
                   aria-expanded="false">
                    <img src="${pageContext.request.contextPath}/assets/img/img3.png" alt="supervisor" width="32"
                         height="32"
                         class="rounded-circle">
                </a>
                <!-- drop profile menu items -->
                <ul class="dropdown-menu text-small">
                    <li><a class="dropdown-item" href="#">Ajustes</a></li>
                    <li><a class="dropdown-item" href="#">Perfil</a></li>
                    <li>
                        <hr class="dropdown-divider">
                    </li>
                    <li><a class="dropdown-item" href="#">Cerrar sesión</a></li>
                </ul>
            </div>
        </div>
    </header>

    <!-- main -->
    <main>
        <!-- //TODO: show supervised stores order information  -->
    </main>
</div>
<!-- bootstrap js -->
<script src="${pageContext.request.contextPath}/bootstrap-5.3.0/js/bootstrap.bundle.min.js"></script>
</body>

</html>
