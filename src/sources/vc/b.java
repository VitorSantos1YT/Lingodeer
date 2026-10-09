package vc;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f53836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f53837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f53838c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(View view, fz.c cVar) {
        this.f53837b = view;
        this.f53838c = (n) cVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [fz.c, kotlin.jvm.internal.n] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Integer num = this.f53836a;
        View view = this.f53837b;
        if (num != null) {
            if (num.intValue() == view.getMeasuredWidth()) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
        }
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return;
        }
        Integer num2 = this.f53836a;
        int measuredWidth = view.getMeasuredWidth();
        if (num2 != null && num2.intValue() == measuredWidth) {
            return;
        }
        this.f53836a = Integer.valueOf(view.getMeasuredWidth());
        this.f53838c.invoke(view);
    }
}
