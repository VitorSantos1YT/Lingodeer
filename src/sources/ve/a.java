package ve;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public we.c f53968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f53969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f53970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnClickListener f53971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f53972e;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            m.f(view, "view");
            View.OnClickListener onClickListener = this.f53971d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            View view2 = (View) this.f53970c.get();
            View view3 = (View) this.f53969b.get();
            if (view2 == null || view3 == null) {
                return;
            }
            we.c cVar = this.f53968a;
            m.d(cVar, "null cannot be cast to non-null type com.facebook.appevents.codeless.internal.EventBinding");
            c.c(cVar, view2, view3);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
