<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <jsp:include page="../../WEB-INF/templates/metadata.jsp"/>
    <title>Administrator</title>
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
                <li><a href="#" class="nav-link px-3 link-dark">Dependientes</a></li>
                <li><a href="#" class="nav-link px-3 link-dark">Bodegueros</a></li>
                <li><a href="#" class="nav-link px-3 link-dark">Supervisores</a></li>
                <li><a href="#" class="nav-link px-3 link-dark">Devoluciones</a></li>
            </ul>
            <!-- drop profile menu -->
            <div class="dropdown text-end">
                <a href="#" class="d-block link-dark text-decoration-none dropdown-toggle" data-bs-toggle="dropdown"
                   aria-expanded="false">
                    <img src="${pageContext.request.contextPath}/assets/img/img2.png" alt="administrator" width="32"
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
        <!-- first row card container -->
        <div class="row row-cols-1 row-cols-md-3 mb-3 text-center">
            <!-- card report -->
            <div class="col">
                <div class="card mb-4 rounded-3 shadow-sm">
                    <div class="card-header py-3">
                        <h4 class="my-0 fw-normal">Reporte</h4>
                    </div>
                    <div class="card-body">
                        <h3 class="card-title">Tiendas con más pedidos realizados en un intervalo de tiempo</h3>
                        <a href="#" class="w-100 btn btn-lg btn-outline-primary">Ver reporte</a>
                    </div>
                </div>
            </div>
            <!-- card report -->
            <div class="col">
                <div class="card mb-4 rounded-3 shadow-sm">
                    <div class="card-header py-3">
                        <h4 class="my-0 fw-normal">Reporte</h4>
                    </div>
                    <div class="card-body">
                        <h3 class="card-title">Usuarios con más envíos generados en un intervalo de tiempo</h3>
                        <a href="#" class="w-100 btn btn-lg btn-outline-primary">Ver reporte</a>
                    </div>
                </div>
            </div>
            <!-- card report -->
            <div class="col">
                <div class="card mb-4 rounded-3 shadow-sm">
                    <div class="card-header py-3">
                        <h4 class="my-0 fw-normal">Reporte</h4>
                    </div>
                    <div class="card-body">
                        <h3 class="card-title">Usuarios con más pedidos generados en un intervalo de tiempo</h3>
                        <a href="#" class="w-100 btn btn-lg btn-outline-primary">Ver reporte</a>
                    </div>
                </div>
            </div>
        </div>
        <!-- second row card container -->
        <div class="row row-cols-1 row-cols-md-2 mb-3 text-center">
            <!-- card report -->
            <div class="col">
                <div class="card mb-4 rounded-3 shadow-sm">
                    <div class="card-header py-3">
                        <h4 class="my-0 fw-normal">Reporte</h4>
                    </div>
                    <div class="card-body">
                        <h3 class="card-title">Productos más solicitados en un intervalo de tiempo</h3>
                        <a href="#" class="w-100 btn btn-lg btn-outline-primary">Ver reporte</a>
                    </div>
                </div>
            </div>
            <!-- card report -->
            <div class="col">
                <div class="card mb-4 rounded-3 shadow-sm">
                    <div class="card-header py-3">
                        <h4 class="my-0 fw-normal">Reporte</h4>
                    </div>
                    <div class="card-body">
                        <h3 class="card-title">Productos dañados por tienda en un intervalo de tiempo</h3>
                        <a href="#" class="w-100 btn btn-lg btn-outline-primary">Ver reporte</a>
                    </div>
                </div>
            </div>
        </div>
    </main>
</div>
<!-- bootstrap js -->
<script src="${pageContext.request.contextPath}/bootstrap-5.3.0/js/bootstrap.bundle.min.js"></script>
</body>

</html>
