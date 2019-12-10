# ris-webclient
Grunstücksinformation - Web GIS Client (realty information system)

```
mvn archetype:generate \
   -DarchetypeGroupId=net.ltgt.gwt.archetypes \
   -DarchetypeVersion=LATEST \
   -DarchetypeArtifactId
```

```
mvn gwt:codeserver -pl *-client -am
```

```
mvn jetty:run -pl *-server -am -Denv=dev
```

see: https://github.com/tbroyer/gwt-maven-archetypes/

