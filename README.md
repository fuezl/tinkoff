# Автотесты для сайта https://tinkoff.ru/

___

## Используемые технологии и инструменты

| GitHub | IntelliJ IDEA | Java | Gradle | Junit5 | Selenide |
|:------:|:----:|:----:|:------:|:------:|:--------:|
| <img src="images/GitHub.svg" width="40" height="40"> | <img src="images/IDEA.svg" width="40" height="40"> | <img src="images/JAVA.svg" width="40" height="40"> | <img src="images/Gradle.svg" width="40" height="40"> | <img src="images/Junit5.svg" width="40" height="40"> | <img src="images/Selenide.svg" width="40" height="40"> |

| Jenkins | Selenoid | Allure Report | Allure TestOps | Telegram |
|:--------:|:-------------:|:---------:|:-------:|:--------:|
| <img src="images/Jenkins.svg" width="40" height="40"> | <img src="images/Selenoid.svg" width="40" height="40"> | <img src="images/Allure Report.svg" width="40" height="40"> | <img src="images/Allure TestOps.svg" width="40" height="40"> | <img src="images/Telegram.svg" width="40" height="40"> |

___

## Инструкция по запуску тестов

Запуск тестов происходит через джобу в [Jenkins](https://jenkins.autotests.cloud/job/07-grach17-tinkoff/)

![Jenkins](./images/Jenkins.png)

### Используемые параметры по умолчанию

* browser (default chrome)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)

### Run tests with filled remote.properties:

```bash
gradle clean test
```

### Run tests with not filled remote.properties:

```bash
gradle clean -DremoteDriverUrl=https://user1:1234@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

### Serve report:

```bash
allure serve build/allure-results
```

## Оповещение о результатах прохождения тестов через бот в [телеграмм](https://t.me/autotest_result)

![Telegram](./images/Telegram.png)

## Анализ результатов

Более подробно с результатми тестов (шаги, скриншоты, видео прохождения теста, page source и browser console log) можно
ознакомиться в:

* Jenkins через Allure Reports
  (перейти по ссылке в отчете телеграм)
* и в Allure TestOps.

### Анализ результатов в Jenkins через Allure Reports

![alt "Allure Reports"](./images/Allure_Report.png)

### Анализ результатов в Allure TestOps

![alt "Allure TestOps"](./images/Allure_TestOps.png)

### Интерграция с Jira
#### Отображение тест-кейсов и ланча

![jira](./images/jira.png)

### Видео с примером прохождения теста в selenoid

!["Video from Selenoid"](./images/test__video.gif)