package s0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements w2.q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f51016b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f51017c = new e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.lingo.lingoskill.object.a f51018d = new com.lingo.lingoskill.object.a(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51019a;

    public /* synthetic */ e(int i11) {
        this.f51019a = i11;
    }

    @Override // w2.q0
    public final w2.r0 e(w2.s0 s0Var, List list, long j11) {
        switch (this.f51019a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.add(((w2.p0) list.get(i11)).B(j11));
                }
                return s0Var.q0(v3.a.h(j11), v3.a.g(j11), ry.s.f50855a, new d1.l0(3, arrayList));
            default:
                return s0Var.q0(v3.a.h(j11), v3.a.g(j11), ry.s.f50855a, f51018d);
        }
    }
}
