package yg;

import com.lingo.lingoskill.object.MergedBillingThemeBillingPage;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import j0.e2;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f57760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f57761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MergedBillingThemeBillingPage f57762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f57763e;

    public /* synthetic */ b(String str, String str2, MergedBillingThemeBillingPage mergedBillingThemeBillingPage, boolean z11, int i11) {
        this.f57759a = i11;
        this.f57760b = str;
        this.f57761c = str2;
        this.f57762d = mergedBillingThemeBillingPage;
        this.f57763e = z11;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f57759a) {
            case 0:
                j0.q BillingSellAnnuallyCard = (j0.q) obj;
                l1.n nVar = (l1.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(BillingSellAnnuallyCard, "$this$BillingSellAnnuallyCard");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((l1.s) nVar).f(BillingSellAnnuallyCard) ? 4 : 2;
                }
                l1.s sVar = (l1.s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    MergedBillingThemeBillingPage mergedBillingThemeBillingPage = this.f57762d;
                    o.i(this.f57760b, this.f57761c, j3.w(mergedBillingThemeBillingPage.getColorLifeTimeTagText()), mergedBillingThemeBillingPage.getColorLifeTimeCountDownTagText().length() > 0 ? j3.w(mergedBillingThemeBillingPage.getColorLifeTimeCountDownTagText()) : j3.w(mergedBillingThemeBillingPage.getColorLifeTimeTagText()), j3.w(mergedBillingThemeBillingPage.getColorLifeTimeTag()), j3.w(mergedBillingThemeBillingPage.getColorLifeTimeTagEnd()), j3.w(mergedBillingThemeBillingPage.getColorLifeTimeCountDownTag()), j3.w(mergedBillingThemeBillingPage.getColorLifeTimeCountDownTagEnd()), sVar, 0);
                    if (this.f57763e) {
                        sVar.d0(-1286176982);
                        o.d(j3.w(mergedBillingThemeBillingPage.getColorLifeTimeCheckedIcon()), j3.w(mergedBillingThemeBillingPage.getColorLifeTimeCheckedIconBg()), e2.n(j0.c.E(BillingSellAnnuallyCard.a(z1.o.f58481a, z1.c.f58465c), CropImageView.DEFAULT_ASPECT_RATIO, 5, 12, CropImageView.DEFAULT_ASPECT_RATIO, 9), 21), sVar, 0);
                    } else {
                        sVar.d0(-1334457498);
                    }
                    sVar.p(false);
                } else {
                    sVar.W();
                }
                break;
            default:
                j0.q BillingSellAnnuallyCard2 = (j0.q) obj;
                l1.n nVar2 = (l1.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.f(BillingSellAnnuallyCard2, "$this$BillingSellAnnuallyCard");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((l1.s) nVar2).f(BillingSellAnnuallyCard2) ? 4 : 2;
                }
                l1.s sVar2 = (l1.s) nVar2;
                if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    MergedBillingThemeBillingPage mergedBillingThemeBillingPage2 = this.f57762d;
                    o.i(this.f57760b, this.f57761c, j3.w(mergedBillingThemeBillingPage2.getColorYearlyTagText()), mergedBillingThemeBillingPage2.getColorYearlyCountDownTagText().length() > 0 ? j3.w(mergedBillingThemeBillingPage2.getColorYearlyCountDownTagText()) : j3.w(mergedBillingThemeBillingPage2.getColorYearlyTagText()), j3.w(mergedBillingThemeBillingPage2.getColorYearlyTag()), j3.w(mergedBillingThemeBillingPage2.getColorYearlyTagEnd()), j3.w(mergedBillingThemeBillingPage2.getColorYearlyCountDownTag()), j3.w(mergedBillingThemeBillingPage2.getColorYearlyCountDownTagEnd()), sVar2, 0);
                    if (this.f57763e) {
                        sVar2.d0(-1645295887);
                        o.d(j3.w(mergedBillingThemeBillingPage2.getColorYearlyCheckedIcon()), j3.w(mergedBillingThemeBillingPage2.getColorYearlyCheckedIconBg()), e2.n(j0.c.E(BillingSellAnnuallyCard2.a(z1.o.f58481a, z1.c.f58465c), CropImageView.DEFAULT_ASPECT_RATIO, 5, 12, CropImageView.DEFAULT_ASPECT_RATIO, 9), 21), sVar2, 0);
                    } else {
                        sVar2.d0(-1697604791);
                    }
                    sVar2.p(false);
                } else {
                    sVar2.W();
                }
                break;
        }
        return b0.f48488a;
    }
}
