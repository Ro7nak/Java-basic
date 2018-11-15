package com.infosys.infybank.test.suites;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.infosys.infybank.core.service.test.TestCustomerServiceWithCategory;
import com.infosys.infybank.core.service.test.TestRegisterCustomerWithCategory;
import com.infosys.infybank.test.category.ValidCategory;

@RunWith(Categories.class)
@IncludeCategory({ValidCategory.class})
// @ExcludeCategory(InvalidCategory.class) // If we need to exclude some category
@SuiteClasses({ TestRegisterCustomerWithCategory.class, TestCustomerServiceWithCategory.class })
public class CategorySuite {

}