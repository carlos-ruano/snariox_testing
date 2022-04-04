#Author: your.email@your.domain.com
@REQ_PTRES-10
Feature: HU2 | TS17 - Ver los servicios y productos de la empresa en la página web 

	#Voy a hacer scroll hasta encontrar los productos den la pagina web, tengo que observar si están con un h2 y aparece la palabra productos dentro de la página. Creo que esto sería automatizable.
	@TEST_PTRES-18 @REQ_PTRES-2 @REQ_PTRES-2 @TESTSET_PTRES-17
	Scenario: HU2 | TS17 | TC18 - Encontrar la seccion productos con scroll
		Given usuario entra en la pagina home de la web TC18
		When usuario hace scroll TC18
		Then usuario encuentra un h2 con un titulo que incluye la palabra "productos" TC18