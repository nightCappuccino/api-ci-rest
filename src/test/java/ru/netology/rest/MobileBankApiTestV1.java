package ru.netology.rest;

import org.junit.jupiter.api.Test;
import io.restassured.http.ContentType;
import static org.hamcrest.Matcher.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;


import static io.restassured.RestAssured.given;

class MobileBankApiTestV1 {
    @Test
    void shouldReturnDemoAccounts() {
      // Given - When - Then
      // Предусловия
      given()
          .baseUri("http://localhost:9999/api/v1")
      // Выполняемые действия
      .when()
          .get("/demo/accounts")
      // Проверки
      .then()
          .statusCode(200);
    }
}
