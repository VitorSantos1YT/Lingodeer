package com.lingodeer.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Main {
    private int alphatable_f;
    private int alphatable_m;

    @SerializedName("ext-f")
    private int ext_f;

    @SerializedName("ext-m")
    private int ext_m;
    private int lesson_f;
    private int lesson_m;
    private int lesson_png;
    private int story_f;
    private int story_m;
    private int story_png;
    private int travel_f;
    private int travel_m;

    public Main() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null);
    }

    public final int getAlphatable_f() {
        return this.alphatable_f;
    }

    public final int getAlphatable_m() {
        return this.alphatable_m;
    }

    public final int getExt_f() {
        return this.ext_f;
    }

    public final int getExt_m() {
        return this.ext_m;
    }

    public final int getLesson_f() {
        return this.lesson_f;
    }

    public final int getLesson_m() {
        return this.lesson_m;
    }

    public final int getLesson_png() {
        return this.lesson_png;
    }

    public final int getStory_f() {
        return this.story_f;
    }

    public final int getStory_m() {
        return this.story_m;
    }

    public final int getStory_png() {
        return this.story_png;
    }

    public final int getTravel_f() {
        return this.travel_f;
    }

    public final int getTravel_m() {
        return this.travel_m;
    }

    public final void setAlphatable_f(int i11) {
        this.alphatable_f = i11;
    }

    public final void setAlphatable_m(int i11) {
        this.alphatable_m = i11;
    }

    public final void setExt_f(int i11) {
        this.ext_f = i11;
    }

    public final void setExt_m(int i11) {
        this.ext_m = i11;
    }

    public final void setLesson_f(int i11) {
        this.lesson_f = i11;
    }

    public final void setLesson_m(int i11) {
        this.lesson_m = i11;
    }

    public final void setLesson_png(int i11) {
        this.lesson_png = i11;
    }

    public final void setStory_f(int i11) {
        this.story_f = i11;
    }

    public final void setStory_m(int i11) {
        this.story_m = i11;
    }

    public final void setStory_png(int i11) {
        this.story_png = i11;
    }

    public final void setTravel_f(int i11) {
        this.travel_f = i11;
    }

    public final void setTravel_m(int i11) {
        this.travel_m = i11;
    }

    public Main(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23) {
        this.alphatable_m = i11;
        this.alphatable_f = i12;
        this.lesson_f = i13;
        this.lesson_m = i14;
        this.lesson_png = i15;
        this.story_f = i16;
        this.story_m = i17;
        this.travel_f = i18;
        this.travel_m = i19;
        this.story_png = i21;
        this.ext_f = i22;
        this.ext_m = i23;
    }

    public /* synthetic */ Main(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, int i24, f fVar) {
        this((i24 & 1) != 0 ? 0 : i11, (i24 & 2) != 0 ? 0 : i12, (i24 & 4) != 0 ? 0 : i13, (i24 & 8) != 0 ? 0 : i14, (i24 & 16) != 0 ? 0 : i15, (i24 & 32) != 0 ? 0 : i16, (i24 & 64) != 0 ? 0 : i17, (i24 & 128) != 0 ? 0 : i18, (i24 & 256) != 0 ? 0 : i19, (i24 & 512) != 0 ? 0 : i21, (i24 & 1024) != 0 ? 0 : i22, (i24 & 2048) != 0 ? 0 : i23);
    }
}
