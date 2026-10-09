package ad;

import e2.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f592c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, int i11, int i12) {
        super(1);
        this.f590a = i12;
        this.f591b = obj;
        this.f592c = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f590a) {
            case 0:
                return Boolean.valueOf(i.b((i) this.f591b, this.f592c, ((Number) obj).longValue()));
            case 1:
                return Boolean.valueOf(i.b((i) this.f591b, this.f592c, ((Number) obj).longValue()));
            default:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f591b;
                Boolean boolValueOf = Boolean.valueOf(((e0) obj).Z0(this.f592c));
                yVar.f38361a = boolValueOf;
                return boolValueOf;
        }
    }
}
