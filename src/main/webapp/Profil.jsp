<%@ page import="com.mibosante.DAO.LoginDAO" %><%--
    Document   : Profil
    Created on : 15 mai 2024, 11:08:16
    Author     : univers
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>PROFIL</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="DEsign/img/favicon.png" rel="icon">
  <link href="DEsign/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="DEsign/vendor/aos/aos.css" rel="stylesheet">
  <link href="DEsign/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="DEsign/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="DEsign/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="DEsign/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="DEsign/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="DEsign/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: iPortfolio
  * Template URL: https://bootstrapmade.com/iportfolio-bootstrap-portfolio-websites-template/
  * Updated: Mar 17 2024 with Bootstrap v5.3.3
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>

  <!-- ======= Mobile nav toggle button ======= -->
  <i class="bi bi-list mobile-nav-toggle d-xl-none"></i>

  <!-- ======= Header ======= -->
  <header id="header">
    <div class="d-flex flex-column">

      <div class="profile">
        <img src="DEsign/img/user.jpg" alt="" class="img-fluid rounded-circle">
        <h1 class="text-light"><a href="index.html"><%= LoginDAO.currentUserName %></a></h1>
        <div class="social-links mt-3 text-center">
          <a href="#" class="twitter"><i class="bx bxl-twitter"></i></a>
          <a href="#" class="facebook"><i class="bx bxl-facebook"></i></a>
          <a href="#" class="instagram"><i class="bx bxl-instagram"></i></a>
          <a href="#" class="google-plus"><i class="bx bxl-skype"></i></a>
          <a href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
        </div>
      </div>

      <nav id="navbar" class="nav-menu navbar">
        <ul>
          <li><a href="./Home.jsp" class="nav-link scrollto active"><i class="bx bx-home"></i> <span>Home</span></a></li>
          <li><a href="./SleepPage.jsp" class="nav-link scrollto"><i class="bx bx-user"></i> <span>Sleep</span></a></li>
          <li><a href="./Physical.jsp" class="nav-link scrollto"><i class="bx bx-file-blank"></i> <span>Physical Activity</span></a></li>
          <li><a href="./Profil.jsp" class="nav-link scrollto"><i class="bx bx-envelope"></i> <span>Profil</span></a></li>
          <li><a href="./XmlConfig.jsp" class="nav-link scrollto"><i class="bx bx-server"></i> <span>XML Configuration</span></a></li>
          <li><a href="./indexHome.jsp" class="nav-link scrollto"><i class="bx bx-user"></i> <span>Logout</span></a></li>
        </ul>
      </nav><!-- .nav-menu -->
    </div>
  </header><!-- End Header -->

  <main id="main">

    <!-- ======= Breadcrumbs ======= -->
    <section id="breadcrumbs" class="breadcrumbs">
      <div class="container">

        <div class="d-flex justify-content-between align-items-center">
          <h2>My Profil</h2>
          <ol>
            <li><a href="Home.jsp">Home</a></li>
            <li>My Profil</li>
          </ol>
        </div>

      </div>
    </section><!-- End Breadcrumbs -->

    <!-- ======= Portfolio Details Section ======= -->
    <section id="portfolio-details" class="portfolio-details">
      <div class="container">

        <div class="row gy-4">


          <div class="col-lg-8" id="infos">
              <h2>My Informations</h2>
              <br><form action="update-user-servlet" method="post" enctype="multipart/form-data">
              <!-- Hidden field to indicate update action -->
              <input type="hidden" name="update" value="true">

              <div class="input-group mb-3">
                  <span class="input-group-text" id="basic-addon1"><i class="bx bx-user"></i></span>
                  <input type="text" class="form-control" name="name" placeholder="New Username" aria-label="Username" aria-describedby="basic-addon1">
              </div>
              <div class="input-group mb-3">
                  <span class="input-group-text" id="basic-addon1"><i class="bx bx-envelope"></i></span>
                  <input type="email" class="form-control" name="email" placeholder="New Email" aria-label="Email" aria-describedby="basic-addon1">
              </div>
              <div class="input-group mb-3">
                  <span class="input-group-text" id="basic-addon1"><i class="bx bx-lock"></i></span>
                  <input type="password" class="form-control" name="password" placeholder="New Password" aria-label="Password" aria-describedby="basic-addon1">
              </div>
              <div id="Btn_Prfl2">
                  <button type="submit" class="btn btn-info">Save</button>
              </div>
          </form>
          </div>
          <div class="col-lg-4">
            <div class="portfolio-info">
             <h3> <i class="bx bx-book-content"></i> Account Details</h3>
              <ul>
                <li><strong>N° User</strong>: 05</li>
                <li><strong>Category</strong>: Health App</li>
                <li><strong>Created at</strong>: 11 Mai, 2024</li>
                <li><strong>Last Update</strong>: Mai, 2024</li>
              </ul>
            </div>
              <!--
            <div class="portfolio-description">
              <h2>This is an example of portfolio detail</h2>
              <p>
                Autem ipsum nam porro corporis rerum. Quis eos dolorem eos itaque inventore commodi labore quia quia. Exercitationem repudiandae officiis neque suscipit non officia eaque itaque enim. Voluptatem officia accusantium nesciunt est omnis tempora consectetur dignissimos. Sequi nulla at esse enim cum deserunt eius.
              </p>
            </div> -->
          </div>

        </div>

      </div>
    </section><!-- End Portfolio Details Section -->

  </main><!-- End #main -->

  <!-- ======= Footer ======= -->
  <footer id="footer">
    <div class="container">
      <div class="copyright">
        &copy; Copyright <strong><span>MiboSanté</span></strong>
      </div>
      <div class="credits">
        <!-- All the links in the footer should remain intact. -->
        <!-- You can delete the links only if you purchased the pro version. -->
        <!-- Licensing information: https://bootstrapmade.com/license/ -->
        <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/iportfolio-bootstrap-portfolio-websites-template/ -->
        DEsign/ed by <a href="https://bootstrapmade.com/">MiboSanté</a>
      </div>
    </div>
  </footer><!-- End  Footer -->

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="DEsign/vendor/purecounter/purecounter_vanilla.js"></script>
  <script src="DEsign/vendor/aos/aos.js"></script>
  <script src="DEsign/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="DEsign/vendor/glightbox/js/glightbox.min.js"></script>
  <script src="DEsign/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="DEsign/vendor/swiper/swiper-bundle.min.js"></script>
  <script src="DEsign/vendor/typed.js/typed.umd.js"></script>
  <script src="DEsign/vendor/waypoints/noframework.waypoints.js"></script>
  <script src="DEsign/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="DEsign/js/main.js"></script>

</body>

</html>