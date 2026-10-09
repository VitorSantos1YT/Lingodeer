package i00;

import com.android.billingclient.api.c0;
import com.android.billingclient.api.k0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f33903c;

    public f(c0 c0Var, boolean z11) {
        super(c0Var);
        this.f33903c = z11;
    }

    @Override // com.android.billingclient.api.k0
    public final void n(String value) {
        kotlin.jvm.internal.m.f(value, "value");
        if (this.f33903c) {
            super.n(value);
        } else {
            l(value);
        }
    }
}
