#Author: your.email@your.domain.com
@REQ_PTRES-10
Feature: Se nos ha pedido desarrollar una página web para una empresa de metalurgia denominada Snariox Inc.  

	#Voy a hacer scroll hasta encontrar los productos den la pagina web, tengo que observar si están con un h2 y aparece la palabra productos dentro de la página. Creo que esto sería automatizable.
	@TEST_PTRES-18 @REQ_PTRES-2 @REQ_PTRES-2 @TESTSET_PTRES-17
	Scenario: HU2 | TS17 | TC18 - Encontrar la seccion productos con scroll
		Given la pagina home de la web TC18
		When haces scroll TC18
		Then encuentras un h2 con un titulo que incluye la palabra productos TC18