package ef;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements j00.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25529c;

    public /* synthetic */ o(int i11, String str, boolean z11) {
        this.f25527a = i11;
        this.f25529c = z11;
        this.f25528b = str;
    }

    @Override // j00.e
    public void b(mz.c cVar, mz.c cVar2, c00.a aVar) {
        e00.g descriptor = aVar.getDescriptor();
        o00.a aVarE = descriptor.e();
        if ((aVarE instanceof e00.d) || kotlin.jvm.internal.m.a(aVarE, e00.k.f24698c)) {
            throw new IllegalArgumentException("Serializer for " + ((kotlin.jvm.internal.e) cVar2).g() + " can't be registered as a subclass for polymorphic serialization because its kind " + aVarE + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        boolean z11 = this.f25529c;
        if (z11 && (kotlin.jvm.internal.m.a(aVarE, e00.m.f24701d) || kotlin.jvm.internal.m.a(aVarE, e00.m.f24702e) || (aVarE instanceof e00.f) || (aVarE instanceof e00.l))) {
            throw new IllegalArgumentException("Serializer for " + ((kotlin.jvm.internal.e) cVar2).g() + " of kind " + aVarE + " cannot be serialized polymorphically with class discriminator.");
        }
        if (z11) {
            int iF = descriptor.f();
            for (int i11 = 0; i11 < iF; i11++) {
                String strG = descriptor.g(i11);
                if (kotlin.jvm.internal.m.a(strG, this.f25528b)) {
                    throw new IllegalArgumentException("Polymorphic serializer for " + cVar2 + " has property '" + strG + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                }
            }
        }
    }

    @Override // j00.e
    public void c(mz.c kClass, fz.c cVar) {
        kotlin.jvm.internal.m.f(kClass, "kClass");
    }

    public String toString() {
        switch (this.f25527a) {
            case 0:
                String str = this.f25529c ? "Applink" : "Unclassified";
                String str2 = this.f25528b;
                if (str2 == null) {
                    return str;
                }
                return str + '(' + str2 + ')';
            default:
                return super.toString();
        }
    }

    public o(h00.j jVar) {
        this.f25527a = 1;
        this.f25528b = jVar.f29935f;
        this.f25529c = jVar.f29937h != h00.a.NONE;
    }

    public o(String str, boolean z11) {
        this.f25527a = 0;
        this.f25528b = str;
        this.f25529c = z11;
    }

    @Override // j00.e
    public void a(mz.c cVar, c00.a aVar) {
    }

    @Override // j00.e
    public void d(mz.c cVar, fz.c cVar2) {
    }

    @Override // j00.e
    public void e(mz.c cVar, fz.c cVar2) {
    }
}
