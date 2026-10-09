package rt;

import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jb implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mb f49935b;

    public /* synthetic */ jb(mb mbVar, int i11) {
        this.f49934a = i11;
        this.f49935b = mbVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f49934a) {
            case 0:
                this.f49935b.f50706c0.k((fb) obj);
                return qy.b0.f48488a;
            case 1:
                ht.o oVar = (ht.o) obj;
                kotlin.jvm.internal.m.f(oVar, MzwEyWCkjXL.eDKuXcxX);
                int i11 = oVar.f33755c;
                int i12 = oVar.f33753a;
                mb mbVar = this.f49935b;
                yb ybVar = yb.f50724a;
                if (i12 == -1) {
                    mbVar.t(ybVar);
                } else if ((i12 == 1 && ry.l.D(new Integer[]{13, 31}, Integer.valueOf(i11))) || i12 == 2 || (i12 == 0 && ry.l.D(new Integer[]{5, 9, 10}, Integer.valueOf(i11)))) {
                    mbVar.t(zb.f50802a);
                } else {
                    mbVar.t(ybVar);
                }
                return qy.b0.f48488a;
            case 2:
                ht.o params = (ht.o) obj;
                kotlin.jvm.internal.m.f(params, "params");
                return this.f49935b.w(params);
            case 3:
                this.f49935b.d(((Long) obj).longValue());
                return qy.b0.f48488a;
            default:
                ht.o params2 = (ht.o) obj;
                kotlin.jvm.internal.m.f(params2, "params");
                return this.f49935b.i(params2);
        }
    }
}
