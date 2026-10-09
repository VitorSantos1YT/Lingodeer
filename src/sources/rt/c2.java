package rt;

import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.SRSStatusScheduleKt;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import j$.time.LocalDate;
import j$.time.ZoneId;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c2 {
    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:62:0x0196  */
    public static final boolean a(c1 c1Var, ke keVar, String str, se scheduleFilter) {
        boolean zB;
        boolean zIsNewCard;
        SRSStatus sRSStatus = c1Var.f49553a;
        WordSentenceCharacterType wordSentenceCharacterType = c1Var.f49556d;
        boolean zIsExcludedFromReview = sRSStatus.isExcludedFromReview();
        int i11 = b2.f49477a[keVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (zIsExcludedFromReview || !(wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType)) {
                zIsExcludedFromReview = false;
            } else {
                zIsExcludedFromReview = true;
            }
        } else if (zIsExcludedFromReview || !((wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType) || (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType))) {
            zIsExcludedFromReview = false;
        } else {
            zIsExcludedFromReview = true;
        }
        if (zIsExcludedFromReview) {
            if (oz.q.K0(str)) {
                zB = true;
            } else {
                String string = oz.q.i1(str).toString();
                if (oz.q.K0(string) || oz.q.v0(c1Var.f49554b, string, true)) {
                    zB = true;
                } else if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
                    WordSentenceCharacterType.SentenceType sentenceType = (WordSentenceCharacterType.SentenceType) wordSentenceCharacterType;
                    zB = b(string, sentenceType.getSentence().getSentence(), sentenceType.getSentence().getTranslation(), sentenceType.getSentence().getExplain(), sentenceType.getSentence().getSentenceNotice());
                } else if (wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType) {
                    WordSentenceCharacterType.WordType wordType = (WordSentenceCharacterType.WordType) wordSentenceCharacterType;
                    zB = b(string, wordType.getWord().getWord(), wordType.getWord().getTranslation(), wordType.getWord().getExplain(), wordType.getWord().getZhuYin(), wordType.getWord().getLuoMa(), wordType.getWord().getHepburnLuoMa(), wordType.getWord().getKunreiShikiLuoMa(), wordType.getWord().getOriginalWord(), wordType.getWord().getRealWord(), wordType.getWord().getRealZhuYin(), wordType.getWord().getRealLuoMa());
                } else {
                    if (!(wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    WordSentenceCharacterType.CharacterType characterType = (WordSentenceCharacterType.CharacterType) wordSentenceCharacterType;
                    zB = b(string, characterType.getCharacter().getCharacter(), characterType.getCharacter().getTranslation(), characterType.getCharacter().getZhuYin());
                }
            }
            if (zB) {
                kotlin.jvm.internal.m.f(scheduleFilter, "scheduleFilter");
                SRSStatus status = c1Var.f49553a;
                ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                kotlin.jvm.internal.m.e(zoneIdSystemDefault, "systemDefault(...)");
                LocalDate localDateNow = LocalDate.now(zoneIdSystemDefault);
                kotlin.jvm.internal.m.e(localDateNow, "now(...)");
                kotlin.jvm.internal.m.f(status, "status");
                if (scheduleFilter.equals(pe.f50253a)) {
                    zIsNewCard = true;
                } else if (scheduleFilter.equals(re.f50348a)) {
                    zIsNewCard = SRSStatusScheduleKt.isNewCard(status);
                } else {
                    if (!(scheduleFilter instanceof qe)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    le dateRange = ((qe) scheduleFilter).f50315a;
                    kotlin.jvm.internal.m.f(dateRange, "dateRange");
                    long j11 = dateRange.f50035b;
                    long j12 = dateRange.f50034a;
                    long epochDay = localDateNow.toEpochDay();
                    LocalDate localDateScheduledDate = SRSStatusScheduleKt.scheduledDate(status, zoneIdSystemDefault);
                    Long lValueOf = localDateScheduledDate != null ? Long.valueOf(localDateScheduledDate.toEpochDay()) : null;
                    if (lValueOf != null) {
                        epochDay = Math.max(lValueOf.longValue(), epochDay);
                    } else {
                        if (SRSStatusScheduleKt.isNewCard(status)) {
                        }
                        zIsNewCard = false;
                    }
                    long jMin = Math.min(j12, j11);
                    long jMax = Math.max(j12, j11);
                    if (jMin > epochDay || epochDay > jMax) {
                        zIsNewCard = false;
                    } else {
                        zIsNewCard = true;
                    }
                }
                if (zIsNewCard) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean b(String str, String... strArr) {
        for (String str2 : strArr) {
            if (oz.q.v0(str2, str, true)) {
                return true;
            }
        }
        return false;
    }
}
