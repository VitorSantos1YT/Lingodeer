package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f1456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1457d;

    public c1(c0 c0Var, String str, Object[] objArr) {
        this.f1454a = c0Var;
        this.f1455b = str;
        this.f1456c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f1457d = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 13;
        int i13 = 1;
        while (true) {
            int i14 = i13 + 1;
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 < 55296) {
                this.f1457d = i11 | (cCharAt2 << i12);
                return;
            } else {
                i11 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i13 = i14;
            }
        }
    }

    public final z0 a() {
        int i11 = this.f1457d;
        if ((i11 & 1) != 0) {
            return z0.PROTO2;
        }
        return (i11 & 4) == 4 ? z0.EDITIONS : z0.PROTO3;
    }
}
