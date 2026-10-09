package l0;

import java.util.ArrayList;
import java.util.List;
import l1.b1;
import qy.b0;
import w2.f1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f39143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f39144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f39145d;

    public /* synthetic */ n(b1 b1Var, ArrayList arrayList, List list, boolean z11, int i11) {
        this.f39142a = i11;
        this.f39143b = b1Var;
        this.f39144c = arrayList;
        this.f39145d = list;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        f1 f1Var = (f1) obj;
        switch (this.f39142a) {
            case 0:
                f1Var.f54492a = true;
                ArrayList arrayList = this.f39144c;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((p) arrayList.get(i11)).j(f1Var);
                }
                ?? r9 = this.f39145d;
                int size2 = r9.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((p) r9.get(i12)).j(f1Var);
                }
                f1Var.f54492a = false;
                this.f39143b.getValue();
                break;
            default:
                f1Var.f54492a = true;
                ArrayList arrayList2 = this.f39144c;
                int size3 = arrayList2.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    ((m0.q) arrayList2.get(i13)).j(f1Var);
                }
                ?? r11 = this.f39145d;
                int size4 = r11.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    ((m0.q) r11.get(i14)).j(f1Var);
                }
                f1Var.f54492a = false;
                this.f39143b.getValue();
                break;
        }
        return b0.f48488a;
    }
}
