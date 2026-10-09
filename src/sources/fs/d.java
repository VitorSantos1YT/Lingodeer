package fs;

import js.r;
import qy.b0;
import rt.fb;
import rt.wb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f28013b;

    public /* synthetic */ d(r rVar, int i11) {
        this.f28012a = i11;
        this.f28013b = rVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f28012a) {
            case 0:
                this.f28013b.t(new wb(((Boolean) obj).booleanValue()));
                break;
            case 1:
                this.f28013b.d(((Long) obj).longValue());
                break;
            default:
                this.f28013b.f50706c0.k((fb) obj);
                break;
        }
        return b0.f48488a;
    }
}
