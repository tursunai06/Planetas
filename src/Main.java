import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Country country = new Country();
        country.setName("USA");
        country.setCode(840);
        country.setLanguage("english");
        country.setPopulation(331);

        Country country1 = new Country();
        country1.setName("Kyrgyzstan");
        country1.setCode(417);
        country1.setLanguage("kyrgyz");
        country1.setPopulation(7);

        Country country2 = new Country();
        country2.setName("Korea");
        country2.setCode(410);
        country2.setLanguage("korean");
        country2.setPopulation(51);
        Country[] countries = {country, country2, country1};
        for (Country c : countries) {
            System.out.println("\nName: " + c.getName() + "" + "\nCode: " + c.getCode() + "" + "\nPopulation: " + c.getPopulation() + "" + "\nLanguage:" + c.getLanguage());

            City city = new City();
            city.setName("Bishkek");
            city.setPopulation(1000000);
            city.setCode(312);

            City city1 = new City();
            city1.setName("Washington");
            city1.setCode(1202);
            city1.setPopulation(712816);

            City city2 = new City();
            city2.setName("Seul");
            city2.setCode(82);
            city2.setPopulation(9776000);

            City[] cities = {city, city1, city2};
            for (City f : cities) {
                System.out.println("\nName: " + f.getName() + "\nCode: " + f.getCode() + "\nPopulation: " + f.getPopulation());


                Person person = new Person();
                person.setFirstName("Nuriza");
                person.setLastName("Bolotovna");
                person.setAge(36);
                person.setGender('W');
                person.setProfession("Teacher");

                Person person1 = new Person();
                person1.setFirstName("Datka");
                person1.setLastName("Mamatganova");
                person1.setAge(22);
                person1.setGender('W');
                person1.setProfession("mentor");

                Person person2 = new Person();
                person2.setFirstName("Sadyr");
                person2.setLastName("Japarov");
                person2.setAge(54);
                person2.setGender('M');
                person2.setProfession("President");
                Person[] persons = {person, person1, person2};
                for (Person t : persons) {
                    System.out.println("\nFirstname: " + t.getFirstName() + "\nLastname: " + t.getLastName() + "\nAge: " + t.getAge() +
                            "\nGender:" + t.getGender() + "\nProfession: " + t.getProfession());

                }

                Address address = new Address();
                address.setName("Home address");
                address.setStreet("Tynystanova 2");
                address.setRegion("Chui");


                Address address1 = new Address();
                address1.setName("Work address");
                address1.setName("Gragdanscaya 119");
                address1.setRegion("Chui");

                Address address2 = new Address();
                address2.setName("Study address");
                address2.setStreet("Akhunbaeva 92");
                address2.setRegion("Chui");
                Address [] addresses = {address, address1, address2};
                for (Address r: addresses) {
                    System.out.println("\nName: " + r.getName() + "\nStreet: " + r.getStreet()+ "\nRegion: " + r.getRegion());

                }



            }
        }}}


//        Account account = new Account();
//        account.name = "Kanat";
//        account.balance = 2000;
//        Account account1 = new Account();
//        account1.name1 = "Eldan";
//        account1.balance =

//        Square square = new Square();
//        square.setUzunu(10);
//        square.setTuurasi(10);
//        square.method(square.getTuurasi(), square.getUzunu());


//        Course course = new Course();
//        course.setName("Peacsoft");
//        course.setNumber(1);
//        course.setStartDate(3);



//       int month = new Scanner(System.in).nextInt();
//       Seasons season = new Seasons();
//       season.method(month);
//





//        Elements element = new Elements();
//        element.name = "Oxygenium";
//        element.massa = 16;
//        element.order = 8;
//        element.getInfo();
//
//
//        Elements element1 = new Elements();
//        element1.name = "Natrium";
//        element1.massa = 23;
//        element1.order = 11;
//        element1.getInfo();

//       Passport passport = new Passport();
//       passport.firstname = "Райым";
//       passport.lasttname = "Ысмайылов";
//       passport.gender = "Э/М";
//       passport.countryOfBirth = "Кыргыз Республикасы";
//       passport.date = LocalDate.of(1971, 05,03);;
//       passport.ID = 1877213;
//       passport.getPassportInfo();
//



