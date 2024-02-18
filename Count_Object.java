class Person {
    private static int count = 0;

    public Person( ) {
        count++;
    }

    public static int getCount( ) {
        return count;
    }
}

class Count_Object {
    public static void main(String[] args) {

        Person person1 = new Person( );
        Person person2 = new Person( );
        Person person3 = new Person( );

        System.out.println("Total objects created: " + Person.getCount());
    }
}