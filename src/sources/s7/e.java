package s7;

import android.os.Build;
import com.google.common.base.Predicate;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f51414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f51415b;

    public /* synthetic */ e(q qVar, j jVar) {
        this.f51414a = qVar;
        this.f51415b = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x006b A[FALL_THROUGH] */
    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        Boolean bool;
        l lVar;
        l lVar2;
        y6.p pVar = (y6.p) obj;
        q qVar = this.f51414a;
        qVar.getClass();
        if (this.f51415b.f51433y && ((bool = qVar.f51458j) == null || !bool.booleanValue())) {
            int i11 = pVar.F;
            if (i11 != -1 && i11 > 2) {
                String str = pVar.f57291n;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32 && (lVar2 = qVar.f51456h) != null && lVar2.f51437b) {
                            }
                        default:
                            if (Build.VERSION.SDK_INT >= 32) {
                                break;
                            }
                            return false;
                    }
                } else if (Build.VERSION.SDK_INT >= 32 || (lVar = qVar.f51456h) == null || !lVar.f51437b || !lVar.b() || !qVar.f51456h.c() || !qVar.f51456h.a(qVar.f51457i, pVar)) {
                    return false;
                }
            }
        }
        return true;
    }
}
