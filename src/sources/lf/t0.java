package lf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.FacebookException;
import com.facebook.login.widget.ProfilePictureView;
import fr.p3;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Handler f40121b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f40120a = new t0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q1 f40122c = new q1(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q1 f40123d = new q1(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f40124e = new HashMap();

    /* JADX WARN: Code duplicated, block: B:61:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(s0 s0Var) throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? r9;
        Exception facebookException;
        InputStream inputStreamF;
        Bitmap bitmapDecodeStream;
        Uri uri = s0Var.f40118a;
        ?? r11 = 0;
        InputStream inputStream = null;
        r11 = 0;
        Bitmap bitmap = null;
        boolean z11 = true;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
            kotlin.jvm.internal.m.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    int responseCode = httpURLConnection.getResponseCode();
                    try {
                        if (responseCode != 200) {
                            if (responseCode == 301 || responseCode == 302) {
                                try {
                                    String headerField = httpURLConnection.getHeaderField(RequestParameters.SUBRESOURCE_LOCATION);
                                    if (!j1.y(headerField)) {
                                        Uri redirectUri = Uri.parse(headerField);
                                        g1.a(uri, redirectUri);
                                        r0 r0VarG = g(s0Var);
                                        if (r0VarG != null && !r0VarG.f40116c) {
                                            bq.f fVar = r0VarG.f40114a;
                                            kotlin.jvm.internal.m.e(redirectUri, "redirectUri");
                                            Object obj = s0Var.f40119b;
                                            try {
                                                s0 s0Var2 = new s0();
                                                s0Var2.f40118a = redirectUri;
                                                s0Var2.f40119b = obj;
                                                try {
                                                    e(fVar, s0Var2, f40123d, new h9.b(s0Var2, false, 2));
                                                } catch (IOException e8) {
                                                    e = e8;
                                                    e = e;
                                                    z11 = false;
                                                    r9 = 0;
                                                    j1.d(r9);
                                                    j1.k(httpURLConnection);
                                                    facebookException = e;
                                                }
                                            } catch (IOException e10) {
                                                e = e10;
                                            }
                                        }
                                    }
                                    z11 = false;
                                    bitmapDecodeStream = null;
                                    facebookException = null;
                                } catch (IOException e11) {
                                    e = e11;
                                }
                            } else {
                                inputStreamF = httpURLConnection.getErrorStream();
                                StringBuilder sb2 = new StringBuilder();
                                if (inputStreamF != null) {
                                    InputStreamReader inputStreamReader = new InputStreamReader(inputStreamF);
                                    char[] cArr = new char[128];
                                    while (true) {
                                        int i11 = inputStreamReader.read(cArr, 0, 128);
                                        if (i11 <= 0) {
                                            break;
                                        } else {
                                            sb2.append(cArr, 0, i11);
                                        }
                                    }
                                    j1.d(inputStreamReader);
                                } else {
                                    sb2.append("Unexpected error while downloading an image.");
                                }
                                facebookException = new FacebookException(sb2.toString());
                                bitmapDecodeStream = null;
                            }
                            j1.d(inputStream);
                            j1.k(httpURLConnection);
                            bitmap = bitmapDecodeStream;
                            if (z11) {
                                f40120a.f(s0Var, facebookException, bitmap, false);
                            }
                        }
                        inputStreamF = v0.f(httpURLConnection);
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamF);
                        facebookException = null;
                        inputStream = inputStreamF;
                        j1.d(inputStream);
                        j1.k(httpURLConnection);
                        bitmap = bitmapDecodeStream;
                    } catch (IOException e12) {
                        e = e12;
                        r9 = uri;
                        j1.d(r9);
                        j1.k(httpURLConnection);
                        facebookException = e;
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = uri;
                        j1.d(r11);
                        j1.k(httpURLConnection);
                        throw th;
                    }
                } catch (IOException e13) {
                    e = e13;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e14) {
            e = e14;
            r9 = 0;
            httpURLConnection = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
        if (z11) {
            f40120a.f(s0Var, facebookException, bitmap, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0082: MOVE (r1 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:131), block:B:28:0x0082 */
    public static final void b(s0 s0Var, boolean z11) throws Throwable {
        BufferedInputStream bufferedInputStreamC;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        Uri uri;
        Uri uri2 = s0Var.f40118a;
        InputStreamReader inputStreamReader3 = null;
        boolean z12 = false;
        if (z11) {
            String str = g1.f40026a;
            String str2 = g1.f40027b;
            String string = uri2.toString();
            kotlin.jvm.internal.m.e(string, "uri.toString()");
            HashSet hashSet = new HashSet();
            hashSet.add(string);
            try {
                try {
                    o0 o0VarB = g1.b();
                    BufferedInputStream bufferedInputStreamA = o0VarB.a(string, str2);
                    inputStreamReader = null;
                    boolean z13 = false;
                    String str3 = string;
                    while (true) {
                        if (bufferedInputStreamA != null) {
                            try {
                                InputStreamReader inputStreamReader4 = new InputStreamReader(bufferedInputStreamA);
                                try {
                                    char[] cArr = new char[128];
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i11 = inputStreamReader4.read(cArr, 0, 128); i11 > 0; i11 = inputStreamReader4.read(cArr, 0, 128)) {
                                        sb2.append(cArr, 0, i11);
                                    }
                                    j1.d(inputStreamReader4);
                                    String string2 = sb2.toString();
                                    kotlin.jvm.internal.m.e(string2, "urlBuilder.toString()");
                                    if (hashSet.contains(string2)) {
                                        if (string2.equals(str3)) {
                                            inputStreamReader = inputStreamReader4;
                                            z13 = true;
                                        } else {
                                            p3 p3Var = y0.f40132d;
                                            p3.t(re.d0.CACHE, str, "A loop detected in UrlRedirectCache");
                                            j1.d(inputStreamReader4);
                                        }
                                        uri = null;
                                        if (uri != null) {
                                            bufferedInputStreamC = v0.c(uri);
                                            if (bufferedInputStreamC != null) {
                                                z12 = true;
                                            }
                                        } else {
                                            bufferedInputStreamC = null;
                                        }
                                    } else {
                                        hashSet.add(string2);
                                        bufferedInputStreamA = o0VarB.a(string2, str2);
                                        str3 = string2;
                                        inputStreamReader = inputStreamReader4;
                                        z13 = true;
                                    }
                                } catch (IOException e8) {
                                    e = e8;
                                    inputStreamReader = inputStreamReader4;
                                    p3 p3Var2 = y0.f40132d;
                                    p3.t(re.d0.CACHE, str, "IOException when accessing cache: " + e.getMessage());
                                } catch (Throwable th2) {
                                    th = th2;
                                    inputStreamReader3 = inputStreamReader4;
                                    j1.d(inputStreamReader3);
                                    throw th;
                                }
                            } catch (IOException e10) {
                                e = e10;
                            }
                        }
                        if (z13) {
                            uri = Uri.parse(str3);
                            j1.d(inputStreamReader);
                        } else {
                            j1.d(inputStreamReader);
                            uri = null;
                        }
                        if (uri != null) {
                            bufferedInputStreamC = v0.c(uri);
                            if (bufferedInputStreamC != null) {
                                z12 = true;
                            }
                        } else {
                            bufferedInputStreamC = null;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader3 = inputStreamReader2;
                }
            } catch (IOException e11) {
                e = e11;
                inputStreamReader = null;
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            bufferedInputStreamC = null;
        }
        if (!z12) {
            bufferedInputStreamC = v0.c(uri2);
        }
        if (bufferedInputStreamC != null) {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStreamC);
            j1.d(bufferedInputStreamC);
            f40120a.f(s0Var, null, bitmapDecodeStream, z12);
            return;
        }
        r0 r0VarG = g(s0Var);
        bq.f fVar = r0VarG != null ? r0VarG.f40114a : null;
        if (r0VarG == null || r0VarG.f40116c || fVar == null) {
            return;
        }
        e(fVar, s0Var, f40122c, new aj.i(s0Var, 7));
    }

    public static final void c(bq.f request) {
        kotlin.jvm.internal.m.f(request, "request");
        Uri uri = (Uri) request.f4944b;
        Object obj = request.f4946d;
        s0 s0Var = new s0();
        s0Var.f40118a = uri;
        s0Var.f40119b = obj;
        HashMap map = f40124e;
        synchronized (map) {
            try {
                r0 r0Var = (r0) map.get(s0Var);
                if (r0Var != null) {
                    g1.k kVar = r0Var.f40115b;
                    if (kVar != null) {
                        q1 q1Var = (q1) kVar.f28532e;
                        ReentrantLock reentrantLock = q1Var.f40105c;
                        reentrantLock.lock();
                        try {
                            if (kVar.f28528a) {
                                reentrantLock.unlock();
                                r0Var.f40116c = true;
                            } else {
                                q1Var.f40106d = kVar.j(q1Var.f40106d);
                                reentrantLock.unlock();
                                map.remove(s0Var);
                            }
                        } catch (Throwable th2) {
                            reentrantLock.unlock();
                            throw th2;
                        }
                    } else {
                        r0Var.f40116c = true;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static final void d(bq.f fVar) {
        Uri uri = (Uri) fVar.f4944b;
        Object obj = fVar.f4946d;
        s0 s0Var = new s0();
        s0Var.f40118a = uri;
        s0Var.f40119b = obj;
        HashMap map = f40124e;
        synchronized (map) {
            try {
                r0 r0Var = (r0) map.get(s0Var);
                if (r0Var != null) {
                    r0Var.f40114a = fVar;
                    r0Var.f40116c = false;
                    g1.k kVar = r0Var.f40115b;
                    if (kVar != null) {
                        q1 q1Var = (q1) kVar.f28532e;
                        ReentrantLock reentrantLock = q1Var.f40105c;
                        reentrantLock.lock();
                        try {
                            if (!kVar.f28528a) {
                                g1.k kVarJ = kVar.j(q1Var.f40106d);
                                q1Var.f40106d = kVarJ;
                                q1Var.f40106d = kVar.a(kVarJ, true);
                            }
                            reentrantLock.unlock();
                        } catch (Throwable th2) {
                            reentrantLock.unlock();
                            throw th2;
                        }
                    }
                } else {
                    e(fVar, s0Var, f40123d, new h9.b(s0Var, fVar.f4943a, 2));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void e(bq.f request, s0 s0Var, q1 q1Var, Runnable runnable) {
        HashMap map = f40124e;
        synchronized (map) {
            kotlin.jvm.internal.m.f(request, "request");
            r0 r0Var = new r0();
            r0Var.f40114a = request;
            map.put(s0Var, r0Var);
            q1Var.getClass();
            g1.k kVar = new g1.k();
            kVar.f28532e = q1Var;
            kVar.f28529b = runnable;
            ReentrantLock reentrantLock = q1Var.f40105c;
            reentrantLock.lock();
            try {
                q1Var.f40106d = kVar.a(q1Var.f40106d, true);
                reentrantLock.unlock();
                q1Var.a(null);
                r0Var.f40115b = kVar;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public static r0 g(s0 s0Var) {
        r0 r0Var;
        HashMap map = f40124e;
        synchronized (map) {
            r0Var = (r0) map.remove(s0Var);
        }
        return r0Var;
    }

    public final void f(s0 s0Var, final Exception exc, final Bitmap bitmap, final boolean z11) {
        Handler handler;
        r0 r0VarG = g(s0Var);
        if (r0VarG == null || r0VarG.f40116c) {
            return;
        }
        final bq.f fVar = r0VarG.f40114a;
        final hh.c cVar = fVar != null ? (hh.c) fVar.f4945c : null;
        if (cVar != null) {
            synchronized (this) {
                try {
                    if (f40121b == null) {
                        f40121b = new Handler(Looper.getMainLooper());
                    }
                    handler = f40121b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (handler != null) {
                handler.post(new Runnable() { // from class: lf.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        bq.f request = fVar;
                        kotlin.jvm.internal.m.f(request, "$request");
                        kotlin.jvm.internal.m.f(request, "request");
                        bq.f fVar2 = new bq.f();
                        fVar2.f4944b = request;
                        fVar2.f4945c = exc;
                        fVar2.f4943a = z11;
                        fVar2.f4946d = bitmap;
                        ProfilePictureView.a((ProfilePictureView) cVar.f32212b, fVar2);
                    }
                });
            }
        }
    }
}
