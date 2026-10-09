package es;

import com.lingodeer.data.model.chinesetone.ChineseToneUnit;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f25785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChineseToneUnit f25786c;

    public /* synthetic */ b(fz.c cVar, ChineseToneUnit chineseToneUnit, int i11) {
        this.f25784a = i11;
        this.f25785b = cVar;
        this.f25786c = chineseToneUnit;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f25784a) {
            case 0:
                this.f25785b.invoke(this.f25786c);
                break;
            default:
                this.f25785b.invoke(this.f25786c);
                break;
        }
        return b0.f48488a;
    }
}
