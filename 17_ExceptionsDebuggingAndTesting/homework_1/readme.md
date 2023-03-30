<h4 fr-original-style="" style="font-size: 1.5rem; margin-top: 0px; margin-bottom: 0.5rem; color: inherit; line-height: 1.2; font-weight: 500; box-sizing: border-box;">Задание 1. Защита от некорректных данных и преждевременного завершения метода, внедрение логирования</h4>
<h5 fr-original-style="" style="font-size: 1.25rem; margin-top: 0px; margin-bottom: 0.5rem; color: inherit; line-height: 1.2; font-weight: 500; box-sizing: border-box;">Что нужно сделать</h5>
<ul fr-original-style="" style="margin-top: 0px; margin-bottom: 1rem; box-sizing: border-box; font-size: 16px; line-height: 22px;"><li fr-original-style="" style="box-sizing: border-box;">Проект <code fr-original-style="" style="box-sizing: border-box;">ConsoleCustomerList</code> — консольное приложение, в котором можно хранить список клиентов. Запустите его, введите слово help в консоль и нажмите Enter. Программа выведет список доступных команд и примеры их выполнения.</li><li fr-original-style="" style="box-sizing: border-box;">Поэкспериментируйте с программой: попробуйте ввести различные значения и команды, которые не будут соответствовать примерам. Добейтесь того, чтобы программа «вылетела», то есть произошёл Exception.</li><li fr-original-style="" style="box-sizing: border-box;">Напишите в классе <code fr-original-style="" style="box-sizing: border-box;">CustomerStorage</code> проекта <meta charset="utf-8" id="isPasted" fr-original-style="" style="box-sizing: border-box;"><span fr-original-style="color: rgb(0, 0, 0); font-family: monospace; font-size: 16px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial; display: inline !important; float: none;" style="color: rgb(0, 0, 0); font-family: monospace; font-size: 16px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: left; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial; float: none; display: inline !important; box-sizing: border-box;">ConsoleCustomerList</span>все варианты защиты от некорректных данных, которые вам удастся придумать и обнаружить. Создайте собственные классы исключений, которые должны выбрасываться:<ul fr-original-style="" style="margin-top: 0px; margin-bottom: 0px; box-sizing: border-box; font-size: 16px; line-height: 22px;"><li fr-original-style="" style="box-sizing: border-box;">при некорректном количестве компонентов в переданной строке с данными;</li><li fr-original-style="" style="box-sizing: border-box;">при неверном формате номера телефона;</li><li fr-original-style="" style="box-sizing: border-box;">при неправильном формате e-mail.</li></ul></li><li fr-original-style="" style="box-sizing: border-box;">Защитите программу от преждевременного завершения метода <code fr-original-style="" style="box-sizing: border-box;">addCustomer()</code> — напишите код, который будет отлавливать исключения и выводить эту информацию в консоль в понятном пользователю виде и в лог (см. ниже).</li><li fr-original-style="" style="box-sizing: border-box;">Подключите библиотеку log4j2 к проекту.</li></ul>
<ul fr-original-style="" style="margin-top: 0px; margin-bottom: 1rem; box-sizing: border-box; font-size: 16px; line-height: 22px;"><li fr-original-style="" style="box-sizing: border-box;">Сделайте два отдельных лога в папке logs проекта с помощью log4j2 и настройте конфигурацию log4j следующим образом:<ul fr-original-style="" style="margin-top: 0px; margin-bottom: 0px; box-sizing: border-box; font-size: 16px; line-height: 22px;"><li fr-original-style="" style="box-sizing: border-box;"><strong fr-original-style="" style="font-weight: 700; box-sizing: border-box;">logs/queries.log</strong> — заполняется информацией обо всех запросах к приложению;</li><li fr-original-style="" style="box-sizing: border-box;"><strong fr-original-style="" style="font-weight: 700; box-sizing: border-box;">logs/errors.log</strong> — заполняется информацией обо всех ошибках (возникших исключениях со всеми деталями).<br fr-original-style="" style="box-sizing: border-box;"></li></ul></li><li fr-original-style="" style="box-sizing: border-box;">Запустите в проекте тесты и убедитесь, что они выполняются успешно.</li></ul>