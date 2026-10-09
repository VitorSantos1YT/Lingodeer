package gp;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f29360b;

    public d0(Context context, boolean z11) {
        kotlin.jvm.internal.m.f(context, "context");
        this.f29359a = z11;
        this.f29360b = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f29359a == d0Var.f29359a && kotlin.jvm.internal.m.a(this.f29360b, d0Var.f29360b);
    }

    public final int hashCode() {
        return this.f29360b.hashCode() + (Boolean.hashCode(this.f29359a) * 31);
    }

    public final String toString() {
        return "ToggleDailyReminderSwitch(enabled=" + this.f29359a + ", context=" + this.f29360b + ")";
    }
}
