package com.lingo.lingoskill.object;

import defpackage.e;
import hh.p0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ReviewListItem {
    public static final int $stable = 0;
    private final int drawableRes;
    private final String title;
    private final int type;

    public ReviewListItem(String title, int i11, int i12) {
        m.f(title, "title");
        this.title = title;
        this.drawableRes = i11;
        this.type = i12;
    }

    public static /* synthetic */ ReviewListItem copy$default(ReviewListItem reviewListItem, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = reviewListItem.title;
        }
        if ((i13 & 2) != 0) {
            i11 = reviewListItem.drawableRes;
        }
        if ((i13 & 4) != 0) {
            i12 = reviewListItem.type;
        }
        return reviewListItem.copy(str, i11, i12);
    }

    public final String component1() {
        return this.title;
    }

    public final int component2() {
        return this.drawableRes;
    }

    public final int component3() {
        return this.type;
    }

    public final ReviewListItem copy(String title, int i11, int i12) {
        m.f(title, "title");
        return new ReviewListItem(title, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewListItem)) {
            return false;
        }
        ReviewListItem reviewListItem = (ReviewListItem) obj;
        return m.a(this.title, reviewListItem.title) && this.drawableRes == reviewListItem.drawableRes && this.type == reviewListItem.type;
    }

    public final int getDrawableRes() {
        return this.drawableRes;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.type) + e.b(this.drawableRes, this.title.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.title;
        return p0.i(this.type, ")", e.q(this.drawableRes, "ReviewListItem(title=", str, ", drawableRes=", ", type="));
    }
}
