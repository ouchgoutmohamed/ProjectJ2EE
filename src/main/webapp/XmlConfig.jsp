<%-- 
    Document   : XmlConfig
    Created on : 17 mai 2024, 01:24:24
    Author     : Meriam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <title>XML CONFIGURATION</title>
  <meta content="" name="description">
  <meta content="" name="keywords">
  <link href="DEsign/img/favicon.png" rel="icon">
  <link href="DEsign/img/apple-touch-icon.png" rel="apple-touch-icon">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
  <link href="DEsign/vendor/aos/aos.css" rel="stylesheet">
  <link href="DEsign/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="DEsign/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="DEsign/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="DEsign/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="DEsign/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
  <link href="DEsign/css/style.css" rel="stylesheet">
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">


</head>
<body>

  <i class="bi bi-list mobile-nav-toggle d-xl-none"></i>

  <header id="header">
    <div class="d-flex flex-column">
      <div class="profile">
          <img src="DEsign/img/user.png" alt="" class="img-fluid rounded-circle">
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
          <li><a href="./View/Home.jsp" class="nav-link scrollto active"><i class="bx bx-home"></i> <span>Home</span></a></li>
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
    <section class="breadcrumbs">
      <div class="container">
        <div class="d-flex justify-content-between align-items-center">
          <h2>XML CONFIGURATION</h2>
          <ol>
            <li><a href="index.html">Home</a></li>
            <li>Developer / XML Configuration</li>
          </ol>
        </div>
      </div>
    </section>

     <section class="inner-page">
  <div class="container">
      <h2 style="text-align: center" class="mb-5">-- IMPORTING AND EXPORTING DATA USING XML IN JAVA --</h2>        
        <div class="card" style="max-width: 870px;"  id="box">
    <div class="row g-0">
        <div class="col-sm-5">
            <img src="DEsign/img/imageXML.png" class="card-img-top h-20" alt="XML Content" style="max-height: 200px; max-width: 70%;">
        </div>
        <div class="col-sm-7"">
            <div class="card-body">
                  <!-- Import to XML -Users -->
    <form action="FileUsersServlet" method="post" enctype="multipart/form-data">
      <div class="mb-3">
        <label for="file" class="form-label"><i class="bi bi-filetype-xml"></i> Select XML file to import / Users data :</label>
        <input type="file" name="file" id="file" class="form-control" style="width: 90%">
      </div>
        <div class="inLine"> 
      <button type="submit" class="btn btn-success" id="import"><i class="bi bi-cloud-download"></i> Import</button>
    </form>
    
    <!-- Export Users -->
    <form action="ServletExportData" method="get">
      <button type="submit" class="btn btn-secondary mt-3" id="export"><i class="bi bi-cloud-upload"></i> Export to XML</button>
    </form>
    </div>
            </div>
        </div>
    </div>
</div>
      
              <div class="card" style="max-width: 870px;"  id="box2">
    <div class="row g-0">
        <div class="col-sm-5">
            <img src="DEsign/img/imageXML.png" class="card-img-top h-20" alt="XML Content" style="max-height: 210px; max-width: 70%;">
        </div>
        <div class="col-sm-7"">
            <div class="card-body">
             <!-- Import to XML -Physical activity -->    
    <form action="FileActivityServlet" method="post" enctype="multipart/form-data">
        <div class="mb-3" style="margin-top: 5%">
        <label for="file" class="form-label"><i class="bi bi-filetype-xml"></i> Select XML file to import / Physical activity data :</label>
        <input type="file" name="file" id="file" class="form-control" style="width: 90%"">
      </div>
        <div class="inLine"> 
      <button type="submit" class="btn btn-success" id="import"><i class="bi bi-cloud-download"></i> Import</button>
    </form>
    
    <!-- Export Physical activity -->
    <form action="ServletExportActivity" method="get">
      <button type="submit" class="btn btn-secondary mt-3" id="export"><i class="bi bi-cloud-upload"></i> Export to XML</button>
    </form>
    </div>
            </div>
        </div>
    </div>
</div>
   
               <div class="card" style="max-width: 870px;"  id="box3">
    <div class="row g-0">
        <div class="col-sm-5">
            <img src="DEsign/img/imageXML.png" class="card-img-top h-20" alt="XML Content" style="max-height: 210px; max-width: 70%;">
        </div>
        <div class="col-sm-7"">
            <div class="card-body">
        <!-- Import to XML -User Profil -->
    <form action="FIleProfilServlet" method="post" enctype="multipart/form-data">
        <div class="mb-3" style="margin-top: 5%">
        <label for="file" class="form-label"><i class="bi bi-filetype-xml"></i> Select XML file to import / User Profil data :</label>
        <input type="file" name="file" id="file" class="form-control" style="width: 90%">
      </div>
        <div class="inLine"> 
      <button type="submit" class="btn btn-success" id="import"><i class="bi bi-cloud-download"></i> Import</button>
    </form>
    
    <!-- Export User Profil -->
    <form action="ServletExportProfil" method="get">
      <button type="submit" class="btn btn-secondary mt-3" id="export"><i class="bi bi-cloud-upload"></i> Export to XML</button>
    </form>
    </div>
            </div>
        </div>
    </div>
</div> 
    <div id="xmlContent"></div>
  </div>
</section>


  </main>

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
        Designed by <a href="https://bootstrapmade.com/">MiboSanté Team</a>
      </div>
    </div>
  </footer><!-- End  Footer -->
   <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <script src="DEsign/vendor/purecounter/purecounter_vanilla.js"></script>
  <script src="DEsign/vendor/aos/aos.js"></script>
  <script src="DEsign/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="DEsign/vendor/glightbox/js/glightbox.min.js"></script>
  <script src="DEsign/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="DEsign/vendor/swiper/swiper-bundle.min.js"></script>
  <script src="DEsign/vendor/typed.js/typed.umd.js"></script>
  <script src="DEsign/vendor/waypoints/noframework.waypoints.js"></script>
  <script src="DEsign/vendor/php-email-form/validate.js"></script>
  <script src="DEsign/js/main.js"></script>

</body>
</html>
