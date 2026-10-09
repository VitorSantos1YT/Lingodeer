package ha;

import g00.d1;
import g00.f1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@c00.e
public final class o<T> {
    public static final n Companion = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qy.h[] f32150c = {com.bumptech.glide.d.u(qy.j.PUBLICATION, new fk.a(27)), null};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1 f32151d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f32153b;

    static {
        f1 f1Var = new f1("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
        f1Var.k("keys", false);
        f1Var.k("values", false);
        f32151d = f1Var;
    }

    public /* synthetic */ o(int i11, List list, List list2) {
        if (3 != (i11 & 3)) {
            d1.k(i11, 3, f32151d);
            throw null;
        }
        this.f32152a = list;
        this.f32153b = list2;
    }

    public o(ArrayList arrayList, ArrayList arrayList2) {
        this.f32152a = arrayList;
        this.f32153b = arrayList2;
    }
}
