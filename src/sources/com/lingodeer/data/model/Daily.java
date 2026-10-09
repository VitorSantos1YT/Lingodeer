package com.lingodeer.data.model;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import defpackage.e;
import ep.a;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.f;
import sz.xej.iFLeRCXvYCGdPW;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Daily {
    private final int dayOfWeek;
    private final int daySecondFlashcard;
    private final int daySecondLearned;
    private final int daySecondLessonQuiz;
    private final int daySecondReviewQuiz;
    private final int daySecondReviewed;
    private final int daySecondStory;
    private final int daySecondTips;
    private final int dayStarEarned;
    private final int dayXPFlashcard;
    private final int dayXPLearned;
    private final int dayXPLessonQuiz;
    private final int dayXPReviewQuiz;
    private final int dayXPReviewed;
    private final int dayXPStory;
    private final int time;

    public Daily() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65535, null);
    }

    public final int component1() {
        return this.time;
    }

    public final int component10() {
        return this.daySecondTips;
    }

    public final int component11() {
        return this.daySecondLessonQuiz;
    }

    public final int component12() {
        return this.dayXPLessonQuiz;
    }

    public final int component13() {
        return this.daySecondReviewQuiz;
    }

    public final int component14() {
        return this.dayXPReviewQuiz;
    }

    public final int component15() {
        return this.dayStarEarned;
    }

    public final int component16() {
        return this.dayOfWeek;
    }

    public final int component2() {
        return this.daySecondLearned;
    }

    public final int component3() {
        return this.dayXPLearned;
    }

    public final int component4() {
        return this.daySecondReviewed;
    }

    public final int component5() {
        return this.dayXPReviewed;
    }

    public final int component6() {
        return this.daySecondFlashcard;
    }

    public final int component7() {
        return this.dayXPFlashcard;
    }

    public final int component8() {
        return this.daySecondStory;
    }

    public final int component9() {
        return this.dayXPStory;
    }

    public final Daily copy(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
        return new Daily(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22, i23, i24, i25, i26, i27);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Daily)) {
            return false;
        }
        Daily daily = (Daily) obj;
        return this.time == daily.time && this.daySecondLearned == daily.daySecondLearned && this.dayXPLearned == daily.dayXPLearned && this.daySecondReviewed == daily.daySecondReviewed && this.dayXPReviewed == daily.dayXPReviewed && this.daySecondFlashcard == daily.daySecondFlashcard && this.dayXPFlashcard == daily.dayXPFlashcard && this.daySecondStory == daily.daySecondStory && this.dayXPStory == daily.dayXPStory && this.daySecondTips == daily.daySecondTips && this.daySecondLessonQuiz == daily.daySecondLessonQuiz && this.dayXPLessonQuiz == daily.dayXPLessonQuiz && this.daySecondReviewQuiz == daily.daySecondReviewQuiz && this.dayXPReviewQuiz == daily.dayXPReviewQuiz && this.dayStarEarned == daily.dayStarEarned && this.dayOfWeek == daily.dayOfWeek;
    }

    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final int getDaySecondFlashcard() {
        return this.daySecondFlashcard;
    }

    public final int getDaySecondLearned() {
        return this.daySecondLearned;
    }

    public final int getDaySecondLessonQuiz() {
        return this.daySecondLessonQuiz;
    }

    public final int getDaySecondReviewQuiz() {
        return this.daySecondReviewQuiz;
    }

    public final int getDaySecondReviewed() {
        return this.daySecondReviewed;
    }

    public final int getDaySecondStory() {
        return this.daySecondStory;
    }

    public final int getDaySecondTips() {
        return this.daySecondTips;
    }

    public final int getDayStarEarned() {
        return this.dayStarEarned;
    }

    public final int getDayXPFlashcard() {
        return this.dayXPFlashcard;
    }

    public final int getDayXPLearned() {
        return this.dayXPLearned;
    }

    public final int getDayXPLessonQuiz() {
        return this.dayXPLessonQuiz;
    }

    public final int getDayXPReviewQuiz() {
        return this.dayXPReviewQuiz;
    }

    public final int getDayXPReviewed() {
        return this.dayXPReviewed;
    }

    public final int getDayXPStory() {
        return this.dayXPStory;
    }

    public final int getLearnSecond() {
        return this.daySecondLearned + this.daySecondReviewed + this.daySecondFlashcard + this.daySecondStory + this.daySecondTips + this.daySecondLessonQuiz + this.daySecondReviewQuiz;
    }

    public final int getLearnXp() {
        return this.dayXPLearned + this.dayXPReviewed + this.dayXPFlashcard + this.dayXPStory + this.dayXPLessonQuiz + this.dayXPReviewQuiz;
    }

    public final int getTime() {
        return this.time;
    }

    public int hashCode() {
        return Integer.hashCode(this.dayOfWeek) + e.b(this.dayStarEarned, e.b(this.dayXPReviewQuiz, e.b(this.daySecondReviewQuiz, e.b(this.dayXPLessonQuiz, e.b(this.daySecondLessonQuiz, e.b(this.daySecondTips, e.b(this.dayXPStory, e.b(this.daySecondStory, e.b(this.dayXPFlashcard, e.b(this.daySecondFlashcard, e.b(this.dayXPReviewed, e.b(this.daySecondReviewed, e.b(this.dayXPLearned, e.b(this.daySecondLearned, Integer.hashCode(this.time) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        int i11 = this.time;
        int i12 = this.daySecondLearned;
        int i13 = this.dayXPLearned;
        int i14 = this.daySecondReviewed;
        int i15 = this.dayXPReviewed;
        int i16 = this.daySecondFlashcard;
        int i17 = this.dayXPFlashcard;
        int i18 = this.daySecondStory;
        int i19 = this.dayXPStory;
        int i21 = this.daySecondTips;
        int i22 = this.daySecondLessonQuiz;
        int i23 = this.dayXPLessonQuiz;
        int i24 = this.daySecondReviewQuiz;
        int i25 = this.dayXPReviewQuiz;
        int i26 = this.dayStarEarned;
        int i27 = this.dayOfWeek;
        StringBuilder sbK = c.k("Daily(time=", i11, ", daySecondLearned=", i12, ", dayXPLearned=");
        a.v(i13, i14, ", daySecondReviewed=", ", dayXPReviewed=", sbK);
        a.v(i15, i16, ", daySecondFlashcard=", ", dayXPFlashcard=", sbK);
        a.v(i17, i18, ", daySecondStory=", ", dayXPStory=", sbK);
        a.v(i19, i21, ", daySecondTips=", ", daySecondLessonQuiz=", sbK);
        a.v(i22, i23, ", dayXPLessonQuiz=", ", daySecondReviewQuiz=", sbK);
        a.v(i24, i25, ", dayXPReviewQuiz=", ", dayStarEarned=", sbK);
        sbK.append(i26);
        sbK.append(", dayOfWeek=");
        sbK.append(i27);
        sbK.append(")");
        return sbK.toString();
    }

    public Daily(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27) {
        this.time = i11;
        this.daySecondLearned = i12;
        this.dayXPLearned = i13;
        this.daySecondReviewed = i14;
        this.dayXPReviewed = i15;
        this.daySecondFlashcard = i16;
        this.dayXPFlashcard = i17;
        this.daySecondStory = i18;
        this.dayXPStory = i19;
        this.daySecondTips = i21;
        this.daySecondLessonQuiz = i22;
        this.dayXPLessonQuiz = i23;
        this.daySecondReviewQuiz = i24;
        this.dayXPReviewQuiz = i25;
        this.dayStarEarned = i26;
        this.dayOfWeek = i27;
    }

    public final Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("day_second_learned", Integer.valueOf(this.daySecondLearned));
        map.put("day_xp_earned", Integer.valueOf(this.dayXPLearned));
        map.put(iFLeRCXvYCGdPW.TtyKpr, Integer.valueOf(this.daySecondReviewed));
        map.put("day_xp_reviewed", Integer.valueOf(this.dayXPReviewed));
        map.put("day_second_flashcard", Integer.valueOf(this.daySecondFlashcard));
        map.put("day_xp_flashcard", Integer.valueOf(this.dayXPFlashcard));
        map.put("day_second_story", Integer.valueOf(this.daySecondStory));
        map.put("day_xp_story", Integer.valueOf(this.dayXPStory));
        map.put("day_second_tips", Integer.valueOf(this.daySecondTips));
        map.put("day_second_lessonquiz", Integer.valueOf(this.daySecondLessonQuiz));
        map.put("day_xp_lessonquiz", Integer.valueOf(this.dayXPLessonQuiz));
        map.put("day_second_reviewquiz", Integer.valueOf(this.daySecondReviewQuiz));
        map.put("day_xp_reviewquiz", Integer.valueOf(this.dayXPReviewQuiz));
        return map;
    }

    public /* synthetic */ Daily(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, f fVar) {
        this((i28 & 1) != 0 ? 0 : i11, (i28 & 2) != 0 ? 0 : i12, (i28 & 4) != 0 ? 0 : i13, (i28 & 8) != 0 ? 0 : i14, (i28 & 16) != 0 ? 0 : i15, (i28 & 32) != 0 ? 0 : i16, (i28 & 64) != 0 ? 0 : i17, (i28 & 128) != 0 ? 0 : i18, (i28 & 256) != 0 ? 0 : i19, (i28 & 512) != 0 ? 0 : i21, (i28 & 1024) != 0 ? 0 : i22, (i28 & 2048) != 0 ? 0 : i23, (i28 & 4096) != 0 ? 0 : i24, (i28 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? 0 : i25, (i28 & 16384) != 0 ? 0 : i26, (i28 & 32768) != 0 ? 0 : i27);
    }
}
