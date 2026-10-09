package e9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x7.e0 f25272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f25278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f25279h;

    public l(x7.e0 e0Var) {
        this.f25272a = e0Var;
    }

    public final void a(byte[] bArr, int i11, int i12) {
        if (this.f25274c) {
            int i13 = this.f25277f;
            int i14 = (i11 + 1) - i13;
            if (i14 >= i12) {
                this.f25277f = (i12 - i11) + i13;
            } else {
                this.f25275d = ((bArr[i14] & 192) >> 6) == 0;
                this.f25274c = false;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(int i11, long j11, boolean z11) {
        b7.a.j(this.f25279h != -9223372036854775807L);
        if (this.f25276e == 182 && z11 && this.f25273b) {
            this.f25272a.d(this.f25279h, this.f25275d ? 1 : 0, (int) (j11 - this.f25278g), i11, null);
        }
        if (this.f25276e != 179) {
            this.f25278g = j11;
        }
    }
}
