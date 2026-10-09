package a2;

import android.view.ViewStructure;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.n implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewStructure f319a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ViewStructure viewStructure) {
        super(4);
        this.f319a = viewStructure;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue() - iIntValue2;
        this.f319a.setDimens(iIntValue, iIntValue2, 0, 0, iIntValue3 - iIntValue, iIntValue4);
        return b0.f48488a;
    }
}
