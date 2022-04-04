@REQ_PTRES-10
Feature: Se nos ha pedido desarrollar una página web para una empresa de metalurgia denominada Snariox Inc.

    El usuario rellena TODOS los campos del formulario y se envía correctamente.
    @TEST_PTRES-25 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
    Scenario: HU8 | TS21 | TC25 - El usuario rellena TODOS los campos del formulario y se envia correctamente.
        Given Adrian entra a la pagina de Contacto
        When Adrian rellena todos los campos requeridos y las dos casillas
        Then el formulario se envia correctamente


		#El usuario NO rellena NINGUNO de los campos del formulario y no se envía correctamente.
		@TEST_PTRES-28 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
		Scenario: HU8 | TS21 | TC28 - El usuario NO rellena NINGUNO de los campos del formulario y no se envia correctamente.
				Given Adrian entra a la pagina de Contacto
				When Adrian NO rellena ninguno campos requeridos y las dos casillas
				Then el formulario NO se envia correctamente