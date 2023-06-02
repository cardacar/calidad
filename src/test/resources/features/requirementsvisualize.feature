#Autor:Equipo grados y reportes - Calidad

Feature: Visualizacion de cumplimiento de requisitos para graduación.
    Como estudiante activo de la universidad
    Quiero conocer si cumplo los requisitos para graduarme
    Para conocer mi estado actual ante la universidad

    Scenario: Ingresar número de documento en el home de la pagina y lograr ver los requisitos para graduarme
        Given me encuentro en la pagina de home
        When digito mi número de cedula
        And le doy click en el boton buscar
        Then puedo ver la pagina donde se observan los requisitos

