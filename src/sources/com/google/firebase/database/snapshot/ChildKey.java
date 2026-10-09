package com.google.firebase.database.snapshot;

import com.google.firebase.database.core.utilities.Utilities;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ChildKey implements Comparable<ChildKey> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ChildKey f19510b = new ChildKey("[MIN_NAME]");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ChildKey f19511c = new ChildKey("[MAX_KEY]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ChildKey f19512d = new ChildKey(".priority");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19513a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class IntegerChildKey extends ChildKey {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19514e;

        public IntegerChildKey(String str, int i11) {
            super(str);
            this.f19514e = i11;
        }

        @Override // com.google.firebase.database.snapshot.ChildKey
        public final int c() {
            return this.f19514e;
        }

        @Override // com.google.firebase.database.snapshot.ChildKey, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(ChildKey childKey) {
            return compareTo(childKey);
        }

        @Override // com.google.firebase.database.snapshot.ChildKey
        public final String toString() {
            return a.k(new StringBuilder("IntegerChildName(\""), this.f19513a, "\")");
        }
    }

    public ChildKey(String str) {
        this.f19513a = str;
    }

    public static ChildKey b(String str) {
        Integer numE = Utilities.e(str);
        if (numE != null) {
            return new IntegerChildKey(str, numE.intValue());
        }
        if (str.equals(".priority")) {
            return f19512d;
        }
        str.contains("/");
        return new ChildKey(str);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChildKey childKey) {
        int i11;
        if (this == childKey) {
            return 0;
        }
        String str = this.f19513a;
        if (!str.equals("[MIN_NAME]")) {
            String str2 = childKey.f19513a;
            if (!str2.equals("[MAX_KEY]")) {
                if (str2.equals("[MIN_NAME]") || str.equals("[MAX_KEY]")) {
                    return 1;
                }
                if (!(this instanceof IntegerChildKey)) {
                    if (childKey instanceof IntegerChildKey) {
                        return 1;
                    }
                    return str.compareTo(str2);
                }
                if (childKey instanceof IntegerChildKey) {
                    int iC = childKey.c();
                    char[] cArr = Utilities.f19432a;
                    int i12 = ((IntegerChildKey) this).f19514e;
                    if (i12 < iC) {
                        i11 = -1;
                    } else {
                        i11 = i12 == iC ? 0 : 1;
                    }
                    if (i11 != 0) {
                        return i11;
                    }
                    int length = str.length();
                    int length2 = str2.length();
                    if (length < length2) {
                        return -1;
                    }
                    return length == length2 ? 0 : 1;
                }
            }
        }
        return -1;
    }

    public int c() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ChildKey)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.f19513a.equals(((ChildKey) obj).f19513a);
    }

    public final int hashCode() {
        return this.f19513a.hashCode();
    }

    public String toString() {
        return a.k(new StringBuilder("ChildKey(\""), this.f19513a, "\")");
    }
}
