package gp;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f29381c;

    public g0(Context context, int i11, int i12) {
        kotlin.jvm.internal.m.f(context, "context");
        this.f29379a = i11;
        this.f29380b = i12;
        this.f29381c = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f29379a == g0Var.f29379a && this.f29380b == g0Var.f29380b && kotlin.jvm.internal.m.a(this.f29381c, g0Var.f29381c);
    }

    public final int hashCode() {
        return this.f29381c.hashCode() + defpackage.e.b(this.f29380b, Integer.hashCode(this.f29379a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbK = w4.c.k("UpdateDailyReminderTime(hour=", this.f29379a, ", minute=", this.f29380b, ", context=");
        sbK.append(this.f29381c);
        sbK.append(")");
        return sbK.toString();
    }
}
