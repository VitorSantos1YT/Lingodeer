package ac;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import av.r;
import coil.network.HttpException;
import fr.p3;
import java.io.IOException;
import java.util.Map;
import m00.a0;
import m00.c0;
import m00.d0;
import m00.o;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import oz.x;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final CacheControl f549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final CacheControl f550g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gc.l f552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f555e;

    static {
        CacheControl.Builder builder = new CacheControl.Builder();
        builder.f44961a = true;
        builder.f44962b = true;
        f549f = builder.a();
        CacheControl.Builder builder2 = new CacheControl.Builder();
        builder2.f44961a = true;
        builder2.f44964d = true;
        f550g = builder2.a();
    }

    public m(String str, gc.l lVar, q qVar, q qVar2, boolean z11) {
        this.f551a = str;
        this.f552b = lVar;
        this.f553c = qVar;
        this.f554d = qVar2;
        this.f555e = z11;
    }

    public static String d(String str, MediaType mediaType) {
        String strB;
        String str2 = mediaType != null ? mediaType.f45065a : null;
        if ((str2 == null || x.s0(str2, "text/plain", false)) && (strB = kc.h.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (str2 != null) {
            return oz.q.e1(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020c A[Catch: Exception -> 0x0190, TryCatch #0 {Exception -> 0x0190, blocks: (B:92:0x01dd, B:94:0x01e3, B:96:0x0203, B:98:0x0208, B:97:0x0206, B:100:0x020c, B:101:0x0211, B:68:0x0160, B:71:0x016c, B:73:0x0178, B:75:0x0186, B:79:0x0192, B:81:0x019e, B:83:0x01b9, B:85:0x01be, B:84:0x01bc, B:87:0x01c2), top: B:109:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e3 A[Catch: Exception -> 0x0190, TryCatch #0 {Exception -> 0x0190, blocks: (B:92:0x01dd, B:94:0x01e3, B:96:0x0203, B:98:0x0208, B:97:0x0206, B:100:0x020c, B:101:0x0211, B:68:0x0160, B:71:0x016c, B:73:0x0178, B:75:0x0186, B:79:0x0192, B:81:0x019e, B:83:0x01b9, B:85:0x01be, B:84:0x01bc, B:87:0x01c2), top: B:109:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0203 A[Catch: Exception -> 0x0190, TryCatch #0 {Exception -> 0x0190, blocks: (B:92:0x01dd, B:94:0x01e3, B:96:0x0203, B:98:0x0208, B:97:0x0206, B:100:0x020c, B:101:0x0211, B:68:0x0160, B:71:0x016c, B:73:0x0178, B:75:0x0186, B:79:0x0192, B:81:0x019e, B:83:0x01b9, B:85:0x01be, B:84:0x01bc, B:87:0x01c2), top: B:109:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0206 A[Catch: Exception -> 0x0190, TryCatch #0 {Exception -> 0x0190, blocks: (B:92:0x01dd, B:94:0x01e3, B:96:0x0203, B:98:0x0208, B:97:0x0206, B:100:0x020c, B:101:0x0211, B:68:0x0160, B:71:0x016c, B:73:0x0178, B:75:0x0186, B:79:0x0192, B:81:0x019e, B:83:0x01b9, B:85:0x01be, B:84:0x01bc, B:87:0x01c2), top: B:109:0x0160 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [ac.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [ac.m] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [ag.c] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12, types: [ag.c] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [ac.m] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // ac.h
    public final Object a(vy.d dVar) throws Exception {
        l lVar;
        ?? r9;
        ag.c cVar;
        fc.e eVarA;
        fc.e eVar;
        ?? r11;
        yb.h hVar;
        ag.c cVar2;
        ?? r12;
        Response response;
        Exception e8;
        ?? r13;
        Response response2;
        ResponseBody responseBody;
        xb.e eVar2;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i11 = lVar.f548f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f548f = i11 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, (xy.c) dVar);
            }
        } else {
            lVar = new l(this, (xy.c) dVar);
        }
        Object obj = lVar.f546d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        ?? r14 = lVar.f548f;
        try {
            if (r14 == 0) {
                com.bumptech.glide.e.F(obj);
                gc.l lVar2 = this.f552b;
                boolean zA = lVar2.f29056n.a();
                String str = this.f551a;
                if (!zA || (hVar = (yb.h) this.f554d.getValue()) == null) {
                    cVar = null;
                } else {
                    String str2 = lVar2.f29052i;
                    if (str2 == null) {
                        str2 = str;
                    }
                    yb.e eVar3 = hVar.f57589b;
                    m00.l lVar3 = m00.l.f40723d;
                    yb.c cVarC = eVar3.c(p3.l(str2).c("SHA-256").f());
                    if (cVarC != null) {
                        cVar2 = new ag.c(cVarC, 3);
                    } else {
                        cVar = null;
                    }
                }
                if (cVar != null) {
                    o oVarC = c();
                    yb.c cVar3 = (yb.c) cVar.f701b;
                    if (cVar3.f57576b) {
                        cVar = cVar2;
                        throw new IllegalStateException("snapshot is closed");
                    }
                    Long l9 = (Long) oVarC.p((a0) cVar3.f57575a.f57568c.get(0)).f24794e;
                    if (l9 == null) {
                        cVar = cVar2;
                    } else if (l9.longValue() == 0) {
                        cVar = cVar2;
                        return new n(g(cVar), d(str, null), xb.e.DISK);
                    }
                    cVar = cVar2;
                    if (!this.f555e) {
                        xb.n nVarG = g(cVar);
                        fc.b bVarF = f(cVar);
                        return new n(nVarG, d(str, bVarF != null ? (MediaType) bVarF.f27122b.getValue() : null), xb.e.DISK);
                    }
                    eVarA = new fc.d(e(), f(cVar)).a();
                    fc.b bVar = eVarA.f27139b;
                    if (eVarA.f27138a == null && bVar != null) {
                        return new n(g(cVar), d(str, (MediaType) bVar.f27122b.getValue()), xb.e.DISK);
                    }
                } else {
                    cVar = cVar2;
                    eVarA = new fc.d(e(), null).a();
                }
                Request request = eVarA.f27138a;
                kotlin.jvm.internal.m.c(request);
                lVar.f543a = this;
                lVar.f544b = cVar;
                lVar.f545c = eVarA;
                lVar.f548f = 1;
                Object objB = b(request, lVar);
                if (objB != aVar) {
                    eVar = eVarA;
                    obj = objB;
                    r11 = this;
                    r12 = cVar;
                }
                return aVar;
            }
            if (r14 != 1) {
                if (r14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                response = (Response) lVar.f545c;
                ag.c cVar4 = lVar.f544b;
                m mVar = lVar.f543a;
                try {
                    com.bumptech.glide.e.F(obj);
                    r13 = mVar;
                    response2 = (Response) obj;
                    Bitmap.Config[] configArr = kc.h.f38057a;
                    responseBody = response2.f45164t;
                    if (responseBody != null) {
                        throw new IllegalStateException("response body == null");
                    }
                    r13.getClass();
                    m00.k kVarSource = responseBody.source();
                    Context context = r13.f552b.f29044a;
                    xb.q qVar = new xb.q(kVarSource, null);
                    String strD = d(r13.f551a, responseBody.contentType());
                    if (response2.H != null) {
                        eVar2 = xb.e.NETWORK;
                    } else {
                        eVar2 = xb.e.DISK;
                    }
                    return new n(qVar, strD, eVar2);
                } catch (Exception e10) {
                    e8 = e10;
                    kc.h.a(response);
                    throw e8;
                }
            }
            fc.e eVar4 = (fc.e) lVar.f545c;
            r9 = lVar.f544b;
            m mVar2 = lVar.f543a;
            try {
                com.bumptech.glide.e.F(obj);
                eVar = eVar4;
                r12 = r9;
                r11 = mVar2;
            } catch (Exception e11) {
                e = e11;
                if (r9 != 0) {
                    kc.h.a(r9);
                }
                throw e;
            }
            Response response3 = (Response) obj;
            Bitmap.Config[] configArr2 = kc.h.f38057a;
            ResponseBody responseBody2 = response3.f45164t;
            if (responseBody2 == null) {
                throw new IllegalStateException("response body == null");
            }
            try {
                ag.c cVarH = r11.h(r12, eVar.f27138a, response3, eVar.f27139b);
                String str3 = r11.f551a;
                if (cVarH != null) {
                    xb.n nVarG2 = r11.g(cVarH);
                    fc.b bVarF2 = r11.f(cVarH);
                    return new n(nVarG2, d(str3, bVarF2 != null ? (MediaType) bVarF2.f27122b.getValue() : null), xb.e.NETWORK);
                }
                if (responseBody2.source().request(1L)) {
                    m00.k kVarSource2 = responseBody2.source();
                    Context context2 = r11.f552b.f29044a;
                    return new n(new xb.q(kVarSource2, null), d(str3, responseBody2.contentType()), response3.H != null ? xb.e.NETWORK : xb.e.DISK);
                }
                kc.h.a(response3);
                Request requestE = r11.e();
                lVar.f543a = r11;
                lVar.f544b = cVarH;
                lVar.f545c = response3;
                lVar.f548f = 2;
                Object objB2 = r11.b(requestE, lVar);
                if (objB2 != aVar) {
                    response = response3;
                    obj = objB2;
                    r13 = r11;
                    response2 = (Response) obj;
                    Bitmap.Config[] configArr3 = kc.h.f38057a;
                    responseBody = response2.f45164t;
                    if (responseBody != null) {
                        throw new IllegalStateException("response body == null");
                    }
                    r13.getClass();
                    m00.k kVarSource3 = responseBody.source();
                    Context context3 = r13.f552b.f29044a;
                    xb.q qVar2 = new xb.q(kVarSource3, null);
                    String strD2 = d(r13.f551a, responseBody.contentType());
                    if (response2.H != null) {
                        eVar2 = xb.e.NETWORK;
                    } else {
                        eVar2 = xb.e.DISK;
                    }
                    return new n(qVar2, strD2, eVar2);
                }
                return aVar;
            } catch (Exception e12) {
                response = response3;
                e8 = e12;
                kc.h.a(response);
                throw e8;
            }
        } catch (Exception e13) {
            e = e13;
            r9 = r14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Request request, xy.c cVar) {
        k kVar;
        Response responseC;
        boolean z11;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i11 = kVar.f542c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f542c = i11 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objR = kVar.f540a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = kVar.f542c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objR);
            Bitmap.Config[] configArr = kc.h.f38057a;
            boolean zA = kotlin.jvm.internal.m.a(Looper.myLooper(), Looper.getMainLooper());
            q qVar = this.f553c;
            if (!zA) {
                RealCall realCallA = ((Call.Factory) qVar.getValue()).a(request);
                kVar.f542c = 1;
                rz.m mVar = new rz.m(1, ue.f.x(kVar));
                mVar.s();
                r rVar = new r(3, realCallA, mVar);
                realCallA.H(rVar);
                mVar.u(rVar);
                objR = mVar.r();
                if (objR == aVar) {
                    return aVar;
                }
            } else {
                if (this.f552b.f29057o.a()) {
                    throw new NetworkOnMainThreadException();
                }
                responseC = ((Call.Factory) qVar.getValue()).a(request).c();
            }
            z11 = responseC.R;
            int i13 = responseC.f45161d;
            if (!z11 || i13 == 304) {
                return responseC;
            }
            ResponseBody responseBody = responseC.f45164t;
            if (responseBody != null) {
                kc.h.a(responseBody);
            }
            StringBuilder sbI = w4.c.i(i13, "HTTP ", ": ");
            sbI.append(responseC.f45160c);
            throw new HttpException(sbI.toString());
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.e.F(objR);
        responseC = (Response) objR;
        z11 = responseC.R;
        int i14 = responseC.f45161d;
        if (z11) {
        }
        return responseC;
    }

    public final o c() {
        Object value = this.f554d.getValue();
        kotlin.jvm.internal.m.c(value);
        return ((yb.h) value).f57588a;
    }

    public final Request e() {
        Request.Builder builder = new Request.Builder();
        builder.e(this.f551a);
        gc.l lVar = this.f552b;
        Headers headers = lVar.f29053j;
        gc.b bVar = lVar.f29056n;
        kotlin.jvm.internal.m.f(headers, "headers");
        builder.f45142c = headers.e();
        for (Map.Entry entry : lVar.f29054k.f29069a.entrySet()) {
            Object key = entry.getKey();
            kotlin.jvm.internal.m.d(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            builder.d((Class) key, entry.getValue());
        }
        boolean zA = bVar.a();
        boolean zA2 = lVar.f29057o.a();
        if (!zA2 && zA) {
            builder.a(CacheControl.f44948p);
        } else if (!zA2 || zA) {
            if (!zA2 && !zA) {
                builder.a(f550g);
            }
        } else if (bVar.b()) {
            builder.a(CacheControl.f44947o);
        } else {
            builder.a(f549f);
        }
        return new Request(builder);
    }

    public final fc.b f(ag.c cVar) throws Throwable {
        Throwable th2;
        fc.b bVar;
        try {
            o oVarC = c();
            yb.c cVar2 = (yb.c) cVar.f701b;
            if (cVar2.f57576b) {
                throw new IllegalStateException("snapshot is closed");
            }
            d0 d0VarC = m00.b.c(oVarC.y((a0) cVar2.f57575a.f57568c.get(0)));
            try {
                bVar = new fc.b(d0VarC);
                try {
                    d0VarC.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    d0VarC.close();
                } catch (Throwable th5) {
                    cf.x.b(th4, th5);
                }
                th2 = th4;
                bVar = null;
            }
            if (th2 == null) {
                return bVar;
            }
            throw th2;
        } catch (IOException unused) {
            return null;
        }
    }

    public final xb.n g(ag.c cVar) {
        yb.c cVar2 = (yb.c) cVar.f701b;
        if (cVar2.f57576b) {
            throw new IllegalStateException("snapshot is closed");
        }
        a0 a0Var = (a0) cVar2.f57575a.f57568c.get(1);
        o oVarC = c();
        String str = this.f552b.f29052i;
        if (str == null) {
            str = this.f551a;
        }
        return new xb.n(a0Var, oVarC, str, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0160  */
    public final ag.c h(ag.c cVar, Request request, Response response, fc.b bVar) {
        yb.g gVar;
        Throwable th2;
        bq.f fVarB;
        Throwable th3 = null;
        if (this.f552b.f29056n.b()) {
            if (this.f555e) {
                if (!request.a().f44950b) {
                    CacheControl cacheControlA = response.Q;
                    if (cacheControlA == null) {
                        CacheControl.Companion companion = CacheControl.f44946n;
                        Headers headers = response.f45163f;
                        companion.getClass();
                        cacheControlA = CacheControl.Companion.a(headers);
                        response.Q = cacheControlA;
                    }
                    if (cacheControlA.f44950b || kotlin.jvm.internal.m.a(response.f45163f.b("Vary"), "*")) {
                    }
                }
                if (cVar != null) {
                    kc.h.a(cVar);
                }
            }
            if (cVar != null) {
                yb.c cVar2 = (yb.c) cVar.f701b;
                yb.e eVar = cVar2.f57577c;
                synchronized (eVar) {
                    cVar2.close();
                    fVarB = eVar.b(cVar2.f57575a.f57566a);
                }
                if (fVarB != null) {
                    gVar = new yb.g(fVarB);
                } else {
                    gVar = null;
                }
            } else {
                yb.h hVar = (yb.h) this.f554d.getValue();
                if (hVar == null) {
                    gVar = null;
                } else {
                    String str = this.f552b.f29052i;
                    if (str == null) {
                        str = this.f551a;
                    }
                    yb.e eVar2 = hVar.f57589b;
                    m00.l lVar = m00.l.f40723d;
                    bq.f fVarB2 = eVar2.b(p3.l(str).c("SHA-256").f());
                    if (fVarB2 != null) {
                        gVar = new yb.g(fVarB2);
                    } else {
                        gVar = null;
                    }
                }
            }
            if (gVar != null) {
                try {
                    try {
                        if (response.f45161d != 304 || bVar == null) {
                            c0 c0VarB = m00.b.b(c().x(((bq.f) gVar.f57587a).f(0)));
                            try {
                                new fc.b(response).a(c0VarB);
                                try {
                                    c0VarB.close();
                                    th2 = null;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                }
                            } catch (Throwable th5) {
                                try {
                                    c0VarB.close();
                                } catch (Throwable th6) {
                                    cf.x.b(th5, th6);
                                }
                                th2 = th5;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                            c0 c0VarB2 = m00.b.b(c().x(((bq.f) gVar.f57587a).f(1)));
                            try {
                                ResponseBody responseBody = response.f45164t;
                                kotlin.jvm.internal.m.c(responseBody);
                                responseBody.source().O(c0VarB2);
                                try {
                                    c0VarB2.close();
                                } catch (Throwable th7) {
                                    th3 = th7;
                                }
                            } catch (Throwable th8) {
                                th3 = th8;
                                try {
                                    c0VarB2.close();
                                } catch (Throwable th9) {
                                    cf.x.b(th3, th9);
                                }
                            }
                            if (th3 != null) {
                                throw th3;
                            }
                        } else {
                            Response.Builder builderA = response.a();
                            builderA.c(fc.c.a(bVar.f27126f, response.f45163f));
                            Response responseA = builderA.a();
                            c0 c0VarB3 = m00.b.b(c().x(((bq.f) gVar.f57587a).f(0)));
                            try {
                                new fc.b(responseA).a(c0VarB3);
                                try {
                                    c0VarB3.close();
                                } catch (Throwable th10) {
                                    th3 = th10;
                                }
                            } catch (Throwable th11) {
                                th3 = th11;
                                try {
                                    c0VarB3.close();
                                } catch (Throwable th12) {
                                    cf.x.b(th3, th12);
                                }
                            }
                            if (th3 != null) {
                                throw th3;
                            }
                        }
                        ag.c cVarA = gVar.a();
                        kc.h.a(response);
                        return cVarA;
                    } catch (Exception e8) {
                        Bitmap.Config[] configArr = kc.h.f38057a;
                        try {
                            ((bq.f) gVar.f57587a).d(false);
                        } catch (Exception unused) {
                        }
                        throw e8;
                    }
                } catch (Throwable th13) {
                    kc.h.a(response);
                    throw th13;
                }
            }
        } else if (cVar != null) {
            kc.h.a(cVar);
        }
        return null;
    }
}
