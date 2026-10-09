package a2;

import qy.b0;
import y2.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.n implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f300b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, i0 i0Var) {
        super(4);
        this.f299a = eVar;
        this.f300b = i0Var;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        e eVar = this.f299a;
        eVar.f306f.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        eVar.f301a.f(eVar.f303c, this.f300b.f56880b, eVar.f306f);
        return b0.f48488a;
    }
}
