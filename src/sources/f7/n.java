package f7;

import android.content.Context;
import android.os.Looper;
import com.google.common.base.Supplier;
import dt.Xk.wuoM;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7.y f26853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f26854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f26855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Supplier f26856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Supplier f26857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f26858g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Looper f26859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f26860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y6.d f26861j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f26862k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f26863l;
    public final h1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g1 f26864n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f26865o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f26866p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f26867q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f26868r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f26869s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f26870t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f26871u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f26872v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f26873w;

    public final a0 a() {
        b7.a.j(!this.f26872v);
        this.f26872v = true;
        return new a0(this, null);
    }

    public n(Context context) {
        c cVar = new c(context, 1);
        c cVar2 = new c(context, 2);
        c cVar3 = new c(context, 3);
        com.google.common.base.a aVar = new com.google.common.base.a(1);
        c cVar4 = new c(context, 4);
        context.getClass();
        this.f26852a = context;
        this.f26854c = cVar;
        this.f26855d = cVar2;
        this.f26856e = cVar3;
        this.f26857f = aVar;
        this.f26858g = cVar4;
        String str = b7.f0.f3975a;
        Looper looperMyLooper = Looper.myLooper();
        this.f26859h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f26861j = y6.d.f57180b;
        this.f26862k = 1;
        this.f26863l = true;
        this.m = h1.f26792c;
        this.f26865o = 5000L;
        this.f26866p = 15000L;
        this.f26867q = 3000L;
        this.f26864n = g1.f26774b;
        this.f26868r = new h(b7.f0.K(20L), b7.f0.K(500L));
        this.f26853b = b7.y.f4045a;
        this.f26869s = 500L;
        this.f26870t = 2000L;
        this.f26871u = true;
        this.f26873w = wuoM.xYCxayQdtGcZmP;
        this.f26860i = -1000;
        new p20.c();
    }
}
