package com.lingodeer.data.model.uistate;

import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public interface WordSentenceCharacterType {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CharacterType implements WordSentenceCharacterType {
        private final CourseCharacter character;

        public CharacterType(CourseCharacter character) {
            m.f(character, "character");
            this.character = character;
        }

        public static /* synthetic */ CharacterType copy$default(CharacterType characterType, CourseCharacter courseCharacter, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                courseCharacter = characterType.character;
            }
            return characterType.copy(courseCharacter);
        }

        public final CourseCharacter component1() {
            return this.character;
        }

        public final CharacterType copy(CourseCharacter character) {
            m.f(character, "character");
            return new CharacterType(character);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CharacterType) && m.a(this.character, ((CharacterType) obj).character);
        }

        public final CourseCharacter getCharacter() {
            return this.character;
        }

        public int hashCode() {
            return this.character.hashCode();
        }

        public String toString() {
            return "CharacterType(character=" + this.character + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SentenceType implements WordSentenceCharacterType {
        private final CourseSentence sentence;

        public SentenceType(CourseSentence sentence) {
            m.f(sentence, "sentence");
            this.sentence = sentence;
        }

        public static /* synthetic */ SentenceType copy$default(SentenceType sentenceType, CourseSentence courseSentence, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                courseSentence = sentenceType.sentence;
            }
            return sentenceType.copy(courseSentence);
        }

        public final CourseSentence component1() {
            return this.sentence;
        }

        public final SentenceType copy(CourseSentence sentence) {
            m.f(sentence, "sentence");
            return new SentenceType(sentence);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SentenceType) && m.a(this.sentence, ((SentenceType) obj).sentence);
        }

        public final CourseSentence getSentence() {
            return this.sentence;
        }

        public int hashCode() {
            return this.sentence.hashCode();
        }

        public String toString() {
            return "SentenceType(sentence=" + this.sentence + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class WordType implements WordSentenceCharacterType {
        private final CourseWord word;

        public WordType(CourseWord word) {
            m.f(word, "word");
            this.word = word;
        }

        public static /* synthetic */ WordType copy$default(WordType wordType, CourseWord courseWord, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                courseWord = wordType.word;
            }
            return wordType.copy(courseWord);
        }

        public final CourseWord component1() {
            return this.word;
        }

        public final WordType copy(CourseWord word) {
            m.f(word, "word");
            return new WordType(word);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WordType) && m.a(this.word, ((WordType) obj).word);
        }

        public final CourseWord getWord() {
            return this.word;
        }

        public int hashCode() {
            return this.word.hashCode();
        }

        public String toString() {
            return "WordType(word=" + this.word + ")";
        }
    }
}
