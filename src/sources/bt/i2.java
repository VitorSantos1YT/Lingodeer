package bt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ht.o f5516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.i1 f5517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.e f5518d;

    public /* synthetic */ i2(ht.o oVar, l1.i1 i1Var, fz.e eVar, int i11) {
        this.f5515a = i11;
        this.f5516b = oVar;
        this.f5517c = i1Var;
        this.f5518d = eVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        CourseWord it = (CourseWord) obj;
        switch (this.f5515a) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                d3.e(this.f5516b, this.f5517c, this.f5518d, ns.o.K(it.getAudioUri().toString()), new ht.e(it.getVisemedMap()));
                break;
            case 1:
                kotlin.jvm.internal.m.f(it, "it");
                d3.e(this.f5516b, this.f5517c, this.f5518d, ns.o.K(it.getAudioUri().toString()), new ht.e(it.getVisemedMap()));
                break;
            case 2:
                String strM = b7.e0.m(it, "word", "toString(...)");
                if (strM.length() > 0) {
                    d3.e(this.f5516b, this.f5517c, this.f5518d, ns.o.K(strM), new ht.e(it.getVisemedMap()));
                }
                return qy.b0.f48488a;
            default:
                String strM2 = b7.e0.m(it, "word", "toString(...)");
                if (strM2.length() > 0) {
                    d3.e(this.f5516b, this.f5517c, this.f5518d, ns.o.K(strM2), new ht.e(it.getVisemedMap()));
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }
}
