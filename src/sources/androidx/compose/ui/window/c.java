package androidx.compose.ui.window;

import fz.e;
import kotlin.jvm.internal.n;
import l1.t;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends n implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogLayout f1243a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DialogLayout dialogLayout, int i11) {
        super(2);
        this.f1243a = dialogLayout;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM = t.M(1);
        this.f1243a.a((l1.n) obj, iM);
        return b0.f48488a;
    }
}
