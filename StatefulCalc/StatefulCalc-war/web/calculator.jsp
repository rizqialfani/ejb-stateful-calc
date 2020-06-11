<%-- 
    Document   : calculator
    Created on : Jun 11, 2020, 4:29:31 AM
    Author     : Mr-Al
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Stateful Calculator</title>

  <meta charset='utf-8'>
  <meta http-equiv='X-UA-Compatible' content='IE=edge'>
  <meta name='viewport' content='width=device-width, initial-scale=1'>

  <link href='http://begoursus.github.io/calculadora-bt/site/css/bootstrap.css' rel='stylesheet'>
  <link rel='stylesheet' type='text/css' href='http://begoursus.github.io/calculadora-bt/site/css/supernice.css'>
  <link rel='stylesheet' type='text/css' href='http://begoursus.github.io/calculadora-bt/site/css/styles.css'>
  <link rel='stylesheet' type='text/css' href='http://begoursus.github.io/calculadora-bt/site/css/styles_calculadora.css'>

  <link href='https://fonts.googleapis.com/css?family=Oxygen:400,300,700' rel='stylesheet' type='text/css'>
  <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,400italic,700,700italic' rel='stylesheet' type='text/css'>
  <link href='https://fonts.googleapis.com/css?family=Share+Tech+Mono' rel='stylesheet' type='text/css'>
  <link href='https://fonts.googleapis.com/css?family=Aclonica' rel='stylesheet' type='text/css'>
  <link href='https://fonts.googleapis.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>
</head>
                
<body style='background-color: #99BADD;'>
  <header class='container' style='width: 50%;'>
    <nav class='navbar navbar-inverse' style='background-color: #4E5F72; border-color: #4E5F72;'>
      <div class='container-fluid'>
        <h1 style='text-align: center; color: white;'>Calculator using Stateful Session Beans</h1>
        <h3 style='text-align: center; color: white; margin: 10px 0 0 0'>M. Rizqi Alfani - 21120117140007</h3>
        <h3 style='text-align: center; color: white; margin: 5px 0 5px 0'>Dita Ananda Elisa Reviana - 21120117140009</h3>
        <h3 style='text-align: center; color: white; margin: 0 0 20px 0'>Yarnish Dwi Sagita Fidarliyan - 21120117130049</h3>                
      </div>
    </nav>
  </header>
  <div style='display: flex; margin: 0 auto; width: 50%;'>
    <div class='container calculadora' style="background-color:#4E5F72;"> 
     <br>   
     <form method="post" name="CalcSB" action="Calculator" style="padding:5px 10px 0px 10px;">
      <div class='container-fluid cabecera' id='cabecera'>
        <div class='col-xs-12 col-sm-12' id='resultado'>
          <div class='input-group  has-success' style='width: 100%;'>
            <input type='text' class='form-control' value='${panelNL}' id='lcd' style='border-radius: 4px;' name='hasil1' readonly/>
          </div> 
        </div> 
        <!-- grupo LCD + Botón atrás -->
        <div class='col-xs-12 col-sm-12' id='resultado'>
          <div class='input-group  has-success' style='width: 100%;'>
           <div class='input-group-addon' style="padding: 0 6px;">
                <input class="form-control" type='text' value='${panelOp}' style='padding:0 8px; height:20px; border-color:#DFF0D8; background-color: #DFF0D8; width:28px; font-size:18px;' name='operator' readonly/>
           </div>
            <input type='text' class='form-control' value='${panelNB}' id='lcd' style='border-radius: 4px;' name='hasil' readonly/>
          </div> 
        </div> 

      </div>
      <br>

      <div class='container-fluid teclado '>
          <div class='col-xs-12 col-sm-12 teclado-ordenador'>
            <div class='row' id='tp-r1'>
              <!-- <button class='btn btn-info bnt-md' data-toggle='modal' data-target='#myModal'> -->
              <button class='btn btn-danger bnt-md op_borrar' id='b_borrar_parcial' type='submit' value='reset' title='Reset'>CE</button>
              <input type='submit' class='btn btn-primary bnt-md op_binario' name='Kali' id='b_multiplica' title='Mul' style='width:31.5%;' value="*" />
            </div>

            <div class='row' id='tp-r2'>
              <input class='btn btn-default bnt-md btn_numero' name='number' id='num7' type="button" value="7" onclick="document.CalcSB.hasil.value+='7'"/>
              <input class='btn btn-default bnt-md btn_numero' name='number' id='num8' type="button" value="8" onclick="document.CalcSB.hasil.value+='8'" />
              <input class='btn btn-default bnt-md btn_numero' name='number' id='num9' type="button" value="9" onclick="document.CalcSB.hasil.value+='9'" />
              <input type='submit' class='btn btn-primary bnt-md op_binario' name='Tambah' id='b_suma' title='Sum' value="+" />
            </div>
            <div class='row' id='tp-r3'>
              <input class='btn btn-default bnt-md btn_numero' name='number'  id='num4' type="button" value=" 4 " onclick="document.CalcSB.hasil.value+='4'" />
              <input class='btn btn-default bnt-md btn_numero' name='number'  id='num5' type="button" value=" 5 " onclick="document.CalcSB.hasil.value+='5'" />
              <input class='btn btn-default bnt-md btn_numero' name='number'  id='num6' type="button" value=" 6 " onclick="document.CalcSB.hasil.value+='6'" />
              <input type='submit' class='btn btn-primary bnt-md op_binario' name='Kurang' id='b_resta' title='Sub' value="-" />
            </div>
            <div class='row' id='tp-r4-r5'>
              <input class='btn btn-default bnt-md btn_numero' name='number'  id='num1' type="button" value=" 1 " onclick="document.CalcSB.hasil.value+='1'" />
              <input class='btn btn-default bnt-md btn_numero' name='number'  id='num2' type="button" value=" 2 " onclick="document.CalcSB.hasil.value+='2'" />
              <input class='btn btn-default bnt-md btn_numero' name='number'  id='num3' type="button" value=" 3 " onclick="document.CalcSB.hasil.value+='3'" />
              <input type='submit' class='btn btn-primary bnt-md op_binario' name='Bagi' id='b_divide' title='Div' value="/" />
            </div>
            <div class='row'>
              <input class='btn btn-default bnt-md btn_numero' id='punto' type="button" title='Comma' value="." onclick="document.CalcSB.hasil.value+='.'" />
              <input class='btn btn-default bnt-md btn_numero' name='number'  id='num0' type="button" value="0" onclick="document.CalcSB.hasil.value+='0'" />
              <input class='btn btn-success bnt-md op_calcular' id='b_calcula' name='Equal' title='Result' style='width: 224%' type="submit" value="=" />
            </div>
          </div>
      </div>
     </form>
     <br>
    </div>
  </div>
                
  <div style='display: flex; margin: 0 auto; width: 25%;'>
    <div class='container calculadora'  style="background-color: #4E5F72;">
      <div class='container-fluid teclado'>
          <div class='col-xs-12 col-sm-12 teclado-ordenador'>
            <div class='row'>
              <a class='btn btn-success bnt-md op_calcular' id='b_calcula' title='Resultado' style="background-color: lightgray; border-color: lightgray; color: black; font-weight: bold;"  href='../StatefulCalc-war/'>BACK TO MAIN PAGE</a>
            </div>
          </div>
      </div>
    </div>
  </div>
</body>
</html>
