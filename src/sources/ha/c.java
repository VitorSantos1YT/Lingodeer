package ha;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f32133a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e00.h f32134b = ns.o.g("kotlin.CharSequence", new e00.g[0]);

    public static CharSequence a(f00.c cVar) {
        if (!(cVar instanceof ga.f)) {
            throw new IllegalArgumentException(hz.b.v(f32134b.f24682a, cVar).toString());
        }
        ga.f fVar = (ga.f) cVar;
        Bundle bundle = fVar.f28884a;
        String key = fVar.f28886c;
        kotlin.jvm.internal.m.f(key, "key");
        CharSequence charSequence = bundle.getCharSequence(key);
        if (charSequence != null) {
            return charSequence;
        }
        com.bumptech.glide.g.r(key);
        throw null;
    }

    public static void b(f00.d dVar, CharSequence value) {
        kotlin.jvm.internal.m.f(value, "value");
        if (!(dVar instanceof ga.g)) {
            throw new IllegalArgumentException(hz.b.w(f32134b.f24682a, dVar).toString());
        }
        ga.g gVar = (ga.g) dVar;
        Bundle bundle = gVar.f28889k;
        String key = gVar.m;
        kotlin.jvm.internal.m.f(key, "key");
        bundle.putCharSequence(key, value);
    }

    @Override // c00.a
    public final /* bridge */ /* synthetic */ Object deserialize(f00.c cVar) {
        return a(cVar);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return f32134b;
    }

    @Override // c00.a
    public final /* bridge */ /* synthetic */ void serialize(f00.d dVar, Object obj) {
        b(dVar, (CharSequence) obj);
    }
}
