# DemoMetamodels
Ecore metamodels based on EMF for demonstrating MDSD techniques

| Metamodel | Artifact |
| --- | --- |
| Addresses | `tools.vitruv:edu.kit.ipd.sdq.metamodels.addresses` |
| AUTOSAR | `tools.vitruv:edu.kit.ipd.sdq.metamodels.autosar` |
| Confidentiality | `tools.vitruv:edu.kit.ipd.sdq.metamodels.confidentiality4cbse` |
| Families | `tools.vitruv:edu.kit.ipd.sdq.metamodels.families` |
| Insurance | `tools.vitruv:edu.kit.ipd.sdq.metamodels.insurance` |
| JOANA | `tools.vitruv:edu.kit.ipd.sdq.metamodels.joana` |
| Persons | `tools.vitruv:edu.kit.ipd.sdq.metamodels.persons` |
| Recipients | `tools.vitruv:edu.kit.ipd.sdq.metamodels.recipients` |
| Simulink | `tools.vitruv:edu.kit.ipd.sdq.metamodels.simulink` |
| Smart Home | `tools.vitruv:edu.kit.ipd.sdq.metamodels.smarthome` |

The metamodels are published to Maven Central as plain jars containing the generated model code and the metamodels (`model/*.ecore`, `model/*.genmodel`).
They only depend on EMF and run on Java 8 or later.
Since EMF packages are not registered by OSGi outside of Eclipse, access a metamodel's package (e.g., `FamiliesPackage.eINSTANCE`) before loading models of it.

The JOANA and confidentiality metamodels refer to metamodels that are not available from Maven Central, so their jars bundle them:
the JOANA jar contains the JaMoPP Java metamodel, and the confidentiality jar contains the Palladio Component Model and the parts of Eclipse CDO it needs (Java 11 or later).
See `META-INF/THIRD-PARTY-NOTICES.txt` in these jars.
If a classpath also contains JaMoPP or the Palladio Component Model, their classes are duplicated, so use the bundled versions there (JaMoPP 1.4.1, PCM 5.1.0).

Up to version 1.10.0, the metamodels were published as Eclipse plug-ins, including edit and editor plug-ins, to an [update site](https://kit-sdq.github.io/updatesite/release/metamodels/demo/).

## Building

Build with JDK 25 or later:

```
./mvnw clean verify
```

Each metamodel module generates its code from `src/main/ecore/*.genmodel` with `workflow/generate.mwe2` into `target/generated-sources/ecore`.
A new metamodel needs its own module with such a workflow and an entry in `metamodels/pom.xml`.

## Releasing

Publishing a GitHub release publishes the metamodels to Maven Central, using the release tag (e.g., `2.0.0`) as the version.
This requires the repository secrets `CENTRAL_USERNAME` and `CENTRAL_PASSWORD` (a Central Portal user token for the `tools.vitruv` namespace) as well as `OSSRH_GPG_SECRET_KEY` and `OSSRH_GPG_SECRET_KEY_PASSWORD`, named as in the Vitruvius repositories.
