Feature: Validating register API
#  @AddPlace @Regression
  Scenario Outline: Verify if User is being Succesfully registered using RegisterAPI
    Given User register with "<email>" and "<password>"
    When user calls " Register" with "POST" http request
    Then the API call got success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
#    And verify place_Id created maps to "<name>" using "getPlaceAPI"

    Examples:
      |name 	 | language |address		   |
      |AAhouse |  English |World cross center|