package au;

import com.lingo.lingoskill.object.HwCharacterDao;
import com.lingodeer.database.model.CharacterStrokeEntity;
import com.lingodeer.database.model.SRSStatusEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f3050c;

    public /* synthetic */ n(int i11, String str, List list) {
        this.f3048a = i11;
        this.f3049b = str;
        this.f3050c = list;
    }

    public /* synthetic */ n(String str, List list, p pVar) {
        this.f3048a = 0;
        this.f3049b = str;
        this.f3050c = list;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws Exception {
        switch (this.f3048a) {
            case 0:
                List list = this.f3050c;
                ja.a _connection = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection, "_connection");
                ja.c cVarB1 = _connection.B1(this.f3049b);
                try {
                    Iterator it = list.iterator();
                    int i11 = 1;
                    while (it.hasNext()) {
                        cVarB1.g(i11, ((Number) it.next()).longValue());
                        i11++;
                    }
                    int iM = com.bumptech.glide.g.m(cVarB1, "CharId");
                    int iM2 = com.bumptech.glide.g.m(cVarB1, HwCharacterDao.TABLENAME);
                    int iM3 = com.bumptech.glide.g.m(cVarB1, "Zhuyin");
                    int iM4 = com.bumptech.glide.g.m(cVarB1, "Pinyin");
                    int iM5 = com.bumptech.glide.g.m(cVarB1, "Luoma");
                    int iM6 = com.bumptech.glide.g.m(cVarB1, "StrokeData");
                    int iM7 = com.bumptech.glide.g.m(cVarB1, "Version");
                    int iM8 = com.bumptech.glide.g.m(cVarB1, "TranCHN");
                    int iM9 = com.bumptech.glide.g.m(cVarB1, "TranTCHN");
                    int iM10 = com.bumptech.glide.g.m(cVarB1, "TranJPN");
                    int iM11 = com.bumptech.glide.g.m(cVarB1, "TranKRN");
                    int iM12 = com.bumptech.glide.g.m(cVarB1, "TranENG");
                    int iM13 = com.bumptech.glide.g.m(cVarB1, "TranSPN");
                    int iM14 = com.bumptech.glide.g.m(cVarB1, "TranFRN");
                    int iM15 = com.bumptech.glide.g.m(cVarB1, "TranDEN");
                    int iM16 = com.bumptech.glide.g.m(cVarB1, "TranITN");
                    int iM17 = com.bumptech.glide.g.m(cVarB1, "TranPTG");
                    int iM18 = com.bumptech.glide.g.m(cVarB1, "TranVTN");
                    int iM19 = com.bumptech.glide.g.m(cVarB1, "TranRUS");
                    int iM20 = com.bumptech.glide.g.m(cVarB1, "TranTUR");
                    int iM21 = com.bumptech.glide.g.m(cVarB1, "TranIDN");
                    int iM22 = com.bumptech.glide.g.m(cVarB1, "TranARA");
                    int iM23 = com.bumptech.glide.g.m(cVarB1, "TranPOL");
                    int iM24 = com.bumptech.glide.g.m(cVarB1, "TranTHAI");
                    int iM25 = com.bumptech.glide.g.m(cVarB1, "TranHINDI");
                    ArrayList arrayList = new ArrayList();
                    while (cVarB1.r1()) {
                        long j11 = cVarB1.getLong(iM);
                        String strB0 = null;
                        zt.a aVarJ = re.g0.j(cVarB1.isNull(iM2) ? null : cVarB1.B0(iM2));
                        zt.a aVarJ2 = re.g0.j(cVarB1.isNull(iM3) ? null : cVarB1.B0(iM3));
                        zt.a aVarJ3 = re.g0.j(cVarB1.isNull(iM4) ? null : cVarB1.B0(iM4));
                        zt.a aVarJ4 = re.g0.j(cVarB1.isNull(iM5) ? null : cVarB1.B0(iM5));
                        zt.a aVarJ5 = re.g0.j(cVarB1.isNull(iM6) ? null : cVarB1.B0(iM6));
                        Integer numValueOf = cVarB1.isNull(iM7) ? null : Integer.valueOf((int) cVarB1.getLong(iM7));
                        zt.a aVarJ6 = re.g0.j(cVarB1.isNull(iM8) ? null : cVarB1.B0(iM8));
                        zt.a aVarJ7 = re.g0.j(cVarB1.isNull(iM9) ? null : cVarB1.B0(iM9));
                        zt.a aVarJ8 = re.g0.j(cVarB1.isNull(iM10) ? null : cVarB1.B0(iM10));
                        zt.a aVarJ9 = re.g0.j(cVarB1.isNull(iM11) ? null : cVarB1.B0(iM11));
                        zt.a aVarJ10 = re.g0.j(cVarB1.isNull(iM12) ? null : cVarB1.B0(iM12));
                        zt.a aVarJ11 = re.g0.j(cVarB1.isNull(iM13) ? null : cVarB1.B0(iM13));
                        zt.a aVarJ12 = re.g0.j(cVarB1.isNull(iM14) ? null : cVarB1.B0(iM14));
                        int i12 = iM15;
                        zt.a aVarJ13 = re.g0.j(cVarB1.isNull(i12) ? null : cVarB1.B0(i12));
                        int i13 = iM16;
                        zt.a aVarJ14 = re.g0.j(cVarB1.isNull(i13) ? null : cVarB1.B0(i13));
                        int i14 = iM;
                        int i15 = iM17;
                        zt.a aVarJ15 = re.g0.j(cVarB1.isNull(i15) ? null : cVarB1.B0(i15));
                        iM17 = i15;
                        int i16 = iM18;
                        zt.a aVarJ16 = re.g0.j(cVarB1.isNull(i16) ? null : cVarB1.B0(i16));
                        iM18 = i16;
                        int i17 = iM19;
                        zt.a aVarJ17 = re.g0.j(cVarB1.isNull(i17) ? null : cVarB1.B0(i17));
                        iM19 = i17;
                        int i18 = iM20;
                        zt.a aVarJ18 = re.g0.j(cVarB1.isNull(i18) ? null : cVarB1.B0(i18));
                        iM20 = i18;
                        int i19 = iM21;
                        zt.a aVarJ19 = re.g0.j(cVarB1.isNull(i19) ? null : cVarB1.B0(i19));
                        iM21 = i19;
                        int i21 = iM22;
                        zt.a aVarJ20 = re.g0.j(cVarB1.isNull(i21) ? null : cVarB1.B0(i21));
                        iM22 = i21;
                        int i22 = iM23;
                        zt.a aVarJ21 = re.g0.j(cVarB1.isNull(i22) ? null : cVarB1.B0(i22));
                        iM23 = i22;
                        int i23 = iM24;
                        zt.a aVarJ22 = re.g0.j(cVarB1.isNull(i23) ? null : cVarB1.B0(i23));
                        iM24 = i23;
                        int i24 = iM25;
                        if (!cVarB1.isNull(i24)) {
                            strB0 = cVarB1.B0(i24);
                        }
                        iM25 = i24;
                        arrayList.add(new CharacterStrokeEntity(j11, aVarJ, aVarJ2, aVarJ3, aVarJ4, aVarJ5, numValueOf, aVarJ6, aVarJ7, aVarJ8, aVarJ9, aVarJ10, aVarJ11, aVarJ12, aVarJ13, aVarJ14, aVarJ15, aVarJ16, aVarJ17, aVarJ18, aVarJ19, aVarJ20, aVarJ21, aVarJ22, re.g0.j(strB0)));
                        iM = i14;
                        iM15 = i12;
                        iM16 = i13;
                        iM2 = iM2;
                        iM3 = iM3;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarB1.close();
                }
            case 1:
                List list2 = this.f3050c;
                ja.a _connection2 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection2, "_connection");
                ja.c cVarB2 = _connection2.B1(this.f3049b);
                try {
                    Iterator it2 = list2.iterator();
                    int i25 = 1;
                    while (it2.hasNext()) {
                        cVarB2.b0(i25, (String) it2.next());
                        i25++;
                    }
                    cVarB2.r1();
                } finally {
                    cVarB2.close();
                }
                break;
            case 2:
                List list3 = this.f3050c;
                ja.a _connection3 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection3, "_connection");
                ja.c cVarB3 = _connection3.B1(this.f3049b);
                try {
                    Iterator it3 = list3.iterator();
                    int i26 = 1;
                    while (it3.hasNext()) {
                        cVarB3.b0(i26, (String) it3.next());
                        i26++;
                    }
                    cVarB3.r1();
                } finally {
                    cVarB3.close();
                }
                break;
            case 3:
                List list4 = this.f3050c;
                ja.a _connection4 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection4, "_connection");
                ja.c cVarB4 = _connection4.B1(this.f3049b);
                try {
                    Iterator it4 = list4.iterator();
                    int i27 = 1;
                    while (it4.hasNext()) {
                        cVarB4.b0(i27, (String) it4.next());
                        i27++;
                    }
                    cVarB4.r1();
                } finally {
                    cVarB4.close();
                }
                break;
            case 4:
                List list5 = this.f3050c;
                ja.a _connection5 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection5, "_connection");
                ja.c cVarB5 = _connection5.B1(this.f3049b);
                try {
                    Iterator it5 = list5.iterator();
                    int i28 = 1;
                    while (it5.hasNext()) {
                        cVarB5.b0(i28, (String) it5.next());
                        i28++;
                    }
                    int iM26 = com.bumptech.glide.g.m(cVarB5, "id");
                    int iM27 = com.bumptech.glide.g.m(cVarB5, tcppUUQxZjFdy.zBcZkKQNvUi);
                    int iM28 = com.bumptech.glide.g.m(cVarB5, "elem_id");
                    int iM29 = com.bumptech.glide.g.m(cVarB5, "elem_type");
                    int iM30 = com.bumptech.glide.g.m(cVarB5, "lan");
                    int iM31 = com.bumptech.glide.g.m(cVarB5, "type");
                    int iM32 = com.bumptech.glide.g.m(cVarB5, "last_study_time");
                    int iM33 = com.bumptech.glide.g.m(cVarB5, "last_study_status");
                    int iM34 = com.bumptech.glide.g.m(cVarB5, "is_reviewed");
                    int iM35 = com.bumptech.glide.g.m(cVarB5, "status");
                    int iM36 = com.bumptech.glide.g.m(cVarB5, "last_review_time");
                    int iM37 = com.bumptech.glide.g.m(cVarB5, "next_review_time");
                    int iM38 = com.bumptech.glide.g.m(cVarB5, "interval");
                    int iM39 = com.bumptech.glide.g.m(cVarB5, "ease_factor");
                    int iM40 = com.bumptech.glide.g.m(cVarB5, "learning_step");
                    int iM41 = com.bumptech.glide.g.m(cVarB5, "lapses");
                    int iM42 = com.bumptech.glide.g.m(cVarB5, "so_easy_count");
                    int iM43 = com.bumptech.glide.g.m(cVarB5, "last_high_so_easy_count");
                    int iM44 = com.bumptech.glide.g.m(cVarB5, "last_modifier_time");
                    int iM45 = com.bumptech.glide.g.m(cVarB5, "pending_update");
                    int iM46 = com.bumptech.glide.g.m(cVarB5, "is_excluded_from_review");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarB5.r1()) {
                        String strB1 = cVarB5.B0(iM26);
                        long j12 = cVarB5.getLong(iM27);
                        long j13 = cVarB5.getLong(iM28);
                        int i29 = iM27;
                        int i30 = iM28;
                        int i31 = (int) cVarB5.getLong(iM29);
                        String strB2 = cVarB5.B0(iM30);
                        String strB3 = cVarB5.B0(iM31);
                        long j14 = cVarB5.getLong(iM32);
                        int i32 = (int) cVarB5.getLong(iM33);
                        int i33 = (int) cVarB5.getLong(iM34);
                        int i34 = (int) cVarB5.getLong(iM35);
                        long j15 = cVarB5.getLong(iM36);
                        long j16 = cVarB5.getLong(iM37);
                        long j17 = cVarB5.getLong(iM38);
                        float f5 = (float) cVarB5.getDouble(iM39);
                        int i35 = iM40;
                        int i36 = iM39;
                        int i37 = (int) cVarB5.getLong(i35);
                        int i38 = iM41;
                        int i39 = iM29;
                        int i40 = (int) cVarB5.getLong(i38);
                        int i41 = iM42;
                        int i42 = (int) cVarB5.getLong(i41);
                        int i43 = iM43;
                        int i44 = iM44;
                        int i45 = iM26;
                        int i46 = iM45;
                        int i47 = iM46;
                        arrayList2.add(new SRSStatusEntity(strB1, j12, j13, i31, strB2, strB3, j14, i32, i33, i34, j15, j16, j17, f5, i37, i40, i42, (int) cVarB5.getLong(i43), cVarB5.getLong(i44), ((int) cVarB5.getLong(i46)) != 0, (int) cVarB5.getLong(i47)));
                        iM45 = i46;
                        iM26 = i45;
                        iM44 = i44;
                        iM29 = i39;
                        iM41 = i38;
                        iM42 = i41;
                        iM43 = i43;
                        iM46 = i47;
                        iM39 = i36;
                        iM27 = i29;
                        iM28 = i30;
                        iM40 = i35;
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarB5.close();
                }
            case 5:
                List list6 = this.f3050c;
                ja.a _connection6 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection6, "_connection");
                ja.c cVarB6 = _connection6.B1(this.f3049b);
                try {
                    Iterator it6 = list6.iterator();
                    int i48 = 1;
                    while (it6.hasNext()) {
                        cVarB6.b0(i48, (String) it6.next());
                        i48++;
                    }
                    cVarB6.r1();
                } finally {
                    cVarB6.close();
                }
                break;
            default:
                List list7 = this.f3050c;
                ja.a _connection7 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection7, "_connection");
                ja.c cVarB7 = _connection7.B1(this.f3049b);
                try {
                    Iterator it7 = list7.iterator();
                    int i49 = 1;
                    while (it7.hasNext()) {
                        cVarB7.b0(i49, (String) it7.next());
                        i49++;
                    }
                    cVarB7.r1();
                } finally {
                    cVarB7.close();
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
