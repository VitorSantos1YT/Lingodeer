package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import b7.a;
import b7.f0;
import defpackage.e;
import p7.b0;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {
    public final b0 H;
    public final boolean K;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f2122f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f2123t;

    public ExoPlaybackException(int i11, Exception exc, int i12) {
        this(i11, exc, i12, null, -1, null, 4, null, false);
    }

    public final ExoPlaybackException a(b0 b0Var) {
        String message = getMessage();
        String str = f0.f3975a;
        return new ExoPlaybackException(message, getCause(), this.f2112a, this.f2119c, this.f2120d, this.f2121e, this.f2122f, this.f2123t, b0Var, this.f2113b, this.K);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, Throwable th2, int i11, int i12, String str2, int i13, p pVar, int i14, b0 b0Var, long j11, boolean z11) {
        super(str, th2, i11, j11);
        Bundle bundle = Bundle.EMPTY;
        a.d(!z11 || i12 == 1);
        a.d(th2 != null || i12 == 3);
        this.f2119c = i12;
        this.f2120d = str2;
        this.f2121e = i13;
        this.f2122f = pVar;
        this.f2123t = i14;
        this.H = b0Var;
        this.K = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i11, Exception exc, int i12, String str, int i13, p pVar, int i14, b0 b0Var, boolean z11) {
        String str2;
        int i15;
        p pVar2;
        String string;
        String str3;
        if (i11 == 0) {
            str2 = str;
            i15 = i13;
            pVar2 = pVar;
            string = "Source error";
        } else if (i11 != 1) {
            if (i11 != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i15 = i13;
            pVar2 = pVar;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i15 = i13;
            sb2.append(i15);
            sb2.append(", format=");
            pVar2 = pVar;
            sb2.append(pVar2);
            sb2.append(", format_supported=");
            String str4 = f0.f3975a;
            if (i14 == 0) {
                str3 = "NO";
            } else if (i14 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i14 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i14 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i14 == 4) {
                str3 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb2.append(str3);
            string = sb2.toString();
        }
        this(TextUtils.isEmpty(null) ? string : e.m(string, ": null"), exc, i12, i11, str2, i15, pVar2, i14, b0Var, SystemClock.elapsedRealtime(), z11);
    }
}
