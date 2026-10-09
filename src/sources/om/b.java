package om;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.TimeUnit;
import n9.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f45599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ta.a f45600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f45601d = new q(29, false);

    public b(long j11) {
        this.f45598a = j11;
    }

    public final void a(FrameLayout frameLayout) {
        frameLayout.removeAllViews();
        fz.f fVarC = c();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(frameLayout.getContext());
        kotlin.jvm.internal.m.e(layoutInflaterFrom, "from(...)");
        ta.a aVar = (ta.a) fVarC.invoke(layoutInflaterFrom, frameLayout, Boolean.FALSE);
        this.f45600c = aVar;
        kotlin.jvm.internal.m.c(aVar);
        View root = aVar.getRoot();
        kotlin.jvm.internal.m.e(root, "getRoot(...)");
        this.f45599b = root;
        frameLayout.addView(d());
        e();
    }

    public void b() {
        this.f45601d.f();
    }

    public abstract fz.f c();

    public final View d() {
        View view = this.f45599b;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.m.n("view");
        throw null;
    }

    public abstract void e();

    public abstract void f();

    public final void g(FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 0) {
            a(frameLayout);
            return;
        }
        int childCount = frameLayout.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                th.j.a(qx.h.m(frameLayout.getLayoutTransition().getDuration(3), TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new ob.l(24, this, frameLayout), a.f45591b), this.f45601d);
                return;
            }
            frameLayout.removeViewAt(childCount);
        }
    }
}
