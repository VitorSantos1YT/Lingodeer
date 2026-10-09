package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzzc implements zzyk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f12208c = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f12209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12210b = false;

    public zzzc(StringBuilder sb2) {
        this.f12209a = sb2;
    }

    public static int b(int i11, String str) {
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < ' ' || cCharAt == '\"' || cCharAt == '\\') {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzyk
    public final void a(Object obj, String str) {
        boolean z11 = this.f12210b;
        StringBuilder sb2 = this.f12209a;
        if (z11) {
            sb2.append(' ');
        } else {
            if (sb2.length() > 0) {
                sb2.append((sb2.length() > 1000 || sb2.indexOf("\n") != -1) ? '\n' : ' ');
            }
            sb2.append("[CONTEXT ");
            this.f12210b = true;
        }
        sb2.append(str);
        sb2.append('=');
        if (obj == null) {
            sb2.append(true);
            return;
        }
        if (f12208c.contains(obj.getClass())) {
            sb2.append(obj);
            return;
        }
        sb2.append('\"');
        String string = obj.toString();
        int i11 = 0;
        while (true) {
            int iB = b(i11, string);
            if (iB == -1) {
                sb2.append((CharSequence) string, i11, string.length());
                sb2.append('\"');
                return;
            }
            sb2.append((CharSequence) string, i11, iB);
            i11 = iB + 1;
            char cCharAt = string.charAt(iB);
            if (cCharAt == '\t') {
                cCharAt = 't';
            } else if (cCharAt == '\n') {
                cCharAt = 'n';
            } else if (cCharAt == '\r') {
                cCharAt = 'r';
            } else if (cCharAt != '\"' && cCharAt != '\\') {
                sb2.append((char) 65533);
            }
            sb2.append("\\");
            sb2.append(cCharAt);
        }
    }
}
