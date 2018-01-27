#Advanced Developer Training Sample Project

Based on AEM API 6.1

Uses aem-uber.jar 6.1.0 "obfuscated-apis" package as dependency to build bundles


Build and install OSGi bundles:
`mvn clean install -P bundle`

Build and install content package and OSGi bundles:
`mvn clean install -P full`

**Use with Eclipse:**

Run first to create Eclipse .project, .classpath and .settings files:

`mvn eclipse:eclipse` (creates Eclipse project files)

`mvn dependency:resolve -Dclassifier=javadoc` (download javadocs)

`mvn dependency:sources` (download all sources)

###Code update necessary due to change in Importer interface!

**Excercise 13:** StockDataImporter.java

The class needs to implement all methods of the Importer interface.

Add the following method to StockDataImporter.java at line 62:
```java
	@Override
	public void importData(final String scheme, final String dataSource, final Resource resource, String login, String password) {
		
	}
```
Get an updated version of the file here: 
<https://wiki.corp.adobe.com/download/attachments/1070772878/StockDataImporter.java?api=v2>

