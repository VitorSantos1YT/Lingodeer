package g00;

import rt.k6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28408b;

    public /* synthetic */ g1(Object obj, int i11) {
        this.f28407a = i11;
        this.f28408b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v0, types: [e00.g, java.lang.Object] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f28407a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                ?? r9 = this.f28408b;
                sb2.append(r9.g(iIntValue));
                sb2.append(": ");
                sb2.append(r9.i(iIntValue).a());
                return sb2.toString();
            case 1:
                ((Integer) obj).intValue();
                return this.f28408b;
            default:
                k6 content = (k6) obj;
                kotlin.jvm.internal.m.f(content, "content");
                return Boolean.valueOf(this.f28408b.contains(content.f49972c.getId()));
        }
    }
}
