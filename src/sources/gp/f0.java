package gp;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f29373b;

    public f0(Context context, boolean z11) {
        kotlin.jvm.internal.m.f(context, "context");
        this.f29372a = z11;
        this.f29373b = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f29372a == f0Var.f29372a && kotlin.jvm.internal.m.a(this.f29373b, f0Var.f29373b);
    }

    public final int hashCode() {
        return this.f29373b.hashCode() + (Boolean.hashCode(this.f29372a) * 31);
    }

    public final String toString() {
        return "ToggleSmartReminderSwitch(enabled=" + this.f29372a + ", context=" + this.f29373b + ")";
    }
}
