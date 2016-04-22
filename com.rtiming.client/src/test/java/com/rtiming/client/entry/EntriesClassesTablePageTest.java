package com.rtiming.client.entry;

import org.eclipse.scout.rt.client.testenvironment.TestEnvironmentClientSession;
import org.eclipse.scout.rt.testing.client.runner.ClientTestRunner;
import org.eclipse.scout.rt.testing.client.runner.RunWithClientSession;
import org.eclipse.scout.rt.testing.platform.runner.RunWithSubject;
import org.junit.runner.RunWith;

import com.rtiming.client.test.AbstractTablePageTest;

@RunWith(ClientTestRunner.class) @RunWithSubject("admin") @RunWithClientSession(TestEnvironmentClientSession.class)
public class EntriesClassesTablePageTest extends AbstractTablePageTest<EntriesClassesTablePage> {

  @Override
  protected EntriesClassesTablePage getTablePage() {
    return new EntriesClassesTablePage();
  }

}
