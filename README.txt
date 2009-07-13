= What is this

Sample code to show how to do symmetric key encryption in Java.

Note: exception handling is missing in this code.

== Usage

  javac *.java
  java BlowfishKey

== How the Key is generated

# To generate the key
  java BlowfishKeyGenerator

== Example Session

$ javac -classpath .:bcprov-jdk14-143.jar *.java
$ java -cp .:bcprov-jdk14-143.jar Encrypter "hello"
Entered: hello
Encoded: CF%E2%80%98%C3%8Fr%E2%89%88%16%E2%88%82t%C3%9F%E2%80%A22%E2%80%B9F%C3%BB%C3%AD%C3%89%CB%86y%C3%A0%C5%93%CB%98v%C3%81%C3%86%E2%80%A1%E2%88%AB%5D%7D%16%17%E2%80%BA%C2%BB%C2%B6%CB%99%1FT%21%10p9abY%C2%B8%C3%B1%C2%A0z%C3%8Daqe%C2%B5C%3F%22R%E2%88%9E2%1D%12u%12%C3%B5%3B%C2%B7%28%E2%80%98%15%E2%80%B0XW%E2%88%86U%C2%B7%5B%EF%AC%81%C2%A9%1E0%1A%C2%AE%C2%A9%5B%40%09C%E2%84%A2%E2%81%84%E2%80%9A%C2%AC%C3%96%0Cm0%CB%9DI%1E%CB%9A%C3%B9n%14%C2%B1%C3%87jq%176%C2%AE%25K%C3%BF%E2%89%A4%C3%AA0%40%60%C2%B5%C3%B5b%062%C2%BB%E2%80%9D%E2%80%A2%C3%BB3%17
$ java -cp .:bcprov-jdk14-143.jar Decrypter "CF%E2%80%98%C3%8Fr%E2%89%88%16%E2%88%82t%C3%9F%E2%80%A22%E2%80%B9F%C3%BB%C3%AD%C3%89%CB%86y%C3%A0%C5%93%CB%98v%C3%81%C3%86%E2%80%A1%E2%88%AB%5D%7D%16%17%E2%80%BA%C2%BB%C2%B6%CB%99%1FT%21%10p9abY%C2%B8%C3%B1%C2%A0z%C3%8Daqe%C2%B5C%3F%22R%E2%88%9E2%1D%12u%12%C3%B5%3B%C2%B7%28%E2%80%98%15%E2%80%B0XW%E2%88%86U%C2%B7%5B%EF%AC%81%C2%A9%1E0%1A%C2%AE%C2%A9%5B%40%09C%E2%84%A2%E2%81%84%E2%80%9A%C2%AC%C3%96%0Cm0%CB%9DI%1E%CB%9A%C3%B9n%14%C2%B1%C3%87jq%176%C2%AE%25K%C3%BF%E2%89%A4%C3%AA0%40%60%C2%B5%C3%B5b%062%C2%BB%E2%80%9D%E2%80%A2%C3%BB3%17"
Decrypted: hello
