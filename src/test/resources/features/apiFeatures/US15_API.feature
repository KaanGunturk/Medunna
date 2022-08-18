@APIyasemin
Feature: Api_US015 - Create or Edit Patient by just Admin and Validate with API

  @ApiUS015
  Scenario: TC01506 - Validate patient info with API

    Given mbApi Sign in as an Admin and set the path params for register
    And mbApi Enter expected data for patient
    And mbApi End request and receives response for register
    And mbApi Save all API information for register
    Then mbApi Verify API records for register
    Then mbApi There are no swagger documantation for register
