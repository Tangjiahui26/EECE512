Arguments for BatchApkTester:
/path/to/folder/of/apks /path/to/SDK-platforms [/path/to/staring/apk]

Arguments for SingleApkAnalyzer:
/path/to/apk /path/to/SDK-platforms

Arguments for ApkDecoder:
-allow-phantom-refs -android-jars /path/to/SDK-platforms -process-dir /path/to/apk -x android.*

Arguments for FlowDroid:
/path/to/apk  /path/to/SDK-platforms --pathalgo CONTEXTSENSITIVE --paths --aplength n

Guide to create dummy edge:
https://github.com/Sable/soot/commit/e6a2dc43732545680fb1a1a746082c11767923f0#diff-ac960532cd08e279fd71b1d4ca9e964c

