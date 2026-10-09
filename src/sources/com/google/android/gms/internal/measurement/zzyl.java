package com.google.android.gms.internal.measurement;

import com.google.android.material.datepicker.d;
import ep.a;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class zzyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f12180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12183e;

    public zzyl(String str, Class cls, boolean z11, boolean z12) {
        char cCharAt = str.charAt(0);
        if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')) {
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        for (int i11 = 1; i11 < str.length(); i11++) {
            char cCharAt2 = str.charAt(i11);
            if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
                throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
            }
        }
        this.f12179a = str;
        this.f12180b = cls;
        this.f12181c = z11;
        this.f12182d = z12;
        int iIdentityHashCode = System.identityHashCode(this);
        long j11 = 0;
        for (int i12 = 0; i12 < 5; i12++) {
            j11 |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.f12183e = j11;
    }

    public void a(Iterator it, zzzc zzzcVar) {
        while (it.hasNext()) {
            b(it.next(), zzzcVar);
        }
    }

    public void b(Object obj, zzzc zzzcVar) {
        zzzcVar.a(obj, this.f12179a);
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.f12180b.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.f12179a;
        StringBuilder sb2 = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        d.w(sb2, name, "/", str, "[");
        return a.k(sb2, name2, "]");
    }
}
