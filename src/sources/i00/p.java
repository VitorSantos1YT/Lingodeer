package i00;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h00.z f33927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f33928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f33929l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(h00.c json, h00.z zVar) {
        super(json, zVar, (String) null, 12);
        kotlin.jvm.internal.m.f(json, "json");
        this.f33927j = zVar;
        List listA1 = ry.m.a1(zVar.f29949a.keySet());
        this.f33928k = listA1;
        this.f33929l = listA1.size() * 2;
        this.m = -1;
    }

    @Override // i00.n, i00.a
    public final h00.m F(String tag) {
        kotlin.jvm.internal.m.f(tag, "tag");
        return this.m % 2 == 0 ? h00.n.b(tag) : (h00.m) ry.x.U(tag, this.f33927j);
    }

    @Override // i00.n, i00.a
    public final String R(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return (String) this.f33928k.get(i11 / 2);
    }

    @Override // i00.n, i00.a
    public final h00.m T() {
        return this.f33927j;
    }

    @Override // i00.n
    /* JADX INFO: renamed from: Y */
    public final h00.z T() {
        return this.f33927j;
    }

    @Override // i00.n, i00.a, f00.a
    public final void c(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
    }

    @Override // i00.n, f00.a
    public final int n(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        int i11 = this.m;
        if (i11 >= this.f33929l - 1) {
            return -1;
        }
        int i12 = i11 + 1;
        this.m = i12;
        return i12;
    }
}
