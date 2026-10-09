package za;

import android.os.Bundle;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f59073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f59074c;

    public /* synthetic */ i(int i11, Object obj, Object obj2) {
        this.f59072a = i11;
        this.f59073b = obj;
        this.f59074c = obj2;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f59072a) {
            case 0:
                b bVar = (b) this.f59073b;
                ((ab.a) bVar.f59058c).b((h) this.f59074c);
                return b0.f48488a;
            default:
                zs.a aVar = (zs.a) this.f59073b;
                String str = (String) this.f59074c;
                Bundle bundle = new Bundle();
                bundle.putString("UNIT", "U0");
                bundle.putString("LESSON", "L0");
                bundle.putString("STATUS", str);
                bundle.putString("MODE", aVar.f59337f);
                return bundle;
        }
    }
}
