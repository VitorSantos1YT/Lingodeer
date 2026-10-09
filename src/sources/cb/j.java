package cb;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.lang.ref.WeakReference;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.y;
import l1.d2;
import z2.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6812c;

    public /* synthetic */ j(Object obj, int i11, View view) {
        this.f6810a = i11;
        this.f6811b = view;
        this.f6812c = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.f6810a) {
            case 0:
                kotlin.jvm.internal.m.f(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.f6812c).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity == null || iBinder == null) {
                    return;
                }
                ((k) this.f6811b).c(iBinder, activity);
                return;
            case 1:
                AbstractComposeView abstractComposeView = (AbstractComposeView) this.f6811b;
                LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(abstractComposeView);
                if (lifecycleOwner != null) {
                    ((y) this.f6812c).f38361a = o2.a(abstractComposeView, lifecycleOwner.getLifecycle());
                    abstractComposeView.removeOnAttachStateChangeListener(this);
                    return;
                } else {
                    v2.a.c("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
                    throw new KotlinNothingValueException();
                }
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f6810a) {
            case 0:
                kotlin.jvm.internal.m.f(view, "view");
                break;
            case 1:
                break;
            default:
                ((View) this.f6811b).removeOnAttachStateChangeListener(this);
                ((d2) this.f6812c).x();
                break;
        }
    }

    public j(k sidecarCompat, Activity activity) {
        this.f6810a = 0;
        kotlin.jvm.internal.m.f(sidecarCompat, "sidecarCompat");
        this.f6811b = sidecarCompat;
        this.f6812c = new WeakReference(activity);
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
