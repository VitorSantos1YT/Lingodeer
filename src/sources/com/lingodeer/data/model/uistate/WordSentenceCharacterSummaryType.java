package com.lingodeer.data.model.uistate;

import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface WordSentenceCharacterSummaryType {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isSkipped(WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType) {
            return WordSentenceCharacterSummaryType.super.isSkipped();
        }

        @Deprecated
        public static boolean isWrong(WordSentenceCharacterSummaryType wordSentenceCharacterSummaryType) {
            return WordSentenceCharacterSummaryType.super.isWrong();
        }
    }

    CourseTestSummaryItemStatus getStatus();

    default boolean isSkipped() {
        return getStatus() == CourseTestSummaryItemStatus.SKIPPED;
    }

    default boolean isWrong() {
        return getStatus() == CourseTestSummaryItemStatus.WRONG;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CharacterType implements WordSentenceCharacterSummaryType {
        private final CourseCharacter character;
        private final CourseTestSummaryItemStatus status;

        public CharacterType(CourseCharacter character, CourseTestSummaryItemStatus status) {
            m.f(character, "character");
            m.f(status, "status");
            this.character = character;
            this.status = status;
        }

        public static /* synthetic */ CharacterType copy$default(CharacterType characterType, CourseCharacter courseCharacter, CourseTestSummaryItemStatus courseTestSummaryItemStatus, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                courseCharacter = characterType.character;
            }
            if ((i11 & 2) != 0) {
                courseTestSummaryItemStatus = characterType.status;
            }
            return characterType.copy(courseCharacter, courseTestSummaryItemStatus);
        }

        public final CourseCharacter component1() {
            return this.character;
        }

        public final CourseTestSummaryItemStatus component2() {
            return this.status;
        }

        public final CharacterType copy(CourseCharacter character, CourseTestSummaryItemStatus status) {
            m.f(character, "character");
            m.f(status, "status");
            return new CharacterType(character, status);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CharacterType)) {
                return false;
            }
            CharacterType characterType = (CharacterType) obj;
            return m.a(this.character, characterType.character) && this.status == characterType.status;
        }

        public final CourseCharacter getCharacter() {
            return this.character;
        }

        @Override // com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType
        public CourseTestSummaryItemStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode() + (this.character.hashCode() * 31);
        }

        @Override // com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType
        public boolean isSkipped() {
            return super.isSkipped();
        }

        @Override // com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType
        public boolean isWrong() {
            return super.isWrong();
        }

        public String toString() {
            return "CharacterType(character=" + this.character + ", status=" + this.status + ")";
        }

        public /* synthetic */ CharacterType(CourseCharacter courseCharacter, CourseTestSummaryItemStatus courseTestSummaryItemStatus, int i11, f fVar) {
            this(courseCharacter, (i11 & 2) != 0 ? CourseTestSummaryItemStatus.CORRECT : courseTestSummaryItemStatus);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SentenceType implements WordSentenceCharacterSummaryType {
        private final CourseSentence sentence;
        private final CourseTestSummaryItemStatus status;

        public SentenceType(CourseSentence sentence, CourseTestSummaryItemStatus status) {
            m.f(sentence, "sentence");
            m.f(status, "status");
            this.sentence = sentence;
            this.status = status;
        }

        public static /* synthetic */ SentenceType copy$default(SentenceType sentenceType, CourseSentence courseSentence, CourseTestSummaryItemStatus courseTestSummaryItemStatus, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                courseSentence = sentenceType.sentence;
            }
            if ((i11 & 2) != 0) {
                courseTestSummaryItemStatus = sentenceType.status;
            }
            return sentenceType.copy(courseSentence, courseTestSummaryItemStatus);
        }

        public final CourseSentence component1() {
            return this.sentence;
        }

        public final CourseTestSummaryItemStatus component2() {
            return this.status;
        }

        public final SentenceType copy(CourseSentence sentence, CourseTestSummaryItemStatus status) {
            m.f(sentence, "sentence");
            m.f(status, "status");
            return new SentenceType(sentence, status);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SentenceType)) {
                return false;
            }
            SentenceType sentenceType = (SentenceType) obj;
            return m.a(this.sentence, sentenceType.sentence) && this.status == sentenceType.status;
        }

        public final CourseSentence getSentence() {
            return this.sentence;
        }

        @Override // com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType
        public CourseTestSummaryItemStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode() + (this.sentence.hashCode() * 31);
        }

        @Override // com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType
        public boolean isSkipped() {
            return super.isSkipped();
        }

        @Override // com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType
        public boolean isWrong() {
            return super.isWrong();
        }

        public String toString() {
            return "SentenceType(sentence=" + this.sentence + ", status=" + this.status + ")";
        }

        public /* synthetic */ SentenceType(CourseSentence courseSentence, CourseTestSummaryItemStatus courseTestSummaryItemStatus, int i11, f fVar) {
            this(courseSentence, (i11 & 2) != 0 ? CourseTestSummaryItemStatus.CORRECT : courseTestSummaryItemStatus);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WordType implements WordSentenceCharacterSummaryType {
        private final CourseTestSummaryItemStatus status;
        private final CourseWord word;

        public WordType(CourseWord word, CourseTestSummaryItemStatus status) {
            m.f(word, "word");
            m.f(status, "status");
            this.word = word;
            this.status = status;
        }

        public static /* synthetic */ WordType copy$default(WordType wordType, CourseWord courseWord, CourseTestSummaryItemStatus courseTestSummaryItemStatus, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                courseWord = wordType.word;
            }
            if ((i11 & 2) != 0) {
                courseTestSummaryItemStatus = wordType.status;
            }
            return wordType.copy(courseWord, courseTestSummaryItemStatus);
        }

        public final CourseWord component1() {
            return this.word;
        }

        public final CourseTestSummaryItemStatus component2() {
            return this.status;
        }

        public final WordType copy(CourseWord word, CourseTestSummaryItemStatus status) {
            m.f(word, "word");
            m.f(status, "status");
            return new WordType(word, status);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WordType)) {
                return false;
            }
            WordType wordType = (WordType) obj;
            return m.a(this.word, wordType.word) && this.status == wordType.status;
        }

        @Override // com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType
        public CourseTestSummaryItemStatus getStatus() {
            return this.status;
        }

        public final CourseWord getWord() {
            return this.word;
        }

        public int hashCode() {
            return this.status.hashCode() + (this.word.hashCode() * 31);
        }

        @Override // com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType
        public boolean isSkipped() {
            return super.isSkipped();
        }

        @Override // com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType
        public boolean isWrong() {
            return super.isWrong();
        }

        public String toString() {
            return "WordType(word=" + this.word + ", status=" + this.status + ")";
        }

        public /* synthetic */ WordType(CourseWord courseWord, CourseTestSummaryItemStatus courseTestSummaryItemStatus, int i11, f fVar) {
            this(courseWord, (i11 & 2) != 0 ? CourseTestSummaryItemStatus.CORRECT : courseTestSummaryItemStatus);
        }
    }
}
