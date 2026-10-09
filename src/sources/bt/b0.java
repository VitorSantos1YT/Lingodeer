package bt;

import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ht.o f5201b;

    public /* synthetic */ b0(ht.o oVar, int i11) {
        this.f5200a = i11;
        this.f5201b = oVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        String strM;
        int i11;
        int i12;
        int i13 = this.f5200a;
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dt.a0.q(ub.a.e0(sVar, R.string.sentence_m7_hint), this.f5201b.f33764l, sVar, 0, 0);
                } else {
                    sVar.W();
                }
                break;
            case 1:
                l1.s sVar2 = (l1.s) nVar;
                if (sVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dt.a0.q(ub.a.e0(sVar2, R.string.sentence_m1_hint), this.f5201b.f33764l, sVar2, 0, 0);
                } else {
                    sVar2.W();
                }
                break;
            case 2:
                l1.s sVar3 = (l1.s) nVar;
                if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dt.a0.q(ub.a.e0(sVar3, R.string.sentence_m2_hint), this.f5201b.f33764l, sVar3, 0, 0);
                } else {
                    sVar3.W();
                }
                break;
            case 3:
                l1.s sVar4 = (l1.s) nVar;
                if (sVar4.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dt.a0.q(ub.a.e0(sVar4, R.string.sentence_m7_hint), this.f5201b.f33764l, sVar4, 0, 0);
                } else {
                    sVar4.W();
                }
                break;
            case 4:
                l1.s sVar5 = (l1.s) nVar;
                if (sVar5.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dt.a0.q(ub.a.e0(sVar5, R.string.sentence_m8_hint), this.f5201b.f33764l, sVar5, 0, 0);
                } else {
                    sVar5.W();
                }
                break;
            case 5:
                l1.s sVar6 = (l1.s) nVar;
                if (sVar6.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dt.a0.q(ub.a.e0(sVar6, R.string.word_m1_hint), this.f5201b.f33764l, sVar6, 0, 0);
                } else {
                    sVar6.W();
                }
                break;
            default:
                l1.s sVar7 = (l1.s) nVar;
                if (sVar7.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ht.o oVar = this.f5201b;
                    if (oVar.f33759g) {
                        sVar7.d0(-554949152);
                        if (ry.l.D(new Integer[]{13, 2}, Integer.valueOf(((fr.o0) xt.b.c()).f27733a.keyLanguage))) {
                            i11 = -554878658;
                            i12 = R.string.choose_the_correct_hangul;
                        } else {
                            i11 = -554783333;
                            i12 = R.string.choose_the_correct_character;
                        }
                        strM = ep.a.m(sVar7, i11, i12, sVar7, false);
                        sVar7.p(false);
                    } else {
                        strM = ep.a.m(sVar7, -554671826, R.string.word_m2_hint, sVar7, false);
                    }
                    dt.a0.q(strM, oVar.f33764l, sVar7, 0, 0);
                } else {
                    sVar7.W();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
