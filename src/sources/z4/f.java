package z4;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Locale;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58827a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ClipData f58828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f58829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f58830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f58831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f58832f;

    public /* synthetic */ f() {
    }

    @Override // z4.g
    public ClipData a() {
        return this.f58828b;
    }

    @Override // z4.e
    public void b(Uri uri) {
        this.f58831e = uri;
    }

    @Override // z4.e
    public h build() {
        return new h(new f(this));
    }

    @Override // z4.e
    public void c(int i11) {
        this.f58830d = i11;
    }

    @Override // z4.g
    public int d() {
        return this.f58830d;
    }

    @Override // z4.g
    public ContentInfo e() {
        return null;
    }

    @Override // z4.g
    public int f() {
        return this.f58829c;
    }

    @Override // z4.e
    public void setExtras(Bundle bundle) {
        this.f58832f = bundle;
    }

    public f(f fVar) {
        ClipData clipData = fVar.f58828b;
        clipData.getClass();
        this.f58828b = clipData;
        int i11 = fVar.f58829c;
        if (i11 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i11 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f58829c = i11;
        int i12 = fVar.f58830d;
        if ((i12 & 1) == i12) {
            this.f58830d = i12;
            this.f58831e = fVar.f58831e;
            this.f58832f = fVar.f58832f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i12) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f58827a) {
            case 1:
                Uri uri = this.f58831e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f58828b.getDescription());
                sb2.append(", source=");
                int i11 = this.f58829c;
                if (i11 == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i11 == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i11 == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i11 == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i11 != 4) {
                    strValueOf = i11 != 5 ? String.valueOf(i11) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb2.append(strValueOf);
                sb2.append(", flags=");
                int i12 = this.f58830d;
                sb2.append((i12 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i12));
                String str2 = BuildConfig.VERSION_NAME;
                if (uri == null) {
                    str = BuildConfig.VERSION_NAME;
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + txBUGYhC.WAGtqTMjGTCRd;
                }
                sb2.append(str);
                if (this.f58832f != null) {
                    str2 = ", hasExtras";
                }
                return ep.a.k(sb2, str2, "}");
            default:
                return super.toString();
        }
    }
}
