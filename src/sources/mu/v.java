package mu;

import com.lingodeer.network.model.ApiResponse;
import java.util.ArrayList;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ApiResponse.Success f42172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f42173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f42175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f42176e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(h hVar, x xVar, vy.d dVar) {
        super(2, dVar);
        this.f42175d = hVar;
        this.f42176e = xVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new v(this.f42175d, this.f42176e, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x021f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f0 A[PHI: r7
      0x00f0: PHI (r7v6 com.lingodeer.network.model.ApiResponse$Success) = (r7v4 com.lingodeer.network.model.ApiResponse$Success), (r7v7 com.lingodeer.network.model.ApiResponse$Success) binds: [B:23:0x00ec, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:38:0x0185  */
    /* JADX WARN: Code duplicated, block: B:40:0x0189  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a1 A[PHI: r0 r15 r16
      0x01a1: PHI (r0v30 java.lang.Object) = (r0v27 java.lang.Object), (r0v40 java.lang.Object) binds: [B:41:0x019d, B:8:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r15v9 com.lingodeer.network.model.ApiResponse$Success) = (r15v18 com.lingodeer.network.model.ApiResponse$Success), (r15v10 com.lingodeer.network.model.ApiResponse$Success) binds: [B:41:0x019d, B:8:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r16v3 int) = (r16v1 int), (r16v4 int) binds: [B:41:0x019d, B:8:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x01c2 A[LOOP:2: B:44:0x01bc->B:46:0x01c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:54:0x020b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0224  */
    /* JADX WARN: Code duplicated, block: B:64:0x0258  */
    /* JADX WARN: Code duplicated, block: B:65:0x025b  */
    /* JADX WARN: Code duplicated, block: B:67:0x026f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0272  */
    /* JADX WARN: Code duplicated, block: B:71:0x027d  */
    /* JADX WARN: Code duplicated, block: B:77:0x02ad  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fa, code lost:
    
        if (r14 == r13) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02aa, code lost:
    
        if (r14 == r13) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, uz.i1] */
    /* JADX WARN: Type inference failed for: r15v11, types: [com.lingodeer.network.model.ApiResponse$Success, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
