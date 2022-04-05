@REQ_PTRES-10
Feature: HU8 - Contactar con la empresa a través de un formulario de datos en la página web de la empresa.

    #El usuario rellena TODOS los campos del formulario y se envía correctamente.
    @TEST_PTRES-25 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
    Scenario: HU8 | TS21 | TC25 - El usuario rellena TODOS los campos del formulario y se envia correctamente.
        Given la pagina de Contacto TC25
        When el usuario rellena todos los campos requeridos y las dos casillas TC25
        Then el formulario se envia correctamente TC25


		#El usuario NO rellena NINGUNO de los campos del formulario y no se envía correctamente.
		@TEST_PTRES-28 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
		Scenario: HU8 | TS21 | TC28 - El usuario NO rellena NINGUNO de los campos del formulario y no se envia correctamente
				Given la pagina de Contacto TC28
				When el usuario NO rellena ninguno campos requeridos y las dos casillas TC28
				Then el formulario NO se envia correctamente TC28
			
		#El usuario rellena TODOS los campos requeridos, EXCEPTO el correspondiente al NOMBRE, y el formulario no se envía correctamente.
		@TEST_PTRES-32 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
		Scenario: HU8 | TS21 | TC32 - El usuario rellena TODOS los campos requeridos, EXCEPTO el correspondiente al NOMBRE, y el formulario no se envia correctamente
				Given la pagina de Contacto TC32
				When el usuario NO rellena el campo NOMBRE TC32
				Then el formulario NO se envia correctamente TC32
			
			
		#El usuario rellena TODOS los campos requeridos, rellena el correspondiente al NOMBRE con un FORMATO INVÁLIDO, y el formulario no se envía correctamente.
		@TEST_PTRES-34 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
		Scenario: HU8 | TS21 | TC34 - El usuario rellena TODOS los campos requeridos, rellena el correspondiente al NOMBRE con un FORMATO INVALIDO, y el formulario no se envia correctamente
				Given la pagina de Contacto TC34
				When el usuario rellena el campo NOMBRE con un formato invalido TC34
				Then el formulario NO se envia correctamente TC34
				
		#El usuario rellena TODOS los campos requeridos, rellena el correspondiente al NOMBRE que NO supera el número mínimo de caracteres permitidos, y el formulario no se envía correctamente.
		@TEST_PTRES-36 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21
		Scenario: HU8 | TS21 | TC36 - El usuario rellena TODOS los campos requeridos, rellena el correspondiente al NOMBRE que NO supera el numero minimo de caracteres permitidos, y el formulario no se envia correctamente
				Given la pagina de Contacto TC36
				When el usuario rellena el campo NOMBRE que NO supera el numero minimo de caracteres permitidos TC36
				Then el formulario NO se envia correctamente TC36
				
		#El usuario rellena TODOS los campos requeridos, rellena el correspondiente al NOMBRE que supera el número máximo de caracteres permitidos, y el formulario no se envía correctamente.
		@TEST_PTRES-38 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
		Scenario: HU8 | TS21 | TC38 - El usuario rellena TODOS los campos requeridos, rellena el correspondiente al NOMBRE que supera el numero maximo de caracteres permitidos, y el formulario no se envia correctamente
				Given la pagina de Contacto TC38
				When el usuario rellena el campo NOMBRE que supera el numero maximo de caracteres permitidos TC38
				Then el formulario NO se envia correctamente TC38
				
		#El usuario rellena TODOS los campos requeridos, EXCEPTO el correspondiente al EMAIL, y el formulario no se envía correctamente.
		@TEST_PTRES-39 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
		Scenario: HU8 | TS21 | TC39 - El usuario rellena TODOS los campos requeridos, EXCEPTO el correspondiente al EMAIL, y el formulario no se envía correctamente
				Given la página de Contacto TC39
				When el usuario NO rellena el campo EMAIL TC39
				Then el formulario NO se envía correctamente TC39
				
		#El usuario rellena TODOS los campos requeridos, rellena el correspondiente al EMAIL con un FORMATO INVÁLIDO, y el formulario no se envía correctamente.
		@TEST_PTRES-43 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
		Scenario: HU8 | TS21 | TC43 - El usuario rellena TODOS los campos requeridos, rellena el correspondiente al EMAIL con un FORMATO INVALIDO, y el formulario no se envia correctamente
				Given la pagina de Contacto TC43
				When el usuario rellena el campo EMAIL con un formato invalido TC43
				Then el formulario NO se envia correctamente TC43
				
		#El usuario rellena TODOS los campos requeridos, EXCEPTO el correspondiente al TELÉFONO, y el formulario no se envía correctamente.
		@TEST_PTRES-45 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
		Scenario: HU8 | TS21 | TC45 - El usuario rellena TODOS los campos requeridos, EXCEPTO el correspondiente al TELEFONO, y el formulario no se envia correctamente.
				Given la pagina de Contacto TC45
				When el usuario NO rellena el campo TELEFONO TC45
				Then el formulario NO se envia correctamente TC45
				
				
		#El usuario rellena TODOS los campos requeridos, rellena el correspondiente al TELÉFONO con un FORMATO INVÁLIDO, y el formulario no se envía correctamente.
		@TEST_PTRES-48 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
		Scenario: HU8 | TS21 | TC48 - El usuario rellena TODOS los campos requeridos, rellena el correspondiente al TELEFONO con un FORMATO INVALIDO, y el formulario no se envia correctamente
				Given la pagina de Contacto TC48 
				When el usuario rellena el campo TELEFONO con un formato invalido TC48
				Then el formulario NO se envia correctamente TC48
				
				
		#El usuario rellena TODOS los campos requeridos, rellena el correspondiente al TELÉFONO que NO supera el número mínimo de caracteres permitidos, y el formulario no se envía correctamente.
		@TEST_PTRES-55 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
			Scenario: HU8 | TS21 | TC55 - El usuario rellena TODOS los campos requeridos, rellena el correspondiente al TELEFONO que NO supera el numero minimo de caracteres permitidos, y el formulario no se envia correctamente
				Given la pagina de Contacto TC55
				When el usuario rellena el campo TELEFONO que NO supera el numero minimo de caracteres permitidos TC55
				Then el formulario NO se envia correctamente TC55
				
		#El usuario rellena TODOS los campos requeridos, rellena el correspondiente al TELÉFONO que supera el número máximo de caracteres permitidos, y el formulario no se envía correctamente.
		@TEST_PTRES-57 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
			Scenario: HU8 | TS21 | TC57 - El usuario rellena TODOS los campos requeridos, rellena el correspondiente al TELEFONO que supera el numero maximo de caracteres permitidos, y el formulario no se envia correctamente
				Given la pagina de Contacto TC57
				When el usuario rellena el campo TELEFONO que supera el numero maximo de caracteres permitidos TC57
				Then el formulario NO se envia correctamente TC57
				
		#El usuario rellena TODOS los campos requeridos, EXCEPTO el correspondiente al MENSAJE, y el formulario no se envía correctamente.
		@TEST_PTRES-63 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
		Scenario: HU8 | TS21 | TC63 - El usuario rellena TODOS los campos requeridos, EXCEPTO el correspondiente al MENSAJE, y el formulario no se envia correctamente
				Given la pagina de Contacto TC63
				When el usuario NO rellena el campo MENSAJE TC63
				Then el formulario NO se envia correctamente TC63
				
		#El usuario rellena TODOS los campos requeridos, rellena el correspondiente al MENSAJE que NO supera el número mínimo de caracteres permitidos, y el formulario no se envía correctamente.
		@TEST_PTRES-66 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
		Scenario: HU8 | TS21 | TC66 - El usuario rellena TODOS los campos requeridos, rellena el correspondiente al MENSAJE que NO supera el numero minimo de caracteres permitidos, y el formulario no se envia correctamente
				Given la pagina de Contacto TC66
				When el usuario rellena el campo MENSAJE que NO supera el numero minimo de caracteres permitidos TC66
				Then el formulario NO se envia correctamente TC66
				
		#El usuario rellena TODOS los campos requeridos, rellena el correspondiente al MENSAJE que supera el número máximo de caracteres permitidos, y el formulario no se envía correctamente.
		@TEST_PTRES-68 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
		Scenario: HU8 | TS21 | TC68 - El usuario rellena TODOS los campos requeridos, rellena el correspondiente al MENSAJE que supera el numero maximo de caracteres permitidos, y el formulario no se envia correctamente
				Given la pagina de Contacto TC68
				When el usuario rellena el campo MENSAJE que supera el numero maximo de caracteres permitidos TC68
				Then el formulario NO se envia correctamente TC68
				
		#El usuario rellena TODOS los campos requeridos, EXCEPTO el primer CHECKBOX requerido, y el formulario no se envía correctamente.
		@TEST_PTRES-75 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
		Scenario: HU8 | TS21 | TC75 - El usuario rellena TODOS los campos requeridos, EXCEPTO el primer CHECKBOX requerido, y el formulario no se envia correctamente
				Given la pagina de Contacto TC75
				When el usuario NO marca el primer CHECKBOX requerido TC75
				Then el formulario NO se envia correctamente TC75
				
		
		#El usuario rellena TODOS los campos requeridos, EXCEPTO ambos CHECKBOX requeridos, y el formulario no se envía correctamente.
		@TEST_PTRES-73 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
		Scenario: HU8 | TS21 | TC73 - El usuario rellena TODOS los campos requeridos, EXCEPTO ambos CHECKBOX requeridos, y el formulario no se envia correctamente
				Given la pagina de Contacto TC73
				When el usuario NO marca ambos CHECKBOX requeridos TC73
				Then el formulario NO se envia correctamente TC73	
				
		#El usuario rellena TODOS los campos requeridos, EXCEPTO el segundo CHECKBOX requerido, y el formulario no se envía correctamente.
		@TEST_PTRES-79 @REQ_PTRES-8 @REQ_PTRES-8 @TESTSET_PTRES-21 @TC @regresion
		Scenario: HU8 | TS21 | TC79 - El usuario rellena TODOS los campos requeridos, EXCEPTO el segundo CHECKBOX requerido, y el formulario no se envia correctamente
				Given la pagina de Contacto TC79
				When el usuario NO marca el segundo CHECKBOX requerido TC79
				Then el formulario NO se envia correctamente TC79