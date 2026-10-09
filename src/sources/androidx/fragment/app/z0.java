package androidx.fragment.app;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f1890b;

    public /* synthetic */ z0(k1 k1Var, int i11) {
        this.f1889a = i11;
        this.f1890b = k1Var;
    }

    @Override // i.b
    public final void f(Object obj) {
        switch (this.f1889a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    iArr[i11] = ((Boolean) arrayList.get(i11)).booleanValue() ? 0 : -1;
                }
                k1 k1Var = this.f1890b;
                g1 g1Var = (g1) k1Var.G.pollFirst();
                if (g1Var != null) {
                    String str = g1Var.f1664a;
                    int i12 = g1Var.f1665b;
                    k0 k0VarC = k1Var.f1711c.c(str);
                    if (k0VarC != null) {
                        k0VarC.onRequestPermissionsResult(i12, strArr, iArr);
                        break;
                    }
                }
                break;
            case 1:
                i.a aVar = (i.a) obj;
                k1 k1Var2 = this.f1890b;
                g1 g1Var2 = (g1) k1Var2.G.pollLast();
                if (g1Var2 != null) {
                    String str2 = g1Var2.f1664a;
                    int i13 = g1Var2.f1665b;
                    k0 k0VarC2 = k1Var2.f1711c.c(str2);
                    if (k0VarC2 != null) {
                        k0VarC2.onActivityResult(i13, aVar.f33864a, aVar.f33865b);
                        break;
                    }
                }
                break;
            default:
                i.a aVar2 = (i.a) obj;
                k1 k1Var3 = this.f1890b;
                g1 g1Var3 = (g1) k1Var3.G.pollFirst();
                if (g1Var3 != null) {
                    String str3 = g1Var3.f1664a;
                    int i14 = g1Var3.f1665b;
                    k0 k0VarC3 = k1Var3.f1711c.c(str3);
                    if (k0VarC3 != null) {
                        k0VarC3.onActivityResult(i14, aVar2.f33864a, aVar2.f33865b);
                        break;
                    }
                }
                break;
        }
    }
}
