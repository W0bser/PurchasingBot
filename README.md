# PurchasingBot (in progress)

Bot meant to try to compete with scalpers to buy a GPU or PS5 for my friends.

Uses selenium and a chromedriver provided by selenium to simulate navigating through web pages on Chrome.
Current prototype navigates to my email and sends an email. I started with this to teach myself how to use selenium to navigate web pages, without the risk of accidentally buying something to start. 

Work still to do includes a config file that the user can put their personal information needed for the transaction such as name, address, and credit card info.

Classes are done as interfaces so that interfaces can be mocked out and unit tests more easily written. This is something that would want to be unit tested heavily since it involves other people's money.

In its current form a custom version of this would have to be written for each specific product on each website.
