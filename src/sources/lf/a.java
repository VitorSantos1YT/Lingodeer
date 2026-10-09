package lf;

import android.content.Intent;
import fr.p3;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p3 f39957d = new p3(18);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static a f39958e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f39960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f39961c;

    public a(int i11) {
        UUID uuidRandomUUID = UUID.randomUUID();
        kotlin.jvm.internal.m.e(uuidRandomUUID, "randomUUID()");
        this.f39959a = i11;
        this.f39960b = uuidRandomUUID;
    }

    public final UUID a() {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            return this.f39960b;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    public final int b() {
        if (qf.a.b(this)) {
            return 0;
        }
        try {
            return this.f39959a;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return 0;
        }
    }

    public final void c() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            f39957d.y(this);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
