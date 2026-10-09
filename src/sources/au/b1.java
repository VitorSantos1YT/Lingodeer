package au;

import am.rVFB.LwKl;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.lingodeer.database.model.SRSStatusEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2952a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2957f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2958t;

    public /* synthetic */ b1(String str, List list, int i11, List list2, int i12, List list3) {
        this.f2955d = str;
        this.f2956e = list;
        this.f2953b = i11;
        this.f2957f = list2;
        this.f2954c = i12;
        this.f2958t = list3;
    }

    public /* synthetic */ b1(w2.g1 g1Var, w2.p0 p0Var, w2.s0 s0Var, int i11, int i12, j0.p pVar) {
        this.f2955d = g1Var;
        this.f2956e = p0Var;
        this.f2957f = s0Var;
        this.f2953b = i11;
        this.f2954c = i12;
        this.f2958t = pVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws Exception {
        switch (this.f2952a) {
            case 0:
                String str = (String) this.f2955d;
                List list = (List) this.f2956e;
                int i11 = this.f2953b;
                List list2 = (List) this.f2957f;
                int i12 = this.f2954c;
                List list3 = (List) this.f2958t;
                ja.a _connection = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection, "_connection");
                ja.c cVarB1 = _connection.B1(str);
                try {
                    Iterator it = list.iterator();
                    int i13 = 1;
                    while (it.hasNext()) {
                        cVarB1.b0(i13, (String) it.next());
                        i13++;
                    }
                    int i14 = i11 + 1;
                    Iterator it2 = list2.iterator();
                    int i15 = i14;
                    while (it2.hasNext()) {
                        cVarB1.g(i15, ((Number) it2.next()).longValue());
                        i15++;
                    }
                    int i16 = i14 + i12;
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        cVarB1.g(i16, ((Number) it3.next()).intValue());
                        i16++;
                    }
                    int iM = com.bumptech.glide.g.m(cVarB1, LwKl.IebGzn);
                    int iM2 = com.bumptech.glide.g.m(cVarB1, "unit_id");
                    int iM3 = com.bumptech.glide.g.m(cVarB1, "elem_id");
                    int iM4 = com.bumptech.glide.g.m(cVarB1, "elem_type");
                    int iM5 = com.bumptech.glide.g.m(cVarB1, "lan");
                    int iM6 = com.bumptech.glide.g.m(cVarB1, MzwEyWCkjXL.KGaGJPDBHwaJTlh);
                    int iM7 = com.bumptech.glide.g.m(cVarB1, "last_study_time");
                    int iM8 = com.bumptech.glide.g.m(cVarB1, "last_study_status");
                    int iM9 = com.bumptech.glide.g.m(cVarB1, "is_reviewed");
                    int iM10 = com.bumptech.glide.g.m(cVarB1, "status");
                    int iM11 = com.bumptech.glide.g.m(cVarB1, "last_review_time");
                    int iM12 = com.bumptech.glide.g.m(cVarB1, "next_review_time");
                    int iM13 = com.bumptech.glide.g.m(cVarB1, "interval");
                    int iM14 = com.bumptech.glide.g.m(cVarB1, "ease_factor");
                    int iM15 = com.bumptech.glide.g.m(cVarB1, "learning_step");
                    int iM16 = com.bumptech.glide.g.m(cVarB1, "lapses");
                    int iM17 = com.bumptech.glide.g.m(cVarB1, "so_easy_count");
                    int iM18 = com.bumptech.glide.g.m(cVarB1, "last_high_so_easy_count");
                    int iM19 = com.bumptech.glide.g.m(cVarB1, "last_modifier_time");
                    int iM20 = com.bumptech.glide.g.m(cVarB1, "pending_update");
                    int iM21 = com.bumptech.glide.g.m(cVarB1, txBUGYhC.OFo);
                    ArrayList arrayList = new ArrayList();
                    while (cVarB1.r1()) {
                        String strB0 = cVarB1.B0(iM);
                        long j11 = cVarB1.getLong(iM2);
                        long j12 = cVarB1.getLong(iM3);
                        int i17 = iM2;
                        int i18 = iM3;
                        int i19 = (int) cVarB1.getLong(iM4);
                        String strB1 = cVarB1.B0(iM5);
                        String strB2 = cVarB1.B0(iM6);
                        long j13 = cVarB1.getLong(iM7);
                        int i21 = (int) cVarB1.getLong(iM8);
                        int i22 = (int) cVarB1.getLong(iM9);
                        int i23 = (int) cVarB1.getLong(iM10);
                        long j14 = cVarB1.getLong(iM11);
                        long j15 = cVarB1.getLong(iM12);
                        long j16 = cVarB1.getLong(iM13);
                        float f5 = (float) cVarB1.getDouble(iM14);
                        int i24 = iM15;
                        int i25 = iM14;
                        int i26 = (int) cVarB1.getLong(i24);
                        int i27 = iM16;
                        int i28 = iM4;
                        int i29 = (int) cVarB1.getLong(i27);
                        int i30 = iM17;
                        int i31 = (int) cVarB1.getLong(i30);
                        int i32 = iM18;
                        int i33 = iM19;
                        int i34 = iM;
                        int i35 = iM20;
                        int i36 = iM21;
                        arrayList.add(new SRSStatusEntity(strB0, j11, j12, i19, strB1, strB2, j13, i21, i22, i23, j14, j15, j16, f5, i26, i29, i31, (int) cVarB1.getLong(i32), cVarB1.getLong(i33), ((int) cVarB1.getLong(i35)) != 0, (int) cVarB1.getLong(i36)));
                        iM20 = i35;
                        iM = i34;
                        iM19 = i33;
                        iM4 = i28;
                        iM16 = i27;
                        iM17 = i30;
                        iM18 = i32;
                        iM21 = i36;
                        iM14 = i25;
                        iM2 = i17;
                        iM3 = i18;
                        iM15 = i24;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarB1.close();
                }
            default:
                j0.o.b((w2.f1) obj, (w2.g1) this.f2955d, (w2.p0) this.f2956e, ((w2.s0) this.f2957f).getLayoutDirection(), this.f2953b, this.f2954c, ((j0.p) this.f2958t).f35374a);
                return qy.b0.f48488a;
        }
    }
}
