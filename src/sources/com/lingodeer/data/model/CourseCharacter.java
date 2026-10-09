package com.lingodeer.data.model;

import android.net.Uri;
import b7.e0;
import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import hh.p0;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class CourseCharacter {
    private final int animation;
    private final Uri animationUri;
    private final Uri audioUri;
    private final String charPath;
    private final String character;
    private final long characterId;
    private final String drillJson;
    private final List<CourseCharacter> options;
    private final List<String> partStrings;
    private final List<String> polygonStrings;
    private final String tipsAnimation;
    private final String translation;
    private final String zhuYin;

    public CourseCharacter(long j11, String character, String charPath, String zhuYin, int i11, String translation, String tipsAnimation, List<String> partStrings, List<String> polygonStrings, String drillJson, Uri audioUri, Uri animationUri, List<CourseCharacter> options) {
        m.f(character, "character");
        m.f(charPath, "charPath");
        m.f(zhuYin, "zhuYin");
        m.f(translation, "translation");
        m.f(tipsAnimation, "tipsAnimation");
        m.f(partStrings, "partStrings");
        m.f(polygonStrings, "polygonStrings");
        m.f(drillJson, "drillJson");
        m.f(audioUri, "audioUri");
        m.f(animationUri, "animationUri");
        m.f(options, "options");
        this.characterId = j11;
        this.character = character;
        this.charPath = charPath;
        this.zhuYin = zhuYin;
        this.animation = i11;
        this.translation = translation;
        this.tipsAnimation = tipsAnimation;
        this.partStrings = partStrings;
        this.polygonStrings = polygonStrings;
        this.drillJson = drillJson;
        this.audioUri = audioUri;
        this.animationUri = animationUri;
        this.options = options;
    }

    public final long component1() {
        return this.characterId;
    }

    public final String component10() {
        return this.drillJson;
    }

    public final Uri component11() {
        return this.audioUri;
    }

    public final Uri component12() {
        return this.animationUri;
    }

    public final List<CourseCharacter> component13() {
        return this.options;
    }

    public final String component2() {
        return this.character;
    }

    public final String component3() {
        return this.charPath;
    }

    public final String component4() {
        return this.zhuYin;
    }

    public final int component5() {
        return this.animation;
    }

    public final String component6() {
        return this.translation;
    }

    public final String component7() {
        return this.tipsAnimation;
    }

    public final List<String> component8() {
        return this.partStrings;
    }

    public final List<String> component9() {
        return this.polygonStrings;
    }

    public final CourseCharacter copy(long j11, String character, String charPath, String zhuYin, int i11, String translation, String tipsAnimation, List<String> partStrings, List<String> polygonStrings, String drillJson, Uri audioUri, Uri animationUri, List<CourseCharacter> options) {
        m.f(character, "character");
        m.f(charPath, "charPath");
        m.f(zhuYin, "zhuYin");
        m.f(translation, "translation");
        m.f(tipsAnimation, "tipsAnimation");
        m.f(partStrings, "partStrings");
        m.f(polygonStrings, "polygonStrings");
        m.f(drillJson, "drillJson");
        m.f(audioUri, "audioUri");
        m.f(animationUri, "animationUri");
        m.f(options, "options");
        return new CourseCharacter(j11, character, charPath, zhuYin, i11, translation, tipsAnimation, partStrings, polygonStrings, drillJson, audioUri, animationUri, options);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseCharacter)) {
            return false;
        }
        CourseCharacter courseCharacter = (CourseCharacter) obj;
        return this.characterId == courseCharacter.characterId && m.a(this.character, courseCharacter.character) && m.a(this.charPath, courseCharacter.charPath) && m.a(this.zhuYin, courseCharacter.zhuYin) && this.animation == courseCharacter.animation && m.a(this.translation, courseCharacter.translation) && m.a(this.tipsAnimation, courseCharacter.tipsAnimation) && m.a(this.partStrings, courseCharacter.partStrings) && m.a(this.polygonStrings, courseCharacter.polygonStrings) && m.a(this.drillJson, courseCharacter.drillJson) && m.a(this.audioUri, courseCharacter.audioUri) && m.a(this.animationUri, courseCharacter.animationUri) && m.a(this.options, courseCharacter.options);
    }

    public final int getAnimation() {
        return this.animation;
    }

    public final Uri getAnimationUri() {
        return this.animationUri;
    }

    public final Uri getAudioUri() {
        return this.audioUri;
    }

    public final String getCharPath() {
        return this.charPath;
    }

    public final String getCharacter() {
        return this.character;
    }

    public final long getCharacterId() {
        return this.characterId;
    }

    public final String getDrillJson() {
        return this.drillJson;
    }

    public final List<CourseCharacter> getOptions() {
        return this.options;
    }

    public final List<String> getPartStrings() {
        return this.partStrings;
    }

    public final List<String> getPolygonStrings() {
        return this.polygonStrings;
    }

    public final String getTipsAnimation() {
        return this.tipsAnimation;
    }

    public final String getTranslation() {
        return this.translation;
    }

    public final String getZhuYin() {
        return this.zhuYin;
    }

    public int hashCode() {
        return this.options.hashCode() + ((this.animationUri.hashCode() + ((this.audioUri.hashCode() + e.d(p0.b(p0.b(e.d(e.d(e.b(this.animation, e.d(e.d(e.d(Long.hashCode(this.characterId) * 31, 31, this.character), 31, this.charPath), 31, this.zhuYin), 31), 31, this.translation), 31, this.tipsAnimation), 31, this.partStrings), 31, this.polygonStrings), 31, this.drillJson)) * 31)) * 31);
    }

    public String toString() {
        long j11 = this.characterId;
        String str = this.character;
        String str2 = this.charPath;
        String str3 = this.zhuYin;
        int i11 = this.animation;
        String str4 = this.translation;
        String str5 = this.tipsAnimation;
        List<String> list = this.partStrings;
        List<String> list2 = this.polygonStrings;
        String str6 = this.drillJson;
        Uri uri = this.audioUri;
        Uri uri2 = this.animationUri;
        List<CourseCharacter> list3 = this.options;
        StringBuilder sbP = e0.p(j11, "CourseCharacter(characterId=", ", character=", str);
        d.w(sbP, ", charPath=", str2, ", zhuYin=", str3);
        sbP.append(", animation=");
        sbP.append(i11);
        sbP.append(", translation=");
        sbP.append(str4);
        sbP.append(", tipsAnimation=");
        sbP.append(str5);
        sbP.append(", partStrings=");
        sbP.append(list);
        sbP.append(", polygonStrings=");
        sbP.append(list2);
        sbP.append(", drillJson=");
        sbP.append(str6);
        sbP.append(", audioUri=");
        sbP.append(uri);
        sbP.append(", animationUri=");
        sbP.append(uri2);
        sbP.append(", options=");
        sbP.append(list3);
        sbP.append(")");
        return sbP.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CourseCharacter(long j11, String str, String str2, String str3, int i11, String str4, String str5, List list, List list2, String str6, Uri uri, Uri uri2, List list3, int i12, f fVar) {
        Uri uri3;
        Uri uri4;
        String str7 = (i12 & 512) != 0 ? BuildConfig.VERSION_NAME : str6;
        if ((i12 & 1024) != 0) {
            Uri uri5 = Uri.parse(BuildConfig.VERSION_NAME);
            m.e(uri5, "parse(...)");
            uri3 = uri5;
        } else {
            uri3 = uri;
        }
        if ((i12 & 2048) != 0) {
            Uri uri6 = Uri.parse(BuildConfig.VERSION_NAME);
            m.e(uri6, "parse(...)");
            uri4 = uri6;
        } else {
            uri4 = uri2;
        }
        this(j11, str, str2, str3, i11, str4, str5, list, list2, str7, uri3, uri4, (i12 & 4096) != 0 ? r.f50854a : list3);
    }
}
