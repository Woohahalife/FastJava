package org.example.part4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.part4.model.Person;

import java.lang.reflect.Type;

public class GsonApiTest {
    public static void main(String[] args) {
        Person person = new Person("John", 26);
//        Gson gson = new Gson();

        // GsonBuilder()를 사용해 Gson 객체를 생성하면 객체 생성 과정에서 다양한 옵션을 설정할 수 있다.
        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // setPrettyPrinting(); : GsonBuilder()를 통해 생성된 Json문자열의 가독성을 높여줌

        String toJson = gson.toJson(person); //toJson(Object obj); : 인스턴스를 JSON형태 문자열로 변환

        System.out.printf("--- Person객체를 JSON타입의 문자열로 변환 --- %n%s%n", toJson);

        Person fromJson = gson.fromJson(toJson, Person.class); // fromJson(Json, class<T>); : Json타입의 문자열을 객체로 변환
        System.out.printf("--- JSON타입 문자열을 Person 객체로 변환 --- %n%s%n", fromJson);
    }
}
