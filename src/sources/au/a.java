package au;

import aj.uZCn.evRpcb;
import b0.g2;
import com.google.api.Service;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingo.lingoskill.object.HwCharacterDao;
import com.lingodeer.data.model.speech.Word;
import com.lingodeer.database.model.BookmarkEntity;
import com.lingodeer.database.model.CharacterStrokeEntity;
import com.lingodeer.database.model.CharacterStrokeGroupEntity;
import com.lingodeer.database.model.ChineseToneLastVisitedEntity;
import com.lingodeer.database.model.ChineseToneLevelEntity;
import com.lingodeer.database.model.DailyLearnHistoryEntity;
import com.lingodeer.database.model.DailyLearnTimeHistoryEntity;
import com.lingodeer.database.model.DailyStreakHistoryEntity;
import com.lingodeer.database.model.DauMetricsEntity;
import com.lingodeer.database.model.LanguageHistoryEntity;
import com.lingodeer.database.model.LessonFinishStatusEntity;
import com.lingodeer.database.model.LoginHistoryEntity;
import com.lingodeer.database.model.ReviewStatusEntity;
import com.lingodeer.database.model.SRSStatusEntity;
import com.lingodeer.database.model.SubLearnProgressEntity;
import com.lingodeer.database.model.UnitFinishStatusEntity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2930a;

    public /* synthetic */ a(int i11) {
        this.f2930a = i11;
    }

    private final Object a(Object obj) throws Exception {
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("SELECT * FROM login_history");
        try {
            int iM = com.bumptech.glide.g.m(cVarB1, "uid");
            int iM2 = com.bumptech.glide.g.m(cVarB1, "nick_name");
            int iM3 = com.bumptech.glide.g.m(cVarB1, "email");
            int iM4 = com.bumptech.glide.g.m(cVarB1, "account_type");
            int iM5 = com.bumptech.glide.g.m(cVarB1, "is_member");
            int iM6 = com.bumptech.glide.g.m(cVarB1, "learning_lan");
            int iM7 = com.bumptech.glide.g.m(cVarB1, "ui_lan");
            int iM8 = com.bumptech.glide.g.m(cVarB1, "last_logout_time");
            ArrayList arrayList = new ArrayList();
            while (cVarB1.r1()) {
                int i11 = iM2;
                int i12 = iM3;
                arrayList.add(new LoginHistoryEntity(cVarB1.B0(iM), cVarB1.B0(iM2), cVarB1.B0(iM3), cVarB1.B0(iM4), ((int) cVarB1.getLong(iM5)) != 0, (int) cVarB1.getLong(iM6), (int) cVarB1.getLong(iM7), cVarB1.getLong(iM8)));
                iM2 = i11;
                iM3 = i12;
            }
            cVarB1.close();
            return arrayList;
        } catch (Throwable th2) {
            cVarB1.close();
            throw th2;
        }
    }

    private final Object c(Object obj) throws Exception {
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("DELETE FROM srs_status");
        try {
            cVarB1.r1();
            return qy.b0.f48488a;
        } finally {
            cVarB1.close();
        }
    }

    private final Object e(Object obj) throws Exception {
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("SELECT * FROM sub_learn_progress");
        try {
            int iM = com.bumptech.glide.g.m(cVarB1, "id");
            int iM2 = com.bumptech.glide.g.m(cVarB1, "status");
            int iM3 = com.bumptech.glide.g.m(cVarB1, "time");
            ArrayList arrayList = new ArrayList();
            while (cVarB1.r1()) {
                arrayList.add(new SubLearnProgressEntity(cVarB1.B0(iM), cVarB1.B0(iM2), cVarB1.getLong(iM3)));
            }
            cVarB1.close();
            return arrayList;
        } catch (Throwable th2) {
            cVarB1.close();
            throw th2;
        }
    }

    private final Object h(Object obj) throws Exception {
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("DELETE FROM unit_finish_status");
        try {
            cVarB1.r1();
            return qy.b0.f48488a;
        } finally {
            cVarB1.close();
        }
    }

    private final Object j(Object obj) throws Exception {
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("SELECT * FROM unit_finish_status");
        try {
            int iM = com.bumptech.glide.g.m(cVarB1, "id");
            int iM2 = com.bumptech.glide.g.m(cVarB1, "lan");
            int iM3 = com.bumptech.glide.g.m(cVarB1, "cur_enter_lesson_index");
            int iM4 = com.bumptech.glide.g.m(cVarB1, "story_reading");
            int iM5 = com.bumptech.glide.g.m(cVarB1, "story_speaking");
            int iM6 = com.bumptech.glide.g.m(cVarB1, "tips_reading");
            int iM7 = com.bumptech.glide.g.m(cVarB1, "dialog_warm_up");
            int iM8 = com.bumptech.glide.g.m(cVarB1, "dialog_practice");
            int iM9 = com.bumptech.glide.g.m(cVarB1, "dialog_speaking");
            int iM10 = com.bumptech.glide.g.m(cVarB1, "time");
            int iM11 = com.bumptech.glide.g.m(cVarB1, "pending_update");
            ArrayList arrayList = new ArrayList();
            while (cVarB1.r1()) {
                String strB0 = cVarB1.B0(iM);
                String strB1 = cVarB1.B0(iM2);
                int i11 = iM2;
                int i12 = iM3;
                int i13 = iM4;
                arrayList.add(new UnitFinishStatusEntity(strB0, strB1, (int) cVarB1.getLong(iM3), ((int) cVarB1.getLong(iM4)) != 0, ((int) cVarB1.getLong(iM5)) != 0, ((int) cVarB1.getLong(iM6)) != 0, ((int) cVarB1.getLong(iM7)) != 0, ((int) cVarB1.getLong(iM8)) != 0, ((int) cVarB1.getLong(iM9)) != 0, cVarB1.getLong(iM10), ((int) cVarB1.getLong(iM11)) != 0));
                iM4 = i13;
                iM3 = i12;
                iM2 = i11;
            }
            cVarB1.close();
            return arrayList;
        } catch (Throwable th2) {
            cVarB1.close();
            throw th2;
        }
    }

    private final Object k(Object obj) {
        Word it = (Word) obj;
        kotlin.jvm.internal.m.f(it, "it");
        return it.getWord();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qy.h] */
    private final Object l(Object obj) {
        b0.f1 f1Var = (b0.f1) obj;
        long j11 = f1Var.f3531t;
        ((x1.u) g2.f3546b.getValue()).d(f1Var, g2.f3545a, f1Var.H);
        long j12 = f1Var.f3531t;
        if (j11 != j12) {
            b0.w0 w0Var = f1Var.Q;
            if (w0Var != null) {
                if (w0Var.f3723a > j12) {
                    f1Var.x0();
                } else {
                    w0Var.f3729g = j12;
                    if (w0Var.f3724b == null) {
                        w0Var.f3730h = hz.b.R((1.0d - ((double) w0Var.f3727e.a(0))) * f1Var.f3531t);
                    }
                }
            } else if (j12 != 0) {
                f1Var.A0();
            }
        }
        return qy.b0.f48488a;
    }

    private final Object m(Object obj) {
        ((fz.a) obj).invoke();
        return qy.b0.f48488a;
    }

    public /* synthetic */ a(Object obj, int i11) {
        this.f2930a = i11;
    }

    private final Object d(Object obj) throws Exception {
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("SELECT * FROM srs_status");
        try {
            int iM = com.bumptech.glide.g.m(cVarB1, "id");
            int iM2 = com.bumptech.glide.g.m(cVarB1, evRpcb.oiQcfHLZBgZ);
            int iM3 = com.bumptech.glide.g.m(cVarB1, "elem_id");
            int iM4 = com.bumptech.glide.g.m(cVarB1, "elem_type");
            int iM5 = com.bumptech.glide.g.m(cVarB1, "lan");
            int iM6 = com.bumptech.glide.g.m(cVarB1, "type");
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
            int iM21 = com.bumptech.glide.g.m(cVarB1, "is_excluded_from_review");
            ArrayList arrayList = new ArrayList();
            while (cVarB1.r1()) {
                String strB0 = cVarB1.B0(iM);
                long j11 = cVarB1.getLong(iM2);
                long j12 = cVarB1.getLong(iM3);
                int i11 = iM2;
                int i12 = iM3;
                int i13 = (int) cVarB1.getLong(iM4);
                String strB1 = cVarB1.B0(iM5);
                String strB2 = cVarB1.B0(iM6);
                long j13 = cVarB1.getLong(iM7);
                int i14 = (int) cVarB1.getLong(iM8);
                int i15 = (int) cVarB1.getLong(iM9);
                int i16 = (int) cVarB1.getLong(iM10);
                long j14 = cVarB1.getLong(iM11);
                long j15 = cVarB1.getLong(iM12);
                long j16 = cVarB1.getLong(iM13);
                float f5 = (float) cVarB1.getDouble(iM14);
                int i17 = iM15;
                int i18 = iM4;
                int i19 = iM5;
                int i21 = (int) cVarB1.getLong(i17);
                int i22 = iM16;
                int i23 = (int) cVarB1.getLong(i22);
                int i24 = iM17;
                int i25 = (int) cVarB1.getLong(i24);
                int i26 = iM18;
                int i27 = iM19;
                int i28 = iM;
                int i29 = iM20;
                int i30 = iM21;
                arrayList.add(new SRSStatusEntity(strB0, j11, j12, i13, strB1, strB2, j13, i14, i15, i16, j14, j15, j16, f5, i21, i23, i25, (int) cVarB1.getLong(i26), cVarB1.getLong(i27), ((int) cVarB1.getLong(i29)) != 0, (int) cVarB1.getLong(i30)));
                iM20 = i29;
                iM = i28;
                iM19 = i27;
                iM4 = i18;
                iM21 = i30;
                iM15 = i17;
                iM16 = i22;
                iM17 = i24;
                iM2 = i11;
                iM3 = i12;
                iM18 = i26;
                iM5 = i19;
            }
            cVarB1.close();
            return arrayList;
        } catch (Throwable th2) {
            cVarB1.close();
            throw th2;
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws Exception {
        ChineseToneLastVisitedEntity chineseToneLastVisitedEntity;
        switch (this.f2930a) {
            case 0:
                ja.a _connection = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection, "_connection");
                ja.c cVarB1 = _connection.B1("DELETE FROM billing_status");
                try {
                    cVarB1.r1();
                    return qy.b0.f48488a;
                } finally {
                    cVarB1.close();
                }
            case 1:
                ja.a _connection2 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection2, "_connection");
                ja.c cVarB2 = _connection2.B1("SELECT * FROM bookmark");
                try {
                    int iM = com.bumptech.glide.g.m(cVarB2, "id");
                    int iM2 = com.bumptech.glide.g.m(cVarB2, "lan");
                    int iM3 = com.bumptech.glide.g.m(cVarB2, "is_fav");
                    int iM4 = com.bumptech.glide.g.m(cVarB2, "content_type");
                    int iM5 = com.bumptech.glide.g.m(cVarB2, "time");
                    int iM6 = com.bumptech.glide.g.m(cVarB2, "folder_id");
                    ArrayList arrayList = new ArrayList();
                    while (cVarB2.r1()) {
                        arrayList.add(new BookmarkEntity(cVarB2.B0(iM), cVarB2.B0(iM2), (int) cVarB2.getLong(iM3), cVarB2.B0(iM4), cVarB2.getLong(iM5), cVarB2.isNull(iM6) ? null : cVarB2.B0(iM6)));
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarB2.close();
                }
            case 2:
                ja.a _connection3 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection3, "_connection");
                ja.c cVarB3 = _connection3.B1("SELECT * FROM CharacterStroke");
                try {
                    int iM7 = com.bumptech.glide.g.m(cVarB3, "CharId");
                    int iM8 = com.bumptech.glide.g.m(cVarB3, HwCharacterDao.TABLENAME);
                    int iM9 = com.bumptech.glide.g.m(cVarB3, "Zhuyin");
                    int iM10 = com.bumptech.glide.g.m(cVarB3, "Pinyin");
                    int iM11 = com.bumptech.glide.g.m(cVarB3, "Luoma");
                    int iM12 = com.bumptech.glide.g.m(cVarB3, "StrokeData");
                    int iM13 = com.bumptech.glide.g.m(cVarB3, "Version");
                    int iM14 = com.bumptech.glide.g.m(cVarB3, "TranCHN");
                    int iM15 = com.bumptech.glide.g.m(cVarB3, "TranTCHN");
                    int iM16 = com.bumptech.glide.g.m(cVarB3, "TranJPN");
                    int iM17 = com.bumptech.glide.g.m(cVarB3, "TranKRN");
                    int iM18 = com.bumptech.glide.g.m(cVarB3, "TranENG");
                    int iM19 = com.bumptech.glide.g.m(cVarB3, "TranSPN");
                    int iM20 = com.bumptech.glide.g.m(cVarB3, "TranFRN");
                    int iM21 = com.bumptech.glide.g.m(cVarB3, "TranDEN");
                    int iM22 = com.bumptech.glide.g.m(cVarB3, "TranITN");
                    int iM23 = com.bumptech.glide.g.m(cVarB3, "TranPTG");
                    int iM24 = com.bumptech.glide.g.m(cVarB3, "TranVTN");
                    int iM25 = com.bumptech.glide.g.m(cVarB3, "TranRUS");
                    int iM26 = com.bumptech.glide.g.m(cVarB3, "TranTUR");
                    int iM27 = com.bumptech.glide.g.m(cVarB3, "TranIDN");
                    int iM28 = com.bumptech.glide.g.m(cVarB3, "TranARA");
                    int iM29 = com.bumptech.glide.g.m(cVarB3, "TranPOL");
                    int iM30 = com.bumptech.glide.g.m(cVarB3, "TranTHAI");
                    int iM31 = com.bumptech.glide.g.m(cVarB3, "TranHINDI");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarB3.r1()) {
                        long j11 = cVarB3.getLong(iM7);
                        String strB0 = null;
                        zt.a aVarJ = re.g0.j(cVarB3.isNull(iM8) ? null : cVarB3.B0(iM8));
                        zt.a aVarJ2 = re.g0.j(cVarB3.isNull(iM9) ? null : cVarB3.B0(iM9));
                        zt.a aVarJ3 = re.g0.j(cVarB3.isNull(iM10) ? null : cVarB3.B0(iM10));
                        zt.a aVarJ4 = re.g0.j(cVarB3.isNull(iM11) ? null : cVarB3.B0(iM11));
                        zt.a aVarJ5 = re.g0.j(cVarB3.isNull(iM12) ? null : cVarB3.B0(iM12));
                        Integer numValueOf = cVarB3.isNull(iM13) ? null : Integer.valueOf((int) cVarB3.getLong(iM13));
                        zt.a aVarJ6 = re.g0.j(cVarB3.isNull(iM14) ? null : cVarB3.B0(iM14));
                        zt.a aVarJ7 = re.g0.j(cVarB3.isNull(iM15) ? null : cVarB3.B0(iM15));
                        zt.a aVarJ8 = re.g0.j(cVarB3.isNull(iM16) ? null : cVarB3.B0(iM16));
                        zt.a aVarJ9 = re.g0.j(cVarB3.isNull(iM17) ? null : cVarB3.B0(iM17));
                        zt.a aVarJ10 = re.g0.j(cVarB3.isNull(iM18) ? null : cVarB3.B0(iM18));
                        zt.a aVarJ11 = re.g0.j(cVarB3.isNull(iM19) ? null : cVarB3.B0(iM19));
                        zt.a aVarJ12 = re.g0.j(cVarB3.isNull(iM20) ? null : cVarB3.B0(iM20));
                        int i11 = iM21;
                        zt.a aVarJ13 = re.g0.j(cVarB3.isNull(i11) ? null : cVarB3.B0(i11));
                        int i12 = iM22;
                        zt.a aVarJ14 = re.g0.j(cVarB3.isNull(i12) ? null : cVarB3.B0(i12));
                        int i13 = iM7;
                        int i14 = iM23;
                        zt.a aVarJ15 = re.g0.j(cVarB3.isNull(i14) ? null : cVarB3.B0(i14));
                        iM23 = i14;
                        int i15 = iM24;
                        zt.a aVarJ16 = re.g0.j(cVarB3.isNull(i15) ? null : cVarB3.B0(i15));
                        iM24 = i15;
                        int i16 = iM25;
                        zt.a aVarJ17 = re.g0.j(cVarB3.isNull(i16) ? null : cVarB3.B0(i16));
                        iM25 = i16;
                        int i17 = iM26;
                        zt.a aVarJ18 = re.g0.j(cVarB3.isNull(i17) ? null : cVarB3.B0(i17));
                        iM26 = i17;
                        int i18 = iM27;
                        zt.a aVarJ19 = re.g0.j(cVarB3.isNull(i18) ? null : cVarB3.B0(i18));
                        iM27 = i18;
                        int i19 = iM28;
                        zt.a aVarJ20 = re.g0.j(cVarB3.isNull(i19) ? null : cVarB3.B0(i19));
                        iM28 = i19;
                        int i21 = iM29;
                        zt.a aVarJ21 = re.g0.j(cVarB3.isNull(i21) ? null : cVarB3.B0(i21));
                        iM29 = i21;
                        int i22 = iM30;
                        zt.a aVarJ22 = re.g0.j(cVarB3.isNull(i22) ? null : cVarB3.B0(i22));
                        iM30 = i22;
                        int i23 = iM31;
                        if (!cVarB3.isNull(i23)) {
                            strB0 = cVarB3.B0(i23);
                        }
                        iM31 = i23;
                        arrayList2.add(new CharacterStrokeEntity(j11, aVarJ, aVarJ2, aVarJ3, aVarJ4, aVarJ5, numValueOf, aVarJ6, aVarJ7, aVarJ8, aVarJ9, aVarJ10, aVarJ11, aVarJ12, aVarJ13, aVarJ14, aVarJ15, aVarJ16, aVarJ17, aVarJ18, aVarJ19, aVarJ20, aVarJ21, aVarJ22, re.g0.j(strB0)));
                        iM7 = i13;
                        iM21 = i11;
                        iM22 = i12;
                        iM8 = iM8;
                        iM9 = iM9;
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarB3.close();
                }
            case 3:
                ja.a _connection4 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection4, "_connection");
                ja.c cVarB4 = _connection4.B1("SELECT COUNT(*) FROM CharacterStroke");
                try {
                    return Integer.valueOf(cVarB4.r1() ? (int) cVarB4.getLong(0) : 0);
                } finally {
                    cVarB4.close();
                }
            case 4:
                ja.a _connection5 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection5, "_connection");
                ja.c cVarB5 = _connection5.B1("SELECT * FROM CharacterStrokeGroup ORDER BY GroupIndex");
                try {
                    int iM32 = com.bumptech.glide.g.m(cVarB5, "GroupId");
                    int iM33 = com.bumptech.glide.g.m(cVarB5, "GroupIndex");
                    int iM34 = com.bumptech.glide.g.m(cVarB5, "GroupName");
                    int iM35 = com.bumptech.glide.g.m(cVarB5, "GroupList");
                    int iM36 = com.bumptech.glide.g.m(cVarB5, kHfjNGauVgdF.LiAKkDUKQmO);
                    int iM37 = com.bumptech.glide.g.m(cVarB5, "TGroupList");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarB5.r1()) {
                        long j12 = cVarB5.getLong(iM32);
                        int i24 = (int) cVarB5.getLong(iM33);
                        String strB1 = null;
                        zt.a aVarJ23 = re.g0.j(cVarB5.isNull(iM34) ? null : cVarB5.B0(iM34));
                        zt.a aVarJ24 = re.g0.j(cVarB5.isNull(iM35) ? null : cVarB5.B0(iM35));
                        zt.a aVarJ25 = re.g0.j(cVarB5.isNull(iM36) ? null : cVarB5.B0(iM36));
                        if (!cVarB5.isNull(iM37)) {
                            strB1 = cVarB5.B0(iM37);
                        }
                        arrayList3.add(new CharacterStrokeGroupEntity(j12, i24, aVarJ23, aVarJ24, aVarJ25, re.g0.j(strB1)));
                        break;
                    }
                    return arrayList3;
                } finally {
                    cVarB5.close();
                }
            case 5:
                ja.a _connection6 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection6, "_connection");
                ja.c cVarB6 = _connection6.B1("SELECT * FROM chinese_tone_last_visited WHERE id = 'last' LIMIT 1");
                try {
                    int iM38 = com.bumptech.glide.g.m(cVarB6, "id");
                    int iM39 = com.bumptech.glide.g.m(cVarB6, "lesson_id");
                    int iM40 = com.bumptech.glide.g.m(cVarB6, "time");
                    if (cVarB6.r1()) {
                        chineseToneLastVisitedEntity = new ChineseToneLastVisitedEntity(cVarB6.B0(iM38), cVarB6.getLong(iM39), cVarB6.getLong(iM40));
                        break;
                    } else {
                        chineseToneLastVisitedEntity = null;
                    }
                    return chineseToneLastVisitedEntity;
                } finally {
                    cVarB6.close();
                }
            case 6:
                ja.a _connection7 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection7, "_connection");
                ja.c cVarB7 = _connection7.B1("SELECT * FROM Level ORDER BY levelId");
                try {
                    int iM41 = com.bumptech.glide.g.m(cVarB7, "LevelId");
                    int iM42 = com.bumptech.glide.g.m(cVarB7, xTCJ.EpyTRhd);
                    int iM43 = com.bumptech.glide.g.m(cVarB7, "UnitList");
                    ArrayList arrayList4 = new ArrayList();
                    while (cVarB7.r1()) {
                        long j13 = cVarB7.getLong(iM41);
                        String strB2 = null;
                        zt.a aVarJ26 = re.g0.j(cVarB7.isNull(iM42) ? null : cVarB7.B0(iM42));
                        if (!cVarB7.isNull(iM43)) {
                            strB2 = cVarB7.B0(iM43);
                        }
                        arrayList4.add(new ChineseToneLevelEntity(j13, aVarJ26, re.g0.j(strB2)));
                        break;
                    }
                    return arrayList4;
                } finally {
                    cVarB7.close();
                }
            case 7:
                ja.a _connection8 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection8, "_connection");
                ja.c cVarB8 = _connection8.B1("SELECT COUNT(*) FROM Level");
                try {
                    return Integer.valueOf(cVarB8.r1() ? (int) cVarB8.getLong(0) : 0);
                } finally {
                    cVarB8.close();
                }
            case 8:
                ja.a _connection9 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection9, "_connection");
                ja.c cVarB9 = _connection9.B1("SELECT * FROM daily_learn_history");
                try {
                    int iM44 = com.bumptech.glide.g.m(cVarB9, "id");
                    int iM45 = com.bumptech.glide.g.m(cVarB9, "amount");
                    int iM46 = com.bumptech.glide.g.m(cVarB9, "base_xp");
                    int iM47 = com.bumptech.glide.g.m(cVarB9, "pending_amount");
                    ArrayList arrayList5 = new ArrayList();
                    while (cVarB9.r1()) {
                        arrayList5.add(new DailyLearnHistoryEntity(cVarB9.B0(iM44), (int) cVarB9.getLong(iM45), (int) cVarB9.getLong(iM46), (int) cVarB9.getLong(iM47)));
                    }
                    cVarB9.close();
                    return arrayList5;
                } catch (Throwable th2) {
                    cVarB9.close();
                    throw th2;
                }
            case 9:
                ja.a _connection10 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection10, "_connection");
                ja.c cVarB10 = _connection10.B1("SELECT * FROM daily_learn_time_history");
                try {
                    int iM48 = com.bumptech.glide.g.m(cVarB10, "id");
                    int iM49 = com.bumptech.glide.g.m(cVarB10, "seconds");
                    int iM50 = com.bumptech.glide.g.m(cVarB10, "base_time");
                    int iM51 = com.bumptech.glide.g.m(cVarB10, "pending_seconds");
                    ArrayList arrayList6 = new ArrayList();
                    while (cVarB10.r1()) {
                        arrayList6.add(new DailyLearnTimeHistoryEntity(cVarB10.B0(iM48), (int) cVarB10.getLong(iM49), (int) cVarB10.getLong(iM50), (int) cVarB10.getLong(iM51)));
                    }
                    cVarB10.close();
                    return arrayList6;
                } catch (Throwable th3) {
                    cVarB10.close();
                    throw th3;
                }
            case 10:
                ja.a _connection11 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection11, "_connection");
                ja.c cVarB11 = _connection11.B1("SELECT * FROM daily_streak_history");
                try {
                    int iM52 = com.bumptech.glide.g.m(cVarB11, "id");
                    int iM53 = com.bumptech.glide.g.m(cVarB11, "type");
                    int iM54 = com.bumptech.glide.g.m(cVarB11, "pending_type");
                    ArrayList arrayList7 = new ArrayList();
                    while (cVarB11.r1()) {
                        arrayList7.add(new DailyStreakHistoryEntity(cVarB11.B0(iM52), cVarB11.B0(iM53), cVarB11.B0(iM54)));
                    }
                    cVarB11.close();
                    return arrayList7;
                } catch (Throwable th4) {
                    cVarB11.close();
                    throw th4;
                }
            case 11:
                ja.a _connection12 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection12, "_connection");
                ja.c cVarB12 = _connection12.B1("SELECT * FROM dau_metrics");
                try {
                    int iM55 = com.bumptech.glide.g.m(cVarB12, "id");
                    int iM56 = com.bumptech.glide.g.m(cVarB12, "finishLessonType");
                    int iM57 = com.bumptech.glide.g.m(cVarB12, "pending_update");
                    int iM58 = com.bumptech.glide.g.m(cVarB12, "pending_update_finish_lesson_type");
                    ArrayList arrayList8 = new ArrayList();
                    while (cVarB12.r1()) {
                        String strB3 = cVarB12.B0(iM55);
                        int i25 = (int) cVarB12.getLong(iM56);
                        boolean z11 = false;
                        boolean z12 = ((int) cVarB12.getLong(iM57)) != 0;
                        if (((int) cVarB12.getLong(iM58)) != 0) {
                            z11 = true;
                        }
                        arrayList8.add(new DauMetricsEntity(strB3, i25, z12, z11));
                    }
                    cVarB12.close();
                    return arrayList8;
                } catch (Throwable th5) {
                    cVarB12.close();
                    throw th5;
                }
            case 12:
                ja.a _connection13 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection13, "_connection");
                ja.c cVarB13 = _connection13.B1("SELECT * FROM language_history ORDER BY lastSelectedTime DESC");
                try {
                    int iM59 = com.bumptech.glide.g.m(cVarB13, "id");
                    int iM60 = com.bumptech.glide.g.m(cVarB13, "keyLanguage");
                    int iM61 = com.bumptech.glide.g.m(cVarB13, "locate");
                    int iM62 = com.bumptech.glide.g.m(cVarB13, "title");
                    int iM63 = com.bumptech.glide.g.m(cVarB13, "description");
                    int iM64 = com.bumptech.glide.g.m(cVarB13, "lastSelectedTime");
                    ArrayList arrayList9 = new ArrayList();
                    while (cVarB13.r1()) {
                        arrayList9.add(new LanguageHistoryEntity(cVarB13.B0(iM59), (int) cVarB13.getLong(iM60), (int) cVarB13.getLong(iM61), cVarB13.B0(iM62), cVarB13.B0(iM63), cVarB13.getLong(iM64)));
                    }
                    cVarB13.close();
                    return arrayList9;
                } catch (Throwable th6) {
                    cVarB13.close();
                    throw th6;
                }
            case 13:
                ja.a _connection14 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection14, "_connection");
                ja.c cVarB14 = _connection14.B1("DELETE FROM last_sync_time");
                try {
                    cVarB14.r1();
                    return qy.b0.f48488a;
                } finally {
                    cVarB14.close();
                }
            case 14:
                ja.a _connection15 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection15, "_connection");
                ja.c cVarB15 = _connection15.B1("DELETE FROM learn_progress");
                try {
                    cVarB15.r1();
                    return qy.b0.f48488a;
                } finally {
                    cVarB15.close();
                }
            case 15:
                ja.a _connection16 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection16, "_connection");
                ja.c cVarB16 = _connection16.B1("DELETE FROM lesson_finish_status");
                try {
                    cVarB16.r1();
                    return qy.b0.f48488a;
                } finally {
                    cVarB16.close();
                }
            case 16:
                ja.a _connection17 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection17, "_connection");
                ja.c cVarB17 = _connection17.B1("SELECT * FROM lesson_finish_status");
                try {
                    int iM65 = com.bumptech.glide.g.m(cVarB17, "id");
                    int iM66 = com.bumptech.glide.g.m(cVarB17, "lan");
                    int iM67 = com.bumptech.glide.g.m(cVarB17, "practice_listening");
                    int iM68 = com.bumptech.glide.g.m(cVarB17, "practice_speaking");
                    int iM69 = com.bumptech.glide.g.m(cVarB17, "practice_spelling");
                    int iM70 = com.bumptech.glide.g.m(cVarB17, "practice_comprehensive");
                    int iM71 = com.bumptech.glide.g.m(cVarB17, "time");
                    int iM72 = com.bumptech.glide.g.m(cVarB17, "pending_update");
                    ArrayList arrayList10 = new ArrayList();
                    while (cVarB17.r1()) {
                        String strB4 = cVarB17.B0(iM65);
                        String strB5 = cVarB17.B0(iM66);
                        boolean z13 = true;
                        if (((int) cVarB17.getLong(iM67)) == 0) {
                            z13 = false;
                        }
                        arrayList10.add(new LessonFinishStatusEntity(strB4, strB5, z13, ((int) cVarB17.getLong(iM68)) != 0, ((int) cVarB17.getLong(iM69)) != 0, ((int) cVarB17.getLong(iM70)) != 0, cVarB17.getLong(iM71), ((int) cVarB17.getLong(iM72)) != 0));
                    }
                    cVarB17.close();
                    return arrayList10;
                } catch (Throwable th7) {
                    cVarB17.close();
                    throw th7;
                }
            case 17:
                return a(obj);
            case 18:
                ja.a _connection18 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection18, "_connection");
                ja.c cVarB18 = _connection18.B1("DELETE FROM review_status");
                try {
                    cVarB18.r1();
                    return qy.b0.f48488a;
                } finally {
                    cVarB18.close();
                }
            case 19:
                ja.a _connection19 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection19, "_connection");
                ja.c cVarB19 = _connection19.B1("SELECT * FROM review_status");
                try {
                    int iM73 = com.bumptech.glide.g.m(cVarB19, "id");
                    int iM74 = com.bumptech.glide.g.m(cVarB19, "unit_id");
                    int iM75 = com.bumptech.glide.g.m(cVarB19, "item_id");
                    int iM76 = com.bumptech.glide.g.m(cVarB19, "elem_type");
                    int iM77 = com.bumptech.glide.g.m(cVarB19, "last_study_time");
                    int iM78 = com.bumptech.glide.g.m(cVarB19, "status");
                    ArrayList arrayList11 = new ArrayList();
                    while (cVarB19.r1()) {
                        arrayList11.add(new ReviewStatusEntity(cVarB19.B0(iM73), cVarB19.getLong(iM74), cVarB19.getLong(iM75), (int) cVarB19.getLong(iM76), cVarB19.getLong(iM77), cVarB19.B0(iM78)));
                    }
                    cVarB19.close();
                    return arrayList11;
                } catch (Throwable th8) {
                    cVarB19.close();
                    throw th8;
                }
            case 20:
                return c(obj);
            case 21:
                return d(obj);
            case 22:
                return e(obj);
            case 23:
                return h(obj);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return j(obj);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return k(obj);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return qy.b0.f48488a;
            case 27:
                return l(obj);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return m(obj);
            default:
                return new b0.o(((Float) obj).floatValue());
        }
    }
}
