package org.sid.customerfrontthymeleaf.model;


import lombok.*;


@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Product {

  private String id;
  private String name;
  private Double price;
  private int quantity;
}
