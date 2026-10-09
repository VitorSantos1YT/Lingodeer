package ha;

import android.os.Bundle;
import android.util.Size;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f32147a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e00.h f32148b = ns.o.g("android.util.Size", new e00.g[0]);

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        if (!(cVar instanceof ga.f)) {
            throw new IllegalArgumentException(hz.b.v(f32148b.f24682a, cVar).toString());
        }
        ga.f fVar = (ga.f) cVar;
        Bundle bundle = fVar.f28884a;
        String key = fVar.f28886c;
        kotlin.jvm.internal.m.f(key, "key");
        Size size = bundle.getSize(key);
        if (size != null) {
            return size;
        }
        com.bumptech.glide.g.r(key);
        throw null;
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f32148b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        Size size = (Size) obj;
        kotlin.jvm.internal.m.f(size, bjXGJ.aEgYUBYX);
        if (!(dVar instanceof ga.g)) {
            throw new IllegalArgumentException(hz.b.w(f32148b.f24682a, dVar).toString());
        }
        ga.g gVar = (ga.g) dVar;
        Bundle bundle = gVar.f28889k;
        String key = gVar.m;
        kotlin.jvm.internal.m.f(key, "key");
        bundle.putSize(key, size);
    }
}
