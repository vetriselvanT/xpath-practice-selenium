# XPath Practice – Selenium WebDriver

This repository contains my XPath practice and learning notes for Selenium WebDriver automation testing.

## Topics Covered

* XPath using known attributes
* XPath using visible text
* XPath using partial text
* XPath using multiple attributes
* `starts-with()` function
* `contains()` function
* Handling dynamic attribute values
* Locating elements without depending on tag names

## Practice Website

[HYR Tutorials – Add Padding to Containers](https://www.hyrtutorials.com/p/add-padding-to-containers.html)

## XPath Examples

### 1. Known Attribute – Unknown Tag

```xpath
//*[@height='24']
```

This XPath locates an element based on its `height` attribute without specifying the HTML tag.

---

### 2. Known Attribute

```xpath
//span[@class='bmc-btn-text']
```

Locates a `span` element using its `class` attribute.

---

### 3. Known Visible Text

```xpath
//a[text()='Join Telegram Channel']
```

Locates an anchor element using its complete visible text.

---

### 4. Partial Visible Text

```xpath
//a[contains(text(),'Join')]
```

Useful when only part of the element's visible text is known.

---

### 5. Multiple Attributes

```xpath
//*[@type='button' and
    @aria-busy='false' and
    @data-target='_top' and
    @data-channel-external-id='UCzFPWBdClpZ9afmmyhho4Rg']
```

Multiple attributes can be combined using the `and` operator to create a more specific locator.

---

### 6. Known Starting Text

```xpath
//a[starts-with(text(),'Join')]
```

Locates an element when the beginning of its visible text is known.

---

### 7. Dynamic Attribute Values

```xpath
//*[starts-with(@class,'menu')]
```

```xpath
//*[contains(@class,'tm')]
```

```xpath
//i[contains(@class,'m')]
```

`contains()` and `starts-with()` are useful when attribute values are dynamic or only partially known.

## Key XPath Functions Practiced

| Function        | Purpose                                                  |
| --------------- | -------------------------------------------------------- |
| `text()`        | Locate elements using visible text                       |
| `contains()`    | Match partial text or attribute values                   |
| `starts-with()` | Match text or attributes beginning with a specific value |
| `and`           | Combine multiple conditions                              |

## Goal

The purpose of this practice is to improve my ability to create reliable XPath locators for Selenium WebDriver automation.

More XPath examples and Selenium automation exercises will be added as I continue learning.
