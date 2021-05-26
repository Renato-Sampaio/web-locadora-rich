<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="rich" uri="http://richfaces.org/rich"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/estilo.css"rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Sistema - Locadora</title>
</head>
<body>

<div class="menu" align="center">

		
		<f:subview id="view">
		
			<h:form id="menu">
			
				<rich:toolBar>
				
					<rich:dropDownMenu value="Cadastro">
						<rich:menuItem id="menu1" value="Filme" action="#{filmeBacking.cadastroFilme}"></rich:menuItem>
						<rich:menuItem id="menu2" value="Cliente" action="#"></rich:menuItem>
						<rich:menuItem id="menu3" value="Funcionário" action="#{funcionarioBacking.cadastroFuncionario}"></rich:menuItem>
					</rich:dropDownMenu>
					
					<rich:dropDownMenu value="Consulta">
						<rich:menuItem id="menu4" value="Filme" action="#{filmeBacking.consultarFilme}"></rich:menuItem>
						<rich:menuItem id="menu5" value="Cliente" action="#"></rich:menuItem>
						<rich:menuItem id="menu6" value="Funcionário" action="#"></rich:menuItem>
					</rich:dropDownMenu>
				
				</rich:toolBar>
			
			</h:form>
		
		</f:subview>
	
	</div>

</body>
</html>