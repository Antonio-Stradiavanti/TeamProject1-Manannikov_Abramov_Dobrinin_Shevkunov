package ru.stradiavanti.train_plan_bot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDate;

// Аннотация говорит о том, что данный класс нужно привязать к таблице, параметром
// аннотации является имя таблицы.
// Поля это столбцы таблицы, экземпляры этого класса -> строки таблицы

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "clients")
public class User {

  // Объявляем свойство primary key, он обязательно должен иметь тип Long
  @Id
  private Long chatId;

  private String firstName;
  private String lastName;
  private Long trainerId;
  private LocalDate startSubscriptionDate;
  private LocalDate endSubscriptionDate;

  @Override
  public String toString() {
    return "User{" +
      "chatId=" + chatId +
      ", firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", trainerId=" + trainerId +
      '}';
  }
}
