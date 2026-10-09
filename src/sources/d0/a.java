package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f22628b;

    public /* synthetic */ a(f fVar, int i11) {
        this.f22627a = i11;
        this.f22628b = fVar;
    }

    @Override // fz.a
    public final Object invoke() {
        y2.m mVar;
        switch (this.f22627a) {
            case 0:
                l1.d0 d0Var = c1.f22650a;
                f fVar = this.f22628b;
                z0 z0Var = (z0) y2.f.i(fVar, d0Var);
                if (!(z0Var instanceof g1)) {
                    i0.a.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. You can also use ComposeFoundationFlags.isNonComposedClickableEnabled to temporarily opt-out; note that this flag will be removed in a future release and is only intended to be a temporary migration aid. The Indication instance provided here was: " + z0Var);
                }
                g1 g1Var = fVar.f22684a0;
                g1 g1Var2 = (g1) z0Var;
                fVar.f22684a0 = g1Var2;
                if (g1Var != null && !kotlin.jvm.internal.m.a(g1Var2, g1Var) && ((mVar = fVar.f22686c0) != null || !fVar.f22692i0)) {
                    if (mVar != null) {
                        fVar.U0(mVar);
                    }
                    fVar.f22686c0 = null;
                    fVar.b1();
                }
                return qy.b0.f48488a;
            default:
                this.f22628b.Y.invoke();
                return Boolean.TRUE;
        }
    }
}
