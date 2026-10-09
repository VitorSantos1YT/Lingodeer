package ha;

import android.os.Bundle;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f32143a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e00.h f32144b = ns.o.g("androidx.savedstate.SavedState", new e00.g[0]);

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        if (!(cVar instanceof ga.f)) {
            throw new IllegalArgumentException(hz.b.v(f32144b.f24682a, cVar).toString());
        }
        ga.f fVar = (ga.f) cVar;
        Bundle bundle = fVar.f28884a;
        return kotlin.jvm.internal.m.a(fVar.f28886c, BuildConfig.VERSION_NAME) ? bundle : com.bumptech.glide.f.v(fVar.f28886c, bundle);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f32144b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        Bundle value = (Bundle) obj;
        kotlin.jvm.internal.m.f(value, "value");
        if (!(dVar instanceof ga.g)) {
            throw new IllegalArgumentException(hz.b.w(f32144b.f24682a, dVar).toString());
        }
        ga.g gVar = (ga.g) dVar;
        Bundle bundle = gVar.f28889k;
        if (kotlin.jvm.internal.m.a(gVar.m, BuildConfig.VERSION_NAME)) {
            bundle.putAll(value);
        } else {
            ef.e.w(bundle, gVar.m, value);
        }
    }
}
