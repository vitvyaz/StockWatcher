package ua.vitvyaz.stockwatcher;

import ua.vitvyaz.stockwatcher.client.StockWatcherTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class StockWatcherSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for StockWatcher");
    suite.addTestSuite(StockWatcherTest.class);
    return suite;
  }
}
