package com.lingo.lingoskill.object;

import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import hh.p0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class LocateLanguageItem {
    public static final int $stable = 8;
    private int drawable;
    private String locate;
    private String title;

    public LocateLanguageItem() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ LocateLanguageItem copy$default(LocateLanguageItem locateLanguageItem, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = locateLanguageItem.locate;
        }
        if ((i12 & 2) != 0) {
            str2 = locateLanguageItem.title;
        }
        if ((i12 & 4) != 0) {
            i11 = locateLanguageItem.drawable;
        }
        return locateLanguageItem.copy(str, str2, i11);
    }

    public final String component1() {
        return this.locate;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.drawable;
    }

    public final LocateLanguageItem copy(String locate, String title, int i11) {
        m.f(locate, "locate");
        m.f(title, "title");
        return new LocateLanguageItem(locate, title, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocateLanguageItem)) {
            return false;
        }
        LocateLanguageItem locateLanguageItem = (LocateLanguageItem) obj;
        return m.a(this.locate, locateLanguageItem.locate) && m.a(this.title, locateLanguageItem.title) && this.drawable == locateLanguageItem.drawable;
    }

    public final int getDrawable() {
        return this.drawable;
    }

    public final String getLocate() {
        return this.locate;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Integer.hashCode(this.drawable) + e.d(this.locate.hashCode() * 31, 31, this.title);
    }

    public final void setDrawable(int i11) {
        this.drawable = i11;
    }

    public final void setLocate(String str) {
        m.f(str, "<set-?>");
        this.locate = str;
    }

    public final void setTitle(String str) {
        m.f(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        return p0.i(this.drawable, ")", e.s("LocateLanguageItem(locate=", this.locate, ", title=", this.title, ", drawable="));
    }

    public LocateLanguageItem(String locate, String title, int i11) {
        m.f(locate, "locate");
        m.f(title, "title");
        this.locate = locate;
        this.title = title;
        this.drawable = i11;
    }

    public /* synthetic */ LocateLanguageItem(String str, String str2, int i11, int i12, f fVar) {
        this((i12 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i12 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i12 & 4) != 0 ? 0 : i11);
    }
}
