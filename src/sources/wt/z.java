package wt;

import com.lingodeer.data.model.ReviewVisibilityMode;
import com.lingodeer.data.model.SRSStatus;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import uz.x0;
import vt.z0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f55367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f55368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f55369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f55370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f55371f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Map map, b0 b0Var, int i11, int i12, long j11, vy.d dVar) {
        super(2, dVar);
        this.f55367b = map;
        this.f55368c = b0Var;
        this.f55369d = i11;
        this.f55370e = i12;
        this.f55371f = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new z(this.f55367b, this.f55368c, this.f55369d, this.f55370e, this.f55371f, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objU;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f55366a;
        int i12 = this.f55369d;
        Map map = this.f55367b;
        int i13 = this.f55370e;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(ry.n.W(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(xt.d.q(((Number) it.next()).longValue(), i12, i13));
            }
            gp.r rVar = new gp.r(new mi.b(ry.m.g1(arrayList, 900, 900), (z0) this.f55368c.f55236a, (vy.d) null));
            this.f55366a = 1;
            objU = x0.u(rVar, this);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            objU = obj;
        }
        Iterable iterable = (Iterable) objU;
        int iW = ry.x.W(ry.n.W(iterable, 10));
        if (iW < 16) {
            iW = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
        for (Object obj2 : iterable) {
            linkedHashMap.put(((SRSStatus) obj2).getId(), obj2);
        }
        List listN = (i12 == 0 && (i13 == 47 || i13 == 48)) ? ks.b.n("7;38;117;32;69;8;10;15;16;14;39;44;58;68;87;92;100;107;118;127;157;181;200;210;219;230;236;250;257;265;290;316;321") : ry.r.f50854a;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            long jLongValue2 = ((Number) entry.getValue()).longValue();
            int i14 = this.f55369d;
            String strQ = xt.d.q(jLongValue, i14, i13);
            boolean zContainsKey = linkedHashMap.containsKey(strQ);
            long j11 = this.f55371f;
            if (zContainsKey) {
                Object obj3 = linkedHashMap.get(strQ);
                kotlin.jvm.internal.m.c(obj3);
                SRSStatus sRSStatus = (SRSStatus) obj3;
                if (sRSStatus.getUnitId() != jLongValue2) {
                    arrayList2.add(SRSStatus.copy$default(sRSStatus, null, jLongValue2, 0L, 0, null, null, j11, null, false, null, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, j11, true, null, 1310653, null));
                }
            } else if (!listN.contains(new Long(jLongValue))) {
                arrayList3.add(new SRSStatus(strQ, jLongValue2, jLongValue, i14, xt.d.k(i13), "course", j11, o.CORRECT, false, s.NEW, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 0, 0, j11, true, ReviewVisibilityMode.DEFAULT));
            }
        }
        arrayList2.toString();
        arrayList3.toString();
        return ry.m.H0(arrayList2, arrayList3);
    }
}
