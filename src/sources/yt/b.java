package yt;

import a.ar.MFeWs;
import androidx.drawerlayout.widget.ktFt.FpIL;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import ca.i;
import ca.l;
import cf.x;
import com.bumptech.glide.f;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.lingo.lingoskill.object.HwCharacterDao;
import com.lingo.lingoskill.object.LessonDao;
import com.lingo.lingoskill.object.LevelDao;
import com.lingo.lingoskill.object.Model_Word_010Dao;
import com.lingo.lingoskill.object.UnitDao;
import com.lingo.lingoskill.object.WordDao;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.lingodeer.database.CharacterStrokeDatabase_Impl;
import com.lingodeer.database.ChineseToneDatabase_Impl;
import com.lingodeer.database.UserDataDatabase_Impl;
import dl.ExOZ.xItStCyvVEZ;
import ef.o;
import fb.g0;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import ko.Zea.ealNNtLp;
import kotlin.jvm.internal.m;
import lt.AJC.PQgum;
import mf.sOm.txBUGYhC;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import w9.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends v5.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f58351d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f58352e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CharacterStrokeDatabase_Impl characterStrokeDatabase_Impl) {
        super(1, "daa17b5ecf28aeacc2b0ef74b691ac1c", "90225c55672beb881c73e44be240841a");
        this.f58352e = characterStrokeDatabase_Impl;
    }

    private final o h(ja.a connection) {
        m.f(connection, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new i(1, 1, "id", "TEXT", null, true));
        linkedHashMap.put("total_xp", new i(0, 1, "total_xp", "INTEGER", null, true));
        linkedHashMap.put("total_time", new i(0, 1, "total_time", "INTEGER", null, true));
        linkedHashMap.put("total_gems", new i(0, 1, "total_gems", "INTEGER", null, true));
        linkedHashMap.put("streak_freezer", new i(0, 1, "streak_freezer", "INTEGER", null, true));
        linkedHashMap.put("streak_saver", new i(0, 1, "streak_saver", "INTEGER", null, true));
        linkedHashMap.put("leaderboard_week_xp", new i(0, 1, "leaderboard_week_xp", "INTEGER", null, true));
        linkedHashMap.put("leaderboard_emoji_status", new i(0, 1, "leaderboard_emoji_status", "INTEGER", null, true));
        linkedHashMap.put("leaderboard_learned_time", new i(0, 1, "leaderboard_learned_time", "INTEGER", null, true));
        linkedHashMap.put("skill_mastery", new i(0, 1, "skill_mastery", "TEXT", null, true));
        linkedHashMap.put("achievement_top_student", new i(0, 1, "achievement_top_student", "TEXT", null, true));
        linkedHashMap.put("achievement_xp_expert", new i(0, 1, "achievement_xp_expert", "TEXT", null, true));
        linkedHashMap.put("achievement_streak_hero", new i(0, 1, "achievement_streak_hero", "TEXT", null, true));
        linkedHashMap.put("achievement_leaderboard", new i(0, 1, "achievement_leaderboard", "TEXT", null, true));
        linkedHashMap.put("achievement_languages", new i(0, 1, "achievement_languages", "TEXT", null, true));
        linkedHashMap.put("all_followings", new i(0, 1, "all_followings", "TEXT", null, true));
        linkedHashMap.put("all_followers", new i(0, 1, "all_followers", "TEXT", null, true));
        l lVar = new l("user_info", linkedHashMap, w4.c.n(linkedHashMap, "animated_emojis", new i(0, 1, "animated_emojis", "TEXT", null, true)), new LinkedHashSet());
        l lVarX = g0.x(connection, "user_info");
        if (!lVar.equals(lVarX)) {
            return new o(2, ep.a.d("user_info(com.lingodeer.database.model.UserInfoEntity).\n Expected:\n", lVar, "\n Found:\n", lVarX), false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("lan", new i(1, 1, "lan", "TEXT", null, true));
        linkedHashMap2.put("main", new i(0, 1, "main", "TEXT", null, true));
        linkedHashMap2.put("main_tt", new i(0, 1, "main_tt", "TEXT", null, true));
        linkedHashMap2.put("lesson_exam", new i(0, 1, "lesson_exam", "TEXT", null, true));
        linkedHashMap2.put("lesson_stars", new i(0, 1, "lesson_stars", "TEXT", null, true));
        linkedHashMap2.put("audio_lesson", new i(0, 1, "audio_lesson", "TEXT", null, true));
        linkedHashMap2.put("pronun", new i(0, 1, "pronun", "INTEGER", null, true));
        linkedHashMap2.put("current_entered_unit_id", new i(0, 1, "current_entered_unit_id", "INTEGER", null, true));
        linkedHashMap2.put("flash_card_practice_count", new i(0, 1, "flash_card_practice_count", "INTEGER", null, true));
        linkedHashMap2.put("flash_card_display_in", new i(0, 1, "flash_card_display_in", "INTEGER", null, true));
        linkedHashMap2.put("flash_card_focus_unit", new i(0, 1, "flash_card_focus_unit", "TEXT", null, true));
        linkedHashMap2.put("flash_card_is_learn_char", new i(0, 1, "flash_card_is_learn_char", "INTEGER", null, true));
        linkedHashMap2.put("flash_card_is_learn_word", new i(0, 1, "flash_card_is_learn_word", "INTEGER", null, true));
        linkedHashMap2.put("flash_card_is_learn_sent", new i(0, 1, "flash_card_is_learn_sent", "INTEGER", null, true));
        linkedHashMap2.put("flash_card_focus_new", new i(0, 1, "flash_card_focus_new", "INTEGER", null, true));
        linkedHashMap2.put("flash_card_focus_weak", new i(0, 1, "flash_card_focus_weak", "INTEGER", null, true));
        linkedHashMap2.put("flash_card_focus_good", new i(0, 1, "flash_card_focus_good", "INTEGER", null, true));
        linkedHashMap2.put("flash_card_focus_perfect", new i(0, 1, "flash_card_focus_perfect", "INTEGER", null, true));
        linkedHashMap2.put("review_filter_method_char", new i(0, 1, "review_filter_method_char", "INTEGER", null, true));
        linkedHashMap2.put("review_filter_method_word", new i(0, 1, "review_filter_method_word", "INTEGER", null, true));
        linkedHashMap2.put("review_filter_method_sent", new i(0, 1, "review_filter_method_sent", "INTEGER", null, true));
        linkedHashMap2.put("review_practice_model_char", new i(0, 1, "review_practice_model_char", "INTEGER", null, true));
        linkedHashMap2.put("review_practice_model_word", new i(0, 1, "review_practice_model_word", "INTEGER", null, true));
        linkedHashMap2.put("review_practice_model_sent", new i(0, 1, "review_practice_model_sent", "INTEGER", null, true));
        linkedHashMap2.put("review_select_record_char", new i(0, 1, "review_select_record_char", "TEXT", null, true));
        linkedHashMap2.put("review_select_record_word", new i(0, 1, "review_select_record_word", "TEXT", null, true));
        linkedHashMap2.put("review_select_record_sent", new i(0, 1, "review_select_record_sent", "TEXT", null, true));
        linkedHashMap2.put("ack_enter_pos", new i(0, 1, "ack_enter_pos", "INTEGER", null, true));
        linkedHashMap2.put("ack_unit_id", new i(0, 1, "ack_unit_id", "INTEGER", null, true));
        linkedHashMap2.put("restart_timestamp", new i(0, 1, "restart_timestamp", "INTEGER", null, true));
        l lVar2 = new l("learn_progress", linkedHashMap2, w4.c.n(linkedHashMap2, "pending_update", new i(0, 1, "pending_update", "INTEGER", null, true)), new LinkedHashSet());
        l lVarX2 = g0.x(connection, "learn_progress");
        if (!lVar2.equals(lVarX2)) {
            return new o(2, ep.a.d(FpIL.vfpfJ, lVar2, "\n Found:\n", lVarX2), false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new i(1, 1, "id", "TEXT", null, true));
        linkedHashMap3.put("amount", new i(0, 1, "amount", "INTEGER", null, true));
        linkedHashMap3.put("base_xp", new i(0, 1, "base_xp", "INTEGER", null, true));
        l lVar3 = new l("daily_learn_history", linkedHashMap3, w4.c.n(linkedHashMap3, "pending_amount", new i(0, 1, "pending_amount", "INTEGER", null, true)), new LinkedHashSet());
        l lVarX3 = g0.x(connection, "daily_learn_history");
        if (!lVar3.equals(lVarX3)) {
            return new o(2, ep.a.d("daily_learn_history(com.lingodeer.database.model.DailyLearnHistoryEntity).\n Expected:\n", lVar3, "\n Found:\n", lVarX3), false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("id", new i(1, 1, "id", "TEXT", null, true));
        linkedHashMap4.put("type", new i(0, 1, "type", "TEXT", null, true));
        l lVar4 = new l("daily_streak_history", linkedHashMap4, w4.c.n(linkedHashMap4, "pending_type", new i(0, 1, "pending_type", "TEXT", null, true)), new LinkedHashSet());
        l lVarX4 = g0.x(connection, "daily_streak_history");
        if (!lVar4.equals(lVarX4)) {
            return new o(2, ep.a.d("daily_streak_history(com.lingodeer.database.model.DailyStreakHistoryEntity).\n Expected:\n", lVar4, "\n Found:\n", lVarX4), false);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("id", new i(1, 1, "id", "TEXT", null, true));
        linkedHashMap5.put("amount", new i(0, 1, "amount", "INTEGER", null, true));
        linkedHashMap5.put("type", new i(0, 1, "type", "TEXT", null, true));
        linkedHashMap5.put("pending_amount", new i(0, 1, "pending_amount", "INTEGER", null, true));
        l lVar5 = new l("daily_gem_history", linkedHashMap5, w4.c.n(linkedHashMap5, "description", new i(0, 1, "description", "TEXT", null, true)), new LinkedHashSet());
        l lVarX5 = g0.x(connection, "daily_gem_history");
        if (!lVar5.equals(lVarX5)) {
            return new o(2, ep.a.d(txBUGYhC.tYuiHdEbStEsODb, lVar5, "\n Found:\n", lVarX5), false);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("id", new i(1, 1, "id", "TEXT", null, true));
        linkedHashMap6.put("lan", new i(0, 1, "lan", "TEXT", null, true));
        linkedHashMap6.put("practice_listening", new i(0, 1, "practice_listening", "INTEGER", null, true));
        linkedHashMap6.put("practice_speaking", new i(0, 1, "practice_speaking", "INTEGER", null, true));
        linkedHashMap6.put("practice_spelling", new i(0, 1, "practice_spelling", "INTEGER", null, true));
        linkedHashMap6.put("practice_comprehensive", new i(0, 1, "practice_comprehensive", "INTEGER", null, true));
        i iVar = new i(0, 1, "time", "INTEGER", null, true);
        String str = MzwEyWCkjXL.pAFbUSqHDsFhHfj;
        linkedHashMap6.put(str, iVar);
        l lVar6 = new l("lesson_finish_status", linkedHashMap6, w4.c.n(linkedHashMap6, "pending_update", new i(0, 1, "pending_update", "INTEGER", null, true)), new LinkedHashSet());
        l lVarX6 = g0.x(connection, "lesson_finish_status");
        if (!lVar6.equals(lVarX6)) {
            return new o(2, ep.a.d("lesson_finish_status(com.lingodeer.database.model.LessonFinishStatusEntity).\n Expected:\n", lVar6, "\n Found:\n", lVarX6), false);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("uid", new i(1, 1, "uid", "TEXT", null, true));
        linkedHashMap7.put("nick_name", new i(0, 1, "nick_name", "TEXT", null, true));
        linkedHashMap7.put("email", new i(0, 1, "email", "TEXT", null, true));
        linkedHashMap7.put("account_type", new i(0, 1, "account_type", "TEXT", null, true));
        linkedHashMap7.put("is_member", new i(0, 1, "is_member", "INTEGER", null, true));
        linkedHashMap7.put("learning_lan", new i(0, 1, "learning_lan", "INTEGER", null, true));
        linkedHashMap7.put("ui_lan", new i(0, 1, "ui_lan", "INTEGER", null, true));
        l lVar7 = new l("login_history", linkedHashMap7, w4.c.n(linkedHashMap7, "last_logout_time", new i(0, 1, "last_logout_time", "INTEGER", null, true)), new LinkedHashSet());
        l lVarX7 = g0.x(connection, "login_history");
        if (!lVar7.equals(lVarX7)) {
            return new o(2, ep.a.d("login_history(com.lingodeer.database.model.LoginHistoryEntity).\n Expected:\n", lVar7, "\n Found:\n", lVarX7), false);
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put("id", new i(1, 1, "id", "TEXT", null, true));
        linkedHashMap8.put("unit_id", new i(0, 1, "unit_id", "INTEGER", null, true));
        linkedHashMap8.put("item_id", new i(0, 1, "item_id", "INTEGER", null, true));
        linkedHashMap8.put("elem_type", new i(0, 1, "elem_type", "INTEGER", null, true));
        linkedHashMap8.put("last_study_time", new i(0, 1, "last_study_time", "INTEGER", null, true));
        l lVar8 = new l("review_status", linkedHashMap8, w4.c.n(linkedHashMap8, "status", new i(0, 1, "status", OYAvlbfUyD.qLsTBPw, null, true)), new LinkedHashSet());
        l lVarX8 = g0.x(connection, "review_status");
        if (!lVar8.equals(lVarX8)) {
            return new o(2, ep.a.d("review_status(com.lingodeer.database.model.ReviewStatusEntity).\n Expected:\n", lVar8, "\n Found:\n", lVarX8), false);
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        linkedHashMap9.put("order_id", new i(1, 1, "order_id", "TEXT", null, true));
        linkedHashMap9.put("web_order_line_item_id", new i(0, 1, "web_order_line_item_id", "TEXT", null, true));
        linkedHashMap9.put("transaction_id", new i(0, 1, "transaction_id", "TEXT", null, true));
        linkedHashMap9.put("product_id", new i(0, 1, "product_id", "TEXT", null, true));
        linkedHashMap9.put("purchase_type", new i(0, 1, "purchase_type", "TEXT", null, true));
        linkedHashMap9.put("purchase_from", new i(0, 1, "purchase_from", "TEXT", null, true));
        linkedHashMap9.put("expired_date", new i(0, 1, "expired_date", "TEXT", null, true));
        l lVar9 = new l("billing_status", linkedHashMap9, w4.c.n(linkedHashMap9, "expired_date_ms", new i(0, 1, "expired_date_ms", "TEXT", null, true)), new LinkedHashSet());
        l lVarX9 = g0.x(connection, "billing_status");
        if (!lVar9.equals(lVarX9)) {
            return new o(2, ep.a.d("billing_status(com.lingodeer.database.model.BillingStatusEntity).\n Expected:\n", lVar9, "\n Found:\n", lVarX9), false);
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        linkedHashMap10.put("id", new i(1, 1, "id", "TEXT", null, true));
        linkedHashMap10.put("lan", new i(0, 1, "lan", "TEXT", null, true));
        linkedHashMap10.put(scqhIrGXy.byCovVSxl, new i(0, 1, FpIL.ONNBq, "INTEGER", null, true));
        linkedHashMap10.put("story_reading", new i(0, 1, "story_reading", "INTEGER", null, true));
        linkedHashMap10.put("story_speaking", new i(0, 1, "story_speaking", "INTEGER", null, true));
        linkedHashMap10.put("tips_reading", new i(0, 1, "tips_reading", "INTEGER", null, true));
        linkedHashMap10.put("dialog_warm_up", new i(0, 1, "dialog_warm_up", "INTEGER", null, true));
        linkedHashMap10.put("dialog_practice", new i(0, 1, "dialog_practice", "INTEGER", null, true));
        linkedHashMap10.put("dialog_speaking", new i(0, 1, "dialog_speaking", "INTEGER", null, true));
        linkedHashMap10.put(str, new i(0, 1, "time", "INTEGER", null, true));
        l lVar10 = new l("unit_finish_status", linkedHashMap10, w4.c.n(linkedHashMap10, "pending_update", new i(0, 1, "pending_update", "INTEGER", null, true)), new LinkedHashSet());
        l lVarX10 = g0.x(connection, "unit_finish_status");
        if (!lVar10.equals(lVarX10)) {
            return new o(2, ep.a.d("unit_finish_status(com.lingodeer.database.model.UnitFinishStatusEntity).\n Expected:\n", lVar10, "\n Found:\n", lVarX10), false);
        }
        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
        linkedHashMap11.put("id", new i(1, 1, "id", "TEXT", null, true));
        linkedHashMap11.put("cn", new i(0, 1, "cn", "INTEGER", null, true));
        linkedHashMap11.put("jp", new i(0, 1, "jp", "INTEGER", null, true));
        linkedHashMap11.put("kr", new i(0, 1, "kr", "INTEGER", null, true));
        linkedHashMap11.put("en", new i(0, 1, "en", "INTEGER", null, true));
        linkedHashMap11.put("es", new i(0, 1, "es", "INTEGER", null, true));
        linkedHashMap11.put("de", new i(0, 1, "de", "INTEGER", null, true));
        linkedHashMap11.put("fr", new i(0, 1, "fr", "INTEGER", null, true));
        linkedHashMap11.put("pt", new i(0, 1, "pt", "INTEGER", null, true));
        linkedHashMap11.put("vi", new i(0, 1, "vi", "INTEGER", null, true));
        linkedHashMap11.put("ru", new i(0, 1, "ru", "INTEGER", null, true));
        linkedHashMap11.put("tch", new i(0, 1, "tch", "INTEGER", null, true));
        linkedHashMap11.put("idn", new i(0, 1, "idn", "INTEGER", null, true));
        linkedHashMap11.put("pol", new i(0, 1, "pol", "INTEGER", null, true));
        linkedHashMap11.put("it", new i(0, 1, "it", "INTEGER", null, true));
        l lVar11 = new l("language_trans_version", linkedHashMap11, w4.c.n(linkedHashMap11, "tur", new i(0, 1, "tur", "INTEGER", null, true)), new LinkedHashSet());
        l lVarX11 = g0.x(connection, "language_trans_version");
        if (!lVar11.equals(lVarX11)) {
            return new o(2, ep.a.d("language_trans_version(com.lingodeer.database.model.LanguageTransVersionEntity).\n Expected:\n", lVar11, "\n Found:\n", lVarX11), false);
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        linkedHashMap12.put("id", new i(1, 1, "id", "TEXT", null, true));
        linkedHashMap12.put("lan", new i(0, 1, "lan", "TEXT", null, true));
        linkedHashMap12.put("is_fav", new i(0, 1, "is_fav", "INTEGER", null, true));
        linkedHashMap12.put("content_type", new i(0, 1, "content_type", "TEXT", null, true));
        linkedHashMap12.put(str, new i(0, 1, "time", "INTEGER", null, true));
        l lVar12 = new l("bookmark", linkedHashMap12, w4.c.n(linkedHashMap12, "folder_id", new i(0, 1, "folder_id", "TEXT", null, false)), new LinkedHashSet());
        l lVarX12 = g0.x(connection, "bookmark");
        if (!lVar12.equals(lVarX12)) {
            return new o(2, ep.a.d("bookmark(com.lingodeer.database.model.BookmarkEntity).\n Expected:\n", lVar12, "\n Found:\n", lVarX12), false);
        }
        LinkedHashMap linkedHashMap13 = new LinkedHashMap();
        linkedHashMap13.put("uid", new i(1, 1, "uid", "TEXT", null, true));
        linkedHashMap13.put("nickname", new i(0, 1, "nickname", "TEXT", null, true));
        linkedHashMap13.put("image", new i(0, 1, "image", "TEXT", null, true));
        l lVar13 = new l("user_follower", linkedHashMap13, w4.c.n(linkedHashMap13, "joined", new i(0, 1, "joined", "TEXT", null, true)), new LinkedHashSet());
        l lVarX13 = g0.x(connection, "user_follower");
        if (!lVar13.equals(lVarX13)) {
            return new o(2, ep.a.d("user_follower(com.lingodeer.database.model.UserFollowerEntity).\n Expected:\n", lVar13, "\n Found:\n", lVarX13), false);
        }
        LinkedHashMap linkedHashMap14 = new LinkedHashMap();
        linkedHashMap14.put("uid", new i(1, 1, "uid", "TEXT", null, true));
        linkedHashMap14.put("nickname", new i(0, 1, "nickname", "TEXT", null, true));
        linkedHashMap14.put("image", new i(0, 1, "image", "TEXT", null, true));
        l lVar14 = new l("user_following", linkedHashMap14, w4.c.n(linkedHashMap14, "joined", new i(0, 1, "joined", "TEXT", null, true)), new LinkedHashSet());
        l lVarX14 = g0.x(connection, "user_following");
        if (!lVar14.equals(lVarX14)) {
            return new o(2, ep.a.d("user_following(com.lingodeer.database.model.UserFollowingEntity).\n Expected:\n", lVar14, "\n Found:\n", lVarX14), false);
        }
        LinkedHashMap linkedHashMap15 = new LinkedHashMap();
        linkedHashMap15.put("id", new i(1, 1, "id", "TEXT", null, true));
        linkedHashMap15.put("finishLessonType", new i(0, 1, "finishLessonType", "INTEGER", null, true));
        linkedHashMap15.put("pending_update", new i(0, 1, "pending_update", "INTEGER", null, true));
        LinkedHashSet linkedHashSetN = w4.c.n(linkedHashMap15, "pending_update_finish_lesson_type", new i(0, 1, "pending_update_finish_lesson_type", "INTEGER", null, true));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str2 = kHfjNGauVgdF.ZPfAX;
        l lVar15 = new l(str2, linkedHashMap15, linkedHashSetN, linkedHashSet);
        l lVarX15 = g0.x(connection, str2);
        if (!lVar15.equals(lVarX15)) {
            return new o(2, ep.a.d("dau_metrics(com.lingodeer.database.model.DauMetricsEntity).\n Expected:\n", lVar15, "\n Found:\n", lVarX15), false);
        }
        LinkedHashMap linkedHashMap16 = new LinkedHashMap();
        linkedHashMap16.put("file_name", new i(1, 1, "file_name", "TEXT", null, true));
        linkedHashMap16.put("last_update_time", new i(0, 1, "last_update_time", "INTEGER", null, true));
        l lVar16 = new l("db_file_version", linkedHashMap16, w4.c.n(linkedHashMap16, "need_update", new i(0, 1, "need_update", "INTEGER", null, true)), new LinkedHashSet());
        l lVarX16 = g0.x(connection, "db_file_version");
        if (!lVar16.equals(lVarX16)) {
            return new o(2, ep.a.d("db_file_version(com.lingodeer.database.model.DbFileVersionEntity).\n Expected:\n", lVar16, "\n Found:\n", lVarX16), false);
        }
        LinkedHashMap linkedHashMap17 = new LinkedHashMap();
        linkedHashMap17.put("id", new i(1, 1, "id", "TEXT", null, true));
        linkedHashMap17.put("learn_progress", new i(0, 1, "learn_progress", "TEXT", null, true));
        linkedHashMap17.put("redo_progress", new i(0, 1, "redo_progress", "TEXT", null, true));
        linkedHashMap17.put("practice_listening_progress", new i(0, 1, "practice_listening_progress", "TEXT", null, true));
        linkedHashMap17.put(PQgum.BIfkxtiNbpk, new i(0, 1, "practice_speaking_progress", "TEXT", null, true));
        linkedHashMap17.put("practice_spelling_progress", new i(0, 1, "practice_spelling_progress", "TEXT", null, true));
        l lVar17 = new l("lesson_test_progress", linkedHashMap17, w4.c.n(linkedHashMap17, "practice_comprehensive_progress", new i(0, 1, "practice_comprehensive_progress", "TEXT", null, true)), new LinkedHashSet());
        l lVarX17 = g0.x(connection, "lesson_test_progress");
        if (!lVar17.equals(lVarX17)) {
            return new o(2, ep.a.d("lesson_test_progress(com.lingodeer.database.model.LessonTestProgressEntity).\n Expected:\n", lVar17, "\n Found:\n", lVarX17), false);
        }
        LinkedHashMap linkedHashMap18 = new LinkedHashMap();
        linkedHashMap18.put("id", new i(1, 1, "id", "TEXT", null, true));
        linkedHashMap18.put("seconds", new i(0, 1, "seconds", "INTEGER", null, true));
        linkedHashMap18.put("base_time", new i(0, 1, "base_time", "INTEGER", null, true));
        l lVar18 = new l("daily_learn_time_history", linkedHashMap18, w4.c.n(linkedHashMap18, "pending_seconds", new i(0, 1, "pending_seconds", "INTEGER", null, true)), new LinkedHashSet());
        l lVarX18 = g0.x(connection, "daily_learn_time_history");
        if (!lVar18.equals(lVarX18)) {
            return new o(2, ep.a.d("daily_learn_time_history(com.lingodeer.database.model.DailyLearnTimeHistoryEntity).\n Expected:\n", lVar18, "\n Found:\n", lVarX18), false);
        }
        LinkedHashMap linkedHashMap19 = new LinkedHashMap();
        linkedHashMap19.put("id", new i(1, 1, "id", "TEXT", null, true));
        linkedHashMap19.put("unit_id", new i(0, 1, "unit_id", "INTEGER", null, true));
        linkedHashMap19.put("elem_id", new i(0, 1, "elem_id", "INTEGER", null, true));
        linkedHashMap19.put("elem_type", new i(0, 1, "elem_type", "INTEGER", null, true));
        linkedHashMap19.put("lan", new i(0, 1, "lan", "TEXT", null, true));
        linkedHashMap19.put("type", new i(0, 1, "type", "TEXT", null, true));
        linkedHashMap19.put("last_study_time", new i(0, 1, "last_study_time", "INTEGER", null, true));
        linkedHashMap19.put("last_study_status", new i(0, 1, "last_study_status", "INTEGER", null, true));
        linkedHashMap19.put("is_reviewed", new i(0, 1, "is_reviewed", "INTEGER", null, true));
        linkedHashMap19.put("status", new i(0, 1, "status", "INTEGER", null, true));
        linkedHashMap19.put("last_review_time", new i(0, 1, "last_review_time", "INTEGER", null, true));
        linkedHashMap19.put("next_review_time", new i(0, 1, "next_review_time", "INTEGER", null, true));
        linkedHashMap19.put("interval", new i(0, 1, "interval", "INTEGER", null, true));
        linkedHashMap19.put("ease_factor", new i(0, 1, "ease_factor", "REAL", null, true));
        linkedHashMap19.put("learning_step", new i(0, 1, "learning_step", "INTEGER", null, true));
        linkedHashMap19.put("lapses", new i(0, 1, "lapses", "INTEGER", null, true));
        linkedHashMap19.put("so_easy_count", new i(0, 1, "so_easy_count", "INTEGER", null, true));
        linkedHashMap19.put("last_high_so_easy_count", new i(0, 1, "last_high_so_easy_count", "INTEGER", null, true));
        linkedHashMap19.put("last_modifier_time", new i(0, 1, "last_modifier_time", MzwEyWCkjXL.WJixmdcXmB, null, true));
        linkedHashMap19.put("pending_update", new i(0, 1, "pending_update", "INTEGER", null, true));
        l lVar19 = new l("srs_status", linkedHashMap19, w4.c.n(linkedHashMap19, "is_excluded_from_review", new i(0, 1, "is_excluded_from_review", "INTEGER", null, true)), new LinkedHashSet());
        l lVarX19 = g0.x(connection, "srs_status");
        if (!lVar19.equals(lVarX19)) {
            return new o(2, ep.a.d("srs_status(com.lingodeer.database.model.SRSStatusEntity).\n Expected:\n", lVar19, "\n Found:\n", lVarX19), false);
        }
        LinkedHashMap linkedHashMap20 = new LinkedHashMap();
        linkedHashMap20.put("id", new i(1, 1, "id", "TEXT", null, true));
        l lVar20 = new l("last_sync_time", linkedHashMap20, w4.c.n(linkedHashMap20, "last_sync_time", new i(0, 1, "last_sync_time", "INTEGER", null, true)), new LinkedHashSet());
        l lVarX20 = g0.x(connection, "last_sync_time");
        if (!lVar20.equals(lVarX20)) {
            return new o(2, ep.a.d("last_sync_time(com.lingodeer.database.model.LastSyncTimeEntity).\n Expected:\n", lVar20, "\n Found:\n", lVarX20), false);
        }
        LinkedHashMap linkedHashMap21 = new LinkedHashMap();
        linkedHashMap21.put("id", new i(1, 1, "id", FpIL.woVwUsSykLVKt, null, true));
        linkedHashMap21.put("status", new i(0, 1, "status", "TEXT", null, true));
        l lVar21 = new l("sub_learn_progress", linkedHashMap21, w4.c.n(linkedHashMap21, str, new i(0, 1, "time", "INTEGER", null, true)), new LinkedHashSet());
        l lVarX21 = g0.x(connection, "sub_learn_progress");
        if (!lVar21.equals(lVarX21)) {
            return new o(2, ep.a.d("sub_learn_progress(com.lingodeer.database.model.SubLearnProgressEntity).\n Expected:\n", lVar21, "\n Found:\n", lVarX21), false);
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap();
        linkedHashMap22.put("id", new i(1, 1, "id", "TEXT", null, true));
        linkedHashMap22.put("lesson_id", new i(0, 1, "lesson_id", "INTEGER", null, true));
        l lVar22 = new l("chinese_tone_last_visited", linkedHashMap22, w4.c.n(linkedHashMap22, str, new i(0, 1, "time", "INTEGER", null, true)), new LinkedHashSet());
        l lVarX22 = g0.x(connection, "chinese_tone_last_visited");
        if (!lVar22.equals(lVarX22)) {
            return new o(2, ep.a.d("chinese_tone_last_visited(com.lingodeer.database.model.ChineseToneLastVisitedEntity).\n Expected:\n", lVar22, "\n Found:\n", lVarX22), false);
        }
        LinkedHashMap linkedHashMap23 = new LinkedHashMap();
        linkedHashMap23.put("id", new i(1, 1, "id", "TEXT", null, true));
        linkedHashMap23.put("keyLanguage", new i(0, 1, "keyLanguage", "INTEGER", null, true));
        linkedHashMap23.put("locate", new i(0, 1, "locate", "INTEGER", null, true));
        linkedHashMap23.put("title", new i(0, 1, "title", "TEXT", null, true));
        linkedHashMap23.put("description", new i(0, 1, "description", "TEXT", null, true));
        l lVar23 = new l("language_history", linkedHashMap23, w4.c.n(linkedHashMap23, "lastSelectedTime", new i(0, 1, "lastSelectedTime", "INTEGER", null, true)), new LinkedHashSet());
        l lVarX23 = g0.x(connection, "language_history");
        if (!lVar23.equals(lVarX23)) {
            return new o(2, ep.a.d("language_history(com.lingodeer.database.model.LanguageHistoryEntity).\n Expected:\n", lVar23, "\n Found:\n", lVarX23), false);
        }
        LinkedHashMap linkedHashMap24 = new LinkedHashMap();
        linkedHashMap24.put("id", new i(1, 1, "id", "TEXT", null, true));
        linkedHashMap24.put("lan", new i(0, 1, "lan", "TEXT", null, true));
        linkedHashMap24.put("content_type", new i(0, 1, "content_type", "TEXT", null, true));
        linkedHashMap24.put("name", new i(0, 1, "name", "TEXT", null, true));
        linkedHashMap24.put("server_id", new i(0, 1, "server_id", "INTEGER", null, true));
        linkedHashMap24.put("is_deleted", new i(0, 1, "is_deleted", "INTEGER", null, true));
        l lVar24 = new l("bookmark_folder", linkedHashMap24, w4.c.n(linkedHashMap24, str, new i(0, 1, xItStCyvVEZ.QjxefSrEOyAG, "INTEGER", null, true)), new LinkedHashSet());
        l lVarX24 = g0.x(connection, "bookmark_folder");
        if (!lVar24.equals(lVarX24)) {
            return new o(2, ep.a.d("bookmark_folder(com.lingodeer.database.model.BookmarkFolderEntity).\n Expected:\n", lVar24, "\n Found:\n", lVarX24), false);
        }
        LinkedHashMap linkedHashMap25 = new LinkedHashMap();
        linkedHashMap25.put("id", new i(1, 1, "id", "TEXT", null, true));
        linkedHashMap25.put("lan", new i(0, 1, "lan", "TEXT", null, true));
        linkedHashMap25.put("value", new i(0, 1, "value", "TEXT", null, true));
        linkedHashMap25.put("elem_id", new i(0, 1, "elem_id", "INTEGER", null, true));
        linkedHashMap25.put("note", new i(0, 1, "note", "TEXT", null, true));
        linkedHashMap25.put("updated_at", new i(0, 1, "updated_at", "INTEGER", null, true));
        linkedHashMap25.put("is_deleted", new i(0, 1, "is_deleted", "INTEGER", null, true));
        l lVar25 = new l("knowledge_note", linkedHashMap25, w4.c.n(linkedHashMap25, "pending_update", new i(0, 1, "pending_update", "INTEGER", null, true)), new LinkedHashSet());
        l lVarX25 = g0.x(connection, "knowledge_note");
        return !lVar25.equals(lVarX25) ? new o(2, ep.a.d("knowledge_note(com.lingodeer.database.model.KnowledgeNoteEntity).\n Expected:\n", lVar25, "\n Found:\n", lVarX25), false) : new o(2, null, true);
    }

    @Override // v5.e
    public final void a(ja.a connection) {
        switch (this.f58351d) {
            case 0:
                m.f(connection, "connection");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `CharacterStroke` (`CharId` INTEGER NOT NULL, `Character` TEXT, `Zhuyin` TEXT, `Pinyin` TEXT, `Luoma` TEXT, `StrokeData` TEXT, `Version` INTEGER, `TranCHN` TEXT, `TranTCHN` TEXT, `TranJPN` TEXT, `TranKRN` TEXT, `TranENG` TEXT, `TranSPN` TEXT, `TranFRN` TEXT, `TranDEN` TEXT, `TranITN` TEXT, `TranPTG` TEXT, `TranVTN` TEXT, `TranRUS` TEXT, `TranTUR` TEXT, `TranIDN` TEXT, `TranARA` TEXT, `TranPOL` TEXT, `TranTHAI` TEXT, `TranHINDI` TEXT, PRIMARY KEY(`CharId`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `CharacterStrokeGroup` (`GroupId` INTEGER NOT NULL, `GroupIndex` INTEGER NOT NULL, `GroupName` TEXT, `GroupList` TEXT, `TGroupName` TEXT, `TGroupList` TEXT, PRIMARY KEY(`GroupId`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                f.o(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'daa17b5ecf28aeacc2b0ef74b691ac1c')");
                break;
            case 1:
                m.f(connection, "connection");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `Level` (`LevelId` INTEGER NOT NULL, `LevelName` TEXT, `UnitList` TEXT, PRIMARY KEY(`LevelId`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `Unit` (`UnitId` INTEGER NOT NULL, `UnitName` TEXT, `Description` TEXT, `LessonList` TEXT, `SortIndex` INTEGER NOT NULL, `LevelId` INTEGER NOT NULL, `iconResSuffix` TEXT, PRIMARY KEY(`UnitId`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `Lesson` (`LessonId` INTEGER NOT NULL, `LessonName` TEXT, `Description` TEXT, `TDescription` TEXT, `WordList` TEXT, `SentenceList` TEXT, `CharacterList` TEXT, `RepeatRegex` TEXT, `LastRegex` TEXT, `NormalRegex` TEXT, `ChallengeRegex` TEXT, `LevelId` INTEGER NOT NULL, `UnitId` INTEGER NOT NULL, `SortIndex` INTEGER NOT NULL, PRIMARY KEY(`LessonId`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `ToneWord` (`WordId` INTEGER NOT NULL, `Word` TEXT, `Character` TEXT, `ShengMu` TEXT, `YunMu` TEXT, `QingSheng` TEXT, `ShengDiao` TEXT, `Audio` TEXT, `Type` TEXT, PRIMARY KEY(`WordId`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `Model_Word_010` (`Id` INTEGER NOT NULL, `WordId` INTEGER NOT NULL, `ImageOptions` TEXT, `Answer` TEXT, PRIMARY KEY(`Id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `Model_Word_020` (`Id` INTEGER NOT NULL, `WordId` INTEGER NOT NULL, `Options` TEXT, `Answer` TEXT, PRIMARY KEY(`Id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                f.o(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e21dda4e160fe0f0bb4a8887d0996a77')");
                break;
            default:
                m.f(connection, "connection");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `user_info` (`id` TEXT NOT NULL, `total_xp` INTEGER NOT NULL, `total_time` INTEGER NOT NULL, `total_gems` INTEGER NOT NULL, `streak_freezer` INTEGER NOT NULL, `streak_saver` INTEGER NOT NULL, `leaderboard_week_xp` INTEGER NOT NULL, `leaderboard_emoji_status` INTEGER NOT NULL, `leaderboard_learned_time` INTEGER NOT NULL, `skill_mastery` TEXT NOT NULL, `achievement_top_student` TEXT NOT NULL, `achievement_xp_expert` TEXT NOT NULL, `achievement_streak_hero` TEXT NOT NULL, `achievement_leaderboard` TEXT NOT NULL, `achievement_languages` TEXT NOT NULL, `all_followings` TEXT NOT NULL, `all_followers` TEXT NOT NULL, `animated_emojis` TEXT NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `learn_progress` (`lan` TEXT NOT NULL, `main` TEXT NOT NULL, `main_tt` TEXT NOT NULL, `lesson_exam` TEXT NOT NULL, `lesson_stars` TEXT NOT NULL, `audio_lesson` TEXT NOT NULL, `pronun` INTEGER NOT NULL, `current_entered_unit_id` INTEGER NOT NULL, `flash_card_practice_count` INTEGER NOT NULL, `flash_card_display_in` INTEGER NOT NULL, `flash_card_focus_unit` TEXT NOT NULL, `flash_card_is_learn_char` INTEGER NOT NULL, `flash_card_is_learn_word` INTEGER NOT NULL, `flash_card_is_learn_sent` INTEGER NOT NULL, `flash_card_focus_new` INTEGER NOT NULL, `flash_card_focus_weak` INTEGER NOT NULL, `flash_card_focus_good` INTEGER NOT NULL, `flash_card_focus_perfect` INTEGER NOT NULL, `review_filter_method_char` INTEGER NOT NULL, `review_filter_method_word` INTEGER NOT NULL, `review_filter_method_sent` INTEGER NOT NULL, `review_practice_model_char` INTEGER NOT NULL, `review_practice_model_word` INTEGER NOT NULL, `review_practice_model_sent` INTEGER NOT NULL, `review_select_record_char` TEXT NOT NULL, `review_select_record_word` TEXT NOT NULL, `review_select_record_sent` TEXT NOT NULL, `ack_enter_pos` INTEGER NOT NULL, `ack_unit_id` INTEGER NOT NULL, `restart_timestamp` INTEGER NOT NULL, `pending_update` INTEGER NOT NULL, PRIMARY KEY(`lan`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `daily_learn_history` (`id` TEXT NOT NULL, `amount` INTEGER NOT NULL, `base_xp` INTEGER NOT NULL, `pending_amount` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `daily_streak_history` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `pending_type` TEXT NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `daily_gem_history` (`id` TEXT NOT NULL, `amount` INTEGER NOT NULL, `type` TEXT NOT NULL, `pending_amount` INTEGER NOT NULL, `description` TEXT NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `lesson_finish_status` (`id` TEXT NOT NULL, `lan` TEXT NOT NULL, `practice_listening` INTEGER NOT NULL, `practice_speaking` INTEGER NOT NULL, `practice_spelling` INTEGER NOT NULL, `practice_comprehensive` INTEGER NOT NULL, `time` INTEGER NOT NULL, `pending_update` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `login_history` (`uid` TEXT NOT NULL, `nick_name` TEXT NOT NULL, `email` TEXT NOT NULL, `account_type` TEXT NOT NULL, `is_member` INTEGER NOT NULL, `learning_lan` INTEGER NOT NULL, `ui_lan` INTEGER NOT NULL, `last_logout_time` INTEGER NOT NULL, PRIMARY KEY(`uid`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `review_status` (`id` TEXT NOT NULL, `unit_id` INTEGER NOT NULL, `item_id` INTEGER NOT NULL, `elem_type` INTEGER NOT NULL, `last_study_time` INTEGER NOT NULL, `status` TEXT NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `billing_status` (`order_id` TEXT NOT NULL, `web_order_line_item_id` TEXT NOT NULL, `transaction_id` TEXT NOT NULL, `product_id` TEXT NOT NULL, `purchase_type` TEXT NOT NULL, `purchase_from` TEXT NOT NULL, `expired_date` TEXT NOT NULL, `expired_date_ms` TEXT NOT NULL, PRIMARY KEY(`order_id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `unit_finish_status` (`id` TEXT NOT NULL, `lan` TEXT NOT NULL, `cur_enter_lesson_index` INTEGER NOT NULL, `story_reading` INTEGER NOT NULL, `story_speaking` INTEGER NOT NULL, `tips_reading` INTEGER NOT NULL, `dialog_warm_up` INTEGER NOT NULL, `dialog_practice` INTEGER NOT NULL, `dialog_speaking` INTEGER NOT NULL, `time` INTEGER NOT NULL, `pending_update` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `language_trans_version` (`id` TEXT NOT NULL, `cn` INTEGER NOT NULL, `jp` INTEGER NOT NULL, `kr` INTEGER NOT NULL, `en` INTEGER NOT NULL, `es` INTEGER NOT NULL, `de` INTEGER NOT NULL, `fr` INTEGER NOT NULL, `pt` INTEGER NOT NULL, `vi` INTEGER NOT NULL, `ru` INTEGER NOT NULL, `tch` INTEGER NOT NULL, `idn` INTEGER NOT NULL, `pol` INTEGER NOT NULL, `it` INTEGER NOT NULL, `tur` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `bookmark` (`id` TEXT NOT NULL, `lan` TEXT NOT NULL, `is_fav` INTEGER NOT NULL, `content_type` TEXT NOT NULL, `time` INTEGER NOT NULL, `folder_id` TEXT, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `user_follower` (`uid` TEXT NOT NULL, `nickname` TEXT NOT NULL, `image` TEXT NOT NULL, `joined` TEXT NOT NULL, PRIMARY KEY(`uid`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `user_following` (`uid` TEXT NOT NULL, `nickname` TEXT NOT NULL, `image` TEXT NOT NULL, `joined` TEXT NOT NULL, PRIMARY KEY(`uid`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `dau_metrics` (`id` TEXT NOT NULL, `finishLessonType` INTEGER NOT NULL, `pending_update` INTEGER NOT NULL, `pending_update_finish_lesson_type` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `db_file_version` (`file_name` TEXT NOT NULL, `last_update_time` INTEGER NOT NULL, `need_update` INTEGER NOT NULL, PRIMARY KEY(`file_name`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `lesson_test_progress` (`id` TEXT NOT NULL, `learn_progress` TEXT NOT NULL, `redo_progress` TEXT NOT NULL, `practice_listening_progress` TEXT NOT NULL, `practice_speaking_progress` TEXT NOT NULL, `practice_spelling_progress` TEXT NOT NULL, `practice_comprehensive_progress` TEXT NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `daily_learn_time_history` (`id` TEXT NOT NULL, `seconds` INTEGER NOT NULL, `base_time` INTEGER NOT NULL, `pending_seconds` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `srs_status` (`id` TEXT NOT NULL, `unit_id` INTEGER NOT NULL, `elem_id` INTEGER NOT NULL, `elem_type` INTEGER NOT NULL, `lan` TEXT NOT NULL, `type` TEXT NOT NULL, `last_study_time` INTEGER NOT NULL, `last_study_status` INTEGER NOT NULL, `is_reviewed` INTEGER NOT NULL, `status` INTEGER NOT NULL, `last_review_time` INTEGER NOT NULL, `next_review_time` INTEGER NOT NULL, `interval` INTEGER NOT NULL, `ease_factor` REAL NOT NULL, `learning_step` INTEGER NOT NULL, `lapses` INTEGER NOT NULL, `so_easy_count` INTEGER NOT NULL, `last_high_so_easy_count` INTEGER NOT NULL, `last_modifier_time` INTEGER NOT NULL, `pending_update` INTEGER NOT NULL, `is_excluded_from_review` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `last_sync_time` (`id` TEXT NOT NULL, `last_sync_time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `sub_learn_progress` (`id` TEXT NOT NULL, `status` TEXT NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `chinese_tone_last_visited` (`id` TEXT NOT NULL, `lesson_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `language_history` (`id` TEXT NOT NULL, `keyLanguage` INTEGER NOT NULL, `locate` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `lastSelectedTime` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `bookmark_folder` (`id` TEXT NOT NULL, `lan` TEXT NOT NULL, `content_type` TEXT NOT NULL, `name` TEXT NOT NULL, `server_id` INTEGER NOT NULL, `is_deleted` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS `knowledge_note` (`id` TEXT NOT NULL, `lan` TEXT NOT NULL, `value` TEXT NOT NULL, `elem_id` INTEGER NOT NULL, `note` TEXT NOT NULL, `updated_at` INTEGER NOT NULL, `is_deleted` INTEGER NOT NULL, `pending_update` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                f.o(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                f.o(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d316bf0da312ee7773eeb4c3a603a1f')");
                break;
        }
    }

    @Override // v5.e
    public final void b(ja.a connection) {
        switch (this.f58351d) {
            case 0:
                m.f(connection, "connection");
                f.o(connection, "DROP TABLE IF EXISTS `CharacterStroke`");
                f.o(connection, "DROP TABLE IF EXISTS `CharacterStrokeGroup`");
                break;
            case 1:
                m.f(connection, "connection");
                f.o(connection, "DROP TABLE IF EXISTS `Level`");
                f.o(connection, "DROP TABLE IF EXISTS `Unit`");
                f.o(connection, "DROP TABLE IF EXISTS `Lesson`");
                f.o(connection, "DROP TABLE IF EXISTS `ToneWord`");
                f.o(connection, "DROP TABLE IF EXISTS `Model_Word_010`");
                f.o(connection, "DROP TABLE IF EXISTS `Model_Word_020`");
                break;
            default:
                m.f(connection, "connection");
                f.o(connection, "DROP TABLE IF EXISTS `user_info`");
                f.o(connection, "DROP TABLE IF EXISTS `learn_progress`");
                f.o(connection, "DROP TABLE IF EXISTS `daily_learn_history`");
                f.o(connection, "DROP TABLE IF EXISTS `daily_streak_history`");
                f.o(connection, "DROP TABLE IF EXISTS `daily_gem_history`");
                f.o(connection, "DROP TABLE IF EXISTS `lesson_finish_status`");
                f.o(connection, "DROP TABLE IF EXISTS `login_history`");
                f.o(connection, "DROP TABLE IF EXISTS `review_status`");
                f.o(connection, "DROP TABLE IF EXISTS `billing_status`");
                f.o(connection, "DROP TABLE IF EXISTS `unit_finish_status`");
                f.o(connection, "DROP TABLE IF EXISTS `language_trans_version`");
                f.o(connection, "DROP TABLE IF EXISTS `bookmark`");
                f.o(connection, "DROP TABLE IF EXISTS `user_follower`");
                f.o(connection, "DROP TABLE IF EXISTS `user_following`");
                f.o(connection, "DROP TABLE IF EXISTS `dau_metrics`");
                f.o(connection, "DROP TABLE IF EXISTS `db_file_version`");
                f.o(connection, "DROP TABLE IF EXISTS `lesson_test_progress`");
                f.o(connection, "DROP TABLE IF EXISTS `daily_learn_time_history`");
                f.o(connection, "DROP TABLE IF EXISTS `srs_status`");
                f.o(connection, "DROP TABLE IF EXISTS `last_sync_time`");
                f.o(connection, "DROP TABLE IF EXISTS `sub_learn_progress`");
                f.o(connection, "DROP TABLE IF EXISTS `chinese_tone_last_visited`");
                f.o(connection, "DROP TABLE IF EXISTS `language_history`");
                f.o(connection, "DROP TABLE IF EXISTS `bookmark_folder`");
                f.o(connection, "DROP TABLE IF EXISTS `knowledge_note`");
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // v5.e
    public final void c(ja.a connection) {
        switch (this.f58351d) {
        }
        m.f(connection, "connection");
    }

    @Override // v5.e
    public final void d(ja.a connection) {
        int i11 = this.f58351d;
        s sVar = this.f58352e;
        m.f(connection, "connection");
        switch (i11) {
            case 0:
                int i12 = CharacterStrokeDatabase_Impl.f22330p;
                ((CharacterStrokeDatabase_Impl) sVar).t(connection);
                break;
            case 1:
                int i13 = ChineseToneDatabase_Impl.f22334t;
                ((ChineseToneDatabase_Impl) sVar).t(connection);
                break;
            default:
                ((UserDataDatabase_Impl) sVar).t(connection);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // v5.e
    public final void e(ja.a connection) {
        switch (this.f58351d) {
        }
        m.f(connection, "connection");
    }

    @Override // v5.e
    public final void f(ja.a connection) {
        switch (this.f58351d) {
            case 0:
                m.f(connection, "connection");
                x.g(connection);
                break;
            case 1:
                m.f(connection, "connection");
                x.g(connection);
                break;
            default:
                m.f(connection, "connection");
                x.g(connection);
                break;
        }
    }

    @Override // v5.e
    public final o g(ja.a connection) {
        switch (this.f58351d) {
            case 0:
                m.f(connection, "connection");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("CharId", new i(1, 1, "CharId", "INTEGER", null, true));
                linkedHashMap.put(HwCharacterDao.TABLENAME, new i(0, 1, HwCharacterDao.TABLENAME, "TEXT", null, false));
                linkedHashMap.put("Zhuyin", new i(0, 1, "Zhuyin", "TEXT", null, false));
                linkedHashMap.put("Pinyin", new i(0, 1, "Pinyin", "TEXT", null, false));
                linkedHashMap.put("Luoma", new i(0, 1, "Luoma", "TEXT", null, false));
                linkedHashMap.put("StrokeData", new i(0, 1, "StrokeData", "TEXT", null, false));
                linkedHashMap.put("Version", new i(0, 1, "Version", "INTEGER", null, false));
                linkedHashMap.put("TranCHN", new i(0, 1, "TranCHN", "TEXT", null, false));
                linkedHashMap.put("TranTCHN", new i(0, 1, "TranTCHN", "TEXT", null, false));
                linkedHashMap.put("TranJPN", new i(0, 1, "TranJPN", "TEXT", null, false));
                linkedHashMap.put("TranKRN", new i(0, 1, "TranKRN", "TEXT", null, false));
                linkedHashMap.put("TranENG", new i(0, 1, "TranENG", "TEXT", null, false));
                linkedHashMap.put("TranSPN", new i(0, 1, "TranSPN", "TEXT", null, false));
                linkedHashMap.put("TranFRN", new i(0, 1, "TranFRN", "TEXT", null, false));
                linkedHashMap.put("TranDEN", new i(0, 1, "TranDEN", "TEXT", null, false));
                linkedHashMap.put("TranITN", new i(0, 1, "TranITN", "TEXT", null, false));
                linkedHashMap.put("TranPTG", new i(0, 1, "TranPTG", "TEXT", null, false));
                linkedHashMap.put("TranVTN", new i(0, 1, "TranVTN", "TEXT", null, false));
                linkedHashMap.put("TranRUS", new i(0, 1, "TranRUS", "TEXT", null, false));
                linkedHashMap.put("TranTUR", new i(0, 1, "TranTUR", "TEXT", null, false));
                linkedHashMap.put("TranIDN", new i(0, 1, "TranIDN", "TEXT", null, false));
                linkedHashMap.put("TranARA", new i(0, 1, "TranARA", "TEXT", null, false));
                linkedHashMap.put("TranPOL", new i(0, 1, "TranPOL", "TEXT", null, false));
                linkedHashMap.put("TranTHAI", new i(0, 1, "TranTHAI", "TEXT", null, false));
                l lVar = new l("CharacterStroke", linkedHashMap, w4.c.n(linkedHashMap, "TranHINDI", new i(0, 1, "TranHINDI", "TEXT", null, false)), new LinkedHashSet());
                l lVarX = g0.x(connection, "CharacterStroke");
                if (!lVar.equals(lVarX)) {
                    return new o(2, ep.a.d("CharacterStroke(com.lingodeer.database.model.CharacterStrokeEntity).\n Expected:\n", lVar, "\n Found:\n", lVarX), false);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put(IMCc.QtmcNUJwwbeimKQ, new i(1, 1, "GroupId", "INTEGER", null, true));
                linkedHashMap2.put("GroupIndex", new i(0, 1, "GroupIndex", "INTEGER", null, true));
                linkedHashMap2.put("GroupName", new i(0, 1, "GroupName", "TEXT", null, false));
                linkedHashMap2.put("GroupList", new i(0, 1, "GroupList", "TEXT", null, false));
                linkedHashMap2.put("TGroupName", new i(0, 1, "TGroupName", "TEXT", null, false));
                l lVar2 = new l("CharacterStrokeGroup", linkedHashMap2, w4.c.n(linkedHashMap2, "TGroupList", new i(0, 1, "TGroupList", "TEXT", null, false)), new LinkedHashSet());
                l lVarX2 = g0.x(connection, "CharacterStrokeGroup");
                return !lVar2.equals(lVarX2) ? new o(2, ep.a.d("CharacterStrokeGroup(com.lingodeer.database.model.CharacterStrokeGroupEntity).\n Expected:\n", lVar2, "\n Found:\n", lVarX2), false) : new o(2, null, true);
            case 1:
                m.f(connection, "connection");
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("LevelId", new i(1, 1, "LevelId", "INTEGER", null, true));
                linkedHashMap3.put("LevelName", new i(0, 1, "LevelName", "TEXT", null, false));
                l lVar3 = new l(LevelDao.TABLENAME, linkedHashMap3, w4.c.n(linkedHashMap3, "UnitList", new i(0, 1, "UnitList", "TEXT", null, false)), new LinkedHashSet());
                l lVarX3 = g0.x(connection, LevelDao.TABLENAME);
                if (!lVar3.equals(lVarX3)) {
                    return new o(2, ep.a.d("Level(com.lingodeer.database.model.ChineseToneLevelEntity).\n Expected:\n", lVar3, "\n Found:\n", lVarX3), false);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                i iVar = new i(1, 1, "UnitId", "INTEGER", null, true);
                String str = ealNNtLp.lpWsGPl;
                linkedHashMap4.put(str, iVar);
                linkedHashMap4.put("UnitName", new i(0, 1, "UnitName", "TEXT", null, false));
                linkedHashMap4.put("Description", new i(0, 1, "Description", "TEXT", null, false));
                linkedHashMap4.put("LessonList", new i(0, 1, "LessonList", "TEXT", null, false));
                linkedHashMap4.put("SortIndex", new i(0, 1, "SortIndex", "INTEGER", null, true));
                linkedHashMap4.put("LevelId", new i(0, 1, "LevelId", "INTEGER", null, true));
                l lVar4 = new l(UnitDao.TABLENAME, linkedHashMap4, w4.c.n(linkedHashMap4, "iconResSuffix", new i(0, 1, "iconResSuffix", "TEXT", null, false)), new LinkedHashSet());
                l lVarX4 = g0.x(connection, UnitDao.TABLENAME);
                if (!lVar4.equals(lVarX4)) {
                    return new o(2, ep.a.d("Unit(com.lingodeer.database.model.ChineseToneUnitEntity).\n Expected:\n", lVar4, "\n Found:\n", lVarX4), false);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("LessonId", new i(1, 1, "LessonId", "INTEGER", null, true));
                linkedHashMap5.put("LessonName", new i(0, 1, "LessonName", "TEXT", null, false));
                linkedHashMap5.put("Description", new i(0, 1, "Description", "TEXT", null, false));
                linkedHashMap5.put("TDescription", new i(0, 1, "TDescription", "TEXT", null, false));
                linkedHashMap5.put("WordList", new i(0, 1, "WordList", "TEXT", null, false));
                linkedHashMap5.put("SentenceList", new i(0, 1, "SentenceList", "TEXT", null, false));
                linkedHashMap5.put("CharacterList", new i(0, 1, "CharacterList", "TEXT", null, false));
                linkedHashMap5.put("RepeatRegex", new i(0, 1, "RepeatRegex", "TEXT", null, false));
                linkedHashMap5.put("LastRegex", new i(0, 1, "LastRegex", "TEXT", null, false));
                linkedHashMap5.put("NormalRegex", new i(0, 1, "NormalRegex", "TEXT", null, false));
                linkedHashMap5.put("ChallengeRegex", new i(0, 1, "ChallengeRegex", "TEXT", null, false));
                linkedHashMap5.put("LevelId", new i(0, 1, "LevelId", "INTEGER", null, true));
                linkedHashMap5.put(str, new i(0, 1, "UnitId", "INTEGER", null, true));
                l lVar5 = new l(LessonDao.TABLENAME, linkedHashMap5, w4.c.n(linkedHashMap5, "SortIndex", new i(0, 1, "SortIndex", "INTEGER", null, true)), new LinkedHashSet());
                l lVarX5 = g0.x(connection, LessonDao.TABLENAME);
                if (!lVar5.equals(lVarX5)) {
                    return new o(2, ep.a.d("Lesson(com.lingodeer.database.model.ChineseToneLessonEntity).\n Expected:\n", lVar5, "\n Found:\n", lVarX5), false);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("WordId", new i(1, 1, "WordId", "INTEGER", null, true));
                linkedHashMap6.put(WordDao.TABLENAME, new i(0, 1, WordDao.TABLENAME, "TEXT", null, false));
                linkedHashMap6.put(HwCharacterDao.TABLENAME, new i(0, 1, HwCharacterDao.TABLENAME, "TEXT", null, false));
                linkedHashMap6.put("ShengMu", new i(0, 1, "ShengMu", "TEXT", null, false));
                linkedHashMap6.put("YunMu", new i(0, 1, "YunMu", "TEXT", null, false));
                linkedHashMap6.put("QingSheng", new i(0, 1, "QingSheng", "TEXT", null, false));
                linkedHashMap6.put("ShengDiao", new i(0, 1, "ShengDiao", "TEXT", null, false));
                linkedHashMap6.put("Audio", new i(0, 1, "Audio", "TEXT", null, false));
                l lVar6 = new l("ToneWord", linkedHashMap6, w4.c.n(linkedHashMap6, MFeWs.eveQ, new i(0, 1, "Type", "TEXT", null, false)), new LinkedHashSet());
                l lVarX6 = g0.x(connection, "ToneWord");
                if (!lVar6.equals(lVarX6)) {
                    return new o(2, ep.a.d("ToneWord(com.lingodeer.database.model.ChineseToneWordEntity).\n Expected:\n", lVar6, "\n Found:\n", lVarX6), false);
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("Id", new i(1, 1, "Id", "INTEGER", null, true));
                linkedHashMap7.put("WordId", new i(0, 1, "WordId", "INTEGER", null, true));
                linkedHashMap7.put("ImageOptions", new i(0, 1, "ImageOptions", "TEXT", null, false));
                l lVar7 = new l(Model_Word_010Dao.TABLENAME, linkedHashMap7, w4.c.n(linkedHashMap7, "Answer", new i(0, 1, "Answer", "TEXT", null, false)), new LinkedHashSet());
                l lVarX7 = g0.x(connection, Model_Word_010Dao.TABLENAME);
                if (!lVar7.equals(lVarX7)) {
                    return new o(2, ep.a.d("Model_Word_010(com.lingodeer.database.model.ChineseToneExercise010Entity).\n Expected:\n", lVar7, "\n Found:\n", lVarX7), false);
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                linkedHashMap8.put("Id", new i(1, 1, "Id", "INTEGER", null, true));
                linkedHashMap8.put("WordId", new i(0, 1, "WordId", "INTEGER", null, true));
                linkedHashMap8.put("Options", new i(0, 1, "Options", "TEXT", null, false));
                l lVar8 = new l("Model_Word_020", linkedHashMap8, w4.c.n(linkedHashMap8, "Answer", new i(0, 1, "Answer", "TEXT", null, false)), new LinkedHashSet());
                l lVarX8 = g0.x(connection, "Model_Word_020");
                return !lVar8.equals(lVarX8) ? new o(2, ep.a.d("Model_Word_020(com.lingodeer.database.model.ChineseToneExercise020Entity).\n Expected:\n", lVar8, "\n Found:\n", lVarX8), false) : new o(2, null, true);
            default:
                return h(connection);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ChineseToneDatabase_Impl chineseToneDatabase_Impl) {
        super(1, "e21dda4e160fe0f0bb4a8887d0996a77", "cb45c213423e48f32631edeb8b51b396");
        this.f58352e = chineseToneDatabase_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UserDataDatabase_Impl userDataDatabase_Impl) {
        super(17, ypOOxsaJG.BkCsswvxa, "f51455ec1864ab3ada7afe6d0983c4f5");
        this.f58352e = userDataDatabase_Impl;
    }
}
