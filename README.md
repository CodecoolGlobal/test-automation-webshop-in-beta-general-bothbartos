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

<p align="right">(<a href="#readme-top">back to top</a>)</p>
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

[Java]: https://img.shields.io/badge/Java-000000?style=for-the-badge&logo=openjdk

[java-url]: https://www.java.com/en/

[swag-labs-url]: https://www.saucedemo.com/

[oracle-url]: https://www.oracle.com/java/technologies/downloads/?er=221886

[chrome-url]: https://www.google.com/chrome/browser-tools/

[chrome-driver-url]: https://developer.chrome.com/docs/chromedriver/downloads
