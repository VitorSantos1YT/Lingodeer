package hu;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f33776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f33777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f33778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f33779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f33780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f33781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f33782k;

    public b(int i11, int i12, String str, int i13, a dayStreakType, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, c streakBgType) {
        kotlin.jvm.internal.m.f(dayStreakType, "dayStreakType");
        kotlin.jvm.internal.m.f(streakBgType, "streakBgType");
        this.f33772a = i11;
        this.f33773b = i12;
        this.f33774c = str;
        this.f33775d = i13;
        this.f33776e = dayStreakType;
        this.f33777f = z11;
        this.f33778g = z12;
        this.f33779h = z13;
        this.f33780i = z14;
        this.f33781j = z15;
        this.f33782k = streakBgType;
    }

    public static b a(b bVar, a aVar, boolean z11, boolean z12, boolean z13, c cVar, int i11) {
        int i12 = bVar.f33772a;
        int i13 = bVar.f33773b;
        String date = bVar.f33774c;
        int i14 = bVar.f33775d;
        if ((i11 & 16) != 0) {
            aVar = bVar.f33776e;
        }
        a dayStreakType = aVar;
        if ((i11 & 32) != 0) {
            z11 = bVar.f33777f;
        }
        boolean z14 = z11;
        boolean z15 = (i11 & 64) != 0 ? bVar.f33778g : z12;
        boolean z16 = (i11 & 128) != 0 ? bVar.f33779h : z13;
        boolean z17 = bVar.f33780i;
        boolean z18 = bVar.f33781j;
        c streakBgType = (i11 & 1024) != 0 ? bVar.f33782k : cVar;
        bVar.getClass();
        kotlin.jvm.internal.m.f(date, "date");
        kotlin.jvm.internal.m.f(dayStreakType, "dayStreakType");
        kotlin.jvm.internal.m.f(streakBgType, "streakBgType");
        return new b(i12, i13, date, i14, dayStreakType, z14, z15, z16, z17, z18, streakBgType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f33772a == bVar.f33772a && this.f33773b == bVar.f33773b && kotlin.jvm.internal.m.a(this.f33774c, bVar.f33774c) && this.f33775d == bVar.f33775d && this.f33776e == bVar.f33776e && this.f33777f == bVar.f33777f && this.f33778g == bVar.f33778g && this.f33779h == bVar.f33779h && this.f33780i == bVar.f33780i && this.f33781j == bVar.f33781j && this.f33782k == bVar.f33782k;
    }

    public final int hashCode() {
        return this.f33782k.hashCode() + defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e((this.f33776e.hashCode() + defpackage.e.b(this.f33775d, defpackage.e.d(defpackage.e.b(this.f33773b, Integer.hashCode(this.f33772a) * 31, 31), 31, this.f33774c), 31)) * 31, 31, this.f33777f), 31, this.f33778g), 31, this.f33779h), 31, this.f33780i), 31, this.f33781j);
    }

    public final String toString() {
        StringBuilder sbK = w4.c.k("DayStreakCalendarDay(day=", this.f33772a, ", month=", this.f33773b, ", date=");
        sbK.append(this.f33774c);
        sbK.append(", dayOfYear=");
        sbK.append(this.f33775d);
        sbK.append(", dayStreakType=");
        sbK.append(this.f33776e);
        sbK.append(", isMilestone=");
        sbK.append(this.f33777f);
        sbK.append(", isPassedStreak=");
        ep.a.B(", isCurrentDay=", ", isPreMonthDay=", sbK, this.f33778g, this.f33779h);
        ep.a.B(", isNextMonthDay=", ", streakBgType=", sbK, this.f33780i, this.f33781j);
        sbK.append(this.f33782k);
        sbK.append(")");
        return sbK.toString();
    }

    public /* synthetic */ b(String str, int i11, int i12, int i13, int i14) {
        this(i11, i12, str, i13, a.EMPTY, false, false, false, (i14 & 256) == 0, (i14 & 512) == 0, c.TYPE_EMPTY);
    }
}
