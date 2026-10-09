package ha;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e00.h f32130a = ns.o.g("kotlin.Array<kotlin.CharSequence>", new e00.g[0]);

    public static CharSequence[] a(f00.c cVar) {
        if (!(cVar instanceof ga.f)) {
            throw new IllegalArgumentException(hz.b.v(f32130a.f24682a, cVar).toString());
        }
        ga.f fVar = (ga.f) cVar;
        Bundle bundle = fVar.f28884a;
        String key = fVar.f28886c;
        kotlin.jvm.internal.m.f(key, "key");
        CharSequence[] charSequenceArray = bundle.getCharSequenceArray(key);
        if (charSequenceArray != null) {
            return charSequenceArray;
        }
        com.bumptech.glide.g.r(key);
        throw null;
    }
}
