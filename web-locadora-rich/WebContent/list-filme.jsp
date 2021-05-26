<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="rich" uri="http://richfaces.org/rich"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consulta de Filmes</title>
</head>
<body>

	<f:view>
	
		<jsp:include page="/menu.jsp" />
		
		<h:form>
		
			<h:panelGrid columns="1">
				<h:messages></h:messages>
			</h:panelGrid>
			
			<h:panelGrid columns="3">
				<h:outputText value="Nome:" />
				<h:inputText value="#{filmeBacking.nomePesquisar}" maxlength="45" size="45" />
				<h:commandButton action="#{filmeBacking.pesquisar}" value="Pesquisar" />
			</h:panelGrid>
			
			<h:panelGrid columns="1" width="450">
			
				<rich:dataTable id="tabFilmes" width="100%" value="#{filmeBacking.listaFilmes}" var="filme">
				
					<f:facet name="caption">
						<h:outputText value="Filmes Cadastrados" />
					</f:facet>
					
					<f:facet name="header">
						
						<rich:columnGroup>
							
							<rich:column>
								<h:outputText value="Código" />
							</rich:column>
							
							<rich:column>
								<h:outputText value="Nome" />
							</rich:column>
							
							<rich:column>
								<h:outputText value="Gênero" />
							</rich:column>
							
							<rich:column>
								<h:outputText value="Valor" />
							</rich:column>
							
							<rich:column>
								<h:outputText value="Disponível" />
							</rich:column>
							
							<rich:column colspan="2">
								<h:outputText value="Ações" />
							</rich:column>

						</rich:columnGroup>
					
					</f:facet>
					
					<rich:column>
						<h:outputText value="#{filme.idFilme}" />
					</rich:column>
					
					<rich:column>
						<h:outputText value="#{filme.nome}" />
					</rich:column>
					
					<rich:column>
						<h:outputText value="#{filme.genero}" />
					</rich:column>
					
					<rich:column>
						<h:outputText value="#{filme.valor}" />
					</rich:column>
					
					<rich:column>
						<h:outputText value="#{filme.disponivel}" />
					</rich:column>
					
					<rich:column>
						<h:commandLink action="#{filmeBacking.alterar}" value="Alterar">
							<f:setPropertyActionListener value="#{filme}" target="#{filmeBacking.filmeSelecionado}" />
						</h:commandLink>
					</rich:column>
					
					<rich:column>
						<h:commandLink action="#{filmeBacking.excluir}" value="Excluir">
							<f:setPropertyActionListener value="#{filme}" target="#{filmeBacking.filmeSelecionado}" />
						</h:commandLink>
					</rich:column>
				
				</rich:dataTable>
			
			</h:panelGrid>
			
		</h:form>
		
	</f:view>

</body>
</html>