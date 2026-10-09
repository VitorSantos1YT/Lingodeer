package com.google.firebase.sessions.settings;

import androidx.datastore.core.CorruptionException;
import h00.b;
import h00.c;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.jvm.internal.m;
import m00.h;
import md.a;
import n5.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionConfigsSerializer implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SessionConfigsSerializer f21090a = new SessionConfigsSerializer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SessionConfigs f21091b = new SessionConfigs(null, null, null, null, null);

    private SessionConfigsSerializer() {
    }

    @Override // n5.s0
    public final Object a() {
        return f21091b;
    }

    @Override // n5.s0
    public final Object b(FileInputStream fileInputStream) throws CorruptionException {
        try {
            b bVar = c.f29915d;
            String str = new String(a.t(fileInputStream), oz.a.f46133a);
            bVar.getClass();
            return (SessionConfigs) bVar.b(SessionConfigs.Companion.serializer(), str);
        } catch (Exception e8) {
            throw new CorruptionException("Cannot parse session configs", e8);
        }
    }

    @Override // n5.s0
    public final void c(Object obj, h hVar) throws IOException {
        byte[] bytes = c.f29915d.c(SessionConfigs.Companion.serializer(), (SessionConfigs) obj).getBytes(oz.a.f46133a);
        m.e(bytes, "getBytes(...)");
        hVar.write(bytes);
    }
}
