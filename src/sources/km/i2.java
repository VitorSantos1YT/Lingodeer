package km;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i2 extends androidx.recyclerview.widget.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j2 f38215a;

    public i2(j2 j2Var) {
        this.f38215a = j2Var;
    }

    @Override // androidx.recyclerview.widget.f0
    public final int getSpanSize(int i11) {
        if (i11 == 0) {
            return 16;
        }
        j2 j2Var = this.f38215a;
        List list = j2Var.N;
        kotlin.jvm.internal.m.c(list);
        if (i11 == list.size() + 1) {
            return 16;
        }
        if (i11 % j2Var.P == 0) {
            return 1;
        }
        return j2Var.O == 2 ? 5 : 3;
    }
}
