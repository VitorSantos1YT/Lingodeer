package av;

import java.io.BufferedOutputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends xy.i implements fz.e {
    public int H;
    public final /* synthetic */ j0 K;
    public final /* synthetic */ String L;
    public final /* synthetic */ fz.c M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.y f3153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f3154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BufferedOutputStream f3155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public qy.b0 f3156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3157f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3158t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, String str, fz.c cVar, vy.d dVar) {
        super(2, dVar);
        this.K = j0Var;
        this.L = str;
        this.M = cVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new i0(this.K, this.L, this.M, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f1 A[Catch: all -> 0x0036, CancellationException -> 0x0039, Exception -> 0x02a0, TRY_ENTER, TryCatch #10 {all -> 0x0036, blocks: (B:10:0x0031, B:104:0x01f1, B:106:0x01f7, B:108:0x0201, B:109:0x0205, B:111:0x020a, B:113:0x020d, B:115:0x021d, B:117:0x0224, B:118:0x0225, B:119:0x0226, B:175:0x02de, B:27:0x006f, B:31:0x0080, B:42:0x00d1), top: B:205:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01f7 A[Catch: all -> 0x0036, CancellationException -> 0x0039, Exception -> 0x02a0, TryCatch #10 {all -> 0x0036, blocks: (B:10:0x0031, B:104:0x01f1, B:106:0x01f7, B:108:0x0201, B:109:0x0205, B:111:0x020a, B:113:0x020d, B:115:0x021d, B:117:0x0224, B:118:0x0225, B:119:0x0226, B:175:0x02de, B:27:0x006f, B:31:0x0080, B:42:0x00d1), top: B:205:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0226 A[Catch: all -> 0x0036, CancellationException -> 0x0039, Exception -> 0x02a0, TRY_LEAVE, TryCatch #10 {all -> 0x0036, blocks: (B:10:0x0031, B:104:0x01f1, B:106:0x01f7, B:108:0x0201, B:109:0x0205, B:111:0x020a, B:113:0x020d, B:115:0x021d, B:117:0x0224, B:118:0x0225, B:119:0x0226, B:175:0x02de, B:27:0x006f, B:31:0x0080, B:42:0x00d1), top: B:205:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0236 A[Catch: all -> 0x0240, TRY_LEAVE, TryCatch #15 {, blocks: (B:122:0x0230, B:124:0x0236), top: B:208:0x0230 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0280  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ab A[Catch: all -> 0x02b5, TRY_LEAVE, TryCatch #9 {, blocks: (B:161:0x02a5, B:163:0x02ab), top: B:203:0x02a5 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x02ea A[Catch: all -> 0x02f4, TRY_LEAVE, TryCatch #8 {, blocks: (B:178:0x02e4, B:180:0x02ea), top: B:201:0x02e4 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x0318 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:201:0x02e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x02a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0230 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:50:0x0101 A[Catch: all -> 0x014d, TRY_LEAVE, TryCatch #23 {all -> 0x014d, blocks: (B:48:0x00fb, B:50:0x0101, B:74:0x0154), top: B:213:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0109  */
    /* JADX WARN: Code duplicated, block: B:56:0x010f  */
    /* JADX WARN: Code duplicated, block: B:61:0x013e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x0153  */
    /* JADX WARN: Code duplicated, block: B:78:0x0170 A[Catch: all -> 0x0178, TryCatch #11 {all -> 0x0178, blocks: (B:76:0x0165, B:78:0x0170, B:80:0x0174, B:83:0x017a, B:85:0x0184, B:86:0x0187, B:88:0x018b, B:91:0x0192), top: B:206:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0174 A[Catch: all -> 0x0178, TryCatch #11 {all -> 0x0178, blocks: (B:76:0x0165, B:78:0x0170, B:80:0x0174, B:83:0x017a, B:85:0x0184, B:86:0x0187, B:88:0x018b, B:91:0x0192), top: B:206:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0184 A[Catch: all -> 0x0178, TryCatch #11 {all -> 0x0178, blocks: (B:76:0x0165, B:78:0x0170, B:80:0x0174, B:83:0x017a, B:85:0x0184, B:86:0x0187, B:88:0x018b, B:91:0x0192), top: B:206:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x018b A[Catch: all -> 0x0178, TryCatch #11 {all -> 0x0178, blocks: (B:76:0x0165, B:78:0x0170, B:80:0x0174, B:83:0x017a, B:85:0x0184, B:86:0x0187, B:88:0x018b, B:91:0x0192), top: B:206:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01c2  */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0261, code lost:
    
        if (rz.e0.M(r0, r3, r20) == r2) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02d6, code lost:
    
        if (rz.e0.M(r0, r3, r20) == r2) goto L187;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v60, types: [av.j0] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19, types: [long] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [long] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v23, types: [long] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30, types: [long] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
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
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: av.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
