package a2;

import android.graphics.Rect;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.n implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f298b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i11) {
        super(4);
        this.f297a = eVar;
        this.f298b = i11;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        e eVar = this.f297a;
        eVar.f301a.c(eVar.f303c, this.f298b, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return b0.f48488a;
    }
}
