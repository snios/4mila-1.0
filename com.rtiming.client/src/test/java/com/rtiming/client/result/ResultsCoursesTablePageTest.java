package com.rtiming.client.result;

import org.eclipse.scout.rt.testing.client.runner.ClientTestRunner;
import org.eclipse.scout.rt.testing.client.runner.RunWithClientSession;
import org.eclipse.scout.rt.testing.platform.runner.RunWithSubject;
import org.junit.runner.RunWith;

import com.rtiming.client.TestClientSession;
import com.rtiming.client.test.AbstractTablePageTest;

@RunWith(ClientTestRunner.class) @RunWithSubject("admin") @RunWithClientSession(TestClientSession.class)
public class ResultsCoursesTablePageTest extends AbstractTablePageTest<ResultsCoursesTablePage> {

  @Override
  protected ResultsCoursesTablePage getTablePage() {
    return new ResultsCoursesTablePage();
  }

}
