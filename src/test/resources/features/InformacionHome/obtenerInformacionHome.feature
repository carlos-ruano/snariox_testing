#Author: your.email@your.domain.com
#Keywords Summary :

@REQ_PTRES-10
Feature: Se nos ha pedido desarrollar una pagina web para una empresa de metalurgia denominada Snariox Inc.  

	#La prueba se basara en cargar la web de la empresa y en su apartado home comprobar que existe informacion referente a la misma.
	@TEST_PTRES-44 @REQ_PTRES-7 @REQ_PTRES-7 @TESTSET_PTRES-40
	Scenario: HU7 | TS40 | TC44 - Ver la informacion general de la empresa de forma exitosa
		Given Usuario que entra en la pagina web TC44
		When Se carga la pagina a Usuario TC44
		Then La pagina muestra a Usuario informacion acerca de la empresa TC44