package e0;

import com.yalantis.ucrop.view.CropImageView;
import kotlin.jvm.internal.m;
import l1.b3;
import l1.n;
import l1.s;
import l1.t;
import mt.l0;
import oz.q;
import qy.b0;
import rt.y8;
import wb.i;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24644d;

    public d(fz.e eVar, fz.f fVar, fz.a aVar) {
        this.f24641a = 0;
        this.f24644d = eVar;
        this.f24642b = fVar;
        this.f24643c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s sVar;
        boolean zF;
        Object objQ;
        switch (this.f24641a) {
            case 0:
                c cVar = (c) obj;
                n nVar = (n) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((s) nVar).f(cVar) ? 4 : 2;
                }
                s sVar2 = (s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String str = (String) ((fz.e) this.f24644d).invoke(sVar2, 0);
                    if (q.K0(str)) {
                        i0.a.c("Label must not be blank");
                    }
                    g.c(str, cVar, o.f58481a, (fz.f) this.f24642b, (fz.a) this.f24643c, sVar2, (iIntValue << 6) & 896);
                } else {
                    sVar2.W();
                }
                break;
            case 1:
                String reviewId = (String) obj;
                long jLongValue = ((Number) obj2).longValue();
                Boolean bool = (Boolean) obj3;
                bool.booleanValue();
                m.f(reviewId, "reviewId");
                if (((y8) this.f24644d).f50699i) {
                    ((fz.f) this.f24642b).invoke(reviewId, Long.valueOf(jLongValue), bool);
                } else {
                    ((fz.a) this.f24643c).invoke();
                }
                break;
            default:
                j0.s BoxWithConstraints = (j0.s) obj;
                n nVar2 = (n) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                i iVar = (i) this.f24642b;
                v3.c cVar2 = (v3.c) this.f24644d;
                m.f(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((s) nVar2).f(BoxWithConstraints) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18) {
                    s sVar3 = (s) nVar2;
                    if (sVar3.F()) {
                        sVar3.W();
                    } else {
                        sVar = (s) nVar2;
                        sVar.d0(-1344660740);
                        zF = sVar.f(cVar2) | sVar.f(iVar);
                        objQ = sVar.Q();
                        if (zF || objQ == l1.m.f39353a) {
                            objQ = t.s(new l0(iVar, BoxWithConstraints, cVar2, 20));
                            sVar.o0(objQ);
                        }
                        sVar.p(false);
                        d0.n.c(iVar, (String) this.f24643c, (r) ((b3) objQ).getValue(), null, w2.i.f54518e, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 0, 104);
                    }
                } else {
                    sVar = (s) nVar2;
                    sVar.d0(-1344660740);
                    zF = sVar.f(cVar2) | sVar.f(iVar);
                    objQ = sVar.Q();
                    if (zF) {
                        objQ = t.s(new l0(iVar, BoxWithConstraints, cVar2, 20));
                        sVar.o0(objQ);
                    } else {
                        objQ = t.s(new l0(iVar, BoxWithConstraints, cVar2, 20));
                        sVar.o0(objQ);
                    }
                    sVar.p(false);
                    d0.n.c(iVar, (String) this.f24643c, (r) ((b3) objQ).getValue(), null, w2.i.f54518e, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 0, 104);
                }
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i11) {
        this.f24641a = i11;
        this.f24644d = obj;
        this.f24642b = obj2;
        this.f24643c = obj3;
    }
}
