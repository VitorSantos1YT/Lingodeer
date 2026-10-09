package w9;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import mt.c4;
import qp.m4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f54807l = {"INSERT", "UPDATE", "DELETE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f54808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f54809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f54810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f54811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c4 f54812e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f54814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bq.f f54815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t7.d f54816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f54817j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public fz.a f54818k = new uu.f(10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f54813f = new LinkedHashMap();

    public g0(s sVar, HashMap map, HashMap map2, String[] strArr, boolean z11, c4 c4Var) {
        String lowerCase;
        this.f54808a = sVar;
        this.f54809b = map;
        this.f54810c = map2;
        this.f54811d = z11;
        this.f54812e = c4Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i11 = 0; i11 < length; i11++) {
            String str = strArr[i11];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
            this.f54813f.put(lowerCase2, Integer.valueOf(i11));
            String str2 = (String) this.f54809b.get(strArr[i11]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i11] = lowerCase2;
        }
        this.f54814g = strArr2;
        for (Map.Entry entry : this.f54809b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            kotlin.jvm.internal.m.e(lowerCase3, "toLowerCase(...)");
            if (this.f54813f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                kotlin.jvm.internal.m.e(lowerCase4, "toLowerCase(...)");
                LinkedHashMap linkedHashMap = this.f54813f;
                linkedHashMap.put(lowerCase4, ry.x.U(lowerCase3, linkedHashMap));
            }
        }
        int length2 = this.f54814g.length;
        bq.f fVar = new bq.f();
        fVar.f4944b = new ReentrantLock();
        fVar.f4945c = new long[length2];
        fVar.f4946d = new boolean[length2];
        this.f54815h = fVar;
        this.f54816i = new t7.d(this.f54814g.length);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(g0 g0Var, m mVar, xy.c cVar) {
        y yVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i11 = yVar.f54877d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                yVar.f54877d = i11 - Integer.MIN_VALUE;
            } else {
                yVar = new y(g0Var, cVar);
            }
        } else {
            yVar = new y(g0Var, cVar);
        }
        Object objA = yVar.f54875b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = yVar.f54877d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objA);
            vr.a aVar2 = new vr.a(7);
            yVar.f54874a = mVar;
            yVar.f54877d = 1;
            objA = mVar.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1", aVar2, yVar);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = (Set) yVar.f54874a;
            com.bumptech.glide.e.F(objA);
            return set;
        }
        mVar = (m) yVar.f54874a;
        com.bumptech.glide.e.F(objA);
        Set set2 = (Set) objA;
        if (!set2.isEmpty()) {
            yVar.f54874a = set2;
            yVar.f54877d = 2;
            if (jh.h.i(mVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", yVar) == aVar) {
                return aVar;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object b(g0 g0Var, xy.c cVar) throws Throwable {
        a0 a0Var;
        m4 m4Var;
        Object objY;
        Throwable th2;
        m4 m4Var2;
        s sVar = g0Var.f54808a;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i11 = a0Var.f54753e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a0Var.f54753e = i11 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(g0Var, cVar);
            }
        } else {
            a0Var = new a0(g0Var, cVar);
        }
        Object obj = a0Var.f54751c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = a0Var.f54753e;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            m4Var = sVar.f54856g;
            boolean zD = m4Var.d();
            ry.t tVar = ry.t.f50856a;
            if (!zD) {
                return tVar;
            }
            try {
                if (!g0Var.f54817j.compareAndSet(true, false)) {
                    m4Var.n();
                    return tVar;
                }
                if (!((Boolean) g0Var.f54818k.invoke()).booleanValue()) {
                    m4Var.n();
                    return tVar;
                }
                b0 b0Var = new b0(g0Var, null, 1);
                a0Var.f54749a = g0Var;
                a0Var.f54750b = m4Var;
                a0Var.f54753e = 1;
                objY = sVar.y(false, b0Var, a0Var);
                if (objY == aVar) {
                    return aVar;
                }
            } catch (Throwable th3) {
                m4 m4Var3 = m4Var;
                th2 = th3;
                m4Var2 = m4Var3;
                m4Var2.n();
                throw th2;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m4Var2 = a0Var.f54750b;
            g0 g0Var2 = a0Var.f54749a;
            try {
                com.bumptech.glide.e.F(obj);
                m4Var = m4Var2;
                g0Var = g0Var2;
                objY = obj;
            } catch (Throwable th4) {
                th2 = th4;
                m4Var2.n();
                throw th2;
            }
        }
        Set set = (Set) objY;
        if (!set.isEmpty()) {
            g0Var.f54816i.g(set);
            g0Var.f54812e.invoke(set);
        }
        m4Var.n();
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0091  */
    /* JADX WARN: Code duplicated, block: B:23:0x0097  */
    /* JADX WARN: Code duplicated, block: B:24:0x009a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (jh.h.i(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
    
        if (jh.h.i(r10, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        return r5;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00df -> B:28:0x00e2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(w9.g0 r17, w9.x r18, int r19, xy.c r20) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.g0.c(w9.g0, w9.x, int, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:18:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0082 -> B:19:0x0085). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(w9.g0 r8, w9.x r9, int r10, xy.c r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof w9.d0
            if (r0 == 0) goto L16
            r0 = r11
            w9.d0 r0 = (w9.d0) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.H = r1
            goto L1b
        L16:
            w9.d0 r0 = new w9.d0
            r0.<init>(r8, r11)
        L1b:
            java.lang.Object r11 = r0.f54793f
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.H
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.f54792e
            int r9 = r0.f54791d
            java.lang.String[] r10 = r0.f54790c
            java.lang.String r2 = r0.f54789b
            w9.m r4 = r0.f54788a
            com.bumptech.glide.e.F(r11)
            r11 = r10
            r10 = r4
            goto L85
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            com.bumptech.glide.e.F(r11)
            java.lang.String[] r8 = r8.f54814g
            r8 = r8[r10]
            java.lang.String[] r10 = w9.g0.f54807l
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L50:
            if (r9 >= r8) goto L87
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r6 = 96
            java.lang.String r4 = nv.p.q(r5, r4, r6)
            r0.f54788a = r10
            r0.f54789b = r2
            r0.f54790c = r11
            r0.f54791d = r9
            r0.f54792e = r8
            r0.H = r3
            java.lang.Object r4 = jh.h.i(r10, r4, r0)
            if (r4 != r1) goto L85
            return r1
        L85:
            int r9 = r9 + r3
            goto L50
        L87:
            qy.b0 r8 = qy.b0.f48488a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.g0.d(w9.g0, w9.x, int, xy.c):java.lang.Object");
    }

    public final void e(fz.a onRefreshScheduled, fz.a onRefreshCompleted) {
        kotlin.jvm.internal.m.f(onRefreshScheduled, "onRefreshScheduled");
        kotlin.jvm.internal.m.f(onRefreshCompleted, "onRefreshCompleted");
        if (this.f54817j.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            wz.d dVar = this.f54808a.f54850a;
            vy.d dVar2 = null;
            if (dVar != null) {
                rz.e0.B(dVar, new rz.a0(), null, new sr.d(22, this, onRefreshCompleted, dVar2), 2);
            } else {
                kotlin.jvm.internal.m.n("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(xy.c cVar) throws Throwable {
        e0 e0Var;
        m4 m4Var;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i11 = e0Var.f54798d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                e0Var.f54798d = i11 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(this, cVar);
            }
        } else {
            e0Var = new e0(this, cVar);
        }
        Object obj = e0Var.f54796b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = e0Var.f54798d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            s sVar = this.f54808a;
            m4 m4Var2 = sVar.f54856g;
            if (m4Var2.d()) {
                try {
                    b0 b0Var = new b0(this, null, 2);
                    e0Var.f54795a = m4Var2;
                    e0Var.f54798d = 1;
                    if (sVar.y(false, b0Var, e0Var) == aVar) {
                        return aVar;
                    }
                    m4Var = m4Var2;
                    m4Var.n();
                } catch (Throwable th2) {
                    th = th2;
                    m4Var = m4Var2;
                    m4Var.n();
                    throw th;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m4Var = e0Var.f54795a;
            try {
                com.bumptech.glide.e.F(obj);
                m4Var.n();
            } catch (Throwable th3) {
                th = th3;
                m4Var.n();
                throw th;
            }
        }
        return qy.b0.f48488a;
    }
}
