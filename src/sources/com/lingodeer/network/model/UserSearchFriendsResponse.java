package com.lingodeer.network.model;

import com.google.android.material.datepicker.d;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class UserSearchFriendsResponse {
    private final List<SearchUser> users;

    public UserSearchFriendsResponse(List<SearchUser> users) {
        m.f(users, "users");
        this.users = users;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserSearchFriendsResponse copy$default(UserSearchFriendsResponse userSearchFriendsResponse, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = userSearchFriendsResponse.users;
        }
        return userSearchFriendsResponse.copy(list);
    }

    public final List<SearchUser> component1() {
        return this.users;
    }

    public final UserSearchFriendsResponse copy(List<SearchUser> users) {
        m.f(users, "users");
        return new UserSearchFriendsResponse(users);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserSearchFriendsResponse) && m.a(this.users, ((UserSearchFriendsResponse) obj).users);
    }

    public final List<SearchUser> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return this.users.hashCode();
    }

    public String toString() {
        return d.l(this.users, "UserSearchFriendsResponse(users=", ")");
    }
}
