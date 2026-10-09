package n9;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import mt.j5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gh.o f43719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c7.j f43720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uz.i f43721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f43722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f43723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tz.h f43724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0 f43725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final rz.h1 f43726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n1 f43727j;

    public w0(Object obj, gh.o pagingSource, c7.j jVar, gp.r retryFlow, w1 w1Var, j5 j5Var) {
        kotlin.jvm.internal.m.f(pagingSource, "pagingSource");
        kotlin.jvm.internal.m.f(retryFlow, "retryFlow");
        this.f43718a = obj;
        this.f43719b = pagingSource;
        this.f43720c = jVar;
        this.f43721d = retryFlow;
        this.f43722e = new q(0);
        this.f43723f = new AtomicBoolean(false);
        vy.d dVar = null;
        this.f43724g = qx.p.b(-2, 6, null);
        this.f43725h = new x0(jVar);
        rz.h1 h1VarD = rz.e0.d();
        this.f43726i = h1VarD;
        this.f43727j = new n1(new jr.i0(this, dVar, 12), m.d(new kr.w(h1VarD, new jr.i0(this, dVar, 11), (vy.d) null)));
    }

    public static final Object a(w0 w0Var, n1 n1Var, y yVar, xy.i iVar) {
        w0Var.getClass();
        uz.i iVarE = m.e(n1Var, new l0(null, w0Var, yVar));
        mv.x xVar = new mv.x(yVar, null, 2);
        kotlin.jvm.internal.m.f(iVarE, "<this>");
        Object objCollect = uz.x0.f(new gp.r(new k(iVarE, xVar, null, 0)), -1).collect(new bh.q(17, w0Var, yVar), iVar);
        return objCollect == wy.a.COROUTINE_SUSPENDED ? objCollect : qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:145:0x048f A[PHI: r0 r5 r8 r10 r11 r12 r13 r14 r15 r17
      0x048f: PHI (r0v66 n9.n) = (r0v80 n9.n), (r0v89 n9.n) binds: [B:144:0x048b, B:156:0x04d1] A[DONT_GENERATE, DONT_INLINE]
      0x048f: PHI (r5v42 n9.v1) = (r5v48 n9.v1), (r5v50 n9.v1) binds: [B:144:0x048b, B:156:0x04d1] A[DONT_GENERATE, DONT_INLINE]
      0x048f: PHI (r8v21 java.lang.String) = (r8v22 java.lang.String), (r8v23 java.lang.String) binds: [B:144:0x048b, B:156:0x04d1] A[DONT_GENERATE, DONT_INLINE]
      0x048f: PHI (r10v35 n9.s1) = (r10v37 n9.s1), (r10v38 n9.s1) binds: [B:144:0x048b, B:156:0x04d1] A[DONT_GENERATE, DONT_INLINE]
      0x048f: PHI (r11v52 kotlin.jvm.internal.u) = (r11v53 kotlin.jvm.internal.u), (r11v54 kotlin.jvm.internal.u) binds: [B:144:0x048b, B:156:0x04d1] A[DONT_GENERATE, DONT_INLINE]
      0x048f: PHI (r12v33 ??) = (r12v36 ??), (r12v43 ??) binds: [B:144:0x048b, B:156:0x04d1] A[DONT_GENERATE, DONT_INLINE]
      0x048f: PHI (r13v33 kotlin.jvm.internal.w) = (r13v34 kotlin.jvm.internal.w), (r13v35 kotlin.jvm.internal.w) binds: [B:144:0x048b, B:156:0x04d1] A[DONT_GENERATE, DONT_INLINE]
      0x048f: PHI (r14v39 kotlin.jvm.internal.y) = (r14v42 kotlin.jvm.internal.y), (r14v44 kotlin.jvm.internal.y) binds: [B:144:0x048b, B:156:0x04d1] A[DONT_GENERATE, DONT_INLINE]
      0x048f: PHI (r15v33 ??) = (r15v42 ??), (r15v43 ??) binds: [B:144:0x048b, B:156:0x04d1] A[DONT_GENERATE, DONT_INLINE]
      0x048f: PHI (r17v18 qy.b0) = (r17v19 qy.b0), (r17v20 qy.b0) binds: [B:144:0x048b, B:156:0x04d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:155:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:157:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:159:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:165:0x0508  */
    /* JADX WARN: Code duplicated, block: B:169:0x052f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0551  */
    /* JADX WARN: Code duplicated, block: B:180:0x0554  */
    /* JADX WARN: Code duplicated, block: B:184:0x057e  */
    /* JADX WARN: Code duplicated, block: B:188:0x05b6 A[Catch: all -> 0x05c5, TryCatch #2 {all -> 0x05c5, blocks: (B:185:0x0582, B:186:0x059c, B:188:0x05b6, B:190:0x05be, B:192:0x05c2, B:196:0x05cb, B:195:0x05c9, B:197:0x05ce), top: B:223:0x0582 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x05c2 A[Catch: all -> 0x05c5, TryCatch #2 {all -> 0x05c5, blocks: (B:185:0x0582, B:186:0x059c, B:188:0x05b6, B:190:0x05be, B:192:0x05c2, B:196:0x05cb, B:195:0x05c9, B:197:0x05ce), top: B:223:0x0582 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x05c9 A[Catch: all -> 0x05c5, TryCatch #2 {all -> 0x05c5, blocks: (B:185:0x0582, B:186:0x059c, B:188:0x05b6, B:190:0x05be, B:192:0x05c2, B:196:0x05cb, B:195:0x05c9, B:197:0x05ce), top: B:223:0x0582 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:203:0x060b  */
    /* JADX WARN: Code duplicated, block: B:206:0x0614  */
    /* JADX WARN: Code duplicated, block: B:207:0x0618  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:92:0x036f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0379  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, n9.w0] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r10v30, types: [xq.c] */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v56, types: [java.lang.Object, n9.y] */
    /* JADX WARN: Type inference failed for: r11v59, types: [n9.y] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v33, types: [java.lang.Object, n9.w0] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.lang.Object, n9.w0] */
    /* JADX WARN: Type inference failed for: r12v39, types: [java.lang.Object, n9.w0] */
    /* JADX WARN: Type inference failed for: r12v41, types: [n9.w0] */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object, n9.y] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object, n9.w0] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v14, types: [n9.i2] */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v30, types: [java.lang.Object, n9.y] */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v34, types: [n9.y] */
    /* JADX WARN: Type inference failed for: r15v35, types: [java.lang.Enum, java.lang.Object, n9.y] */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v43, types: [n9.a1] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v58, types: [n9.a1] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, n9.y] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v6, types: [n9.i2] */
    /* JADX WARN: Type inference failed for: r9v3, types: [n9.w0] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
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
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(n9.w0 r20, n9.y r21, n9.n r22, vy.d r23) {
        /*
            Method dump skipped, instruction units count: 1624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.w0.b(n9.w0, n9.y, n9.n, vy.d):java.lang.Object");
    }

    public static final Object c(w0 w0Var, y yVar, i2 i2Var, t0 t0Var) throws Throwable {
        w0Var.getClass();
        int i11 = k0.f43615a[yVar.ordinal()];
        qy.b0 b0Var = qy.b0.f48488a;
        if (i11 == 1) {
            Object objF = w0Var.f(t0Var);
            return objF == wy.a.COROUTINE_SUSPENDED ? objF : b0Var;
        }
        if (i2Var == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        q qVar = w0Var.f43722e;
        qVar.getClass();
        if (yVar == y.PREPEND || yVar == y.APPEND) {
            ((ob.i) qVar.f43673b).r(null, new b2.h(9, yVar, i2Var));
            return b0Var;
        }
        throw new IllegalArgumentException(("invalid load type for reset: " + yVar).toString());
    }

    public static final void d(w0 w0Var, rz.b0 b0Var) {
        c7.j jVar = w0Var.f43720c;
        vy.d dVar = null;
        rz.e0.B(b0Var, null, null, new v0(w0Var, dVar, 0), 3);
        rz.e0.B(b0Var, null, null, new v0(w0Var, dVar, 1), 3);
    }

    public static String h(y yVar, Object obj, v1 v1Var) {
        if (v1Var == null) {
            return "End " + yVar + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + yVar + " with loadKey " + obj + ". Returned " + v1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(xy.c cVar) {
        o0 o0Var;
        x0 x0Var;
        w0 w0Var;
        a00.e eVar;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i11 = o0Var.f43661f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                o0Var.f43661f = i11 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(this, cVar);
            }
        } else {
            o0Var = new o0(this, cVar);
        }
        Object obj = o0Var.f43659d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = o0Var.f43661f;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            x0Var = this.f43725h;
            a00.e eVar2 = x0Var.f43736a;
            o0Var.f43656a = this;
            o0Var.f43657b = x0Var;
            o0Var.f43658c = eVar2;
            o0Var.f43661f = 1;
            if (eVar2.b(o0Var) == aVar) {
                return aVar;
            }
            w0Var = this;
            eVar = eVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = o0Var.f43658c;
            x0Var = o0Var.f43657b;
            w0Var = o0Var.f43656a;
            com.bumptech.glide.e.F(obj);
        }
        try {
            return x0Var.f43737b.a((f2) ((ob.i) w0Var.f43722e.f43673b).f44815d);
        } finally {
            eVar.a(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0227  */
    /* JADX WARN: Code duplicated, block: B:102:0x022b  */
    /* JADX WARN: Code duplicated, block: B:104:0x022f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0258  */
    /* JADX WARN: Code duplicated, block: B:114:0x027b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0286 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x011b  */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:55:0x015c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0163  */
    /* JADX WARN: Code duplicated, block: B:61:0x017a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0198 A[Catch: all -> 0x019e, TRY_ENTER, TryCatch #5 {all -> 0x019e, blocks: (B:62:0x017c, B:65:0x0198, B:68:0x01a1, B:70:0x01a8), top: B:134:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01a8 A[Catch: all -> 0x019e, TRY_LEAVE, TryCatch #5 {all -> 0x019e, blocks: (B:62:0x017c, B:65:0x0198, B:68:0x01a1, B:70:0x01a8), top: B:134:0x017c }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x020b  */
    /* JADX WARN: Code duplicated, block: B:93:0x020f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.String] */
    public final Object f(xy.c cVar) throws Throwable {
        p0 p0Var;
        x0 x0Var;
        a00.a aVar;
        w0 w0Var;
        a1 a1Var;
        y yVar;
        w0 w0Var2;
        gh.o oVar;
        w0 w0Var3;
        v1 v1Var;
        x0 x0Var2;
        a00.e eVar;
        w0 w0Var4;
        a00.e eVar2;
        v1 v1Var2;
        x0 x0Var3;
        a00.e eVar3;
        w0 w0Var5;
        a00.e eVar4;
        y yVar2;
        boolean zB;
        xq.c cVar2;
        Object obj;
        u uVar;
        x0 x0Var4;
        a00.e eVar5;
        v1 v1Var3;
        w0 w0Var6;
        a00.a aVar2;
        tz.h hVar;
        d0 d0VarC;
        w0 w0Var7;
        a00.a aVar3;
        a1 a1Var2;
        s sVar;
        y yVar3;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i11 = p0Var.f43670t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                p0Var.f43670t = i11 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(this, cVar);
            }
        } else {
            p0Var = new p0(this, cVar);
        }
        Object objF = p0Var.f43668e;
        wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
        ?? r9 = p0Var.f43670t;
        qy.b0 b0Var = qy.b0.f48488a;
        try {
            switch (r9) {
                case 0:
                    com.bumptech.glide.e.F(objF);
                    x0Var = this.f43725h;
                    a00.e eVar6 = x0Var.f43736a;
                    p0Var.f43664a = this;
                    p0Var.f43665b = x0Var;
                    p0Var.f43666c = eVar6;
                    p0Var.f43670t = 1;
                    if (eVar6.b(p0Var) != aVar4) {
                        aVar = eVar6;
                        w0Var = this;
                        a1Var = x0Var.f43737b;
                        yVar = y.REFRESH;
                        p0Var.f43664a = w0Var;
                        p0Var.f43665b = aVar;
                        p0Var.f43666c = null;
                        p0Var.f43670t = 2;
                        if (w0Var.k(a1Var, yVar, p0Var) != aVar4) {
                            w0Var2 = w0Var;
                            aVar.a(null);
                            y yVar4 = y.REFRESH;
                            Object obj2 = w0Var2.f43718a;
                            oVar = w0Var2.f43719b;
                            s1 s1VarG = w0Var2.g(yVar4, obj2);
                            r9 = Build.ID;
                            if (r9 != 0 && Log.isLoggable("Paging", 3)) {
                                String message = "Start REFRESH with loadKey " + w0Var2.f43718a + " on " + oVar;
                                kotlin.jvm.internal.m.f(message, "message");
                            }
                            p0Var.f43664a = w0Var2;
                            p0Var.f43665b = null;
                            p0Var.f43670t = 3;
                            objF = oVar.f(s1VarG, p0Var);
                            if (objF != aVar4) {
                                w0Var3 = w0Var2;
                                v1Var = (v1) objF;
                                if (v1Var instanceof u1) {
                                    x0Var3 = w0Var3.f43725h;
                                    eVar3 = x0Var3.f43736a;
                                    p0Var.f43664a = w0Var3;
                                    p0Var.f43665b = v1Var;
                                    p0Var.f43666c = x0Var3;
                                    p0Var.f43667d = eVar3;
                                    p0Var.f43670t = 4;
                                    if (eVar3.b(p0Var) != aVar4) {
                                        w0Var5 = w0Var3;
                                        eVar4 = eVar3;
                                        try {
                                            a1 a1Var3 = x0Var3.f43737b;
                                            yVar2 = y.REFRESH;
                                            zB = a1Var3.b(0, yVar2, (u1) v1Var);
                                            cVar2 = a1Var3.f43488h;
                                            cVar2.P(yVar2, u.f43702c);
                                            obj = ((u1) v1Var).f43706b;
                                            uVar = u.f43701b;
                                            if (obj == null) {
                                                cVar2.P(y.PREPEND, uVar);
                                            }
                                            if (((u1) v1Var).f43707c == null) {
                                                cVar2.P(y.APPEND, uVar);
                                                break;
                                            }
                                            eVar4.a(null);
                                            if (zB) {
                                                if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                                                    String message2 = h(yVar2, w0Var5.f43718a, v1Var);
                                                    kotlin.jvm.internal.m.f(message2, "message");
                                                }
                                                x0Var4 = w0Var5.f43725h;
                                                eVar5 = x0Var4.f43736a;
                                                p0Var.f43664a = w0Var5;
                                                p0Var.f43665b = v1Var;
                                                p0Var.f43666c = x0Var4;
                                                p0Var.f43667d = eVar5;
                                                p0Var.f43670t = 5;
                                                if (eVar5.b(p0Var) != aVar4) {
                                                    v1Var3 = v1Var;
                                                    w0Var6 = w0Var5;
                                                    try {
                                                        a1 a1Var4 = x0Var4.f43737b;
                                                        hVar = w0Var6.f43724g;
                                                        d0VarC = a1Var4.c((u1) v1Var3, y.REFRESH);
                                                        p0Var.f43664a = w0Var6;
                                                        p0Var.f43665b = v1Var3;
                                                        p0Var.f43666c = eVar5;
                                                        p0Var.f43667d = null;
                                                        p0Var.f43670t = 6;
                                                        if (hVar.f(d0VarC, p0Var) != aVar4) {
                                                            aVar2 = eVar5;
                                                            w0Var7 = w0Var6;
                                                            aVar2.a(null);
                                                            w0Var5 = w0Var7;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        aVar2 = eVar5;
                                                        aVar2.a(null);
                                                        throw th;
                                                    }
                                                }
                                            } else if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                                String message3 = h(yVar2, w0Var5.f43718a, null);
                                                kotlin.jvm.internal.m.f(message3, "message");
                                            }
                                            w0Var5.getClass();
                                            return b0Var;
                                        } catch (Throwable th3) {
                                            eVar4.a(null);
                                            throw th3;
                                        }
                                    }
                                } else {
                                    if (v1Var instanceof t1) {
                                        return b0Var;
                                    }
                                    if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                        String message4 = h(y.REFRESH, w0Var3.f43718a, v1Var);
                                        kotlin.jvm.internal.m.f(message4, "message");
                                    }
                                    x0Var2 = w0Var3.f43725h;
                                    eVar = x0Var2.f43736a;
                                    p0Var.f43664a = w0Var3;
                                    p0Var.f43665b = v1Var;
                                    p0Var.f43666c = x0Var2;
                                    p0Var.f43667d = eVar;
                                    p0Var.f43670t = 8;
                                    if (eVar.b(p0Var) != aVar4) {
                                        w0Var4 = w0Var3;
                                        eVar2 = eVar;
                                        v1Var2 = v1Var;
                                        try {
                                            a1Var2 = x0Var2.f43737b;
                                            sVar = new s(((t1) v1Var2).f43700a);
                                            yVar3 = y.REFRESH;
                                            p0Var.f43664a = eVar2;
                                            p0Var.f43665b = null;
                                            p0Var.f43666c = null;
                                            p0Var.f43667d = null;
                                            p0Var.f43670t = 9;
                                            if (w0Var4.j(a1Var2, yVar3, sVar, p0Var) != aVar4) {
                                                aVar3 = eVar2;
                                                aVar3.a(null);
                                                return b0Var;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            aVar3 = eVar2;
                                            aVar3.a(null);
                                            throw th;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return aVar4;
                case 1:
                    aVar = (a00.a) p0Var.f43666c;
                    x0Var = (x0) p0Var.f43665b;
                    w0Var = (w0) p0Var.f43664a;
                    com.bumptech.glide.e.F(objF);
                    a1Var = x0Var.f43737b;
                    yVar = y.REFRESH;
                    p0Var.f43664a = w0Var;
                    p0Var.f43665b = aVar;
                    p0Var.f43666c = null;
                    p0Var.f43670t = 2;
                    if (w0Var.k(a1Var, yVar, p0Var) != aVar4) {
                        w0Var2 = w0Var;
                        aVar.a(null);
                        y yVar5 = y.REFRESH;
                        Object obj3 = w0Var2.f43718a;
                        oVar = w0Var2.f43719b;
                        s1 s1VarG2 = w0Var2.g(yVar5, obj3);
                        r9 = Build.ID;
                        if (r9 != 0) {
                            String message5 = "Start REFRESH with loadKey " + w0Var2.f43718a + " on " + oVar;
                            kotlin.jvm.internal.m.f(message5, "message");
                        }
                        p0Var.f43664a = w0Var2;
                        p0Var.f43665b = null;
                        p0Var.f43670t = 3;
                        objF = oVar.f(s1VarG2, p0Var);
                        if (objF != aVar4) {
                            w0Var3 = w0Var2;
                            v1Var = (v1) objF;
                            if (v1Var instanceof u1) {
                                x0Var3 = w0Var3.f43725h;
                                eVar3 = x0Var3.f43736a;
                                p0Var.f43664a = w0Var3;
                                p0Var.f43665b = v1Var;
                                p0Var.f43666c = x0Var3;
                                p0Var.f43667d = eVar3;
                                p0Var.f43670t = 4;
                                if (eVar3.b(p0Var) != aVar4) {
                                    w0Var5 = w0Var3;
                                    eVar4 = eVar3;
                                    a1 a1Var5 = x0Var3.f43737b;
                                    yVar2 = y.REFRESH;
                                    zB = a1Var5.b(0, yVar2, (u1) v1Var);
                                    cVar2 = a1Var5.f43488h;
                                    cVar2.P(yVar2, u.f43702c);
                                    obj = ((u1) v1Var).f43706b;
                                    uVar = u.f43701b;
                                    if (obj == null) {
                                        cVar2.P(y.PREPEND, uVar);
                                    }
                                    if (((u1) v1Var).f43707c == null) {
                                        cVar2.P(y.APPEND, uVar);
                                        break;
                                    }
                                    eVar4.a(null);
                                    if (zB) {
                                        if (Build.ID != null) {
                                            String message6 = h(yVar2, w0Var5.f43718a, v1Var);
                                            kotlin.jvm.internal.m.f(message6, "message");
                                        }
                                        x0Var4 = w0Var5.f43725h;
                                        eVar5 = x0Var4.f43736a;
                                        p0Var.f43664a = w0Var5;
                                        p0Var.f43665b = v1Var;
                                        p0Var.f43666c = x0Var4;
                                        p0Var.f43667d = eVar5;
                                        p0Var.f43670t = 5;
                                        if (eVar5.b(p0Var) != aVar4) {
                                            v1Var3 = v1Var;
                                            w0Var6 = w0Var5;
                                            a1 a1Var6 = x0Var4.f43737b;
                                            hVar = w0Var6.f43724g;
                                            d0VarC = a1Var6.c((u1) v1Var3, y.REFRESH);
                                            p0Var.f43664a = w0Var6;
                                            p0Var.f43665b = v1Var3;
                                            p0Var.f43666c = eVar5;
                                            p0Var.f43667d = null;
                                            p0Var.f43670t = 6;
                                            if (hVar.f(d0VarC, p0Var) != aVar4) {
                                                aVar2 = eVar5;
                                                w0Var7 = w0Var6;
                                                aVar2.a(null);
                                                w0Var5 = w0Var7;
                                            }
                                        }
                                    } else if (Build.ID != null) {
                                        String message7 = h(yVar2, w0Var5.f43718a, null);
                                        kotlin.jvm.internal.m.f(message7, "message");
                                    }
                                    w0Var5.getClass();
                                    return b0Var;
                                }
                            } else {
                                if (v1Var instanceof t1) {
                                    return b0Var;
                                }
                                if (Build.ID != null) {
                                    String message8 = h(y.REFRESH, w0Var3.f43718a, v1Var);
                                    kotlin.jvm.internal.m.f(message8, "message");
                                }
                                x0Var2 = w0Var3.f43725h;
                                eVar = x0Var2.f43736a;
                                p0Var.f43664a = w0Var3;
                                p0Var.f43665b = v1Var;
                                p0Var.f43666c = x0Var2;
                                p0Var.f43667d = eVar;
                                p0Var.f43670t = 8;
                                if (eVar.b(p0Var) != aVar4) {
                                    w0Var4 = w0Var3;
                                    eVar2 = eVar;
                                    v1Var2 = v1Var;
                                    a1Var2 = x0Var2.f43737b;
                                    sVar = new s(((t1) v1Var2).f43700a);
                                    yVar3 = y.REFRESH;
                                    p0Var.f43664a = eVar2;
                                    p0Var.f43665b = null;
                                    p0Var.f43666c = null;
                                    p0Var.f43667d = null;
                                    p0Var.f43670t = 9;
                                    if (w0Var4.j(a1Var2, yVar3, sVar, p0Var) != aVar4) {
                                        aVar3 = eVar2;
                                        aVar3.a(null);
                                        return b0Var;
                                    }
                                }
                            }
                        }
                    }
                    return aVar4;
                case 2:
                    aVar = (a00.a) p0Var.f43665b;
                    w0Var2 = (w0) p0Var.f43664a;
                    com.bumptech.glide.e.F(objF);
                    aVar.a(null);
                    y yVar6 = y.REFRESH;
                    Object obj4 = w0Var2.f43718a;
                    oVar = w0Var2.f43719b;
                    s1 s1VarG3 = w0Var2.g(yVar6, obj4);
                    r9 = Build.ID;
                    if (r9 != 0) {
                        String message9 = "Start REFRESH with loadKey " + w0Var2.f43718a + " on " + oVar;
                        kotlin.jvm.internal.m.f(message9, "message");
                    }
                    p0Var.f43664a = w0Var2;
                    p0Var.f43665b = null;
                    p0Var.f43670t = 3;
                    objF = oVar.f(s1VarG3, p0Var);
                    if (objF != aVar4) {
                        w0Var3 = w0Var2;
                        v1Var = (v1) objF;
                        if (v1Var instanceof u1) {
                            x0Var3 = w0Var3.f43725h;
                            eVar3 = x0Var3.f43736a;
                            p0Var.f43664a = w0Var3;
                            p0Var.f43665b = v1Var;
                            p0Var.f43666c = x0Var3;
                            p0Var.f43667d = eVar3;
                            p0Var.f43670t = 4;
                            if (eVar3.b(p0Var) != aVar4) {
                                w0Var5 = w0Var3;
                                eVar4 = eVar3;
                                a1 a1Var7 = x0Var3.f43737b;
                                yVar2 = y.REFRESH;
                                zB = a1Var7.b(0, yVar2, (u1) v1Var);
                                cVar2 = a1Var7.f43488h;
                                cVar2.P(yVar2, u.f43702c);
                                obj = ((u1) v1Var).f43706b;
                                uVar = u.f43701b;
                                if (obj == null) {
                                    cVar2.P(y.PREPEND, uVar);
                                }
                                if (((u1) v1Var).f43707c == null) {
                                    cVar2.P(y.APPEND, uVar);
                                    break;
                                }
                                eVar4.a(null);
                                if (zB) {
                                    if (Build.ID != null) {
                                        String message10 = h(yVar2, w0Var5.f43718a, v1Var);
                                        kotlin.jvm.internal.m.f(message10, "message");
                                    }
                                    x0Var4 = w0Var5.f43725h;
                                    eVar5 = x0Var4.f43736a;
                                    p0Var.f43664a = w0Var5;
                                    p0Var.f43665b = v1Var;
                                    p0Var.f43666c = x0Var4;
                                    p0Var.f43667d = eVar5;
                                    p0Var.f43670t = 5;
                                    if (eVar5.b(p0Var) != aVar4) {
                                        v1Var3 = v1Var;
                                        w0Var6 = w0Var5;
                                        a1 a1Var8 = x0Var4.f43737b;
                                        hVar = w0Var6.f43724g;
                                        d0VarC = a1Var8.c((u1) v1Var3, y.REFRESH);
                                        p0Var.f43664a = w0Var6;
                                        p0Var.f43665b = v1Var3;
                                        p0Var.f43666c = eVar5;
                                        p0Var.f43667d = null;
                                        p0Var.f43670t = 6;
                                        if (hVar.f(d0VarC, p0Var) != aVar4) {
                                            aVar2 = eVar5;
                                            w0Var7 = w0Var6;
                                            aVar2.a(null);
                                            w0Var5 = w0Var7;
                                        }
                                    }
                                } else if (Build.ID != null) {
                                    String message11 = h(yVar2, w0Var5.f43718a, null);
                                    kotlin.jvm.internal.m.f(message11, "message");
                                }
                                w0Var5.getClass();
                                return b0Var;
                            }
                        } else {
                            if (v1Var instanceof t1) {
                                return b0Var;
                            }
                            if (Build.ID != null) {
                                String message12 = h(y.REFRESH, w0Var3.f43718a, v1Var);
                                kotlin.jvm.internal.m.f(message12, "message");
                            }
                            x0Var2 = w0Var3.f43725h;
                            eVar = x0Var2.f43736a;
                            p0Var.f43664a = w0Var3;
                            p0Var.f43665b = v1Var;
                            p0Var.f43666c = x0Var2;
                            p0Var.f43667d = eVar;
                            p0Var.f43670t = 8;
                            if (eVar.b(p0Var) != aVar4) {
                                w0Var4 = w0Var3;
                                eVar2 = eVar;
                                v1Var2 = v1Var;
                                a1Var2 = x0Var2.f43737b;
                                sVar = new s(((t1) v1Var2).f43700a);
                                yVar3 = y.REFRESH;
                                p0Var.f43664a = eVar2;
                                p0Var.f43665b = null;
                                p0Var.f43666c = null;
                                p0Var.f43667d = null;
                                p0Var.f43670t = 9;
                                if (w0Var4.j(a1Var2, yVar3, sVar, p0Var) != aVar4) {
                                    aVar3 = eVar2;
                                    aVar3.a(null);
                                    return b0Var;
                                }
                            }
                        }
                    }
                    return aVar4;
                case 3:
                    w0Var3 = (w0) p0Var.f43664a;
                    com.bumptech.glide.e.F(objF);
                    v1Var = (v1) objF;
                    if (v1Var instanceof u1) {
                        x0Var3 = w0Var3.f43725h;
                        eVar3 = x0Var3.f43736a;
                        p0Var.f43664a = w0Var3;
                        p0Var.f43665b = v1Var;
                        p0Var.f43666c = x0Var3;
                        p0Var.f43667d = eVar3;
                        p0Var.f43670t = 4;
                        if (eVar3.b(p0Var) != aVar4) {
                            w0Var5 = w0Var3;
                            eVar4 = eVar3;
                            a1 a1Var9 = x0Var3.f43737b;
                            yVar2 = y.REFRESH;
                            zB = a1Var9.b(0, yVar2, (u1) v1Var);
                            cVar2 = a1Var9.f43488h;
                            cVar2.P(yVar2, u.f43702c);
                            obj = ((u1) v1Var).f43706b;
                            uVar = u.f43701b;
                            if (obj == null) {
                                cVar2.P(y.PREPEND, uVar);
                            }
                            if (((u1) v1Var).f43707c == null) {
                                cVar2.P(y.APPEND, uVar);
                                break;
                            }
                            eVar4.a(null);
                            if (zB) {
                                if (Build.ID != null) {
                                    String message13 = h(yVar2, w0Var5.f43718a, v1Var);
                                    kotlin.jvm.internal.m.f(message13, "message");
                                }
                                x0Var4 = w0Var5.f43725h;
                                eVar5 = x0Var4.f43736a;
                                p0Var.f43664a = w0Var5;
                                p0Var.f43665b = v1Var;
                                p0Var.f43666c = x0Var4;
                                p0Var.f43667d = eVar5;
                                p0Var.f43670t = 5;
                                if (eVar5.b(p0Var) != aVar4) {
                                    v1Var3 = v1Var;
                                    w0Var6 = w0Var5;
                                    a1 a1Var10 = x0Var4.f43737b;
                                    hVar = w0Var6.f43724g;
                                    d0VarC = a1Var10.c((u1) v1Var3, y.REFRESH);
                                    p0Var.f43664a = w0Var6;
                                    p0Var.f43665b = v1Var3;
                                    p0Var.f43666c = eVar5;
                                    p0Var.f43667d = null;
                                    p0Var.f43670t = 6;
                                    if (hVar.f(d0VarC, p0Var) != aVar4) {
                                        aVar2 = eVar5;
                                        w0Var7 = w0Var6;
                                        aVar2.a(null);
                                        w0Var5 = w0Var7;
                                    }
                                }
                            } else if (Build.ID != null) {
                                String message14 = h(yVar2, w0Var5.f43718a, null);
                                kotlin.jvm.internal.m.f(message14, "message");
                            }
                            w0Var5.getClass();
                            return b0Var;
                        }
                    } else {
                        if (v1Var instanceof t1) {
                            return b0Var;
                        }
                        if (Build.ID != null) {
                            String message15 = h(y.REFRESH, w0Var3.f43718a, v1Var);
                            kotlin.jvm.internal.m.f(message15, "message");
                        }
                        x0Var2 = w0Var3.f43725h;
                        eVar = x0Var2.f43736a;
                        p0Var.f43664a = w0Var3;
                        p0Var.f43665b = v1Var;
                        p0Var.f43666c = x0Var2;
                        p0Var.f43667d = eVar;
                        p0Var.f43670t = 8;
                        if (eVar.b(p0Var) != aVar4) {
                            w0Var4 = w0Var3;
                            eVar2 = eVar;
                            v1Var2 = v1Var;
                            a1Var2 = x0Var2.f43737b;
                            sVar = new s(((t1) v1Var2).f43700a);
                            yVar3 = y.REFRESH;
                            p0Var.f43664a = eVar2;
                            p0Var.f43665b = null;
                            p0Var.f43666c = null;
                            p0Var.f43667d = null;
                            p0Var.f43670t = 9;
                            if (w0Var4.j(a1Var2, yVar3, sVar, p0Var) != aVar4) {
                                aVar3 = eVar2;
                                aVar3.a(null);
                                return b0Var;
                            }
                        }
                    }
                    return aVar4;
                case 4:
                    eVar4 = p0Var.f43667d;
                    x0Var3 = (x0) p0Var.f43666c;
                    v1 v1Var4 = (v1) p0Var.f43665b;
                    w0Var5 = (w0) p0Var.f43664a;
                    com.bumptech.glide.e.F(objF);
                    v1Var = v1Var4;
                    a1 a1Var11 = x0Var3.f43737b;
                    yVar2 = y.REFRESH;
                    zB = a1Var11.b(0, yVar2, (u1) v1Var);
                    cVar2 = a1Var11.f43488h;
                    cVar2.P(yVar2, u.f43702c);
                    obj = ((u1) v1Var).f43706b;
                    uVar = u.f43701b;
                    if (obj == null) {
                        cVar2.P(y.PREPEND, uVar);
                    }
                    if (((u1) v1Var).f43707c == null) {
                        cVar2.P(y.APPEND, uVar);
                        break;
                    }
                    eVar4.a(null);
                    if (zB) {
                        if (Build.ID != null) {
                            String message16 = h(yVar2, w0Var5.f43718a, v1Var);
                            kotlin.jvm.internal.m.f(message16, "message");
                        }
                        x0Var4 = w0Var5.f43725h;
                        eVar5 = x0Var4.f43736a;
                        p0Var.f43664a = w0Var5;
                        p0Var.f43665b = v1Var;
                        p0Var.f43666c = x0Var4;
                        p0Var.f43667d = eVar5;
                        p0Var.f43670t = 5;
                        if (eVar5.b(p0Var) != aVar4) {
                            v1Var3 = v1Var;
                            w0Var6 = w0Var5;
                            a1 a1Var12 = x0Var4.f43737b;
                            hVar = w0Var6.f43724g;
                            d0VarC = a1Var12.c((u1) v1Var3, y.REFRESH);
                            p0Var.f43664a = w0Var6;
                            p0Var.f43665b = v1Var3;
                            p0Var.f43666c = eVar5;
                            p0Var.f43667d = null;
                            p0Var.f43670t = 6;
                            if (hVar.f(d0VarC, p0Var) != aVar4) {
                                aVar2 = eVar5;
                                w0Var7 = w0Var6;
                                aVar2.a(null);
                                w0Var5 = w0Var7;
                            }
                        }
                        return aVar4;
                    }
                    if (Build.ID != null) {
                        String message17 = h(yVar2, w0Var5.f43718a, null);
                        kotlin.jvm.internal.m.f(message17, "message");
                    }
                    w0Var5.getClass();
                    return b0Var;
                case 5:
                    eVar5 = p0Var.f43667d;
                    x0Var4 = (x0) p0Var.f43666c;
                    v1Var3 = (v1) p0Var.f43665b;
                    w0Var6 = (w0) p0Var.f43664a;
                    com.bumptech.glide.e.F(objF);
                    a1 a1Var13 = x0Var4.f43737b;
                    hVar = w0Var6.f43724g;
                    d0VarC = a1Var13.c((u1) v1Var3, y.REFRESH);
                    p0Var.f43664a = w0Var6;
                    p0Var.f43665b = v1Var3;
                    p0Var.f43666c = eVar5;
                    p0Var.f43667d = null;
                    p0Var.f43670t = 6;
                    if (hVar.f(d0VarC, p0Var) != aVar4) {
                        aVar2 = eVar5;
                        w0Var7 = w0Var6;
                        aVar2.a(null);
                        w0Var5 = w0Var7;
                        w0Var5.getClass();
                        return b0Var;
                    }
                    return aVar4;
                case 6:
                    aVar2 = (a00.a) p0Var.f43666c;
                    w0Var7 = (w0) p0Var.f43664a;
                    try {
                        com.bumptech.glide.e.F(objF);
                        aVar2.a(null);
                        w0Var5 = w0Var7;
                        w0Var5.getClass();
                        return b0Var;
                    } catch (Throwable th5) {
                        th = th5;
                        aVar2.a(null);
                        throw th;
                    }
                case 7:
                    a00.e eVar7 = p0Var.f43667d;
                    x0 x0Var5 = (x0) p0Var.f43666c;
                    v1 v1Var5 = (v1) p0Var.f43665b;
                    w0 w0Var8 = (w0) p0Var.f43664a;
                    com.bumptech.glide.e.F(objF);
                    try {
                        x0Var5.f43737b.a((f2) ((ob.i) w0Var8.f43722e.f43673b).f44815d);
                        eVar7.a(null);
                        u1 u1Var = (u1) v1Var5;
                        u1Var.f43706b.getClass();
                        u1Var.f43707c.getClass();
                        return b0Var;
                    } catch (Throwable th6) {
                        eVar7.a(null);
                        throw th6;
                    }
                case 8:
                    eVar2 = p0Var.f43667d;
                    x0Var2 = (x0) p0Var.f43666c;
                    v1Var2 = (v1) p0Var.f43665b;
                    w0Var4 = (w0) p0Var.f43664a;
                    com.bumptech.glide.e.F(objF);
                    a1Var2 = x0Var2.f43737b;
                    sVar = new s(((t1) v1Var2).f43700a);
                    yVar3 = y.REFRESH;
                    p0Var.f43664a = eVar2;
                    p0Var.f43665b = null;
                    p0Var.f43666c = null;
                    p0Var.f43667d = null;
                    p0Var.f43670t = 9;
                    if (w0Var4.j(a1Var2, yVar3, sVar, p0Var) != aVar4) {
                        aVar3 = eVar2;
                        aVar3.a(null);
                        return b0Var;
                    }
                    return aVar4;
                case 9:
                    aVar3 = (a00.a) p0Var.f43664a;
                    try {
                        com.bumptech.glide.e.F(objF);
                        aVar3.a(null);
                        return b0Var;
                    } catch (Throwable th7) {
                        th = th7;
                        aVar3.a(null);
                        throw th;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th8) {
            r9.a(null);
            throw th8;
        }
    }

    public final s1 g(y loadType, Object obj) {
        y yVar = y.REFRESH;
        c7.j jVar = this.f43720c;
        int i11 = loadType == yVar ? jVar.f6662c : jVar.f6660a;
        kotlin.jvm.internal.m.f(loadType, "loadType");
        int i12 = p1.f43671a[loadType.ordinal()];
        if (i12 == 1) {
            return new r1(obj, i11);
        }
        if (i12 == 2) {
            if (obj != null) {
                return new q1(obj, i11);
            }
            throw new IllegalArgumentException("key cannot be null for prepend");
        }
        if (i12 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (obj != null) {
            return new o1(obj, i11);
        }
        throw new IllegalArgumentException("key cannot be null for append");
    }

    public final Object i(a1 a1Var, y yVar, int i11, int i12) {
        a1Var.getClass();
        ArrayList arrayList = a1Var.f43483c;
        int i13 = y0.f43738a[yVar.ordinal()];
        if (i13 == 1) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (i13 != 2 && i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (i11 == 0 && !(a1Var.f43488h.w(yVar) instanceof s) && i12 < this.f43720c.f6661b) {
            return yVar == y.PREPEND ? ((u1) ry.m.q0(arrayList)).f43706b : ((u1) ry.m.z0(arrayList)).f43707c;
        }
        return null;
    }

    public final Object j(a1 a1Var, y yVar, s sVar, xy.c cVar) {
        xq.c cVar2 = a1Var.f43488h;
        if (!kotlin.jvm.internal.m.a(cVar2.w(yVar), sVar)) {
            cVar2.P(yVar, sVar);
            Object objF = this.f43724g.f(new e0(cVar2.U(), null), cVar);
            if (objF == wy.a.COROUTINE_SUSPENDED) {
                return objF;
            }
        }
        return qy.b0.f48488a;
    }

    public final Object k(a1 a1Var, y yVar, xy.c cVar) {
        xq.c cVar2 = a1Var.f43488h;
        v vVarW = cVar2.w(yVar);
        t tVar = t.f43692b;
        if (!kotlin.jvm.internal.m.a(vVarW, tVar)) {
            cVar2.P(yVar, tVar);
            Object objF = this.f43724g.f(new e0(cVar2.U(), null), cVar);
            if (objF == wy.a.COROUTINE_SUSPENDED) {
                return objF;
            }
        }
        return qy.b0.f48488a;
    }
}
