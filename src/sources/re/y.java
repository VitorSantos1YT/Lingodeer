package re;

import android.net.Uri;
import android.os.Bundle;
import bw.ORXQ.ADSb;
import com.facebook.FacebookException;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import lf.v0;
import lf.y0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f49225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f49226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile String f49227l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f49228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f49230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f49231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f49232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f49233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u f49234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c0 f49235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f49236i;

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        kotlin.jvm.internal.m.e(charArray, "this as java.lang.String).toCharArray()");
        StringBuilder sb2 = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i11 = 0; i11 < iNextInt; i11++) {
            sb2.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "buffer.toString()");
        f49225j = string;
        f49226k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public y(b bVar, String str, Bundle bundle, c0 c0Var, u uVar) {
        this.f49228a = bVar;
        this.f49229b = str;
        this.f49233f = null;
        j(uVar);
        k(c0Var);
        if (bundle != null) {
            this.f49231d = new Bundle(bundle);
        } else {
            this.f49231d = new Bundle();
        }
        this.f49233f = s.e();
    }

    public static String f() {
        String strB = s.b();
        String strC = s.c();
        if (strB.length() <= 0 || strC.length() <= 0) {
            return null;
        }
        return strB + '|' + strC;
    }

    public final String b(String str, boolean z11) {
        if (!z11 && this.f49235h == c0.POST) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f49231d.keySet()) {
            Object obj = this.f49231d.get(str2);
            if (obj == null) {
                obj = BuildConfig.VERSION_NAME;
            }
            if (v.A(obj)) {
                builderBuildUpon.appendQueryParameter(str2, v.m(obj).toString());
            } else if (this.f49235h != c0.GET) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
            }
        }
        String string = builderBuildUpon.toString();
        kotlin.jvm.internal.m.e(string, "uriBuilder.toString()");
        return string;
    }

    public final b0 c() {
        ArrayList arrayListR = v.r(new a0(ry.l.k0(new y[]{this})));
        if (arrayListR.size() == 1) {
            return (b0) arrayListR.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    public final z d() {
        a0 a0Var = new a0(ry.l.k0(new y[]{this}));
        v0.j(a0Var);
        z zVar = new z(a0Var);
        zVar.executeOnExecutor(s.d(), new Void[0]);
        return zVar;
    }

    public final String e() {
        b bVar = this.f49228a;
        if (bVar != null) {
            if (!this.f49231d.containsKey("access_token")) {
                String str = bVar.f49119e;
                y0.f40132d.v(str);
                return str;
            }
        } else if (!this.f49231d.containsKey("access_token")) {
            return f();
        }
        return this.f49231d.getString("access_token");
    }

    public final String g() {
        String str;
        String str2;
        if (this.f49235h == c0.POST && (str2 = this.f49229b) != null && oz.x.k0(str2, "/videos", false)) {
            str = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{s.f()}, 1));
        } else {
            String subdomain = s.f();
            kotlin.jvm.internal.m.f(subdomain, "subdomain");
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{subdomain}, 1));
        }
        String strH = h(str);
        a();
        return b(strH, false);
    }

    public final String h(String str) {
        if (!(!kotlin.jvm.internal.m.a(s.f(), "instagram.com") ? true : !i())) {
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{s.f49217r}, 1));
        }
        Pattern pattern = f49226k;
        String str2 = this.f49229b;
        if (!pattern.matcher(str2).matches()) {
            str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f49233f, str2}, 2));
        }
        return String.format("%s/%s", Arrays.copyOf(new Object[]{str, str2}, 2));
    }

    public final boolean i() {
        String str = this.f49229b;
        if (str == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder("^/?");
        sb2.append(s.b());
        sb2.append("/?.*");
        return this.f49236i || Pattern.matches(sb2.toString(), str) || Pattern.matches("^/?app/?.*", str);
    }

    public final void j(u uVar) {
        s.i(d0.GRAPH_API_DEBUG_INFO);
        s.i(d0.GRAPH_API_DEBUG_WARNING);
        this.f49234g = uVar;
    }

    public final void k(c0 c0Var) {
        if (c0Var == null) {
            c0Var = c0.GET;
        }
        this.f49235h = c0Var;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.f49228a;
        if (obj == null) {
            obj = "null";
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f49229b);
        sb2.append(", graphObject: ");
        sb2.append(this.f49230c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f49235h);
        sb2.append(", parameters: ");
        sb2.append(this.f49231d);
        sb2.append("}");
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public final void a() {
        Bundle bundle = this.f49231d;
        String strE = e();
        boolean zV0 = strE != null ? oz.q.v0(strE, "|", false) : false;
        if (strE == null || !oz.x.s0(strE, "IG", false) || zV0 || !i()) {
            if ((kotlin.jvm.internal.m.a(s.f(), "instagram.com") ? true ^ i() : true) || zV0) {
                String strE2 = e();
                if (strE2 != null) {
                    bundle.putString("access_token", strE2);
                }
            } else {
                bundle.putString("access_token", f());
            }
        } else {
            bundle.putString("access_token", f());
        }
        if (!bundle.containsKey("access_token")) {
            s.c();
        }
        bundle.putString("sdk", "android");
        bundle.putString(ADSb.eMHpCQjm, "json");
        s.i(d0.GRAPH_API_DEBUG_INFO);
        s.i(d0.GRAPH_API_DEBUG_WARNING);
    }
}
