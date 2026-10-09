package bp;

import com.lingo.lingoskill.object.LanguageItem;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f4764c;

    public /* synthetic */ q(fz.c cVar, l1.b1 b1Var, int i11) {
        this.f4762a = i11;
        this.f4764c = cVar;
        this.f4763b = b1Var;
    }

    @Override // fz.a
    public final Object invoke() {
        mu.i iVar;
        switch (this.f4762a) {
            case 0:
                LanguageItem languageItem = (LanguageItem) this.f4763b.getValue();
                if (languageItem != null) {
                    this.f4764c.invoke(languageItem);
                }
                return qy.b0.f48488a;
            case 1:
                LanguageItem languageItem2 = (LanguageItem) this.f4763b.getValue();
                if (languageItem2 != null) {
                    this.f4764c.invoke(languageItem2);
                }
                return qy.b0.f48488a;
            case 2:
                g1.s((String) this.f4763b.getValue(), this.f4764c);
                break;
            case 3:
                com.android.billingclient.api.o oVar = (com.android.billingclient.api.o) this.f4763b.getValue();
                if (oVar != null) {
                    this.f4764c.invoke(oVar);
                }
                return qy.b0.f48488a;
            case 4:
                LanguageItem languageItem3 = (LanguageItem) this.f4763b.getValue();
                if (languageItem3 != null) {
                    this.f4764c.invoke(languageItem3);
                }
                return qy.b0.f48488a;
            case 5:
                int iIntValue = ((Number) this.f4763b.getValue()).intValue();
                if (iIntValue != 0) {
                    iVar = iIntValue != 1 ? mu.i.LARGE : mu.i.MEDIUM;
                } else {
                    iVar = mu.i.SMALL;
                }
                this.f4764c.invoke(iVar);
                break;
            case 6:
                this.f4764c.invoke((String) this.f4763b.getValue());
                break;
            case 7:
                String str = (String) this.f4763b.getValue();
                if (str != null) {
                    this.f4764c.invoke(str);
                }
                return qy.b0.f48488a;
            case 8:
                this.f4764c.invoke((String) this.f4763b.getValue());
                break;
            default:
                this.f4764c.invoke((String) this.f4763b.getValue());
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ q(l1.b1 b1Var, fz.c cVar, int i11) {
        this.f4762a = i11;
        this.f4763b = b1Var;
        this.f4764c = cVar;
    }
}
