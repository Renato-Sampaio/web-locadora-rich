<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Funcionário</title>
<link href="css/estilo.css"rel="stylesheet">
</head>

<body>

	<f:view>

		<jsp:include page="/menu.jsp" />

		<h:form>
			<div class= cadastro align=center>

				<h1>Cadastro de Funcionários</h1>

				<h:panelGrid columns="1">
					<h:messages />
				</h:panelGrid>

				<h4>Dados Pessoais</h4>

				<h:panelGrid columns="2">

					<h:outputText value="Sexo:" />
					<h:selectOneRadio value="#{funcionarioBacking.sexo}">
						<f:selectItem itemValue="Feminino" itemLabel="Feminino" />
						<f:selectItem itemValue="Masculino" itemLabel="Masculino" />
					</h:selectOneRadio>

					<h:outputText value="Nome:" />
					<h:inputText value="#{funcionarioBacking.nome}" maxlength="45"
						size="45" />

					<h:outputText value="Cpf:" />
					<h:inputText value="#{funcionarioBacking.cpf}" maxlength="11"
						size="11" />

					<h:outputText value="Rg:" />
					<h:inputText value="#{funcionarioBacking.rg}" maxlength="9"
						size="11" />

					<h:outputText value="Idade:" />
					<h:inputText value="#{funcionarioBacking.idade}" maxlength="4"
						size="5" />

					<h:outputText value="Data Nascimento:" />
					<h:inputText value="#{funcionarioBacking.dataNascimento}"
						maxlength="4" size="5" />

				</h:panelGrid>

				<h4>Dados do Endereço</h4>

				<h:panelGrid columns="2">

					<h:outputText value="Logradouro:" />
					<h:inputText value="#{funcionarioBacking.logradouro}"
						maxlength="45" size="45" />

					<h:outputText value="Endereço:" />
					<h:inputText value="#{funcionarioBacking.endereco}" maxlength="45"
						size="45" />

					<h:outputText value="Complemento:" />
					<h:inputText value="#{funcionarioBacking.complemento}"
						maxlength="45" size="45" />

					<h:outputText value="Bairro:" />
					<h:inputText value="#{funcionarioBacking.bairro}" maxlength="45"
						size="45" />

					<h:outputText value="Cep:" />
					<h:inputText value="#{funcionarioBacking.cep}" maxlength="8"
						size="10" />

					<h:outputText value="Número:" />
					<h:inputText value="#{funcionarioBacking.numero}" maxlength="10"
						size="10" />
						
						<h:outputText value="Estado:" />
						<h:selectOneListbox value="#">
						</h:selectOneListbox>
						
						<h:outputText value="Cidade:" />
						<h:selectOneListbox value="#">
						</h:selectOneListbox>
						
				</h:panelGrid>
				
				<h4>Contato</h4>

				<h:panelGrid columns="2">

					<h:outputText value="E-mail:" />
					<h:inputText value="#{funcionarioBacking.email}" maxlength="45"
						size="45" />

					<h:outputText value="Telefone:" />
					<h:inputText value="#{funcionarioBacking.telefone}" maxlength="10"
						size="15" />

					<h:outputText value="Celular:" />
					<h:inputText value="#{funcionarioBacking.celular}" maxlength="11"
						size="15" />

				</h:panelGrid>
				
				<h4>Dados de Acesso</h4>

				<h:panelGrid columns="2">

					<h:outputText value="Login:" />
					<h:inputText value="#{funcionarioBacking.login}" maxlength="45"
						size="45" />

					<h:outputText value="Senha:" />
					<h:inputText value="#{funcionarioBacking.senha}" maxlength="45"
						size="45" />

				</h:panelGrid>
			</div>
		</h:form>

	</f:view>

</body>
</html>