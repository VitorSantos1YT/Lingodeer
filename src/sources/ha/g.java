package ha;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e00.h f32139b;

    public g(int i11) {
        this.f32138a = i11;
        switch (i11) {
            case 1:
                this.f32139b = ns.o.g("android.os.Parcelable", new e00.g[0]);
                break;
            default:
                this.f32139b = ns.o.g("java.io.Serializable", new e00.g[0]);
                break;
        }
    }

    public Parcelable a(f00.c cVar) {
        if (!(cVar instanceof ga.f)) {
            throw new IllegalArgumentException(hz.b.v(this.f32139b.f24682a, cVar).toString());
        }
        ga.f fVar = (ga.f) cVar;
        Bundle bundle = fVar.f28884a;
        String key = fVar.f28886c;
        kotlin.jvm.internal.e eVarA = z.a(Parcelable.class);
        kotlin.jvm.internal.m.f(key, "key");
        Parcelable parcelable = (Parcelable) hz.b.G(bundle, key, qx.b.p(eVarA));
        if (parcelable != null) {
            return parcelable;
        }
        com.bumptech.glide.g.r(key);
        throw null;
    }

    public Serializable b(f00.c cVar) {
        Serializable serializable;
        if (!(cVar instanceof ga.f)) {
            throw new IllegalArgumentException(hz.b.v(this.f32139b.f24682a, cVar).toString());
        }
        ga.f fVar = (ga.f) cVar;
        Bundle bundle = fVar.f28884a;
        String key = fVar.f28886c;
        kotlin.jvm.internal.e eVarA = z.a(Serializable.class);
        kotlin.jvm.internal.m.f(key, "key");
        Class clsP = qx.b.p(eVarA);
        if (Build.VERSION.SDK_INT >= 34) {
            serializable = a5.e.g(bundle, key, clsP);
        } else {
            serializable = bundle.getSerializable(key);
            if (!clsP.isInstance(serializable)) {
                serializable = null;
            }
        }
        if (serializable != null) {
            return serializable;
        }
        com.bumptech.glide.g.r(key);
        throw null;
    }

    public void c(f00.d dVar, Parcelable value) {
        kotlin.jvm.internal.m.f(value, "value");
        if (!(dVar instanceof ga.g)) {
            throw new IllegalArgumentException(hz.b.w(this.f32139b.f24682a, dVar).toString());
        }
        ga.g gVar = (ga.g) dVar;
        Bundle bundle = gVar.f28889k;
        String key = gVar.m;
        kotlin.jvm.internal.m.f(key, "key");
        bundle.putParcelable(key, value);
    }

    public void d(f00.d dVar, Serializable value) {
        kotlin.jvm.internal.m.f(value, "value");
        if (!(dVar instanceof ga.g)) {
            throw new IllegalArgumentException(hz.b.w(this.f32139b.f24682a, dVar).toString());
        }
        ga.g gVar = (ga.g) dVar;
        Bundle bundle = gVar.f28889k;
        String key = gVar.m;
        kotlin.jvm.internal.m.f(key, "key");
        bundle.putSerializable(key, value);
    }

    @Override // c00.a
    public final /* bridge */ /* synthetic */ Object deserialize(f00.c cVar) {
        switch (this.f32138a) {
            case 0:
                return b(cVar);
            default:
                return a(cVar);
        }
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        switch (this.f32138a) {
            case 0:
                break;
        }
        return this.f32139b;
    }

    @Override // c00.a
    public final /* bridge */ /* synthetic */ void serialize(f00.d dVar, Object obj) {
        switch (this.f32138a) {
            case 0:
                d(dVar, (Serializable) obj);
                break;
            default:
                c(dVar, (Parcelable) obj);
                break;
        }
    }
}
