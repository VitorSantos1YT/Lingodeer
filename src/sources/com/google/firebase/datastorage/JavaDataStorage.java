package com.google.firebase.datastorage;

import android.content.Context;
import br.b;
import com.bumptech.glide.g;
import fz.c;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.z;
import mz.j;
import n5.f;
import n9.q;
import r5.d;
import rz.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class JavaDataStorage {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j[] f19599d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f19601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f19602c;

    static {
        s sVar = new s(JavaDataStorage.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        z.f38362a.getClass();
        f19599d = new j[]{sVar};
    }

    public JavaDataStorage(Context context, String name) {
        m.f(context, "context");
        m.f(name, "name");
        this.f19600a = name;
        this.f19601b = new ThreadLocal();
        this.f19602c = (f) g.t(name, new q(new b(this), 3), new a(this, 0), 8).a(context, f19599d[0]);
    }

    public final void a(c cVar) {
    }

    public final Map b() {
        return (Map) e0.F(vy.j.f54321a, new JavaDataStorage$getAllSync$1(this, null));
    }

    public final Object c(d key) {
        m.f(key, "key");
        return e0.F(vy.j.f54321a, new JavaDataStorage$getSync$1(this, key, null));
    }

    public final void d(d key, Long l9) {
        m.f(key, "key");
    }
}
