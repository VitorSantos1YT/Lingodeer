package ob;

import java.util.HashMap;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f44872b;

    public /* synthetic */ q(s sVar, int i11) {
        this.f44871a = i11;
        this.f44872b = sVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f44871a) {
            case 0:
                this.f44872b.b((HashMap) obj);
                break;
            default:
                this.f44872b.a((HashMap) obj);
                break;
        }
        return b0.f48488a;
    }
}
