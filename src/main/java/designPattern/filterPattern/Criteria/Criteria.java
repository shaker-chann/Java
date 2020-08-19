package designPattern.filterPattern.Criteria;

import designPattern.filterPattern.Person;

import java.util.List;

/**
 * @Description:
 * @PackageName: designPattern.filterPattern
 * @Author: csc
 * @Create: 2020-08-19 15:34
 * @Version: 1.0
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> personList);
}
