package com.codeaffine.gonsole.test;

import org.junit.extensions.cpsuite.ClasspathSuite;
import org.junit.extensions.cpsuite.ClasspathSuite.ClassnameFilters;
import org.junit.runner.RunWith;

@RunWith( ClasspathSuite.class )
@ClassnameFilters( {
  ".*Test",
  "!.*PDETest"
} )
public class AllTests {
}
