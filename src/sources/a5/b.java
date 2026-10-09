package a5;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.widget.TextView;
import android.window.BackEvent;
import j3.u0;
import j3.x;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(CursorAnchorInfo.Builder builder, u0 u0Var, f2.c cVar) {
        if (cVar.f()) {
            return;
        }
        x xVar = u0Var.f35798b;
        int i11 = xVar.f35818f - 1;
        if (i11 < 0) {
            i11 = 0;
        }
        int iL = hz.b.l(xVar.e(cVar.f26573b), 0, i11);
        int iL2 = hz.b.l(xVar.e(cVar.f26575d), 0, i11);
        if (iL > iL2) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(u0Var.e(iL), xVar.f(iL), u0Var.f(iL), xVar.b(iL));
            if (iL == iL2) {
                return;
            } else {
                iL++;
            }
        }
    }

    public static JobScheduler b(JobScheduler jobScheduler) {
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        kotlin.jvm.internal.m.e(jobSchedulerForNamespace, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
        return jobSchedulerForNamespace;
    }

    public static AccessibilityNodeInfo.AccessibilityAction c() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float d(VelocityTracker velocityTracker, int i11) {
        return velocityTracker.getAxisVelocity(i11);
    }

    public static void e(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int g(ViewConfiguration viewConfiguration, int i11, int i12, int i13) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i11, i12, i13);
    }

    public static int h(ViewConfiguration viewConfiguration, int i11, int i12, int i13) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i11, i12, i13);
    }

    public static boolean i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean j(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static float k(BackEvent backEvent) {
        kotlin.jvm.internal.m.f(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public static void l(PendingIntent pendingIntent) {
        try {
            pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (PendingIntent.CanceledException e8) {
            Objects.toString(pendingIntent);
            e8.toString();
        }
    }

    public static void m(AccessibilityEvent accessibilityEvent, boolean z11) {
        accessibilityEvent.setAccessibilityDataSensitive(z11);
    }

    public static void n(AccessibilityNodeInfo accessibilityNodeInfo, boolean z11) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z11);
    }

    public static void o(TextView textView, int i11, float f5) {
        textView.setLineHeight(i11, f5);
    }

    public static void p(SurfaceView surfaceView) {
        surfaceView.setSurfaceLifecycle(2);
    }

    public static int q(BackEvent backEvent) {
        kotlin.jvm.internal.m.f(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public static float r(BackEvent backEvent) {
        kotlin.jvm.internal.m.f(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public static float s(BackEvent backEvent) {
        kotlin.jvm.internal.m.f(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
