package ha;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f32141a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e00.h f32142b = ns.o.g("kotlin.collections.List<android.os.Parcelable>", new e00.g[0]);

    @Override // c00.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List deserialize(f00.c cVar) {
        if (!(cVar instanceof ga.f)) {
            throw new IllegalArgumentException(hz.b.v(f32142b.f24682a, cVar).toString());
        }
        ga.f fVar = (ga.f) cVar;
        return com.bumptech.glide.f.u(fVar.f28884a, fVar.f28886c, z.a(Parcelable.class));
    }

    @Override // c00.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(f00.d dVar, List value) {
        kotlin.jvm.internal.m.f(value, "value");
        if (!(dVar instanceof ga.g)) {
            throw new IllegalArgumentException(hz.b.w(f32142b.f24682a, dVar).toString());
        }
        ga.g gVar = (ga.g) dVar;
        Bundle bundle = gVar.f28889k;
        String key = gVar.m;
        kotlin.jvm.internal.m.f(key, "key");
        bundle.putParcelableArrayList(key, ew.a.J(value));
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f32142b;
    }
}
