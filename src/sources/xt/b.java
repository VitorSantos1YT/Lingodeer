package xt;

import com.lingodeer.data.env.Env;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.z;
import l1.k1;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f56279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f56280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f56281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f56282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f56283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k1 f56284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f56285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f56286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final qy.q f56287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final qy.q f56288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final qy.q f56289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final qy.q f56290l;
    public static final Locale m;

    static {
        Boolean bool = Boolean.FALSE;
        f56284f = l1.t.B(bool);
        f56285g = new AtomicBoolean(false);
        f56286h = -1L;
        f56287i = com.bumptech.glide.d.v(new uu.f(16));
        f56288j = com.bumptech.glide.d.v(new uu.f(17));
        f56289k = com.bumptech.glide.d.v(new uu.f(18));
        f56290l = com.bumptech.glide.d.v(new uu.f(19));
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.m.e(locale, "getDefault(...)");
        m = locale;
        l1.t.B(bool);
    }

    public static a a() {
        return (a) f56287i.getValue();
    }

    public static Env b() {
        return (Env) f56289k.getValue();
    }

    public static n0 c() {
        return (n0) f56288j.getValue();
    }

    public static ur.a d() {
        return (ur.a) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, z.a(ur.a.class));
    }

    public static q e() {
        return (q) f56290l.getValue();
    }
}
