package g00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28497d;

    public /* synthetic */ y(Object obj, int i11, int i12, Object obj2) {
        this.f28494a = i12;
        this.f28495b = i11;
        this.f28496c = obj;
        this.f28497d = obj2;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f28494a) {
            case 0:
                String str = (String) this.f28496c;
                z zVar = (z) this.f28497d;
                int i11 = this.f28495b;
                e00.g[] gVarArr = new e00.g[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    gVarArr[i12] = ns.o.i(str + '.' + zVar.f28393e[i12], e00.m.f24703f, new e00.g[0]);
                }
                return gVarArr;
            case 1:
                fz.c cVar = (fz.c) this.f28496c;
                i3.a aVar = (i3.a) this.f28497d;
                if (this.f28495b > 0) {
                    cVar.invoke(Boolean.valueOf(aVar != i3.a.On));
                }
                return qy.b0.f48488a;
            default:
                rz.e0.B((rz.b0) this.f28496c, null, null, new mt.d1((o0.t) this.f28497d, this.f28495b, null, 2), 3);
                return qy.b0.f48488a;
        }
    }

    public /* synthetic */ y(rz.b0 b0Var, o0.t tVar, int i11) {
        this.f28494a = 2;
        this.f28496c = b0Var;
        this.f28497d = tVar;
        this.f28495b = i11;
    }
}
