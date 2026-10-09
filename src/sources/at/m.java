package at;

import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import g2.f0;
import h1.r4;
import h1.s1;
import h1.v1;
import j0.e2;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2906b;

    public /* synthetic */ m(int i11, int i12, boolean z11) {
        this.f2905a = i12;
        this.f2906b = z11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        long j11;
        long j12;
        switch (this.f2905a) {
            case 0:
                ((Integer) obj2).getClass();
                b.a(this.f2906b, (l1.n) obj, t.M(1));
                break;
            case 1:
                l1.n nVar = (l1.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    r4.b(se.k.y(this.f2906b ? R.drawable.ic_hint_luoma : R.drawable.ic_hint_luoma_close, sVar, 0), null, d2.h.i(z1.o.f58481a, iu.k.p(sVar), 1.0f), f0.e(4289245379L), sVar, 3120, 0);
                } else {
                    sVar.W();
                }
                return b0.f48488a;
            case 2:
                l1.n nVar2 = (l1.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    r4.b(se.k.y(this.f2906b ? R.drawable.ic_hint_audio : R.drawable.ic_hint_audio_close, sVar2, 0), null, d2.h.i(z1.o.f58481a, iu.k.p(sVar2), 1.0f), f0.e(4289245379L), sVar2, 3120, 0);
                } else {
                    sVar2.W();
                }
                return b0.f48488a;
            case 3:
                ((Integer) obj2).getClass();
                ef.e.f(this.f2906b, (l1.n) obj, t.M(7));
                break;
            case 4:
                l1.n nVar3 = (l1.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                l1.s sVar3 = (l1.s) nVar3;
                if (sVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean z11 = this.f2906b;
                    k2.b bVarY = se.k.y(z11 ? R.drawable.bookmark_starred_24px : R.drawable.bookmark_star_24px, sVar3, 0);
                    z1.r rVarN = e2.n(z1.o.f58481a, 20);
                    if (z11) {
                        sVar3.d0(384416024);
                        j11 = ((s1) sVar3.j(v1.f31180a)).f31017a;
                        sVar3.p(false);
                    } else {
                        sVar3.d0(384518479);
                        j11 = ((s1) sVar3.j(v1.f31180a)).f31036s;
                        sVar3.p(false);
                    }
                    r4.b(bVarY, null, rVarN, j11, sVar3, 432, 0);
                } else {
                    sVar3.W();
                }
                return b0.f48488a;
            case 5:
                l1.n nVar4 = (l1.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                l1.s sVar4 = (l1.s) nVar4;
                if (sVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    if (this.f2906b) {
                        sVar4.d0(-955040522);
                        r4.b(se.k.y(R.drawable.baseline_error_24, sVar4, 0), "error", null, ((s1) sVar4.j(v1.f31180a)).f31040w, sVar4, 48, 4);
                    } else {
                        sVar4.d0(-982257313);
                    }
                    sVar4.p(false);
                } else {
                    sVar4.W();
                }
                return b0.f48488a;
            case 6:
                l1.n nVar5 = (l1.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                l1.s sVar5 = (l1.s) nVar5;
                if (!sVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    sVar5.W();
                } else if (this.f2906b) {
                    sVar5.d0(1050847523);
                    r4.b(se.k.y(R.drawable.keyboard_arrow_right_24px, sVar5, 0), null, null, f0.e(4291480266L), sVar5, 3120, 4);
                    sVar5.p(false);
                } else {
                    sVar5.d0(1050644442);
                    d0.n.c(se.k.y(R.drawable.ic_pro_active, sVar5, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 48, 124);
                    sVar5.p(false);
                }
                return b0.f48488a;
            default:
                l1.n nVar6 = (l1.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                l1.s sVar6 = (l1.s) nVar6;
                if (sVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean z12 = this.f2906b;
                    k2.b bVarY2 = se.k.y(z12 ? R.drawable.bookmark_starred_24px : R.drawable.bookmark_star_24px, sVar6, 0);
                    z1.r rVarN2 = e2.n(z1.o.f58481a, 20);
                    if (z12) {
                        sVar6.d0(-597930148);
                        j12 = ((s1) sVar6.j(v1.f31180a)).f31017a;
                        sVar6.p(false);
                    } else {
                        sVar6.d0(-597859437);
                        j12 = ((s1) sVar6.j(v1.f31180a)).f31036s;
                        sVar6.p(false);
                    }
                    r4.b(bVarY2, null, rVarN2, j12, sVar6, 432, 0);
                } else {
                    sVar6.W();
                }
                return b0.f48488a;
        }
        return b0.f48488a;
    }

    public /* synthetic */ m(boolean z11, int i11) {
        this.f2905a = i11;
        this.f2906b = z11;
    }
}
