# Hiberbee Theme family

[![License](https://img.shields.io/github/license/hiberbee/intellij-theme.svg?style=flat-square)](https://opensource.org/licenses/MIT)
[![Github release](https://img.shields.io/github/tag-pre/Hiberbee/intellij-theme.svg?style=flat-square)](https://github.com/Hiberbee/intellij-theme/releases)
[![SemVer](https://img.shields.io/badge/SemVer-2.0.0-blue.svg?style=flat-square)](http://semver.org/spec/v2.0.0.html)
[![Issues](https://img.shields.io/github/issues-raw/hiberbee/intellij-theme.svg?style=flat-square)](https://github.com/Hiberbee/intellij-theme/issues)

## JetBrains IDE
[![Jetbrains Downloads](https://img.shields.io/jetbrains/plugin/d/12118-hiberbee-theme.svg?style=flat-square)](https://plugins.jetbrains.com/plugin/12118-hiberbee-theme)
[![Jetbrains Plugin](https://img.shields.io/jetbrains/plugin/v/12118-hiberbee-theme.svg?style=flat-square)](https://plugins.jetbrains.com/plugin/12118-hiberbee-theme)

![](screenshots/main.png)

## XCode

Place file from `src/xcode/resources/Hiberbee.xccolortheme` in `$HOME/Library/Developer/Xcode/UserData/FontAndColorThemes` directory
![](screenshots/xcode.png)

## Palettes and color identities

### Monokai-desaturated
```scss
$baseRed: rgb(237, 107, 136); // Language keywords
$baseOrange: rgb(238, 155, 112); // Function parameters
$baseYellow: rgb(249, 215, 120); // Strings
$baseGrn: rgb(180, 218, 130); // Functions, methods definition
$baseCyan: rgb(144, 218, 230); // Labels
$baseBlue: rgb(156, 188, 233); // Abstract class or interface names
$baseMagenta: rgb(168, 159, 236); // Properties, fields, variables
```

### Monokai-vibrant
```scss
$saturatedRed: rgb(255, 0, 114); // Special keywords
$saturatedOrange: rgb(253, 151, 31); // Constants
$saturatedYellow: rgb(242, 186, 75); // Annotations, templated strings
$saturatedGreen: rgb(166, 226, 46); // Functions, methods calls
$saturatedCyan: rgb(73, 176, 241); // Concrete class name
$saturatedBlue: rgb(48, 123, 246); // Links, numbers
$saturatedMagenta: rgb(148, 120, 246); // Property, fields
```

### macOS-based
```scss
$macosRed: rgb(236, 95, 93);
$macosOrange: rgb(232, 135, 58);
$macosYellow: rgb(255, 200, 60);
$macosGreen: rgb(120, 183, 86);
$macosCyan: rgb(84, 153, 166);
$macosBlue: rgb(48, 123, 246);
$macosMagenta: rgb(154, 86, 163);
```

### Fifty shades of grey
```scss
$editorBackground: gray(25);
$inactive: gray(35);
$main: gray(45);
$menu: gray(55);
$header: gray(67);
$separator: gray(75);
$border: gray(85);
$selected: gray(95);
$border: gray(100);
$text: gray(125);
$text: gray(150);
$text: gray(175);
$commentText: gray(200);
```

#### Helper function
```scss
@function tint($color, $percent) {
  @return rgb((255 - red($color)) * $percent, (255 - blue($color)) * $percent, (255 - green($color)) * $percent)
}
```
