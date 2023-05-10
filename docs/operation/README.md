# operation

### Available Operations

* [checkOperation](#checkoperation) - Check if an operation to be created is valid
* [createOperation](#createoperation) - Create an operation to be applied as part of a connection pipeline
* [deleteOperation](#deleteoperation) - Delete an operation
* [getOperation](#getoperation) - Returns an operation
* [listOperationsForConnection](#listoperationsforconnection) - Returns all operations for a connection.
* [updateOperation](#updateoperation) - Update an operation

## checkOperation

Check if an operation to be created is valid

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CheckOperationResponse;
import WayScript.airbyte_test.models.shared.OperatorConfiguration;
import WayScript.airbyte_test.models.shared.OperatorDbt;
import WayScript.airbyte_test.models.shared.OperatorNormalization;
import WayScript.airbyte_test.models.shared.OperatorNormalizationOptionEnum;
import WayScript.airbyte_test.models.shared.OperatorTypeEnum;
import WayScript.airbyte_test.models.shared.OperatorWebhook;
import WayScript.airbyte_test.models.shared.OperatorWebhookDbtCloud;
import WayScript.airbyte_test.models.shared.OperatorWebhookWebhookTypeEnum;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.OperatorConfiguration req = new OperatorConfiguration(OperatorTypeEnum.DBT) {{
                dbt = new OperatorDbt("quaerat") {{
                    dbtArguments = "ipsum";
                    dockerImage = "ducimus";
                    gitRepoBranch = "laudantium";
                }};;
                normalization = new OperatorNormalization() {{
                    option = OperatorNormalizationOptionEnum.BASIC;
                }};;
                webhook = new OperatorWebhook() {{
                    dbtCloud = new OperatorWebhookDbtCloud(701786L, 643997L);;
                    executionBody = "odit";
                    executionUrl = "ad";
                    webhookConfigId = "317747dc-915a-4d2c-af5d-d6723dc0f5ae";
                    webhookType = OperatorWebhookWebhookTypeEnum.DBT_CLOUD;
                }};;
            }};            

            CheckOperationResponse res = sdk.operation.checkOperation(req);

            if (res.checkOperationRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## createOperation

Create an operation to be applied as part of a connection pipeline

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.CreateOperationResponse;
import WayScript.airbyte_test.models.shared.OperationCreate;
import WayScript.airbyte_test.models.shared.OperatorConfiguration;
import WayScript.airbyte_test.models.shared.OperatorDbt;
import WayScript.airbyte_test.models.shared.OperatorNormalization;
import WayScript.airbyte_test.models.shared.OperatorNormalizationOptionEnum;
import WayScript.airbyte_test.models.shared.OperatorTypeEnum;
import WayScript.airbyte_test.models.shared.OperatorWebhook;
import WayScript.airbyte_test.models.shared.OperatorWebhookDbtCloud;
import WayScript.airbyte_test.models.shared.OperatorWebhookWebhookTypeEnum;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.OperationCreate req = new OperationCreate("aspernatur",                 new OperatorConfiguration(OperatorTypeEnum.WEBHOOK) {{
                                dbt = new OperatorDbt("neque") {{
                                    dbtArguments = "officia";
                                    dockerImage = "suscipit";
                                    gitRepoBranch = "harum";
                                }};;
                                normalization = new OperatorNormalization() {{
                                    option = OperatorNormalizationOptionEnum.BASIC;
                                }};;
                                webhook = new OperatorWebhook() {{
                                    dbtCloud = new OperatorWebhookDbtCloud(496578L, 42454L);;
                                    executionBody = "perferendis";
                                    executionUrl = "laudantium";
                                    webhookConfigId = "78756143-f5a6-4c98-b555-54080d40bcac";
                                    webhookType = OperatorWebhookWebhookTypeEnum.DBT_CLOUD;
                                }};;
                            }};, "c6cbd6b5-f3ec-4909-b04f-926bad255381");            

            CreateOperationResponse res = sdk.operation.createOperation(req);

            if (res.operationRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## deleteOperation

Delete an operation

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.DeleteOperationResponse;
import WayScript.airbyte_test.models.shared.OperationIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.OperationIdRequestBody req = new OperationIdRequestBody("9b474b0e-d20e-4562-88ff-f639a910abdc");            

            DeleteOperationResponse res = sdk.operation.deleteOperation(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## getOperation

Returns an operation

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.GetOperationResponse;
import WayScript.airbyte_test.models.shared.OperationIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.OperationIdRequestBody req = new OperationIdRequestBody("ab626766-96e1-4ec0-8221-b335d89acb3e");            

            GetOperationResponse res = sdk.operation.getOperation(req);

            if (res.operationRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## listOperationsForConnection

List operations for connection.

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.ListOperationsForConnectionResponse;
import WayScript.airbyte_test.models.shared.ConnectionIdRequestBody;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.ConnectionIdRequestBody req = new ConnectionIdRequestBody("cfda8d0c-549e-4f03-8049-78a61fa1cf20");            

            ListOperationsForConnectionResponse res = sdk.operation.listOperationsForConnection(req);

            if (res.operationReadList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## updateOperation

Update an operation

### Example Usage

```java
package hello.world;

import WayScript.airbyte_test.AirbyteTest;
import WayScript.airbyte_test.models.operations.UpdateOperationResponse;
import WayScript.airbyte_test.models.shared.OperationUpdate;
import WayScript.airbyte_test.models.shared.OperatorConfiguration;
import WayScript.airbyte_test.models.shared.OperatorDbt;
import WayScript.airbyte_test.models.shared.OperatorNormalization;
import WayScript.airbyte_test.models.shared.OperatorNormalizationOptionEnum;
import WayScript.airbyte_test.models.shared.OperatorTypeEnum;
import WayScript.airbyte_test.models.shared.OperatorWebhook;
import WayScript.airbyte_test.models.shared.OperatorWebhookDbtCloud;
import WayScript.airbyte_test.models.shared.OperatorWebhookWebhookTypeEnum;

public class Application {
    public static void main(String[] args) {
        try {
            AirbyteTest sdk = AirbyteTest.builder()
                .build();

            WayScript.airbyte_test.models.shared.OperationUpdate req = new OperationUpdate("commodi", "88f77c1f-fc71-4dca-963f-2a3c80a97ff3",                 new OperatorConfiguration(OperatorTypeEnum.NORMALIZATION) {{
                                dbt = new OperatorDbt("non") {{
                                    dbtArguments = "optio";
                                    dockerImage = "illum";
                                    gitRepoBranch = "at";
                                }};;
                                normalization = new OperatorNormalization() {{
                                    option = OperatorNormalizationOptionEnum.BASIC;
                                }};;
                                webhook = new OperatorWebhook() {{
                                    dbtCloud = new OperatorWebhookDbtCloud(945320L, 562066L);;
                                    executionBody = "ipsam";
                                    executionUrl = "esse";
                                    webhookConfigId = "a9e61876-c6ab-421d-a9df-c94d6fecd799";
                                    webhookType = OperatorWebhookWebhookTypeEnum.DBT_CLOUD;
                                }};;
                            }};);            

            UpdateOperationResponse res = sdk.operation.updateOperation(req);

            if (res.operationRead != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
