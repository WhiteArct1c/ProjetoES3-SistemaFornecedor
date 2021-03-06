<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import= "java.util.List, model.Servico"%>

<!DOCTYPE html>
<html lang="pt-br">

  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>SPL - Servi?os</title>
   
   	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/sidebars/">
    <link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }

      .b-example-divider {
        height: 3rem;
        background-color: rgba(0, 0, 0, .1);
        border: solid rgba(0, 0, 0, .15);
        border-width: 1px 0;
        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
      }

      .b-example-vr {
        flex-shrink: 0;
        width: 1.5rem;
        height: 100vh;
      }

      .bi {
        vertical-align: -.125em;
        fill: currentColor;
      }

      .nav-scroller {
        position: relative;
        z-index: 2;
        height: 2.75rem;
        overflow-y: hidden;
      }

      .nav-scroller .nav {
        display: flex;
        flex-wrap: nowrap;
        padding-bottom: 1rem;
        margin-top: -1px;
        overflow-x: auto;
        text-align: center;
        white-space: nowrap;
        -webkit-overflow-scrolling: touch;
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="sidebars.css" rel="stylesheet">
    
    <% List<Servico> servicos = (List<Servico>) request.getAttribute("servicos"); %>
    
  </head>
  <body>
    <svg xmlns="http://www.w3.org/2000/svg" style="display: none;">
        <symbol id="home" viewBox="0 0 16 16">
            <path d="M8.354 1.146a.5.5 0 0 0-.708 0l-6 6A.5.5 0 0 0 1.5 7.5v7a.5.5 0 0 0 .5.5h4.5a.5.5 0 0 0 .5-.5v-4h2v4a.5.5 0 0 0 .5.5H14a.5.5 0 0 0 .5-.5v-7a.5.5 0 0 0-.146-.354L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293L8.354 1.146zM2.5 14V7.707l5.5-5.5 5.5 5.5V14H10v-4a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0-.5.5v4H2.5z"/>
        </symbol>
        <symbol id="update" viewbox="0 0 24 24">
          <path d="M 18.414062 2 C 18.158062 2 17.902031 2.0979687 17.707031 2.2929688 L 15.707031 4.2929688 L 14.292969 5.7070312 L 3 17 L 3 21 L 7 21 L 21.707031 6.2929688 C 22.098031 5.9019687 22.098031 5.2689063 21.707031 4.8789062 L 19.121094 2.2929688 C 18.926094 2.0979687 18.670063 2 18.414062 2 z M 18.414062 4.4140625 L 19.585938 5.5859375 L 18.292969 6.8789062 L 17.121094 5.7070312 L 18.414062 4.4140625 z M 15.707031 7.1210938 L 16.878906 8.2929688 L 6.171875 19 L 5 19 L 5 17.828125 L 15.707031 7.1210938 z"></path>
        </symbol>
        <symbol id="delete" viewbox="0 0 24 24">
          <path d="M 10 2 L 9 3 L 3 3 L 3 5 L 4.109375 5 L 5.8925781 20.255859 L 5.8925781 20.263672 C 6.023602 21.250335 6.8803207 22 7.875 22 L 16.123047 22 C 17.117726 22 17.974445 21.250322 18.105469 20.263672 L 18.107422 20.255859 L 19.890625 5 L 21 5 L 21 3 L 15 3 L 14 2 L 10 2 z M 6.125 5 L 17.875 5 L 16.123047 20 L 7.875 20 L 6.125 5 z"></path>
        </symbol>
        <symbol id="new" viewBox="0 0 24 24">
            <path d="M12,2C6.477,2,2,6.477,2,12s4.477,10,10,10s10-4.477,10-10S17.523,2,12,2z M17,13h-4v4h-2v-4H7v-2h4V7h2v4h4V13z"/>
        </symbol>
        <symbol id="speedometer2" viewBox="0 0 16 16">
            <path d="M8 4a.5.5 0 0 1 .5.5V6a.5.5 0 0 1-1 0V4.5A.5.5 0 0 1 8 4zM3.732 5.732a.5.5 0 0 1 .707 0l.915.914a.5.5 0 1 1-.708.708l-.914-.915a.5.5 0 0 1 0-.707zM2 10a.5.5 0 0 1 .5-.5h1.586a.5.5 0 0 1 0 1H2.5A.5.5 0 0 1 2 10zm9.5 0a.5.5 0 0 1 .5-.5h1.5a.5.5 0 0 1 0 1H12a.5.5 0 0 1-.5-.5zm.754-4.246a.389.389 0 0 0-.527-.02L7.547 9.31a.91.91 0 1 0 1.302 1.258l3.434-4.297a.389.389 0 0 0-.029-.518z"/>
            <path fill-rule="evenodd" d="M0 10a8 8 0 1 1 15.547 2.661c-.442 1.253-1.845 1.602-2.932 1.25C11.309 13.488 9.475 13 8 13c-1.474 0-3.31.488-4.615.911-1.087.352-2.49.003-2.932-1.25A7.988 7.988 0 0 1 0 10zm8-7a7 7 0 0 0-6.603 9.329c.203.575.923.876 1.68.63C4.397 12.533 6.358 12 8 12s3.604.532 4.923.96c.757.245 1.477-.056 1.68-.631A7 7 0 0 0 8 3z"/>
        </symbol>
        <symbol id="table" viewBox="0 0 16 16">
            <path d="M0 2a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v12a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V2zm15 2h-4v3h4V4zm0 4h-4v3h4V8zm0 4h-4v3h3a1 1 0 0 0 1-1v-2zm-5 3v-3H6v3h4zm-5 0v-3H1v2a1 1 0 0 0 1 1h3zm-4-4h4V8H1v3zm0-4h4V4H1v3zm5-3v3h4V4H6zm4 4H6v3h4V8z"/>
        </symbol>
        <symbol id="people-circle" viewBox="0 0 16 16">
            <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z"/>
            <path fill-rule="evenodd" d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z"/>
        </symbol>
        <symbol id="grid" viewBox="0 0 16 16">
            <path d="M1 2.5A1.5 1.5 0 0 1 2.5 1h3A1.5 1.5 0 0 1 7 2.5v3A1.5 1.5 0 0 1 5.5 7h-3A1.5 1.5 0 0 1 1 5.5v-3zM2.5 2a.5.5 0 0 0-.5.5v3a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-3a.5.5 0 0 0-.5-.5h-3zm6.5.5A1.5 1.5 0 0 1 10.5 1h3A1.5 1.5 0 0 1 15 2.5v3A1.5 1.5 0 0 1 13.5 7h-3A1.5 1.5 0 0 1 9 5.5v-3zm1.5-.5a.5.5 0 0 0-.5.5v3a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-3a.5.5 0 0 0-.5-.5h-3zM1 10.5A1.5 1.5 0 0 1 2.5 9h3A1.5 1.5 0 0 1 7 10.5v3A1.5 1.5 0 0 1 5.5 15h-3A1.5 1.5 0 0 1 1 13.5v-3zm1.5-.5a.5.5 0 0 0-.5.5v3a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-3a.5.5 0 0 0-.5-.5h-3zm6.5.5A1.5 1.5 0 0 1 10.5 9h3a1.5 1.5 0 0 1 1.5 1.5v3a1.5 1.5 0 0 1-1.5 1.5h-3A1.5 1.5 0 0 1 9 13.5v-3zm1.5-.5a.5.5 0 0 0-.5.5v3a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-3a.5.5 0 0 0-.5-.5h-3z"/>
        </symbol>
    </svg> <!--Icones svg-->

    <main class="d-flex flex-nowrap">
    
       <!--menu sidebar principal-->
        <div class="d-flex flex-column flex-shrink-0 p-3 text-white bg-dark" style="width: 280px;">
            <a href="index.jsp" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none">
                <img src="<%=request.getContextPath()%>/resources/images/spl-logotipo-vertical.png" width="192" height="108">
            </a>
            <hr>
            <ul class="nav nav-pills flex-column mb-auto">
            <li class="nav-item">
                <a href="index.jsp" class="nav-link text-white" aria-current="page">
                <svg class="bi pe-none me-2" width="16" height="16"><use xlink:href="#home"/></svg>
                In?cio
                </a>
            </li>
            <li>
                <a href="CarregarServicos" class="nav-link active text-white">
                <svg class="bi pe-none me-2" width="16" height="16"><use xlink:href="#table"/></svg>
                Servi?os
                </a>
            </li>
            <li>
                <a href="CarregarProdutos" class="nav-link text-white">
                <svg class="bi pe-none me-2" width="16" height="16"><use xlink:href="#grid"/></svg>
                Produtos
                </a>
            </li>
            <li>
                <a href="CarregarFornecedores" class="nav-link text-white">
                <svg class="bi pe-none me-2" width="16" height="16"><use xlink:href="#people-circle"/></svg>
                Fornecedores
                </a>
            </li>
            </ul>
            <hr>
            <div class="dropdown">
                <a href="#" class="d-flex align-items-center text-white text-decoration-none dropdown-toggle" id="dropdownUser1" data-bs-toggle="dropdown" aria-expanded="false">
                    <img src="<%=request.getContextPath()%>/resources/images/user.png" alt="" width="32" height="32" class="rounded-circle me-2">
                    <strong>User test</strong>
                </a>
                <ul class="dropdown-menu dropdown-menu-dark text-small shadow" aria-labelledby="dropdownUser1">
                    <li><a class="dropdown-item" href="#" data-bs-toggle="modal" data-bs-target="#logoutModal">Sign out</a></li>
                </ul>
            </div>
        </div>
        <div class="b-example-divider b-example-vr"></div> <!--divis?ria-->
		
		
		
		<hr class="text-danger border-2 opacity-50">
		
        <!--tabela de itens-->     
        <div class="container-fluid">
          	<div class="row justify-content-center">
          		<div class="col-auto">
          			<h1 class="display-1 text-center fw-semibold">Servi?os</h1>
          		</div>  	         		
			</div>
			<div class="row">
				<div class="col-auto">	
					<button type="button" class="btn btn-success btn-sm" data-bs-toggle="modal" data-bs-target="#modalServico">
                  			<svg class="bi  mt-1" width="42" height="42"><use xlink:href="#new"/></svg>
               		</button>
          		</div>
          	</div> 
		<div class="row">
			<table class="table">
            <thead>
              <tr>
                <th scope="col" class="text-center">C?digo do Servi?o</th>
                <th scope="col" class="text-center">Descri??o</th>
                <th scope="col" class="text-center">Pre?o</th>
                <th scope="col" class="text-center">In?cio do Servi?o</th>
                <th scope="col"></th>
              </tr>
            </thead>
            <tbody>
              <%if(servicos != null){
              		for(Servico servico: servicos){%>
              		<form action="controller" method=post>
              			<tr>
              				<td>
              					<input class="form-control mt-2" type="text" id="codigoServico"
              						name="nomeServico" value="<%=servico.getCodigo()%>"/>
              				</td>
              				<td>
              					<input class="form-control mt-2" type="text" id="descricaoServico"
              						name="descricaoServico" value="<%=servico.getDescricao()%>"/>
              				</td>
              				<td>
              					<input class="form-control mt-2" type="text" id="precoServico"
              						name="precoServico" value="<%=servico.getPreco()%>"/>
              				</td>
              				<td>
              					<input class="form-control mt-2" type="date" id="dtinicioServico"
              						name="dtinicioServico" value="<%=servico.getDataInicio()%>"/> 
              				</td>        
              				<td>
              					<input type="hidden" name="acao" value="Alterar"/>
              					<input type="hidden" name="idServico" value="<%=servico.getId()%>"/>
                        		<input type="hidden" name="viewHelper" value="ServicoVH"/>                       
                				<button type="submit" class="btn btn-warning" title="Alterar">
                  					<svg class="bi pe-none" width="25" height="25"><use xlink:href="#update"/></svg>
                				</button>               		
                				<a class="btn btn-danger" href="/projetoWebEs3/controller?acao=Excluir&viewHelper=ServicoVH&idServico=<%=servico.getId()%>" title="Excluir">
                  					<svg class="bi pe-none" width="25" height="25"><use xlink:href="#delete"/></svg>
                				</a>
              				</td>              	
              			</tr>
					</form>
              <%}
              }%>
           	 </tbody>
          </table>
		</div>         
       </div> 
        
        
    </main>
    
    	<!-- Modal de cadastro -->
        <div class="modal fade" id="modalServico" tabindex="-1" aria-labelledby="modalServico" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Cadastrar Servi?o</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <form class="needs-validation" action="controller" method="post">
                    	<div class="modal-body">
							<div class="mb-3">
								<label for="codigoServico" class="form-label">C?digo do Servi?o</label> 
								<input type="text" class="form-control" id="codigoServico" name="codigoServico" required>
							</div>
							<div class="mb-3">
								<div class="mb-3">
  									<label for="descricaoServico" class="form-label">Descri??o</label>
  									<input type="text" class="form-control" id="descricaoServico" name="descricaoServico" required/>
								</div>
							</div>
							<div class="mb-3">
								<label for="precoServico" class="form-label">Pre?o</label> 
								<input type="text" class="form-control" id="precoServico" name="precoServico" required>
							</div>
							<div class="mb-3">
								<label for="dtinicioServico" class="form-label">In?cio do servi?o</label> 
								<input type="date" class="form-control" id="dtinicioServico" name="dtinicioServico" required>
							</div>
						
						</div>
                    	<div class="modal-footer">
                        	<button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancelar</button>
                        	
                        	<input type="hidden" name="acao" value="Salvar"/>
                        	<input type="hidden" name="viewHelper" value="ServicoVH"/>
                        	<button type="submit" class="btn btn-primary">Cadastrar!</button>
                        	 
                    	</div>
                    </form>
                </div>
            </div>
        </div>
        
        <!-- Logout Modal-->
	    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
	        aria-hidden="true">
	        <div class="modal-dialog" role="document">
	            <div class="modal-content">
	                <div class="modal-header">
	                    <h5 class="modal-title" id="exampleModalLabel">Deseja Sair?</h5>
	                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	                </div>
	                <div class="modal-body">Selecione "Logout" abaixo para encerrar a sess?o.</div>
	                <div class="modal-footer">
	                    <button class="btn btn-secondary" type="button" data-bs-dismiss="modal">Cancelar</button>
	                    <a class="btn btn-primary" href="login.jsp">Logout</a>
	                </div>
	            </div>
	        </div>
	    </div>
        

    <footer class="bg-dark text-center text-lg-start">
      <!-- Copyright -->
      <div class="text-center text-white p-3">
        ? 2022 Copyright:
        <a class="text-white" href="index.jsp">SPL System - FATEC MC</a>
      </div>
      <!-- Copyright -->
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <script src="../assets/dist/js/bootstrap.bundle.min.js"></script>
    <script src="sidebars.js"></script>
  </body>
</html>