package h8;

import y6.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32003b;

    public a(int i11, String str) {
        this.f32002a = i11;
        this.f32003b = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f32002a);
        sb2.append(",url=");
        return ep.a.k(sb2, this.f32003b, ")");
    }
}
