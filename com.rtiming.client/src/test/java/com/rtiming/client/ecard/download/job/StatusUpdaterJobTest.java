package com.rtiming.client.ecard.download.job;

import org.eclipse.scout.rt.client.testenvironment.TestEnvironmentClientSession;
import org.eclipse.scout.rt.testing.client.runner.ClientTestRunner;
import org.eclipse.scout.rt.testing.client.runner.RunWithClientSession;
import org.eclipse.scout.rt.testing.platform.runner.RunWithSubject;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.rtiming.client.ClientSession;

/**
 * @author amo
 */
@RunWith(ClientTestRunner.class)
@RunWithSubject("admin")
@RunWithClientSession(TestEnvironmentClientSession.class)
public class StatusUpdaterJobTest {

  @Test
  public void testStatusUpdater() {
    String statusText = "Test";
    StatusUpdaterJob job = new StatusUpdaterJob(ClientSession.get(), statusText);
    job.schedule();
    // TODO MIG Assert.assertEquals(job.isWaitFor(), false);
  }

  @Test
  public void testStatusMethod() {
    String statusText = "Test";
    StatusUpdaterJob.setText(statusText, ClientSession.get());
  }

}