package d1;

import aj.uZCn.evRpcb;
import java.util.ArrayList;
import java.util.List;
import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b3 f22919b;

    public /* synthetic */ h0(b3 b3Var, int i11) {
        this.f22918a = i11;
        this.f22919b = b3Var;
    }

    @Override // fz.a
    public final Object invoke() {
        float fFloatValue;
        int i11 = this.f22918a;
        b3 b3Var = this.f22919b;
        switch (i11) {
            case 0:
                return new f2.b(((f2.b) b3Var.getValue()).f26570a);
            case 1:
                b0.p pVar = i0.f22922a;
                return new f2.b(((f2.b) b3Var.getValue()).f26570a);
            case 2:
                List list = (List) b3Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (kotlin.jvm.internal.m.a(((j9.e) obj).f36188b.f36241a, evRpcb.jRIHjFSN)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 3:
                fFloatValue = ((Number) b3Var.getValue()).floatValue();
                break;
            default:
                fFloatValue = ((Number) b3Var.getValue()).floatValue();
                break;
        }
        return Float.valueOf(fFloatValue);
    }
}
