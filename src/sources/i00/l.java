package i00;

import com.google.firebase.iid.QyE.SemtNwfPgIhi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h00.m f33911f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h00.c json, h00.m value, String str) {
        super(json, str);
        kotlin.jvm.internal.m.f(json, "json");
        kotlin.jvm.internal.m.f(value, "value");
        this.f33911f = value;
        this.f33891a.add("primitive");
    }

    @Override // i00.a
    public final h00.m F(String tag) {
        kotlin.jvm.internal.m.f(tag, "tag");
        if (tag == "primitive") {
            return this.f33911f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // i00.a
    public final h00.m T() {
        return this.f33911f;
    }

    @Override // f00.a
    public final int n(e00.g gVar) {
        kotlin.jvm.internal.m.f(gVar, SemtNwfPgIhi.nRNYThmWdIs);
        return 0;
    }
}
