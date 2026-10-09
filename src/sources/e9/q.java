package e9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x7.e0 f25339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f25340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f25343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f25349k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25350l;
    public boolean m;

    public q(x7.e0 e0Var) {
        this.f25339a = e0Var;
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
    public final void a(int i11) {
        long j11 = this.f25350l;
        if (j11 != -9223372036854775807L) {
            long j12 = this.f25340b;
            long j13 = this.f25349k;
            if (j12 == j13) {
                return;
            }
            int i12 = (int) (j12 - j13);
            this.f25339a.d(j11, this.m ? 1 : 0, i12, i11, null);
        }
    }
}
