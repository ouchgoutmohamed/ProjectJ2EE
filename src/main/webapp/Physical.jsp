<%-- 
    Document   : Physical
    Created on : 16 mai 2024, 15:52:37
    Author     : univers
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.mibosante.models.Login" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>PHYSICAL ACTIVITY</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="DEsign/img/favicon.png" rel="icon">
  <link href="DEsign/img/apple-touch-icon.png" rel="apple-touch-icon">
  
      <!-- Icons font CSS-->
    <link href="DEsign/vendo/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="DEsign/vendo/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="DEsign/vendo/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="DEsign/vendo/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="DEsign/css/main.css" rel="stylesheet" media="all">

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
  <link href="DEsign/css/stylex.css" rel="stylesheet">
  <link href="DEsign/css/Monstyle.css" rel="stylesheet">
  
  <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<link rel="stylesheet" href="DEsign/css/style_.css">

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
        <h1 class="text-light"><a ><%= Login.currentUserName %></a></h1>
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
          <li><a href="#" class="nav-link scrollto"><i class="bx bx-server"></i> <span>XML Configuration</span></a></li>
          <li><a href="./indexHome.jsp" class="nav-link scrollto"><i class="bx bx-user"></i> <span>Logout</span></a></li>
        </ul>
      </nav><!-- .nav-menu -->
    </div>
  </header><!-- End Header -->

  <main id="main">

    <!-- ======= Breadcrumbs ======= -->
    <section class="breadcrumbs">
      <div class="container">
        <div class="d-flex justify-content-between align-items-center">
          <h2>Physical Activity</h2>
          <ol>
            <li><a href="./Home.jsp">Home</a></li>
            <li>Physical Activity</li>
          </ol>
        </div>

      </div>
    </section><!-- End Breadcrumbs -->
            <section class="inner-page">
            <div class="container">
              <div class="container">

        <div class="wrapper wrapper--w680">
            <div class="card card-4">
                <div class="card-body">
                    <h2 class="title">Physical Activity Log</h2>
                    <form method="POST">
                        <div class="row row-space">
                            <div class="input-group">
                                
                            <div class="rs-select2 js-select-simple select--no-search">
                                <select name="subject">
                                    <option disabled="disabled" selected="selected">Type of activity</option>
                                    <option>Running</option>
                                    <option>Walking</option>
                                    <option>Cycling</option>
                                    <option>Swimming</option>
                                    <option>Strength Training</option>
                                </select>
                                <div class="select-dropdown"></div>
                            </div>
                        </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-6">
                                <div class="input-group">
                                    <label class="label">Date</label>
                                    <div class="input-group-icon">
                                        <input class="input--style-4 js-datepicker" type="text" name="date">
                                        <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                                    </div>
                                </div>
                            </div>
                            
                        </div>
                        <div class="row row-space">
                            <div class="col-6">
                                <div class="input-group">
                                    <label class="label">Description</label>
                                    <input class="input--style-4" type="text" name="description">
                                </div>
                            </div>
                        </div>
                        <div class="p-t-15">
                            <button class="btn btn-primary" type="submit">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
                  
                  
          <section class="ftco-section">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h4 class="text-center mb-4">Your activity log</h4>
					<div class="table-wrap">
						<table class="table">
					    <thead class="thead-primary">
					      <tr>
					        
					        <th style="color: #0069d9">Type</th>
					        <th style="color: #0069d9">Date</th>
					        <th style="color: #0069d9">Description</th>
					        
					        <th style="color: #0069d9">Action</th>
					      </tr>
					    </thead>
					    <tbody>
					      <tr>
					        
					        <td class="border-bottom-0">1 Year</td>
					        <td class="border-bottom-0">$45.00</td>
					        <td class="border-bottom-0">$5.00</td>
					        
					        <td class="border-bottom-0"><button class="btn btn-primary" type="submit">delete</button></td>
					      </tr>
					    </tbody>
					  </table>
					</div>
				</div>
			</div>
		</div>
	</section>                            
                 
    </div>
                
              

                  
    </div>
      </div>
    </section>

  </main><!-- End #main -->
  

</div>


<!-- jQuery and Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<!-- Custom JS -->
  <!-- ======= Footer ======= -->
  <footer id="footer">
    <div class="container">
      <div class="copyright">
        &copy; Copyright <strong><span>Mibo Sante Team</span></strong>
      </div>
      <div class="credits">
        <!-- All the links in the footer should remain intact. -->
        <!-- You can delete the links only if you purchased the pro version. -->
        <!-- Licensing information: https://bootstrapmade.com/license/ -->
        <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/iportfolio-bootstrap-portfolio-websites-template/ -->
        Designed by <a href="https://bootstrapmade.com/">Mibo Sante Team</a>
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

     
        <!-- Jquery JS-->
    <script src="DEsign/vendo/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="DEsign/vendo/select2/select2.min.js"></script>
    <script src="DEsign/vendo/datepicker/moment.min.js"></script>
    <script src="DEsign/vendo/datepicker/daterangepicker.js"></script>
       <!-- Main JS-->
    <script src="DEsign/js/global.js"></script>
    <!-- Main JS-->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


  <script src="DEsign/js/jquery.min_.js"></script>
  <script src="DEsign/js/popper_.js"></script>
  <script src="DEsign/js/bootstrap.min_.js"></script>
  <script src="DEsign/js/main_.js"></script>
</body>

</html>
