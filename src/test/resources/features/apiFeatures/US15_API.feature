@APIyasemin
Feature: Api_US015 - Create or Edit Patient by just Admin and Validate with API

  @ApiUS015
  Scenario: TC01506 - Validate patient info with API

    Given yyApi Sign in as an Admin and set the path params for register
    And yyApi Enter expected data for patient
    And yyApi End request and receives response for register
    And yyApi Save all API information for register
    Then yyApi Verify API records for register
    Then yyApi There are no swagger documantation for register
