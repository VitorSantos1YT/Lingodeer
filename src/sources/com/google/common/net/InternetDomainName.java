package com.google.common.net;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.errorprone.annotations.Immutable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
public final class InternetDomainName {
    static {
        CharMatcher.c(".。．｡");
        Splitter.a('.');
        new Joiner(String.valueOf('.'));
        CharMatcher.g('0', '9').q(CharMatcher.g('a', 'z').q(CharMatcher.g('A', 'Z'))).q(CharMatcher.c("-_"));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InternetDomainName) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return null;
    }
}
