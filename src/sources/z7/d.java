package z7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f59009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f59010f;

    public d(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f59005a = i11;
        this.f59006b = i12;
        this.f59007c = i13;
        this.f59008d = i14;
        this.f59009e = i15;
        this.f59010f = i16;
    }

    public final int a() {
        int i11 = this.f59005a;
        if (i11 == 1935960438) {
            return 2;
        }
        if (i11 == 1935963489) {
            return 1;
        }
        if (i11 == 1937012852) {
            return 3;
        }
        b7.a.B("Found unsupported streamType fourCC: " + Integer.toHexString(i11));
        return -1;
    }

    @Override // z7.a
    public final int getType() {
        return 1752331379;
    }
}
