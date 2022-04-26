gradle :datebase:assemble

gradle help projects - show structure project

buildSrc - booking dir
create new plugin:
- in dir buildSrc create groovy.class package com.itrex.plugin  CustomPlugin implements Plugin<Project>
- new buildSrc/src/main/resources/META-INF/gradle-plugins/custom-itrex.properties
consist - implementation-class=com.itrex.plugin.CustomPlugin
- added   id 'custom-itrex' in plugin how example service build.gradle
- WOW