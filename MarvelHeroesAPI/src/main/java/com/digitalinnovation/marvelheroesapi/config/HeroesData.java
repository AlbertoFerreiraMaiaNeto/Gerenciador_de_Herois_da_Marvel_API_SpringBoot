package com.digitalinnovation.marvelheroesapi.config;

import static com.digitalinnovation.marvelheroesapi.constants.HeroesConstant.ENDPOINT_DYNAMO;
import static com.digitalinnovation.marvelheroesapi.constants.HeroesConstant.REGION_DYNAMO;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;

public class HeroesData {
  public static void main(String[] args) throws Exception {

    AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
      .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(ENDPOINT_DYNAMO, REGION_DYNAMO))
      .build();
    DynamoDB dynamoDB = new DynamoDB(client);

    Table table = dynamoDB.getTable("Heroes_Table");

    Item hero = new Item()
      .withPrimaryKey("id", "1")
      .withString("name", "Homem-Aranha")
      .withString("universe", "Marvel")
      .withNumber("films", 5);

    Item hero2 = new Item()
      .withPrimaryKey("id", "2")
      .withString("name", "Hulk")
      .withString("universe", "Marvel")
      .withNumber("films", 8);

    Item hero3 = new Item()
      .withPrimaryKey("id", "3")
      .withString("name", "Wolverine")
      .withString("universe", "Marvel")
      .withNumber("films", 7);

    PutItemOutcome outcome1 = table.putItem(hero);
    PutItemOutcome outcome2 = table.putItem(hero2);
    PutItemOutcome outcome3 = table.putItem(hero3);

  }

}

