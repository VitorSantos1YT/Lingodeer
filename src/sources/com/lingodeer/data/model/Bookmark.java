package com.lingodeer.data.model;

import b7.e0;
import defpackage.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Bookmark {
    private final String folderId;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22285id;
    private final int isFav;
    private final String lan;
    private final long time;
    private final String value;

    public Bookmark(String id2, String lan, int i11, String value, long j11, String str) {
        m.f(id2, "id");
        m.f(lan, "lan");
        m.f(value, "value");
        this.f22285id = id2;
        this.lan = lan;
        this.isFav = i11;
        this.value = value;
        this.time = j11;
        this.folderId = str;
    }

    public static /* synthetic */ Bookmark copy$default(Bookmark bookmark, String str, String str2, int i11, String str3, long j11, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = bookmark.f22285id;
        }
        if ((i12 & 2) != 0) {
            str2 = bookmark.lan;
        }
        if ((i12 & 4) != 0) {
            i11 = bookmark.isFav;
        }
        if ((i12 & 8) != 0) {
            str3 = bookmark.value;
        }
        if ((i12 & 16) != 0) {
            j11 = bookmark.time;
        }
        if ((i12 & 32) != 0) {
            str4 = bookmark.folderId;
        }
        String str5 = str4;
        long j12 = j11;
        return bookmark.copy(str, str2, i11, str3, j12, str5);
    }

    public final String component1() {
        return this.f22285id;
    }

    public final String component2() {
        return this.lan;
    }

    public final int component3() {
        return this.isFav;
    }

    public final String component4() {
        return this.value;
    }

    public final long component5() {
        return this.time;
    }

    public final String component6() {
        return this.folderId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bookmark)) {
            return false;
        }
        Bookmark bookmark = (Bookmark) obj;
        return m.a(this.f22285id, bookmark.f22285id) && m.a(this.lan, bookmark.lan) && this.isFav == bookmark.isFav && m.a(this.value, bookmark.value) && this.time == bookmark.time && m.a(this.folderId, bookmark.folderId);
    }

    public final String getFolderId() {
        return this.folderId;
    }

    public final String getId() {
        return this.f22285id;
    }

    public final String getLan() {
        return this.lan;
    }

    public final long getTime() {
        return this.time;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iF = e.f(this.time, e.d(e.b(this.isFav, e.d(this.f22285id.hashCode() * 31, 31, this.lan), 31), 31, this.value), 31);
        String str = this.folderId;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final int isFav() {
        return this.isFav;
    }

    public String toString() {
        String str = this.f22285id;
        String str2 = this.lan;
        int i11 = this.isFav;
        String str3 = this.value;
        long j11 = this.time;
        String str4 = this.folderId;
        StringBuilder sbS = e.s("Bookmark(id=", str, ", lan=", str2, ", isFav=");
        sbS.append(i11);
        sbS.append(", value=");
        sbS.append(str3);
        sbS.append(", time=");
        e0.w(j11, ", folderId=", str4, sbS);
        sbS.append(")");
        return sbS.toString();
    }

    public final Bookmark copy(String str, String lan, int i11, String value, long j11, String str2) {
        m.f(str, tcppUUQxZjFdy.VATWvMc);
        m.f(lan, "lan");
        m.f(value, "value");
        return new Bookmark(str, lan, i11, value, j11, str2);
    }

    public /* synthetic */ Bookmark(String str, String str2, int i11, String str3, long j11, String str4, int i12, f fVar) {
        this(str, str2, i11, str3, j11, (i12 & 32) != 0 ? null : str4);
    }
}
