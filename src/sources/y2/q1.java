package y2;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f56998b = new q1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56999a;

    public /* synthetic */ q1(int i11) {
        this.f56999a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f56999a) {
            case 0:
                i0 i0Var = (i0) obj;
                i0 i0Var2 = (i0) obj2;
                int iH = kotlin.jvm.internal.m.h(i0Var2.S, i0Var.S);
                return iH != 0 ? iH : kotlin.jvm.internal.m.h(i0Var.hashCode(), i0Var2.hashCode());
            default:
                i0 i0Var3 = (i0) obj;
                i0 i0Var4 = (i0) obj2;
                int iH2 = kotlin.jvm.internal.m.h(i0Var3.S, i0Var4.S);
                return iH2 != 0 ? iH2 : kotlin.jvm.internal.m.h(i0Var3.hashCode(), i0Var4.hashCode());
        }
    }
}
