<%-- 
    Document   : index
    Created on : Jun 8, 2020, 9:36:04 PM
    Author     : Mr-Al
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Stateful Calculator</title>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Estilos -->
  <link href="http://begoursus.github.io/calculadora-bt/site/css/bootstrap.css" rel="stylesheet">

  <link rel="stylesheet" type="text/css" href="http://begoursus.github.io/calculadora-bt/site/css/supernice.css">

  <link rel="stylesheet" type="text/css" href="http://begoursus.github.io/calculadora-bt/site/css/styles.css">
  <link rel="stylesheet" type="text/css" href="http://begoursus.github.io/calculadora-bt/site/css/styles_calculadora.css">

<!-- Fuentes -->
  <link href='https://fonts.googleapis.com/css?family=Oxygen:400,300,700' rel='stylesheet' type='text/css'>
  <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,400italic,700,700italic' rel='stylesheet' type='text/css'>
  <link href='https://fonts.googleapis.com/css?family=Share+Tech+Mono' rel='stylesheet' type='text/css'>
  <link href='https://fonts.googleapis.com/css?family=Aclonica' rel='stylesheet' type='text/css'>
  <link href='https://fonts.googleapis.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>


</head>
<body style="background-color: #99BADD;">
  <header class="container" style="width: 50%;">
    <nav class="navbar navbar-inverse" style="background-color: #4E5F72; border-color: #4E5F72;">
      <div class="container-fluid">
        <h1 style="text-align: center; color: white;">Calculator using Stateful Session Beans</h1>
        <h3 style="text-align: center; color: white; margin: 10px 0 0 0">M. Rizqi Alfani - 21120117140007</h3>
        <h3 style="text-align: center; color: white; margin: 5px 0 5px 0">Dita Ananda Elisa Reviana - 21120117140009</h3>
        <h3 style="text-align: center; color: white; margin: 0 0 20px 0">Yarnish Dwi Sagita Fidarliyan - 21120117130049</h3>
      </div>
    </nav>
  </header>
  <div style="display: flex; margin: 0 auto; width: 25%;">
    <div class="container calculadora" style="background-color: #4E5F72;"> 
      <div class="container-fluid teclado " style="background-color: lightgray;">
          <div class="col-xs-12 col-sm-12 teclado-ordenador">
            <div class="row">
              <a class="btn btn-success bnt-md op_calcular" id="b_calcula" title="Resultado"  style="background-color: lightgray; border-color: lightgray; color: black; font-weight: bold;" href="Calculator">START CALCULATE</a>
            </div>
          </div> <!--teclado numérico principal -->

      </div> <!--calculadora -->
    </div>
  </div>
    
  <div style="display: flex; margin: 0 auto; width: 25%;">
    <div class="container calculadora" style="background-color: #4E5F72;"> 
      <div class="container-fluid teclado" style="background-color: lightgray;">
          <div class="col-xs-12 col-sm-12 teclado-ordenador">
            <div class="row">
              <a class="btn btn-success bnt-md op_calcular" id="b_calcula" title="Resultado" style="background-color: lightgray; border-color: lightgray; color: black; font-weight: bold;" href="https://mr.al-21296.s3.amazonaws.com/index.html">DASHBOARD PAGE</a>
            </div>
          </div> <!--teclado numérico principal -->

      </div> <!--calculadora -->
    </div>
  </div>
</body>
</html>
