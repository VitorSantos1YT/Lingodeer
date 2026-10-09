package lf;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f40139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f40140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f40141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f40144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f40145g;

    public z0(UUID uuid, Bitmap bitmap, Uri uri) {
        String strValueOf;
        kotlin.jvm.internal.m.f(uuid, DytezVyM.IlRTePekXGHpg);
        this.f40139a = uuid;
        this.f40140b = bitmap;
        this.f40141c = uri;
        if (uri != null) {
            String scheme = uri.getScheme();
            if ("content".equalsIgnoreCase(scheme)) {
                this.f40144f = true;
                String authority = uri.getAuthority();
                this.f40145g = (authority == null || oz.x.s0(authority, "media", false)) ? false : true;
            } else if ("file".equalsIgnoreCase(uri.getScheme())) {
                this.f40145g = true;
            } else if (!j1.z(uri)) {
                throw new FacebookException(ep.a.e("Unsupported scheme for media Uri : ", scheme));
            }
        } else {
            if (bitmap == null) {
                throw new FacebookException("Cannot share media without a bitmap or Uri set");
            }
            this.f40145g = true;
        }
        String string = !this.f40145g ? null : UUID.randomUUID().toString();
        this.f40143e = string;
        if (this.f40145g) {
            int i11 = re.o.f49192a;
            strValueOf = String.format("%s%s/%s/%s", Arrays.copyOf(new Object[]{"content://com.facebook.app.FacebookContentProvider", re.s.b(), uuid.toString(), string}, 4));
        } else {
            strValueOf = String.valueOf(uri);
        }
        this.f40142d = strValueOf;
    }
}
