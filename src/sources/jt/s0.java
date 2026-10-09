package jt;

import com.lingodeer.data.model.CourseWord;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f37160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f37161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f37162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f37163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f37164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f37165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f37166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l1.b1 f37167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l1.b1 f37168k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l1.b1 f37169l;
    public final l1.b1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l1.b1 f37170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l1.b1 f37171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x1.p f37172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l1.b1 f37173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l1.b1 f37174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v0 f37175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jp.t0 f37176t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a00.e f37177u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f37178v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f37179w;

    public s0(String sentence, String translation, List answerWordsLists, List resultDisplayWords, boolean z11, boolean z12, boolean z13, int i11, int i12, l1.b1 courseTestState, l1.b1 audioPlayingState, l1.b1 isAiCorrectedState, l1.b1 hasUsedAiRetryState, l1.b1 retryReasonState, l1.b1 dragItemState, x1.p displayWordsState, l1.b1 optionWordsState, l1.b1 resultDisplayWordsState, v0 v0Var, jp.t0 t0Var) {
        kotlin.jvm.internal.m.f(sentence, "sentence");
        kotlin.jvm.internal.m.f(translation, "translation");
        kotlin.jvm.internal.m.f(answerWordsLists, "answerWordsLists");
        kotlin.jvm.internal.m.f(resultDisplayWords, "resultDisplayWords");
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
        kotlin.jvm.internal.m.f(isAiCorrectedState, "isAiCorrectedState");
        kotlin.jvm.internal.m.f(hasUsedAiRetryState, "hasUsedAiRetryState");
        kotlin.jvm.internal.m.f(retryReasonState, "retryReasonState");
        kotlin.jvm.internal.m.f(dragItemState, "dragItemState");
        kotlin.jvm.internal.m.f(displayWordsState, "displayWordsState");
        kotlin.jvm.internal.m.f(optionWordsState, "optionWordsState");
        kotlin.jvm.internal.m.f(resultDisplayWordsState, "resultDisplayWordsState");
        this.f37158a = sentence;
        this.f37159b = translation;
        this.f37160c = answerWordsLists;
        this.f37161d = resultDisplayWords;
        this.f37162e = z11;
        this.f37163f = z12;
        this.f37164g = z13;
        this.f37165h = i11;
        this.f37166i = i12;
        this.f37167j = courseTestState;
        this.f37168k = audioPlayingState;
        this.f37169l = isAiCorrectedState;
        this.m = hasUsedAiRetryState;
        this.f37170n = retryReasonState;
        this.f37171o = dragItemState;
        this.f37172p = displayWordsState;
        this.f37173q = optionWordsState;
        this.f37174r = resultDisplayWordsState;
        this.f37175s = v0Var;
        this.f37176t = t0Var;
        this.f37177u = new a00.e();
        this.f37179w = 100L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(CourseWord courseWord, xy.c cVar) throws Throwable {
        p0 p0Var;
        CourseWord courseWord2;
        a00.a aVar;
        int i11;
        a00.a aVar2;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i12 = p0Var.f37107f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                p0Var.f37107f = i12 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(this, cVar);
            }
        } else {
            p0Var = new p0(this, cVar);
        }
        Object obj = p0Var.f37105d;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i13 = p0Var.f37107f;
        qy.b0 b0Var = qy.b0.f48488a;
        int i14 = 0;
        vy.d dVar = null;
        try {
            if (i13 == 0) {
                com.bumptech.glide.e.F(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.f37178v < this.f37179w) {
                    return b0Var;
                }
                this.f37178v = jCurrentTimeMillis;
                courseWord2 = courseWord;
                p0Var.f37102a = courseWord2;
                aVar = this.f37177u;
                p0Var.f37103b = aVar;
                p0Var.f37104c = 0;
                p0Var.f37107f = 1;
                if (aVar.b(p0Var) != aVar3) {
                    i11 = 0;
                }
                return aVar3;
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = p0Var.f37103b;
                try {
                    com.bumptech.glide.e.F(obj);
                    aVar = aVar2;
                    aVar.a(null);
                    return b0Var;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.a(null);
                    throw th;
                }
            }
            int i15 = p0Var.f37104c;
            a00.a aVar4 = p0Var.f37103b;
            CourseWord courseWord3 = p0Var.f37102a;
            com.bumptech.glide.e.F(obj);
            i11 = i15;
            aVar = aVar4;
            courseWord2 = courseWord3;
            ListIterator listIterator = this.f37172p.listIterator();
            while (true) {
                sy.a aVar5 = (sy.a) listIterator;
                if (!aVar5.hasNext()) {
                    i14 = -1;
                    break;
                }
                if (kotlin.jvm.internal.m.a((CourseWord) aVar5.next(), courseWord2)) {
                    break;
                }
                i14++;
            }
            if (i14 == -1) {
                yz.f fVar = rz.o0.f50940a;
                sz.c cVar2 = wz.m.f55536a;
                iv.h0 h0Var = new iv.h0(6, this, courseWord2, dVar);
                p0Var.f37102a = null;
                p0Var.f37103b = aVar;
                p0Var.f37104c = i11;
                p0Var.f37107f = 2;
                if (rz.e0.M(cVar2, h0Var, p0Var) != aVar3) {
                    aVar2 = aVar;
                    aVar = aVar2;
                }
                return aVar3;
            }
            aVar.a(null);
            return b0Var;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.a(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (rz.e0.M(r15, r6, r0) == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.lingodeer.data.model.CourseWord] */
    /* JADX WARN: Type inference failed for: r14v1, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v4, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v5, types: [x1.p] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.lingodeer.data.model.CourseWord, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.lingodeer.data.model.CourseWord r14, xy.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof jt.q0
            if (r0 == 0) goto L13
            r0 = r15
            jt.q0 r0 = (jt.q0) r0
            int r1 = r0.f37122f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37122f = r1
            goto L18
        L13:
            jt.q0 r0 = new jt.q0
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f37120d
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f37122f
            qy.b0 r3 = qy.b0.f48488a
            r4 = 2
            r5 = 1
            r10 = 0
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            a00.a r14 = r0.f37118b
            com.bumptech.glide.e.F(r15)     // Catch: java.lang.Throwable -> L30
            goto L94
        L30:
            r0 = move-exception
            r15 = r0
            goto L98
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            int r14 = r0.f37119c
            a00.a r2 = r0.f37118b
            com.lingodeer.data.model.CourseWord r5 = r0.f37117a
            com.bumptech.glide.e.F(r15)
            r9 = r2
            r2 = r14
            r14 = r9
            r9 = r5
            goto L71
        L49:
            com.bumptech.glide.e.F(r15)
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r13.f37178v
            long r8 = r6 - r8
            long r11 = r13.f37179w
            int r15 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r15 >= 0) goto L5b
            return r3
        L5b:
            r13.f37178v = r6
            r0.f37117a = r14
            a00.e r15 = r13.f37177u
            r0.f37118b = r15
            r2 = 0
            r0.f37119c = r2
            r0.f37122f = r5
            java.lang.Object r5 = r15.b(r0)
            if (r5 != r1) goto L6f
            goto L93
        L6f:
            r9 = r14
            r14 = r15
        L71:
            x1.p r15 = r13.f37172p     // Catch: java.lang.Throwable -> L30
            int r8 = r15.indexOf(r9)     // Catch: java.lang.Throwable -> L30
            r15 = -1
            if (r8 == r15) goto L94
            yz.f r15 = rz.o0.f50940a     // Catch: java.lang.Throwable -> L30
            sz.c r15 = wz.m.f55536a     // Catch: java.lang.Throwable -> L30
            bt.y4 r6 = new bt.y4     // Catch: java.lang.Throwable -> L30
            r11 = 1
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L30
            r0.f37117a = r10     // Catch: java.lang.Throwable -> L30
            r0.f37118b = r14     // Catch: java.lang.Throwable -> L30
            r0.f37119c = r2     // Catch: java.lang.Throwable -> L30
            r0.f37122f = r4     // Catch: java.lang.Throwable -> L30
            java.lang.Object r15 = rz.e0.M(r15, r6, r0)     // Catch: java.lang.Throwable -> L30
            if (r15 != r1) goto L94
        L93:
            return r1
        L94:
            r14.a(r10)
            return r3
        L98:
            r14.a(r10)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: jt.s0.b(com.lingodeer.data.model.CourseWord, xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2 A[Catch: all -> 0x003b, LOOP:2: B:46:0x00ec->B:48:0x00f2, LOOP_END, TryCatch #2 {all -> 0x003b, blocks: (B:14:0x0036, B:86:0x025b, B:76:0x01b7, B:77:0x01cc, B:79:0x01d2, B:81:0x01df, B:82:0x0235, B:83:0x0239, B:45:0x00dd, B:46:0x00ec, B:48:0x00f2, B:49:0x0105, B:50:0x0116, B:52:0x011c, B:53:0x0130, B:56:0x013c, B:41:0x00bd), top: B:93:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x011c A[Catch: all -> 0x003b, LOOP:3: B:50:0x0116->B:52:0x011c, LOOP_END, TryCatch #2 {all -> 0x003b, blocks: (B:14:0x0036, B:86:0x025b, B:76:0x01b7, B:77:0x01cc, B:79:0x01d2, B:81:0x01df, B:82:0x0235, B:83:0x0239, B:45:0x00dd, B:46:0x00ec, B:48:0x00f2, B:49:0x0105, B:50:0x0116, B:52:0x011c, B:53:0x0130, B:56:0x013c, B:41:0x00bd), top: B:93:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x013a  */
    /* JADX WARN: Code duplicated, block: B:56:0x013c A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:14:0x0036, B:86:0x025b, B:76:0x01b7, B:77:0x01cc, B:79:0x01d2, B:81:0x01df, B:82:0x0235, B:83:0x0239, B:45:0x00dd, B:46:0x00ec, B:48:0x00f2, B:49:0x0105, B:50:0x0116, B:52:0x011c, B:53:0x0130, B:56:0x013c, B:41:0x00bd), top: B:93:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x015b  */
    /* JADX WARN: Code duplicated, block: B:63:0x016b A[Catch: all -> 0x017e, TryCatch #3 {all -> 0x017e, blocks: (B:60:0x015f, B:61:0x0164, B:63:0x016b, B:72:0x0188, B:66:0x017b), top: B:96:0x015f }] */
    /* JADX WARN: Code duplicated, block: B:66:0x017b A[Catch: all -> 0x017e, LOOP:1: B:61:0x0164->B:66:0x017b, LOOP_END, TryCatch #3 {all -> 0x017e, blocks: (B:60:0x015f, B:61:0x0164, B:63:0x016b, B:72:0x0188, B:66:0x017b), top: B:96:0x015f }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0185  */
    /* JADX WARN: Code duplicated, block: B:72:0x0188 A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #3 {all -> 0x017e, blocks: (B:60:0x015f, B:61:0x0164, B:63:0x016b, B:72:0x0188, B:66:0x017b), top: B:96:0x015f }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d2 A[Catch: all -> 0x003b, TryCatch #2 {all -> 0x003b, blocks: (B:14:0x0036, B:86:0x025b, B:76:0x01b7, B:77:0x01cc, B:79:0x01d2, B:81:0x01df, B:82:0x0235, B:83:0x0239, B:45:0x00dd, B:46:0x00ec, B:48:0x00f2, B:49:0x0105, B:50:0x0116, B:52:0x011c, B:53:0x0130, B:56:0x013c, B:41:0x00bd), top: B:93:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01df A[Catch: all -> 0x003b, TryCatch #2 {all -> 0x003b, blocks: (B:14:0x0036, B:86:0x025b, B:76:0x01b7, B:77:0x01cc, B:79:0x01d2, B:81:0x01df, B:82:0x0235, B:83:0x0239, B:45:0x00dd, B:46:0x00ec, B:48:0x00f2, B:49:0x0105, B:50:0x0116, B:52:0x011c, B:53:0x0130, B:56:0x013c, B:41:0x00bd), top: B:93:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x025a  */
    /* JADX WARN: Code duplicated, block: B:86:0x025b A[Catch: all -> 0x003b, PHI: r2 r3 r5 r8 r10
      0x025b: PHI (r2v25 a00.a) = (r2v21 a00.a), (r2v28 a00.a) binds: [B:84:0x0258, B:20:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r3v19 int) = (r3v16 int), (r3v21 int) binds: [B:84:0x0258, B:20:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r5v23 int) = (r5v20 int), (r5v24 int) binds: [B:84:0x0258, B:20:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r8v11 int) = (r8v9 int), (r8v12 int) binds: [B:84:0x0258, B:20:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r10v3 int) = (r10v1 int), (r10v4 int) binds: [B:84:0x0258, B:20:0x004b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:14:0x0036, B:86:0x025b, B:76:0x01b7, B:77:0x01cc, B:79:0x01d2, B:81:0x01df, B:82:0x0235, B:83:0x0239, B:45:0x00dd, B:46:0x00ec, B:48:0x00f2, B:49:0x0105, B:50:0x0116, B:52:0x011c, B:53:0x0130, B:56:0x013c, B:41:0x00bd), top: B:93:0x0029 }] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x027b, code lost:
    
        if (rz.e0.M(r0, r9, r6) == r7) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [a00.a] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r58, xy.c r59) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jt.s0.c(java.util.List, xy.c):java.lang.Object");
    }
}
