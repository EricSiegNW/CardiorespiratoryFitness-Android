package org.sagebionetworks.bridge.researchstack;

import android.content.Context;

import org.researchstack.backbone.result.StepResult;
import org.researchstack.backbone.step.Step;
import org.researchstack.skin.ActionItem;
import org.researchstack.skin.UiManager;
import org.sagebase.crf.CrfActivitiesFragment;
import org.sagebase.crf.CrfDashboardFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TheMDP on 12/12/16.
 */

public class CrfUiManager extends UiManager {
    /**
     * @return List of ActionItems w/ Fragment class items
     */
    @Override
    public List<ActionItem> getMainTabBarItems() {
        List<ActionItem> navItems = new ArrayList<>();

        navItems.add(new ActionItem.ActionItemBuilder().setId(org.sagebionetworks.research.crf.R.id.nav_activities)
                .setTitle(R.string.rss_activities)
                .setIcon(R.drawable.rss_ic_tab_activities)
                .setClass(CrfActivitiesFragment.class)
                .build());

//        navItems.add(new ActionItem.ActionItemBuilder().setId(org.sagebionetworks.research.crf.R.id.nav_dashboard)
//                .setTitle(R.string.rss_dashboard)
//                .setIcon(R.drawable.rss_ic_tab_dashboard)
//                .setClass(CrfDashboardFragment.class)
//                .build());

        return navItems;
    }

    /**
     * @return List of ActionItems w/ Activity class items. The class items are then used to
     * construct an intent for a MenuItem when {@link org.researchstack.skin.ui.MainActivity#onCreateOptionsMenu}
     * is called
     */
    @Override
    public List<ActionItem> getMainActionBarItems() {
        List<ActionItem> navItems = new ArrayList<>();


        return navItems;
    }

    @Override
    public Step getInclusionCriteriaStep(Context context) {
        return null;
    }

    @Override
    public boolean isInclusionCriteriaValid(StepResult stepResult) {
        return false;
    }

    @Override
    public boolean isConsentSkippable() {
        return true;
    }

}
