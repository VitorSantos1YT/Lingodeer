package km;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.lingo.lingoskill.object.YinTu;
import com.lingodeer.R;
import i0.pKy.shrCcjmOhAmRC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j0 implements BaseQuickAdapter.OnItemClickListener, BaseQuickAdapter.OnItemChildClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f38218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1 f38219c;

    public /* synthetic */ j0(ArrayList arrayList, j1 j1Var, int i11) {
        this.f38217a = i11;
        this.f38218b = arrayList;
        this.f38219c = j1Var;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        int i12 = this.f38217a;
        j1 j1Var = this.f38219c;
        ArrayList arrayList = this.f38218b;
        switch (i12) {
            case 0:
                qy.q qVar = fv.b.f28186a;
                String luoMa = ((YinTu) arrayList.get(i11)).getLuoMa();
                kotlin.jvm.internal.m.e(luoMa, "getLuoMa(...)");
                String strC = fv.b.c(luoMa, null, null);
                a9.i iVar = j1Var.O;
                kotlin.jvm.internal.m.c(iVar);
                iVar.v(strC);
                break;
            default:
                qy.q qVar2 = fv.b.f28186a;
                String luoMa2 = ((YinTu) arrayList.get(i11)).getLuoMa();
                kotlin.jvm.internal.m.e(luoMa2, "getLuoMa(...)");
                String strC2 = fv.b.c(luoMa2, null, null);
                a9.i iVar2 = j1Var.O;
                kotlin.jvm.internal.m.c(iVar2);
                iVar2.v(strC2);
                break;
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
    public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List listK;
        Collection collectionT;
        Object obj = this.f38218b.get(i11);
        kotlin.jvm.internal.m.e(obj, "get(...)");
        String str = (String) obj;
        Matcher matcherW = nv.p.w(0, "#", shrCcjmOhAmRC.cLqO, str);
        if (matcherW.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iC = 0;
            do {
                iC = nv.p.c(matcherW, str, iC, arrayList);
            } while (matcherW.find());
            nv.p.B(iC, str, arrayList);
            listK = arrayList;
        } else {
            listK = ns.o.K(str.toString());
        }
        if (!listK.isEmpty()) {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    collectionT = ry.r.f50854a;
                    break;
                } else if (((String) listIterator.previous()).length() != 0) {
                    collectionT = b7.e0.t(listIterator, 1, listK);
                    break;
                }
            }
        } else {
            collectionT = ry.r.f50854a;
            break;
        }
        String[] strArr = (String[]) collectionT.toArray(new String[0]);
        int id2 = view.getId();
        j1 j1Var = this.f38219c;
        if (id2 == R.id.tv_2) {
            a9.i iVar = j1Var.O;
            kotlin.jvm.internal.m.c(iVar);
            qy.q qVar = fv.b.f28186a;
            iVar.v(fv.b.b(strArr[1]));
            return;
        }
        if (id2 == R.id.tv_3) {
            a9.i iVar2 = j1Var.O;
            kotlin.jvm.internal.m.c(iVar2);
            qy.q qVar2 = fv.b.f28186a;
            iVar2.v(fv.b.b(strArr[2]));
        }
    }
}
