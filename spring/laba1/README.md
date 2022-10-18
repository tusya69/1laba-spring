# Лабораторна робота 1

## Team 17:
Самохатня Міліна ІК-03 

Кучерук Анна ІК-03 

Кречківська Тетяна ІК-03 

## [Консольний застосунок HelloWorld](https://github.com/tusya69/spring/tree/main/spring/laba1/MySpringConsoleHelloWorld)

## [Веб-застосунок HelloWorld](https://github.com/tusya69/spring/tree/main/spring/laba1/MySpringWebHelloWorld)
`GET / - виводить "Hello, World!"` 

`GET /info - статична html сторінка з інформацією про команду` 

`GET /moreinfo - статична сторінка з інформацією про кожного члена команди` 

## Контрольні запитання:
### 1) В чому полягає різниця між Spring Framework та Spring Boot?

SpringBoot в основному є розширенням середовища Spring. Він усуває конфігурацію XML, необхідну для налаштування програм Spring, відкриваючи шлях для більш швидкої та ефективної розробки. 
### 2) Для чого в структурі проекту потрібен файл pom.xml?

Інформація для програмного проекту, що підтримується Maven, міститься в файлі XML з ім'ям pom.xml (від Project Object Model). При виконанні Мавен перевіряє перш за все, чи містить цей файл всі необхідні дані і чи всі дані синтаксично правильно записані.
### 3) Для чого потрібна анотація @SpringBootApplication? Що буде, якщо її прибрати?

Анотація Spring Boot @SpringBootApplication використовується для позначення класу конфігурації, який оголошує один або кілька методів @Bean, а також тригерів auto-configuration і сканування компонентів. Це те саме, що оголосити клас з анотаціями @Configuration, @EnableAutoConfiguration і @ComponentScan.
### 4) Для чого потрібен інтерфейс CommandLineRunner?

CommandLineRunner – це функціональний інтерфейс Spring Boot, який використовується для запуску коду при запуску програми. 
### 5) Чим інтерфейс CommandLineRunner відрізняється від ApplicationRunner?

Інтерфейс CommandLineRunner надає доступ до аргументів програми у вигляді простого рядкового масиву, тоді як ApplicationRunner використовує ApplicationArguments.
