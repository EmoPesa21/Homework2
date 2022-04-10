package homework;

public class Task4 {
    public static void main(String[] args){
        String myName = "Emre";
        String surname = "Ahmed";
        String otherName = "Vlado";
        String otherSurname = "Georgiev";
        String sentence = "are bestfriends";
        String word = "and";
        int age = 19;
        int age2 = 18;
    System.out.println(myName);
    System.out.println(myName.equals(otherName)); //false
    System.out.println(myName.equalsIgnoreCase(otherName)); //false
    System.out.println(myName.compareTo(otherName));
    System.out.println(myName.concat(" ").concat("Ahmed"));
    System.out.println(myName + " " + age);
    System.out.println(myName + " " + surname + " " + age );
    System.out.println(otherName+" "+ otherSurname + " " + age2);
    System.out.println((myName + " " + surname + " " + age ).equals(otherName+" "+ otherSurname + " " + age2));
    System.out.println(myName+" " + word + " " +otherName + " " + sentence);


    }
}
