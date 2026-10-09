package com.lingodeer.network.model;

import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SearchedUser {
    private final String Image;
    private final boolean IsFriend;
    private final String NickName;
    private final String UID;

    public SearchedUser(String UID, String Image, String NickName, boolean z11) {
        m.f(UID, "UID");
        m.f(Image, "Image");
        m.f(NickName, "NickName");
        this.UID = UID;
        this.Image = Image;
        this.NickName = NickName;
        this.IsFriend = z11;
    }

    public static /* synthetic */ SearchedUser copy$default(SearchedUser searchedUser, String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchedUser.UID;
        }
        if ((i11 & 2) != 0) {
            str2 = searchedUser.Image;
        }
        if ((i11 & 4) != 0) {
            str3 = searchedUser.NickName;
        }
        if ((i11 & 8) != 0) {
            z11 = searchedUser.IsFriend;
        }
        return searchedUser.copy(str, str2, str3, z11);
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

    public final boolean component4() {
        return this.IsFriend;
    }

    public final SearchedUser copy(String UID, String Image, String NickName, boolean z11) {
        m.f(UID, "UID");
        m.f(Image, "Image");
        m.f(NickName, "NickName");
        return new SearchedUser(UID, Image, NickName, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchedUser)) {
            return false;
        }
        SearchedUser searchedUser = (SearchedUser) obj;
        return m.a(this.UID, searchedUser.UID) && m.a(this.Image, searchedUser.Image) && m.a(this.NickName, searchedUser.NickName) && this.IsFriend == searchedUser.IsFriend;
    }

    public final String getImage() {
        return this.Image;
    }

    public final boolean getIsFriend() {
        return this.IsFriend;
    }

    public final String getNickName() {
        return this.NickName;
    }

    public final String getUID() {
        return this.UID;
    }

    public int hashCode() {
        return Boolean.hashCode(this.IsFriend) + e.d(e.d(this.UID.hashCode() * 31, 31, this.Image), 31, this.NickName);
    }

    public String toString() {
        String str = this.UID;
        String str2 = this.Image;
        String str3 = this.NickName;
        boolean z11 = this.IsFriend;
        StringBuilder sbS = e.s("SearchedUser(UID=", str, ", Image=", str2, ", NickName=");
        sbS.append(str3);
        sbS.append(", IsFriend=");
        sbS.append(z11);
        sbS.append(")");
        return sbS.toString();
    }
}
