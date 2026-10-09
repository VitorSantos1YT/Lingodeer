package th;

import android.content.Context;
import android.net.Uri;
import b7.f0;
import com.adjust.sdk.Constants;
import d7.o;
import f7.i1;
import f7.n;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import kotlin.jvm.internal.m;
import ob.l;
import p7.v0;
import re.q;
import re.v;
import x7.k;
import y6.e0;
import y6.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f52414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i1 f52415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f52416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f52417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f52418e;

    public e(Context context) {
        m.f(context, "context");
        this.f52414a = context;
        this.f52418e = 1.0f;
        e();
    }

    public final void a() {
        if (this.f52416c != null) {
            this.f52416c = null;
        }
    }

    public final void b() {
        try {
            a();
            i1 i1Var = this.f52415b;
            if (i1Var != null) {
                i1Var.release();
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final long c() {
        i1 i1Var = this.f52415b;
        if (i1Var != null) {
            return i1Var.P();
        }
        return -1L;
    }

    public final long d() {
        i1 i1Var = this.f52415b;
        if (i1Var != null) {
            return i1Var.getDuration();
        }
        return -1L;
    }

    public final void e() {
        if (this.f52415b == null) {
            q qVar = new q(1);
            Context context = this.f52414a;
            s7.q qVar2 = new s7.q(context, qVar);
            f7.j jVar = new f7.j();
            n nVar = new n(context);
            b7.a.j(!nVar.f26872v);
            nVar.f26856e = new f7.m(qVar2, 1);
            b7.a.j(!nVar.f26872v);
            nVar.f26857f = new f7.m(jVar, 0);
            b7.a.j(!nVar.f26872v);
            nVar.f26872v = true;
            i1 i1Var = new i1(nVar);
            this.f52415b = i1Var;
            i1Var.i(new d(this));
        }
    }

    public final boolean f() {
        i1 i1Var;
        i1 i1Var2 = this.f52415b;
        return (i1Var2 == null || i1Var2 == null || !i1Var2.g() || (i1Var = this.f52415b) == null || i1Var.u() != 3) ? false : true;
    }

    public final void g() {
        i1 i1Var;
        if (!f() || (i1Var = this.f52415b) == null) {
            return;
        }
        try {
            i1Var.r(false);
            i1Var.u();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void h(String path) {
        m.f(path, "path");
        String strEncode = URLEncoder.encode(path, Charset.forName(Constants.ENCODING).name());
        e();
        Context context = this.f52414a;
        l lVar = new l(context, f0.B(context));
        hh.c cVar = new hh.c(new k(), 16);
        v vVar = new v(2);
        x xVarA = x.a(Uri.parse(strEncode));
        xVarA.f57373b.getClass();
        xVarA.f57373b.getClass();
        xVarA.f57373b.getClass();
        i(new v0(xVarA, lVar, cVar, k7.g.f37960a, vVar, 1048576, null));
    }

    public final void i(v0 v0Var) {
        i1 i1Var = this.f52415b;
        if (i1Var != null) {
            i1Var.s0();
            i1Var.f26800c.G0(v0Var);
        }
        i1 i1Var2 = this.f52415b;
        if (i1Var2 != null) {
            i1Var2.a();
        }
        try {
            i1 i1Var3 = this.f52415b;
            if (i1Var3 != null) {
                i1Var3.c(new e0(this.f52418e, 1.0f));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        i1 i1Var4 = this.f52415b;
        if (i1Var4 != null) {
            i1Var4.r(true);
        }
    }

    public final void j(Uri uri) {
        uri.toString();
        e();
        ob.e eVar = new ob.e(this.f52414a);
        hh.c cVar = new hh.c(new k(), 16);
        v vVar = new v(2);
        x xVarA = x.a(uri);
        xVarA.f57373b.getClass();
        xVarA.f57373b.getClass();
        xVarA.f57373b.getClass();
        i(new v0(xVarA, eVar, cVar, k7.g.f37960a, vVar, 1048576, null));
    }

    public final void k(int i11) {
        e();
        Uri uriBuildRawResourceUri = o.buildRawResourceUri(i11);
        m.e(uriBuildRawResourceUri, "buildRawResourceUri(...)");
        hh.c cVar = new hh.c(new o(this.f52414a), 25);
        hh.c cVar2 = new hh.c(new k(), 16);
        v vVar = new v(2);
        x xVarA = x.a(uriBuildRawResourceUri);
        xVarA.f57373b.getClass();
        xVarA.f57373b.getClass();
        xVarA.f57373b.getClass();
        i(new v0(xVarA, cVar, cVar2, k7.g.f37960a, vVar, 1048576, null));
    }

    public final boolean l() {
        i1 i1Var = this.f52415b;
        if (i1Var == null) {
            return false;
        }
        try {
            i1Var.r(true);
            return i1Var.u() == 3;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public final void m(float f5, boolean z11) {
        i1 i1Var;
        i1 i1Var2;
        this.f52418e = f5;
        i1 i1Var3 = this.f52415b;
        if (i1Var3 != null && i1Var3.u() == 3 && (i1Var2 = this.f52415b) != null) {
            i1Var2.r(false);
        }
        try {
            i1 i1Var4 = this.f52415b;
            if (i1Var4 != null) {
                i1Var4.c(new e0(this.f52418e, 1.0f));
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        i1 i1Var5 = this.f52415b;
        if (i1Var5 == null || i1Var5.u() != 3 || (i1Var = this.f52415b) == null) {
            return;
        }
        i1Var.r(z11);
    }

    public final void n() {
        i1 i1Var;
        try {
            i1 i1Var2 = this.f52415b;
            if (i1Var2 == null || !i1Var2.g0() || (i1Var = this.f52415b) == null) {
                return;
            }
            i1Var.stop();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
