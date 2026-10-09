package av;

import android.content.Context;
import android.net.Uri;
import com.adjust.sdk.Constants;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import p7.v0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f7.a0 f3171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f3172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f3173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f3175f;

    public n(Context context) {
        kotlin.jvm.internal.m.f(context, "context");
        this.f3170a = context;
        this.f3174e = 1.0f;
        this.f3175f = new m(this);
        e();
    }

    public final void a() {
        if (this.f3172c != null) {
            this.f3172c = null;
        }
    }

    public final void b() {
        try {
            f7.a0 a0Var = this.f3171b;
            if (a0Var != null) {
                a0Var.B(this.f3175f);
            }
            a();
            f7.a0 a0Var2 = this.f3171b;
            if (a0Var2 != null) {
                a0Var2.release();
            }
            this.f3171b = null;
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final long c() {
        f7.a0 a0Var = this.f3171b;
        if (a0Var != null) {
            return a0Var.P();
        }
        return -1L;
    }

    public final long d() {
        f7.a0 a0Var = this.f3171b;
        if (a0Var != null) {
            return a0Var.getDuration();
        }
        return -1L;
    }

    public final void e() {
        if (this.f3171b == null) {
            re.q qVar = new re.q(1);
            Context context = this.f3170a;
            s7.q qVar2 = new s7.q(context, qVar);
            f7.j jVar = new f7.j();
            f7.n nVar = new f7.n(context);
            b7.a.j(!nVar.f26872v);
            nVar.f26856e = new f7.m(qVar2, 1);
            b7.a.j(!nVar.f26872v);
            nVar.f26857f = new f7.m(jVar, 0);
            f7.a0 a0VarA = nVar.a();
            this.f3171b = a0VarA;
            a0VarA.P.a(this.f3175f);
        }
    }

    public final boolean f() {
        f7.a0 a0Var;
        f7.a0 a0Var2 = this.f3171b;
        return a0Var2 != null && a0Var2.g() && (a0Var = this.f3171b) != null && a0Var.u() == 3;
    }

    public final void g() {
        f7.a0 a0Var;
        if (!f() || (a0Var = this.f3171b) == null) {
            return;
        }
        try {
            a0Var.r(false);
            a0Var.u();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void h(String path) {
        kotlin.jvm.internal.m.f(path, "path");
        String strEncode = URLEncoder.encode(path, Charset.forName(Constants.ENCODING).name());
        e();
        ob.e eVar = new ob.e(this.f3170a);
        hh.c cVar = new hh.c(new x7.k(), 16);
        re.v vVar = new re.v(2);
        y6.x xVarA = y6.x.a(Uri.parse(strEncode));
        xVarA.f57373b.getClass();
        xVarA.f57373b.getClass();
        xVarA.f57373b.getClass();
        i(new v0(xVarA, eVar, cVar, k7.g.f37960a, vVar, 1048576, null));
    }

    public final void i(v0 v0Var) {
        f7.a0 a0Var = this.f3171b;
        if (a0Var != null) {
            a0Var.G0(v0Var);
        }
        f7.a0 a0Var2 = this.f3171b;
        if (a0Var2 != null) {
            a0Var2.a();
        }
        try {
            f7.a0 a0Var3 = this.f3171b;
            if (a0Var3 != null) {
                a0Var3.c(new y6.e0(this.f3174e, 1.0f));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        f7.a0 a0Var4 = this.f3171b;
        if (a0Var4 != null) {
            a0Var4.r(true);
        }
    }

    public final void j(Uri uri) {
        b7.a.n("playOnline:" + uri);
        e();
        ob.e eVar = new ob.e(this.f3170a);
        hh.c cVar = new hh.c(new x7.k(), 16);
        re.v vVar = new re.v(2);
        y6.x xVarA = y6.x.a(uri);
        xVarA.f57373b.getClass();
        xVarA.f57373b.getClass();
        xVarA.f57373b.getClass();
        i(new v0(xVarA, eVar, cVar, k7.g.f37960a, vVar, 1048576, null));
    }

    public final void k(int i11) {
        e();
        Uri uriBuildRawResourceUri = d7.o.buildRawResourceUri(i11);
        kotlin.jvm.internal.m.e(uriBuildRawResourceUri, "buildRawResourceUri(...)");
        hh.c cVar = new hh.c(new d7.o(this.f3170a), 25);
        hh.c cVar2 = new hh.c(new x7.k(), 16);
        re.v vVar = new re.v(2);
        y6.x xVarA = y6.x.a(uriBuildRawResourceUri);
        xVarA.f57373b.getClass();
        xVarA.f57373b.getClass();
        xVarA.f57373b.getClass();
        i(new v0(xVarA, cVar, cVar2, k7.g.f37960a, vVar, 1048576, null));
    }

    public final boolean l() {
        f7.a0 a0Var = this.f3171b;
        if (a0Var != null) {
            try {
                a0Var.r(true);
                if (a0Var.u() == 3) {
                    return true;
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return false;
    }

    public final void m(float f5, boolean z11) {
        f7.a0 a0Var;
        f7.a0 a0Var2;
        this.f3174e = f5;
        f7.a0 a0Var3 = this.f3171b;
        if (a0Var3 != null && a0Var3.u() == 3 && (a0Var2 = this.f3171b) != null) {
            a0Var2.r(false);
        }
        try {
            f7.a0 a0Var4 = this.f3171b;
            if (a0Var4 != null) {
                a0Var4.c(new y6.e0(this.f3174e, 1.0f));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        f7.a0 a0Var5 = this.f3171b;
        if (a0Var5 == null || a0Var5.u() != 3 || (a0Var = this.f3171b) == null) {
            return;
        }
        a0Var.r(z11);
    }

    public final void n() {
        try {
            f7.a0 a0Var = this.f3171b;
            if (a0Var != null) {
                a0Var.stop();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
