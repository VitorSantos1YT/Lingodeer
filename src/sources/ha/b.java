package ha;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f32131a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e00.h f32132b = ns.o.g("kotlin.collections.List<kotlin.CharSequence>", new e00.g[0]);

    @Override // c00.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List deserialize(f00.c cVar) {
        if (!(cVar instanceof ga.f)) {
            throw new IllegalArgumentException(hz.b.v(f32132b.f24682a, cVar).toString());
        }
        ga.f fVar = (ga.f) cVar;
        Bundle bundle = fVar.f28884a;
        String key = fVar.f28886c;
        kotlin.jvm.internal.m.f(key, "key");
        ArrayList<CharSequence> charSequenceArrayList = bundle.getCharSequenceArrayList(key);
        if (charSequenceArrayList != null) {
            return charSequenceArrayList;
        }
        com.bumptech.glide.g.r(key);
        throw null;
    }

    @Override // c00.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(f00.d dVar, List value) {
        kotlin.jvm.internal.m.f(value, "value");
        if (!(dVar instanceof ga.g)) {
            throw new IllegalArgumentException(hz.b.w(f32132b.f24682a, dVar).toString());
        }
        ga.g gVar = (ga.g) dVar;
        Bundle bundle = gVar.f28889k;
        String key = gVar.m;
        kotlin.jvm.internal.m.f(key, "key");
        bundle.putCharSequenceArrayList(key, ew.a.J(value));
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f32132b;
    }
}
