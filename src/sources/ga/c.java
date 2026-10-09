package ga;

import android.os.IBinder;
import android.os.Parcelable;
import ha.n;
import ha.o;
import java.io.Serializable;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e00.g f28866a = new c00.c(z.a(CharSequence.class)).getDescriptor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e00.g f28867b = new c00.c(z.a(Parcelable.class)).getDescriptor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e00.g f28868c = new c00.c(z.a(Serializable.class)).getDescriptor();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e00.g f28869d = new c00.c(z.a(IBinder.class)).getDescriptor();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g00.c f28870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g00.c f28871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g00.c f28872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g00.c f28873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g00.c f28874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g00.c f28875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g00.c f28876k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g00.c f28877l;
    public static final e00.g m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e00.g f28878n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e00.g f28879o;

    static {
        ha.e eVar = ha.e.f32136c;
        f28870e = qx.b.b(z.a(Parcelable.class), eVar).f28437c;
        f28871f = qx.b.b(z.a(Parcelable.class), new c00.c(z.a(Parcelable.class))).f28437c;
        f28872g = (g00.c) qx.b.e(eVar).f28371c;
        f28873h = (g00.c) qx.b.e(new c00.c(z.a(Parcelable.class))).f28371c;
        ha.c cVar = ha.c.f32133a;
        f28874i = qx.b.b(z.a(CharSequence.class), cVar).f28437c;
        f28875j = qx.b.b(z.a(CharSequence.class), new c00.c(z.a(CharSequence.class))).f28437c;
        f28876k = (g00.c) qx.b.e(cVar).f28371c;
        f28877l = (g00.c) qx.b.e(new c00.c(z.a(CharSequence.class))).f28371c;
        n nVar = o.Companion;
        m = nVar.serializer(eVar).getDescriptor();
        f28878n = nVar.serializer(new c00.c(z.a(Parcelable.class))).getDescriptor();
        f28879o = nVar.serializer(qx.b.s(new c00.c(z.a(Parcelable.class)))).getDescriptor();
    }
}
