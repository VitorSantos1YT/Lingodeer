package tg;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.d f52342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f52343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52344d;

    public q(int i11, t1.d dVar, List list, int i12) {
        this.f52341a = i11;
        this.f52342b = dVar;
        this.f52343c = list;
        this.f52344d = i12;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i0 BasicRichText = (i0) obj;
        l1.n nVar = (l1.n) obj2;
        int iIntValue = ((Number) obj3).intValue();
        kotlin.jvm.internal.m.f(BasicRichText, "$this$BasicRichText");
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((l1.s) nVar).f(BasicRichText) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18) {
            l1.s sVar = (l1.s) nVar;
            if (sVar.F()) {
                sVar.W();
            } else {
                l1.t.a(u.f52378f.a(Integer.valueOf(this.f52341a + 1)), t1.e.d(-243396074, new p(this.f52342b, BasicRichText, this.f52343c, this.f52344d), nVar), nVar, 56);
            }
        } else {
            l1.t.a(u.f52378f.a(Integer.valueOf(this.f52341a + 1)), t1.e.d(-243396074, new p(this.f52342b, BasicRichText, this.f52343c, this.f52344d), nVar), nVar, 56);
        }
        return qy.b0.f48488a;
    }
}
