package mu;

import androidx.lifecycle.ViewModel;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.SyllableWriteLesson;
import com.lingodeer.data.model.UserInfo;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jr.i0;
import ot.j1;
import qy.b0;
import rt.be;
import rt.e3;
import rt.nc;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends xy.i implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f42179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f42180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f42181e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i11, vy.d dVar) {
        super(i11, dVar);
        this.f42177a = 1;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f42177a) {
            case 0:
                int iIntValue = ((Number) obj3).intValue();
                w wVar = new w((x) this.f42181e, (vy.d) obj4, 0);
                wVar.f42179c = (UserInfo) obj;
                wVar.f42180d = (List) obj2;
                wVar.f42178b = iIntValue;
                return wVar.invokeSuspend(b0.f48488a);
            case 1:
                w wVar2 = new w(4, (vy.d) obj4);
                wVar2.f42179c = (SyllableWriteLesson) obj;
                wVar2.f42180d = (String) obj2;
                wVar2.f42181e = (String) obj3;
                return wVar2.invokeSuspend(b0.f48488a);
            default:
                int iIntValue2 = ((Number) obj).intValue();
                w wVar3 = new w((e3) this.f42181e, (vy.d) obj4, 2);
                wVar3.f42178b = iIntValue2;
                wVar3.f42180d = (List) obj2;
                wVar3.f42179c = (qy.l) obj3;
                return wVar3.invokeSuspend(b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0077  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Map mapE;
        switch (this.f42177a) {
            case 0:
                UserInfo userInfo = (UserInfo) this.f42179c;
                List list = (List) this.f42180d;
                int i11 = this.f42178b;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                int totalGems = userInfo.getTotalGems();
                int streakFreezer = userInfo.getStreakFreezer();
                boolean zIsUnloginUser = ((o0) ((x) this.f42181e).f42183b).f27733a.isUnloginUser();
                ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.android.billingclient.api.k kVarA = ((com.android.billingclient.api.o) it.next()).a();
                    if (kVarA == null || (str = kVarA.f7539a) == null) {
                        str = BuildConfig.VERSION_NAME;
                    }
                    arrayList.add(str);
                }
                return new k(totalGems, i11, zIsUnloginUser, streakFreezer, arrayList);
            case 1:
                SyllableWriteLesson syllableWriteLesson = (SyllableWriteLesson) this.f42179c;
                String str2 = (String) this.f42180d;
                String str3 = (String) this.f42181e;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f42178b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                gp.r rVar = new gp.r(new i0(syllableWriteLesson, str3, str2, (vy.d) null, 19));
                this.f42179c = null;
                this.f42180d = null;
                this.f42181e = null;
                this.f42178b = 1;
                Object objU = x0.u(rVar, this);
                return objU == aVar2 ? aVar2 : objU;
            default:
                e3 e3Var = (e3) this.f42181e;
                boolean z11 = e3Var.f49675w0;
                int i13 = this.f42178b;
                List list2 = (List) this.f42180d;
                qy.l lVar = (qy.l) this.f42179c;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                j1 j1Var = (j1) ry.m.t0(i13, list2);
                SRSStatus sRSStatus = j1Var != null ? (SRSStatus) e3Var.f49678z0.get(e3.K(j1Var.a().f33753a, j1Var.a().f33754b)) : null;
                int size = e3Var.f49673u0.size();
                Object obj2 = lVar.f48495a;
                Number number = (Number) lVar.f48496b;
                int iIntValue = (size - ((Number) obj2).intValue()) - number.intValue();
                int iIntValue2 = ((Number) lVar.f48495a).intValue();
                int iIntValue3 = number.intValue();
                if (sRSStatus == null) {
                    mapE = ry.s.f50855a;
                } else {
                    if (z11) {
                        mapE = be.f49548a;
                    } else {
                        e3Var.f49668p0.getClass();
                        mapE = wt.b0.e(sRSStatus);
                    }
                    if (mapE == null) {
                        mapE = ry.s.f50855a;
                    }
                }
                return new nc(iIntValue, iIntValue2, iIntValue3, mapE, !z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(ViewModel viewModel, vy.d dVar, int i11) {
        super(4, dVar);
        this.f42177a = i11;
        this.f42181e = viewModel;
    }
}
