package ha;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e00.h f32140a = ns.o.g("kotlin.Array<android.os.Parcelable>", new e00.g[0]);

    public static Parcelable[] a(f00.c cVar) {
        if (!(cVar instanceof ga.f)) {
            throw new IllegalArgumentException(hz.b.v(f32140a.f24682a, cVar).toString());
        }
        ga.f fVar = (ga.f) cVar;
        Bundle bundle = fVar.f28884a;
        String key = fVar.f28886c;
        kotlin.jvm.internal.e eVarA = z.a(Parcelable.class);
        kotlin.jvm.internal.m.f(key, "key");
        Parcelable[] parcelableArray = Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) a5.e.e(bundle, key, qx.b.p(eVarA)) : bundle.getParcelableArray(key);
        if (parcelableArray == null) {
            parcelableArray = null;
        }
        if (parcelableArray != null) {
            return parcelableArray;
        }
        com.bumptech.glide.g.r(key);
        throw null;
    }
}
