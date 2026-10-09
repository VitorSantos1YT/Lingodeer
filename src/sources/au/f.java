package au;

import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import com.google.api.Service;
import com.lingo.lingoskill.object.HwCharacterDao;
import com.lingodeer.data.model.UserInfo;
import com.lingodeer.database.model.BookmarkEntity;
import com.lingodeer.database.model.BookmarkFolderEntity;
import com.lingodeer.database.model.CharacterStrokeEntity;
import com.lingodeer.database.model.DailyStreakHistoryEntity;
import com.lingodeer.database.model.DauMetricsEntity;
import com.lingodeer.database.model.DbFileVersionEntity;
import com.lingodeer.database.model.KnowledgeNoteEntity;
import com.lingodeer.database.model.LastSyncTimeEntity;
import com.lingodeer.database.model.LearnProgressEntity;
import com.lingodeer.database.model.LessonFinishStatusEntity;
import com.lingodeer.database.model.LessonTestProgressEntity;
import com.lingodeer.database.model.ReviewStatusEntity;
import com.lingodeer.database.model.SRSStatusEntity;
import com.lingodeer.database.model.SubLearnProgressEntity;
import com.lingodeer.database.model.UnitFinishStatusEntity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dl.ExOZ.xItStCyvVEZ;
import java.util.ArrayList;
import mf.sOm.txBUGYhC;
import vf.eq.EHjhWcesDUIsIw;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2987b;

    public /* synthetic */ f(String str, int i11) {
        this.f2986a = i11;
        this.f2987b = str;
    }

    private final Object a(Object obj) throws Exception {
        KnowledgeNoteEntity knowledgeNoteEntity;
        String str = this.f2987b;
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("SELECT * FROM knowledge_note WHERE id = ? LIMIT 1");
        try {
            cVarB1.b0(1, str);
            int iM = com.bumptech.glide.g.m(cVarB1, "id");
            int iM2 = com.bumptech.glide.g.m(cVarB1, "lan");
            int iM3 = com.bumptech.glide.g.m(cVarB1, "value");
            int iM4 = com.bumptech.glide.g.m(cVarB1, "elem_id");
            int iM5 = com.bumptech.glide.g.m(cVarB1, "note");
            int iM6 = com.bumptech.glide.g.m(cVarB1, "updated_at");
            int iM7 = com.bumptech.glide.g.m(cVarB1, "is_deleted");
            int iM8 = com.bumptech.glide.g.m(cVarB1, "pending_update");
            if (cVarB1.r1()) {
                knowledgeNoteEntity = new KnowledgeNoteEntity(cVarB1.B0(iM), cVarB1.B0(iM2), cVarB1.B0(iM3), cVarB1.getLong(iM4), cVarB1.B0(iM5), cVarB1.getLong(iM6), ((int) cVarB1.getLong(iM7)) != 0, ((int) cVarB1.getLong(iM8)) != 0);
            } else {
                knowledgeNoteEntity = null;
            }
            return knowledgeNoteEntity;
        } finally {
            cVarB1.close();
        }
    }

    private final Object c(Object obj) throws Exception {
        String str = this.f2987b;
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("SELECT * FROM last_sync_time WHERE id =? LIMIT 1");
        try {
            cVarB1.b0(1, str);
            return cVarB1.r1() ? new LastSyncTimeEntity(cVarB1.B0(com.bumptech.glide.g.m(cVarB1, "id")), cVarB1.getLong(com.bumptech.glide.g.m(cVarB1, "last_sync_time"))) : null;
        } finally {
            cVarB1.close();
        }
    }

    private final Object e(Object obj) throws Exception {
        String str = this.f2987b;
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("DELETE FROM learn_progress WHERE lan =?");
        try {
            cVarB1.b0(1, str);
            cVarB1.r1();
            return qy.b0.f48488a;
        } finally {
            cVarB1.close();
        }
    }

    private final Object h(Object obj) throws Exception {
        LessonFinishStatusEntity lessonFinishStatusEntity;
        String str = this.f2987b;
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("SELECT * FROM lesson_finish_status WHERE id =? LIMIT 1");
        try {
            cVarB1.b0(1, str);
            int iM = com.bumptech.glide.g.m(cVarB1, "id");
            int iM2 = com.bumptech.glide.g.m(cVarB1, "lan");
            int iM3 = com.bumptech.glide.g.m(cVarB1, "practice_listening");
            int iM4 = com.bumptech.glide.g.m(cVarB1, "practice_speaking");
            int iM5 = com.bumptech.glide.g.m(cVarB1, "practice_spelling");
            int iM6 = com.bumptech.glide.g.m(cVarB1, "practice_comprehensive");
            int iM7 = com.bumptech.glide.g.m(cVarB1, "time");
            int iM8 = com.bumptech.glide.g.m(cVarB1, "pending_update");
            if (cVarB1.r1()) {
                lessonFinishStatusEntity = new LessonFinishStatusEntity(cVarB1.B0(iM), cVarB1.B0(iM2), ((int) cVarB1.getLong(iM3)) != 0, ((int) cVarB1.getLong(iM4)) != 0, ((int) cVarB1.getLong(iM5)) != 0, ((int) cVarB1.getLong(iM6)) != 0, cVarB1.getLong(iM7), ((int) cVarB1.getLong(iM8)) != 0);
            } else {
                lessonFinishStatusEntity = null;
            }
            return lessonFinishStatusEntity;
        } finally {
            cVarB1.close();
        }
    }

    private final Object j(Object obj) throws Exception {
        String str = this.f2987b;
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("DELETE FROM unit_finish_status WHERE lan =?");
        try {
            cVarB1.b0(1, str);
            cVarB1.r1();
            return qy.b0.f48488a;
        } finally {
            cVarB1.close();
        }
    }

    private final Object l(Object obj) throws Exception {
        String str = this.f2987b;
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("SELECT * FROM review_status WHERE id =? LIMIT 1");
        try {
            cVarB1.b0(1, str);
            return cVarB1.r1() ? new ReviewStatusEntity(cVarB1.B0(com.bumptech.glide.g.m(cVarB1, "id")), cVarB1.getLong(com.bumptech.glide.g.m(cVarB1, "unit_id")), cVarB1.getLong(com.bumptech.glide.g.m(cVarB1, "item_id")), (int) cVarB1.getLong(com.bumptech.glide.g.m(cVarB1, "elem_type")), cVarB1.getLong(com.bumptech.glide.g.m(cVarB1, "last_study_time")), cVarB1.B0(com.bumptech.glide.g.m(cVarB1, "status"))) : null;
        } finally {
            cVarB1.close();
        }
    }

    private final Object m(Object obj) throws Exception {
        String str = this.f2987b;
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("DELETE FROM review_status WHERE id LIKE ? ESCAPE '\\'");
        try {
            cVarB1.b0(1, str);
            cVarB1.r1();
            return qy.b0.f48488a;
        } finally {
            cVarB1.close();
        }
    }

    private final Object n(Object obj) throws Exception {
        SRSStatusEntity sRSStatusEntity;
        String str = this.f2987b;
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("SELECT * FROM srs_status WHERE id =? LIMIT 1");
        try {
            cVarB1.b0(1, str);
            int iM = com.bumptech.glide.g.m(cVarB1, "id");
            int iM2 = com.bumptech.glide.g.m(cVarB1, "unit_id");
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
            if (cVarB1.r1()) {
                sRSStatusEntity = new SRSStatusEntity(cVarB1.B0(iM), cVarB1.getLong(iM2), cVarB1.getLong(iM3), (int) cVarB1.getLong(iM4), cVarB1.B0(iM5), cVarB1.B0(iM6), cVarB1.getLong(iM7), (int) cVarB1.getLong(iM8), (int) cVarB1.getLong(iM9), (int) cVarB1.getLong(iM10), cVarB1.getLong(iM11), cVarB1.getLong(iM12), cVarB1.getLong(iM13), (float) cVarB1.getDouble(iM14), (int) cVarB1.getLong(iM15), (int) cVarB1.getLong(iM16), (int) cVarB1.getLong(iM17), (int) cVarB1.getLong(iM18), cVarB1.getLong(iM19), ((int) cVarB1.getLong(iM20)) != 0, (int) cVarB1.getLong(iM21));
            } else {
                sRSStatusEntity = null;
            }
            return sRSStatusEntity;
        } finally {
            cVarB1.close();
        }
    }

    private final Object o(Object obj) throws Exception {
        String str = this.f2987b;
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("SELECT * FROM sub_learn_progress WHERE id = ? LIMIT 1");
        try {
            cVarB1.b0(1, str);
            return cVarB1.r1() ? new SubLearnProgressEntity(cVarB1.B0(com.bumptech.glide.g.m(cVarB1, "id")), cVarB1.B0(com.bumptech.glide.g.m(cVarB1, "status")), cVarB1.getLong(com.bumptech.glide.g.m(cVarB1, "time"))) : null;
        } finally {
            cVarB1.close();
        }
    }

    private final Object p(Object obj) throws Exception {
        String str = this.f2987b;
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("SELECT * FROM sub_learn_progress WHERE id = ? LIMIT 1");
        try {
            cVarB1.b0(1, str);
            return cVarB1.r1() ? new SubLearnProgressEntity(cVarB1.B0(com.bumptech.glide.g.m(cVarB1, "id")), cVarB1.B0(com.bumptech.glide.g.m(cVarB1, "status")), cVarB1.getLong(com.bumptech.glide.g.m(cVarB1, "time"))) : null;
        } finally {
            cVarB1.close();
        }
    }

    private final Object r(Object obj) throws Exception {
        String str = this.f2987b;
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("DELETE FROM unit_finish_status WHERE lan =?");
        try {
            cVarB1.b0(1, str);
            cVarB1.r1();
            return qy.b0.f48488a;
        } finally {
            cVarB1.close();
        }
    }

    private final Object s(Object obj) {
        g3.b0 b0Var = (g3.b0) obj;
        g3.z.b(b0Var, this.f2987b);
        g3.z.d(b0Var, 5);
        return qy.b0.f48488a;
    }

    private final Object t(Object obj) {
        vt.t0 it = (vt.t0) obj;
        kotlin.jvm.internal.m.f(it, "it");
        return Boolean.valueOf(kotlin.jvm.internal.m.a(it.f54287a, this.f2987b));
    }

    private final Object u(Object obj) {
        UserInfo userInfo = (UserInfo) obj;
        return UserInfo.copy$default(userInfo, null, 0, 0, 0, 0, 0, 0L, 0, 0L, null, null, null, null, null, null, ry.m.F0(userInfo.getAllFollowers(), this.f2987b), null, 0, 0, 0, 0, 0, 0, null, null, 33521663, null);
    }

    public /* synthetic */ f(String str, p pVar) {
        this.f2986a = 4;
        this.f2987b = str;
    }

    private final Object d(Object obj) throws Exception {
        LearnProgressEntity learnProgressEntity;
        String str = this.f2987b;
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("SELECT * FROM learn_progress WHERE lan =? LIMIT 1");
        try {
            cVarB1.b0(1, str);
            int iM = com.bumptech.glide.g.m(cVarB1, "lan");
            int iM2 = com.bumptech.glide.g.m(cVarB1, "main");
            int iM3 = com.bumptech.glide.g.m(cVarB1, "main_tt");
            int iM4 = com.bumptech.glide.g.m(cVarB1, "lesson_exam");
            int iM5 = com.bumptech.glide.g.m(cVarB1, "lesson_stars");
            int iM6 = com.bumptech.glide.g.m(cVarB1, "audio_lesson");
            int iM7 = com.bumptech.glide.g.m(cVarB1, "pronun");
            int iM8 = com.bumptech.glide.g.m(cVarB1, anrPHlQ.fIBMMXCpTndApnn);
            int iM9 = com.bumptech.glide.g.m(cVarB1, "flash_card_practice_count");
            int iM10 = com.bumptech.glide.g.m(cVarB1, "flash_card_display_in");
            int iM11 = com.bumptech.glide.g.m(cVarB1, "flash_card_focus_unit");
            int iM12 = com.bumptech.glide.g.m(cVarB1, "flash_card_is_learn_char");
            int iM13 = com.bumptech.glide.g.m(cVarB1, txBUGYhC.TQvxfHnC);
            int iM14 = com.bumptech.glide.g.m(cVarB1, "flash_card_is_learn_sent");
            int iM15 = com.bumptech.glide.g.m(cVarB1, "flash_card_focus_new");
            int iM16 = com.bumptech.glide.g.m(cVarB1, "flash_card_focus_weak");
            int iM17 = com.bumptech.glide.g.m(cVarB1, "flash_card_focus_good");
            int iM18 = com.bumptech.glide.g.m(cVarB1, "flash_card_focus_perfect");
            int iM19 = com.bumptech.glide.g.m(cVarB1, "review_filter_method_char");
            int iM20 = com.bumptech.glide.g.m(cVarB1, "review_filter_method_word");
            int iM21 = com.bumptech.glide.g.m(cVarB1, "review_filter_method_sent");
            int iM22 = com.bumptech.glide.g.m(cVarB1, "review_practice_model_char");
            int iM23 = com.bumptech.glide.g.m(cVarB1, "review_practice_model_word");
            int iM24 = com.bumptech.glide.g.m(cVarB1, "review_practice_model_sent");
            int iM25 = com.bumptech.glide.g.m(cVarB1, "review_select_record_char");
            int iM26 = com.bumptech.glide.g.m(cVarB1, "review_select_record_word");
            int iM27 = com.bumptech.glide.g.m(cVarB1, "review_select_record_sent");
            int iM28 = com.bumptech.glide.g.m(cVarB1, "ack_enter_pos");
            int iM29 = com.bumptech.glide.g.m(cVarB1, "ack_unit_id");
            int iM30 = com.bumptech.glide.g.m(cVarB1, "restart_timestamp");
            int iM31 = com.bumptech.glide.g.m(cVarB1, "pending_update");
            if (cVarB1.r1()) {
                learnProgressEntity = new LearnProgressEntity(cVarB1.B0(iM), cVarB1.B0(iM2), cVarB1.B0(iM3), cVarB1.B0(iM4), cVarB1.B0(iM5), cVarB1.B0(iM6), (int) cVarB1.getLong(iM7), cVarB1.getLong(iM8), (int) cVarB1.getLong(iM9), (int) cVarB1.getLong(iM10), cVarB1.B0(iM11), ((int) cVarB1.getLong(iM12)) != 0, ((int) cVarB1.getLong(iM13)) != 0, ((int) cVarB1.getLong(iM14)) != 0, ((int) cVarB1.getLong(iM15)) != 0, ((int) cVarB1.getLong(iM16)) != 0, ((int) cVarB1.getLong(iM17)) != 0, ((int) cVarB1.getLong(iM18)) != 0, (int) cVarB1.getLong(iM19), (int) cVarB1.getLong(iM20), (int) cVarB1.getLong(iM21), (int) cVarB1.getLong(iM22), (int) cVarB1.getLong(iM23), (int) cVarB1.getLong(iM24), cVarB1.B0(iM25), cVarB1.B0(iM26), cVarB1.B0(iM27), (int) cVarB1.getLong(iM28), cVarB1.getLong(iM29), cVarB1.getLong(iM30), ((int) cVarB1.getLong(iM31)) != 0);
            } else {
                learnProgressEntity = null;
            }
            return learnProgressEntity;
        } finally {
            cVarB1.close();
        }
    }

    private final Object k(Object obj) throws Exception {
        String str = this.f2987b;
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("SELECT * FROM lesson_test_progress WHERE id =? LIMIT 1");
        try {
            cVarB1.b0(1, str);
            return cVarB1.r1() ? new LessonTestProgressEntity(cVarB1.B0(com.bumptech.glide.g.m(cVarB1, "id")), cVarB1.B0(com.bumptech.glide.g.m(cVarB1, EHjhWcesDUIsIw.AmXo)), cVarB1.B0(com.bumptech.glide.g.m(cVarB1, "redo_progress")), cVarB1.B0(com.bumptech.glide.g.m(cVarB1, "practice_listening_progress")), cVarB1.B0(com.bumptech.glide.g.m(cVarB1, "practice_speaking_progress")), cVarB1.B0(com.bumptech.glide.g.m(cVarB1, "practice_spelling_progress")), cVarB1.B0(com.bumptech.glide.g.m(cVarB1, "practice_comprehensive_progress"))) : null;
        } finally {
            cVarB1.close();
        }
    }

    private final Object q(Object obj) throws Exception {
        UnitFinishStatusEntity unitFinishStatusEntity;
        String str = this.f2987b;
        ja.a _connection = (ja.a) obj;
        kotlin.jvm.internal.m.f(_connection, "_connection");
        ja.c cVarB1 = _connection.B1("SELECT * FROM unit_finish_status WHERE id =? LIMIT 1");
        try {
            cVarB1.b0(1, str);
            int iM = com.bumptech.glide.g.m(cVarB1, "id");
            int iM2 = com.bumptech.glide.g.m(cVarB1, "lan");
            int iM3 = com.bumptech.glide.g.m(cVarB1, "cur_enter_lesson_index");
            int iM4 = com.bumptech.glide.g.m(cVarB1, "story_reading");
            int iM5 = com.bumptech.glide.g.m(cVarB1, xItStCyvVEZ.ZRnjtruYntEK);
            int iM6 = com.bumptech.glide.g.m(cVarB1, "tips_reading");
            int iM7 = com.bumptech.glide.g.m(cVarB1, "dialog_warm_up");
            int iM8 = com.bumptech.glide.g.m(cVarB1, "dialog_practice");
            int iM9 = com.bumptech.glide.g.m(cVarB1, "dialog_speaking");
            int iM10 = com.bumptech.glide.g.m(cVarB1, "time");
            int iM11 = com.bumptech.glide.g.m(cVarB1, "pending_update");
            if (cVarB1.r1()) {
                unitFinishStatusEntity = new UnitFinishStatusEntity(cVarB1.B0(iM), cVarB1.B0(iM2), (int) cVarB1.getLong(iM3), ((int) cVarB1.getLong(iM4)) != 0, ((int) cVarB1.getLong(iM5)) != 0, ((int) cVarB1.getLong(iM6)) != 0, ((int) cVarB1.getLong(iM7)) != 0, ((int) cVarB1.getLong(iM8)) != 0, ((int) cVarB1.getLong(iM9)) != 0, cVarB1.getLong(iM10), ((int) cVarB1.getLong(iM11)) != 0);
            } else {
                unitFinishStatusEntity = null;
            }
            return unitFinishStatusEntity;
        } finally {
            cVarB1.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fz.c
    public final Object invoke(Object obj) throws Exception {
        BookmarkFolderEntity bookmarkFolderEntity;
        DailyStreakHistoryEntity dailyStreakHistoryEntity;
        DauMetricsEntity dauMetricsEntity;
        DbFileVersionEntity dbFileVersionEntity;
        DbFileVersionEntity dbFileVersionEntity2;
        KnowledgeNoteEntity knowledgeNoteEntity;
        switch (this.f2986a) {
            case 0:
                String str = this.f2987b;
                ja.a _connection = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection, "_connection");
                ja.c cVarB1 = _connection.B1("SELECT * FROM bookmark WHERE id =? LIMIT 1");
                try {
                    cVarB1.b0(1, str);
                    int iM = com.bumptech.glide.g.m(cVarB1, "id");
                    int iM2 = com.bumptech.glide.g.m(cVarB1, "lan");
                    int iM3 = com.bumptech.glide.g.m(cVarB1, "is_fav");
                    int iM4 = com.bumptech.glide.g.m(cVarB1, "content_type");
                    int iM5 = com.bumptech.glide.g.m(cVarB1, "time");
                    int iM6 = com.bumptech.glide.g.m(cVarB1, "folder_id");
                    Object bookmarkEntity = null;
                    if (cVarB1.r1()) {
                        bookmarkEntity = new BookmarkEntity(cVarB1.B0(iM), cVarB1.B0(iM2), (int) cVarB1.getLong(iM3), cVarB1.B0(iM4), cVarB1.getLong(iM5), cVarB1.isNull(iM6) ? null : cVarB1.B0(iM6));
                    }
                    return bookmarkEntity;
                } finally {
                    cVarB1.close();
                }
            case 1:
                String str2 = this.f2987b;
                ja.a _connection2 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection2, "_connection");
                ja.c cVarB2 = _connection2.B1("SELECT * FROM bookmark WHERE lan = ?");
                try {
                    cVarB2.b0(1, str2);
                    int iM7 = com.bumptech.glide.g.m(cVarB2, "id");
                    int iM8 = com.bumptech.glide.g.m(cVarB2, "lan");
                    int iM9 = com.bumptech.glide.g.m(cVarB2, "is_fav");
                    int iM10 = com.bumptech.glide.g.m(cVarB2, "content_type");
                    int iM11 = com.bumptech.glide.g.m(cVarB2, "time");
                    int iM12 = com.bumptech.glide.g.m(cVarB2, "folder_id");
                    ArrayList arrayList = new ArrayList();
                    while (cVarB2.r1()) {
                        arrayList.add(new BookmarkEntity(cVarB2.B0(iM7), cVarB2.B0(iM8), (int) cVarB2.getLong(iM9), cVarB2.B0(iM10), cVarB2.getLong(iM11), cVarB2.isNull(iM12) ? null : cVarB2.B0(iM12)));
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarB2.close();
                }
            case 2:
                String str3 = this.f2987b;
                ja.a _connection3 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection3, "_connection");
                ja.c cVarB3 = _connection3.B1("SELECT * FROM bookmark_folder WHERE lan = ?");
                try {
                    cVarB3.b0(1, str3);
                    int iM13 = com.bumptech.glide.g.m(cVarB3, "id");
                    int iM14 = com.bumptech.glide.g.m(cVarB3, "lan");
                    int iM15 = com.bumptech.glide.g.m(cVarB3, "content_type");
                    int iM16 = com.bumptech.glide.g.m(cVarB3, "name");
                    int iM17 = com.bumptech.glide.g.m(cVarB3, "server_id");
                    int iM18 = com.bumptech.glide.g.m(cVarB3, "is_deleted");
                    int iM19 = com.bumptech.glide.g.m(cVarB3, "time");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarB3.r1()) {
                        int i11 = iM14;
                        arrayList2.add(new BookmarkFolderEntity(cVarB3.B0(iM13), cVarB3.B0(iM14), cVarB3.B0(iM15), cVarB3.B0(iM16), (int) cVarB3.getLong(iM17), ((int) cVarB3.getLong(iM18)) != 0, cVarB3.getLong(iM19)));
                        iM14 = i11;
                    }
                    cVarB3.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    cVarB3.close();
                    throw th2;
                }
            case 3:
                String str4 = this.f2987b;
                ja.a _connection4 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection4, "_connection");
                ja.c cVarB4 = _connection4.B1("SELECT * FROM bookmark_folder WHERE id = ? LIMIT 1");
                try {
                    cVarB4.b0(1, str4);
                    int iM20 = com.bumptech.glide.g.m(cVarB4, "id");
                    int iM21 = com.bumptech.glide.g.m(cVarB4, "lan");
                    int iM22 = com.bumptech.glide.g.m(cVarB4, "content_type");
                    int iM23 = com.bumptech.glide.g.m(cVarB4, "name");
                    int iM24 = com.bumptech.glide.g.m(cVarB4, "server_id");
                    int iM25 = com.bumptech.glide.g.m(cVarB4, "is_deleted");
                    int iM26 = com.bumptech.glide.g.m(cVarB4, "time");
                    if (cVarB4.r1()) {
                        bookmarkFolderEntity = new BookmarkFolderEntity(cVarB4.B0(iM20), cVarB4.B0(iM21), cVarB4.B0(iM22), cVarB4.B0(iM23), (int) cVarB4.getLong(iM24), ((int) cVarB4.getLong(iM25)) != 0, cVarB4.getLong(iM26));
                        break;
                    } else {
                        bookmarkFolderEntity = null;
                    }
                    return bookmarkFolderEntity;
                } finally {
                    cVarB4.close();
                }
            case 4:
                String str5 = this.f2987b;
                ja.a _connection5 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection5, "_connection");
                ja.c cVarB5 = _connection5.B1("SELECT * FROM CharacterStroke WHERE Character = ?");
                try {
                    cVarB5.b0(1, str5);
                    int iM27 = com.bumptech.glide.g.m(cVarB5, "CharId");
                    int iM28 = com.bumptech.glide.g.m(cVarB5, HwCharacterDao.TABLENAME);
                    int iM29 = com.bumptech.glide.g.m(cVarB5, "Zhuyin");
                    int iM30 = com.bumptech.glide.g.m(cVarB5, "Pinyin");
                    int iM31 = com.bumptech.glide.g.m(cVarB5, "Luoma");
                    int iM32 = com.bumptech.glide.g.m(cVarB5, "StrokeData");
                    int iM33 = com.bumptech.glide.g.m(cVarB5, "Version");
                    int iM34 = com.bumptech.glide.g.m(cVarB5, "TranCHN");
                    int iM35 = com.bumptech.glide.g.m(cVarB5, scqhIrGXy.lgBpze);
                    int iM36 = com.bumptech.glide.g.m(cVarB5, "TranJPN");
                    int iM37 = com.bumptech.glide.g.m(cVarB5, "TranKRN");
                    int iM38 = com.bumptech.glide.g.m(cVarB5, "TranENG");
                    int iM39 = com.bumptech.glide.g.m(cVarB5, "TranSPN");
                    int iM40 = com.bumptech.glide.g.m(cVarB5, "TranFRN");
                    int iM41 = com.bumptech.glide.g.m(cVarB5, "TranDEN");
                    int iM42 = com.bumptech.glide.g.m(cVarB5, "TranITN");
                    int iM43 = com.bumptech.glide.g.m(cVarB5, "TranPTG");
                    int iM44 = com.bumptech.glide.g.m(cVarB5, "TranVTN");
                    int iM45 = com.bumptech.glide.g.m(cVarB5, "TranRUS");
                    int iM46 = com.bumptech.glide.g.m(cVarB5, "TranTUR");
                    int iM47 = com.bumptech.glide.g.m(cVarB5, "TranIDN");
                    int iM48 = com.bumptech.glide.g.m(cVarB5, "TranARA");
                    int iM49 = com.bumptech.glide.g.m(cVarB5, "TranPOL");
                    int iM50 = com.bumptech.glide.g.m(cVarB5, "TranTHAI");
                    int iM51 = com.bumptech.glide.g.m(cVarB5, "TranHINDI");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarB5.r1()) {
                        long j11 = cVarB5.getLong(iM27);
                        String strB0 = null;
                        zt.a aVarJ = re.g0.j(cVarB5.isNull(iM28) ? null : cVarB5.B0(iM28));
                        zt.a aVarJ2 = re.g0.j(cVarB5.isNull(iM29) ? null : cVarB5.B0(iM29));
                        zt.a aVarJ3 = re.g0.j(cVarB5.isNull(iM30) ? null : cVarB5.B0(iM30));
                        zt.a aVarJ4 = re.g0.j(cVarB5.isNull(iM31) ? null : cVarB5.B0(iM31));
                        zt.a aVarJ5 = re.g0.j(cVarB5.isNull(iM32) ? null : cVarB5.B0(iM32));
                        Integer numValueOf = cVarB5.isNull(iM33) ? null : Integer.valueOf((int) cVarB5.getLong(iM33));
                        zt.a aVarJ6 = re.g0.j(cVarB5.isNull(iM34) ? null : cVarB5.B0(iM34));
                        zt.a aVarJ7 = re.g0.j(cVarB5.isNull(iM35) ? null : cVarB5.B0(iM35));
                        zt.a aVarJ8 = re.g0.j(cVarB5.isNull(iM36) ? null : cVarB5.B0(iM36));
                        zt.a aVarJ9 = re.g0.j(cVarB5.isNull(iM37) ? null : cVarB5.B0(iM37));
                        zt.a aVarJ10 = re.g0.j(cVarB5.isNull(iM38) ? null : cVarB5.B0(iM38));
                        zt.a aVarJ11 = re.g0.j(cVarB5.isNull(iM39) ? null : cVarB5.B0(iM39));
                        zt.a aVarJ12 = re.g0.j(cVarB5.isNull(iM40) ? null : cVarB5.B0(iM40));
                        int i12 = iM41;
                        zt.a aVarJ13 = re.g0.j(cVarB5.isNull(i12) ? null : cVarB5.B0(i12));
                        int i13 = iM42;
                        zt.a aVarJ14 = re.g0.j(cVarB5.isNull(i13) ? null : cVarB5.B0(i13));
                        int i14 = iM27;
                        int i15 = iM43;
                        zt.a aVarJ15 = re.g0.j(cVarB5.isNull(i15) ? null : cVarB5.B0(i15));
                        iM43 = i15;
                        int i16 = iM44;
                        zt.a aVarJ16 = re.g0.j(cVarB5.isNull(i16) ? null : cVarB5.B0(i16));
                        iM44 = i16;
                        int i17 = iM45;
                        zt.a aVarJ17 = re.g0.j(cVarB5.isNull(i17) ? null : cVarB5.B0(i17));
                        iM45 = i17;
                        int i18 = iM46;
                        zt.a aVarJ18 = re.g0.j(cVarB5.isNull(i18) ? null : cVarB5.B0(i18));
                        iM46 = i18;
                        int i19 = iM47;
                        zt.a aVarJ19 = re.g0.j(cVarB5.isNull(i19) ? null : cVarB5.B0(i19));
                        iM47 = i19;
                        int i21 = iM48;
                        zt.a aVarJ20 = re.g0.j(cVarB5.isNull(i21) ? null : cVarB5.B0(i21));
                        iM48 = i21;
                        int i22 = iM49;
                        zt.a aVarJ21 = re.g0.j(cVarB5.isNull(i22) ? null : cVarB5.B0(i22));
                        iM49 = i22;
                        int i23 = iM50;
                        zt.a aVarJ22 = re.g0.j(cVarB5.isNull(i23) ? null : cVarB5.B0(i23));
                        iM50 = i23;
                        int i24 = iM51;
                        if (!cVarB5.isNull(i24)) {
                            strB0 = cVarB5.B0(i24);
                        }
                        iM51 = i24;
                        arrayList3.add(new CharacterStrokeEntity(j11, aVarJ, aVarJ2, aVarJ3, aVarJ4, aVarJ5, numValueOf, aVarJ6, aVarJ7, aVarJ8, aVarJ9, aVarJ10, aVarJ11, aVarJ12, aVarJ13, aVarJ14, aVarJ15, aVarJ16, aVarJ17, aVarJ18, aVarJ19, aVarJ20, aVarJ21, aVarJ22, re.g0.j(strB0)));
                        iM27 = i14;
                        iM41 = i12;
                        iM42 = i13;
                        iM28 = iM28;
                        iM29 = iM29;
                        break;
                    }
                    return arrayList3;
                } finally {
                    cVarB5.close();
                }
            case 5:
                String str6 = this.f2987b;
                ja.a _connection6 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection6, "_connection");
                ja.c cVarB6 = _connection6.B1("SELECT * FROM daily_streak_history WHERE id =? LIMIT 1");
                try {
                    cVarB6.b0(1, str6);
                    int iM52 = com.bumptech.glide.g.m(cVarB6, "id");
                    int iM53 = com.bumptech.glide.g.m(cVarB6, "type");
                    int iM54 = com.bumptech.glide.g.m(cVarB6, "pending_type");
                    if (cVarB6.r1()) {
                        dailyStreakHistoryEntity = new DailyStreakHistoryEntity(cVarB6.B0(iM52), cVarB6.B0(iM53), cVarB6.B0(iM54));
                        break;
                    } else {
                        dailyStreakHistoryEntity = null;
                    }
                    return dailyStreakHistoryEntity;
                } finally {
                    cVarB6.close();
                }
            case 6:
                String str7 = this.f2987b;
                ja.a _connection7 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection7, "_connection");
                ja.c cVarB7 = _connection7.B1("SELECT * FROM dau_metrics WHERE id =? LIMIT 1");
                boolean z11 = true;
                try {
                    cVarB7.b0(1, str7);
                    int iM55 = com.bumptech.glide.g.m(cVarB7, "id");
                    int iM56 = com.bumptech.glide.g.m(cVarB7, "finishLessonType");
                    int iM57 = com.bumptech.glide.g.m(cVarB7, "pending_update");
                    int iM58 = com.bumptech.glide.g.m(cVarB7, "pending_update_finish_lesson_type");
                    if (cVarB7.r1()) {
                        String strB1 = cVarB7.B0(iM55);
                        int i25 = (int) cVarB7.getLong(iM56);
                        boolean z12 = ((int) cVarB7.getLong(iM57)) != 0;
                        if (((int) cVarB7.getLong(iM58)) == 0) {
                            z11 = false;
                        }
                        dauMetricsEntity = new DauMetricsEntity(strB1, i25, z12, z11);
                        break;
                    } else {
                        dauMetricsEntity = null;
                    }
                    return dauMetricsEntity;
                } finally {
                    cVarB7.close();
                }
            case 7:
                String str8 = this.f2987b;
                ja.a _connection8 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection8, "_connection");
                ja.c cVarB8 = _connection8.B1("SELECT * FROM db_file_version WHERE file_name =? LIMIT 1");
                boolean z13 = true;
                try {
                    cVarB8.b0(1, str8);
                    int iM59 = com.bumptech.glide.g.m(cVarB8, "file_name");
                    int iM60 = com.bumptech.glide.g.m(cVarB8, "last_update_time");
                    int iM61 = com.bumptech.glide.g.m(cVarB8, "need_update");
                    if (cVarB8.r1()) {
                        String strB2 = cVarB8.B0(iM59);
                        long j12 = cVarB8.getLong(iM60);
                        if (((int) cVarB8.getLong(iM61)) == 0) {
                            z13 = false;
                        }
                        dbFileVersionEntity = new DbFileVersionEntity(strB2, j12, z13);
                        break;
                    } else {
                        dbFileVersionEntity = null;
                    }
                    return dbFileVersionEntity;
                } finally {
                    cVarB8.close();
                }
            case 8:
                String str9 = this.f2987b;
                ja.a _connection9 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection9, "_connection");
                ja.c cVarB9 = _connection9.B1("SELECT * FROM db_file_version WHERE file_name =? LIMIT 1");
                boolean z14 = true;
                try {
                    cVarB9.b0(1, str9);
                    int iM62 = com.bumptech.glide.g.m(cVarB9, "file_name");
                    int iM63 = com.bumptech.glide.g.m(cVarB9, "last_update_time");
                    int iM64 = com.bumptech.glide.g.m(cVarB9, "need_update");
                    if (cVarB9.r1()) {
                        String strB3 = cVarB9.B0(iM62);
                        long j13 = cVarB9.getLong(iM63);
                        if (((int) cVarB9.getLong(iM64)) == 0) {
                            z14 = false;
                        }
                        dbFileVersionEntity2 = new DbFileVersionEntity(strB3, j13, z14);
                        break;
                    } else {
                        dbFileVersionEntity2 = null;
                    }
                    return dbFileVersionEntity2;
                } finally {
                    cVarB9.close();
                }
            case 9:
                String str10 = this.f2987b;
                ja.a _connection10 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection10, "_connection");
                ja.c cVarB10 = _connection10.B1("SELECT * FROM knowledge_note WHERE id = ? AND is_deleted = 0 LIMIT 1");
                try {
                    cVarB10.b0(1, str10);
                    int iM65 = com.bumptech.glide.g.m(cVarB10, "id");
                    int iM66 = com.bumptech.glide.g.m(cVarB10, "lan");
                    int iM67 = com.bumptech.glide.g.m(cVarB10, "value");
                    int iM68 = com.bumptech.glide.g.m(cVarB10, "elem_id");
                    int iM69 = com.bumptech.glide.g.m(cVarB10, "note");
                    int iM70 = com.bumptech.glide.g.m(cVarB10, "updated_at");
                    int iM71 = com.bumptech.glide.g.m(cVarB10, "is_deleted");
                    int iM72 = com.bumptech.glide.g.m(cVarB10, "pending_update");
                    if (cVarB10.r1()) {
                        knowledgeNoteEntity = new KnowledgeNoteEntity(cVarB10.B0(iM65), cVarB10.B0(iM66), cVarB10.B0(iM67), cVarB10.getLong(iM68), cVarB10.B0(iM69), cVarB10.getLong(iM70), ((int) cVarB10.getLong(iM71)) != 0, ((int) cVarB10.getLong(iM72)) != 0);
                        break;
                    } else {
                        knowledgeNoteEntity = null;
                    }
                    return knowledgeNoteEntity;
                } finally {
                    cVarB10.close();
                }
            case 10:
                String str11 = this.f2987b;
                ja.a _connection11 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection11, "_connection");
                ja.c cVarB11 = _connection11.B1("SELECT * FROM knowledge_note WHERE lan = ? AND is_deleted = 0 ORDER BY updated_at DESC");
                boolean z15 = true;
                try {
                    cVarB11.b0(1, str11);
                    int iM73 = com.bumptech.glide.g.m(cVarB11, "id");
                    int iM74 = com.bumptech.glide.g.m(cVarB11, "lan");
                    int iM75 = com.bumptech.glide.g.m(cVarB11, "value");
                    int iM76 = com.bumptech.glide.g.m(cVarB11, "elem_id");
                    int iM77 = com.bumptech.glide.g.m(cVarB11, "note");
                    int iM78 = com.bumptech.glide.g.m(cVarB11, "updated_at");
                    int iM79 = com.bumptech.glide.g.m(cVarB11, "is_deleted");
                    int iM80 = com.bumptech.glide.g.m(cVarB11, "pending_update");
                    ArrayList arrayList4 = new ArrayList();
                    while (cVarB11.r1()) {
                        int i26 = iM74;
                        arrayList4.add(new KnowledgeNoteEntity(cVarB11.B0(iM73), cVarB11.B0(iM74), cVarB11.B0(iM75), cVarB11.getLong(iM76), cVarB11.B0(iM77), cVarB11.getLong(iM78), ((int) cVarB11.getLong(iM79)) != 0 ? z15 : false, ((int) cVarB11.getLong(iM80)) != 0));
                        iM74 = i26;
                        z15 = true;
                    }
                    cVarB11.close();
                    return arrayList4;
                } catch (Throwable th3) {
                    cVarB11.close();
                    throw th3;
                }
            case 11:
                String str12 = this.f2987b;
                ja.a _connection12 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection12, "_connection");
                ja.c cVarB12 = _connection12.B1("SELECT * FROM knowledge_note WHERE lan = ? AND pending_update = 1 ORDER BY updated_at ASC");
                boolean z16 = true;
                try {
                    cVarB12.b0(1, str12);
                    int iM81 = com.bumptech.glide.g.m(cVarB12, "id");
                    int iM82 = com.bumptech.glide.g.m(cVarB12, "lan");
                    int iM83 = com.bumptech.glide.g.m(cVarB12, "value");
                    int iM84 = com.bumptech.glide.g.m(cVarB12, "elem_id");
                    int iM85 = com.bumptech.glide.g.m(cVarB12, "note");
                    int iM86 = com.bumptech.glide.g.m(cVarB12, "updated_at");
                    int iM87 = com.bumptech.glide.g.m(cVarB12, "is_deleted");
                    int iM88 = com.bumptech.glide.g.m(cVarB12, "pending_update");
                    ArrayList arrayList5 = new ArrayList();
                    while (cVarB12.r1()) {
                        int i27 = iM82;
                        arrayList5.add(new KnowledgeNoteEntity(cVarB12.B0(iM81), cVarB12.B0(iM82), cVarB12.B0(iM83), cVarB12.getLong(iM84), cVarB12.B0(iM85), cVarB12.getLong(iM86), ((int) cVarB12.getLong(iM87)) != 0 ? z16 : false, ((int) cVarB12.getLong(iM88)) != 0));
                        iM82 = i27;
                        z16 = true;
                    }
                    cVarB12.close();
                    return arrayList5;
                } catch (Throwable th4) {
                    cVarB12.close();
                    throw th4;
                }
            case 12:
                return a(obj);
            case 13:
                return c(obj);
            case 14:
                return d(obj);
            case 15:
                return e(obj);
            case 16:
                return h(obj);
            case 17:
                return j(obj);
            case 18:
                return k(obj);
            case 19:
                return l(obj);
            case 20:
                return m(obj);
            case 21:
                return n(obj);
            case 22:
                return o(obj);
            case 23:
                return p(obj);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return q(obj);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return r(obj);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return s(obj);
            case 27:
                return t(obj);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return u(obj);
            default:
                return UserInfo.copy$default((UserInfo) obj, null, 0, 0, 0, 0, 0, 0L, 0, 0L, this.f2987b, null, null, null, null, BuildConfig.VERSION_NAME, null, null, 0, 0, 0, 0, 0, 0, null, null, 33537535, null);
        }
    }
}
