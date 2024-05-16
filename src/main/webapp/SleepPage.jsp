<%-- 
    Document   : SleepPage
    Created on : 15 mai 2024, 15:49:26
    Author     : univers
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>SLEEP TRACKING</title>
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
  <link href="DEsign/css/Monstyle.css" rel="stylesheet">

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
        <img src="DEsign/img/profile-img.jpg" alt="" class="img-fluid rounded-circle">
        <h1 class="text-light"><a href="index.html">Alex Smith</a></h1>
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
          <li><a href="#hero" class="nav-link scrollto active"><i class="bx bx-home"></i> <span>Home</span></a></li>
          <li><a href="./SleepPage.jsp" class="nav-link scrollto"><i class="bx bx-user"></i> <span>Sleep</span></a></li>
          <li><a href="#resume" class="nav-link scrollto"><i class="bx bx-file-blank"></i> <span>Physical Activity</span></a></li>
          <li><a href="#portfolio" class="nav-link scrollto"><i class="bx bx-book-content"></i> <span>Hydratation</span></a></li>
          <li><a href="#about" class="nav-link scrollto"><i class="bx bx-envelope"></i> <span>Profil</span></a></li>
          <li><a href="#services" class="nav-link scrollto"><i class="bx bx-server"></i> <span>XML Configuration</span></a></li>
        </ul>
      </nav><!-- .nav-menu -->
    </div>
  </header><!-- End Header -->

  <main id="main">

    <!-- ======= Breadcrumbs ======= -->
    <section class="breadcrumbs">
      <div class="container">

        <div class="d-flex justify-content-between align-items-center">
          <h2>Sleep Tracking</h2>
          <ol>
            <li><a href="index.html">Home</a></li>
            <li>Sleep Tracking</li>
          </ol>
        </div>

      </div>
    </section><!-- End Breadcrumbs -->

    <section class="inner-page">
      <div class="container">
          <div class="container">
      <h2 class="mb-5">MY DATA</h2>

      <div class="table-responsive">

        <table class="table table-striped custom-table">
          <thead>
            <tr>
              <th scope="col">
                <label class="control control--checkbox">
                  <input type="checkbox"  class="js-check-all"/>
                  <div class="control__indicator"></div>
                </label>
              </th>
              <th scope="col">Order</th>
              <th scope="col">Name</th>
              <th scope="col">Occupation</th>
              <th scope="col">Contact</th>
              <th scope="col">Education</th>
              <th scope="col"></th>
            </tr>
          </thead>
          <tbody>
            <tr scope="row">
              <td>
                <label class="control control--checkbox">
                <input type="checkbox" />
                <div class="control__indicator"></div>
                </label>
              </td>
              <td>
              1392
              </td>
              <td class="pl-0">
                <div class="d-flex align-items-center">
                  <label class="custom-control ios-switch">
                  <input type="checkbox" class="ios-switch-control-input" checked="">
                  <span class="ios-switch-control-indicator"></span>
                  </label>

                  <a href="#">James Yates</a>
                </div>
              </td>
              <td>
                Web Designer
                <small class="d-block">Far far away, behind the word mountains</small>
              </td>
              <td>+63 983 0962 971</td>
              <td>NY University</td>
              <td><a href="#" class="more">Details</a></td>
            
            </tr>

            <tr>

              <td>
                <label class="control control--checkbox">
                <input type="checkbox" />
                <div class="control__indicator"></div>
                </label>
              </td>
              
              <td>4616</td>
              <td class="pl-0">
                <div class="d-flex align-items-center">
                  <label class="custom-control ios-switch">
                  <input type="checkbox" class="ios-switch-control-input" checked="">
                  <span class="ios-switch-control-indicator"></span>
                  </label>

                  <a href="#">Matthew Wasil</a>
                </div>

              </td>
              <td>
                Graphic Designer
                <small class="d-block">Far far away, behind the word mountains</small>
              </td>
              <td>+02 020 3994 929</td>
              <td>London College</td>
              <td><a href="#" class="more">Details</a></td>
            </tr>
            <tr>
              <td>
                <label class="control control--checkbox">
                <input type="checkbox" />
                <div class="control__indicator"></div>
                </label>
              </td>
              <td>9841</td>
              <td class="pl-0">
                <div class="d-flex align-items-center">
                  <label class="custom-control ios-switch">
                  <input type="checkbox" class="ios-switch-control-input">
                  <span class="ios-switch-control-indicator"></span>
                  </label>

                  <a href="#">Sampson Murphy</a>
                </div>
                
              </td>
              <td>
                Mobile Dev
                <small class="d-block">Far far away, behind the word mountains</small>
              </td>
              <td>+01 352 1125 0192</td>
              <td>Senior High</td>
              <td><a href="#" class="more">Details</a></td>
            </tr>
            <tr>
              <td>
                <label class="control control--checkbox">
                <input type="checkbox" />
                <div class="control__indicator"></div>
                </label>
              </td>
              <td>9548</td>

              <td class="pl-0">
                <div class="d-flex align-items-center">
                  <label class="custom-control ios-switch">
                  <input type="checkbox" class="ios-switch-control-input">
                  <span class="ios-switch-control-indicator"></span>
                  </label>

                  <a href="#">Gaspar Semenov</a>
                </div>
                
              </td>

              <td>
                Illustrator
                <small class="d-block">Far far away, behind the word mountains</small>
              </td>
              <td>+92 020 3994 929</td>
              <td>College</td>
              <td><a href="#" class="more">Details</a></td>
            </tr>

            <tr>
              <td>
                <label class="control control--checkbox">
                <input type="checkbox" />
                <div class="control__indicator"></div>
                </label>
              </td>
              <td>4616</td>
              <td class="pl-0">
                <div class="d-flex align-items-center">
                  <label class="custom-control ios-switch">
                  <input type="checkbox" checked="" class="ios-switch-control-input">
                  <span class="ios-switch-control-indicator"></span>
                  </label>

                  <a href="#">Matthew Wasil</a>
                </div>
                
              </td>
              <td>
                Graphic Designer
                <small class="d-block">Far far away, behind the word mountains</small>
              </td>
              <td>+02 020 3994 929</td>
              <td>London College</td>
              <td><a href="#" class="more">Details</a></td>
            </tr>
            <tr>
              <td>
                <label class="control control--checkbox">
                <input type="checkbox" />
                <div class="control__indicator"></div>
                </label>
              </td>
              <td>9841</td>
              <td class="pl-0">
                <div class="d-flex align-items-center">
                  <label class="custom-control ios-switch">
                  <input type="checkbox" checked="" class="ios-switch-control-input">
                  <span class="ios-switch-control-indicator"></span>
                  </label>

                  <a href="#">Sampson Murphy</a>
                </div>
                
              </td>

              <td>
                Mobile Dev
                <small class="d-block">Far far away, behind the word mountains</small>
              </td>
              <td>+01 352 1125 0192</td>
              <td>Senior High</td>
              <td><a href="#" class="more">Details</a></td>
            </tr>
            <tr>
              <td>
                <label class="control control--checkbox">
                <input type="checkbox" />
                <div class="control__indicator"></div>
                </label>
              </td>
              <td>9548</td>
              <td class="pl-0">
                <div class="d-flex align-items-center">
                  <label class="custom-control ios-switch">
                  <input type="checkbox" class="ios-switch-control-input">
                  <span class="ios-switch-control-indicator"></span>
                  </label>

                  <a href="#">Gaspar Semenov</a>
                </div>
                
              </td>
              <td>
                Illustrator
                <small class="d-block">Far far away, behind the word mountains</small>
              </td>
              <td>+92 020 3994 929</td>
              <td>College</td>
              <td><a href="#" class="more">Details</a></td>
            </tr>
            
          </tbody>
        </table>
      </div>


    </div>
      </div>
    </section>

  </main><!-- End #main -->

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

   <!-- JS FILE OF TABLE -->
    <script src="../js/jquery-3.3.1.min.js"></script>
    <script src="../js/popper.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/main.js"></script>
</body>

</html>
