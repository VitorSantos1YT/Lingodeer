package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DefaultUserAgentPublisher implements UserAgentPublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GlobalLibraryVersionRegistrar f20637b;

    public DefaultUserAgentPublisher(Set set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.f20636a = c(set);
        this.f20637b = globalLibraryVersionRegistrar;
    }

    public static Component b() {
        Component.Builder builderB = Component.b(UserAgentPublisher.class);
        builderB.a(new Dependency(2, 0, LibraryVersion.class));
        builderB.f18096f = new a();
        return builderB.b();
    }

    public static String c(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            LibraryVersion libraryVersion = (LibraryVersion) it.next();
            sb2.append(libraryVersion.a());
            sb2.append('/');
            sb2.append(libraryVersion.b());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        String str = this.f20636a;
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = this.f20637b;
        synchronized (globalLibraryVersionRegistrar.f20639a) {
            setUnmodifiableSet = Collections.unmodifiableSet(globalLibraryVersionRegistrar.f20639a);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (globalLibraryVersionRegistrar.f20639a) {
            setUnmodifiableSet2 = Collections.unmodifiableSet(globalLibraryVersionRegistrar.f20639a);
        }
        sb2.append(c(setUnmodifiableSet2));
        return sb2.toString();
    }
}
