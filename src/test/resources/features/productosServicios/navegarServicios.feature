#Author: your.email@your.domain.com
@REQ_PTRES-10
Feature: HU2 | TS17 - Ver los servicios y productos de la empresa en la página web 

#Usuario tiene que hacer scroll y poder encontrar con facilidad una seccion diferenciada en la que pone un encabezado que incluye la palabra servicios
	@TEST_PTRES-93 @REQ_PTRES-2 @REQ_PTRES-2 @TESTSET_PTRES-17 @TC @regresion
	Scenario: HU2 | TS17 | TC93 - Encontrar la seccion servicios
		Given usuario que entra en la pagina home de la web TC93
		When usuario hace scroll TC93
		Then usuario encuentra un h2 con un titulo que incluye la palabra servicios TC93
	#Usuario tiene que encontrar dentro de la seccion servicios tres partes diferenciadas
	@TEST_PTRES-94 @REQ_PTRES-2 @REQ_PTRES-2 @TESTSET_PTRES-17 @TC @regresion
	Scenario: HU2 | TS17 | TC94 - Validar el número de elementos de servicios que ofrece la empresa
		Given usuario que entra en la pagina home de la web TC94
		When usuario hace scroll TC94
		Then usuario ve una seccion servicios con 3 elementos diferenciados TC94
	#usuario debe encontrar escrito dentro dle contenido de las terjetas texto que no es lorem ipsum
	@TEST_PTRES-95 @REQ_PTRES-2 @REQ_PTRES-2 @TESTSET_PTRES-17 @TC @regresion
	Scenario: HU2 | TS17 | TC95 - Validar el contenido de las tarjetas de la seccion servicios
		Given usuario la pagina home de la web TC95
		When usuario hace scroll TC95
		Then usuario ve una seccion servicios con 3 elementos diferenciados TC95
		And usuario ve texto que no es lorem ipsum TC95
	#usuario ve dentro de la seccion servicios, titulos que pone Aleaciones especiales, Aceros inoxidables y Oportunidades en todo el mundo respectivamente
	@TEST_PTRES-96 @REQ_PTRES-2 @REQ_PTRES-2 @TESTSET_PTRES-17 @TC @regresion
	Scenario: HU2 | TS17 | TC96 - Validar los títulos de las tarjetas de seccion servicios
		Given usuario entra en la pagina home de la web TC96
		When usuario hace scroll TC96
		Then usuario ve una seccion servicios con 3 elementos diferenciados TC96
		And usuario que los elementos contienen un h3 con los titulo Aleaciones especiales, Aceros inoxidables y Oportunidades en todo el mundo respectivamente TC96