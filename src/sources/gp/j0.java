package gp;

import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f29403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f29404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f29405g;

    public j0(String dailyReminderTime, String smartReminderTime, String str, boolean z11, boolean z12, boolean z13, boolean z14) {
        kotlin.jvm.internal.m.f(dailyReminderTime, "dailyReminderTime");
        kotlin.jvm.internal.m.f(smartReminderTime, "smartReminderTime");
        this.f29399a = z11;
        this.f29400b = dailyReminderTime;
        this.f29401c = z12;
        this.f29402d = z13;
        this.f29403e = smartReminderTime;
        this.f29404f = z14;
        this.f29405g = str;
    }

    public static j0 a(j0 j0Var, boolean z11, String str, boolean z12, boolean z13, String str2, String str3, int i11) {
        if ((i11 & 1) != 0) {
            z11 = j0Var.f29399a;
        }
        boolean z14 = z11;
        if ((i11 & 2) != 0) {
            str = j0Var.f29400b;
        }
        String dailyReminderTime = str;
        if ((i11 & 4) != 0) {
            z12 = j0Var.f29401c;
        }
        boolean z15 = z12;
        if ((i11 & 8) != 0) {
            z13 = j0Var.f29402d;
        }
        boolean z16 = z13;
        if ((i11 & 16) != 0) {
            str2 = j0Var.f29403e;
        }
        String smartReminderTime = str2;
        boolean z17 = (i11 & 32) != 0 ? j0Var.f29404f : false;
        if ((i11 & 64) != 0) {
            str3 = j0Var.f29405g;
        }
        j0Var.getClass();
        kotlin.jvm.internal.m.f(dailyReminderTime, "dailyReminderTime");
        kotlin.jvm.internal.m.f(smartReminderTime, "smartReminderTime");
        return new j0(dailyReminderTime, smartReminderTime, str3, z14, z15, z16, z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f29399a == j0Var.f29399a && kotlin.jvm.internal.m.a(this.f29400b, j0Var.f29400b) && this.f29401c == j0Var.f29401c && this.f29402d == j0Var.f29402d && kotlin.jvm.internal.m.a(this.f29403e, j0Var.f29403e) && this.f29404f == j0Var.f29404f && kotlin.jvm.internal.m.a(this.f29405g, j0Var.f29405g);
    }

    public final int hashCode() {
        int iE = defpackage.e.e(defpackage.e.d(defpackage.e.e(defpackage.e.e(defpackage.e.d(Boolean.hashCode(this.f29399a) * 31, 31, this.f29400b), 31, this.f29401c), 31, this.f29402d), 31, this.f29403e), 31, this.f29404f);
        String str = this.f29405g;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RemindIndexUiState(dailyReminderEnabled=");
        sb2.append(this.f29399a);
        sb2.append(PQgum.MuZylYkGkR);
        sb2.append(this.f29400b);
        sb2.append(", dailySkipIfCompleted=");
        ep.a.B(", smartReminderEnabled=", ", smartReminderTime=", sb2, this.f29401c, this.f29402d);
        sb2.append(this.f29403e);
        sb2.append(", isLoading=");
        sb2.append(this.f29404f);
        sb2.append(", errorMessage=");
        return ep.a.k(sb2, this.f29405g, ")");
    }
}
