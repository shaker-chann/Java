package designPattern.filterPattern.Criteria;

import designPattern.filterPattern.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @PackageName: designPattern.filterPattern
 * @Author: csc
 * @Create: 2020-08-19 15:36
 * @Version: 1.0
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> result = new ArrayList<>();
        for (Person person: personList){
            if (person.getGender().equalsIgnoreCase("male")){
                result.add(person);
            }
        }
        return result;
    }
}
