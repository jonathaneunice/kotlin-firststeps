hello.jar: hello.kt
	kotlinc hello.kt -include-runtime -d hello.jar

run: hello.jar
	java -jar hello.jar
