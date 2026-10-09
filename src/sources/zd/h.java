package zd;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements td.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f59161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f59162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f59163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f59164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public URL f59165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile byte[] f59166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f59167h;

    public h(URL url) {
        l lVar = i.f59168a;
        pe.f.c(url, "Argument must not be null");
        this.f59162c = url;
        this.f59163d = null;
        pe.f.c(lVar, "Argument must not be null");
        this.f59161b = lVar;
    }

    @Override // td.g
    public final void a(MessageDigest messageDigest) {
        if (this.f59166g == null) {
            this.f59166g = c().getBytes(td.g.f52121a);
        }
        messageDigest.update(this.f59166g);
    }

    public final String c() {
        String str = this.f59163d;
        if (str != null) {
            return str;
        }
        URL url = this.f59162c;
        pe.f.c(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f59165f == null) {
            if (TextUtils.isEmpty(this.f59164e)) {
                String string = this.f59163d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f59162c;
                    pe.f.c(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f59164e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.f59165f = new URL(this.f59164e);
        }
        return this.f59165f;
    }

    @Override // td.g
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c().equals(hVar.c()) && this.f59161b.equals(hVar.f59161b)) {
                return true;
            }
        }
        return false;
    }

    @Override // td.g
    public final int hashCode() {
        if (this.f59167h == 0) {
            int iHashCode = c().hashCode();
            this.f59167h = iHashCode;
            this.f59167h = this.f59161b.hashCode() + (iHashCode * 31);
        }
        return this.f59167h;
    }

    public final String toString() {
        return c();
    }

    public h(String str, i iVar) {
        this.f59162c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f59163d = str;
            pe.f.c(iVar, "Argument must not be null");
            this.f59161b = iVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
