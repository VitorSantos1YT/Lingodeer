package com.lingodeer.data.model;

import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import com.tbruyelle.rxpermissions3.BuildConfig;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class WordSentenceSourceKt {
    private static final CourseWord spaceCourseWord = new CourseWord(-1, IMCc.LPTGHNkWoTBRSEy, " ", " ", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, 1, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -256, 63, null);

    public static final CourseWord getSpaceCourseWord() {
        return spaceCourseWord;
    }

    public static final boolean isPronunciation(CourseWord courseWord) {
        m.f(courseWord, "<this>");
        return m.a(courseWord.getFeatured(), "SPECIFIC");
    }

    public static final CourseWord toWordItem(CourseCharacter courseCharacter) {
        m.f(courseCharacter, "<this>");
        return CourseWord.copy$default(new CourseWord(courseCharacter.getCharacterId(), courseCharacter.getCharacter(), 3, BuildConfig.VERSION_NAME), 0L, null, courseCharacter.getZhuYin(), courseCharacter.getZhuYin(), null, null, 0, 0, null, null, null, null, null, null, null, courseCharacter.getAudioUri(), null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -32781, 63, null);
    }
}
