package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m5 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.material3.b f30678b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5(androidx.compose.material3.b bVar, int i11) {
        super(1);
        this.f30677a = i11;
        this.f30678b = bVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f30677a) {
            case 0:
                androidx.compose.material3.b bVar = this.f30678b;
                if (bVar.f1130e.f30040b) {
                    bVar.f1129d.invoke();
                }
                return qy.b0.f48488a;
            default:
                androidx.compose.material3.b bVar2 = this.f30678b;
                bVar2.show();
                return new bt.j1(bVar2, 4);
        }
    }
}
