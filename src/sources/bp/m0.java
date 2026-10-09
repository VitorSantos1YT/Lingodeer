package bp;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.lingo.lingoskill.object.LanguageItem;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiItemEntity f4698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ep.c f4701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f4702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4703f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4704t;

    public m0(MultiItemEntity multiItemEntity, boolean z11, boolean z12, ep.c cVar, fz.c cVar2, l1.b1 b1Var, l1.b1 b1Var2) {
        this.f4698a = multiItemEntity;
        this.f4699b = z11;
        this.f4700c = z12;
        this.f4701d = cVar;
        this.f4702e = cVar2;
        this.f4703f = b1Var;
        this.f4704t = b1Var2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        l1.n nVar = (l1.n) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.s sVar = (l1.s) nVar;
        if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            MultiItemEntity multiItemEntity = this.f4698a;
            LanguageItem languageItem = (LanguageItem) multiItemEntity;
            boolean z11 = this.f4700c;
            boolean zG = sVar.g(z11) | sVar.h(multiItemEntity);
            ep.c cVar = this.f4701d;
            boolean zH = zG | sVar.h(cVar) | sVar.f(this.f4702e);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                l0 l0Var = new l0(this.f4700c, multiItemEntity, cVar, this.f4702e, this.f4703f, this.f4704t);
                sVar.o0(l0Var);
                objQ = l0Var;
            }
            g1.g(null, languageItem, this.f4699b, z11, 0L, (fz.a) objQ, null, null, sVar, 0, 209);
        } else {
            sVar.W();
        }
        return qy.b0.f48488a;
    }
}
