package ia;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import java.util.WeakHashMap;
import sz.xej.iFLeRCXvYCGdPW;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z4.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f34284d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f34285e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f34286f;

    public c(SlidingPaneLayout slidingPaneLayout) {
        this.f34286f = slidingPaneLayout;
    }

    @Override // z4.b
    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f34284d) {
            case 1:
                DrawerLayout drawerLayout = (DrawerLayout) this.f34286f;
                if (accessibilityEvent.getEventType() != 32) {
                    return this.f58810a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
                }
                accessibilityEvent.getText();
                View viewE = drawerLayout.e();
                if (viewE != null) {
                    int iG = drawerLayout.g(viewE);
                    drawerLayout.getClass();
                    WeakHashMap weakHashMap = s0.f58893a;
                    Gravity.getAbsoluteGravity(iG, drawerLayout.getLayoutDirection());
                }
                return true;
            default:
                return super.a(view, accessibilityEvent);
        }
    }

    @Override // z4.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f34284d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
                break;
            default:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
                break;
        }
    }

    @Override // z4.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f34284d) {
            case 0:
                if (((SlidingPaneLayout) this.f34286f).a(view)) {
                    return false;
                }
                return this.f58810a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            default:
                if (DrawerLayout.f1584k0 || DrawerLayout.h(view)) {
                    return this.f58810a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
                }
                return false;
        }
    }

    @Override // z4.b
    public final void d(View view, a5.g gVar) {
        int i11 = this.f34284d;
        Rect rect = this.f34285e;
        View.AccessibilityDelegate accessibilityDelegate = this.f58810a;
        switch (i11) {
            case 0:
                SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) this.f34286f;
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f380a;
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
                accessibilityNodeInfoObtain.getBoundsInScreen(rect);
                gVar.l(rect);
                gVar.y(accessibilityNodeInfoObtain.isVisibleToUser());
                accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
                gVar.m(accessibilityNodeInfoObtain.getClassName());
                gVar.p(accessibilityNodeInfoObtain.getContentDescription());
                accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
                accessibilityNodeInfo.setClickable(accessibilityNodeInfoObtain.isClickable());
                accessibilityNodeInfo.setFocusable(accessibilityNodeInfoObtain.isFocusable());
                accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
                gVar.i(accessibilityNodeInfoObtain.isAccessibilityFocused());
                accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
                accessibilityNodeInfo.setLongClickable(accessibilityNodeInfoObtain.isLongClickable());
                gVar.a(accessibilityNodeInfoObtain.getActions());
                accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities());
                gVar.m("androidx.slidingpanelayout.widget.SlidingPaneLayout");
                gVar.f382c = -1;
                accessibilityNodeInfo.setSource(view);
                WeakHashMap weakHashMap = s0.f58893a;
                Object parentForAccessibility = view.getParentForAccessibility();
                if (parentForAccessibility instanceof View) {
                    gVar.f381b = -1;
                    accessibilityNodeInfo.setParent((View) parentForAccessibility);
                }
                int childCount = slidingPaneLayout.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = slidingPaneLayout.getChildAt(i12);
                    if (!slidingPaneLayout.a(childAt) && childAt.getVisibility() == 0) {
                        childAt.setImportantForAccessibility(1);
                        accessibilityNodeInfo.addChild(childAt);
                    }
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = gVar.f380a;
                if (DrawerLayout.f1584k0) {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                } else {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(accessibilityNodeInfo2);
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain2);
                    gVar.f382c = -1;
                    accessibilityNodeInfo2.setSource(view);
                    WeakHashMap weakHashMap2 = s0.f58893a;
                    Object parentForAccessibility2 = view.getParentForAccessibility();
                    if (parentForAccessibility2 instanceof View) {
                        gVar.f381b = -1;
                        accessibilityNodeInfo2.setParent((View) parentForAccessibility2);
                    }
                    accessibilityNodeInfoObtain2.getBoundsInScreen(rect);
                    gVar.l(rect);
                    gVar.y(accessibilityNodeInfoObtain2.isVisibleToUser());
                    accessibilityNodeInfo2.setPackageName(accessibilityNodeInfoObtain2.getPackageName());
                    gVar.m(accessibilityNodeInfoObtain2.getClassName());
                    gVar.p(accessibilityNodeInfoObtain2.getContentDescription());
                    accessibilityNodeInfo2.setEnabled(accessibilityNodeInfoObtain2.isEnabled());
                    accessibilityNodeInfo2.setFocused(accessibilityNodeInfoObtain2.isFocused());
                    gVar.i(accessibilityNodeInfoObtain2.isAccessibilityFocused());
                    accessibilityNodeInfo2.setSelected(accessibilityNodeInfoObtain2.isSelected());
                    gVar.a(accessibilityNodeInfoObtain2.getActions());
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount2 = viewGroup.getChildCount();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        View childAt2 = viewGroup.getChildAt(i13);
                        if (DrawerLayout.h(childAt2)) {
                            accessibilityNodeInfo2.addChild(childAt2);
                        }
                    }
                }
                gVar.m(iFLeRCXvYCGdPW.RDkqRLfCB);
                accessibilityNodeInfo2.setFocusable(false);
                accessibilityNodeInfo2.setFocused(false);
                accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) a5.c.f359e.f373a);
                accessibilityNodeInfo2.removeAction((AccessibilityNodeInfo.AccessibilityAction) a5.c.f360f.f373a);
                break;
        }
    }

    public c(DrawerLayout drawerLayout) {
        this.f34286f = drawerLayout;
    }
}
