import java.util.Optional;

public class Main {
    public static void main (String[] args) {
//        Optional class: used to avoid null pointer exception

        String name= null;
        Optional<String> optName=Optional.ofNullable(name);// of()-> data is not null
        Optional<String> op=Optional.of(name);
        op.ifPresent(System.out::println);
        optName.ifPresent(n-> System.out.println("Name: "+name.toUpperCase()));
//        This will not print as the name is initialzed to null.
        System.out.println(optName.orElse("Name is null"));//-> incase value is noll use default value
        String name2="Riya";
        optName=Optional.ofNullable(name2);
//        optName.ifPresent(n-> System.out.println("Name: "+name2.toUpperCase()));
        System.out.println(optName.orElse("Name is null"));


    }
}