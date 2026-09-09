# XPath Practice

## 1. Known Attribute – Unknown Tag

//*[@height='24']

## 2. Known Attribute

//span[@class='bmc-btn-text']

## 3. Known Visible Text

//a[text()='Join Telegram Channel']

## 4. Partial Visible Text

//a[contains(text(),'Join')]

## 5. Multiple Attributes

//*[@type='button' and @aria-busy='false' and @data-target='_top']

## 6. Starting Text

//a[starts-with(text(),'Join')]

## 7. Dynamic Attribute Values

//*[starts-with(@class,'menu')]

//*[contains(@class,'tm')]

//i[contains(@class,'m')]
