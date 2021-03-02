@LoginFeature @Sanity
Feature: LoginFeature

  Background:
  User navigates to Facebook
    Given I am on Facebook login page

  @Test1
  Scenario: Verify login fails with incorrect credentials
    When I enter username as "TOM@gmail.com"
    And I enter password as "JERRY"
    Then Login should fail
    And this is a test
