package n4;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f43200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f43201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f43203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f43205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PendingIntent f43206g;

    public j(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatB = IconCompat.b(2131231286);
        Bundle bundle = new Bundle();
        this.f43203d = true;
        this.f43201b = iconCompatB;
        if (iconCompatB.d() == 2) {
            this.f43204e = iconCompatB.c();
        }
        this.f43205f = p.b(str);
        this.f43206g = pendingIntent;
        this.f43200a = bundle;
        this.f43202c = true;
        this.f43203d = true;
    }
}
