package cu;

import android.content.Context;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import qy.b0;
import rz.b2;
import rz.e0;
import rz.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f22572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f22573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fz.a f22574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fz.c f22575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xy.i f22576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a00.e f22578h = new a00.e();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile j f22579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f22580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public rz.t f22582l;
    public i m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f22583n;

    /* JADX WARN: Multi-variable type inference failed */
    public t(Context context, h hVar, g gVar, fz.a aVar, fz.c cVar, fz.e eVar, String str) throws IllegalAccessException, InvocationTargetException {
        this.f22571a = context;
        this.f22572b = hVar;
        this.f22573c = gVar;
        this.f22574d = aVar;
        this.f22575e = cVar;
        this.f22576f = (xy.i) eVar;
        this.f22577g = str;
        b2 b2VarE = e0.e();
        yz.f fVar = o0.f50940a;
        wz.d dVarC = e0.c(ew.a.w(b2VarE, yz.e.f58387a));
        this.f22580j = true;
        rz.t tVarB = e0.b();
        tVarB.J(b0.f48488a);
        this.f22582l = tVarB;
        e0.B(dVarC, null, null, new o(this, null, 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:27:0x0078, B:29:0x008c, B:34:0x0097, B:36:0x009b, B:38:0x00a1, B:43:0x00ae, B:45:0x00b2, B:49:0x00bc, B:60:0x00e2, B:63:0x00e8, B:65:0x00ec, B:67:0x00f5, B:70:0x0104, B:72:0x0108, B:74:0x0112, B:52:0x00c3, B:54:0x00cf, B:17:0x0044), top: B:88:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x0097 A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:27:0x0078, B:29:0x008c, B:34:0x0097, B:36:0x009b, B:38:0x00a1, B:43:0x00ae, B:45:0x00b2, B:49:0x00bc, B:60:0x00e2, B:63:0x00e8, B:65:0x00ec, B:67:0x00f5, B:70:0x0104, B:72:0x0108, B:74:0x0112, B:52:0x00c3, B:54:0x00cf, B:17:0x0044), top: B:88:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:27:0x0078, B:29:0x008c, B:34:0x0097, B:36:0x009b, B:38:0x00a1, B:43:0x00ae, B:45:0x00b2, B:49:0x00bc, B:60:0x00e2, B:63:0x00e8, B:65:0x00ec, B:67:0x00f5, B:70:0x0104, B:72:0x0108, B:74:0x0112, B:52:0x00c3, B:54:0x00cf, B:17:0x0044), top: B:88:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f0 A[PHI: r4 r10 r17
      0x00f0: PHI (r4v8 a00.a) = (r4v17 a00.a), (r4v18 a00.a) binds: [B:71:0x0106, B:65:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r10v2 kotlin.jvm.internal.y) = (r10v0 kotlin.jvm.internal.y), (r10v3 kotlin.jvm.internal.y) binds: [B:71:0x0106, B:65:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r17v1 int) = (r17v0 int), (r17v4 int) binds: [B:71:0x0106, B:65:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0103  */
    /* JADX WARN: Code duplicated, block: B:70:0x0104 A[Catch: all -> 0x004b, PHI: r1 r4 r10 r17
      0x0104: PHI (r1v2 java.lang.Object) = (r1v9 java.lang.Object), (r1v1 java.lang.Object) binds: [B:68:0x0101, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r4v2 a00.a) = (r4v21 a00.a), (r4v22 a00.a) binds: [B:68:0x0101, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r10v0 kotlin.jvm.internal.y) = (r10v3 kotlin.jvm.internal.y), (r10v8 kotlin.jvm.internal.y) binds: [B:68:0x0101, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r17v0 int) = (r17v4 int), (r17v8 int) binds: [B:68:0x0101, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x004b, blocks: (B:27:0x0078, B:29:0x008c, B:34:0x0097, B:36:0x009b, B:38:0x00a1, B:43:0x00ae, B:45:0x00b2, B:49:0x00bc, B:60:0x00e2, B:63:0x00e8, B:65:0x00ec, B:67:0x00f5, B:70:0x0104, B:72:0x0108, B:74:0x0112, B:52:0x00c3, B:54:0x00cf, B:17:0x0044), top: B:88:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0108 A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:27:0x0078, B:29:0x008c, B:34:0x0097, B:36:0x009b, B:38:0x00a1, B:43:0x00ae, B:45:0x00b2, B:49:0x00bc, B:60:0x00e2, B:63:0x00e8, B:65:0x00ec, B:67:0x00f5, B:70:0x0104, B:72:0x0108, B:74:0x0112, B:52:0x00c3, B:54:0x00cf, B:17:0x0044), top: B:88:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0112 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #0 {all -> 0x004b, blocks: (B:27:0x0078, B:29:0x008c, B:34:0x0097, B:36:0x009b, B:38:0x00a1, B:43:0x00ae, B:45:0x00b2, B:49:0x00bc, B:60:0x00e2, B:63:0x00e8, B:65:0x00ec, B:67:0x00f5, B:70:0x0104, B:72:0x0108, B:74:0x0112, B:52:0x00c3, B:54:0x00cf, B:17:0x0044), top: B:88:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x011f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x0120  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0126 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x0127  */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0135, code lost:
    
        if (r1 == r3) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [a00.a, java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0135 -> B:85:0x0138). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(cu.t r18, xy.c r19) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.t.a(cu.t, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(t tVar, vy.d dVar) {
        n nVar;
        a00.e eVar;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i11 = nVar.f22545d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f22545d = i11 - Integer.MIN_VALUE;
            } else {
                nVar = new n(tVar, dVar);
            }
        } else {
            nVar = new n(tVar, dVar);
        }
        Object obj = nVar.f22543b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = nVar.f22545d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            a00.e eVar2 = tVar.f22578h;
            nVar.f22542a = eVar2;
            nVar.f22545d = 1;
            if (eVar2.b(nVar) == aVar) {
                return aVar;
            }
            eVar = eVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = nVar.f22542a;
            com.bumptech.glide.e.F(obj);
        }
        try {
            tVar.f22580j = true;
            return b0.f48488a;
        } finally {
            eVar.a(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(t tVar, xy.c cVar) {
        s sVar;
        a00.e eVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i11 = sVar.f22570d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sVar.f22570d = i11 - Integer.MIN_VALUE;
            } else {
                sVar = new s(tVar, cVar);
            }
        } else {
            sVar = new s(tVar, cVar);
        }
        Object obj = sVar.f22568b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = sVar.f22570d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            a00.e eVar2 = tVar.f22578h;
            sVar.f22567a = eVar2;
            sVar.f22570d = 1;
            if (eVar2.b(sVar) == aVar) {
                return aVar;
            }
            eVar = eVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = sVar.f22567a;
            com.bumptech.glide.e.F(obj);
        }
        try {
            int i13 = tVar.f22581k - 1;
            tVar.f22581k = i13;
            b0 b0Var = b0.f48488a;
            if (i13 <= 0) {
                tVar.f22581k = 0;
                tVar.f22582l.J(b0Var);
            }
            return b0Var;
        } finally {
            eVar.a(null);
        }
    }

    public static String k(File file) {
        if (!file.exists()) {
            return null;
        }
        return file.getAbsolutePath() + ":" + file.lastModified() + ":" + file.length();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x0117  */
    /* JADX WARN: Code duplicated, block: B:56:0x011c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0121  */
    /* JADX WARN: Code duplicated, block: B:61:0x0124  */
    /* JADX WARN: Code duplicated, block: B:63:0x0128  */
    /* JADX WARN: Code duplicated, block: B:65:0x012e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0132  */
    /* JADX WARN: Code duplicated, block: B:70:0x0142  */
    /* JADX WARN: Code duplicated, block: B:74:0x0150  */
    /* JADX WARN: Code duplicated, block: B:80:0x0167 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x0168  */
    /* JADX WARN: Code duplicated, block: B:84:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015f, code lost:
    
        if (r0 == r8) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r13, boolean r14, xy.c r15) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.t.d(java.lang.String, boolean, xy.c):java.lang.Object");
    }

    public final String e() {
        return k((File) this.f22572b.f22519c.invoke());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, boolean z11, boolean z12, xy.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i11 = mVar.f22541c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f22541c = i11 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objD = mVar.f22539a;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = mVar.f22541c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objD);
            j jVar = this.f22579i;
            if (jVar != null) {
                if (!jVar.f22523a.u()) {
                    jVar = null;
                }
                if (jVar != null) {
                    if (z11) {
                        i iVar = this.m;
                        if (iVar != null && kotlin.jvm.internal.m.a(e(), iVar.f22521a) && System.currentTimeMillis() < iVar.f22522b) {
                            this.f22579i = null;
                            try {
                                this.f22574d.invoke();
                            } catch (Exception unused) {
                            }
                            this.f22580j = false;
                            return null;
                        }
                        this.f22580j = true;
                        this.m = null;
                    } else {
                        i iVar2 = this.m;
                        if (iVar2 != null) {
                            if (kotlin.jvm.internal.m.a(e(), iVar2.f22521a) && System.currentTimeMillis() < iVar2.f22522b) {
                                this.f22580j = false;
                                return jVar.f22523a;
                            }
                            this.m = null;
                            this.f22580j = true;
                        }
                    }
                    if (!this.f22580j && !z12) {
                        return jVar.f22523a;
                    }
                }
            }
            i iVar3 = this.m;
            if (iVar3 != null && kotlin.jvm.internal.m.a(e(), iVar3.f22521a) && System.currentTimeMillis() < iVar3.f22522b) {
                return null;
            }
            mVar.f22541c = 1;
            objD = d(str, z11, mVar);
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objD);
        }
        j jVar2 = (j) objD;
        if (jVar2 == null) {
            return null;
        }
        this.f22579i = jVar2;
        this.f22583n = jVar2.f22524b;
        this.f22580j = false;
        return jVar2.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, String str2, xy.c cVar) {
        p pVar;
        File file;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i11 = pVar.f22552d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pVar.f22552d = i11 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object obj = pVar.f22550b;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = pVar.f22552d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            File databasePath = this.f22571a.getDatabasePath(this.f22572b.f22517a);
            if (!databasePath.exists()) {
                return null;
            }
            pVar.f22549a = databasePath;
            pVar.f22552d = 1;
            Object objH = h(databasePath, str, str2, pVar);
            if (objH == obj2) {
                return obj2;
            }
            obj = objH;
            file = databasePath;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = pVar.f22549a;
            com.bumptech.glide.e.F(obj);
        }
        j jVar = (j) obj;
        if (jVar == null) {
            return null;
        }
        file.getAbsolutePath();
        return jVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068 A[Catch: Exception -> 0x0075, TryCatch #2 {Exception -> 0x0075, blocks: (B:22:0x0060, B:24:0x0068, B:26:0x006e, B:19:0x0045), top: B:41:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x006e A[Catch: Exception -> 0x0075, TRY_LEAVE, TryCatch #2 {Exception -> 0x0075, blocks: (B:22:0x0060, B:24:0x0068, B:26:0x006e, B:19:0x0045), top: B:41:0x0045 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [fz.e, xy.i] */
    public final Object h(File file, String str, String str2, xy.c cVar) {
        q qVar;
        w9.s sVar;
        Object objInvoke;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i11 = qVar.f22559t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                qVar.f22559t = i11 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object obj = qVar.f22557e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = qVar.f22559t;
        fz.a aVar2 = this.f22574d;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                try {
                    aVar2.invoke();
                } catch (Exception unused) {
                }
                try {
                    sVar = (w9.s) this.f22575e.invoke(file);
                    ?? r9 = this.f22576f;
                    qVar.f22553a = file;
                    qVar.f22554b = str;
                    qVar.f22555c = str2;
                    qVar.f22556d = sVar;
                    qVar.f22559t = 1;
                    objInvoke = r9.invoke(sVar, qVar);
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                    if (((Boolean) objInvoke).booleanValue()) {
                        return new j(sVar, str, str2);
                    }
                    file.getAbsolutePath();
                    aVar2.invoke();
                } catch (Exception unused2) {
                    file.getAbsolutePath();
                    aVar2.invoke();
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w9.s sVar2 = qVar.f22556d;
                str2 = qVar.f22555c;
                str = qVar.f22554b;
                File file2 = qVar.f22553a;
                try {
                    com.bumptech.glide.e.F(obj);
                    sVar = sVar2;
                    file = file2;
                    objInvoke = obj;
                    if (((Boolean) objInvoke).booleanValue()) {
                        return new j(sVar, str, str2);
                    }
                    file.getAbsolutePath();
                    aVar2.invoke();
                } catch (Exception unused3) {
                    file = file2;
                    file.getAbsolutePath();
                    aVar2.invoke();
                }
            }
            return null;
        } catch (Exception unused4) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00db  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:44:0x0105  */
    /* JADX WARN: Code duplicated, block: B:47:0x010e  */
    /* JADX WARN: Code duplicated, block: B:50:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0143 A[PHI: r6 r8
      0x0143: PHI (r6v9 cu.u) = (r6v7 cu.u), (r6v10 cu.u) binds: [B:46:0x010c, B:59:0x0140] A[DONT_GENERATE, DONT_INLINE]
      0x0143: PHI (r8v5 java.lang.String) = (r8v3 java.lang.String), (r8v6 java.lang.String) binds: [B:46:0x010c, B:59:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0155  */
    /* JADX WARN: Code duplicated, block: B:68:0x0178  */
    /* JADX WARN: Code duplicated, block: B:71:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0181  */
    /* JADX WARN: Code duplicated, block: B:74:0x0184 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012d, code lost:
    
        if (r1 == r3) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(cu.u r17, java.lang.String r18, xy.c r19) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cu.t.i(cu.u, java.lang.String, xy.c):java.lang.Object");
    }

    public final void j(File file) {
        this.m = new i(k(file), System.currentTimeMillis() + 10000);
        this.f22580j = false;
    }
}
