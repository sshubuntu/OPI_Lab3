# ОПИ ЛР3

## Цели Ant

- `compile` - компиляция исходников в `build/ant/classes`.
- `build` - вызов `compile` и упаковка исполняемого JAR.
- `clean` - удаление `build/ant` и `dist`.
- `test` - вызывает `build`, затем запускает JUnit-тесты (если есть `src/test/java` и JUnit jars).
- `native2ascii` - копирует и конвертирует `.properties` в `build/ant/native2ascii/ascii`.
- `xml` - валидация XML-файлов проекта.
- `music` - проигрывает сигнал после успешного `build` (PowerShell beep).
- `doc` - генерирует javadoc, MD5/SHA-1, формирует JAR с документацией и checksum.
- `scp` - после `build` отправляет JAR по SCP.
- `diff` - проверяет `svn status`; при отсутствии запрещенных классов выполняет `svn commit`.
- `alt` - делает альтернативную версию через `replace/replaceregexp` и собирает отдельный JAR.
- `team` - экспортирует 3 предыдущие SVN-ревизии, запускает для каждой `build`, пакует JAR в ZIP.
- `env` - собирает и запускает JAR с альтернативными JVM-параметрами.
- `report` - после `test` добавляет XML-отчет в SVN и коммитит.
