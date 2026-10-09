package r;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends q4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f48591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f48592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ WeakReference f48593j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o0 f48594k;

    public k0(o0 o0Var, int i11, int i12, WeakReference weakReference) {
        this.f48594k = o0Var;
        this.f48591h = i11;
        this.f48592i = i12;
        this.f48593j = weakReference;
    }

    @Override // q4.a
    public final void j(Typeface typeface) {
        int i11;
        if (Build.VERSION.SDK_INT >= 28 && (i11 = this.f48591h) != -1) {
            typeface = n0.a(typeface, i11, (this.f48592i & 2) != 0);
        }
        o0 o0Var = this.f48594k;
        if (o0Var.m) {
            o0Var.f48616l = typeface;
            TextView textView = (TextView) this.f48593j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new ib.h(textView, o0Var.f48614j, 1, typeface));
                } else {
                    textView.setTypeface(typeface, o0Var.f48614j);
                }
            }
        }
    }

    @Override // q4.a
    public final void i(int i11) {
    }
}
