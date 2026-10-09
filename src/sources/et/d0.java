package et;

import com.tbruyelle.rxpermissions3.BuildConfig;
import l1.b1;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jt.v f25856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25857c;

    public /* synthetic */ d0(jt.v vVar, int i11, int i12) {
        this.f25855a = i12;
        this.f25856b = vVar;
        this.f25857c = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25855a) {
            case 0:
                String audioPath = (String) obj;
                kotlin.jvm.internal.m.f(audioPath, "audioPath");
                kotlin.jvm.internal.m.f((fz.a) obj2, "<unused var>");
                a.j(this.f25856b, this.f25857c, audioPath);
                break;
            default:
                String str = (String) obj;
                kotlin.jvm.internal.m.f(str, OYAvlbfUyD.ZStzkBvL);
                kotlin.jvm.internal.m.f((fz.a) obj2, "<unused var>");
                jt.v vVar = this.f25856b;
                vVar.f37211b.n();
                vVar.f37220k.setValue(BuildConfig.VERSION_NAME);
                vVar.f37223o.setValue(-1);
                vVar.f(str, new bj.a(vVar, 9));
                vVar.f37224p.setValue(Integer.valueOf(this.f25857c));
                b1 b1Var = vVar.f37226r;
                if (!((Boolean) b1Var.getValue()).booleanValue()) {
                    b1Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
