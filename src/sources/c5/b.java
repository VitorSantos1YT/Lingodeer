package c5;

import android.graphics.RectF;
import androidx.datastore.preferences.protobuf.l;
import hh.p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import qp.o2;
import r4.d;
import z4.g1;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f6604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.core.view.insets.a f6605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.core.view.insets.a aVar) {
        super(0);
        this.f6605d = aVar;
        this.f6604c = new HashMap();
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final void d(g1 g1Var) {
        ArrayList arrayList = this.f6605d.f1416b;
        if ((g1Var.f58839a.d() & 519) != 0) {
            this.f6604c.remove(g1Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i11 = aVar.f6602c;
                boolean z11 = i11 > 0;
                int i12 = i11 - 1;
                aVar.f6602c = i12;
                if (z11 && i12 == 0) {
                    ArrayList arrayList2 = aVar.f6600a;
                    int size2 = arrayList2.size() - 1;
                    if (size2 >= 0) {
                        throw p0.e(size2, arrayList2);
                    }
                }
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final void f(g1 g1Var) {
        ArrayList arrayList = this.f6605d.f1416b;
        if ((g1Var.f58839a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a) arrayList.get(size)).f6602c++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final v1 g(v1 v1Var, List list) {
        ArrayList arrayList = this.f6605d.f1416b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        for (int size = list.size() - 1; size >= 0; size--) {
            g1 g1Var = (g1) list.get(size);
            Integer num = (Integer) this.f6604c.get(g1Var);
            if (num != null) {
                int iIntValue = num.intValue();
                float fA = g1Var.f58839a.a();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fA;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fA;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fA;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fA;
                }
            }
        }
        d.b(v1Var.f58905a.g(519), v1Var.f58905a.g(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList2 = ((a) arrayList.get(size2)).f6600a;
            int size3 = arrayList2.size() - 1;
            if (size3 >= 0) {
                throw p0.e(size3, arrayList2);
            }
        }
        return v1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.l
    public final o2 h(g1 g1Var, o2 o2Var) {
        if ((g1Var.f58839a.d() & 519) != 0) {
            d dVar = (d) o2Var.f48096c;
            d dVar2 = (d) o2Var.f48095b;
            int i11 = dVar.f48793a != dVar2.f48793a ? 1 : 0;
            if (dVar.f48794b != dVar2.f48794b) {
                i11 |= 2;
            }
            if (dVar.f48795c != dVar2.f48795c) {
                i11 |= 4;
            }
            if (dVar.f48796d != dVar2.f48796d) {
                i11 |= 8;
            }
            this.f6604c.put(g1Var, Integer.valueOf(i11));
        }
        return o2Var;
    }
}
