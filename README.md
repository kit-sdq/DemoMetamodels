# DemoMetamodels
Ecore metamodels based on EMF for demonstrating MDSD techniques

| Metamodel | Artifact |
| --- | --- |
| Addresses | `edu.kit.ipd.sdq:edu.kit.ipd.sdq.metamodels.addresses` |
| AUTOSAR | `edu.kit.ipd.sdq:edu.kit.ipd.sdq.metamodels.autosar` |
| Confidentiality | `edu.kit.ipd.sdq:edu.kit.ipd.sdq.metamodels.confidentiality4cbse` |
| Families | `edu.kit.ipd.sdq:edu.kit.ipd.sdq.metamodels.families` |
| Insurance | `edu.kit.ipd.sdq:edu.kit.ipd.sdq.metamodels.insurance` |
| JOANA | `edu.kit.ipd.sdq:edu.kit.ipd.sdq.metamodels.joana` |
| Persons | `edu.kit.ipd.sdq:edu.kit.ipd.sdq.metamodels.persons` |
| Recipients | `edu.kit.ipd.sdq:edu.kit.ipd.sdq.metamodels.recipients` |
| Simulink | `edu.kit.ipd.sdq:edu.kit.ipd.sdq.metamodels.simulink` |
| Smart Home | `edu.kit.ipd.sdq:edu.kit.ipd.sdq.metamodels.smarthome` |

The metamodels are published to Maven Central as plain jars containing the generated model code and the metamodels (`model/*.ecore`, `model/*.genmodel`).
They only depend on EMF and run on Java 8 or later.
Since EMF packages are not registered by OSGi outside of Eclipse, access a metamodel's package (e.g., `FamiliesPackage.eINSTANCE`) before loading models of it.

The JOANA and confidentiality metamodels refer to metamodels that are not available from Maven Central, so their jars bundle them:
the JOANA jar contains the JaMoPP Java metamodel, and the confidentiality jar contains the Palladio Component Model and the parts of Eclipse CDO it needs (Java 11 or later).
See `META-INF/THIRD-PARTY-NOTICES.txt` in these jars.
Do not put them on a classpath that also contains JaMoPP or the Palladio Component Model.

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
This requires the repository secrets `CENTRAL_USERNAME` and `CENTRAL_PASSWORD` (a Central Portal user token for the `edu.kit.ipd.sdq` namespace) as well as `GPG_PRIVATE_KEY` and `GPG_PASSPHRASE`.
