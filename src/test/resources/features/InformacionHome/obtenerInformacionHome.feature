#Author: your.email@your.domain.com
#Keywords Summary :

@REQ_PTRES-10
Feature: HU7 - Ver en el inicio de la página web la información general de la empresa

	#La prueba se basara en cargar la web de la empresa y en su apartado home comprobar que existe informacion referente a la misma.
	@TEST_PTRES-44 @REQ_PTRES-7 @REQ_PTRES-7 @TESTSET_PTRES-40
	Scenario: HU7 | TS40 | TC44 - Ver la informacion general de la empresa de forma exitosa
		Given Usuario que entra en la pagina web TC44
		When Se carga la pagina a Usuario TC44
		Then La pagina muestra a Usuario informacion acerca de la empresa TC44
		
	#Mediante el siguiente test se comprobara la existencia de dichas etiquetas y su coherencia para contener la informacion requerida.
	@TEST_PTRES-50 @REQ_PTRES-7 @REQ_PTRES-7 @TESTSET_PTRES-40
	Scenario: HU7 | TS40 | TC50 - La informacion sobre la empresa se encuentra dentro de un <div> y un <h1>
		Given Usuario que entra en la pagina web TC50
		When Se carga la pagina a Usuario TC50
		Then Usuario ve que el <div> con id="snariox-text" no esta vacio TC50
		And Muestra informacion sobre la empresa a Usuario TC50
		And Usuario ve que el <h1> asociado contiene el texto: "¿Qué es Snariox?" TC50
		And Usuario comprueba que no tiene ningun lorem ipsum TC50
		
	#Se procedera a usar el _scroll_ lateral para bajar hasta lo maximo que deje la pagina y poder comprobar asi que existe un vinculo en el _footer_ que te devuelva a la parte superior, donde esta la informacion.
	@TEST_PTRES-51 @REQ_PTRES-7 @REQ_PTRES-7 @TESTSET_PTRES-40
	Scenario: HU7 | TS40 | TC51 - Usuario hace scroll hasta el footer y vuelve al home exitosamente
		Given Usuario que ya esta dentro de la web TC51
		When Usuario baja hasta el footer TC51
		And Usuario hace clic en el hipervinculo "Home" TC51
		Then La pagina redirecciona a Usuario hasta la parte superior de la web TC51
		
	#Se debera comprobar que en el cabecero del navegador se muestra de forma correcta el nombre de la empresa.
	@TEST_PTRES-52 @REQ_PTRES-7 @REQ_PTRES-7 @TESTSET_PTRES-40
	Scenario: HU7 | TS40 | TC52 - Usuario ve correctamente la marca de la empresa en el cabecero del navegador
		Given Usuario que entra a la web TC52
		When La pagina termina de cargar para Usuario TC52
		Then Se muestra una etiqueta <title> dentro de <head> con el texto: "Snariox" al Usuario TC52
		
	#En esta prueba se debera comprobar que existen los diferentes enlaces que lleven a las redes sociales donde tiene presencia la empresa.
	@TEST_PTRES-53 @REQ_PTRES-7 @REQ_PTRES-7 @TESTSET_PTRES-40
	Scenario: HU7 | TS40 | TC53 - Usuario puede acceder a las RR.SS. de la empresa
		Given Usuario entra a la pagina home de la web TC53
		When A Usuario la pagina le carga exitosamente TC53
		And Usuario hace scroll TC53
		Then Usuario ve el footer de la web con los iconos de las RR.HH. TC53
		And Cada icono tiene un hipervínculo activo para que Usuario haga clic TC53
		
	#Se debera comprobar fehacientemente que en el _footer_ de la pagina existe algun tipo de texto legal aclarativo de forma clara.
	@TEST_PTRES-54 @REQ_PTRES-7 @REQ_PTRES-7 @TESTSET_PTRES-40
	Scenario: HU7 | TS40 | TC54 - Usuario puede ver los terminos y condiciones de la web
		Given Usuario entra a la pagina home de la web TC54
		When La pagina carga exitosamente al Usuario TC54
		And Usuario hace scroll TC54
		Then Usuario ve el footer de la web con los terminos y condiciones de la web TC54
		And Usuario ve que no tiene ningún lorem ipsum TC54
		
	#Debera comprobarse si existen los enlaces al apartado ‘Home’, ‘Contacto’ y ‘LucaTIC’ en el footer, ademas de ser funcionales
	@TEST_PTRES-87 @REQ_PTRES-7 @REQ_PTRES-7 @TESTSET_PTRES-40
	Scenario: HU7 | TS40 | TC87 - Usuario accede al apartado de 'Enlaces' para navegar por la web TC87
		Given Usuario que se dirige a la parte inferior de la web TC87
		When Usuario hace clic en alguno de los 3 enlaces TC87
		Then Usuario es redirigido a cada apartado respectivamente TC87
		And Usuario ve que solo existen 3 hipervinculos TC87
		
	#Es imperativo comprobar que en los *TyC* del _footer_ se incluye tambien el anno del *_Copyright_* de la web.
	@TEST_PTRES-89 @REQ_PTRES-7 @REQ_PTRES-7 @TESTSET_PTRES-40
	Scenario: HU7 | TS40 | TC89 - Usuario quiere ver el anno del copyright de la web
		Given Usuario que se encuentra ya en la web TC89
		When Usuario hace scroll hacia abajo todo lo que le deja la web TC89
		Then Usuario se asegura que existe una información referente al Copyright en el footer en el div class="col-lg-4 col-md-6 text-white" TC89
		And Usuario ve marcado el anno 2022 TC89