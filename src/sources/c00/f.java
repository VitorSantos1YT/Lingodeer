package c00;

import java.util.List;
import kotlin.jvm.internal.m;
import mz.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f6406b;

    public /* synthetic */ f(int i11, List list) {
        this.f6405a = i11;
        this.f6406b = list;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f6405a) {
            case 0:
                return ((k) this.f6406b.get(0)).d();
            case 1:
                return ((k) this.f6406b.get(0)).d();
            case 2:
                return Integer.valueOf(this.f6406b.size());
            case 3:
                return Integer.valueOf(this.f6406b.size());
            case 4:
                return Integer.valueOf(this.f6406b.size());
            case 5:
                return Integer.valueOf(this.f6406b.size());
            case 6:
                Object obj = this.f6406b.get(2);
                m.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            default:
                return this.f6406b;
        }
    }
}
