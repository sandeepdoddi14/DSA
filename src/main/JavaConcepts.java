package main;

import java.util.ArrayList;
import java.util.ListIterator;

public class JavaConcepts {

    //sort employee object
    /*
    employees.sort(
    Comparator.comparingDouble(Employee::getSalary)
              .thenComparingInt(Employee::getAge)
              .thenComparingInt(Employee::getId)
              .thenComparing(Employee::getName, Comparator.nullsLast(Comparator.naturalOrder()))
        );
     */

        /*
        fail fast and fail safe
         */

        /*
        iterator and list itertor
         */
        ArrayList<String> list = new ArrayList<>();
        Iterator<String> iterator=list.iterator();
        Boolean hasNext=iterator.hasNext();
        iterator.remove("remove");
        
        ListIterator<String> listIterator=list.listIterator();
        Boolean hasNext1=listIterator.hasNext();
        Boolean hasPrevious1=listIterator.hasPrevious();
        listIterator.add("add");
        ListIterator.set("20")
        listIterator.remove("add");   


        /*
        Thread Local in selenium
        private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

        public void setDriver(WebDriver driverInstance) {
            driver.set(driverInstance);
        }

        public WebDriver getDriver() {
            return driver.get();
        }

        public void unload() {
            driver.remove(); // Prevents memory leaks
        }

        */
    
}
