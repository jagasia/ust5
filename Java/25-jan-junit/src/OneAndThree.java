import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
@RunWith(Categories.class)
@SuiteClasses({ MathematicsTest.class, MathematicsTest3.class, MathematicsTest2.class })
@IncludeCategory({User.class})
public class OneAndThree {

}
