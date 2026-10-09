package ve;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final we.c f54000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f54001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f54002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View.OnTouchListener f54003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f54004e = true;

    public h(we.c cVar, View view, View view2) {
        this.f54000a = cVar;
        this.f54001b = new WeakReference(view2);
        this.f54002c = new WeakReference(view);
        this.f54003d = we.h.f(view2);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        m.f(view, "view");
        m.f(motionEvent, "motionEvent");
        View view2 = (View) this.f54002c.get();
        View view3 = (View) this.f54001b.get();
        if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
            c.c(this.f54000a, view2, view3);
        }
        View.OnTouchListener onTouchListener = this.f54003d;
        return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
    }
}
