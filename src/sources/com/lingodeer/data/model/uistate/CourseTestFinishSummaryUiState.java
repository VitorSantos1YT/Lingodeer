package com.lingodeer.data.model.uistate;

import defpackage.e;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface CourseTestFinishSummaryUiState {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Loading implements CourseTestFinishSummaryUiState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public int hashCode() {
            return -1245162293;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Success implements CourseTestFinishSummaryUiState {
        private final int accuracy;
        private final List<WordSentenceCharacterSummaryType> characterItems;
        private final boolean hasPurchased;
        private final boolean isSpeakingPractice;
        private final List<WordSentenceCharacterSummaryType> sentenceItems;
        private final CourseTestFinishSummaryType type;
        private final List<WordSentenceCharacterSummaryType> wordItems;

        /* JADX INFO: renamed from: xp, reason: collision with root package name */
        private final int f22328xp;

        /* JADX WARN: Multi-variable type inference failed */
        public Success(boolean z11, int i11, int i12, boolean z12, List<? extends WordSentenceCharacterSummaryType> characterItems, List<? extends WordSentenceCharacterSummaryType> wordItems, List<? extends WordSentenceCharacterSummaryType> sentenceItems, CourseTestFinishSummaryType type) {
            m.f(characterItems, "characterItems");
            m.f(wordItems, "wordItems");
            m.f(sentenceItems, "sentenceItems");
            m.f(type, "type");
            this.hasPurchased = z11;
            this.f22328xp = i11;
            this.accuracy = i12;
            this.isSpeakingPractice = z12;
            this.characterItems = characterItems;
            this.wordItems = wordItems;
            this.sentenceItems = sentenceItems;
            this.type = type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, boolean z11, int i11, int i12, boolean z12, List list, List list2, List list3, CourseTestFinishSummaryType courseTestFinishSummaryType, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z11 = success.hasPurchased;
            }
            if ((i13 & 2) != 0) {
                i11 = success.f22328xp;
            }
            if ((i13 & 4) != 0) {
                i12 = success.accuracy;
            }
            if ((i13 & 8) != 0) {
                z12 = success.isSpeakingPractice;
            }
            if ((i13 & 16) != 0) {
                list = success.characterItems;
            }
            if ((i13 & 32) != 0) {
                list2 = success.wordItems;
            }
            if ((i13 & 64) != 0) {
                list3 = success.sentenceItems;
            }
            if ((i13 & 128) != 0) {
                courseTestFinishSummaryType = success.type;
            }
            List list4 = list3;
            CourseTestFinishSummaryType courseTestFinishSummaryType2 = courseTestFinishSummaryType;
            List list5 = list;
            List list6 = list2;
            return success.copy(z11, i11, i12, z12, list5, list6, list4, courseTestFinishSummaryType2);
        }

        public final boolean component1() {
            return this.hasPurchased;
        }

        public final int component2() {
            return this.f22328xp;
        }

        public final int component3() {
            return this.accuracy;
        }

        public final boolean component4() {
            return this.isSpeakingPractice;
        }

        public final List<WordSentenceCharacterSummaryType> component5() {
            return this.characterItems;
        }

        public final List<WordSentenceCharacterSummaryType> component6() {
            return this.wordItems;
        }

        public final List<WordSentenceCharacterSummaryType> component7() {
            return this.sentenceItems;
        }

        public final CourseTestFinishSummaryType component8() {
            return this.type;
        }

        public final Success copy(boolean z11, int i11, int i12, boolean z12, List<? extends WordSentenceCharacterSummaryType> characterItems, List<? extends WordSentenceCharacterSummaryType> wordItems, List<? extends WordSentenceCharacterSummaryType> sentenceItems, CourseTestFinishSummaryType type) {
            m.f(characterItems, "characterItems");
            m.f(wordItems, "wordItems");
            m.f(sentenceItems, "sentenceItems");
            m.f(type, "type");
            return new Success(z11, i11, i12, z12, characterItems, wordItems, sentenceItems, type);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.hasPurchased == success.hasPurchased && this.f22328xp == success.f22328xp && this.accuracy == success.accuracy && this.isSpeakingPractice == success.isSpeakingPractice && m.a(this.characterItems, success.characterItems) && m.a(this.wordItems, success.wordItems) && m.a(this.sentenceItems, success.sentenceItems) && this.type == success.type;
        }

        public final int getAccuracy() {
            return this.accuracy;
        }

        public final List<WordSentenceCharacterSummaryType> getCharacterItems() {
            return this.characterItems;
        }

        public final boolean getHasPurchased() {
            return this.hasPurchased;
        }

        public final List<WordSentenceCharacterSummaryType> getSentenceItems() {
            return this.sentenceItems;
        }

        public final CourseTestFinishSummaryType getType() {
            return this.type;
        }

        public final List<WordSentenceCharacterSummaryType> getWordItems() {
            return this.wordItems;
        }

        public final int getXp() {
            return this.f22328xp;
        }

        public int hashCode() {
            return this.type.hashCode() + p0.b(p0.b(p0.b(e.e(e.b(this.accuracy, e.b(this.f22328xp, Boolean.hashCode(this.hasPurchased) * 31, 31), 31), 31, this.isSpeakingPractice), 31, this.characterItems), 31, this.wordItems), 31, this.sentenceItems);
        }

        public final boolean isSpeakingPractice() {
            return this.isSpeakingPractice;
        }

        public String toString() {
            return "Success(hasPurchased=" + this.hasPurchased + ", xp=" + this.f22328xp + ", accuracy=" + this.accuracy + ", isSpeakingPractice=" + this.isSpeakingPractice + ", characterItems=" + this.characterItems + ", wordItems=" + this.wordItems + ", sentenceItems=" + this.sentenceItems + ", type=" + this.type + ")";
        }

        public /* synthetic */ Success(boolean z11, int i11, int i12, boolean z12, List list, List list2, List list3, CourseTestFinishSummaryType courseTestFinishSummaryType, int i13, f fVar) {
            this(z11, i11, i12, z12, list, list2, list3, (i13 & 128) != 0 ? CourseTestFinishSummaryType.LESSON : courseTestFinishSummaryType);
        }
    }
}
