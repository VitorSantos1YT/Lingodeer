package au;

import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.lingodeer.database.model.BillingStatusEntity;
import com.lingodeer.database.model.BookmarkEntity;
import com.lingodeer.database.model.BookmarkFolderEntity;
import com.lingodeer.database.model.ChineseToneLastVisitedEntity;
import com.lingodeer.database.model.DailyLearnHistoryEntity;
import com.lingodeer.database.model.DailyLearnTimeHistoryEntity;
import com.lingodeer.database.model.DailyStreakHistoryEntity;
import com.lingodeer.database.model.DauMetricsEntity;
import com.lingodeer.database.model.DbFileVersionEntity;
import com.lingodeer.database.model.KnowledgeNoteEntity;
import com.lingodeer.database.model.LanguageHistoryEntity;
import com.lingodeer.database.model.LanguageTransVersionEntity;
import com.lingodeer.database.model.LastSyncTimeEntity;
import com.lingodeer.database.model.LearnProgressEntity;
import com.lingodeer.database.model.LessonFinishStatusEntity;
import com.lingodeer.database.model.LessonTestProgressEntity;
import com.lingodeer.database.model.LoginHistoryEntity;
import com.lingodeer.database.model.ReviewStatusEntity;
import com.lingodeer.database.model.SRSStatusEntity;
import com.lingodeer.database.model.SubLearnProgressEntity;
import com.lingodeer.database.model.UnitFinishStatusEntity;
import fr.j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends j3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2959c;

    public /* synthetic */ c(int i11) {
        this.f2959c = i11;
    }

    @Override // fr.j3
    public final String o() {
        switch (this.f2959c) {
            case 0:
                return "INSERT OR REPLACE INTO `billing_status` (`order_id`,`web_order_line_item_id`,`transaction_id`,`product_id`,`purchase_type`,`purchase_from`,`expired_date`,`expired_date_ms`) VALUES (?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `bookmark` (`id`,`lan`,`is_fav`,`content_type`,`time`,`folder_id`) VALUES (?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `bookmark_folder` (`id`,`lan`,`content_type`,`name`,`server_id`,`is_deleted`,`time`) VALUES (?,?,?,?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `chinese_tone_last_visited` (`id`,`lesson_id`,`time`) VALUES (?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `daily_learn_history` (`id`,`amount`,`base_xp`,`pending_amount`) VALUES (?,?,?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `daily_learn_history` (`id`,`amount`,`base_xp`,`pending_amount`) VALUES (?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `daily_learn_time_history` (`id`,`seconds`,`base_time`,`pending_seconds`) VALUES (?,?,?,?)";
            case 7:
                return "INSERT OR IGNORE INTO `daily_learn_time_history` (`id`,`seconds`,`base_time`,`pending_seconds`) VALUES (?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `daily_streak_history` (`id`,`type`,`pending_type`) VALUES (?,?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `dau_metrics` (`id`,`finishLessonType`,`pending_update`,`pending_update_finish_lesson_type`) VALUES (?,?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `db_file_version` (`file_name`,`last_update_time`,`need_update`) VALUES (?,?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `knowledge_note` (`id`,`lan`,`value`,`elem_id`,`note`,`updated_at`,`is_deleted`,`pending_update`) VALUES (?,?,?,?,?,?,?,?)";
            case 12:
                return "INSERT OR REPLACE INTO `language_history` (`id`,`keyLanguage`,`locate`,`title`,`description`,`lastSelectedTime`) VALUES (?,?,?,?,?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `language_trans_version` (`id`,`cn`,`jp`,`kr`,`en`,`es`,`de`,`fr`,`pt`,`vi`,`ru`,`tch`,`idn`,`pol`,`it`,`tur`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 14:
                return "INSERT OR REPLACE INTO `last_sync_time` (`id`,`last_sync_time`) VALUES (?,?)";
            case 15:
                return "INSERT OR REPLACE INTO `learn_progress` (`lan`,`main`,`main_tt`,`lesson_exam`,`lesson_stars`,`audio_lesson`,`pronun`,`current_entered_unit_id`,`flash_card_practice_count`,`flash_card_display_in`,`flash_card_focus_unit`,`flash_card_is_learn_char`,`flash_card_is_learn_word`,`flash_card_is_learn_sent`,`flash_card_focus_new`,`flash_card_focus_weak`,`flash_card_focus_good`,`flash_card_focus_perfect`,`review_filter_method_char`,`review_filter_method_word`,`review_filter_method_sent`,`review_practice_model_char`,`review_practice_model_word`,`review_practice_model_sent`,`review_select_record_char`,`review_select_record_word`,`review_select_record_sent`,`ack_enter_pos`,`ack_unit_id`,`restart_timestamp`,`pending_update`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 16:
                return "INSERT OR REPLACE INTO `lesson_finish_status` (`id`,`lan`,`practice_listening`,`practice_speaking`,`practice_spelling`,`practice_comprehensive`,`time`,`pending_update`) VALUES (?,?,?,?,?,?,?,?)";
            case 17:
                return "INSERT OR REPLACE INTO `lesson_test_progress` (`id`,`learn_progress`,`redo_progress`,`practice_listening_progress`,`practice_speaking_progress`,`practice_spelling_progress`,`practice_comprehensive_progress`) VALUES (?,?,?,?,?,?,?)";
            case 18:
                return "INSERT OR REPLACE INTO `login_history` (`uid`,`nick_name`,`email`,`account_type`,`is_member`,`learning_lan`,`ui_lan`,`last_logout_time`) VALUES (?,?,?,?,?,?,?,?)";
            case 19:
                return "INSERT OR REPLACE INTO `review_status` (`id`,`unit_id`,`item_id`,`elem_type`,`last_study_time`,`status`) VALUES (?,?,?,?,?,?)";
            case 20:
                return "INSERT OR REPLACE INTO `srs_status` (`id`,`unit_id`,`elem_id`,`elem_type`,`lan`,`type`,`last_study_time`,`last_study_status`,`is_reviewed`,`status`,`last_review_time`,`next_review_time`,`interval`,`ease_factor`,`learning_step`,`lapses`,`so_easy_count`,`last_high_so_easy_count`,`last_modifier_time`,`pending_update`,`is_excluded_from_review`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 21:
                return "INSERT OR REPLACE INTO `sub_learn_progress` (`id`,`status`,`time`) VALUES (?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `unit_finish_status` (`id`,`lan`,`cur_enter_lesson_index`,`story_reading`,`story_speaking`,`tips_reading`,`dialog_warm_up`,`dialog_practice`,`dialog_speaking`,`time`,`pending_update`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    @Override // fr.j3
    public final void f(ja.c statement, Object obj) {
        switch (this.f2959c) {
            case 0:
                BillingStatusEntity entity = (BillingStatusEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity, "entity");
                statement.b0(1, entity.getOrderId());
                statement.b0(2, entity.getWebOrderLineItemId());
                statement.b0(3, entity.getTransactionId());
                statement.b0(4, entity.getProductId());
                statement.b0(5, entity.getPurchaseType());
                statement.b0(6, entity.getPurchaseFrom());
                statement.b0(7, entity.getExpiredDate());
                statement.b0(8, entity.getExpiredDateMs());
                break;
            case 1:
                BookmarkEntity entity2 = (BookmarkEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity2, "entity");
                statement.b0(1, entity2.getId());
                statement.b0(2, entity2.getLan());
                statement.g(3, entity2.isFav());
                statement.b0(4, entity2.getContentType());
                statement.g(5, entity2.getTime());
                String folderId = entity2.getFolderId();
                if (folderId != null) {
                    statement.b0(6, folderId);
                } else {
                    statement.s(6);
                }
                break;
            case 2:
                BookmarkFolderEntity entity3 = (BookmarkFolderEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity3, "entity");
                statement.b0(1, entity3.getId());
                statement.b0(2, entity3.getLan());
                statement.b0(3, entity3.getContentType());
                statement.b0(4, entity3.getName());
                statement.g(5, entity3.getServerId());
                statement.g(6, entity3.isDeleted() ? 1L : 0L);
                statement.g(7, entity3.getTime());
                break;
            case 3:
                ChineseToneLastVisitedEntity entity4 = (ChineseToneLastVisitedEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity4, "entity");
                statement.b0(1, entity4.getId());
                statement.g(2, entity4.getLessonId());
                statement.g(3, entity4.getTime());
                break;
            case 4:
                DailyLearnHistoryEntity entity5 = (DailyLearnHistoryEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity5, "entity");
                statement.b0(1, entity5.getId());
                statement.g(2, entity5.getAmount());
                statement.g(3, entity5.getBaseXP());
                statement.g(4, entity5.getPendingAmount());
                break;
            case 5:
                DailyLearnHistoryEntity entity6 = (DailyLearnHistoryEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity6, "entity");
                statement.b0(1, entity6.getId());
                statement.g(2, entity6.getAmount());
                statement.g(3, entity6.getBaseXP());
                statement.g(4, entity6.getPendingAmount());
                break;
            case 6:
                DailyLearnTimeHistoryEntity entity7 = (DailyLearnTimeHistoryEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity7, "entity");
                statement.b0(1, entity7.getId());
                statement.g(2, entity7.getSeconds());
                statement.g(3, entity7.getBaseTime());
                statement.g(4, entity7.getPendingSeconds());
                break;
            case 7:
                DailyLearnTimeHistoryEntity entity8 = (DailyLearnTimeHistoryEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity8, "entity");
                statement.b0(1, entity8.getId());
                statement.g(2, entity8.getSeconds());
                statement.g(3, entity8.getBaseTime());
                statement.g(4, entity8.getPendingSeconds());
                break;
            case 8:
                DailyStreakHistoryEntity entity9 = (DailyStreakHistoryEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity9, "entity");
                statement.b0(1, entity9.getId());
                statement.b0(2, entity9.getType());
                statement.b0(3, entity9.getPendingType());
                break;
            case 9:
                DauMetricsEntity entity10 = (DauMetricsEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity10, "entity");
                statement.b0(1, entity10.getId());
                statement.g(2, entity10.getFinishLessonType());
                statement.g(3, entity10.getPendingUpdate() ? 1L : 0L);
                statement.g(4, entity10.getPendingUpdateFinishLessonType() ? 1L : 0L);
                break;
            case 10:
                DbFileVersionEntity entity11 = (DbFileVersionEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity11, "entity");
                statement.b0(1, entity11.getFileName());
                statement.g(2, entity11.getLastUpdateTime());
                statement.g(3, entity11.getNeedUpdate() ? 1L : 0L);
                break;
            case 11:
                KnowledgeNoteEntity entity12 = (KnowledgeNoteEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity12, "entity");
                statement.b0(1, entity12.getId());
                statement.b0(2, entity12.getLan());
                statement.b0(3, entity12.getValue());
                statement.g(4, entity12.getElemId());
                statement.b0(5, entity12.getNote());
                statement.g(6, entity12.getUpdatedAt());
                statement.g(7, entity12.isDeleted() ? 1L : 0L);
                statement.g(8, entity12.getPendingUpdate() ? 1L : 0L);
                break;
            case 12:
                LanguageHistoryEntity entity13 = (LanguageHistoryEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity13, "entity");
                statement.b0(1, entity13.getId());
                statement.g(2, entity13.getKeyLanguage());
                statement.g(3, entity13.getLocate());
                statement.b0(4, entity13.getTitle());
                statement.b0(5, entity13.getDescription());
                statement.g(6, entity13.getLastSelectedTime());
                break;
            case 13:
                LanguageTransVersionEntity entity14 = (LanguageTransVersionEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity14, "entity");
                statement.b0(1, entity14.getId());
                statement.g(2, entity14.getCn());
                statement.g(3, entity14.getJp());
                statement.g(4, entity14.getKr());
                statement.g(5, entity14.getEn());
                statement.g(6, entity14.getEs());
                statement.g(7, entity14.getDe());
                statement.g(8, entity14.getFr());
                statement.g(9, entity14.getPt());
                statement.g(10, entity14.getVi());
                statement.g(11, entity14.getRu());
                statement.g(12, entity14.getTch());
                statement.g(13, entity14.getIdn());
                statement.g(14, entity14.getPol());
                statement.g(15, entity14.getIt());
                statement.g(16, entity14.getTur());
                break;
            case 14:
                LastSyncTimeEntity entity15 = (LastSyncTimeEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity15, "entity");
                statement.b0(1, entity15.getId());
                statement.g(2, entity15.getLastSyncTime());
                break;
            case 15:
                LearnProgressEntity entity16 = (LearnProgressEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity16, "entity");
                statement.b0(1, entity16.getLan());
                statement.b0(2, entity16.getMain());
                statement.b0(3, entity16.getMainTT());
                statement.b0(4, entity16.getLessonExam());
                statement.b0(5, entity16.getLessonStars());
                statement.b0(6, entity16.getAudioLesson());
                statement.g(7, entity16.getPronun());
                statement.g(8, entity16.getCurrentEnteredUnitId());
                statement.g(9, entity16.getFlashCardPracticeCount());
                statement.g(10, entity16.getFlashCardDisplayIn());
                statement.b0(11, entity16.getFlashCardFocusUnit());
                statement.g(12, entity16.getFlashCardIsLearnChar() ? 1L : 0L);
                statement.g(13, entity16.getFlashCardIsLearnWord() ? 1L : 0L);
                statement.g(14, entity16.getFlashCardIsLearnSent() ? 1L : 0L);
                statement.g(15, entity16.getFlashCardFocusNew() ? 1L : 0L);
                statement.g(16, entity16.getFlashCardFocusWeak() ? 1L : 0L);
                statement.g(17, entity16.getFlashCardFocusGood() ? 1L : 0L);
                statement.g(18, entity16.getFlashCardFocusPerfect() ? 1L : 0L);
                statement.g(19, entity16.getReviewFilterMethodChar());
                statement.g(20, entity16.getReviewFilterMethodWord());
                statement.g(21, entity16.getReviewFilterMethodSent());
                statement.g(22, entity16.getReviewPracticeModelChar());
                statement.g(23, entity16.getReviewPracticeModelWord());
                statement.g(24, entity16.getReviewPracticeModelSent());
                statement.b0(25, entity16.getReviewSelectRecordChar());
                statement.b0(26, entity16.getReviewSelectRecordWord());
                statement.b0(27, entity16.getReviewSelectRecordSent());
                statement.g(28, entity16.getAckEnterPos());
                statement.g(29, entity16.getAckUnitId());
                statement.g(30, entity16.getRestartTimestamp());
                statement.g(31, entity16.getPendingUpdate() ? 1L : 0L);
                break;
            case 16:
                LessonFinishStatusEntity entity17 = (LessonFinishStatusEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity17, "entity");
                statement.b0(1, entity17.getId());
                statement.b0(2, entity17.getLan());
                statement.g(3, entity17.getPracticeListening() ? 1L : 0L);
                statement.g(4, entity17.getPracticeSpeaking() ? 1L : 0L);
                statement.g(5, entity17.getPracticeSpelling() ? 1L : 0L);
                statement.g(6, entity17.getPracticeComprehensive() ? 1L : 0L);
                statement.g(7, entity17.getTime());
                statement.g(8, entity17.getPendingUpdate() ? 1L : 0L);
                break;
            case 17:
                LessonTestProgressEntity entity18 = (LessonTestProgressEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity18, "entity");
                statement.b0(1, entity18.getId());
                statement.b0(2, entity18.getLearnProgress());
                statement.b0(3, entity18.getRedoProgress());
                statement.b0(4, entity18.getPracticeListeningProgress());
                statement.b0(5, entity18.getPracticeSpeakingProgress());
                statement.b0(6, entity18.getPracticeSpellingProgress());
                statement.b0(7, entity18.getPracticeComprehensiveProgress());
                break;
            case 18:
                LoginHistoryEntity entity19 = (LoginHistoryEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity19, "entity");
                statement.b0(1, entity19.getUid());
                statement.b0(2, entity19.getNickName());
                statement.b0(3, entity19.getEmail());
                statement.b0(4, entity19.getAccountType());
                statement.g(5, entity19.isMember() ? 1L : 0L);
                statement.g(6, entity19.getLearningLan());
                statement.g(7, entity19.getUiLan());
                statement.g(8, entity19.getLastLogOutTime());
                break;
            case 19:
                ReviewStatusEntity entity20 = (ReviewStatusEntity) obj;
                kotlin.jvm.internal.m.f(statement, MzwEyWCkjXL.ikocTSC);
                kotlin.jvm.internal.m.f(entity20, "entity");
                statement.b0(1, entity20.getId());
                statement.g(2, entity20.getUnitId());
                statement.g(3, entity20.getElemId());
                statement.g(4, entity20.getElemType());
                statement.g(5, entity20.getLastStudyTime());
                statement.b0(6, entity20.getStatus());
                break;
            case 20:
                SRSStatusEntity entity21 = (SRSStatusEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity21, "entity");
                statement.b0(1, entity21.getId());
                statement.g(2, entity21.getUnitId());
                statement.g(3, entity21.getElemId());
                statement.g(4, entity21.getElemType());
                statement.b0(5, entity21.getLan());
                statement.b0(6, entity21.getType());
                statement.g(7, entity21.getLastStudyTime());
                statement.g(8, entity21.getLastStudyStatus());
                statement.g(9, entity21.isReviewed());
                statement.g(10, entity21.getStatus());
                statement.g(11, entity21.getLastReviewTime());
                statement.g(12, entity21.getNextReviewTime());
                statement.g(13, entity21.getInterval());
                statement.e0(entity21.getEaseFactor());
                statement.g(15, entity21.getLearningStep());
                statement.g(16, entity21.getLapses());
                statement.g(17, entity21.getSoEasyCount());
                statement.g(18, entity21.getLastHighSoEasyCount());
                statement.g(19, entity21.getLastModifierTime());
                statement.g(20, entity21.getPendingUpdate() ? 1L : 0L);
                statement.g(21, entity21.getReviewVisibilityMode());
                break;
            case 21:
                SubLearnProgressEntity entity22 = (SubLearnProgressEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity22, "entity");
                statement.b0(1, entity22.getId());
                statement.b0(2, entity22.getProgress());
                statement.g(3, entity22.getTime());
                break;
            default:
                UnitFinishStatusEntity entity23 = (UnitFinishStatusEntity) obj;
                kotlin.jvm.internal.m.f(statement, "statement");
                kotlin.jvm.internal.m.f(entity23, "entity");
                statement.b0(1, entity23.getId());
                statement.b0(2, entity23.getLan());
                statement.g(3, entity23.getCurEnterLessonIndex());
                statement.g(4, entity23.getStoryReading() ? 1L : 0L);
                statement.g(5, entity23.getStorySpeaking() ? 1L : 0L);
                statement.g(6, entity23.getTipsReading() ? 1L : 0L);
                statement.g(7, entity23.getDialogWarmUp() ? 1L : 0L);
                statement.g(8, entity23.getDialogPractice() ? 1L : 0L);
                statement.g(9, entity23.getDialogSpeaking() ? 1L : 0L);
                statement.g(10, entity23.getTime());
                statement.g(11, entity23.getPendingUpdate() ? 1L : 0L);
                break;
        }
    }
}
