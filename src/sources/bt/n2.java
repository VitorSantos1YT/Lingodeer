package bt;

import com.lingodeer.R;
import com.lingodeer.data.model.CourseWord;
import com.yalantis.ucrop.view.CropImageView;
import h1.i9;
import h1.ua;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n2 implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f5749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5751d;

    public /* synthetic */ n2(int i11, long j11, Object obj, Object obj2) {
        this.f5748a = i11;
        this.f5750c = obj;
        this.f5751d = obj2;
        this.f5749b = j11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zD;
        boolean z11;
        switch (this.f5748a) {
            case 0:
                o3.w wVar = (o3.w) this.f5750c;
                j3.y0 y0Var = (j3.y0) this.f5751d;
                fz.e innerTextField = (fz.e) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(innerTextField, "innerTextField");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((l1.s) nVar).h(innerTextField) ? 4 : 2;
                }
                int i11 = iIntValue;
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(i11 & 1, (i11 & 19) != 18)) {
                    z1.r rVarD = j0.e2.d(z1.o.f58481a, 1.0f);
                    w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    l1.q1 q1VarL = sVar.l();
                    z1.r rVarC = z1.a.c(sVar, rVarD);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    l1.t.J(y2.j.f56917f, q0VarD, sVar);
                    l1.t.J(y2.j.f56916e, q1VarL, sVar);
                    y2.h hVar = y2.j.f56918g;
                    if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                    }
                    l1.t.J(y2.j.f56915d, rVarC, sVar);
                    if (wVar.f44704a.f35700b.length() == 0) {
                        sVar.d0(-1586264837);
                        zD = ry.l.D(new Integer[]{13, 2}, Integer.valueOf(((Number) sVar.j(ju.f.f37370d)).intValue()));
                        sVar.p(false);
                    } else {
                        sVar.d0(-1929568454);
                        sVar.p(false);
                        zD = false;
                    }
                    if (zD) {
                        sVar.d0(-1929547214);
                        z11 = false;
                        ua.b(ub.a.e0(sVar, R.string.write_down_the_sentence), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, this.f5749b, fr.j3.A(14), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 0, 0, 65534);
                        sVar = sVar;
                    } else {
                        z11 = false;
                        sVar.d0(-1965092465);
                    }
                    sVar.p(z11);
                    ep.a.w(i11 & 14, innerTextField, sVar, true);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                CourseWord courseWord = (CourseWord) this.f5750c;
                l1.b1 b1Var = (l1.b1) this.f5751d;
                j0.v Card = (j0.v) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(Card, "$this$Card");
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dt.g4.b(courseWord, j3.y0.a((j3.y0) b1Var.getValue(), this.f5749b, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), dt.a0.v(z1.o.f58481a), false, null, false, false, false, 0, null, sVar2, 0, 1016);
                } else {
                    sVar2.W();
                }
                break;
            default:
                fz.a aVar = (fz.a) this.f5750c;
                fz.a aVar2 = (fz.a) this.f5751d;
                j0.v ModalBottomSheet = (j0.v) obj;
                l1.n nVar3 = (l1.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(ModalBottomSheet, "$this$ModalBottomSheet");
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    i9.a(j0.e2.c(z1.o.f58481a, 0.8f), null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(1260299373, new ys.h3(this.f5749b, aVar, aVar2), sVar3), sVar3, 12582918, 126);
                } else {
                    sVar3.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ n2(long j11, fz.a aVar, fz.a aVar2) {
        this.f5748a = 2;
        this.f5749b = j11;
        this.f5750c = aVar;
        this.f5751d = aVar2;
    }
}
