# test-automation-webshop-in-beta

<a id="readme-top"></a>

## About The Project

This project is a Selenium-Java based test automation framework designed to test the functionality
and performance of an online webshop. The goal of this project is to ensure the webshop operates
seamlessly, providing a smooth and reliable user experience for customers. By automating critical
test cases, the project helps maintain the webshop's reliability, security, and responsiveness.

## The System Under Test - [Swag Labs][swag-labs-url]

Swag Labs is a demo e-commerce website designed for testing and practicing web automation techniques.
It simulates a fully functional online store where users can log in, browse products, add items to
their shopping cart, and proceed through a checkout process.

### Built With

* [![Selenium][Selenium]][Selenium-url]
* [![Maven][Maven]][Maven-url]
* [![JUnit][JUnit]][JUnit-url]
* [![java][java]][java-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Getting Started

### Prerequisites

1. **Java Development Kit (JDK) 8 or higher**
    - Ensure that you have Java installed on your system, as the project is based on Java. You can download the JDK
      from [Oracle's official website][oracle-url] or use a package manager like sdkman or Homebrew (on macOS).

To verify installation, run the following command in your terminal:

```shell
java -version
```

2. **Apache Maven**
    - Maven is used to manage dependencies and automate builds. You’ll need to have it installed to run the project.

    - Download and install Maven from [here] [Maven-url].
    - Check if Maven is installed by running:

```shell
mvn -version
```

3. **Chrome Browser**
    - The project uses ChromeDriver for running Selenium tests, so you need to have Google Chrome installed.
    - You can download it from [here][chrome-url].

4. **ChromeDriver**
    - ChromeDriver is required to control Chrome via Selenium. Make sure you download the correct version of
      ChromeDriver that matches your installed Chrome browser version.
    - Download ChromeDriver from the official site: [ChromeDriver Downloads][chrome-driver-url]
    - Ensure ChromeDriver is either included in your PATH or the project is configured to point to its location.

5. **JUnit**
   - JUnit is used as the testing framework. It will be managed **automatically** by **Maven** through the pom.xml file, but you can verify that the correct version is included.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Installation

To set up the project locally:
   1. clone this repository
```shell
git clone git@github.com:CodecoolGlobal/test-automation-webshop-in-beta-general-bothbartos.git
```
2. navigate into the project directory

```shell
cd <foldername>
```

### Run the program
```shell
mvn test
```


<p align="right">(<a href="#readme-top">back to top</a>)</p>


### Contributors:


<a href="https://github.com/CodecoolGlobal/test-automation-webshop-in-beta-general-bothbartos/graphs/contributors">
</a>

* https://github.com/bothbartos
* https://github.com/Geonauta11
* https://github.com/ZsoltEmber

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->

[Selenium]: https://img.shields.io/badge/Selenium-grey?style=plastic&logo=selenium&logoColor=green

[Selenium-url]: https://www.selenium.dev/

[Maven]: https://img.shields.io/badge/Maven-grey?style=plastic&logo=apachemaven&logoColor=%23C71A36

[Maven-url]: https://maven.apache.org/

[JUnit]: https://img.shields.io/badge/JUnit5-grey?style=plastic&logo=junit5&logoColor=%2325A162

[Junit-url]: https://junit.org/junit5/

[java]: https://img.shields.io/badge/Java-grey.svg?style=plastic&logo=data:image/svg%2bxml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iaXNvLTg4NTktMSI/Pg0KPCEtLSBVcGxvYWRlZCB0bzogU1ZHIFJlcG8sIHd3dy5zdmdyZXBvLmNvbSwgR2VuZXJhdG9yOiBTVkcgUmVwbyBNaXhlciBUb29scyAtLT4NCjxzdmcgaGVpZ2h0PSI4MDBweCIgd2lkdGg9IjgwMHB4IiB2ZXJzaW9uPSIxLjEiIGlkPSJMYXllcl8xIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiANCgkgdmlld0JveD0iMCAwIDUxMS45OTggNTExLjk5OCIgeG1sOnNwYWNlPSJwcmVzZXJ2ZSI+DQo8Zz4NCgk8cGF0aCBzdHlsZT0iZmlsbDojREIzODBFOyIgZD0iTTI1My40NjQsOTQuODY5Yy0yMy42NTgsMTYuNjM5LTUwLjQ3MSwzNS40OTgtNjQuODM4LDY2LjY5OQ0KCQljLTI0Ljk1NCw1NC40MzUsNTEuMDYyLDExMy44MTIsNTQuMzExLDExNi4zMTNjMC43NTUsMC41ODEsMS42NTksMC44NzEsMi41NiwwLjg3MWMwLjk1NywwLDEuOTE1LTAuMzI3LDIuNjkzLTAuOTc5DQoJCWMxLjUwOS0xLjI2MiwxLjkzNy0zLjQwNiwxLjAzMS01LjE1MmMtMC4yNzUtMC41My0yNy41NjEtNTMuNTMtMjYuNTQ3LTkxLjU1MmMwLjM1OS0xMy4yNDMsMTguODkyLTI4LjI2NiwzOC41MTItNDQuMTcxDQoJCWMxNy45Ny0xNC41NjgsMzguMzQtMzEuMDc5LDUwLjI1OC01MC4zOTRjMjYuMTY0LTQyLjUxNi0yLjkxNi04NC4zMjItMy4yMTMtODQuNzRjLTEuMTU1LTEuNjIyLTMuMjg3LTIuMjA5LTUuMTEtMS40MQ0KCQljLTEuODIxLDAuODA0LTIuODMsMi43NzMtMi40MTQsNC43MmMwLjA1OSwwLjI3Nyw1LjcxNCwyNy45MjMtMTAuMDIyLDU2LjQwNkMyODQuMjAzLDczLjI1LDI2OS45NTksODMuMjY4LDI1My40NjQsOTQuODY5eiIvPg0KCTxwYXRoIHN0eWxlPSJmaWxsOiNEQjM4MEU7IiBkPSJNMzUzLjEzNywxMTMuNjE3YzEuNjY5LTEuMjU3LDIuMTU5LTMuNTUsMS4xNS01LjM4Yy0xLjAxMS0xLjgzLTMuMjExLTIuNjM3LTUuMTY1LTEuODk1DQoJCWMtNC4wMTksMS41MjgtOTguNDE2LDM3LjkxNS05OC40MTYsODEuODhjMCwzMC4zMDcsMTIuOTQ2LDQ2LjMxNywyMi4zOTksNTguMDA5YzMuNzA4LDQuNTg2LDYuOTA5LDguNTQ2LDcuOTY0LDExLjkyNw0KCQljMi45Nyw5Ljc0My00LjA2NiwyNy4zNTMtNy4wMjUsMzMuMzE3Yy0wLjg1MywxLjcxNC0wLjQzNSwzLjc5MiwxLjAxNiw1LjA0NGMwLjc4NCwwLjY3NywxLjc2MywxLjAyMSwyLjc0MywxLjAyMQ0KCQljMC44MzQsMCwxLjY3Mi0wLjI0OCwyLjM5Ni0wLjc1MmMxLjYyMy0xLjEyOCwzOS42NjctMjguMDI2LDMyLjg0NC02MC40MzNjLTIuNTQyLTEyLjMxOC04LjU5NS0yMS4zMTgtMTMuOTM2LTI5LjI2DQoJCWMtOC4yNzQtMTIuMzA1LTE0LjI1LTIxLjE5My01LjE4NC0zNy42MDlDMzA0LjU0NSwxNTAuMzM4LDM1Mi42NSwxMTMuOTgxLDM1My4xMzcsMTEzLjYxN3oiLz4NCjwvZz4NCjxnPg0KCTxwYXRoIHN0eWxlPSJmaWxsOiM3M0ExRkI7IiBkPSJNMTA3LjQxOCwyOTguMjM2Yy0xLjYxOCw0Ljg0NS0wLjg1NCw5LjY1MSwyLjIwNywxMy45MDNjMTAuMjMzLDE0LjIwNyw0Ni40OCwyMi4wMjksMTAyLjA2OCwyMi4wMjkNCgkJYzAuMDAzLDAsMC4wMDUsMCwwLjAwNywwYzcuNTMyLDAsMTUuNDg0LTAuMTQ4LDIzLjYyOS0wLjQ0Yzg4Ljg3NS0zLjE4MSwxMjEuODM5LTMwLjg2OSwxMjMuMTk5LTMyLjA0Ng0KCQljMS40ODItMS4yODMsMS44NzgtMy40MTksMC45NTctNS4xNDdjLTAuOTIyLTEuNzI3LTIuOTA5LTIuNTk1LTQuODA4LTIuMDcyYy0zMS4zMDEsOC41NDYtODkuNzQ4LDExLjU4LTEzMC4yODgsMTEuNTgNCgkJYy00NS4zNjMsMC02OC40NjUtMy4yNjgtNzQuMTIxLTUuNjgxYzIuOTAyLTMuOTg1LDIwLjgwMi0xMS4xMDEsNDIuOTgzLTE1LjQ2NGMyLjEyLTAuNDE2LDMuNTc3LTIuMzc0LDMuMzY3LTQuNTI0DQoJCXMtMi4wMTYtMy43OS00LjE3Ny0zLjc5QzE3OS40MzksMjc2LjU4NCwxMTQuMjM0LDI3Ny42MjgsMTA3LjQxOCwyOTguMjM2eiIvPg0KCTxwYXRoIHN0eWxlPSJmaWxsOiM3M0ExRkI7IiBkPSJNNDA0LjgxMiwyNjkuNzE4Yy0xOC4zMzEsMC0zNS43MTQsOS4xODgtMzYuNDQ2LDkuNTc3Yy0xLjY5NSwwLjkwOC0yLjU1NSwyLjg1Mi0yLjA5LDQuNzINCgkJYzAuNDY3LDEuODY1LDIuMTQ0LDMuMTc2LDQuMDY3LDMuMTc4YzAuMzg5LDAsMzkuMTAyLDAuMzE3LDQyLjYwOCwyMi40MzZjMy4xMDYsMTkuMDgyLTM2LjYyOSw1MC01Mi4yMDIsNjAuMzA0DQoJCWMtMS42ODIsMS4xMTMtMi4zMzUsMy4yNjMtMS41NTQsNS4xMjNjMC42NjUsMS41ODMsMi4yMDYsMi41NzMsMy44NjgsMi41NzNjMC4yOSwwLDAuNTg0LTAuMDMsMC44NzYtMC4wOTINCgkJYzMuNjk2LTAuNzkxLDkwLjQwNi0xOS44OTksODEuMjM4LTcwLjM4NEM0MzkuNTg0LDI3Ni4yMTMsNDIwLjEzOCwyNjkuNzE4LDQwNC44MTIsMjY5LjcxOHoiLz4NCgk8cGF0aCBzdHlsZT0iZmlsbDojNzNBMUZCOyIgZD0iTTM0NS4zNDcsMzYzLjc1NWMwLjMwMi0xLjYxNy0wLjM3MS0zLjI2Mi0xLjcxNy00LjIwN2wtMjAuNzkxLTE0LjU2Mw0KCQljLTEuMDE0LTAuNzEtMi4yOTUtMC45MzMtMy40ODUtMC42MThjLTAuMjE3LDAuMDU1LTIxLjk1OSw1Ljc3MS01My41MjUsOS4yNzZjLTEyLjUyOCwxLjQwNS0yNi41NiwyLjE0Ny00MC41ODIsMi4xNDcNCgkJYy0zMS41NTgsMC01Mi4xOTItMy43MDgtNTUuMTk3LTYuNDI4Yy0wLjM5OC0wLjc2NC0wLjI3Mi0xLjExMS0wLjIwMS0xLjMwNGMwLjU0Ni0xLjUxOCwzLjQ3Mi0zLjMyMiw1LjM1OC00LjAzNg0KCQljMi4wODMtMC43NzEsMy4yMDYtMy4wMzMsMi41NTgtNS4xNTdjLTAuNjQ2LTIuMTI3LTIuODM3LTMuMzc4LTQuOTk5LTIuODU5Yy0yMC44NTYsNS4wMzMtMzEuMDU0LDEyLjA3MS0zMC4zMTIsMjAuOTE4DQoJCWMxLjMxOCwxNS42ODYsMzcuNjUsMjMuNzM3LDY4LjM2NSwyNS44NjVjNC40MTcsMC4zMDIsOS4xOTQsMC40NTUsMTQuMTk1LDAuNDU1YzAuMDAzLDAsMC4wMDUsMCwwLjAwOCwwDQoJCWM1MS4wNzQsMCwxMTYuNTUtMTYuMDI1LDExNy4yMDQtMTYuMTg4QzM0My44MjUsMzY2LjY2NiwzNDUuMDQ0LDM2NS4zNzUsMzQ1LjM0NywzNjMuNzU1eiIvPg0KCTxwYXRoIHN0eWxlPSJmaWxsOiM3M0ExRkI7IiBkPSJNMTg4LjYwMiwzOTcuNDE5YzEuNTc1LTEuMDI0LDIuMjczLTIuOTcxLDEuNzE0LTQuNzY0Yy0wLjU1Ny0xLjc5My0yLjIzNC0yLjk3MS00LjExOC0yLjk0Ng0KCQljLTIuNzk1LDAuMDc0LTI3LjM0OSwxLjE4Mi0yOS4wNjgsMTYuODE1Yy0wLjUyLDQuNjcyLDAuODE4LDguOTQxLDMuOTc5LDEyLjY4NmM4LjgxNiwxMC40NDgsMzIuNjE0LDE2LjY1OCw3Mi43NDEsMTguOTg0DQoJCWM0Ljc0NywwLjI4NSw5LjU2OSwwLjQyOCwxNC4zMzQsMC40MjhjNTEuMDE1LDAsODUuMzczLTE1Ljk3Myw4Ni44MTItMTYuNjUzYzEuMzk1LTAuNjYsMi4zMTUtMi4wMzEsMi4zOTctMy41NzENCgkJcy0wLjY4Ny0zLjAwMS0yLjAwMy0zLjgwNmwtMjYuMjc1LTE2LjA0Yy0wLjkxMi0wLjU1Ni0yLjAwMy0wLjc0LTMuMDQzLTAuNTI3Yy0wLjE2NiwwLjAzNS0xNi44NDksMy40OTUtNDIuMDI2LDYuOTEzDQoJCWMtNC43NjQsMC42NDgtMTAuNzMsMC45NzctMTcuNzMsMC45NzdjLTI1LjE1LDAtNTMuMTI0LTQuMTA5LTU4LjQ4OS02LjhDMTg3Ljc0OSwzOTguNjEzLDE4Ny44NDgsMzk3Ljk3NSwxODguNjAyLDM5Ny40MTl6Ii8+DQoJPHBhdGggc3R5bGU9ImZpbGw6IzczQTFGQjsiIGQ9Ik0yMjQuNDA4LDQ4Ni44NWMxMTYuODU0LTAuMDk5LDE3OS41NzEtMjAuODgsMTkxLjY1My0zMy45NTdjNC4yNzctNC42MjYsNC43MzktOS4wMDYsNC4zNzYtMTEuODY3DQoJCWMtMC44OTgtNy4wNC03LjMxMS0xMS4zNS04LjAzOC0xMS44MThjLTEuNzU0LTEuMTI4LTQuMTA4LTAuODMzLTUuNDc2LDAuNzQ1Yy0xLjM2NSwxLjU3OC0xLjM5NywzLjg4NC0wLjAyNyw1LjQ2MQ0KCQljMC43MzcsMC45NDgsMS4xNjMsMi41MzUtMC45OTIsNC42OTJjLTQuODMsNC41MTEtNTMuNTQ1LDE4LjIwNC0xMzQuNjU2LDIyLjMxOGMtMTEuMTExLDAuNTc3LTIyLjc2NSwwLjg3MS0zNC42MzYsMC44NzMNCgkJYy03Mi42MjMsMC0xMjUuNzcyLTkuOTQ4LTEzMi43NDktMTUuNzQ0YzIuNjg5LTMuODY0LDIxLjQ4OS0xMC4wMzcsNDEuNDgyLTEzLjUyOWMyLjI1My0wLjM5MywzLjc3NS0yLjUxNiwzLjQyNi00Ljc3Ng0KCQljLTAuMzQ5LTIuMjU5LTIuNDMyLTMuODE0LTQuNzA5LTMuNTE5Yy0wLjU2NCwwLjA3Ny0yLjQ3OCwwLjE5MS00LjY5NCwwLjMyN2MtMzIuOTg4LDIuMDE0LTcxLjEwOSw2LjUwMy03My4wOTgsMjMuNQ0KCQljLTAuNjA0LDUuMTc5LDAuOTM1LDkuODgxLDQuNTc2LDEzLjk3M2M4LjkwOSwxMC4wMSwzNC41MTYsMjMuMzE5LDE1My41NTgsMjMuMzE5QzIyNC40MDYsNDg2Ljg1LDIyNC40MDYsNDg2Ljg1LDIyNC40MDgsNDg2Ljg1eiINCgkJLz4NCgk8cGF0aCBzdHlsZT0iZmlsbDojNzNBMUZCOyIgZD0iTTQzOS4wMTMsNDU2LjU3OGMtMS42NTItMC43NjQtMy42MDQtMC4zNzgtNC44MzYsMC45NTJjLTAuMTcxLDAuMTg1LTE3Ljc0LDE4LjU1Ni03MC41NjQsMjkuMzQ0DQoJCWMtMjAuMjIzLDQuMDUyLTU4LjE4Myw2LjEwNy0xMTIuODI2LDYuMTA3Yy01NC43NDUsMC0xMDYuODM4LTIuMTU0LTEwNy4zNTctMi4xNzZjLTIuMTc2LTAuMTA2LTQuMDM3LDEuNDc2LTQuMzMzLDMuNjE4DQoJCWMtMC4yOTcsMi4xNCwxLjA4Myw0LjE1OCwzLjE4NCw0LjY1OGMwLjU0MiwwLjEyOCw1NS4xMzUsMTIuOTE4LDEyOS43NzksMTIuOTE4YzM1LjgwMSwwLDcwLjYzOS0yLjkwNywxMDMuNTQ4LTguNjQ1DQoJCWM2MS4zNjEtMTAuNzU3LDY1LjY1Ny00MS4xODMsNjUuODEtNDIuNDczQzQ0MS42MzIsNDU5LjA3OCw0NDAuNjYyLDQ1Ny4zNDIsNDM5LjAxMyw0NTYuNTc4eiIvPg0KPC9nPg0KPC9zdmc+

[java-url]: https://www.java.com/en/

[swag-labs-url]: https://www.saucedemo.com/

[oracle-url]: https://www.oracle.com/java/technologies/downloads/?er=221886

[chrome-url]: https://www.google.com/chrome/browser-tools/

[chrome-driver-url]: https://developer.chrome.com/docs/chromedriver/downloads
