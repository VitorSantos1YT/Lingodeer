package ei;

import com.lingo.lingoskill.object.ARChar;
import com.lingo.lingoskill.object.KOCharZhuyin;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dn.d f25668b;

    public /* synthetic */ u(dn.d dVar, int i11) {
        this.f25667a = i11;
        this.f25668b = dVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f25667a;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                return new y((ARChar) this.f25668b.d(iIntValue, iIntValue2));
            case 1:
                return new en.f((KOCharZhuyin) this.f25668b.d(iIntValue, iIntValue2), BuildConfig.VERSION_NAME);
            default:
                return new nq.d((pq.a) this.f25668b.d(iIntValue, iIntValue2), BuildConfig.VERSION_NAME);
        }
    }
}
