package gp;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f29387c;

    public h0(Context context, int i11, int i12) {
        kotlin.jvm.internal.m.f(context, "context");
        this.f29385a = i11;
        this.f29386b = i12;
        this.f29387c = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f29385a == h0Var.f29385a && this.f29386b == h0Var.f29386b && kotlin.jvm.internal.m.a(this.f29387c, h0Var.f29387c);
    }

    public final int hashCode() {
        return this.f29387c.hashCode() + defpackage.e.b(this.f29386b, Integer.hashCode(this.f29385a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbK = w4.c.k("UpdateSmartReminderTime(hour=", this.f29385a, ", minute=", this.f29386b, ", context=");
        sbK.append(this.f29387c);
        sbK.append(")");
        return sbK.toString();
    }
}
