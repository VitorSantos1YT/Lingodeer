package ha;

import android.os.Bundle;
import android.util.SizeF;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f32145a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e00.h f32146b = ns.o.g("android.util.SizeF", new e00.g[0]);

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        if (!(cVar instanceof ga.f)) {
            throw new IllegalArgumentException(hz.b.v(f32146b.f24682a, cVar).toString());
        }
        ga.f fVar = (ga.f) cVar;
        Bundle bundle = fVar.f28884a;
        String key = fVar.f28886c;
        kotlin.jvm.internal.m.f(key, "key");
        SizeF sizeF = bundle.getSizeF(key);
        if (sizeF != null) {
            return sizeF;
        }
        com.bumptech.glide.g.r(key);
        throw null;
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f32146b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        SizeF value = (SizeF) obj;
        kotlin.jvm.internal.m.f(value, "value");
        if (!(dVar instanceof ga.g)) {
            throw new IllegalArgumentException(hz.b.w(f32146b.f24682a, dVar).toString());
        }
        ga.g gVar = (ga.g) dVar;
        Bundle bundle = gVar.f28889k;
        String key = gVar.m;
        kotlin.jvm.internal.m.f(key, "key");
        bundle.putSizeF(key, value);
    }
}
