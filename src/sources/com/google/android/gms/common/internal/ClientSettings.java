package com.google.android.gms.common.internal;

import android.accounts.Account;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import y.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ClientSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f8898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f8899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f8900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f8901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f8903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SignInOptions f8904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f8905h;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Account f8906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f8907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f8908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f8909d;
    }

    public ClientSettings(Account account, Set set, Map map, String str, String str2, SignInOptions signInOptions) {
        this.f8898a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f8899b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f8901d = map;
        this.f8902e = str;
        this.f8903f = str2;
        this.f8904g = signInOptions == null ? SignInOptions.f13694a : signInOptions;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((zae) it.next()).getClass();
            hashSet.addAll(null);
        }
        this.f8900c = Collections.unmodifiableSet(hashSet);
    }
}
