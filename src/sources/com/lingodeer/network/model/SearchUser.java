package com.lingodeer.network.model;

import defpackage.e;
import ep.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SearchUser {
    private String Image;
    private String NickName;
    private String UID;

    public SearchUser(String UID, String Image, String NickName) {
        m.f(UID, "UID");
        m.f(Image, "Image");
        m.f(NickName, "NickName");
        this.UID = UID;
        this.Image = Image;
        this.NickName = NickName;
    }

    public static /* synthetic */ SearchUser copy$default(SearchUser searchUser, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchUser.UID;
        }
        if ((i11 & 2) != 0) {
            str2 = searchUser.Image;
        }
        if ((i11 & 4) != 0) {
            str3 = searchUser.NickName;
        }
        return searchUser.copy(str, str2, str3);
    }

    public final String component1() {
        return this.UID;
    }

    public final String component2() {
        return this.Image;
    }

    public final String component3() {
        return this.NickName;
    }

    public final SearchUser copy(String UID, String Image, String NickName) {
        m.f(UID, "UID");
        m.f(Image, "Image");
        m.f(NickName, "NickName");
        return new SearchUser(UID, Image, NickName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchUser)) {
            return false;
        }
        SearchUser searchUser = (SearchUser) obj;
        return m.a(this.UID, searchUser.UID) && m.a(this.Image, searchUser.Image) && m.a(this.NickName, searchUser.NickName);
    }

    public final String getImage() {
        return this.Image;
    }

    public final String getNickName() {
        return this.NickName;
    }

    public final String getUID() {
        return this.UID;
    }

    public int hashCode() {
        return this.NickName.hashCode() + e.d(this.UID.hashCode() * 31, 31, this.Image);
    }

    public final void setImage(String str) {
        m.f(str, "<set-?>");
        this.Image = str;
    }

    public final void setNickName(String str) {
        m.f(str, "<set-?>");
        this.NickName = str;
    }

    public final void setUID(String str) {
        m.f(str, "<set-?>");
        this.UID = str;
    }

    public String toString() {
        String str = this.UID;
        String str2 = this.Image;
        return a.k(e.s("SearchUser(UID=", str, ", Image=", str2, ", NickName="), this.NickName, ")");
    }
}
