package com.java8Features;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String str = "sreekanth@dextris.in";
        //String str = null;

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);//it returns optional.empty

      /*  var strOptional = Optional.of(str);
        System.out.println(strOptional);*/

        Optional<String> optionalString = Optional.ofNullable(str);
        System.out.println(optionalString.get());//it returns optional.empty
        //ofNullable()->this method if value is there ,to print the actual value, otherwise return NoSuchElementException

        if(optionalString.isPresent()){
            System.out.println("Hello : "+optionalString.get());
        }else{
            System.out.println("no value present");
        }
        //isPresent()->If a value is present, isPresent() will return true and get() will return the value
        //ifPresent()->(execute a block of code if the value is present)
        // orElse()->(return a default value if value not present)

        String sOrElse = optionalString.orElse("default@gmail.com");
        System.out.println(sOrElse);

    }
}
