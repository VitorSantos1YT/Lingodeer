package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f1865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f1866b;

    public x(y yVar, s0 s0Var) {
        this.f1866b = yVar;
        this.f1865a = s0Var;
    }

    @Override // androidx.fragment.app.s0
    public final View b(int i11) {
        s0 s0Var = this.f1865a;
        if (s0Var.c()) {
            return s0Var.b(i11);
        }
        Dialog dialog = this.f1866b.N;
        if (dialog != null) {
            return dialog.findViewById(i11);
        }
        return null;
    }

    @Override // androidx.fragment.app.s0
    public final boolean c() {
        return this.f1865a.c() || this.f1866b.R;
    }
}
