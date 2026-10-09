package lf;

import aj.uZCn.evRpcb;
import android.net.Uri;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import fr.p3;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f40026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f40027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o0 f40028c;

    static {
        String strG = kotlin.jvm.internal.z.a(g1.class).g();
        if (strG == null) {
            strG = "UrlRedirectCache";
        }
        f40026a = strG;
        f40027b = strG.concat("_Redirect");
    }

    public static final synchronized o0 b() {
        o0 o0Var;
        try {
            o0Var = f40028c;
            if (o0Var == null) {
                o0Var = new o0(f40026a, new ay.k0(19));
            }
            f40028c = o0Var;
        } catch (Throwable th2) {
            throw th2;
        }
        return o0Var;
    }

    public static final void a(Uri uri, Uri uri2) {
        if (uri2 == null) {
            return;
        }
        BufferedOutputStream bufferedOutputStreamB = null;
        try {
            o0 o0VarB = b();
            String string = uri.toString();
            kotlin.jvm.internal.m.e(string, evRpcb.hfujpnYWLY);
            bufferedOutputStreamB = o0VarB.b(string, f40027b);
            String string2 = uri2.toString();
            kotlin.jvm.internal.m.e(string2, OCBJEWZHh.JlEzCThJdUSXRp);
            byte[] bytes = string2.getBytes(oz.a.f46133a);
            kotlin.jvm.internal.m.e(bytes, "this as java.lang.String).getBytes(charset)");
            bufferedOutputStreamB.write(bytes);
        } catch (IOException e8) {
            p3 p3Var = y0.f40132d;
            p3.t(re.d0.CACHE, f40026a, "IOException when accessing cache: " + e8.getMessage());
        } finally {
            j1.d(bufferedOutputStreamB);
        }
    }
}
