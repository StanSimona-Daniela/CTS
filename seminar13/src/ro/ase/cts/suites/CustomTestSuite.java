package ro.ase.cts.suites;

import jdk.jfr.Category;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.categories.TesteRight;
import ro.ase.cts.categories.TesteUrgente;
import ro.ase.cts.tests.GrupaTest;

@RunWith(Categories.class)
@Suite.SuiteClasses({GrupaTest.class})
@Categories.IncludeCategory({ TesteUrgente.class})
@Categories.ExcludeCategory({ TesteRight.class})

public class CustomTestSuite {


}
