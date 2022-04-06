#Author: your.email@your.domain.com
#Keywords Summary :

@REQ_PTRES-9
Feature: HU9 - Ver el equipo de la empresa

	#Se comprobara que existe informacion referente a cada empleado en sus respectivas tarjetas y estos tienen una imagen validas cargada en las mismas.
	@TEST_PTRES-64 @REQ_PTRES-9 @REQ_PTRES-9 @TESTSET_PTRES-61
	Scenario: HU9 | TS61 | TC64 - Usuario puede ver a todo el equipo humano de forma correcta
		Given El Usuario entra a la pagina home de la web TC64
		When La pagina le carga a Usuario exitosamente TC64
		And Usuario hace scroll TC64
		Then Usuario ve una seccion con un div = "col-lg-6" donde esta el equipo en tarjetas TC64
		And El usuario ve que cada tarjeta de la seccion empleados incluye texto que no es lorem ipsum TC64
		And El Usuario ve como se incluye una foto de cada empleado visible TC64
		
	#Se debe de comprobar si las redes sociales vinculadas a cada empleado en sus respectivas tarjetas funcionan y llevan a sus respectivas webs.
	@TEST_PTRES-65 @REQ_PTRES-9 @REQ_PTRES-9 @TESTSET_PTRES-61
	Scenario: HU9 | TS61 | TC65 - Usuario puede acceder a las RR.SS. de los empleados correctamente
		Given El Usuario entra a la pagina home de la web TC65
		When La pagina le carga a Usuario exitosamente TC65
		And Usuario hace scroll hacia abajo TC65
		Then Usuario ve una sección con un div donde esta el equipo en tarjetas TC65
		And Usuario ve como cada tarjeta de la seccion empleados incluye iconos con hipervinculos a las RR.SS TC65
	
	#Se debera bajar a la parte más inferior de la web para ver las tarjetas de empleados y estas deberan contener los puestos de cada uno de manera correcta y legible.
	@TEST_PTRES-82 @REQ_PTRES-9 @REQ_PTRES-9 @TESTSET_PTRES-61
	Scenario: HU9 | TS61 | TC82 - Usuario debe poder obtener el puesto de cada empleado de forma exitosa
		Given Un usuario que entra a la web TC82
		When El Usuario carga la pagina TC82
		And Usuario hace scroll y baja hasta la parte de empleados TC82
		Then Usuario puede ver los puestos de todos los empleados en un div class="p-4" TC82
		
	#Se debera comprobar que existe un total de 4 empleados, segun especificaciones.
	@TEST_PTRES-85 @REQ_PTRES-9 @REQ_PTRES-9 @TESTSET_PTRES-61
	Scenario: HU9 | TS61 | TC85 - Obtener el numero de empleados de la web
		Given Un usuario entra a la pagina home de la web TC85
		When La pagina le carga a Usuario exitosamente TC85
		And Usuario hace scroll hacia abajo TC85
		Then El Usuario puede contabilizar un total de 4 tarjetas TC85
