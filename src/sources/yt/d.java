package yt;

import am.rVFB.LwKl;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends aa.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f58355c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i11, int i12, int i13) {
        super(i11, i12);
        this.f58355c = i13;
    }

    @Override // aa.a
    public final void a(ka.a database) {
        switch (this.f58355c) {
            case 0:
                m.f(database, "database");
                database.k("ALTER TABLE `learn_progress` ADD COLUMN `flash_card_display_in` INTEGER NOT NULL DEFAULT -1");
                break;
            case 1:
                m.f(database, "database");
                database.k("CREATE TABLE IF NOT EXISTS `sub_learn_progress` (\n    `id` TEXT NOT NULL PRIMARY KEY,\n    `status` TEXT NOT NULL,\n    `time` INTEGER NOT NULL\n)");
                database.k("\n                    CREATE TABLE IF NOT EXISTS `chinese_tone_last_visited` (\n                        `id` TEXT NOT NULL PRIMARY KEY,\n                        `lesson_id` INTEGER NOT NULL,\n                        `time` INTEGER NOT NULL\n                    )\n                ");
                break;
            case 2:
                m.f(database, "database");
                database.k("ALTER TABLE `learn_progress` ADD COLUMN `restart_timestamp` INTEGER NOT NULL DEFAULT 0");
                break;
            case 3:
                m.f(database, "database");
                database.k("\n                    CREATE TABLE IF NOT EXISTS `language_history` (\n                        `id` TEXT NOT NULL PRIMARY KEY,\n                        `keyLanguage` INTEGER NOT NULL,\n                        `locate` INTEGER NOT NULL,\n                        `title` TEXT NOT NULL,\n                        `description` TEXT NOT NULL,\n                        `lastSelectedTime` INTEGER NOT NULL\n                    )\n                    ");
                break;
            case 4:
                m.f(database, "database");
                database.k("\n                    ALTER TABLE `srs_status` ADD COLUMN `is_excluded_from_review` INTEGER NOT NULL DEFAULT 0\n                    ");
                break;
            case 5:
                m.f(database, "database");
                database.k("UPDATE `srs_status`\nSET `is_excluded_from_review` = CASE\n    WHEN `is_excluded_from_review` = 1 AND `elem_type` = 2 THEN 0\n    WHEN `is_excluded_from_review` = 1 THEN 1\n    WHEN `is_excluded_from_review` = 0 AND `elem_type` = 2 THEN 2\n    ELSE 0\nEND");
                break;
            case 6:
                m.f(database, "database");
                database.k("CREATE TABLE IF NOT EXISTS `bookmark_new` (\n    `id` TEXT NOT NULL,\n    `lan` TEXT NOT NULL,\n    `is_fav` INTEGER NOT NULL,\n    `content_type` TEXT NOT NULL,\n    `time` INTEGER NOT NULL,\n    `folder_id` TEXT,\n    PRIMARY KEY(`id`)\n)");
                database.k("INSERT INTO `bookmark_new` (`id`, `lan`, `is_fav`, `content_type`, `time`, `folder_id`)\nSELECT `id`, `lan`, `is_fav`, `value`, `time`, NULL\nFROM `bookmark`");
                database.k("DROP TABLE `bookmark`");
                database.k("ALTER TABLE `bookmark_new` RENAME TO `bookmark`");
                database.k("DROP TABLE IF EXISTS `bookmark_folder`");
                database.k("CREATE TABLE IF NOT EXISTS `bookmark_folder` (\n    `id` TEXT NOT NULL,\n    `lan` TEXT NOT NULL,\n    `content_type` TEXT NOT NULL,\n    `name` TEXT NOT NULL,\n    `server_id` INTEGER NOT NULL,\n    `is_deleted` INTEGER NOT NULL,\n    `time` INTEGER NOT NULL,\n    PRIMARY KEY(`id`)\n)");
                database.k("DROP TABLE IF EXISTS `bookmark_folder_item`");
                database.k("CREATE TABLE IF NOT EXISTS `knowledge_note` (\n    `id` TEXT NOT NULL,\n    `lan` TEXT NOT NULL,\n    `value` TEXT NOT NULL,\n    `elem_id` INTEGER NOT NULL,\n    `note` TEXT NOT NULL,\n    `updated_at` INTEGER NOT NULL,\n    `is_deleted` INTEGER NOT NULL DEFAULT 0,\n    `pending_update` INTEGER NOT NULL DEFAULT 1,\n    PRIMARY KEY(`id`)\n)");
                break;
            case 7:
                m.f(database, "database");
                database.k("\n                    CREATE TABLE IF NOT EXISTS `db_file_version` (\n                        `file_name` TEXT NOT NULL PRIMARY KEY,\n                        `last_update_time` INTEGER NOT NULL\n                    )\n                ");
                break;
            case 8:
                m.f(database, "database");
                database.k("\n                    ALTER TABLE `db_file_version` ADD COLUMN `need_update` INTEGER NOT NULL DEFAULT 1\n                ");
                database.k("\n                    UPDATE `db_file_version` SET `last_update_time` = 0\n                ");
                break;
            case 9:
                m.f(database, "database");
                database.k("\n                    ALTER TABLE `user_info` ADD COLUMN `total_time` INTEGER NOT NULL DEFAULT 0\n                ");
                database.k("\n                    CREATE TABLE IF NOT EXISTS `lesson_test_progress` (\n                        `id` TEXT NOT NULL PRIMARY KEY,\n                        `learn_progress` TEXT NOT NULL,\n                        `redo_progress` TEXT NOT NULL,\n                        `practice_listening_progress` TEXT NOT NULL,\n                        `practice_speaking_progress` TEXT NOT NULL,\n                        `practice_spelling_progress` TEXT NOT NULL,\n                        `practice_comprehensive_progress` TEXT NOT NULL\n                    )\n                ");
                break;
            case 10:
                m.f(database, "database");
                database.k("\n                    CREATE TABLE IF NOT EXISTS `daily_learn_time_history` (\n                        `id` TEXT NOT NULL PRIMARY KEY,\n                        `seconds` INTEGER NOT NULL,\n                        `pending_seconds` INTEGER NOT NULL\n                    )\n                ");
                break;
            case 11:
                m.f(database, "database");
                database.k("\n                    ALTER TABLE `daily_learn_time_history` ADD COLUMN `base_time` INTEGER NOT NULL DEFAULT 0\n                ");
                database.k("\n                    DELETE FROM `daily_learn_time_history`\n                ");
                break;
            case 12:
                m.f(database, "database");
                database.k("\n                    ALTER TABLE `learn_progress` ADD COLUMN `review_practice_model_char` INTEGER NOT NULL DEFAULT 0\n                ");
                database.k("\n                    ALTER TABLE `learn_progress` ADD COLUMN `review_practice_model_word` INTEGER NOT NULL DEFAULT 0\n                ");
                database.k("\n                    ALTER TABLE `learn_progress` ADD COLUMN `review_practice_model_sent` INTEGER NOT NULL DEFAULT 0\n                ");
                database.k("\n                    ALTER TABLE `learn_progress` ADD COLUMN `review_select_record_char` TEXT NOT NULL DEFAULT ''\n                ");
                database.k("\n                    ALTER TABLE `learn_progress` ADD COLUMN `review_select_record_word` TEXT NOT NULL DEFAULT ''\n                ");
                database.k("\n                    ALTER TABLE `learn_progress` ADD COLUMN `review_select_record_sent` TEXT NOT NULL DEFAULT ''\n                ");
                break;
            case 13:
                m.f(database, "database");
                database.k("\n                    ALTER TABLE `learn_progress` ADD COLUMN `flash_card_focus_new` INTEGER NOT NULL DEFAULT 1\n                ");
                database.k("\n                    ALTER TABLE `learn_progress` ADD COLUMN `flash_card_focus_weak` INTEGER NOT NULL DEFAULT 1\n                ");
                database.k("\n                    ALTER TABLE `learn_progress` ADD COLUMN `flash_card_focus_good` INTEGER NOT NULL DEFAULT 1\n                ");
                database.k(LwKl.jSsxq);
                break;
            case 14:
                m.f(database, "database");
                database.k("\n                    CREATE TABLE IF NOT EXISTS `srs_status` (\n                        `id` TEXT NOT NULL PRIMARY KEY,\n                        `unit_id` INTEGER NOT NULL,\n                        `elem_id` INTEGER NOT NULL,\n                        `elem_type` INTEGER NOT NULL,\n                        `lan` TEXT NOT NULL,\n                        `type` TEXT NOT NULL,\n                        `last_study_time` INTEGER NOT NULL,\n                        `last_study_status` INTEGER NOT NULL,\n                        `is_reviewed` INTEGER NOT NULL DEFAULT 0,\n                        `status` INTEGER NOT NULL,\n                        `last_review_time` INTEGER NOT NULL,\n                        `next_review_time` INTEGER NOT NULL,\n                        `interval` INTEGER NOT NULL,\n                        `ease_factor` REAL NOT NULL,\n                        `learning_step` INTEGER NOT NULL,\n                        `lapses` INTEGER NOT NULL,\n                        `so_easy_count` INTEGER NOT NULL,\n                        `last_high_so_easy_count` INTEGER NOT NULL,\n                        `last_modifier_time` INTEGER NOT NULL,\n                        `pending_update` INTEGER NOT NULL DEFAULT 0\n                    )\n                ");
                database.k("\n                    CREATE TABLE IF NOT EXISTS `last_sync_time` (\n                       `id` TEXT NOT NULL PRIMARY KEY,\n                       `last_sync_time` INTEGER NOT NULL\n                    )\n                ");
                break;
            default:
                m.f(database, "database");
                database.k("ALTER TABLE `user_info` ADD COLUMN `animated_emojis` TEXT NOT NULL DEFAULT ''");
                break;
        }
    }
}
