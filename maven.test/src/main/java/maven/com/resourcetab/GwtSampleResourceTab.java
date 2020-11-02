package maven.com.resourcetab;

import org.sonar.api.web.GwtPage;
import org.sonar.api.web.NavigationSection;
import org.sonar.api.web.UserRole;

@NavigationSection(NavigationSection.RESOURCE_TAB)
@UserRole(UserRole.USER)
public class GwtSampleResourceTab extends GwtPage {
  public String getTitle() {
    return "Sample";
  }

  public String getGwtId() {
    return "maven.com.resourcetab.SampleResourceTab";
  }
}