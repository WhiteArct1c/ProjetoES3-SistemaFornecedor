<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
  
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
        <link href="<%=request.getContextPath()%>/resources/css/csslogin.css" rel="stylesheet">

        <title>SPL - Login</title>

    </head>
    <body>

        <div class="container-fluid">
            <div class="row justify-content-center mt-5 text-white">
                <section class="col-md-3 mt-5">
                    <img src="<%=request.getContextPath()%>/resources/images/spl-logotipo-vertical.png"  class="mx-auto d-block img-fluid" width="390" height="200">
                    <form class="form-container" action="index.jsp">
                    	<!-- login funcional não implementado -->
                        <h4 class="h3 text-center">Login</h4>
                        <hr>
                        <div class="col-md-12">
                            <label for="exampleInputEmail1" class="form-label">Endereço de e-mail</label>
                            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required>
                            <div id="emailHelp" class="form-text text-white">Nunca compartilhe seu e-mail.</div>
                        </br>
                        </div>
                        <div class="col-md-12">
                            <label for="exampleInputPassword1" class="form-label">Senha</label>
                            <input type="password" class="form-control" id="exampleInputPassword1" required>
                        </div>
                       	</br>
                        <div class="d-grid gap-2 col-6 mx-auto">
                            <button type="submit" class="btn btn-primary btn-lg">Entrar</button>
                            <!--
                            <button type="submit" class="btn btn-success btn-lg" data-bs-toggle="modal" data-bs-target="#exampleModal">Cadastrar</button>  
                            -->
                        </div>                
                    </form>
                </section>
            </div>
            
            <footer class="text-center text-lg-start">
                <!-- Copyright -->
                <div class="text-center text-white p-3">
                  © 2022 Copyright:
                  <a class="text-white" href="<%=request.getContextPath()%>/login.jsp">SPL System - FATEC MC</a>
                </div>
                <!-- Copyright -->
            </footer>

        </div>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    </body>
</html>