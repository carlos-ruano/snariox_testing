#Author: your.email@your.domain.com
@REQ_PTRES-10
Feature: HU2 | TS17 - Ver los servicios y productos de la empresa en la página web 

	#Voy a hacer scroll hasta encontrar los productos den la pagina web, tengo que observar si están con un h2 y aparece la palabra productos dentro de la página. Creo que esto sería automatizable.
	@TEST_PTRES-18 @REQ_PTRES-2 @REQ_PTRES-2 @TESTSET_PTRES-17 @TC @regresion
	Scenario: HU2 | TS17 | TC18 - Encontrar la seccion productos con scroll
		Given usuario entra en la pagina home de la web TC18
		When usuario hace scroll TC18
		Then usuario encuentra un h2 con un titulo que incluye la palabra "productos" TC18
		
	#Voy a darle a un boton de leer mas web, tengo que observar si si me lleva a la seccion productos. Creo que esto sería automatizable.
	@TEST_PTRES-19 @REQ_PTRES-2 @REQ_PTRES-2 @TESTSET_PTRES-17 @TC @regresion
	Scenario: HU2 | TS17 | TC19 - Test Ir a seccion productos con boton
		Given usuario entra en la pagina home de la web TC19
		When usuario hace click en botón leer más TC19
		Then usuario va automaticamente a la seccion productos TC19
		
	@TEST_PTRES-91 @REQ_PTRES-2 @REQ_PTRES-2 @TESTSET_PTRES-17 @TC @regresion
	Scenario: HU2 | TS17 | TC91 - Validar el número de tarjetas de productos que ofrece la empresa
		Given usuario entra en la pagina home de la web TC91
		When usuario hace click en botón leer más TC91
		Then usuario va automaticamente a la seccion productos TC91
		And usuario ve seis tarjetas con los productos TC91
		
	@TEST_PTRES-92 @REQ_PTRES-2 @REQ_PTRES-2 @TESTSET_PTRES-17 @TC @regresion
	Scenario: HU2 | TS17 | TC92 - Validar el contenido de las tarjetas de la seccion productos
		Given usuario entra en la pagina home de la web TC92
		When usuario hace scroll TC92
		Then usuario ve una seccion productos con seis tarjetas diferenciadas TC92
		And usuario ve que la seccion productos incluye texto que no es lorem ipsum TC92