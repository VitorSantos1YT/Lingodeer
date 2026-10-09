package ei;

import com.lingo.lingoskill.object.ARChar;
import com.lingo.lingoskill.object.KOCharZhuyin;
import java.util.ArrayList;
import l1.b1;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dn.d f25640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f25641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(dn.d dVar, b1 b1Var, vy.d dVar2, int i11) {
        super(2, dVar2);
        this.f25639a = i11;
        this.f25640b = dVar;
        this.f25641c = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f25639a) {
            case 0:
                return new o(this.f25640b, this.f25641c, dVar, 0);
            default:
                return new o(this.f25640b, this.f25641c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f25639a) {
            case 0:
                o oVar = (o) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                oVar.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                o oVar2 = (o) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                oVar2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f25639a;
        qy.b0 b0Var = qy.b0.f48488a;
        b1 b1Var = this.f25641c;
        dn.d dVar = this.f25640b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (dVar != null) {
                    ArrayList arrayList = new ArrayList();
                    int iF = dVar.f();
                    for (int i12 = 1; i12 < iF; i12++) {
                        int iA = dVar.a();
                        for (int i13 = 1; i13 < iA; i13++) {
                            arrayList.add((ARChar) dVar.d(i12, i13));
                        }
                    }
                    b1Var.setValue(arrayList);
                }
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (dVar != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int iF2 = dVar.f();
                    for (int i14 = 1; i14 < iF2; i14++) {
                        int iA2 = dVar.a();
                        for (int i15 = 1; i15 < iA2; i15++) {
                            arrayList2.add((KOCharZhuyin) dVar.d(i14, i15));
                        }
                    }
                    b1Var.setValue(arrayList2);
                }
                break;
        }
        return b0Var;
    }
}
