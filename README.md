# PurchasingBot (in progress)

Bot meant to try to compete with scalpers to buy a GPU or PS5 for my friends.

Uses selenium and a chromedriver provided by selenium to simulate navigating through web pages on Chrome.
Current prototype navigates to my email and sends an email. I started with this to teach myself how to use selenium to navigate web pages, without the risk of accidentally buying something to start. 

Work still to do includes a config file that the user can put their personal information needed for the transaction, like name, address, and credit card info.

Classes are done as interfaces, because ultimately this is something that would want to be unit tested heavily if it involves friends credit card information, and possibly runs the risk of buying the wrong thing, or double charging for example.

In its current form, would have to be custom built for each web page and desired product.
