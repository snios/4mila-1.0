package com.rtiming.client.settings.account;

import org.eclipse.scout.rt.platform.exception.ProcessingException;
import org.eclipse.scout.rt.testing.client.runner.ClientTestRunner;
import org.eclipse.scout.rt.testing.client.runner.RunWithClientSession;
import org.eclipse.scout.rt.testing.platform.runner.RunWithSubject;
import org.junit.runner.RunWith;

import com.rtiming.client.TestClientSession;
import com.rtiming.client.test.AbstractTablePageTest;

@RunWith(ClientTestRunner.class) @RunWithSubject("admin") @RunWithClientSession(TestClientSession.class)
public class AccountClientTablePageTest extends AbstractTablePageTest<AccountClientTablePage> {

  @Override
  protected AccountClientTablePage getTablePage() throws ProcessingException {
    return new AccountClientTablePage(0L);
  }

}
