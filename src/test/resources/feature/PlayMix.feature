Feature: Logged in user should be able to search  for necessary music artist and then  play all available tracks.


 Background: Login into account with correct credentials
  Given User navigates to Mixcloud website
  When User clicks on the login button on page
  And User enters a valid username
  And User enters a valid password
  When User clicks on the log in button
  Then User should be successfully logged in


 Scenario: Add song to favorites
  Given User clicks Search field
  When User enters artistname in the Search field
  Then User opens the artist
  When Open the song
  And Add to favorites
  And Trasition to the main page
  And Go to the favorites
  And Favorite song should be successfully displayed
  And Open favorite song
  Then Delete favorite song