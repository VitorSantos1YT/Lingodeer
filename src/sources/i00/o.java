package i00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h00.e f33924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f33925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f33926h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h00.c json, h00.e eVar) {
        super(json, null);
        kotlin.jvm.internal.m.f(json, "json");
        this.f33924f = eVar;
        this.f33925g = eVar.f29919a.size();
        this.f33926h = -1;
    }

    @Override // i00.a
    public final h00.m F(String tag) {
        kotlin.jvm.internal.m.f(tag, "tag");
        return (h00.m) this.f33924f.f29919a.get(Integer.parseInt(tag));
    }

    @Override // i00.a
    public final String R(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return String.valueOf(i11);
    }

    @Override // i00.a
    public final h00.m T() {
        return this.f33924f;
    }

    @Override // f00.a
    public final int n(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        int i11 = this.f33926h;
        if (i11 >= this.f33925g - 1) {
            return -1;
        }
        int i12 = i11 + 1;
        this.f33926h = i12;
        return i12;
    }
}
