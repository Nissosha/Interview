
Feature: As a User I want to be able to verify title "Fire TV Stick with Alexa Voice Remote (includes TV controls), HD streaming device"

  @amazon
  Scenario: verify title

  Given User is on Amazon homepage
  When User selects electronics from All dropdown
  Then Verify current title is equal "Amazon.com: Electronics"
  And User finds and click on button "Best sellers"
  Then User finds the first best seller(Fire TV stick) and click on it
  And Verify title is equal "Amazon Fire TV Stick (3rd Gen) with Alexa Voice Remote, Fire Stick Firestick Fire sticks Firesticks, streaming stick"







  # 1. Navigate to https://www.amazon.com/
  #  2. In "All" dropdown select "Electronics"
  #   3. Navigate and click on Search button
  #   4. Verify current title is equal "Amazon.com: Electronics"
  #   5. Find and click on button "Best sellers"
  #   6. Find the first best seller(Fire TV stick) and click on it
  #   7. Verify title is equal "Fire TV Stick 4K streaming device with Alexa Voice Remote"
  