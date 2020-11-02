package maven.com;

import org.sonar.api.Plugin;
import maven.com.page.GwtSamplePage;
import maven.com.resourcetab.GwtSampleResourceTab;

import java.util.Arrays;
import java.util.List;

public class GwtSamplePlugin implements Plugin {

  /**
   * @deprecated this is not used anymore
   */
  public String getKey() {
    return "gwt-sample";
  }

  /**
   * @deprecated this is not used anymore
   */
  public String getName() {
    return "GWT Sample";
  }

  /**
   * @deprecated this is not used anymore
   */
  public String getDescription() {
    return "GWT Sample description";
  }

  public List getExtensions() {
    return Arrays.asList(GwtSampleResourceTab.class, GwtSamplePage.class);
  }

  public String toString() {
    return getKey();
  }
}
